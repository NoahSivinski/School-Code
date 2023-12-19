import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.charset.Charset; 

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * An abstract lab grader.
 */
public abstract class LabGrader {
  /** 
   * Sets debug mode, grader will only grade submission at DEBUG_INDEX in 
   * submissions when debug = true. 
   */
  static final boolean DEBUG = false;
  static final int DEBUG_INDEX = 0;
  
  /** Used for formatting output. */
  static final String DIVIDER = "======================================\n";
  static final String DIVIDER_THIN = "---------------------------------\n";
  
  /** The timeout for running a student submission. */
  static final long CMD_TIMEOUT = 5L;
  /**
   * The delay before inputting a command during exec(). Prevents exec()
   * from inserting a input before it was requested by the java program.
   * 
   * The higher this delay the more likely that the output of exec() is 
   * correct. If exec() is inserting input into the wrong places of the 
   * cmd ouput, try increasing this value.
   * 
   * This delay is in milliseconds, so the more delay, the longer the grader
   * will take to run.
   */
  static final long CMD_INPUT_DELAY = 1L;
  
  /** The path of the directory in which all submissions are located. */
  final String dirpath;
  /** The due date of the lab. */
  final LocalDateTime due;
  /** The names of the expected files in each submission. */
  final List<String> filenames;
  /** The disallowed keywords for this lab. */
  final List<String> disallowedKeywords;
  /** 
   * The index of the file to be run (file with main method) if a lab
   * necessitates multi-file submissions. 0 by default.
   */
  int indexOfMain = 0;
  /** The prerequisite class files necessary for grading. */
  final List<String> prereqs;
  /** The output file. */
  final Path output;
  /** The list of all submissions to grade. */
  final List<Submission> submissions;
  /** The index of the current submission during interactive grading. */
  int currentSubmissionIndex;
  /** A scanner for stdin. */
  final Scanner keyboard;

  /** Whether to stop grading early. */
  AtomicBoolean quitGrading;
  /** Whether grading is finished. */
  AtomicBoolean doneGrading;
  /** 
   * The next command for interactive mode if the quitWatch was left
   * in a blocked state.
   * 
   * @see startInteractive()
   */
  volatile String nextCommand;
  
  /**
   * The output of executing a system command.
   * For use with exec(String). See below.
   */
  class Output {
    /** the exit value of the system command. */
    int exitValue;

    /** The output of the system command (combined output and error streams) */
    List<String> content;

    /**
     * Constructs a new Output object.
     *
     * @param exitValue the exitValue of the command
     * @param content the output of the command
     */
    public Output(int exitValue, List<String> content) {
      this.exitValue = exitValue;
      this.content = content;
    } // constructor
  } // Output

  /**
   * Constructs a new LabGrader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public LabGrader(Parser.Options opts) {
    this.dirpath = opts.dirpath;
    this.due = opts.due;
    this.filenames = opts.filenames;
    this.indexOfMain = opts.indexOfMain;
    this.prereqs = opts.prereqs;

    this.output = Paths.get(opts.output);
    if (!opts.restore) this.output.toFile().delete();

    String[] keywords = {"StringBuilder", "java.util.stream", "java.util.Arrays",
                         "break\\s*;", "continue\\s*;"};
    disallowedKeywords = new ArrayList<>(Arrays.asList(keywords));
    submissions = new ArrayList<>();
    keyboard = new Scanner(System.in);
    quitGrading = new AtomicBoolean(false);
    doneGrading = new AtomicBoolean(false);
    nextCommand = "";
    currentSubmissionIndex = -1;
  } // constructor

  
  /*******************************************
   * public access methods
   *******************************************/
  
    
  /**
   * Grades all submission located in dirpath.
   */
  public void grade() {
    populateSubmissions();
    submissions.sort((s1, s2) -> s1.name.compareTo(s2.name));

    File currDir = new File(dirpath + "current/");
    currDir.mkdir();
    
    prepareMutlipleScannerCheck();
    
    if (!DEBUG) {
      int size = submissions.size();
      System.out.printf("Grading: [%-50s] 0.00%% (0/%d)", "", size);

      Thread quitWatch = new Thread(() -> {
          Scanner kb = new Scanner(System.in);
          while (!doneGrading.get()) {
            String s = kb.next();

            if (doneGrading.get()) {
              nextCommand = s;
            } else if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("stop")) {
              quitGrading.set(true);
              nextCommand = "\0";
              break;
            }
          }
      });
      quitWatch.start();
      
      currentSubmissionIndex = 0;
      while (!quitGrading.get() && currentSubmissionIndex < size) {
        Submission s = submissions.get(currentSubmissionIndex);
        grade(s);

        double percent = ((currentSubmissionIndex + 1.00) / size) * 100;
        int numBars = (int) (percent / 2);
        char[] barsArr = new char[numBars];
        Arrays.fill(barsArr, '=');
        String bars = new String(barsArr);

        System.out.printf("\rGrading: [%-50s] %.2f%% (%d/%d)", bars, percent, currentSubmissionIndex + 1, size);
        currentSubmissionIndex++;
      }
      doneGrading.set(true);
      currentSubmissionIndex = -1;
      
      System.out.println();
    } else {
      currentSubmissionIndex = DEBUG_INDEX;
      grade(submissions.get(currentSubmissionIndex));
    }

