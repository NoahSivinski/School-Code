
/*
 * StringFun.java
 * Author: Jonathan Dintino
 * Submission Date: 15 October 2021
 *
 * Purpose: This program will take an input string and allow
 * the user to perform various operations upon it. The program
 * can take mutliple commands and will only exit if the user
 * types 'quit' as one of the commands.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class StringFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// variables to be used for the program loop
		String command;
		String tempString = "";
		boolean run = true;
		
		// prompt the user for the input string
		System.out.println("Enter the string to be manipulated");
		String inputString = userInput.nextLine();
		
		// program loop
		while (run) {
			// prompt the user for the command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = userInput.nextLine();
			
			if (command.equalsIgnoreCase("reverse")) {
				
				for (int i = inputString.length() - 1; i >= 0; i--) {
					tempString = tempString + inputString.charAt(i);
				}
				
				inputString = tempString;
				System.out.println("The new sentence is: " + inputString);
				
			} else if (command.equalsIgnoreCase("replace first")) {
				
				boolean done = false;
				
				System.out.println("Enter the character to replace");
				char letter = userInput.nextLine().charAt(0);
				
				System.out.println("Enter the new character");
				char replace = userInput.nextLine().charAt(0);
				
				for (int i = 0; i < inputString.length(); i++) {
					char current = inputString.charAt(i);
					if (!done && current == letter) {
						tempString = tempString + replace;
						done = true;
					} else {
						tempString = tempString + current;
					}
				}
				
				if (!inputString.equals(tempString)) {
					inputString = tempString;
					System.out.println("The new sentence is: " + inputString);
				} else {
					System.out.println("The letter was not found in the word");
				}
				
			} else if (command.equalsIgnoreCase("replace last")) {
				
				boolean done = false;
				
				System.out.println("Enter the character to replace");
				char letter = userInput.nextLine().charAt(0);
				
				System.out.println("Enter the new character");
				char replace = userInput.nextLine().charAt(0);
				
				for (int i = inputString.length() - 1; i >= 0; i--) {
					char current = inputString.charAt(i);
					if (!done && current == letter) {
						tempString = tempString + replace;
						done = true;
					} else {
						tempString = tempString + current;
					}
				}
				
				String reverse = tempString;
				tempString = "";
				
				for (int i = inputString.length() - 1; i >= 0; i--) {
					tempString = tempString + reverse.charAt(i);
				}
				
				if (!inputString.equals(tempString)) {
					inputString = tempString;
					System.out.println("The new sentence is: " + inputString);
				} else {
					System.out.println("The letter was not found in the word");
				}
				
			} else if (command.equalsIgnoreCase("remove all")) {
				
				System.out.println("Enter the character to remove");
				char letter = userInput.nextLine().charAt(0);
				
				for (int i = 0; i < inputString.length(); i++) {
					char current = inputString.charAt(i);
					if (current != letter) {
						tempString = tempString + current;
					}
				}
				
				if (!inputString.equals(tempString)) {
					inputString = tempString;
					System.out.println("The new sentence is: " + inputString);
				} else {
					System.out.println("The letter was not found in the word");
				}
				
			} else if (command.equalsIgnoreCase("remove")) {
				
				System.out.println("Enter the character to remove");
				char letter = userInput.nextLine().charAt(0);
				
				System.out.println("Enter the " + letter + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int number = userInput.nextInt();
				userInput.nextLine();
				
				char count = 0;
				
				for (int i = 0; i < inputString.length(); i++) {
					char current = inputString.charAt(i);
					if (current == letter) {
						count += 1;
						if (count == number) {
							tempString = tempString + "";
						} else {
							tempString = tempString + current;
						}
					} else {
						tempString = tempString + current;
					}
				}
				
				if (!inputString.equals(tempString)) {
					inputString = tempString;
					System.out.println("The new sentence is: " + inputString);
				} else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				
			} else if (command.equalsIgnoreCase("quit")) {
				
				run  = false;
				System.exit(0);
				
			} else {
				
				System.out.println("Command invalid. Try again");
				
			}
			
			tempString = "";
			
		}

	}

}