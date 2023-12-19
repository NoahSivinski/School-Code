/*
 * StringFun.java
 * Author:  William Malonda 
 * Submission Date:  March 19, 2021
 *
 * Purpose: The program StringFun.java is a program that manipulates strings. This happens 
 * by first asking the user to input a string and then asking for the user to input a command 
 * from a list of commands to manipulate the string and outputs the manipulated string into 
 * the console. The program then continues to ask the user for commands until the user quits.
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

		Scanner keyboard = new Scanner(System.in);

		// Declaring variables
		String original;
		String command;
		char newCharacter;
		char oldCharacter;
		char removeCharacter;
		char numberToRemove; // Represents the number of the character that is to be removed

		// Asks user to enter a string
		System.out.println("Enter the string to be manipulated");
		original = keyboard.nextLine();

		/*
		 * Loops continuously asking for user commands to modify the string until "quit"
		 * with any capitalization is entered
		 */
		do {
			// Asks user to enter command to manipulate the string
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();

			// If statement for reverse
			if (command.equalsIgnoreCase("reverse")) {

				/*
				 * Declares "reversed" as a string and counts the string backwards to reverse it
				 * and sets it to "reversed"
				 */
				String reversed = "";
				for (int i = original.length() - 1; i >= 0; i--) {
					reversed = reversed + original.charAt(i);
				}
				// Saves the reversed string under "original" and prints out the reversed string
				original = reversed;
				System.out.println("The new sentence is: " + reversed);
			}
			// If statement for replace first
			else if (command.equalsIgnoreCase("replace first")) {

				// Asks user to enter the character to be replaced
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.nextLine().charAt(0);

				// Asks user to enter the character that will replace the old one
				System.out.println("Enter the new character");
				newCharacter = keyboard.nextLine().charAt(0);

				/*
				 * Sets "exists" local value to false to assume that user enters a nonexistent
				 * letter, sets "replaced" to false as replacement hasn't occurred yet
				 */
				Boolean exists = false;
				Boolean replaced = false;
				String replacef = ""; // replacef stands for replace first

				// Begins counting string forwards
				for (int i = 0; i < original.length(); i++) {
					/*
					 * If the character at the current position equals the character that is wanted
					 * to be changed and the variable "replaced" is false, sets "exists" and
					 * "replaced" to true and replaces the first letter for string that the user
					 * inputs
					 */
					if (original.charAt(i) == oldCharacter && replaced == false) {
						exists = true;
						replaced = true;
						original = original.substring(0, i) + newCharacter
								+ original.substring(i + 1, original.length());
					}
				}

				// If letter does not exist in the string, prints an error statement
				if (exists == false) {
					System.out.println("The letter was not found in the word");
				}
				// If letter exists, saves the new string to "original" and prints it out
				else {
					replacef = original;
					System.out.println("The new sentence is: " + replacef);
				}
			}
			// If statement for replace last
			else if (command.equalsIgnoreCase("replace last")) {

				// Asks user to enter the character to be replaced
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.nextLine().charAt(0);

				// Asks user to enter the character that will replace the old one
				System.out.println("Enter the new character");
				newCharacter = keyboard.nextLine().charAt(0);

				/*
				 * Sets "exists" local value to false to assume that user enters a nonexistent
				 * letter, sets "replaced" to false as replacement hasn't occurred yet
				 */
				boolean exists = false;
				boolean replaced = false;
				String replacel = ""; // replacel stands for replace last

				// Begins counting string backwards
				for (int i = original.length() - 1; i > -1; i--) {
					/*
					 * If the character at the current position equals the character that is wanted
					 * to be changed and the variable "replaced" is false, sets "exists" and
					 * "replaced" to true and replaces the last letter for string that the user
					 * inputs
					 */
					if (original.charAt(i) == oldCharacter && replaced == false) {
						exists = true;
						replaced = true;
						original = original.substring(0, i) + newCharacter
								+ original.substring(i + 1, original.length());
					}
				}

				// If letter does not exist in the string, prints an error statement
				if (exists == false) {
					System.out.println("The letter was not found in the word");
				}
				// If letter exists, saves the new string to "original" and prints it out
				else {
					replacel = original;
					System.out.println("The new sentence is: " + replacel);
				}
			}
			// If statement for remove all
			else if (command.equalsIgnoreCase("remove all")) {

				// Asks user to input the character they want to be removed
				System.out.println("Enter the character to remove");
				removeCharacter = keyboard.nextLine().charAt(0);

				/*
				 * Sets "exists" local value to false to assume that user enters a nonexistent
				 * letter,
				 */
				Boolean exists = false;
				String removeAll = "";

				// Begins counting string forward
				for (int i = 0; i < original.length(); i++) {
					/*
					 * If the character at the current position equals the character that is wanted
					 * to be removed, removes character and sets "exists" to true
					 */
					if (original.charAt(i) == removeCharacter) {
						exists = true;
						removeAll = removeAll + "";
					}
					/*
					 * When the character at the current position does not equal the character that
					 * is wanted to be removed, the character is added to "removeAll"
					 */
					else {
						removeAll = removeAll + original.charAt(i);
					}
				}

				// If letter does not exist in the string, prints an error statement
				if (exists == false) {
					System.out.println("The letter was not found in the word");
				}
				// If letter exists, saves the new string to "original" and prints it out
				else {
					original = removeAll;
					System.out.println("The new sentence is: " + removeAll);
				}
			}
			// If statement for remove
			else if (command.equalsIgnoreCase("remove")) {

				// Asks user to input the character they want to be removed
				System.out.println("Enter the character to remove");
				removeCharacter = keyboard.nextLine().charAt(0);

				// Asks user what number of that character they want to be removed
				System.out.println("Enter the " + removeCharacter
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				numberToRemove = keyboard.nextLine().charAt(0);

				int index = 0;

				/*
				 * Checks to see if user input was a number, gets the number and sends it to
				 * index
				 */
				if (Character.isDigit(numberToRemove)) {
					index = Character.getNumericValue(numberToRemove);
				}
				// If user enters a non-number, prints an error message
				else {
					System.out.println("You did not enter a correct charcter or number");
				}

				/*
				 * Sets "exists" local value to false to assume that user enters a nonexistent
				 * letter
				 */
				Boolean exists = false;
				String removeSingle = "";
				int counter = 0;

				// Begins counting string forward
				for (int i = 0; i < original.length(); i++) {
					if (original.charAt(i) == removeCharacter) {
						/*
						 * If character at the current position equals the character wanted to be
						 * removed, adds 1 to the counter and sets "exists" to true
						 */
						counter++;
						exists = true;
						if (counter == index) {
							/*
							 * If the "counter" number equals the "index" number, the character at that
							 * position is removed
							 */
							original = original.substring(0, i) + "" + original.substring(i + 1, original.length());
						}
					}
				}

				// If letter does not exist in the string, prints an error statement
				if (exists == false) {
					System.out.println("The letter was not found in the word");
				}
				// If letter exists, saves the new string to "original" and prints it out
				else {
					removeSingle = original;
					System.out.println("The new sentence is: " + removeSingle);
				}
			}
		} while (!command.equalsIgnoreCase("quit"));

		// If user enters "quit" with any capitalization, the program ends
		if (command.equalsIgnoreCase("quit")) {
			System.exit(0);
		}

		keyboard.close();

	}

}
