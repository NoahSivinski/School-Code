
import java.util.Scanner;

public class StringFun {

	/*
	 * StringFun.java 
	 * Author: Joshua Wyatt 
	 * Submission Date: 3/21/2021
	 *
	 * Purpose: This program is designed to take an input from a user and manipulate
	 * the string as many times as the user wants with the following commands:
	 * reverse, replace first, replace last, remove all, remove, and when they are
	 * finished they may enter in quit in order to stop the program. As stated above
	 * the user can do this as many times as they wish before inputing quit to exit
	 * this program.
	 *
	 * Statement of Academic Honesty:
	 *
	 * The following code represents my own work. I have neither received nor given
	 * inappropriate assistance. I have not copied or modified code from any source
	 * other than the course webpage or the course textbook. I recognize that any
	 * unauthorized assistance or plagiarism will be handled in accordance with the
	 * University of Georgia's Academic Honesty Policy and the policies of this
	 * course. I recognize that my work is based on an assignment created by the
	 * Department of Computer Science at the University of Georgia. Any publishing
	 * or posting of source code for this assignment is strictly prohibited unless
	 * you have written consent from the Department of Computer Science at the
	 * University of Georgia.
	 */

	public static void main(String[] args) {

		char oldLetter = ' ';
		char newLetter = ' ';

		char theCharacter = ',';
		int theLocation = 0;

		/////////////////////////////////////////////////////////////////////////////

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the string to be manipulated");

		String theString = keyboard.nextLine();
		String newString = "";

		String theCommand = "";

		while (!theCommand.equals("quit")) {

//			user command is inputed

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			theCommand = keyboard.nextLine().toLowerCase();

			if (theCommand.equalsIgnoreCase("reverse")) {
				newString = reverse(theString);
				System.out.println("The new sentence is: " + newString);

//				replace first else if statement

			} else if (theCommand.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				oldLetter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				newLetter = keyboard.nextLine().charAt(0);

				newString = replaceFirst(theString, oldLetter, newLetter);
				System.out.println("The new sentence is: " + newString);

//				replace last else if statement

			} else if (theCommand.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				oldLetter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				newLetter = keyboard.nextLine().charAt(0);

				newString = replaceLast(theString, oldLetter, newLetter);
				System.out.println("The new sentence is: " + newString);

//				remove else if statement

			} else if (theCommand.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				theCharacter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the instance of the character " + theCharacter
						+ " you would like to remove (1 = 1st, 2 = 2nd, etc.):");
				theLocation = keyboard.nextInt();
				keyboard.nextLine();
				newString = remove(theString, theCharacter, theLocation);
				System.out.println("The new sentence is: " + newString);

//				remove all else if statement
			} else if (theCommand.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				theCharacter = keyboard.nextLine().charAt(0);
				newString = removeAll(theString, theCharacter);
				System.out.println("The new sentence is: " + newString);

			} else if (theCommand.equalsIgnoreCase("quit")) {
				System.out.println("...Execution Ends...");
				System.exit(0);

			} // end if

			theString = newString;
		}

	}// end of main method

	// reverse string
	public static String reverse(String theString) {
		int length = theString.length();
		String gnuString = "";

		for (int i = 0; i < length; i++) {
			gnuString = theString.charAt(i) + gnuString;
		}

		return gnuString;
	}

	// replace first occurrence with new character
	public static String replaceFirst(String theString, char oldCharacter, char newCharacter) {
		int length = theString.length();
		String gnuString = "";
		boolean found = false;

		for (int i = 0; i < length; i++) {
			if ((theString.charAt(i) == oldCharacter) & (!found)) {
				found = true;
				gnuString = gnuString + newCharacter;
			} else {
				gnuString = gnuString + theString.charAt(i);
			}

		}

		return gnuString;
	}

	// replace last occurrence with new character
	public static String replaceLast(String theString, char oldCharacter, char newCharacter) {

		int length = theString.length();
		String gnuString = "";
		boolean found = false;

		for (int i = length - 1; i >= 0; i--) {

			if ((theString.charAt(i) == oldCharacter) & (!found)) {
				found = true;
				gnuString = newCharacter + gnuString;

			} else {
				gnuString = theString.charAt(i) + gnuString;
			}
		}

		return gnuString;
	}

// 	removing character from inputed spot in string 
	public static String remove(String aString, char theCharacter, int theInstance) {
		int length = aString.length();

		String gnuString = "";
		int thisInstance = 0;
		for (int i = 0; i < length; i++) {

			if (aString.charAt(i) == theCharacter) { // the character
				thisInstance++; // do nothing

				if (thisInstance == theInstance) { // theInstance!

				} else {
					gnuString = gnuString + aString.charAt(i);
				}

			} else { // not the Character

				gnuString = gnuString + aString.charAt(i);
			}
		}

		return gnuString;
	}

//  removing every instance of a character in inputed string
	public static String removeAll(String aString, char theCharacter) {
		int length = aString.length();
		String gnuString = "";

		for (int i = 0; i < length; i++) {
			if ((aString.charAt(i) == theCharacter)) {
				// gnuString = gnuString + ' ' ; // aString.charAt(i);
				// do nothing
			} else {
				gnuString = gnuString + aString.charAt(i);
			}
		}

		return gnuString;
	}
}
