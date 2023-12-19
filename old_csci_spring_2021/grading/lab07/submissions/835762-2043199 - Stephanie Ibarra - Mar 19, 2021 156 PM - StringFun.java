/*
 * [StringFun].java
 * Author:  [Stephanie Ibarra] 
 * Submission Date:  [03/19/2021]
 *
 * Purpose: The user enters a sentence and can manipulate
 * it using 5 basic commands, reverse, replace first, replace last, 
 * remove, remove all, and quit. These manipulations will affect the 
 * successive commands that they make.
 *
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
		// declare variables
		String inputedString, command, manipulated, manipulationLast;
		char replaced, replacing, removeall, remove;
		int removeAt;


		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		inputedString = keyboard.nextLine();

		//this is the loop for the manipulation of the string
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			manipulated = "";
			manipulationLast = "";
			if (!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first") && !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all") && !command.equalsIgnoreCase("remove") &&!command.equalsIgnoreCase("quit")) {
				System.out.println("Please enter one of the commands (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}

			if (command.equalsIgnoreCase("reverse")) {
				for (int reverse = (inputedString.length() - 1); reverse > -1; reverse--) {
					manipulated += inputedString.charAt(reverse);
				}
				inputedString = manipulated;
				System.out.println("The new sentence is: " + inputedString);
			}

			if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				replaced = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacing = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replacef = 0; replacef < inputedString.length(); replacef++) {
					if (indexOfSearch < 0 && replaced == inputedString.charAt(replacef)) {
						manipulated += replacing;
						indexOfSearch = replacef;
					}
					else {
						manipulated += inputedString.charAt(replacef);
					}
				}
				if (manipulated.equals(inputedString)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputedString = manipulated;
					System.out.println("The new sentence is: " + inputedString);
				}

			}

			//replaces last character that matches to a new character
			if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				replaced = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacing = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replacef = (inputedString.length() - 1); replacef > -1; replacef--) {
					if (indexOfSearch < 0 && replaced == inputedString.charAt(replacef)) {
						manipulated += replacing;
						indexOfSearch = replacef;
					}
					else {
						manipulated += inputedString.charAt(replacef);
					}
				}

				for (int reverse = (inputedString.length() - 1); reverse > -1; reverse--) {
					manipulationLast += manipulated.charAt(reverse);
				}

				if (manipulationLast.equals(inputedString)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputedString = manipulationLast;
					System.out.println("The new sentence is: " + inputedString);
				}

			}

			if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeall = keyboard.next().charAt(0);
				keyboard.nextLine();


				for (int r = 0; r < inputedString.length(); r++) {
					if (removeall != inputedString.charAt(r)) {
						manipulated += inputedString.charAt(r);
					}

				}
				if (manipulated.equals(inputedString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputedString = manipulated;
					System.out.println("The new sentence is: " + inputedString);
				}

			}

			if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				remove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				removeAt = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;

				for (int r = 0; r < inputedString.length(); r++) {
					if (remove != inputedString.charAt(r))
						manipulated += inputedString.charAt(r);
					else {
						count++;
						if (count != removeAt)
							manipulated += inputedString.charAt(r);
					}

				}
				if (manipulated.equals(inputedString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputedString = manipulated;
					System.out.println("The new sentence is: " + inputedString);
				}

			}

		} while (!command.equalsIgnoreCase("quit"));

		System.out.println("...Execution Ends...");
		keyboard.close();
	}


}


