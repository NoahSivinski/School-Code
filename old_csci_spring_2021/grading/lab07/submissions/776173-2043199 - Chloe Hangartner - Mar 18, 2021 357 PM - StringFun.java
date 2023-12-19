
/*
 * StringFun.java
 * Author: Chloe Hangartner
 * Submission Date: 18 March 2021
 *
 * Purpose: This lab creates an environment where the user
 * can enter a sentence (as a string) and then manipulate
 * that string using 5 basic commands.
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

		// Declare Variables and Create Keyboard Object
		Scanner keyboard = new Scanner(System.in);
		String stringInput = "", commandChoice = "", reversedString = "", 
				replaceFirstString = "", replaceLastString = "", replaceLastStringFinal = "", removeString = "", removeAllString = "";
		int stringLength, removeCounter, instanceOfCharRemoved;
		char charReplaced, charNew, charRemoved;

		//Prompt User Input
		System.out.println("Enter the string to be manipulated");
		stringInput = keyboard.nextLine();

		// Outer Loop to Run Commands
		do {
			// Prompt for Command
			System.out.println("Enter your command(reverse, replace first, replace last, remove all, remove, quit)");
			commandChoice = keyboard.nextLine();


			// Instantiate Variable Based on User Input
			stringLength = stringInput.length();


			// Based on Command Choice, Strings are Manipulated
			// Reverse Command
			if(commandChoice.equalsIgnoreCase("reverse")) {
				// Reset Working String
				reversedString = "";

				for(int i = stringLength; i > 0; i--) {
					reversedString += stringInput.charAt(i - 1);
				}
				stringInput = reversedString;
				System.out.println("The new sentence is: " + reversedString);
			}


			// Replace First Command
			if(commandChoice.equalsIgnoreCase("replace first")) {
				// Reset Working String
				replaceFirstString = "";

				// Prompt User for Replacement Characters
				System.out.println("Enter the character to replace");
				charReplaced = keyboard.next().charAt(0);
				keyboard.nextLine();

				System.out.println("Enter the new character");
				charNew = keyboard.next().charAt(0);
				keyboard.nextLine();

				// For Loop to Find Replaced Index
				for(int i = 0; i < stringLength; i++) {
					if(stringInput.charAt(i) == charReplaced) {
						replaceFirstString += charNew;
						charNew = charReplaced;
					}
					else {
						replaceFirstString += stringInput.charAt(i);
					}
				}

				// Error Handling
				if(replaceFirstString.equals(stringInput)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					stringInput = replaceFirstString;
					System.out.println("The new sentence is: " + replaceFirstString);
				}
			}


			// Replace Last Command 
			if(commandChoice.equalsIgnoreCase("replace last")) {
				// Reset Working Strings
				replaceLastString = "";
				replaceLastStringFinal = "";

				// Prompt User for Replacement Characters
				System.out.println("Enter the character to replace");
				charReplaced = keyboard.next().charAt(0);
				keyboard.nextLine();

				System.out.println("Enter the new character");
				charNew = keyboard.next().charAt(0);
				keyboard.nextLine();

				// For Loop to Replaced Last and Reverse
				for(int i = stringLength; i > 0; i--) {
					if(stringInput.charAt(i - 1) == charReplaced) {
						replaceLastString += charNew;
						charNew = charReplaced;
					}
					else {
						replaceLastString += stringInput.charAt(i - 1);
					}
				}

				// For Loop to Undo Reverse
				for(int i = stringLength; i > 0; i--) {
					replaceLastStringFinal += replaceLastString.charAt(i - 1);
				}

				// Error Handling
				if(replaceLastStringFinal.equals(stringInput)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					stringInput = replaceLastStringFinal;
					System.out.println("The new sentence is: " + replaceLastStringFinal);
				}
			}


			// Remove Command
			if (commandChoice.equalsIgnoreCase("remove")) {
				// Reset Working String
				removeString = "";

				// (Re)Set Remove Counter
				removeCounter = 1;

				// Prompt User for Exact Character of Removal
				System.out.println("Enter the character to remove");
				charRemoved = keyboard.next().charAt(0);
				keyboard.nextLine();

				System.out.println("Enter the " + charRemoved + " you would like to remove "
						+ "(Not the index - 1 = 1st, 2 = 2nd, etc.):");
				instanceOfCharRemoved = keyboard.nextInt();
				keyboard.nextLine();

				// For Loop to Remove Character
				for (int i = 0; i < stringLength; i++) {
					if((stringInput.charAt(i) == charRemoved) && (removeCounter == instanceOfCharRemoved)) {
						removeCounter ++;
					}
					else if ((stringInput.charAt(i) == charRemoved) && (removeCounter != instanceOfCharRemoved)) {
						removeCounter ++;
						removeString += stringInput.charAt(i);
					}
					else {
						removeString += stringInput.charAt(i);
					}
				}

				// Error Handling
				if(removeString.equals(stringInput)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					stringInput = removeString;
					System.out.println("The new sentence is: " + removeString);
				}
			}

			// Remove All Command
			if (commandChoice.equalsIgnoreCase("remove all")) {
				// Reset Working String
				removeAllString = "";

				// Prompt User for Exact Character of Removal
				System.out.println("Enter the character to remove");
				charRemoved = keyboard.next().charAt(0);
				keyboard.nextLine();

				// For Loop to Remove All
				for(int i = 0; i < stringLength; i++) {
					if(stringInput.charAt(i) == charRemoved) {
					}
					else {
						removeAllString += stringInput.charAt(i);
					}
				}

				// Error Handling
				if(removeAllString.equals(stringInput)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					stringInput = removeAllString;
					System.out.println("The new sentence is: " + removeAllString);
				}
			}
		}
		while (!commandChoice.equalsIgnoreCase("quit"));

		// Close Program
		keyboard.close();
		System.exit(0);
	}
}


