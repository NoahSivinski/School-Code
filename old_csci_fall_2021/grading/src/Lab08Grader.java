import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A grader for lab 08.
 */
public class Lab08Grader extends LabGrader {  
  /** A List of correct x and y coordinate values */
  private  List<double[]> values; 
  
  /** A list containing the correct string of stars for each row */
  private List<String> starString;

  /** User-supplied incorrect x,y values mapped with correct x, y values*/
  private Map<double[], double[]> invalidXY; 
  
  /** User-supplied incorrect star string mapped with correct star string */
  private Map<String, String> invalidStar; 

  /** A set of descriptive I/O inconsistencies. */
  private Set<String> inconsistentIO;
  
  /** A set of incorrect prompts */
  private Set<String> inconsistentPrompt;
  
  /** An integer representing the row of valid output to test (row of values and starString) */
  private int row1;
  private int row2;
  
  /** counter to keep track of test cases. To identify between invalid input test cases and regular test cases */
  private int count;

  /**
   * Constructs a new Lab08Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab08Grader(Parser.Options opts) {
    super(opts);
    
    if (opts.restore) return;

    write(DIVIDER);
    write("Grading Summary for Lab 08\n");
    write(DIVIDER + '\n');

    values = new ArrayList<double[]>();
    starString = new ArrayList<>();
    
    invalidXY = new LinkedHashMap<>();
    invalidStar = new LinkedHashMap<>();
    
    inconsistentIO = new HashSet<>();
    inconsistentPrompt = new HashSet<>();

  	count = 1;
    
    row1 = 0;
    row2 = 0;
  } // constructor

  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    count = 1;
    int lost = 0;    
    
    write("Running...\n");
    
    write("  Test 01...\t");
    lost += runTestCase(sub, "-4", "empty", "empty");
    write("  Test 02...\t");
    lost += runTestCase(sub, "100", "0", "-100");
    write("  Test 03...\t");
    lost += runTestCase(sub, "5", "0.08", "3.14159265359");
    write("  Test 04...\t");
    lost += runTestCase(sub, "5", "0.055", "0.06");
    write("  Test 05...\t");
    lost += runTestCase(sub, "8", "-4.6", "0.2");    
    write("  Test 06...\t");
    lost += runTestCase(sub, "9", "-1", "0.25");

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
   * @param N the size of the array, input to the lab08 program.
   * @param minX the min value for x, input to the lab08 program.
   * @param increment the increment for x, input to the lab08 program.
   * @return the number of points deducted
   */
  private int runTestCase(Submission sub, String N, String minX, String increment) {

    // start the program
    int lost = 0;
    LabGrader.Output output = exec("java " + sub.getClassName(), N, minX, increment);
    
    if (output.exitValue != 0) {
      // on runtime error, deduct full test case point value
      if(count <= 2) {
        write("FAILED (-10)\n");
        lost += 10;
      }
      else {
        write("FAILED (-20)\n");
        lost += 20;
      }
      write("    ERROR: program terminated with error code " + output.exitValue + '\n');
      write("    -------------------OUTPUT-------------------\n");
      output.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
    } else {
      row1 = 0;
      row2 = 0;
      //TODO: handle incorrect handling of errors
      //case of incorrect N value
      if (Integer.valueOf(N) <= 0) {
        for (int i = 0; i < output.content.size(); i++) {
          String s = output.content.get(i).trim();
          if (s.matches("Please enter the number of [X,x] values to process:?\\s*(" + N + ")?") ||
              s.matches("The number of [X,x] values must be an integer greater than 0.?(empty)?") ||
              s.equals("empty") ||
              s.equals("")) {
            continue;
          } else if (s.equals(N)) {
            inconsistentPrompt.add("Incorrect prompt: \"" + N + "\" received on new line.");
          } else if (s.indexOf(":") != -1) {
            inconsistentPrompt.add("Incorrect prompt: \"" + s + "\"");
          } else {
            inconsistentIO.add("[TC " + count + "] Extra line in output: \"" + s + "\"");
          }
        }
      }
      //case of incorrect increment
      else if (Double.valueOf(increment) <= 0) {
        for (int i = 0; i < output.content.size(); i++) {
          String s = output.content.get(i).trim();
          if (s.matches("Please enter the number of [X,x] values to process:?\\s*(" + N + ")?") ||
              s.matches("Enter a minimum value for [X,x]:?\\s*(" + minX + ")?") ||
              s.matches("Enter the amount to increment [X,x]:?\\s*(" + increment + ")?") ||
              s.matches("The value to increment must be a decimal number greater than 0.?") ||
              s.matches("The increment must be a decimal number greater than 0.?") ||
              s.equals("")) {
            continue;
          } else if (s.equals(N)) {
            inconsistentPrompt.add("Incorrect prompt: \"" + N + "\" received on new line.");
          } else if (s.equals(minX)) {
            inconsistentPrompt.add("Incorrect prompt: \"" + minX + "\" received on new line.");
          } else if (s.equals(increment)) {
            inconsistentPrompt.add("Incorrect prompt: \"" + increment + "\" received on new line.");
          } else if (s.indexOf(":") != -1) {
            inconsistentPrompt.add("Incorrect prompt: \"" + s + "\"");
          } else {
            inconsistentIO.add("[TC " + count + "] Extra line in output: \"" + s + "\"");
          }
        }
      }
      //regular test case
      else {
        // generate a correct values map
        setValid(Integer.valueOf(N), Double.valueOf(minX), Double.valueOf(increment));

        for (int i = 0; i < output.content.size(); i++) {
          String s = output.content.get(i).trim();
          if(s.equals(":")) {
            s = s + "empty";
          }
          if (s.matches("Please enter the number of [X,x] values to process:?\\s*(" + N + ")?") ||
              s.matches("Enter a minimum value for [X,x]:?\\s*(" + minX + ")?") ||
              s.matches("Enter the amount to increment [X,x]:?\\s*(" + increment + ")?") ||
              s.matches("[Vv]alues:?") ||
              s.matches("[Gg]raph:?") ||
              s.equals("")) {
            continue;
          } else if (s.equals(N)) {
            inconsistentPrompt.add("Incorrect prompt: \"" + N + "\" received on new line.");
          } else if (s.equals(minX)) {
            inconsistentPrompt.add("Incorrect prompt: \"" + minX + "\" received on new line.");
          } else if (s.equals(increment)) {
            inconsistentPrompt.add("Incorrect prompt: \"" + increment + "\" received on new line.");
          } else if (s.indexOf(":") != -1) {
            s = s.replaceAll(",", ":");
            String[] map = s.trim().split(":");
            if (map.length == 4 || map.length == 3) {
              // normalize
              String xValueString;
              String yValueString;
              if (map.length == 3) {
                xValueString = map[1].replaceAll("[\\sy]", "");
                yValueString = map[2].replaceAll("\\s", "");
              } else {
                xValueString = map[1].replaceAll("\\s", "");
                yValueString = map[3].replaceAll("\\s", "");
              }

              Double xValue = 0.0;
              Double yValue = 0.0;
              try {
                xValue = Double.valueOf(xValueString);
              } catch (NumberFormatException e) {
                inconsistentIO.add("[TC " + count + "] NumberFormatException on \"" + xValueString + '"');
              }
              try {
                yValue = Double.valueOf(yValueString);
              } catch (NumberFormatException e) {
                inconsistentIO.add("[TC " + count + "] NumberFormatException on \"" + yValueString + '"');
              }
              
              // test user value for accuracy
              double correctXValue = values.get(row1)[0];
              double correctYValue = values.get(row1)[1];  
              if (Math.abs(xValue - correctXValue) > 0.001 ||
                  Math.abs(yValue - correctYValue) > 0.001) {
                invalidXY.put(new double[] {xValue, yValue}, new double[] {correctXValue, correctYValue});
              }
              row1++;
            } else if (map.length == 2) {
              //handle incorrect prompt case 
              if(!map[0].equals("")) {
                inconsistentPrompt.add("Incorrect prompt: \"" + s + "\"");
              } else {
                map[1] = map[1].replaceAll("\\s", "");
                // invalid number of stars
                if (!map[1].equals(starString.get(row2))) {
                  invalidStar.put(map[1], starString.get(row2));
                }
                row2++;
              }
            } else {
              inconsistentPrompt.add("Incorrect prompt: \"" + s + "\"");
            }
          } else {
            inconsistentIO.add("[TC " + count + "] Extra line in output: \"" + s + "\"");
          }
        }
      }

      //Descriptive output of why test case failed 
      if (invalidXY.size() > 0 || invalidStar.size() > 0 || inconsistentPrompt.size() > 0) {
        if(invalidXY.size() > 0) {
          lost += 9;
        }
        
        if(invalidStar.size() > 0) {
          lost += 7;
        }
        
        if(inconsistentPrompt.size() > 0) { 
          if(count > 2) {
            lost += 4;
          } else {
            lost += 10;
          }
        }
  
        write("FAILED (-" + lost + ")\n");
        if (invalidXY.size() > 0) {
          write("    Invalid x, y values (-9)\n");
          invalidXY.forEach((k, v) -> {
              write(String.format("      Expected: x: %.3f, y: %.3f\n", v[0], v[1]));
              write(String.format("      Received: x: %.3f, y: %.3f\n", k[0], k[1]));
            });
        }
        if (invalidStar.size() > 0) {
          write("    Invalid number of stars (-7)\n");
          invalidStar.forEach((k, v) -> {
              write("      Expected: " + v + "\n");
              write("      Received: " + k + '\n');
            });
        }
        if(inconsistentPrompt.size() > 0) {
          if (count > 2) {
            inconsistentPrompt.forEach((s) -> write("    " + s + '\n'));
          } else {
            inconsistentPrompt.forEach((s) -> write("    " + s + '\n'));
          }
        }
      } else {
        write("PASSED\n");
      }
    }

    invalidXY.clear();
    invalidStar.clear();
    inconsistentPrompt.clear();
    count++;
    return lost;
  } // runTestCase

  /**
   * A helper method to generate the correct output of the lab.
   * 
   * @param hours the input to lab02 (NetPay)
   */
  private void setValid(int N, double minX, double increment) {
    double[] x = new double[N];
    double[] y = new double[N];
  
    x[0] = minX;
    for(int i = 1; i < N; i++){
      x[i] = x[i-1] + increment;
    }
  
    for(int i = 0; i < N; i++){
      y[i] = 20 * Math.abs(Math.sin(x[i]));
    }

    values.clear();
    for(int i=0; i < N; i++) {
      values.add(new double[] {x[i], y[i]});
    }
    
    starString.clear();
    for (int i = 0; i < N; i++){
      String stars = "";
      for (int j = 0; j < Math.floor(y[i]); j++){
        stars += "*";
      }
      if(stars.equals("")) {
        stars = "empty";
      }
      starString.add(stars);
    }
  } // setValid
  
  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab08Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab08Grader
