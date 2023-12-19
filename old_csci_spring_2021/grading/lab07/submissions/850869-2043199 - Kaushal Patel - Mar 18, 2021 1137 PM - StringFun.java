/*
 * StringFun.java
 * Author: Kaushalkumar A. Patel
 * Submission Date: 03-18-21
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * In this program, the user can enter a sentence (as a string) and then 
 * manipulate that string using 5 basic commands. These manipulations will 
 * affect the successive commands that they make.
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

		// User enters the string to be manipulated
		System.out.println("Enter the string to be manipulated");
		String original = keyboard.nextLine();

		// While-loop
		boolean status = true;
		while (status) {

			// Receive command from user
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = keyboard.nextLine();

			// if the user enters quit, then the program exits
			if (command.equalsIgnoreCase("quit")) {
				status = false;
			}

			// The reverse command
			else if (command.equalsIgnoreCase("reverse")) {
				String reverse = "";
				for (int i = original.length() - 1; i >= 0; i--) {
					reverse += original.charAt(i);
				}

				System.out.println("The new sentence is: " + reverse);

			}

			// Replace first command
			else if (command.equalsIgnoreCase("replace first")) {

				// Prompt user for character to replace
				System.out.println("Enter the character to replace");
				char oldChar = keyboard.nextLine().charAt(0);

				// Prompt user to enter the new character
				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);

				// Replace instances of oldChar
				String temp = "";
				boolean notFound = true;
				for (int i = 0; i < original.length(); i++) {
					if (original.charAt(i) == oldChar) { // Check if old character
						temp += newChar;
						notFound = false;
					} else {
						temp += original.charAt(i);
					}
				}

				// Checks to see if letter the user wants to replace exists
				if (notFound == true) {
					System.out.println("The letter was not found in the word");
				} else {
					original = temp;
					System.out.println("The new sentence is: " + original);
				}
			}

			// Replace last command
			else if (command.equalsIgnoreCase("replace last")) {

				// Prompt user for character to replace
				System.out.println("Enter the character to replace");
				char oldChar = keyboard.nextLine().charAt(0);

				// Prompt user for new character
				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);

				// Replace all instances of old character
				String temp = "";
				boolean notFound = true;
				for (int i = 0; i < original.length(); i++) {
					if (original.charAt(i) == oldChar) {
						temp += newChar;
						notFound = false;
					} else {
						temp += original.charAt(i);
					}
				}

				// Checks to see if letter the user wants to replace exists
				if (notFound == true) {
					System.out.println("The letter was not found in the word");
				} else {
					original = temp;
					System.out.println("The new sentence is: " + original);
				}
			}

			// Remove all command
			else if (command.equalsIgnoreCase("remove all")) {

				// Receives the character to remove
				System.out.println("Enter the character to remove");
				char removeChar = keyboard.nextLine().charAt(0);

				// Removes all instances of the character to be removed
				String temp = "";
				for (int i = 0; i < original.length(); i++) {

					if (original.charAt(i) == removeChar) {
						continue;
					} else {
						temp += original.charAt(i);
					}

				}

				// Checks to see if the letter the user wants to replace exists
				if (original.equals(temp)) {
					System.out.println("The letter was not found in the word");
				} else {
					original = temp;
					System.out.println("The new sentence is: " + original);

				}
			}

			// Remove command
			else if (command.equalsIgnoreCase("remove")) {

				// Prompt user for character to remove
				System.out.println("Enter the character to replace to remove");
				char oldChar = keyboard.nextLine().charAt(0);

				// Prompt user for specific instance to remove
				System.out.println(
						"Enter the " + oldChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");

				char rawInput = keyboard.nextLine().charAt(0);
				int instance = 0;
				if (Character.isDigit(rawInput)) {
					instance = Character.getNumericValue(rawInput);
				} else {
					System.out.println("Error: invalid integer");
					continue;
				}

				// Replace specific instance of old character
				String temp = "";
				int charNo = 1;
				boolean notFound = true;
				for (int i = 0; i < original.length(); i++) {
					if (original.charAt(i) == oldChar) {
						if (instance == charNo) {
							notFound = false;
						} else {
							temp += original.charAt(i);
							charNo++;
						}
					} else {
						temp += original.charAt(i);
					}
				}

				// Check to see if the letter the user wants to replace exists
				if (notFound == true) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					original = temp;
					System.out.println("The new sentence is: " + original);
				}
			}
		}
	}
}