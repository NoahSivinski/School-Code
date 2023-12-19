import java.io.File;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * A student lab submission.
 */
class Submission {
  /** The submission files. */
  List<File> files;

  /** The full name of the student. */
  String name;

  /** The date and time of the submission. */
  LocalDateTime date;

  /** The names of the files submitted by the student. */
  List<String> filenames;
  
  /** 
   * The index of the file to be run (file with main method) if a lab
   * necessitates multi-file submissions. 0 by default.
   */
  int indexOfMain = 0;

  /** The graded summary of this submission. */
  List<String> summary;

  /**
   * Constructs a new Submission object.
   * 
   * @param files the submission files with a name in the following
   * format: "[id] - [student name] - [date] - [file name]" 
   * @throws NullPointerException if files is null
   * @throws IllegalArgumentException if files is empty or name
   * is not in the aforementioned format
   */
  public Submission(List<File> files, int indexOfMain) {
    if (files == null) throw new NullPointerException();
    if (files.isEmpty()) throw new IllegalArgumentException();

    this.files = new ArrayList<>();
    filenames = new ArrayList<>();

    for (File file : files) {
      String[] info = file.getName().split(" - ");
      
      if (info.length != 4) throw new IllegalArgumentException();
    
      this.files.add(file);
      name = info[1].trim();
      filenames.add(info[3].trim());
    
      String sdate = info[2].trim();
      //Use code below for timestamp with no spaces between hmm (hour minute)
      
      DateTimeFormatter formatter = DateTimeFormatter
        .ofPattern("MMM d, yyyy hmm a", Locale.ENGLISH);
      
      
      //Use code below for timestamp with a space between h mm (hour minute)
      //DateTimeFormatter formatter = DateTimeFormatter
      //  .ofPattern("MMM d, yyyy h mm a", Locale.ENGLISH);
      
      date = LocalDateTime.parse(sdate, formatter);
    }

    summary = new ArrayList<>();
    this.indexOfMain = indexOfMain;
  } // constructor

  /**
   * Returns the name of submitted file without a file extension.
   *
   * @return the name of the submitted file without a file extension.
   */
  public String getClassName() {
    String name = filenames.get(indexOfMain);
    int index = name.indexOf('.');
    return (index >= 0) ? name.substring(0, index) : name;
  } // getClassName

  @Override
  public String toString() {
    return "Submission\nname: " + name + "\nfiles: " + files.toString() + "\ndate: " +
      date.toString() + "\nfilenames: " + filenames.toString();
  }
} // Submission
