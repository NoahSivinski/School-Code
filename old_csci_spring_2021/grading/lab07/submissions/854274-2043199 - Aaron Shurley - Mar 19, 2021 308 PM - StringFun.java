/*
 * StringFun.java
 * Author:  Aaron Shurley
 * Submission Date:  3/19/2021
 *
 * Purpose: To take user given string and manipulate it through 
 * given user commands.
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

import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
//stating different strings,characters, booleans, and integers used 
		String originalString;
		String userCommand;
		String newString = "";
		char characterToReplace;
		char character;
		char newCharacter;
		char characterToRemove;
		boolean characterIsReplaced = false;
		int length;
//setting up the keyboard for user input 
		Scanner keyboard = new Scanner(System.in);
//prompting user to input a string
		System.out.println("Enter the string to be manipulated");
		originalString = keyboard.nextLine();
//prompting user  to choose what will happen to the string
		//creating the loop to  process what happens to the string
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			userCommand = keyboard.nextLine();
//creates a statement for when the user chooses to reverse the string
			if (userCommand.equalsIgnoreCase("reverse")) {
				length = originalString.length();
				newString = "";

				while (length > 0) {
					length--;
					character = originalString.charAt(length);
					newString = (newString + character);
				}
				originalString = newString;
				//printing the new string after reversing the orginal string
				System.out.println("The new sentence is: " + originalString);

				//creates a statement for when the user chooses to replace the first  
				// use of a letter in the string
			} else if (userCommand.equalsIgnoreCase("replace first")) {
				//prompting user to select a letter to replace
				System.out.println("Enter the character to replace");
				characterToReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
			//prompting the user to select a letter to replace with the original
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				length = 0;
				characterIsReplaced = false;
				while (length < originalString.length() && characterIsReplaced == false) {
					if (originalString.charAt(length) == characterToReplace) {
						characterIsReplaced = true;
					}
					length++;
				}

				if (characterIsReplaced == false) {
					//output if the selected letter is not found in the string
					System.out.println("The letter was not found in the word");
				} else {
					originalString = originalString.substring(0, length - 1) + newCharacter
							+ originalString.substring(length);
					//printing the new string after a letter has been replaced
					System.out.println("The new sentence is: " + originalString);
				}
				//creates a  statement for when the user chooses to replace the last 
				//use of a character 
			} else if (userCommand.equalsIgnoreCase("replace last")) {
				characterIsReplaced = false;
				//prompting user to select a letter to replace
				System.out.println("Enter the character to replace");
				characterToReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				//prompting the user to select a letter to replace with the original
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				int occurrence = 0;
				length = 0;
				while (length < originalString.length()) {
					if (originalString.charAt(length) == characterToReplace) {
						occurrence++;
						occurrence = length;
						characterIsReplaced = true;
					}

					length++;
				}
				//output if the selected letter is not found in the string
				if (characterIsReplaced == false) {
					System.out.println("The letter was not found in the word");
					//printing the new string after a letter has been replaced
				} else {
					originalString = originalString.substring(0, occurrence) + newCharacter
							+ originalString.substring(occurrence + 1);
					System.out.println("The new sentence is: " + originalString);
				}
			}
			//statement if the user chooses to remove all instances of a character
			else if (userCommand.equalsIgnoreCase("remove all")) {
				boolean characterIsRemoved = false;
				length = 0;
				newString = "";
				//prompts user to select a character to remove
				System.out.println("Enter character to remove");
				characterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				while (length < originalString.length()) {
					if (characterToRemove != originalString.charAt(length)) {
						newString = newString + originalString.charAt(length);
					} else if (characterToRemove == originalString.charAt(length)) {
						characterIsRemoved = true;
					}
					length++;
				}
				
				if (characterIsRemoved) {
					originalString = newString;
					//printing the new string after removing the chosen character
					System.out.println("The new sentence is: " + originalString);
				//output if the character is not present in the string
				} else {
					System.out.println("Error: the character you are trying to remove does not exist");
				}

			} else if (userCommand.equalsIgnoreCase("remove")) {
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
				length = 0;
				// loop ends when we have reached the specified occurrence of the character the
				// user wants to remove
				while (length < originalString.length() && occurrenceOfCharacter != occurrenceToRemove) {
					// when the character in originalString at this point in the iteration is the
					// character the user wants to remove
					if (originalString.charAt(length) == characterToRemove) {
						// increment when the occurrence does not equal the occurrence specified by user
						characterIsRemoved = true;
						occurrenceOfCharacter++;
					}
					length++;
				}
				//output if the character the user chooses is not  in the  string
				if (occurrenceOfCharacter != occurrenceToRemove) {
					System.out.println("Error: the letter you are tryng to remove does not exist");
					//outputing the new string
				} else if (characterIsRemoved) {
					originalString = originalString.substring(0, length - 1) + originalString.substring(length);
					System.out.println("The new sentence is: " + originalString);
				} else {
					System.out.println("The letter was not found in the word");
				}
				//statement for if the user choose quit which will end the program
			} else if (userCommand.equalsIgnoreCase("quit")) {
				System.exit(0);
			}

			// output if the user inputs an unkown command 
			else {
				System.out.println("Invalid command");
			}
		//end of the loop
		} while (!(userCommand.equalsIgnoreCase("quit")));
		// closing the keyboard
		keyboard.close();
	}

}
		