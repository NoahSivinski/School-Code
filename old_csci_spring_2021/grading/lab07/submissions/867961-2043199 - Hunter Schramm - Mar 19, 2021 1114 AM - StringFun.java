/**
 * 
 */

/**
 * @author hunterschramm
 *
 */
/*
 * [StringFun].java
 * Author:  [Hunter Schramm] 
 * Submission Date:  [03/19/21]
 *
 * Purpose:	This program allows the user to enter a sentence (as a string) and 
 * manipulate it using 5 basic commands. Each command affects the same string until the user 
 * uses the quit command. The commands include "reverse", "replace first", "replace last", "remove all", "remove", and "quit."
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

		boolean loop = true;

		// String variables for error conditions
		String error = "";
		String yes = "yes";
		String no = "no";
		
		//Scanner 
		Scanner keyboard = new Scanner(System.in);

		//User input
		System.out.println("Enter the string to be manipulated");
		String userString = keyboard.nextLine();

		String finalString = "";
		
		//Do-While loop
		do {
			//Command user input
			System.out.println("Enter your command(reverse,replace first,replace last,remove all,remove,quit)");
			String userCommand = keyboard.nextLine();
			
			//Reverse command
			if (userCommand.equalsIgnoreCase("reverse")) {
				finalString = "";
				for (int i = userString.length() - 1; i >= 0; i--) {
					finalString = finalString + userString.charAt(i);
					error = no;
				}
			}
			// Replace First Command
			if (userCommand.equalsIgnoreCase("replace first")) {

				System.out.println("Enter the character to replace");
				char replacementChar = keyboard.nextLine().charAt(0);

				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);
				
				int indexToBeReplaced = -1;
				for (int i = userString.length() - 1; i >= 0; i--) {
					if (userString.charAt(i) == replacementChar) {
						indexToBeReplaced = i;
						finalString = userString.substring(0,indexToBeReplaced) + newChar
								+ userString.substring(indexToBeReplaced + 1);
						error = no;

					}
					
				}
				//If-statement for error message
			      if (indexToBeReplaced == -1) { 
				  error = yes;
				  System.out.println("The letter was not found in the word");
				 
				}
				 
			}
			// Replace Last Command
			if (userCommand.equalsIgnoreCase("replace last")) {

				System.out.println("Enter the character to replace");
				char replacementChar = keyboard.nextLine().charAt(0);

				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);

				int indexToBeReplaced = -1;
				for (int i = 0; i < userString.length(); i++) {
					if (userString.charAt(i) == replacementChar) {
						indexToBeReplaced = i;
						error = no;

						finalString = userString.substring(0, indexToBeReplaced) + newChar
								+ userString.substring(indexToBeReplaced + 1);
					}
				}
				//If-statement for error message
				if (indexToBeReplaced < 0) {
					error = yes;
					System.out.println("The letter was not found in the word");
					

				}

			}
			// Remove Command
			if (userCommand.equalsIgnoreCase("remove")) {
				finalString = "";
				System.out.println("Enter the character to remove");
				char charToBeRemoved = keyboard.nextLine().charAt(0);

				System.out.println("Enter the " + charToBeRemoved
						+ " you would like to remove(Not the index - 1 = 1st,2 = 2nd,etc.)");
				int indexToBeRemoved = keyboard.nextInt();
				keyboard.nextLine();

				int count = 0;
				for (int i = 0; i <= userString.length() - 1; i++) {
					if (userString.charAt(i) == charToBeRemoved) {
						count += 1;
						if (indexToBeRemoved != count) {
							finalString = finalString + userString.charAt(i);
							error = no;

						}
					} else {
						finalString = finalString + userString.charAt(i);
						error = no;
					}
				}
				//If-statement for error message
				if (indexToBeRemoved > count) {
					System.out.println("Error:the letter you are trying to remove does not exist");
					error = yes;

				}
			}
			// Remove All Command
			if (userCommand.equalsIgnoreCase("remove all")) {
				finalString = "";

				System.out.println("Enter the character to remove");
				char charToBeRemoved = keyboard.nextLine().charAt(0);

				for (int i = 0; i <= userString.length() - 1; i++) {
					if (userString.charAt(i) != charToBeRemoved) {
						finalString = finalString + userString.charAt(i);
						error = no;
					}

				}

			}
			
			// Quit Command
			if (userCommand.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			//If-else statement for loop
			if (error == no) {
				System.out.println("The new sentence is: " + finalString);
				userString = finalString;
			} else if (error == yes) {
				
				
			} else {
				System.out.println("Please input a valid command");
				userString = finalString;

			}
		} while (loop);
	}
}