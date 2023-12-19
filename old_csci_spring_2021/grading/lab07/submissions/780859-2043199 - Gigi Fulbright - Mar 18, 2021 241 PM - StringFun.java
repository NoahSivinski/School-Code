
/**
 * StringFun.java
 * Author:  Jordyn Fulbright
 * Submission Date:  March 19th
 *
 * Purpose: This program allows the user to manipulate a string variable in multiple 
 * different ways, including reversing the string, replace the first instance of a 
 * letter with a new letter, replacing the last instance of a letter with a new
 * letter, removing all instances of one letter from a string, and removing specific 
 * instances of a letter from a string. Once the user modifies the string, the string
 * remains modified, even as they continue to add modifications.
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

		//Check indentations before submission

		Scanner keyboard = new Scanner(System.in);
		//declaring variables for users command and the users sentence to be manipulated
		String userCommand;
		String userInput;
		System.out.println("Enter the string to be manipulated");
		userInput = keyboard.nextLine();
		int inputLength;
		boolean programContinue = true; //only changes to false if the user commands "Quit"
		String newString = "";

		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			userCommand = keyboard.nextLine();
			// changes the length each time the loop goes through and modifies the string
			inputLength = userInput.length();

			// Reverse 
			if (userCommand.equalsIgnoreCase("reverse")) {
				//empty string to hold modified string before reassigning it to userInput
				newString = "";
				System.out.print("The new sentence is: ");
				
				while ((inputLength > 0)) {
					System.out.print(userInput.charAt(inputLength - 1));
					newString += userInput.charAt(inputLength - 1);
					inputLength = inputLength - 1;
				}
				System.out.println(""); //keeps the outputs in line
				userInput = newString;
			}

			// Replace First
			else if (userCommand.equalsIgnoreCase("replace first")) {
				char letterToReplace;
				char replaceWith;
				boolean replacedOnce = false;
				System.out.println("Enter the character to replace");
				letterToReplace = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				replaceWith = keyboard.next().charAt(0);
				keyboard.nextLine(); // discards the enter after the first keyboard.nextLine() in the beginning of the do loop
				newString = "";
				boolean letterNotFound = true;

				for (int i = 0; i < inputLength; i++) {

					if (userInput.charAt(i) == letterToReplace) {
						letterNotFound = false;
						if (replacedOnce == false) {
							replacedOnce = true;
							newString += replaceWith; 
						} else {
							newString += userInput.charAt(i); 
						}

					} else {
						newString += userInput.charAt(i); 
					}
				}
				if (letterNotFound) {
					System.out.println("The letter was not found in the word.");
				} else {
					userInput = newString; // Making sure that the new string is held in a variable.
					System.out.print("The new sentence is: " + userInput);
					System.out.println(""); // To keep everything in line
				}
			}

			// replace last
			else if (userCommand.equalsIgnoreCase("replace last")) {
				newString = "";
				//variables to hold letter desired to replace and what letter to replace it with
				char letterToReplaceLast;
				char replaceLastWith;
				boolean replacedLastOnce = false;
				boolean letterNotFound = true;
				System.out.println("Enter the character to replace");
				letterToReplaceLast = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				replaceLastWith = keyboard.next().charAt(0);
				keyboard.nextLine(); // discards the enter after the first keyboard.nextLine() in the beginning of the do loop

				while (inputLength > 0) {
					newString += userInput.charAt(inputLength - 1);
					inputLength = inputLength - 1;
				}
				userInput = newString;
				inputLength = userInput.length();
				newString = ""; //emptying new string to hold the modified string in this step of replace last
				
				for (int i = 0; i < inputLength; i++) {
					if (userInput.charAt(i) == letterToReplaceLast) {
						letterNotFound = false;
						if (replacedLastOnce == false) {
							replacedLastOnce = true;
							newString += replaceLastWith; // new
						} else {
							newString += userInput.charAt(i); // new
						}
					} else {
						newString += userInput.charAt(i); // new
					}
				}
				if (letterNotFound) {
					System.out.println("The letter was not found in the word.");
				} else {
					userInput = newString;
					inputLength = userInput.length();
					newString = "";
					while (inputLength > 0) {

						newString += userInput.charAt(inputLength - 1);
						inputLength = inputLength - 1;

					}
					userInput = newString;
					System.out.print("The new sentence is: " + userInput);
					System.out.println(""); // To keep everything in line
				}
			}

			// remove all
			else if (userCommand.equalsIgnoreCase("remove all")) {
				char letterToRemove;
				System.out.println("Enter the character to remove");
				letterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.print("\n" + "The new sentence is: ");
				newString = ""; 
				boolean letterNotFound = true;
				
				for (int i = 0; i < inputLength; i++) {
					if (userInput.charAt(i) == letterToRemove) {
						letterNotFound = false;
					} else {
						System.out.print(userInput.charAt(i));
						newString += userInput.charAt(i);
					}
				}
				if (letterNotFound) {
					System.out.println("The letter was not found in the word.");
				} else {
					System.out.println("");
					userInput = newString; // Making sure that the new string is held in a variable.
				}
			}

			// remove 

			else if (userCommand.equalsIgnoreCase("remove")) {
				char lettersToRemove;
				int instanceToRemove;
				System.out.println("Enter the character to remove");
				lettersToRemove = keyboard.next().charAt(0);
				System.out.println("Enter the " + lettersToRemove
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				instanceToRemove = keyboard.nextInt();
				keyboard.nextLine();
				newString = "";
				boolean letterNotFound = true;
				// initializing variable to count number of instances
				int instanceNumber = 0;
				
				for (int i = 0; i < inputLength; i++) {
					if (userInput.charAt(i) == lettersToRemove) {
						instanceNumber += 1;
						if (instanceNumber == instanceToRemove) {
							letterNotFound = false;
						} else {
							newString += userInput.charAt(i);
						}
					} else {
						newString += userInput.charAt(i);
					}
				}
				if (letterNotFound) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					userInput = newString;
					System.out.print("The new sentence is: " + userInput);
					System.out.println("");
				}
			}
			// quit

			else if (userCommand.equalsIgnoreCase("quit")) {
				programContinue = false;
			} 
			//So that the program restarts in case the user accidentally types in an incorrect command
			else {
				
			}

		} while (programContinue); 

		keyboard.close();
	}
}
