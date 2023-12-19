/*
 * StringFun.java
 * Author:  Charles Merritt
 * Submission Date:  10/15/21
 *
 * Purpose: This program takes an input string and has different commands that the usr can iterate a string through to transform
 * it in different ways such as reverse, replacing characters, and removing characters. The string continues to be modified until
 * the user calls the quit command at which point the program terminates.
 *
 * Statement of Academic Honesty: CEM
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
		//initial input + vars
		Scanner keyboard = new Scanner (System.in);
		String userInput, letterReplace;
		boolean run = true; 
		System.out.println("Enter the string to be manipulated");
		userInput = keyboard.nextLine();
		char letter;

		//start while loop
		while (run == true) {
			String emptyString = "";
			boolean letterCheck = false;
			int stringLength = userInput.length();
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String commandChoice = keyboard.nextLine();
			if (commandChoice.equals("")) {
				commandChoice = keyboard.nextLine();
			}
			if (commandChoice.equalsIgnoreCase("reverse")) {
				//reverse command
				for (int i = stringLength - 1; i > -1; i--) {
					letter = userInput.charAt(i);
					emptyString += letter;
				}
				userInput = emptyString;
				System.out.println("The new sentence is: " + userInput);

			}
			else if (commandChoice.equalsIgnoreCase("replace first")) {
				//replace first command
				System.out.println("Enter the character to replace");
				letter = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				letterReplace = keyboard.next();
				for (int i = 0; i < stringLength; i++) {
					char ichar = userInput.charAt(i);
					if ((ichar == letter) && (letterCheck == false)) {
						emptyString += letterReplace;
						letterCheck = true;
					}
					else {
						emptyString += ichar;
					}

				}
				if (letterCheck == false) {
					System.out.println("The letter was not found in the word");
				}
				else {
					userInput = emptyString;
					System.out.println("The new sentence is: " + userInput);
				}
			}

			else if (commandChoice.equalsIgnoreCase("replace last")) {
				//replace last command
				System.out.println("Enter the character to replace");
				letter = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				letterReplace = keyboard.next();
				for (int i = stringLength - 1; i > -1; i--) {
					char ichar = userInput.charAt(i);
					if ((userInput.charAt(i) == letter) && (letterCheck == false)) {
						emptyString = letterReplace + emptyString;
						letterCheck = true;
					}
					else {
						emptyString = ichar + emptyString;
					}

				}
				if (letterCheck == false) {
					System.out.println("The letter was not found in the word");
				}
				else {
					userInput = emptyString;
					System.out.println("The new sentence is: " + userInput);

				}
			}

			else if (commandChoice.equalsIgnoreCase("remove")) {
				//remove command
				System.out.println("Enter the character to remove");
				letter = keyboard.next().charAt(0);
				System.out.println("Enter the " + letter + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int letterIndex = keyboard.nextInt();
				int letterCounter = 0;
				for (int i = 0; i < stringLength; i++) {
					char ichar = userInput.charAt(i);
					if ((ichar == letter)) {
						letterCounter += 1;
						if (letterCounter != letterIndex) {
							emptyString += ichar;
						}
					}
					else {
						emptyString += ichar;
					}
				}
				if ((letterCounter == 0) || (letterCounter < letterIndex)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					userInput = emptyString;
					System.out.println("The new sentence is: " + emptyString);

				}
			}

			else if (commandChoice.equalsIgnoreCase("remove all")) {
				//remove all command
				letterCheck =  false;
				emptyString = "";
				System.out.println("Enter the character to remove");
				letter = keyboard.next().charAt(0);
				for (int i = 0; i < stringLength; i++) {
					char ichar = userInput.charAt(i);
					if ((ichar == letter)) {
						letterCheck = true;
					}
					else {
						emptyString += ichar;
					}
				}
				if (letterCheck == false) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					userInput = emptyString;
					System.out.println("The new sentence is: " + emptyString);

				}

			}

			else if (commandChoice.equalsIgnoreCase("quit")) {
				//quit command
				run = false;
				keyboard.close();
			}

			else {
				System.out.println("Command invalid. Try again");
			}

		}
	}
}
