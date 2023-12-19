/*
 * StringFun.java
 * Author:  Gage Roney 
 * Submission Date:  3/19/2021
 *
 * Purpose: This program allows for the user to input a string that they would like to modify. There is 6 different commands 
 * that the user will be able to use in this program. These include commands such as reversing the string,replacing the first 
 * letter, replacing the last letter, removing a specific letter, and removing all of that specific letter, and quitting the program.
 * 
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner; //import used to allow for user input

public class StringFun { // Class name

	public static void main(String[] args) {
		// Series of initialized variables that will be altered depending on the command
		// input such as String, char, boolean, and int.
		String originalString;
		String command;
		String newString = "";
		char characterReplace;
		char character;
		char newCharacter;
		char characterToRemove;
		boolean characterIsReplaced = false;
		int i;

		Scanner keyboard = new Scanner(System.in); // Scanner that allows for user input

		// Prompt for the user to enter a string that will be manipulated depending on
		// the command inputted
		System.out.println("Enter the string to be manipulated");
		originalString = keyboard.nextLine();
		// A Do While loop that encompasses a series of nested loops and decision if
		// else and else if statements
		// depending on the user inputted command
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine(); // Series of commands that manipulate the string input

			if (command.equalsIgnoreCase("reverse")) { // Decision statement and while loop that alters the String that
														// was inputted
				i = originalString.length(); // by reversing the word and changingit to a new string variable so that
				newString = ""; // if the user wanted to reverse the string back they can

				while (i > 0) {
					i--; // counter for the loop to take affect
					character = originalString.charAt(i);
					newString = (newString + character);
				}
				originalString = newString;
				System.out.println("The new sentence is: " + originalString); // print line statement that outputs the
																				// reversed word

			} else if (command.equalsIgnoreCase("replace first")) { // Command that replaces the first instance of a
																	// letter that was inputted by user
				System.out.println("Enter the character to replace");// Prompt for the user to enter a character they
																		// want to replace
				characterReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character"); // Prompt for the user to input the new character the
																// want to exchange their string with
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				i = 0;
				characterIsReplaced = false; // boolean declared variable
				// While loop that replaces the first letter string value that was entered and
				// exchanges it with the new character desired by user
				while (i < originalString.length() && characterIsReplaced == false) {
					if (originalString.charAt(i) == characterReplace) {
						characterIsReplaced = true;
					}
					i++; // counter to ensure the loop repeats if the user wants to replace again
				}

				if (characterIsReplaced == false) { // A decision statement error in case the user tried to enter a
													// letter that was not in the word inputted
					System.out.println("The letter was not found in the word");
				} else { // Rest of decision statement if the boolean is true, it prints the desired
							// result change
					originalString = originalString.substring(0, i - 1) + newCharacter + originalString.substring(i);
					System.out.println("The new sentence is: " + originalString);
				}

			} else if (command.equalsIgnoreCase("replace last")) { // Command that replaces the last character in the
																	// word that user wants to alter
				characterIsReplaced = false; // Boolean declared as false to allow for error case or desired output
				System.out.println("Enter the character to replace"); // Prompt for the user to enter a character they
																		// want to replace
				characterReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");// Prompt for the user to input the new character the want
																// to exchange their string with
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				int occurrence = 0;
				i = 0;
				while (i < originalString.length()) { // While loop that takes the last occurrence of the letter and
														// exchanges it with desired one
					if (originalString.charAt(i) == characterReplace) {
						occurrence++;
						occurrence = i;
						characterIsReplaced = true; // Decision statement that allows this loop to continue unless
													// boolean is false
					}

					i++;
				}
				if (characterIsReplaced == false) { // Error case made if user tries to replace a letter when it does
													// not show up in the word that was inputted
					System.out.println("The letter was not found in the word");
				} else { // If this is not the case the system will output the word that has the
							// character replaced
					originalString = originalString.substring(0, occurrence) + newCharacter
							+ originalString.substring(occurrence + 1);
					System.out.println("The new sentence is: " + originalString);
				}
			}

			else if (command.equalsIgnoreCase("remove all")) { // Command that removes all instances of the character
																// that comes up in the inputted Strings
				boolean characterIsRemoved = false; // Boolean that is declared false
				i = 0;
				newString = "";
				System.out.println("Enter character to remove"); // Prompt for the user to select a remove
				characterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				while (i < originalString.length()) { // While loop that removes the indicated letter that user wants to
														// remove if boolean is true
					if (characterToRemove != originalString.charAt(i)) { // Decision Statement that combines the new
																			// String with altered original String
						newString = newString + originalString.charAt(i);
					} else if (characterToRemove == originalString.charAt(i)) {
						characterIsRemoved = true;
					}
					i++; // Counter for the loop to potentially repeat
				}
				if (characterIsRemoved) { // Error case decision statement made so that if user wants to remove a letter
											// that does not exist in the word
					originalString = newString;
					System.out.println("The new sentence is: " + originalString); // Print line that outputs new
																					// sentence structure
				} else {
					System.out.println("Error: the character you are trying to remove does not exist"); // Print line
																										// error case
				}

			} else if (command.equalsIgnoreCase("remove")) { // Command that user input's that remove's a single
																// character instead of every instance of the character
																// like remove all
				// initializing the variable for the number of times the character the user
				// wants to remove has shown up in the string
				boolean characterIsRemoved = false;
				int occurrenceOfCharacter = 0;
				System.out.println("Enter character to remove");
				characterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + characterToRemove
						+ " you would like to remove (Not the index - 1 = 1st,2 = 2nd, etc.):");
				int occurrenceToRemove = keyboard.nextInt();
				keyboard.nextLine();
				i = 0;
				// loop ends when we have reached the specified occurrence of the character the
				// user wants to remove
				while (i < originalString.length() && occurrenceOfCharacter != occurrenceToRemove) {
					// when the character in originalString at this point in the iteration is the
					// character the user wants to remove
					if (originalString.charAt(i) == characterToRemove) {
						// increment when the occurrence does not equal the occurrence specified by user
						characterIsRemoved = true;
						occurrenceOfCharacter++;
					}
					i++;
				}
				if (occurrenceOfCharacter != occurrenceToRemove) { // Error case made if the letter is not in the word
					System.out.println("Error: the letter you are tryng to remove does not exist");

				} else if (characterIsRemoved) { // If character is removed successfully this line will print
					originalString = originalString.substring(0, i - 1) + originalString.substring(i);
					System.out.println("The new sentence is: " + originalString);
				} else {
					System.out.println("The letter was not found in the word"); // Error case made if the letter is not
																				// in the word
				}

			} else if (command.equalsIgnoreCase("quit")) { // Command that quits the program
				System.exit(0);
			}

			else {
				System.out.println("Invalid command"); // print line that outputs if command entered is not one of the
														// six program is capable of doing
			}
		} while (!(command.equalsIgnoreCase("quit")));

		keyboard.close(); // User's keyboard input closed
	}

}
	
		
