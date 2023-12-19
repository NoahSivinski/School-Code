import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A grader for lab 03.
 */
public class Lab03Grader extends LabGrader {
  
  /** A map of correct labels and corresponding values. */
  private Map<String, String> valid;

  /** A list of correct labels in the expected order */
  private List<String> validOrdered;
  private int validOrderedIndex;

  /** User-supplied incorrect values and its corresponding label. */
  private Map<String, String> invalid;

  /** A set of descriptive I/O inconsistencies. */
  private Set<String> inconsistentIO;

  /**
   * Constructs a new Lab03Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab03Grader(Parser.Options opts) {
    super(opts);

    if (opts.restore) return;

    write(DIVIDER);
    write("Grading Summary for Lab 03\n");
    write(DIVIDER + '\n');

    valid = new HashMap<>();
    invalid = new HashMap<>();
    inconsistentIO = new HashSet<>();
    validOrdered = new ArrayList<>();
    validOrdered.add("type");
    validOrdered.add("detail");
    validOrdered.add("location");
    validOrdered.add("latitude");
    validOrdered.add("longitude");
    validOrderedIndex = 0;
  } // constructor

  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    int lost = 0;
    write("Running...\n");

    write("  Test 01...\t");
    //lost += runTestCase(sub, "#typ emergency; #det tornado; #loc hwy,6; #lat 42.954000; #lng -125.31;");
    lost += runTestCase(sub, "\"#typ emergency; #det tornado; #loc hwy,6; #lat 42.954000; #lng -125.31;\"");
    write("  Test 02...\t");
    //lost += runTestCase(sub, "#typ ongoing; #det evacuees can return to homes; #loc boulder heights; #lat 40.059; #lng -105.4067;");
    lost += runTestCase(sub, "\"#typ ongoing; #det evacuees can return to homes; #loc boulder heights; #lat 40.059; #lng -105.4067;\"");
    write("  Test 03...\t");
    //lost += runTestCase(sub, "#typ no fire; #det activity; #loc west of the pinewood res dam; #lat 40.367; #lng -105.292;");    
    lost += runTestCase(sub, "\"#typ no fire; #det activity; #loc west of the pinewood res dam; #lat 40.367; #lng -105.292;\"");    
    write("  Test 04...\t");
    //lost += runTestCase(sub, "#typ structure; #det damaged; #loc 224 left fork road (shed) (house okay); #lat 40.029854; #lng -105.391055;");
    lost += runTestCase(sub, "\"#typ structure; #det damaged; #loc 224 left fork road (shed) (house okay); #lat 40.029854; #lng -105.391055;\"");
    write("  Test 05...\t");
    //lost += runTestCase(sub, "#typ photo; #det local wild horse; #loc wild horse; #lat 40.052304; #lng -105.319374;");

    write("Proper I/O...\t");
    if (inconsistentIO.size() > 0) {
      lost += 15;
      write("FAILED (-15)\n");
      inconsistentIO.forEach((s) -> write("  " + s + '\n'));
      inconsistentIO.clear();
    } else {
      write("PASSED\n");
    }

    return lost;
  } // run

  /**
   * A helper method to run an individual test case.
   * 
   * @param sub the submission to be tested
   * @param hours the input to the lab03 (ParseTheTweet) program.
   * @return the number of points deducted
   */
  private int runTestCase(Submission sub, String tweet) {
    // generate a correct values map
    setValid(tweet);

    // start the program
    int lost = 0;
    LabGrader.Output output = exec("java " + sub.getClassName(), tweet);
    
    if (output.exitValue != 0) {
      // on runtime error, deduct full test case point value
      write("FAILED (-20)\n");
      write("    ERROR: program terminated with error code " + output.exitValue + '\n');
      write("    -------------------OUTPUT-------------------\n");
      output.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
      lost += 20;
    } else {
      output.content.forEach((s) -> {
          // ignore lines containing tweet or prompting for the tweet
          if (s.trim().equals("")) return;
          if (s.contains(tweet)) return;
          if (s.matches("\\b(Enter|Input)\\b.*[Tt]weet.*|[Tt]weet:? *")) return;

          String inputToSplit = s.trim();
          if (s.indexOf(":") == -1) {
            inputToSplit = s.replaceAll("\\t+", ":");
            inconsistentIO.add("Missing ':' after category \"" + s.trim().split("\\s+")[0] + "\"");
          }
          String[] map = inputToSplit.split(":");
          if (map.length == 2) {
            // normalize user input line
            String userCategory = map[0].trim().toLowerCase();
            String userValue = map[1].trim();
            String correctValue = valid.get(userCategory);
              
            // if null, label not recognized
            if (correctValue != null) {
              // test user value for accuracy
              if (userValue.equals(correctValue)) {
                valid.remove(userCategory);
              } else {
                invalid.put(userCategory, userValue);
              }                
              // validate order of output
              if (validOrderedIndex >= 0 && validOrderedIndex < validOrdered.size()) {
                if (validOrdered.get(validOrderedIndex).equals(userCategory)) {
                  validOrderedIndex++;
                } else {
                  validOrderedIndex = -1;
                  inconsistentIO.add("Invalid output order");
                }
              }
            } else {
              inconsistentIO.add("Misspelled category: \"" + map[0].trim() + "\"");
              // for unrecognized label, look for a matching value
              // in correct answers
              String category = null;
              for (String key : valid.keySet()) {
                if (valid.get(key).equals(userValue)) {
                  category = key;
                  break;
                }
              }
              // essentially forgives the misspelling, deducts points
              // for inconsistent IO instead of missing a value
              // operates on the assumption that all correct values are
              // unique, for lab03 (PareTheTweet) this is an okay assumption
              if (category != null) {
                valid.remove(category);
                // validate order of output
                if (validOrderedIndex >= 0 && validOrderedIndex < validOrdered.size()) {
                  if (validOrdered.get(validOrderedIndex).equals(category)) {
                    validOrderedIndex++;
                  } else {
                    validOrderedIndex = -1;
                    inconsistentIO.add("Invalid output order");
                  }
                }
              }
              else {
                invalid.put(validOrdered.get(validOrderedIndex++), userValue);
              }
            }
          } else {
            inconsistentIO.add("Extra line in output: \"" + s + "\"");
          }
        });

      // descriptive output of why test case failed
      if (valid.size() > 0) {
        lost += valid.size() * 4;
        write("FAILED (-" + lost + ")\n");
        valid.forEach((k, v) -> {
            String received = invalid.get(k);
            if (received != null) {
              write("    Expected: " + k + ": " + v + '\n');
              write("    Received: " + k + ": " + received + '\n');
              invalid.remove(k);
            } else {
              write("    Expected: " + k + ": " + v + '\n');
              write("    Received: " + "[no match line]\n");
            }
          });
        if (invalid.size() > 0) {
          invalid.forEach((k, v) -> {
              write("    Received: " + k + ": " + v + '\n');
            });
        }
        invalid.clear();
        valid.clear();
      } else {
        write("PASSED\n");
        // a rare case in which extra, unrecognized label + value was given
        // after all user values were correct
        if (invalid.size() > 0) {
          invalid.forEach((k, v) -> {
              inconsistentIO.add("Extra category \"" + k + "\" with value " + v);
            });
        }
        invalid.clear();
      }
    }
    validOrderedIndex = 0;
    return lost;
  } // runTestCase

