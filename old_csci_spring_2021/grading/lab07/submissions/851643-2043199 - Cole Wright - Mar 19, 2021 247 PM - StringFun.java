/*
 * StringFun.java

 * Author: Cole Wright 
 * Submission Date:  3/19/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This code takes an input from a user and can do a variety of things to change/edit the sentence. It can reverse the input,
 * replace a specific character, (can replace the first or last instance of the character), can remove all instances of a specific
 * character, and can remove a specific character (user chooses which instance of the character is removed). After the user is done
 * editing the sentence, they can quit and end the program.
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
		System.out.println("Enter the string to be manipulated");
		String userInput = keyboard.nextLine();
		String newStr = "";

		while (true) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = keyboard.nextLine();

			if (command.equalsIgnoreCase("reverse")) {
				newStr = "";
				for (int i = userInput.length() - 1; i >= 0; i--) {
					newStr = newStr + userInput.charAt(i);
				}

				System.out.println("The new sentence is: " + newStr);

			} else if (command.equalsIgnoreCase("replace first")) {
				newStr = "";
				System.out.println("Enter the character to replace");
				String replaced = keyboard.nextLine();
				char replacedChar = replaced.charAt(0);
				System.out.println("Enter the new character");
				String newString = keyboard.nextLine();
				char newChar = newString.charAt(0);
				newStr = userInput;
				for (int i = 0; i < userInput.length(); i++) {
					if (userInput.charAt(i) == replacedChar) {
						newStr = userInput.substring(0, i) + newChar + userInput.substring(i + 1);
						System.out.println("The new sentence is: " + newStr);
						i = newStr.length();
					}
				}
				if (userInput == newStr) {
					System.out.println("The letter was not found in the word");
				}

			} else if (command.equalsIgnoreCase("replace last")) {
				newStr = "";
				System.out.println("Enter the character to replace");
				String replaced = keyboard.nextLine();
				char replacedChar = replaced.charAt(0);
				System.out.println("Enter the new character");
				String newString = keyboard.nextLine();
				char newChar = newString.charAt(0);
				newStr = userInput;
				for (int i = userInput.length() - 1; i > 0; i--) {
					if (userInput.charAt(i) == replacedChar) {
						newStr = userInput.substring(0, i) + newChar + userInput.substring(i + 1);
						System.out.println("The new sentence is: " + newStr);
						i = 0;

					}
				}

				if (userInput == newStr) {
					System.out.println("The letter was not found in the word");

				}

			} else if (command.equalsIgnoreCase("remove")) {
				newStr = "";
				System.out.println("Enter the character to remove");
				char charToBeRemoved = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + charToBeRemoved
						+ " you would like to remove (Note the index - 1 = 1st, 2 = 2nd, etc.):");
				int indexToBeRemoved = keyboard.nextInt();

				int count = 0;
				for (int i = 0; i <= userInput.length() - 1; i++) {
					if (userInput.charAt(i) == charToBeRemoved) {
						count += 1;
						if (indexToBeRemoved != count) {
							newStr = newStr + userInput.charAt(i);
						}
					} else {
						newStr = newStr + userInput.charAt(i);
					}
				}
				if (newStr.contentEquals(userInput)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
					keyboard.nextLine();
				} else {
					System.out.println("The new sentence is: " + newStr);
					keyboard.nextLine();
				}

			} else if (command.equalsIgnoreCase("remove all")) {
				newStr = "";
				System.out.println("Enter the character to remove");
				char charToBeRemoved = keyboard.nextLine().charAt(0);
				for (int i = 0; i <= userInput.length() - 1; i++) {
					if (userInput.charAt(i) != charToBeRemoved) {
						newStr = newStr + userInput.charAt(i);

					}

				}
				if (newStr.contentEquals(userInput)) {
					System.out.println("Error: the letter you are trying to remove does not exist");

				} else {
					System.out.println("The new sentence is: " + newStr);

				}
			}

			else if (command.equalsIgnoreCase("quit")) {
				System.out.println("...Execution Ends...");
				System.exit(0);

			} else {
				System.out.println("Invalid command, try again");
			}

			userInput = newStr;

		}
	}
}
