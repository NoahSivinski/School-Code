import java.time.LocalDateTime;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A grader for Lab 06.
 */
public class Lab06Grader extends LabGrader {
  /** A list of correct labels in the expected order */
  private List<String> validOrdered;
     
  /** User-supplied incorrect values and its corresponding label. */
  private List<List<String>> invalid;
  
  /** A set of descriptive I/O inconsistencies. */
  private Set<String> inconsistentIO;
     
  /**
   * Constructs a new Lab06Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab06Grader(Parser.Options opts) {
    super(opts);
 
    if (opts.restore) return;
     
    write(DIVIDER);
    write("Grading Summary for Lab 06\n");
    write(DIVIDER + '\n');
     
    invalid = new ArrayList<>();
    inconsistentIO = new HashSet<>();
    validOrdered = new ArrayList<>();
  }
 
  /** @see LabGrader.run(Submission) */   
  @Override
  public int run(Submission sub) {
    int lost = 0;
    write("Running...\n");
     
    write("  Test 01...\t");
    lost += runTestCase(sub, "3", "paper", "scissors", "rock");
    write("  Test 02...\t");
    lost += runTestCase(sub, "5", "scissors", "rock", "paper", "scissors", "rock");
    write("  Test 03...\t");
    lost += runTestCase(sub, "1", "papper", "Bob", "pAPer");
    write("  Test 04...\t");
    lost += runTestCase(sub, "2", "rock", "rock", "rock", "rock", "rock");
    write("  Test 05...\t");
    lost += runTestCase(sub, "3", "ROCK", "ROcK", "PAPEr", "SCiSSoRS");
     
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
   * @param input the input to the program
   * @return the number of points deducted
   */
  private int runTestCase(Submission sub, String... input) {
    // set expected output
    setValid(input);
    int lost = 0;
    LabGrader.Output output = exec("java " + sub.getClassName(), input);
     
    if (output.exitValue != 0) {
      write("FAILED (-20)\n");
      write("    ERROR: program terminated with error code " + output.exitValue + '\n');
      write("    -------------------OUTPUT-------------------\n");
      output.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
      lost += 20;
    } else {
      List<String> inputs = Arrays.asList("rock", "paper", "scissors", "papper", "bob",
                                          "1", "2", "3", "5");
    	for(int i = 0; i < output.content.size(); i++) {
    		String s = output.content.get(i);
        if (s.trim().equals("")) continue;
        if (validOrdered.isEmpty()) {
          inconsistentIO.add("Extra line in output: \"" + s + "\"");
        } else if (s.trim().matches(".*([Pp]lease\\s+choose|([Ii]n)?valid|[Ii]ncorrect|[Tt]ry\\s+again).*")) {
          inconsistentIO.add("Extra line in output: \"" + s + "\"");
        } else if (inputs.contains(s.trim().toLowerCase())) {
          if (!invalid.isEmpty()) {
            List<String> lastInvalid = invalid.get(invalid.size() - 1);
            String reconstructed = lastInvalid.get(1) + s.trim();
            String stripped = reconstructed.replaceAll("[\\s.!,]", "").toLowerCase();
            String strippedCorrect = lastInvalid.get(0).replaceAll("[\\s.!,]", "").toLowerCase();
            if (stripped.matches(strippedCorrect)) {
              invalid.remove(invalid.size() - 1);
              inconsistentIO.add("Recieved input \"" + s.trim() +
                                 "\" on next line instead of same line");
            } else {
              invalid.add(Arrays.asList("Extra", s));
            }
          } else {
            invalid.add(Arrays.asList("Extra", s));
          }
        } else {
          String stripped = s.replaceAll("[\\s.!,]", "").toLowerCase();
          String strippedCorrect = validOrdered.get(0).replaceAll("[\\s.!,]", "").toLowerCase();

          if (stripped.matches(strippedCorrect)) {
            validOrdered.remove(0);
          } else {
            String valid = validOrdered.remove(0);
            invalid.add(Arrays.asList(valid, s));
          }
        }
      }
      
      if (invalid.size() > 0 || validOrdered.size() > 0) {
        lost += 20;
        write("FAILED (-20)\n");

        for (int i = 0; i < invalid.size(); i++) {
          List<String> curr = invalid.get(i);
          if (curr.get(0).equals("Extra")) {
            write("    Extra line: " + curr.get(1) + '\n');
          } else {
            write("    Expected: " + curr.get(0) + '\n');
            write("    Received: " + curr.get(1) + '\n');
          }
        }

        for (int i = 0; i < validOrdered.size(); i++) {
          String missing = validOrdered.get(i);
          write("    Missing line: " + missing + '\n');
        }      
      } else {
        write("PASSED\n");
      }
    }
    
    invalid.clear();
    validOrdered.clear();
    return lost;
  } // runTestCase
   
  /**
   * A helper method to generate the correct output of the lab.
   * 
   * @param input the input to lab 6
   */   
  private void setValid(String... input) {
	  // reset score and opponent cycler
	  ComputerOpponent.reset();
	  int userScore = 0, opponentScore = 0;
	  String pointsToWinMsg, promptMsg, responseMsg, finalMsg;
	  
	  pointsToWinMsg = "(Number of)? Points to win: " + Integer.parseInt(input[0]);
	  validOrdered.add(pointsToWinMsg);
    
	  for(int i = 1; i < input.length; i++) {
		  String userMove = input[i];
		  promptMsg = "Rock, paper, (or)? scissors\\? " + userMove;
		  validOrdered.add(promptMsg);

      if (!(userMove.equalsIgnoreCase("rock") ||
            userMove.equalsIgnoreCase("paper") ||
            userMove.equalsIgnoreCase("scissors"))) {
        continue;
      }
      
		  String opponentMove = ComputerOpponent.getMove();
		  int winner = getWinner(userMove, opponentMove);

      String result = "";
		  switch(winner) {
		  case 1:
			  userScore++;
			  result = "you win! \\(" + userScore + "-" + opponentScore + "\\)"; 
			  break;
		  case 0:
			  result = "it's a tie. \\(" + userScore + "-" + opponentScore + "\\)"; 
			  break;
		  default:
			  opponentScore++;
			  result = "you lose. \\(" + userScore + "-" + opponentScore + "\\)"; 
			  break;
		  }

      responseMsg = "The computer (chose|chooses) " + opponentMove + ", so " + result;
		  validOrdered.add(responseMsg);
	  } // for
    
	  if(userScore > opponentScore) {
		  finalMsg = "Congratulations! You w[oi]n!";
	  } else {
		  finalMsg = "Sorry, you lost. Better luck next time!";
	  }
	  validOrdered.add(finalMsg);
  } // setValid
  
  /**
   * A helper method to determine the winner of a turn.
   *
   * @param userMove
   * @param opponentMove
   * @return 0 if it is a tie; 1 if the user wins; -1 if the opponent wins
   */
  private int getWinner(String userMove, String opponentMove) {
	  if (userMove.equalsIgnoreCase("rock")) {
		  if (opponentMove.equals("rock")) {
			  return 0; // tie
		  } else if (opponentMove.equals("paper")) {
			  return -1; // opponent wins
		  } else {
        return 1; // user wins
      }
	  } else if (userMove.equalsIgnoreCase("paper")) {
		  if (opponentMove.equals("rock")) {
			  return 1; // user wins
		  } else if (opponentMove.equals("paper")) {
			  return 0; // tie
		  } else {
        return -1; // opponent wins
      }
	  } else {
		  if (opponentMove.equals("rock")) {
			  return -1; // opponent wins
		  } else if(opponentMove.equals("paper")) {
			  return 1; // user wins
		  } else {
        return 0; //tie
      }
	  }
  } // getWinner
 
  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab06Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab06Grader
