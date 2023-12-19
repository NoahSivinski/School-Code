import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A grader for lab 02.
 */
public class Lab02Grader extends LabGrader {

  /** A map of correct labels and corresponding values. */
  private Map<String, Double> valid;

  /** A list of correct labels in the expected order */
  private List<String> validOrdered;
  private int validOrderedIndex;

  /** User-supplied incorrect values and its corresponding label. */
  private Map<String, Double> invalid;

  /** A set of descriptive I/O inconsistencies. */
  private Set<String> inconsistentIO;

  /**
   * Constructs a new Lab02Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab02Grader(Parser.Options opts) {
    super(opts);

    if (opts.restore) return;

    write(DIVIDER);
    write("Grading Summary for Lab 02\n");
    write(DIVIDER + '\n');

    valid = new HashMap<>();
    invalid = new HashMap<>();
    inconsistentIO = new HashSet<>();
    validOrdered = new ArrayList<>();
    validOrdered.add("hoursperweek");
    validOrdered.add("grosspay");
    validOrdered.add("netpay");
    validOrdered.add("federal");
    validOrdered.add("state");
    validOrdered.add("socialsecurity");
    validOrdered.add("medicare");
    validOrderedIndex = 0;
  } // constructor

  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    int lost = 0;
    write("Running...\n");
    
    write("  Test 01...\t");
    lost += runTestCase(sub, "40");
    write("  Test 02...\t");
    lost += runTestCase(sub, "45");
    write("  Test 03...\t");
    lost += runTestCase(sub, "25");    
    write("  Test 04...\t");
    lost += runTestCase(sub, "37");

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
   * @param hours the input to the lab02 (NetPay) program.
   * @return the number of points deducted
   */
  private int runTestCase(Submission sub, String hours) {
    // generate a correct values map
    setValid(Double.valueOf(hours));

    // start the program
    int lost = 0;
    LabGrader.Output output = exec("java " + sub.getClassName(), hours);
    
    if (output.exitValue != 0) {
      // on runtime error, deduct full test case point value
      write("FAILED (-25)\n");
      write("    ERROR: program terminated with error code " + output.exitValue + '\n');
      write("    -------------------OUTPUT-------------------\n");
      output.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
      lost += 25;
    } else {
      output.content.forEach((s) -> {
          if (s.indexOf(":") != -1) {
            String[] map = s.trim().split(":");
            if (map.length == 2) {
              // normalize user input line
              map[0] = map[0].trim().replaceAll("\\s", "").toLowerCase();
              map[1] = map[1].trim().replaceAll("\\s", "");
              Double userValue = 0.0;
              try {
                userValue = Double.valueOf(map[1]);
              } catch (NumberFormatException e) {
                inconsistentIO.add("NumberFormatException on \"" + map[1] + '"');
              }
              Double correctValue = valid.get(map[0]);
              // if null, label not recognized
              if (correctValue != null) {
                // test user value for accuracy
                if (Math.abs(userValue - correctValue) <= 0.1) {
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
                  invalid.put(map[0], userValue);
                }
              } else {
                // for unrecognized label, look for a matching value
                // in correct answers
                inconsistentIO.add("Misspelled category: " + map[0]);
                String key = null;
                for (String k : valid.keySet()) {
                  if (Math.abs(userValue - valid.get(k)) <= 0.1) {
                    key = k;
                    break;
                  }
                }
                // essentially forgives the misspelling, deducts points
                // for inconsistent IO instead of missing a value
                // operates on the assumption that all correct values are
                // unique, for lab02 (NetPay) this is an okay assumption
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
                }
                else invalid.put(map[0], userValue);
              }
            } else inconsistentIO.add("Extra line in output: \"" + s + "\"");
          } else {
            // test for unrecognized line
            if (!s.trim().equals("") && !s.trim().equalsIgnoreCase("deductions")) {
              inconsistentIO.add("Extra line in output: \"" + s + "\"");
            }
          }
        });

      // descriptive output of why test case failed
      if (valid.size() > 0) {
        lost += 1 + valid.size() * 4;
        write("FAILED (-" + lost + ")\n");
        valid.forEach((k, v) -> {
            Double received = invalid.get(k);
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
      } else {
        write("PASSED\n");
        // a rare case in which extra, unrecognized label + value was given
        // after all user values were correct
        if (invalid.size() > 0 && invalid.get("hoursperweek") == null) {
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
   * @param hours the input to lab02 (NetPay)
   */
  private void setValid(double hours) {
    double federalTax = .10;
    double stateTax = .045;
    double ssTax = .062;
    double medicareTax = .0145;
    double pay = 7.25;

    double gross = hours * pay;
    double federal = gross * federalTax;
    double state = gross * stateTax;
    double ss = gross * ssTax;
    double medicare = gross * medicareTax;
    double deductions = federal + state + ss + medicare;
    double net = gross - deductions;

    valid.clear();
    valid.put("hoursperweek", hours);
    valid.put("grosspay", gross);
    valid.put("netpay", net);
    valid.put("federal", federal);
    valid.put("state", state);
    valid.put("socialsecurity", ss);
    valid.put("medicare", medicare);
  } // setValid

  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab02Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab02Grader