  /**
   * A helper method to generate the correct output of the lab.
   * 
   * @param hours the input to lab03 (ParseTheTweet)
   */
  private void setValid(String tweet) {
    String type;
    String detail;
    String location;
    String latitude;
    String longitude;

    // Logic
    tweet = tweet.replace(',','-');
		
    // Type
    int start = tweet.indexOf("#typ");
    int finish = tweet.indexOf(";");
    type = tweet.substring(start+5,finish);
    type = type.toUpperCase();
    type = type.trim();
    tweet = tweet.substring(finish+1);
    
    // Detail
    start = tweet.indexOf("#det");
    finish = tweet.indexOf(";");
    detail = tweet.substring(start+5,finish);
    detail = detail.trim();
    tweet = tweet.substring(finish+1);
    
    // Location
    start = tweet.indexOf("#loc");
    finish = tweet.indexOf(";");
    location = tweet.substring(start+5,finish);
    location = location.trim();
    tweet = tweet.substring(finish+1);
    
    // Latitude
    start = tweet.indexOf("#lat");
    finish = tweet.indexOf(";");
    latitude = tweet.substring(start+5,finish);
    latitude = latitude.trim();
    tweet = tweet.substring(finish+1);
    
    // Longitude
    start = tweet.indexOf("#lng");
    finish = tweet.indexOf(";");  
    longitude = tweet.substring(start+5,finish);
    longitude = longitude.trim();

    // Putting correct answers in the map
    valid.clear();
    valid.put("type", type);
    valid.put("detail", detail);
    valid.put("location", location);
    valid.put("latitude", latitude);
    valid.put("longitude", longitude);
  } // setValid

  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab03Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab03Grader
