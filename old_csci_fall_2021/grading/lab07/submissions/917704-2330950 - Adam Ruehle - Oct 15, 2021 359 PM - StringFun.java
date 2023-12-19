/*
 * CSCI 1301.java
 * Author:  Adam Ruehle
 * Submission Date:  October 15, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The purpose of this program is to allow the user to enter a
 * sentence, manipulate that string using 5 commands, and continue
 * to do so until the user quits the program.
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

		// Retrieve Input
		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		String inputString = keyboard.nextLine();
		String newSentence = "";

		String manipulation = "";
		while (!manipulation.equalsIgnoreCase("quit")) {

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			manipulation = "";
			while (manipulation.equals("")) {
				manipulation = keyboard.nextLine();
			}
			boolean validCommand = true;

			// Reverse
			if (manipulation.equalsIgnoreCase("reverse")) {
				newSentence = "";
				for (int i = inputString.length(); i > 0; i--) {
					char character = inputString.charAt(i - 1);
					newSentence = newSentence + character;
				}
			}

			// Replace First
			else if (manipulation.equalsIgnoreCase("Replace First")) {
				newSentence = "";
				System.out.println("Enter the character to replace");
				String character = keyboard.nextLine().substring(0, 1);
				System.out.println("Enter the new character");
				String replacement = keyboard.nextLine().substring(0, 1);
				for (int i = 0; i < inputString.length(); i++) {
					String comparison = inputString.substring(i, i + 1);
					if (comparison.equals(character)) {
						String firstPart = inputString.substring(0, i);
						String lastPart = inputString.substring(i + 1, inputString.length());
						newSentence = firstPart + replacement + lastPart;
						i = inputString.length();
					}
				}
			}

			// Replace Last
			else if (manipulation.equalsIgnoreCase("Replace Last")) {
				newSentence = "";
				System.out.println("Enter the character to replace");
				String character = keyboard.nextLine().substring(0, 1);
				System.out.println("Enter the new character");
				String replacement = keyboard.nextLine().substring(0, 1);
				for (int i = inputString.length() - 1; i >= 0; i--) {
					String comparison = inputString.substring(i, i + 1);
					if (comparison.equals(character)) {
						String firstPart = inputString.substring(0, i);
						String lastPart = inputString.substring(i + 1, inputString.length());
						newSentence = firstPart + replacement + lastPart;
						i = -1;
					}
				}
			}

			// Remove All
			else if (manipulation.equalsIgnoreCase("Remove All")) {
				newSentence = "";
				System.out.println("Enter the character to remove");
				char character = keyboard.nextLine().charAt(0);
				for (int i = 0; i < inputString.length(); i++) {
					char comparison = inputString.charAt(i);
					if (character != comparison) {
						newSentence = newSentence + comparison;
					}
				}
			}

			// Remove
			else if (manipulation.equalsIgnoreCase("Remove")) {
				newSentence = "";
				System.out.println("Enter the character to remove");
				char character = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + character
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int characterNumber = keyboard.nextInt();
				int count = 0;
				for (int i = 0; i < inputString.length(); i++) {
					char comparison = inputString.charAt(i);
					if (comparison != character) {
						newSentence = newSentence + comparison;
					} else {
						count++;
						if (count != characterNumber) {
							newSentence = newSentence + comparison;
						}
					}
				}
			}

			// Quit
			else if (manipulation.equalsIgnoreCase("quit")) {
				System.exit(0);
			}

			// Invalid Command
			else {
				System.out.println("Command invalid. Try again");
				validCommand = false;
			}

			// Print
			if (validCommand && newSentence.equals(inputString)) {
				System.out.println("The letter was not found in the word");
			} else if (validCommand) {
				System.out.println("The new sentence is: " + newSentence);
			}

			// Make Input Current Output
			inputString = newSentence;
		}
	}
}
