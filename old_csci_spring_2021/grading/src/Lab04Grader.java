import java.time.LocalDateTime;
 
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 
/**
 * A grader for lab 04.
 */
public class Lab04Grader extends LabGrader {
 
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
   * Constructs a new Lab04Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab04Grader(Parser.Options opts) {
    super(opts);

    if (opts.restore) return;
    
    write(DIVIDER);
    write("Grading Summary for Lab 04\n");
    write(DIVIDER + '\n');
 
    valid = new HashMap<>();
    invalid = new HashMap<>();
    inconsistentIO = new HashSet<>();
    validOrdered = new ArrayList<>();
    validOrdered.add("category");
    validOrdered.add("rawcat");
    validOrdered.add("message");
    validOrdered.add("latitude");
    validOrdered.add("longitude");
    validOrdered.add("inrange");
    validOrderedIndex = 0;
  } // constructor
 
  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    int lost = 0;
    write("Running...\n");
     
    write("  Test 01...\t");
    lost += runTestCase(sub, "Smoke 40.488 -105.0120 Smoke spotted on side of road");
    write("  Test 02...\t");
    lost += runTestCase(sub, "offer 40.022 -105.226 free essential supplies 4 evacs pets, 2323 55th st, boulder");
    write("  Test 03...\t");
    lost += runTestCase(sub, "structure 40.183000 -105.113420 disaster relief center loc @ sports stadium, loveland");    
    write("  Test 04...\t");
    lost += runTestCase(sub, "fyi 40.4998120 -105.012075 its raining ash windsor, co");
    write("  Test 05...\t");
    lost += runTestCase(sub, "need 40.031131 -105.259259 people to help sort donations Sept 12 8am-9pm 3111 28th st");
 
    write("Proper I/O...\t");
    if (inconsistentIO.size() > 0) {
      lost += 15;
      write("FAILED (-15)\n");
      inconsistentIO.forEach((s) -> write("  " + s + '\n'));
      inconsistentIO.clear();
    } else write("PASSED\n");
 
    return lost;
  } // run
 
  /**
   * A helper method to run an individual test case.
   * 
   * @param sub the submission to be tested
   * @param message the input to the lab04 (ClassifyMessage) program.
   * @return the number of points deducted
   */
  private int runTestCase(Submission sub, String message) {
    // generate a correct values map
    setValid(message);
 
    // start the program
    int lost = 0;
    LabGrader.Output output = exec("java " + sub.getClassName(), message);
     
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
          if (s.trim().matches("(Please enter a formatted message)?:?\\s*(" + message + ")?")) {} // skip
          else if (s.indexOf(":") != -1) {
            String[] map = s.trim().split(":");
            if (map.length == 2) {
              // normalize user input line
              map[0] = map[0].trim().replaceAll("\\s", "").toLowerCase();
              map[1] = map[1].trim();              
              String correctValue = valid.get(map[0]);
              // if null, label not recognized
              if (correctValue != null) {
                if (correctValue.equals(map[1])) {
                  valid.remove(map[0]);
                  // validate order of output
                  if (validOrderedIndex >= 0 && validOrderedIndex < validOrdered.size()) {
                    if (validOrdered.get(validOrderedIndex).equals(map[0])) {
                      validOrderedIndex++;
                    } else {
                      validOrderedIndex = -1;
                      inconsistentIO.add("Invalid output order");
                    }
                  }
                } else {
                  invalid.put(map[0], map[1]);
                }
              } else {
                // for unrecognized label, look for a matching value
                // in correct answers
                inconsistentIO.add("Misspelled category: " + map[0]);
                String key = null;
                for (String k : valid.keySet()) {
                  if (valid.get(k).equals(map[1])) {
                    key = k;
                    break;
                  }
                }
                // essentially forgives the misspelling, deducts points
                // for inconsistent IO instead of missing a value
                // operates on the assumption that all correct values are
                // unique, for lab03 (PareTheTweet) this is an okay assumption
                if (key != null) {
                  valid.remove(key);
                  // validate order of output
                  if (validOrderedIndex >= 0 && validOrderedIndex < validOrdered.size()) {
                    if (validOrdered.get(validOrderedIndex).equals(key)) {
                      validOrderedIndex++;
                    } else {
                      validOrderedIndex = -1;
                      inconsistentIO.add("Invalid output order");
                    }
                  }
                } else invalid.put(map[0], map[1]);
              }
            } else inconsistentIO.add("Extra line in output: \"" + s + "\"");
          } else {
            // test for unrecognized line
            if (!s.trim().equals("") && !s.trim().equalsIgnoreCase(message)) {
              inconsistentIO.add("Extra line in output: \"" + s + "\"");
            }
          }
        });

      // descriptive output of why test case failed
      if (valid.size() > 0) {
        inconsistentIO.remove("Invalid output order");
        int[] deductionFlags = new int[4];
        for (String k : valid.keySet()) {
          switch (k) {
          case "category":
          case "rawcat":
            deductionFlags[0] = 5;
            break;
          case "message":
            deductionFlags[1] = 5;
            break;
          case "latitude":
          case "longitude":
            deductionFlags[2] = 5;
            break;
          case "inrange":
            deductionFlags[3] = 5;
            break;
          }
        }
        
        for (int i = 0; i < 4; i++) {
          lost += deductionFlags[i];
        }
        
        write("FAILED (-" + lost + ")\n");
        valid.forEach((k, v) -> {
            String received = invalid.get(k);
            if (received != null) {
              write("    Expected: " + k + ": " + v + '\n');
              write("    Received: " + k + ": " + received + '\n');
              invalid.remove(k);
            } else {
              write("    Expected: " + k + ": " + v + '\n');
              write("    Received: " + "no match\n");
            }
          });
        if (invalid.size() > 0) {
          invalid.forEach((k, v) -> {
              write("    Received: " + k + ": " + v + '\n');
            });
        }
        invalid.clear();
        valid.clear();
      } 
      else {
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
   * @param message the input to lab04 (ClassifyMessage)
   */
  private void setValid(String message) {
    String catString, payload = "", category;
		double latitude, longitude;
		boolean isInRange;
		
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		String[] tokens = message.split(" ");
   
		catString = tokens[0];
		latitude = Double.parseDouble(tokens[1]);
		longitude = Double.parseDouble(tokens[2]);
    for(int i = 3; i < tokens.length; i++){
      payload += tokens[i] + " ";
    }
		
		catString = catString.trim();
		payload = payload.trim();

		//Classifies the message category by looking for a keyword
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
			category = "ALERT";
		else if (catString.equalsIgnoreCase("need"))
			category = "NEED";
		else if (catString.equalsIgnoreCase("offer"))
			category = "OFFER";
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") ||
             catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = "INFO";
		else
			category = "UNKNOWN";
		
		//Checks that the latitude and longitude are within the boundaries defined earlier
		if(latitude >= south && latitude <= north && longitude >= west && longitude <= east)
			isInRange = true;
		else
			isInRange = false;
      
    valid.clear();
    valid.put("category", category);
    valid.put("rawcat", catString);
    valid.put("message", payload);
    valid.put("latitude", String.valueOf(latitude));
    valid.put("longitude", String.valueOf(longitude));
    valid.put("inrange", String.valueOf(isInRange));
  } // setValid
 
  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab04Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab04Grader
