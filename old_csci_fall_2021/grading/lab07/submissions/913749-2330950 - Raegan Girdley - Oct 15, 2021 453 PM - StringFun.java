/*
 * StringFun.java
 * Author:  Raegan Girdley
 * Submission Date:  10/14/2021
 *
 * Purpose: Allows user to manipulate string that they input
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
		
		//makes variables
		String userInput, output, command, tempOutput = "";
		char replacementChar, charToReplace;
		Scanner keyboard = new Scanner(System.in);
		int j, x = 0, counter = 0, marker = 0, index = 0;
		
		//takes user input for string to modify
		System.out.println("Enter the string to be manipulated");
		userInput = keyboard.nextLine();

		do {
			
			j = 0;
			output = "";
			
			//asks user what they want to do with string
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			
			//reverse
			if (command.equalsIgnoreCase("reverse")) {
				for (int i = userInput.length()-1; i > -1; i--) {
					output += userInput.charAt(i);
				}
				System.out.println("The new sentence is: " + output);
				userInput = output;
			}
			
			//replace first
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				charToReplace = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replacementChar = keyboard.nextLine().charAt(0);
				for (int i = 0; i < userInput.length(); i++) {
					if (j < 1) {
						if (userInput.charAt(i) == charToReplace) {
								output += replacementChar;
								j++;
								i++;
						}
					}
					output += userInput.charAt(i);
				}
				if (j == 0) {
					System.out.println("The letter was not found in the word");
				}
				else {
					System.out.println("The new sentence is: " + output);
					userInput = output;
				}
				
			}
			
			//replace last
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				charToReplace = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replacementChar = keyboard.nextLine().charAt(0);
				for (int i = userInput.length()-1; i >= 0; i--) {
					if (userInput.charAt(i) == charToReplace) {
						tempOutput += replacementChar;
						i--;
						j++;
					}
					tempOutput += userInput.charAt(i);
				}
				for (int i = tempOutput.length()-1; i > -1; i--) {
					output += tempOutput.charAt(i);
				}
				if (j == 0) {
					System.out.println("The letter was not found in the word");
				}
				else {
					System.out.println("The new sentence is: " + output);
					userInput = output;
				}
			}
			
			//remove all
			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				replacementChar = keyboard.nextLine().charAt(0);
				for (int i = 0; i < userInput.length(); i++) {
					if (userInput.charAt(i) != replacementChar) {
						output += userInput.charAt(i);
					}
				}
				System.out.println("The new sentence is: " + output);
				userInput = output;
			}
			
			//remove
			else if (command.equalsIgnoreCase("remove")) {
				counter = 0;
				index = 0;
				System.out.println("Enter the character to remove");
				charToReplace = keyboard.next().charAt(0);
				System.out.println("Enter the " + charToReplace + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				marker = keyboard.nextInt();
				for (int i = 0; i < userInput.length(); i++) {
					if (userInput.charAt(i) == charToReplace) {
						counter++;
						if (counter == marker) {
							index = i;
						}
					}
				}
				if (index == 0) {
					System.out.println("Error: the letter you are trying to remove does not exist");
					output = userInput;
				}
				else {
					output += userInput.substring(0, index) + userInput.substring(index+1);
					System.out.println("The new sentence is: " + output);
					
				}
				keyboard.nextLine();
				userInput = output;
			}
			
			//quit
			else if (command.equalsIgnoreCase("quit")) {
				System.out.println("...Execution Ends...");
				x++;
			}
			
			//invalid input
			else {
				System.out.println("Command invalid. Try again");
			}
			
			
		} while (x < 1);
	}

}
