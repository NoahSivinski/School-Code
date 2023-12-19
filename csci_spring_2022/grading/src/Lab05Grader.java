import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A grader for lab 05.
 */
public class Lab05Grader extends LabGrader {
    
  /** A map of correct labels and corresponding values. */
  private Map<String, String> valid;
    
  /** A list of correct labels in the expected order */
  private List<String> validOrdered;
  private int validOrderedIndex;
    
  /** User-supplied incorrect values and its corresponding label. */
  private Map<String, String> invalid;
    
  /** A set of descriptive I/O inconsistencies. */
  private Set<String> inconsistentIO;

  /** The current test case being run. */
  private int currentTestCase;

   /**
   * Constructs a new Lab05Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab05Grader(Parser.Options opts) {	
    super(opts);

    if (opts.restore) return;
	
    write(DIVIDER);
    write("Grading Summary for Lab 05\n");
    write(DIVIDER + '\n');
	
    valid = new HashMap<>();
    invalid = new HashMap<>();
    inconsistentIO = new HashSet<>();
    validOrdered = new ArrayList<>();
  }

  /** @see LabGrader.run(Submission) */    
  @Override
  public int run(Submission sub) {
    currentTestCase = 0;
    int lost = 0;
    write("Running...\n");
	
    write("  Test 01...\t");
    lost += runTestCase(sub, 88, 3);
    write("  Test 02...\t");
    lost += runTestCase(sub, 5.6, 5);
    write("  Test 03...\t");
    lost += runTestCase(sub, -100, 2);
    write("  Test 04...\t");
    lost += runTestCase(sub, 6.3, 4);
    write("  Test 05...\t");
    lost += runTestCase(sub, -459.67, 1);
	
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
   * @param fahrenheit the input to the lab05 program.
   * @param tempScale the input to the lab05 program.
   * @return the number of points deducted
   */
  private int runTestCase(Submission sub, double fahrenheit, int tempScale) {
    currentTestCase++;
    // set valid scale and temp value
    // set order
    setValid(fahrenheit, tempScale);
    int lost = 0;
    String[] input = {Double.toString(fahrenheit), Integer.toString(tempScale)};
    LabGrader.Output output = exec("java " + sub.getClassName(), input);
	
    if (output.exitValue != 0) {
	    write("FAILED (-20)\n");
      write("    ERROR: program terminated with error code " + output.exitValue + '\n');
      write("    -------------------OUTPUT-------------------\n");
      output.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
	    lost += 20;
    } else {
	    output.content.forEach((s) -> {
          if (validOrdered.isEmpty()) {
            inconsistentIO.add("Extra line in output: \"" + s + "\"");
          } else if (s.trim().matches(validOrdered.get(0))) {
            validOrdered.remove(0);
          } else {
            // something wrong with the current line
            if (currentTestCase == 5 && s.equals("The temperature must be greater than or equal to -459.671")) {
              invalid.put(valid.get("statement"), s);
              validOrdered.clear();
              validOrdered.add(valid.get("statement"));
            } else if (validOrdered.get(0).matches(valid.get("statement"))) {
              if (valid.get("converted").equals("null")) {
                if (s.matches(".*\\d.*")) {
                  invalid.put(valid.get("statement"), s);
                } else {
                  validOrdered.remove(0);
                }
              } else {
                String scale = valid.get("scale");
                double converted = Double.valueOf(valid.get("converted"));
                double userOutput = 0.0;

                String[] map = s.trim().replaceAll("[^0-9.E-]+", " ").split(" ");
                if (map[map.length-1].equals(".")) map = Arrays.copyOf(map, map.length-1);
                if (map.length != 2) {
                  invalid.put(valid.get("statement"), s);
                } else {
                  userOutput = Double.valueOf(map[1]);
                  if (Math.abs(userOutput - converted) < 0.01) {
                    validOrdered.remove(0);
                    if (!s.contains(scale)) {
                      String[] userOutputByWord = s.split(" ");
                      inconsistentIO.add("[TC " + currentTestCase + "] Incorrect converted temperature scale: Expected: \"" + scale +
                                         ".\" Received: \"" + userOutputByWord[userOutputByWord.length - 1]  + "\"");
                    }
                  } else {
                    invalid.put(valid.get("statement"), s);
                  }
                }
              }
            } else {
              // if it's not a number problem, need to put inconsistent I/O
              inconsistentIO.add("Unexpected output sentence: \"" + s + "\"");
            }
          }
        });
    }
	
    if (validOrdered.size() > 0) {
	    lost += 20;
	    write("FAILED (-20)\n");
	    validOrdered.forEach((k) -> {
          String received = invalid.get(k);
          if(received != null) {
            write("    Expected: " + k + '\n');
            write("    Received: " + received + '\n');
            invalid.remove(k);
          } else {
            write("    Expected: " + k + '\n');
            write("    Received: " + "[no matching line]\n");
          }
        });
	    invalid.clear();
	    valid.clear();
    } else {
	    write("PASSED\n");
	    invalid.clear();
	    valid.clear();
    }
    validOrdered.clear();
    validOrderedIndex = 0;
    return lost;
  } // runTestCase
  
  /**
   * A helper method to generate the correct output of the lab.
   * 
   * @param fahrenheit the input to lab05
   * @param tempScale the input to lab05
   */    
  private void setValid(double fahrenheit, int tempScale) {
    final double MIN_FAHRENHEIT = -459.67;
	
    Double convertedDegrees = null;
    String exactStatement = null;
    String tempScaleStr = null;
    validOrdered.add("Enter the temperature in Fahrenheit: " + fahrenheit);
    validOrdered.add("Enter the temperature scales you want to convert to:");
    // if fahrenheit < MIN then add another statement
    validOrdered.add("1. Kelvin");
    validOrdered.add("2. Rankine");
    validOrdered.add("3. Reaumur");
    validOrdered.add("4. Celsius");
    validOrdered.add("Enter a temperature scale: " + tempScale);
    if(tempScale < 1 || tempScale > 4) {
	    exactStatement = "Unknown temperature scale  -  cannot do calculation. Bye";
	    validOrdered.add(exactStatement);
    } else {
	    if(tempScale == 1) {
        convertedDegrees = (fahrenheit + (MIN_FAHRENHEIT * -1)) * 5.0/9.0;
        tempScaleStr = "Kelvin";
	    } else if (tempScale == 2) {
        convertedDegrees = fahrenheit + (MIN_FAHRENHEIT * -1);
        tempScaleStr = "Rankine";
	    } else if (tempScale == 3){
        convertedDegrees = (fahrenheit - 32.0) * 4.0/9.0;
        tempScaleStr = "Reaumur";
	    } else {
        convertedDegrees = (fahrenheit - 32) * 5.0/9.0;
        tempScaleStr = "Celsius";
	    }
	    exactStatement = fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".";
	    validOrdered.add(exactStatement);
    }
	
    valid.clear();
    String converted = String.valueOf(convertedDegrees);
    valid.put("converted", converted);
    valid.put("scale", tempScaleStr);
    valid.put("statement", exactStatement);
    valid.put("lessthanmin", "The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
  } // setValid

  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab05Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab05Grader