    cleanMultipleScannerCheck();
    currDir.delete();

    printWelcome();
    startInteractive();
  } // grade

  /**
   * Runs the compiled submission file. Write to output using write()
   * method. Also responsible for detecting inconsistent IO.
   * 
   * See Lab01Grader.run() for a simple example.
   * See Lab02Grader.run() for a complex example.
   * 
   * @param sub the submission to run
   * @return the total number of points lost from all test cases.
   */
  public abstract int run(Submission sub);
  
  /**
   * Writes the specified bytes to the end of the output file.
   * Creates the file if it does not exist.
   * 
   * @param bytes the bytes to write
   */
  public void write(String s) {
    try {
      Files.write(output, s.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      if (currentSubmissionIndex >= 0) {
        Submission sub = submissions.get(currentSubmissionIndex);
        sub.summary.add(s);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  } // write

  /**
   * Restores a grading session from a preexisting output file. Forgoes
   * grading.
   *
   * To restore from an existing output file use the "-r" flag when
   * running the program.
   */
  public void restore() {
    populateSubmissions();
    submissions.sort((s1, s2) -> s1.name.compareTo(s2.name));

    if (output.toFile().exists()) {
      try {
        List<String> lines = Files.readAllLines(output);

        boolean start = false;
        int subIndex = 0;
        for (int i = 0; i < lines.size(); i++) {
          String line = lines.get(i) + '\n';
          if (line.equals(DIVIDER_THIN)) {
            if (start) {
              start = false;
              submissions.get(subIndex++).summary.add(line);
            } else start = true;
          }
          if (start) submissions.get(subIndex).summary.add(line);
        }
        
      } catch (Exception e) {
        System.out.println("Failed to restore. Fatal error occurred.");
        e.printStackTrace();
        System.exit(1);
      }
    } else {
      System.out.println("Failed to restore. File \"" + output.toString() +
                         "\" does not exist.");
      System.exit(1);
    }

    printWelcome();
    startInteractive();
  } // restore

  /**
   * Executes a system command. For use in compiling and running lab submissions.
   * Executes in the dirpath directory and combines output and error streams.
   * Terminates after CMD_TIMEOUT seconds to prevent infinite loops blocking 
   * execution of the grader. 
   *
   * @param cmd the command to run (e.g. "javac HelloWorld.java")
   * @param more a list of subsequent commands to run if cmd expects further input
   * @return a LabGrader.Output object with the exitValue and output of the command
   */
  public LabGrader.Output exec(String cmd, String... more) {
    try {
      //runs cmd
      Process process = new ProcessBuilder(new String[] {"bash", "-c", cmd})
        .redirectErrorStream(true)
        .directory(new File(dirpath + "current/"))
        .start();

      // used to assemble each line
      StringBuilder sb = new StringBuilder();
      // a list of all lines outputted by cmd and more
      // combined output and error streams
      List<String> output = new ArrayList<>();

      // for managing state between threads
      AtomicBoolean done = new AtomicBoolean(false);
      AtomicBoolean next = new AtomicBoolean(false);
      AtomicInteger exitValue = new AtomicInteger(0);

      // responsible for collecting output (and error) from process
      // when buffer is empty, indicates to main thread that the program
      // is ready for the next command
      Thread outputThread = new Thread(() -> {
          BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
          try {
            while (!done.get()) {
              char c = (char) br.read();
              if (c != (char) -1) {
                if (c == '\n') {
                  output.add(sb.toString());
                  sb.setLength(0);
                } else sb.append(c);
              }
              next.set(!br.ready());
            }
          } catch (Exception e) {}
      });
      outputThread.start();

      // responsible for waiting until the program exits, saving the process exit
      // value, and cleaning up inter-thread state
      // will terminate the process after CMD_TIMEOUT (default: 10 seconds)
      Thread exitThread = new Thread(() -> {
          try {
            boolean exited = process.waitFor(CMD_TIMEOUT, TimeUnit.SECONDS);
            if (exited) exitValue.set(process.exitValue());
            else {
              process.destroy();
              exitValue.set(1);
            }
          } catch (InterruptedException e) {
            e.printStackTrace();
          } finally {
            done.set(true);
          }
      });
      exitThread.start();

      Thread inputThread = new Thread(() -> {
          // sends the optional, additional input to the process
          PrintWriter writer = new PrintWriter(process.getOutputStream(), true);
          int i = 0;
          // will terminate when all input has been sent or process was terminated
          // by timeout
          while (i < more.length && !done.get()) {
            if (next.get()) {
              try {
                Thread.sleep(CMD_INPUT_DELAY);
              } catch (Exception e) {}
              
              if (!next.get()) continue;
              
              next.set(false);
              writer.println(more[i]);
              sb.append(more[i]);
              output.add(sb.toString());
              sb.setLength(0);
              i++;
            }
          }
      });
      inputThread.start();
      
      // waits for threads to terminate before proceeding
      exitThread.join();
      outputThread.join();
      inputThread.join();

      // in case last character outputted by process is not a newline
      // save the current buffer to output
      if (sb.length() > 0) {
        output.add(sb.toString());
        sb.setLength(0);
      }

      return new LabGrader.Output(exitValue.get(), output);
      
    } catch (Exception e) {
      // TODO: handle this exception more gracefully
      System.out.println("Fatal error during exec():");
      e.printStackTrace();
      System.exit(1);
      return null;
    }
  } // exec

  /**
   * Adds the specified keywords to the list of disallowed keywords. 
   * 
   * @param keywords An array of keywords to add to the list of disallowed keywords.
   */
  public void addDisallowedKeywords(String... keywords) {
    for (String keyword : keywords) {
      disallowedKeywords.add(keyword);
    }
  } // addDisallowedKeywords
  
  
  /*******************************************
   * private access methods - interactive
   *******************************************/

  
  /**
   * Prints a welcome message for the interacive part of the grader.
   */
  private void printWelcome() {
    System.out.print('\n' + DIVIDER);
    System.out.println("         Welcome to LabGrader");
    System.out.println(DIVIDER);
    
    printHelp();
    System.out.println();
  } // printWelcome

  /**
   * Prints a help messaeg for the interactive part of the grader.
   */
  private void printHelp() {
    System.out.println("Commands:");
    System.out.println("n, next\t\t\tgo to next submission.");
    System.out.println("p, prev\t\t\tgo to previous submission.");
    System.out.println("g, get [keyword]\tgo to keyword's submission. Keyword may be an index or a student's name.\n");
    
    System.out.println("sum, summary\t\tprint the grader summary of the current submission.");
    System.out.println("src, source\t\tprint the source code of the current submission.");
    System.out.println("r, run\t\t\tcompile and interactively run the current submission.\n");
      
    System.out.println("a, all\t\t\tprint entire grader summary.");
    System.out.println("h, help\t\t\tprint this help information.");
    System.out.println("q, quit\t\t\tquit the program.");
  } // printHelp

  /**
   * Starts the interactive part of the grader. 
   * Waits and interprets user input.
   */
  private void startInteractive() {
    int size = submissions.size();
    
    System.out.print("> ");

    String command;
    if (nextCommand != "\0") {
      while (nextCommand == "") {
        // DO NOTHING
        // Wait for user to enter their first command
      }
      command = nextCommand;
    } else {
      command = keyboard.next().toLowerCase();
    }
    
    while (!command.equals("q") && !command.equals("quit")) {
      switch (command) {
      case "g":
      case "get":
        String keyword = keyboard.next();
        try {
          int index = Integer.valueOf(keyword);
          currentSubmissionIndex = index - 1;
          if (currentSubmissionIndex >= size) {
            currentSubmissionIndex %= size;
          } else if (currentSubmissionIndex < 0) {
            currentSubmissionIndex = size - (-currentSubmissionIndex % size);
          }
        } catch (Exception e) {
          List<Integer> indices = new ArrayList<>();
          List<String> names = new ArrayList<>();
          for (int i = 0; i < size; i++) {
            Submission sub = submissions.get(i);
            if (sub.name.toLowerCase().contains(keyword.toLowerCase())) {
              names.add(sub.name);
              indices.add(i);
            }
          }

          if (names.size() == 1) {
            currentSubmissionIndex = indices.get(0);
          } else if (names.size() > 1) {
            System.out.println("Multiple submissions found matching keyword \"" + keyword + "\":");
            names.forEach((s) -> System.out.println("  " + s));
            System.out.println("Please try refining your keyword.");
            break;
          } else {
            System.out.println("No submissions found matching keyword \"" + keyword + "\".");
            break;
          }
        }
        printSubmissionGraph();
        printSubmissionSummary();
        break;
      case "n":
      case "next":
        currentSubmissionIndex++;
        if (currentSubmissionIndex >= size) {
          currentSubmissionIndex = 0;
        }
        printSubmissionGraph();
        printSubmissionSummary();
        break;
      case "p":
      case "prev":
        currentSubmissionIndex--;
        if (currentSubmissionIndex < 0) {
          currentSubmissionIndex = size - 1;
        }
        printSubmissionGraph();
        printSubmissionSummary();
        break;
      case "sum":
      case "summary":
        if (currentSubmissionIndex < 0) {
          System.out.println("You must first select a submission (e.g. \"next\").");
          break;
        }
        printSubmissionGraph();
        printSubmissionSummary();
        break;
      case "src":
      case "source":
        if (currentSubmissionIndex < 0) {
          System.out.println("You must first select a submission (e.g. \"next\").");
          break;
        }
        printSubmissionSource();
        break;
      case "r":
      case "run":
        if (currentSubmissionIndex < 0) {
          System.out.println("You must first select a submission (e.g. \"next\").");
          break;
        }
        System.out.println("NOTE: After run finishes, you will need to hit the\n" +
                           "enter key to unblock the thread processing System.in.\n");
        runInteractive();
        Submission sub = submissions.get(currentSubmissionIndex);
        System.out.print("Cleaning...\t");
        clean(sub);
        File dir = new File(dirpath + "current/");
        dir.delete();
        System.out.println("done.");
        break;
      case "a":
      case "all":
        printGraderSummary();
        break;
      case "h":
      case "help":
        printHelp();
        break;
      default:
        System.out.println("Unrecognized command.");
        break;
      } // switch
      
      System.out.print("> ");
      command = keyboard.next().toLowerCase();
    } // while
  } // startInteractive

  /**
   * Prints a very basic graphical view of the current submission.
   */
  private void printSubmissionGraph() {
    int size = submissions.size();
    char[] subsArr = new char[size];
    Arrays.fill(subsArr, '#');
    String subs = new String(subsArr);

    System.out.printf("Current submission: " + subs + " (%d/%d)\n", currentSubmissionIndex + 1, size);
    System.out.printf("                    " + "%" + (currentSubmissionIndex + 1) + "s\n", "^");
  } // printSubmissionGraph

  /**
   * Prints the graded summary of the current submission.
   * This is the same as the output of a single student's submission
   * found in the output file.
   */
  private void printSubmissionSummary() {
    Submission sub = submissions.get(currentSubmissionIndex);
    sub.summary.forEach((s) -> System.out.print(s));
  } // printSubmissionSummary

  /**
   * Prints the source code of the current submission.
   */
  private void printSubmissionSource() {
    Submission sub = submissions.get(currentSubmissionIndex);
    int index = 0;
    
    if (sub.files.size() > 1) {
      System.out.println("Which submission file would you like to print? Please enter an integer.");
      for (int i = 0; i < sub.filenames.size(); i++) {
        System.out.println("  " + (i + 1) + ". " + sub.filenames.get(i));
      }
      System.out.print("> ");
      String command;
      while (true) {
        command = keyboard.next();
        try {
          index = Integer.parseInt(command) - 1;
        } catch (Exception e) {
          System.out.println("Please enter an integer.");
          System.out.print("> ");
          continue;
        }
        if (index < 0 || index >= sub.filenames.size()) {
          System.out.println("Please enter an integer in the range 1-" + sub.filenames.size() + ".");
          System.out.print("> ");
          continue;
        }
        break;
      }
    }
    
    try {
      FileInputStream in = new FileInputStream(sub.files.get(index));
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String line;
      int lineNumber = 0;
      while ((line = br.readLine()) != null) {
        System.out.println(++lineNumber + ".\t" + line);
      }
    } catch (Exception e) {
      System.out.println("Printing source of current submission failed.");
    }
  } // printSubmissionSource

  /**
   * Prints the full graded summary of all students. In other words,
   * prints all contents of the output file.
   */
  private void printGraderSummary() {
     try {
       FileInputStream in = new FileInputStream(output.toFile());
       BufferedReader br = new BufferedReader(new InputStreamReader(in));
       String line;
       while ((line = br.readLine()) != null) {
         System.out.println(line);
       }
     } catch (Exception e) {
       System.out.println("Printing grader summary of all submissions failed.");
     }
  } // printGraderSummary

  /**
   * Interactively runs the current submission.
   */
  private void runInteractive() {
    // copy
    System.out.print("Copying...\t");
    Submission sub = submissions.get(currentSubmissionIndex);
    try {
      File dir = new File(dirpath + "current/");
      dir.mkdir();
      
      for (int i = 0; i < sub.files.size(); i++) {
        File file = sub.files.get(i);
        Files.copy(file.toPath(), Paths.get(dirpath + "current/" + sub.filenames.get(i)),
                   StandardCopyOption.REPLACE_EXISTING);
      }

      for (String prereq : prereqs) {
        File file = new File("bin/" + prereq);
        Files.copy(file.toPath(), Paths.get(dirpath + "current/" + prereq),
                   StandardCopyOption.REPLACE_EXISTING);
      }
      
    } catch (IOException e) {
      System.out.println("Error during copying:");
      e.printStackTrace();
      return;
    }
    System.out.println("done.");

    // compile
    System.out.print("Compiling...\t");

    for (String name : sub.filenames) {
      String cmd = "javac " + name;
      LabGrader.Output output = exec(cmd);
      if (output.exitValue != 0) {
        System.out.println("Error during compilation:");
        output.content.forEach((s) -> System.out.println(s));
        return;
      }
    }
    System.out.println("done.");

    // CRITICAL to prevent sole '\n' from being consumed by a nextLine()
    // in the program to be run
    keyboard.nextLine();
    // run
    System.out.println("Running...\n");
    execInteractive("java " + sub.getClassName());
  } // runInteractive

  /**
   * A modification of the LabGrader.exec() method allowing for the
   * user to directly interact with the program started with cmd using
   * the TTY.
   * 
   * Will never timeout. After subprocess completes, a manual enter key
   * must be entered to unblock the inputThread, which is blocked in
   * Scanner.nextLine().
   * 
   * TODO: Fix the aforementioned behavior
   * 
   * @param cmd the command to run
   */
  private void execInteractive(String cmd) {
    try {
      // runs cmd
      Process process = new ProcessBuilder(new String[] {"bash", "-c", cmd})
        .redirectErrorStream(true)
        .directory(new File(dirpath + "current/"))
        .start();

      // for managing state between threads
      AtomicBoolean done = new AtomicBoolean(false);

      // responsible for collecting output (and error) from process
      // when buffer is empty, indicates to main thread that the program
      // is ready for the next command
      Thread outputThread = new Thread(() -> {
          BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
          try {
            while (!done.get()) {
              if (br.ready()) {
                char c = (char) br.read();
                System.out.print(c);
              }
            }
          } catch (IOException e) {}
      });
      outputThread.start();

      // responsible for waiting until the program exits, saving the process exit
      // value, and cleaning up inter-thread state
      Thread exitThread = new Thread(() -> {
          try {
            int exitValue = process.waitFor();
          } catch (InterruptedException e) {
            e.printStackTrace();
          } finally {
            done.set(true);
          }
      });
      exitThread.start();

      // sends System.in to the process
      Thread inputThread = new Thread(() -> {
          PrintWriter writer = new PrintWriter(process.getOutputStream(), true);
          while (!done.get()) {
            String line = keyboard.nextLine();
            writer.println(line);
          }
      });
      inputThread.start();

      // waits for threads to terminate before proceeding
      exitThread.join();
      outputThread.join();
      inputThread.join();
      
    } catch (Exception e) {
      System.out.println("Fatal error while running submission.");
    }
  } // execInteractive


  /*******************************************
   * private access methods - grading
   *******************************************/  

  
  /**
   * Populates submissions with all submission files found in dirpath.
   *
   * @throws IllegalArgumentException if dirpath is not a directory
   */
  private void populateSubmissions() {
    File dir = new File(dirpath);
    if (dir.exists() && dir.isDirectory()) {
      List<File> files = Arrays.asList(dir.listFiles());
      files.sort((f1, f2) -> f1.getName().compareTo(f2.getName()));
      for (int i = 0; i < files.size(); i++) {
        List<File> curr = new ArrayList<>();
        File file = files.get(i);
        curr.add(file);

        String id = file.getName().split(" - ")[0];
        while (i + 1 < files.size() &&
               files.get(i + 1).getName().split(" - ")[0].equals(id)) {
          curr.add(files.get(++i));
        }
        
        try {
          submissions.add(new Submission(curr, indexOfMain));
        } catch (Exception e) {}
      }
    } else {
      throw new IllegalArgumentException("Specified directory path does not exist or is not a directory.");
    }
  } // populateSubmissions

  /**
   * Grades an individual submission.
   * 
   * @param sub the Submission to be graded
   */
  private void grade(Submission sub) {
    write(DIVIDER_THIN);
    write((sub.name + "\n\n"));

    Integer score = 100;
    
    if (!hasCorrectFilenames(sub)) score -= 10;
    if (isLate(sub)) score -= 25;
    if (!hasStatement(sub)) score -= 10;
    if (usesDisallowed(sub)) score -= 100;
    
    if (copy(sub)) {
      if (compile(sub)) {
        try {
          score -= run(sub);
        } catch (Exception e) {
          write("\n\n  Run failed with the following error:\n");
          write("  " + e.toString() + '\n');
          StackTraceElement[] trace = e.getStackTrace();
          for (StackTraceElement el : trace) {
            write("    at " + el.toString() + '\n');
          }
          score = null;
        }
      } else score -= 100;
    } else score = null;

    if (score == null) {
      write(("\nScore: ???/100\n"));
    } else {
      write(("\nScore: " + String.valueOf(score) + "/100\n"));
    }
    write(DIVIDER_THIN);
    clean(sub);
  } // grade

  /**
   * Returns whether the specified submission has the appropriate filenames.
   *
   * @param sub the submission to test
   * @return true if the filenames of the submission are correct; false otherwise
   */
  private boolean hasCorrectFilenames(Submission sub) {
    write("Filenames...\t");

    if (sub.filenames.size() != filenames.size()) {
      write("INCONCLUSIVE\n");
      if (sub.filenames.size() > filenames.size()) {
        write("  Extra files in user submission detected\n");
      } else {
        write("  Missing files in user submission\n");
      }
      write("  Submitted files:\n");
      sub.filenames.forEach((s) -> write("    " + s + '\n'));
      write("  Expected files:\n");
      filenames.forEach((s) -> write("    " + s + '\n'));
      return true;
    }
    
    boolean correctNames = true;
    Map<String, String> map = new HashMap<>();
    for (int i = 0; i < sub.filenames.size(); i++) {
      String name = sub.filenames.get(i);
      if (!name.equals(filenames.get(i))) {
        map.put(filenames.get(i), name);
        correctNames = false;
      }
    }
    
    if (correctNames) write("PASSED\n");
    else {
      write("FAILED (-10)\n");
      map.forEach((k, v) -> {
          write("  Expected: \"" + k + "\"\n");
          write("  Received: \"" + v + "\"\n");
        });
    }
    return correctNames;
  } // hasCorrectFilenames

  /**
   * Returns whether the specified submission is passed the due date.
   * 
   * @param sub the submission to test
   * @return true if sub is late; false otherwise
   */
  private boolean isLate(Submission sub) {
    write("On Time...\t");    
    boolean isLate = sub.date.isAfter(due);
    if (isLate) write("FAILED (-25)\n");
    else write("PASSED\n");
    return isLate;
  } // isLate

  /**
   * Returns whether the specified submission has a Statement of Academic Honesty.
   * 
   * @param sub the submission to test
   * @return true if there is a statement in sub; false otherwise
   */
  private boolean hasStatement(Submission sub) {
    write("Has SAH...\t");
    try {
      Map<String, Boolean> map = new HashMap<>();
      for (int i = 0; i < sub.files.size(); i++) {
        File file = sub.files.get(i);
        FileInputStream in = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] words = new String[] {"academic", "honesty", "plagiarism", "policy",
                                       "georgia","computer", "science", "university",
                                       "code", "prohibited"};
        
        List<String> keywords = new ArrayList<>(Arrays.asList(words));
        String line;
        while ((line = br.readLine()) != null) {
          line = line.trim().toLowerCase();
          if (line.length() > 0) {
            List<String> found = new ArrayList<>();
            for (String w : keywords) {
              if (line.contains(w)) {
                found.add(w);
              }
            }
            keywords.removeAll(found);
          }
        }
        map.put(sub.filenames.get(i), keywords.size() <= 2);
      }

      boolean hasStatement = true;
      for (String k : map.keySet()) {
        if (map.get(k) == false) {
          hasStatement = false;
          break;
        }
      }
      
      if (hasStatement) write("PASSED\n");
      else {
        write("FAILED (-10)\n");
        map.forEach((k, v) -> {
            if (!v) write("  File \"" + k + "\" missing the statement of academic honesty\n");
          });
      }
      return hasStatement;      
    } catch (Exception e) {
      e.printStackTrace();
      write("FAILED (-10)\n");
      return false;
    }
  } // hasStatement
  
  /**
   * Returns whether the specified submission uses any disallowed keywords.
   * 
   * @param sub the submission to test
   * @return true if there is are any disallowed in sub; false otherwise
   */
  private boolean usesDisallowed(Submission sub) {
    write("Disallowed...\t");
    try {
      Map<String, List<String>> map = new HashMap<>();
      Map<String, Boolean> switchMap = new HashMap<>();
      for (int i = 0; i < sub.files.size(); i++) {
        File file = sub.files.get(i);
        FileInputStream in = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        List<String> disallowedLines = new ArrayList<>();
        boolean switchPresent = false;
        
        String line;
        while ((line = br.readLine()) != null) {
          if (line.length() > 0) {
            for (String keyword : disallowedKeywords) {
              if (line.matches(".*" + keyword + ".*")) {
                disallowedLines.add(line);
              }
            }
            if (line.matches(".*switch\\s*\\(.*")) {
              switchPresent = true;
            }
          }
        }
        
        map.put(sub.filenames.get(i), disallowedLines);
        switchMap.put(sub.filenames.get(i), switchPresent);
      }

      boolean usesDisallowed = false;
      for (String k : map.keySet()) {
        if (!map.get(k).isEmpty()) {
          usesDisallowed = true;
          break;
        }
      }

      boolean switchesPresent = false;
      for (String k : switchMap.keySet()) {
        if (switchMap.get(k)) {
          switchesPresent = true;
          break;
        }
      }
      
      if (!usesDisallowed) write("PASSED\n");
      else {
        String deduction = (switchesPresent) ? "???" : "100";
        write("FAILED (-" + deduction + ")\n");
        map.forEach((k, v) -> {
            if (switchMap.get(k)) {
              write("  Switch present in file \"" + k + "\". Confirm all \"break\" uses occur within switch with \"src\" command.\n");
            }
            for (String disallowedLine : v) {
              write("  File \"" + k + "\" uses disallowed keyword in line \"" + disallowedLine.trim() + "\"\n");
            }
          });
      }
      return (usesDisallowed) ? !switchesPresent : false;
    } catch (Exception e) {
      write("FAILED (-100)\n");
      e.printStackTrace();
      return true;
    }
  } // usesDisallowed
  
  /**
   * Copies the specified submission into a file with the proper filename.
   * 
   * @param sub the submission to copy
   * @return true if the copy was successful; false otherwise
   */
  private boolean copy(Submission sub) {
    write("Copying...\t");
    try {
      for (int i = 0; i < sub.files.size(); i++) {
        File file = sub.files.get(i);
      
        Path copy = Paths.get(dirpath + "current/" + sub.filenames.get(i));
        if (copy.toFile().exists()) copy.toFile().delete();
      
        List<String> lines = new ArrayList<>();
	try{
	    lines = Files.readAllLines(file.toPath());
	}
	catch(Exception e){
	    lines = Files.readAllLines(file.toPath(), Charset.forName("Cp437"));
	}

        StringBuilder sb = new StringBuilder();
        for (String s : lines) {
          sb.append(s);
          sb.append('\n');
        }

        String source = sb.toString();
        source = source.replaceAll("new\\s+Scanner\\s*\\(\\s*System\\s*\\.\\s*in\\s*\\)\\s*;",
                                   "new Scanner(System.in); ScannerCount.increment();");
        Files.write(copy, source.getBytes(), StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
      }

      for (String prereq : prereqs) {
        File file = new File("bin/" + prereq);
        Files.copy(file.toPath(), Paths.get(dirpath + "current/" + prereq),
                   StandardCopyOption.REPLACE_EXISTING);
      }
      
      write("PASSED\n");
      return true;
    } catch (Exception e) {
      write("FAILED (-100)\n");
      e.printStackTrace();
      return false;
    }
  } // copy

  /**
   * Compiles the copied submission file.
   * 
   * @param sub the submission to compile
   * @return true if the compilation was successful; false otherwise
   */
  private boolean compile(Submission sub) {
    write("Compiling...\t");

    Map<String, LabGrader.Output> map = new HashMap<>();
    for (String name : sub.filenames) {
	//String cmd = "javac " + name;
      String cmd = "javac -encoding cp437 " + name;
      LabGrader.Output output = exec(cmd);
      map.put(name, output);
    }

    boolean passed = true;
    for (String k : map.keySet()) {
      if (map.get(k).exitValue != 0) {
        passed = false;
        break;
      }
    }

    if (passed) {
      write("PASSED\n");
      return true;
    } else {
      write("FAILED (-100)\n");
      map.forEach((k, v) -> {
          if (v.exitValue != 0) {
            v.content.forEach((s) -> write("  " + s + '\n'));
          }
        });
      return false;
    }
  } // compile
  
  /**
   * Cleans copied and compiled files from the dirpath directory.
   *
   * @param sub the submission whose generated files need to be cleaned
   */
  private void clean(Submission sub) {
    try {
      File dir = new File(dirpath + "current/");
      File[] files = dir.listFiles();
      for (File f : files) {
        if (!f.getName().contains("Scanner")) {
          f.delete();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  } // clean

  /**
   * Copies the files necessary for checking for multiple scanner objects
   * into the dirpath directory.
   */
  private void prepareMutlipleScannerCheck() {
    try {
      Files.copy(Paths.get("bin/ScannerCount.class"),
                 Paths.get(dirpath + "current/ScannerCount.class"),
                 StandardCopyOption.REPLACE_EXISTING);
      Files.copy(Paths.get("bin/MultipleScannerException.class"),
                 Paths.get(dirpath + "current/MultipleScannerException.class"),
                 StandardCopyOption.REPLACE_EXISTING);
    } catch (Exception e) {
      System.out.println("Failed to copy multiple scanner check files.");
      e.printStackTrace();
      System.exit(1);
    }
  } // prepareMutlipleScannerCheck

  /**
   * Cleans the files necessary for checking for multiple scanner objects
   * from the dirpath directory.
   */
  private void cleanMultipleScannerCheck() {
    try {
      File scannerCount = new File(dirpath + "current/ScannerCount.class");
      File scannerException = new File(dirpath + "current/MultipleScannerException.class");

      if (scannerCount.exists()) scannerCount.delete();
      if (scannerException.exists()) scannerException.delete();
    } catch (Exception e) {
      System.out.println("Failed to clean multiple scanner check files.");
      e.printStackTrace();
      System.exit(1);
    }
  } // cleanMultipleScannerCheck
} // LabGrader
