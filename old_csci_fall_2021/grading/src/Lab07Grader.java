import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.io.*;

/**
 * A grader for lab 07.
 */
public class Lab07Grader extends LabGrader {
	/** A list of correct output */
	private List<String> valid;
	private int validOrderedIndex;

	/** A list of invalid input mapped with the correct input*/
	private Map<String, String> invalid;


	/** A set of descriptive I/O inconsistencies. */
	private Set<String> inconsistentIO;

	/** counter to keep track of test cases. */
	private int count;
		
	/**
	 * Constructs a new Lab07Grader object.
	 *
   * @param opts the options with which to initialize this grader
	 */
	public Lab07Grader(Parser.Options opts) {
		super(opts);

		if(opts.restore) return;

		write(DIVIDER);
		write("Grading Summary for Lab 07\n");
		write(DIVIDER + '\n');

		valid = new ArrayList<String>();
		invalid = new LinkedHashMap<>();
		inconsistentIO = new HashSet<>();
		validOrderedIndex = 0;
		count = 1;

    addDisallowedKeywords("\\.\\s*indexOf", "\\.\\s*lastIndexOf", "\\.\\s*replace");
	} // constructor

	/** @see LabGrader.run(Submission) */
	@Override
	public int run(Submission sub) {
		count = 1;
		int lost = 0;
				
		write("Running...\n");

		write("  Test 01...\t");
		lost += runTestCase(sub, "aaabbb", "blah", "quit");
		write("  Test 02...\t");
		lost += runTestCase(sub, "aaabbb", "quit");
		write("  Test 03...\t");
		lost += runTestCase(sub, "cazzzzooooo dawggggooooos", "remove all", "o", "quit");    
		write("  Test 04...\t");
		lost += runTestCase(sub, "aaabbb", "remove", "b", "4", "quit");
		write("  Test 05...\t");
		lost += runTestCase(sub, "baabbb", "remove all", "b", "quit");
		write("  Test 06...\t");
		lost += runTestCase(sub, "aaabbb", "reverse", "replace first", "b", "c", "quit");
		write("  Test 07...\t");
		lost += runTestCase(sub, "momnommnm", "remove", "m", "4", "quit");
		write("  Test 08...\t");
		lost += runTestCase(sub, "aaabbbcdecd", "replace last", "c", "z", "quit");
		write("  Test 09...\t");
		lost += runTestCase(sub, "aaabbbcccddd", "remove all", "d", "remove all", "c", "remove all", "b", "remove", "a", "1", "remove", "a", "2", "remove", "a", "1", "quit");

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
	 * A helper method to run a basic test case.
	 * 
	 * @param sub the submission to be tested
	 * @param inputString the string to be manipulated
	 * @param command the operation to perform on the string 
	 * @return the number of points deducted
	 */
	private int runTestCase(Submission sub, String... input) {
		setValid(input);

		// start the program
		int lost = 0;
		LabGrader.Output output = exec("java " + sub.getClassName(), input);

		if (output.exitValue != 0) {
			// on runtime error, deduct full test case point value
			if(count == 1 || count == 2) {
				write("FAILED (-5)\n");
				lost += 5;
			}
			else if(count == 9) {
				write("FAILED (-30)\n");
				lost += 30;
			}
			else {
				write("FAILED (-10)\n");
				lost += 10;
			}
			write("    ERROR: program terminated with error code " + output.exitValue + '\n');
			write("    -------------------OUTPUT-------------------\n");
			output.content.forEach((s) -> write("      " + s + '\n'));
			write("    --------------------------------------------\n");
		} else {
			output.content.forEach((s) -> {
				if (valid.isEmpty()) {
					inconsistentIO.add("Extra line in output: \"" + s + "\"");
				}
				else {
					String stripped = s.replaceAll("\\s", "").toLowerCase();
					String strippedCorrect = valid.get(validOrderedIndex).replaceAll("\\s", "").toLowerCase();
					
					if (stripped.equals(strippedCorrect)) {
						valid.remove(validOrderedIndex);
					} else {
						if(strippedCorrect.contains("error")) {
							if(s.contains("error") || s.contains("Error")) {valid.remove(validOrderedIndex);} //If any error message, then correct
							else {
								String correct = valid.remove(validOrderedIndex);
								invalid.put(correct, s);
							}
						}
            
						//handling for common slight punctuation variances/verbiage in error messages
						else if(stripped.equals("enteryourcommand(reverse,replacefirst,replacelast,removeall,remove,quit")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("enterthecommand(reverse,replacefirst,replacelast,removeall,remove,quit)")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("enterthecommand(reverse,replacefirst,replacelast,removeall,remove,quit):")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("enteryourcommand(reverse,replacefirst,replacelast,removeall,remove,quit):")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("invalidcommand.tryagain!")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("commandnotvalid")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("invalidcommand")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("entercharactertoremove")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("enteracharactertoremove")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("entercharactertobereplaced")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("enterthestringtobemanipulated:")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("enterthestringtobemanipulated.")) {valid.remove(validOrderedIndex);}
						else if(stripped.equals("enterthebyouwouldliketoremove(nottheindex-1=1st,2=2nd,etc.)")){valid.remove(validOrderedIndex);}
						else if(stripped.equals("enterthemyouwouldliketoremove(nottheindex-1=1st,2=2nd,etc.)")){valid.remove(validOrderedIndex);}
						else if(stripped.equals("entertheayouwouldliketoremove(nottheindex-1=1st,2=2nd,etc.)")){valid.remove(validOrderedIndex);}
						else {
							String correct = valid.remove(validOrderedIndex);
							invalid.put(correct, s);
						}
					}
				}

			}); // forEach

			//Descriptive output of why test case failed
			if (invalid.size() > 0 || valid.size() > 0) {
				if(count == 1 || count == 2) {
					write("FAILED (-5)\n");
					lost += 5;
				}
				else if(count == 9) {
					if(invalid.containsKey("The new sentence is:")) {
						String userAns = invalid.get("The new sentence is:");
						if(userAns.contains(":")) {
							String userString = userAns.substring(userAns.indexOf(":")+1);
							if(userString.trim().length() == 1) {
								write("FAILED (-10)\n");
								lost += 10;
							}
						}
					}
					else {
						write("FAILED (-30)\n");
						lost += 30;
					}	
				}
				else {
					write("FAILED (-10)\n");
					lost += 10;
				}
				if (invalid.size() > 0) {
		            invalid.forEach((k, v) -> {
		            	write("    Expected: " + k + '\n');
		            	write("    Received: " + v + '\n');
		              });
		          }

				for (int i = 0; i < valid.size(); i++) {
					String missing = valid.get(i);
					write("    Missing line: " + missing + '\n');
				}      
			} else {
				write("PASSED\n");
			}

		} // else (test case runs successfully)

		invalid.clear();
		valid.clear();
		validOrderedIndex = 0;
		count++;
		return lost;
	} // runTestCase

	/**
	 * A helper method to generate the correct output of the lab
	 * 
	 * @param input the input to lab 7
	 */
	private void setValid(String... input) {
		valid.clear();
		String m1 = "Enter the string to be manipulated";
		String stringToProcess = input[0];
		String prompt = "Enter your command (reverse, replace first, replace last, remove all, remove, quit)";
		String char1 = "Enter the character to replace";
		String char2 = "Enter the new character";
		String rem = "Enter the character to remove";

		valid.add(m1);
		valid.add(stringToProcess);
		valid.add(prompt);

		int i = 1;
		while(i < input.length) {
			if(input[i].trim().equalsIgnoreCase("quit")) {
				valid.add(input[i]);
				i++;
			}
			else if(input[i].trim().equalsIgnoreCase("reverse")) {
				valid.add(input[i]);
				StringBuilder str = new StringBuilder(stringToProcess);
				stringToProcess = str.reverse().toString();
				String result = "The new sentence is: " + stringToProcess;
				valid.add(result);  
				valid.add(prompt);
				i++;
			}
			else if(input[i].trim().equalsIgnoreCase("replace first")) {
				valid.add(input[i]);
				valid.add(char1);
				valid.add(input[i+1]);
				valid.add(char2);
				valid.add(input[i+2]);
				for(int j = 0; j < stringToProcess.length(); j++){
					if (stringToProcess.charAt(j) == input[i+1].charAt(0)){
						stringToProcess = stringToProcess.substring(0, j) + input[i+2].charAt(0) + stringToProcess.substring(j + 1);
						String result = "The new sentence is: " + stringToProcess;
						valid.add(result);
						valid.add(prompt);
						break;
					}
				}
				i+=3;
			}
			else if(input[i].trim().equalsIgnoreCase("replace last")) {
				valid.add(input[i]);
				valid.add(char1);
				valid.add(input[i+1]);
				valid.add(char2);
				valid.add(input[i+2]);
				for(int j = stringToProcess.length()-1; j >= 0; j--){
					if (stringToProcess.charAt(j) == input[i+1].charAt(0)){
						stringToProcess = stringToProcess.substring(0, j) + input[i+2].charAt(0) + stringToProcess.substring(j + 1);
						String result = "The new sentence is: " + stringToProcess;
						valid.add(result);
						valid.add(prompt);
						break;
					}
				}
				i+=3;
			}
			else if(input[i].trim().equalsIgnoreCase("remove all")) {
				valid.add(input[i]);
				valid.add(rem);
				valid.add(input[i+1]);
				stringToProcess = removeAll(stringToProcess, input[i+1]);
				String result = "The new sentence is: " + stringToProcess;
				valid.add(result);
				valid.add(prompt);
				i+=2;

			}
			else  if(input[i].trim().equalsIgnoreCase("remove")) {
				valid.add(input[i]);
				String msg = "Enter the " + input[i+1] + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):";
				valid.add(rem);
				valid.add(input[i+1]);
				valid.add(msg);
				valid.add(input[i+2]);
				stringToProcess = remove(stringToProcess, input[i+1].charAt(0), Integer.valueOf(input[i+2]));
				String result = "The new sentence is: " + stringToProcess;
				valid.add(result);
				valid.add(prompt);
				i+=3;
			}
			else {
				valid.add(input[i]);
				valid.add("Command invalid. Try again");
				valid.add(prompt);
				i++;
			}
		} // while
	} // setValid

	/**
	 * A helper method that removes a certain instance of a character from a string
	 * 
	 * @param input the string to be manipulated
	 * @param letter the letter to remove
	 * @param instance the instance of the letter to remove 
	 * @return the manipulated string 
	 */
	private String remove(String input, char letter, int instance ) {
		String correct = "";
		int occurence = 0;
		for(int i = 0; i < input.length(); i++){
			if (input.charAt(i) == letter){
				String newSentence = input.substring(0, i) + "" + input.substring(i + 1);
				occurence++;
				if(instance == occurence)
					correct = newSentence;
			}
		}
		if(instance > occurence || instance == 0) {
			correct = "error";
		}
		return correct;
	} // remove

	/**
	 * A helper method that removes all instances of a character in a string 
	 * 
	 * @param input the string to be manipulated
	 * @param letter the letter to remove 
	 * @return the manipulated string 
	 */
	private String removeAll(String input, String letter ) {
		String correct = "";
		correct = input.replace(letter, "");
		return correct;
	} // removeAll

	// driver
	public static void main(String[] args) {
		Parser parser = new Parser(args);
		LabGrader grader = new Lab07Grader(parser.opts);
		if (parser.opts.restore) grader.restore();
		else grader.grade();
	} // main
} // Lab07Grader
