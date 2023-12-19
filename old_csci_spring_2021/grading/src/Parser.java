import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A command-line parser for LabGrader classes.
 */
public class Parser {

  /** The LabGrader options specified at the command line. */
  Options opts;

  class Options {
    /** The path of the directory that holds all submissions. */
    String dirpath;
    /** The due date and time of the lab. */
    LocalDateTime due;
    /** The expected filenames in each submission.  */
    List<String> filenames;
    /** 
     * The index of the file to be run (file with main method) if a lab
     * necessitates multi-file submissions. 0 by default.
     */
    int indexOfMain = 0;
    /** The prerequisite class files necessary for grading. */
    List<String> prereqs;
    /** The output filename. */
    String output;
    /** Whether the session should be restored from an output file. */
    boolean restore;

    /**
     * Constructs a new Options object.
     */
    public Options() {
      filenames = new ArrayList<>();
      prereqs = new ArrayList<>();
    } // constructor
  } // Options

  /**
   * Constructs a Parser object.
   *
   * @param args the command-line arguments
   */
  public Parser(String[] args) {
    opts = new Options();
    
    for (int i = 0; i < args.length; i++) {
      String curr = args[i];
      if (curr.equals("-h") || curr.equals("--help")) {
        printUsage(null);
      } else if (curr.equals("-p") || curr.equals("--prereq")) {
        while (i + 1 < args.length && !args[i + 1].startsWith("-")) {
          opts.prereqs.add(args[++i]);
        }
      } else if (curr.equals("-r") || curr.equals("--restore")) {
        opts.restore = true;
      } else if (curr.equals("-o") || curr.equals("--output")) {
        opts.output = args[++i];
      } else {
        if (opts.dirpath == null) {
          opts.dirpath = curr;
          if (opts.dirpath.charAt(opts.dirpath.length() - 1) != '/') {
            opts.dirpath += '/';
          }
        } else if (opts.due == null) {
          try {
            opts.due = LocalDateTime.parse(curr);
          } catch (DateTimeParseException e) {
            printUsage("Invalid format of due date: \"" + curr + "\"\n" +
                       "Use ISO_LOCAL_DATE_TIME format (e.g. \"2011-12-03T10:15:30\")");
          }
        } else {
          opts.filenames.add(curr);
        }
      }
    }

    if (opts.restore) {
      if (opts.dirpath == null) printUsage("Missing dirpath argument. At least the dirpath" +
                                      " argument is required for a restore.");
    } else {
      if (opts.dirpath == null) printUsage("Missing dirpath, due date, and filenames arguments.");
      if (opts.due == null) printUsage("Missing due date and filenames arguments.");
      if (opts.filenames.isEmpty()) printUsage("Missing filenames argument.");
    }
    
    if (opts.output == null) opts.output = "output.txt";

    if (opts.filenames.size() > 1) {
      opts.filenames.sort((s1, s2) -> s1.compareTo(s2));
      System.out.println("\nMulti-file lab detected.");
      System.out.println("Which of the following user-submitted files should be run" +
                         " during grading? Please enter an integer.");
      System.out.println("If no user-submitted files will be run directly, your answer to" +
                         " the above question will have no effect.");
      for (int i = 0; i < opts.filenames.size(); i++) {
        System.out.println("  " + (i + 1) + ". " + opts.filenames.get(i));
      }
      System.out.print("> ");

      Scanner keyboard = new Scanner(System.in);
      while (true) {
        String input = keyboard.next();
        try {
          int index = Integer.valueOf(input);
          if (!(index >= 1 && index <= opts.filenames.size())) {
            throw new IndexOutOfBoundsException();
          }
          opts.indexOfMain = index - 1;
          System.out.println();
          break;
        } catch (Exception e) {
          System.out.println("Please enter an integer in the range 1-" +
                             opts.filenames.size() + ".");
          System.out.print("> ");
        }
      }
    }
  } // constructor

  /**
   * Prints a usage statement.
   * 
   * @param e an optional error description, may be null for no extra info
   */
  public void printUsage(String e) {
    System.out.println("Usage: java LabGrader [directory] [due date] [filenames...] [options]");

    System.out.println("\ndirectory\t\tthe path of the directory in which all submissions are located.");
    System.out.println("due date\t\tthe due date and time of the lab in ISO_LOCAL_DATE_TIME format (e.g. \"2011-12-03T10:15:30\").");
    System.out.println("filenames\t\ta space-separated list of file names which are expected in each submission.");

    System.out.println("\nOptions");
    System.out.println("-o, --output [filename]\tthe name of the file in which to write the grading summary.");
    System.out.println("-r, --restore\t\trestore a preexisting output file, forgo grading (only directory parameter\n\t\t\tis required for restore, use -o to specify output file to restore).");
    System.out.println("-p, --prereq\t\ta space-separated list of the prerequisite class files required for grading\n\t\t\t(e.g. ComputerOpponent.class for Lab 6).");
    System.out.println("-h, --help\t\tdisplay this help message.");

    if (e != null) {
      System.out.println();
      System.out.println(e);
      System.exit(1);
    }

    System.exit(0);
  } // printUsage
} // Parser
