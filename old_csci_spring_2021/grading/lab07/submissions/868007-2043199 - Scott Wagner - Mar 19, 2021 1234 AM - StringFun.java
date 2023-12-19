/*
 * StringFun.java
 * Author:  Scott Wagner 
 * Submission Date:  3/17/2021
 *
 * Performs basic string manipulations based on predefined user commands.
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

	public static final String CMD_REVERSE = "reverse", CMD_REPLACE_FIRST = "replace first",
			CMD_REPLACE_LAST = "replace last", CMD_REMOVE_ALL = "remove all", CMD_REMOVE = "remove", CMD_QUIT = "quit";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String userString = "", userCommand = "", stringOutcome = "";
		char newChar, charToReplace, charToRemove;
		boolean charReplaced, continueLoop = true, validInput = true;

		int instanceToRemove, instanceCounter = 0;

		System.out.println("Enter the string to be manipulated");
		userString = scan.next();
		userString += scan.nextLine();

		do {
			System.out.println(
					"Enter your command (reverse, replace first, replace last, remove all, " + "remove, quit)");
			userCommand = scan.nextLine();

			// Reverses string.
			if (userCommand.equalsIgnoreCase(CMD_REVERSE)) {

				// Nested loop combs String index backwards to reconstruct it in reverse.
				for (int i = (userString.length() - 1); i >= 0; i--) {

					stringOutcome += userString.charAt(i);
				}
				userString = stringOutcome;
				stringOutcome = "";

				System.out.println("The new sentence is: " + userString);

			}
			// Replaces first instance of character.
			else if (userCommand.equalsIgnoreCase(CMD_REPLACE_FIRST)) {

				System.out.println("Enter the character to replace");
				charToReplace = scan.nextLine().charAt(0);
				System.out.println("Enter the new character");
				newChar = scan.nextLine().charAt(0);

				// Bool to handle invalid input.
				boolean doPosReplaceRestruct = false;

				// Nested loop searches String for char to replace in positive direction.
				for (int i = 0; i <= userString.length() - 1; i++) {
					if (userString.charAt(i) == charToReplace) {
						doPosReplaceRestruct = true;
						stringOutcome = userString.substring(0, i) + newChar + userString.substring(i + 1);
						i = userString.length();
						userString = stringOutcome;
						stringOutcome = "";
						System.out.println("The new sentence is: " + userString);

					}
				}
				// Checks for invalid input.
				if (doPosReplaceRestruct == false) {
					System.out.println("The letter was not found in the word");
				}

				// Replaces last instance of character.
			} else if (userCommand.equalsIgnoreCase(CMD_REPLACE_LAST)) {

				System.out.println("Enter the character to replace");
				charToReplace = scan.nextLine().charAt(0);
				System.out.println("Enter the new character");
				newChar = scan.nextLine().charAt(0);

				// Bool to handle invalid input.
				boolean doNegReplaceRestruct = false;

				// Nested loop searches String for char to replace in negative direction.
				for (int i = (userString.length() - 1); i >= 0; i--) {
					if (userString.charAt(i) == charToReplace) {
						stringOutcome = userString.substring(0, i) + newChar + userString.substring(i + 1);
						i = -1;
						doNegReplaceRestruct = true;
						userString = stringOutcome;
						stringOutcome = "";
						System.out.println("The new sentence is: " + userString);

					}

				} // Checks for invalid input.
				if (doNegReplaceRestruct == false) {
					System.out.println("The letter was not found in the word");
				}

			} else if (userCommand.equalsIgnoreCase(CMD_REMOVE)) {

				instanceCounter = 0;
				System.out.println("Enter the character to remove");
				charToRemove = scan.nextLine().charAt(0);
				System.out.println("Enter the " + charToRemove
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				instanceToRemove = scan.nextInt();
				scan.nextLine();

				// Nested loop that finds and removes selected char instance.
				for (int i = 0; i <= userString.length() - 1; i++) {
					if (userString.charAt(i) == charToRemove) {
						instanceCounter++;
					}
					if (instanceCounter == instanceToRemove) {
						stringOutcome = userString.substring(0, i) + userString.substring(i + 1);
						i = userString.length();
						userString = stringOutcome;
						stringOutcome = "";
						System.out.println("The new sentence is: " + userString);

					}

				}
				if (instanceToRemove > instanceCounter) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}

			} else if (userCommand.equalsIgnoreCase(CMD_REMOVE_ALL)) {

				System.out.println("Enter the character to remove");
				charToRemove = scan.nextLine().charAt(0);

				boolean instancesRemaining = true, doAllRestructure = false;
				do {
					// Nested loop that finds and removes all selected char instances.
					for (int i = 0; i <= userString.length() - 1; i++) {

						if (userString.charAt(i) == charToRemove) {

							stringOutcome = userString.substring(0, i) + userString.substring(i + 1);
							userString = stringOutcome;
							doAllRestructure = true;
							i = 0;

						} else {
							// Inner loop break if no more chars to remove.
							instancesRemaining = false;
						}

					} // Only constructs new String if selected character to remove is in original
						// String.
					if (doAllRestructure == true) {
						userString = stringOutcome;
						stringOutcome = "";
						System.out.println("The new sentence is: " + userString);
					} else {
						System.out.println("Error: the letter you are trying to remove does not exist");
					}
				} while (instancesRemaining == true);

				// Initiates break from master loop.
			} else if (userCommand.equalsIgnoreCase(CMD_QUIT)) {
				continueLoop = false;

			} // Master loop controlling bool.
		} while (continueLoop == true);

		scan.close();

	}
}
