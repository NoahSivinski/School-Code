/*
 * StringFun.java
 * Author:  Zachary Krausman 
 * Submission Date:  19 March 2021
 *
 * Purpose: A project that allows the user to modify a string they submit by reversing, removing, or replacing
 * characters with new ones.
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

		// Variable Declarations
		String manipulatedStr = "";
		String manipulatedStrCpy = ""; // Copy of original string to be manipulated
		String strCommand = "";
		boolean run = true; // boolean for entire program's loop
		char replaceThis = 'w';
		char replaceWith = 'x';
		char removeThis = 'y';
		int removeNumber = 'z';

		// Set up Scanner
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for a string to be manipulated
		System.out.println("Enter the string to be manipulated");
		manipulatedStr = keyboard.nextLine();

		// Loop for all the changes on the String
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			strCommand = keyboard.nextLine();

			// Reverse String Command
			if (strCommand.equalsIgnoreCase("reverse")) {
				for (int i = manipulatedStr.length() - 1; i >= 0; i--) {
					manipulatedStrCpy = manipulatedStrCpy + manipulatedStr.charAt(i);
				}
				System.out.println("The new sentence is: " + manipulatedStrCpy);
				manipulatedStr = manipulatedStrCpy; // these two lines clear the variables so they can modify the string
				manipulatedStrCpy = ""; // without tripping over themselves
			}
			// Replace First Command
			else if (strCommand.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				replaceThis = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replaceWith = keyboard.nextLine().charAt(0);
				boolean found = false;
				for (int i = 0; i < manipulatedStr.length(); i++) {
					if ((manipulatedStr.charAt(i) == replaceThis) && (found == false)){ // found letter, so moves to replace
						manipulatedStrCpy = manipulatedStrCpy + replaceWith; // appending string
						found = true;
					}
					else {
						manipulatedStrCpy = manipulatedStrCpy + manipulatedStr.charAt(i);
					}
				}
				if (found == false){
					System.out.println("The letter was not found in the word");
				}
				else {
					System.out.println("The new sentence is: " + manipulatedStrCpy);
				}
				manipulatedStr = manipulatedStrCpy;
				manipulatedStrCpy = "";
			}
			// Replace Last Command
			else if (strCommand.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				replaceThis = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replaceWith = keyboard.nextLine().charAt(0);
				boolean found = false;
				for (int i = manipulatedStr.length() - 1; i >= 0; i--) {
					if ((manipulatedStr.charAt(i) == replaceThis) && (found == false)){ // found letter, so moves to replace
						manipulatedStrCpy = replaceWith + manipulatedStrCpy; // prepending string characters in reverse because we go through them in reverse
						found = true;
					}
					else {
						manipulatedStrCpy = manipulatedStr.charAt(i) + manipulatedStrCpy;
					}
				}
				if (found == false){
					System.out.println("The letter was not found in the word");
				}
				else {
					System.out.println("The new sentence is: " + manipulatedStrCpy);
				}
				manipulatedStr = manipulatedStrCpy;
				manipulatedStrCpy = "";
			}
			// Remove all
			else if (strCommand.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeThis = keyboard.nextLine().charAt(0);
				for (int i = 0; i < manipulatedStr.length(); i++) {
					if (!(manipulatedStr.charAt(i) == removeThis)){
						manipulatedStrCpy = manipulatedStrCpy + manipulatedStr.charAt(i);
					}
				}
				if (manipulatedStr.equals(manipulatedStrCpy)) { // if they equal, that means no change found so the letter doesn't exist
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					System.out.println("The new sentence is: " + manipulatedStrCpy);
				}
				manipulatedStr = manipulatedStrCpy;
				manipulatedStrCpy = "";
			}
			// Remove
			else if (strCommand.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				removeThis = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + removeThis
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				removeNumber = keyboard.nextInt();
				keyboard.nextLine(); // clears up the nextInt from reading too far
				int letterCounter = 0;
				for (int i = 0; i < manipulatedStr.length(); i++) {
					if (manipulatedStr.charAt(i) == removeThis){
						letterCounter++;
						if (!(letterCounter == removeNumber)) {
							manipulatedStrCpy = manipulatedStrCpy + manipulatedStr.charAt(i);						}
					}
					else {
						manipulatedStrCpy = manipulatedStrCpy + manipulatedStr.charAt(i);
					}
				}
				if (manipulatedStr.equals(manipulatedStrCpy)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					System.out.println("The new sentence is: " + manipulatedStrCpy);
				}
				manipulatedStr = manipulatedStrCpy;
				manipulatedStrCpy = "";
			}
			// Exits out of Commands
			else if (strCommand.equalsIgnoreCase("quit")) {
				run = false;
			}
			else {
				System.out.println("Make sure you spelled everything correctly and don't have extra spaces in your command!");
			}
		}
		while (run == true);
		keyboard.close();
		System.exit(1);
	}

}
