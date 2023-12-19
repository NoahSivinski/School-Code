/*
 * StringFun.java
 * Author:  Vietmy Vo
 * Submission Date:  3/18/2021
 *
 * Purpose: The program takes a string and can either reverse, replace the first or last iteration
 * of a character, remove an instance of a character, and remove all of a certain character.
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

		System.out.println("Enter the string to be manipulated");

		Scanner keyboard = new Scanner(System.in);
		String inputString;
		String method;
		String newString;
		String newestString;

		inputString = keyboard.nextLine();

		do {
			System.out.println("Enter your command(reverse, replace first, replace last, remove all, remove, quit)");
			method = keyboard.nextLine();

			newString = "";
			newestString = "";

			// reverses string
			if (method.equalsIgnoreCase("reverse")) {
				for (int i = inputString.length() - 1; i >= 0; i--) {
					newString = newString + inputString.charAt(i);
				}
				inputString = newString;
				System.out.println("The new sentence is:" + inputString);

			}

			// replaces first character with new one
			if (method.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				char replacedCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				char newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();

				int searchIndex = -1;
				for (int i = 0; i < inputString.length(); i++) {
					if (searchIndex < 0 && replacedCharacter == inputString.charAt(i)) {
						newString = newString + newCharacter;
						searchIndex = i;
					} else {
						newString = newString + inputString.charAt(i);

					}
				}
				if (newString.equals(inputString)) {
					System.out.println("The letter was not found in the word");
				} else {
					inputString = newString;
					System.out.println("The new sentence is:" + inputString);
				}
			}

			// replaces last character with new one
			if (method.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the charater to replace");
				char replacedCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				char newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();

				int searchIndex = -1;
				for (int i = inputString.length() - 1; i > -1; i--) {
					if (searchIndex < 0 && replacedCharacter == inputString.charAt(i)) {
						newString = newString + newCharacter;
						searchIndex = i;
					} else {
						newString = newString + inputString.charAt(i);
					}

				}

				for (int i = inputString.length() - 1; i > -1; i--) {
					newestString = newestString + newString.charAt(i);
				}

				if (newestString.equals(inputString)) {
					System.out.println("The letter was not found in the word");
				} else {
					inputString = newestString;
					System.out.println("The new sentence is:" + inputString);
				}

			}
			// removes a character at a certain instance
			if (method.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char replacedCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + replacedCharacter
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int instance = keyboard.nextInt();
				keyboard.nextLine();

				int happens = 0;
				for (int i = 0; i < inputString.length(); i++) {
					if (replacedCharacter == inputString.charAt(i)) {
						happens = happens + 1;
					}

					if (happens == instance) {
						newString = inputString.substring(0, i) + inputString.substring(i + 1, inputString.length());
						i = inputString.length();
					}

				}

				if (happens < instance) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					inputString = newString;
					System.out.println("The new sentence is:" + inputString);
				}
			}

			// removes all of a certain character by user input
			if (method.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char removeCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();

				for (int i = 0; i < inputString.length(); i++) {
					if (removeCharacter != inputString.charAt(i)) {
						newString = newString + inputString.charAt(i);

					}

				}

				if (newString.equals(inputString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					inputString = newString;
					System.out.println("The new sentence is:" + inputString);

				}
			}

			// quit command
			if (method.equalsIgnoreCase("quit")) {
				System.out.println("...Execution Ends...");
			}
		} 
		while (!method.equalsIgnoreCase("quit"));
		keyboard.close();
	}

}
