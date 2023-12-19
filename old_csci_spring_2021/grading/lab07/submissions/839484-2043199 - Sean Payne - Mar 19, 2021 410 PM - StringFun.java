
/*
 * StringFun.java
 * Author:  Sean Payne 
 * Submission Date:  03/19/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *     This program takes a user inputed string and manipulates it in different ways.
 * The user chooses how their string is manipulated and the program then executes manipulation.
 * The user also chooses when to quit the program by simply typing quit. Manipulated strings
 * and original strings are displayed for user knowledge. 
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

		// variable declaration
		String userString, command, manipulatedString, manipulationLast;
		char replaced, replacing, removeAll, remove;
		int removeLocation;

		// scanner & string input
		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		userString = keyboard.nextLine();

		// manipulation loop
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			manipulatedString = "";
			manipulationLast = "";
			if (!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first")
					&& !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all")
					&& !command.equalsIgnoreCase("remove") && !command.equalsIgnoreCase("quit")) {
				System.out.println(
						"Please enter one of the commands (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}

			// this reverses given string
			if (command.equalsIgnoreCase("reverse")) {
				for (int reverse = (userString.length() - 1); reverse > -1; reverse--) {
					manipulatedString += userString.charAt(reverse);
				}
				userString = manipulatedString;
				System.out.println("The new sentence is: " + userString);
			}

			// first character that matches to a new character gets replaced
			if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				replaced = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacing = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replaceF = 0; replaceF < userString.length(); replaceF++) {
					if (indexOfSearch < 0 && replaced == userString.charAt(replaceF)) {
						manipulatedString += replacing;
						indexOfSearch = replaceF;
					} else {
						manipulatedString += userString.charAt(replaceF);
					}
				}
				if (manipulatedString.equals(userString)) {
					System.out.println("The letter was not found in the word");
				} else {
					userString = manipulatedString;
					System.out.println("The new sentence is: " + userString);
				}

			}

			// replaces last character that matches to a new character
			if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				replaced = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacing = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replaceF = (userString.length() - 1); replaceF > -1; replaceF--) {
					if (indexOfSearch < 0 && replaced == userString.charAt(replaceF)) {
						manipulatedString += replacing;
						indexOfSearch = replaceF;
					} else {
						manipulatedString += userString.charAt(replaceF);
					}
				}

				for (int reverse = (userString.length() - 1); reverse > -1; reverse--) {
					manipulationLast += manipulatedString.charAt(reverse);
				}

				if (manipulationLast.equals(userString)) {
					System.out.println("The letter was not found in the word");
				} else {
					userString = manipulationLast;
					System.out.println("The new sentence is: " + userString);
				}

			}

			// removes all instances of the character from the string
			if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeAll = keyboard.next().charAt(0);
				keyboard.nextLine();

				for (int r = 0; r < userString.length(); r++) {
					if (removeAll != userString.charAt(r)) {
						manipulatedString += userString.charAt(r);
					}

				}
				if (manipulatedString.equals(userString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					userString = manipulatedString;
					System.out.println("The new sentence is: " + userString);
				}

			}

			// an instance of a specific character is removed
			if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				remove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println(
						"Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				removeLocation = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;

				for (int r = 0; r < userString.length(); r++) {
					if (remove != userString.charAt(r))
						manipulatedString += userString.charAt(r);
					else {
						count++;
						if (count != removeLocation)
							manipulatedString += userString.charAt(r);
					}

				}
				if (manipulatedString.equals(userString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					userString = manipulatedString;
					System.out.println("The new sentence is: " + userString);
				}

			}

		} while (!command.equalsIgnoreCase("quit")); // quits program when user types quit

		System.out.println("...Execution Ends...");
		keyboard.close();
	}

}
