/*
 * [StringFun].java
 * Author:  [Ethan Delamater]
 * Submission Date:  [3/19/2021]
 *
 * Purpose: Gets a string from the user and prompts them to select one of 6 
 * options to manipulate the string. Outputs the option the user selected
 * and edits the string to their preference.
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

		Scanner input = new Scanner(System.in); // establishing scanner

		System.out.println("Enter the string to be manipulated"); // getting string from user
		String userString = input.nextLine();
		for (int looper = 0; looper == 0;) { // makes sure the loop will continuously run
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)"); // gives
			// the
			// user
			// options
			// to
			// use
			String userInput = input.nextLine();

			if (userInput.equalsIgnoreCase("reverse")) { // if the user selects reverse
				String setUserString = userString; // setUserString is set as the base string inputted by the user
				userString = "";
				for (int count = setUserString.length(); count > 0; count--) {
					userString += setUserString.charAt(count - 1); // creating the new sentence
				}
				System.out.println("The new sentence is: " + userString); // printing the new sentence for the user
			}

			else if (userInput.equalsIgnoreCase("replace first")) { // if the user selects replace first
				System.out.println("Enter the character to replace");
				String replace = input.nextLine(); // the character the user wants to replace
				char replaceChar = replace.charAt(0); // converts the string to the actual character
				System.out.println("Enter the new character");
				String replacement = input.nextLine(); // getting the new character the user wants
				char replacementChar = replacement.charAt(0);
				String setUserString = userString;
				for (int count = 0; count < userString.length(); count++) { // the program looks for the specific
					// character selected by the user
					if (userString.charAt(count) == replaceChar) {
						userString = userString.substring(0, count) + replacementChar + userString.substring(count + 1);
						System.out.println("The new sentence is: " + userString);
						count = userString.length();
					}
				}
				if (userString == setUserString) { // if the character the user is trying to replace is not located,
					// this message is displayed
					System.out.println("The letter was not found in the word");
				}
			}

			else if (userInput.equalsIgnoreCase("replace last")) { // if the user selects replace last
				System.out.println("Enter the character to replace");
				String replace = input.nextLine();
				char replaceChar = replace.charAt(0);
				System.out.println("Enter the new character");
				String replacement = input.nextLine();
				char replacementChar = replacement.charAt(0);
				String setUserString = userString;
				for (int count = userString.length() - 1; count > 0; count--) { // makes sure the program starts at the
					// end rather than in the beginning
					if (userString.charAt(count) == replaceChar) {
						userString = userString.substring(0, count) + replacementChar + userString.substring(count + 1);
						System.out.println("The new sentence is: " + userString);
						count = 0;
					}
				}
				if (userString == setUserString) {
					System.out.println("The letter was not found in the word");
				}
			}

			else if (userInput.equalsIgnoreCase("remove")) { // if the user selects remove
				System.out.println("Enter the character to remove");
				String remove = input.nextLine();
				char removeChar = remove.charAt(0);
				System.out.println(
						"Enter the " + remove + " you would like to remove (Not the index -1 = 1st, 2 = 2nd, etc.):");
				int charCount = 0;
				int charToRemove = input.nextInt();
				String setUserString = userString;
				input.nextLine();
				for (int count = 0; count < userString.length(); count++) {
					if (userString.charAt(count) == removeChar) {
						charCount++; // counts how many times the character appears
					}
					if (charCount == charToRemove) {
						userString = userString.substring(0, count) + userString.substring(count + 1);
						System.out.println("The new sentence is: " + userString);
						count = userString.length();
					}
				}
				if (userString == setUserString) {
					System.out.println("The letter was not found in the word");
				}
			}

			else if (userInput.equalsIgnoreCase("remove all")) { // if the user selects remove all
				System.out.println("Enter the character to remove");
				String remove = input.nextLine();
				char removeChar = remove.charAt(0);
				String setUserString = userString;
				for (int count = 0; count < userString.length(); count++) {
					if (userString.charAt(count) == removeChar) {
						userString = userString.substring(0, count) + userString.substring(count + 1);
						count--; // decreasing the count so an iteraton is not skipped
					}
				}
				if (userString != setUserString) { // guarantees that the sentence was changed
					System.out.println("The new sentence is: " + userString);
				}
				if (userString == setUserString) { //
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			} else if (userInput.equalsIgnoreCase("quit")) {
				System.exit(0);
			} else { // if one of the 6 commands is not chosen, this error message is displayed
				System.out.println("Invalid command");
			}

		}

	}
}
