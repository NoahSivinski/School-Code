/*
 * StringFun.java
 * Author:  Tenacity Murdie 
 * Submission Date:  10-15-2021
 *
 * Purpose: This program asks the user to enter a string to be manipulated. It then asks the user how to manipulate the string, and 
 * continues to modify the string until the user enters the "quit" command.
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
		String command = "";
		boolean letterFound = false;
		String manipulatedString = ""; // placeholder variable
		
		//getting user input for string
		System.out.println("Enter the string to be manipulated");
		String inputString = keyboard.nextLine();
		
		//do while loop keeps asking for command until user says "quit"
		do {
			//getting user input for command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			
			//reverse command
			if(command.equalsIgnoreCase("reverse")) {
				manipulatedString = ""; 
				
				//loop walks through inputString backwards and has the placeholder variable hold each char
				for (int j = inputString.length() - 1; j >=0; j--) {
					manipulatedString += inputString.charAt(j);
				}
				inputString = manipulatedString;
				System.out.println("The new sentence is: " + inputString);
			}
			//replace first command
			else if (command.equalsIgnoreCase("replace first")) {
				letterFound = false;
				manipulatedString = "";
				
				//initializing local variables
				char charToReplace;
				char replacementChar;
				int count = 1;
				
				//getting user input and clearing extra \n character
				System.out.println("Enter the character to replace");
				charToReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacementChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				//loop walks through each char of inputString
				for (int i = 0; i < inputString.length(); i++) {
					//if charToReplace is not found, the placeholder variable holds each char
					if (inputString.charAt(i) != charToReplace) {
						manipulatedString += inputString.charAt(i);
						count++;
					}
					//if charToReplace is found, the placeholder variable holds the replacement char instead and adds on the rest of the inputString chars
					else {
						letterFound = true;
						manipulatedString += replacementChar;
						for (; count < inputString.length(); count++) {
							manipulatedString += inputString.charAt(count);
							i = inputString.length();
						}
					}
				}
				//checking to see if charToReplace exists
				if (letterFound == true) {
					inputString = manipulatedString;
					System.out.println("The new sentence is: " + inputString);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
				
			}
			//replace last command
			else if (command.equalsIgnoreCase("replace last")) {
				letterFound = false;
				manipulatedString = "";
				
				//initializing local variables
				char charToReplace;
				char replacementChar;
				int count = inputString.length() - 2;
				
				//getting user input and clearing extra \n character
				System.out.println("Enter the character to replace");
				charToReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacementChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				//loop walks through inputString backwards to find charToReplace, resulting in a string that needs to be reversed later
				for (int j = inputString.length() - 1; j >=0; j--) {
					//if charToReplace is not found, the placeholder variable holds each char
					if (inputString.charAt(j) != charToReplace) {
						manipulatedString += inputString.charAt(j);
						count--;
					}
					//if charToReplace is found, the placeholder variable holds the replacement char instead and adds on the rest of the inputString chars backwards
					else {
						letterFound = true;
						manipulatedString += replacementChar;
						for (; count >= 0; count--) {
							manipulatedString += inputString.charAt(count);
							j = -1;
						}
					}
				}
				inputString = manipulatedString;
				manipulatedString = "";
				//loop reverses the string that results from previous loop
				for (int j = inputString.length() - 1; j >=0; j--) {
					manipulatedString += inputString.charAt(j);
				}
				//checking to see if charToReplace exists
				if (letterFound == true) {
					inputString = manipulatedString;
					System.out.println("The new sentence is: " + inputString);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			//remove all command
			else if (command.equalsIgnoreCase("remove all")) {
				letterFound = false;
				manipulatedString = "";
				
				//initializing local variables
				char charToRemove;
				
				//getting user input and clearing extra \n character
				System.out.println("Enter the character to remove");
				charToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				//loop walks through each char of inputString
				for (int i = 0; i < inputString.length(); i++) {
					//if charToRemove is found, nothing is added to the placeholder variable
					if (inputString.charAt(i) == charToRemove) {
						letterFound = true;
					}
					//if charToRemove is not found, the placeholder variable holds each char
					else {
						manipulatedString += inputString.charAt(i);
					}
				}
				//checking to see if charToRemove exists
				if (letterFound == true) {
					inputString = manipulatedString;
					System.out.println("The new sentence is: " + inputString);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			//remove command
			else if (command.equalsIgnoreCase("remove")) {
				letterFound = false;
				manipulatedString = "";
				
				//initializing local variables
				char charToRemove;
				int whereToRemove;
				int count = 0;
				
				//getting user input and clearing extra \n character
				System.out.println("Enter the character to remove");
				charToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + charToRemove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				whereToRemove = keyboard.nextInt();
				keyboard.nextLine();
				
				//loop walks through each char of inputString
				for (int i = 0; i < inputString.length(); i++) {
					//following code counts how many times charToRemove is found
					if (inputString.charAt(i) == charToRemove) {
						count++;
						//if the number of times charToRemove is found equals the user's input for which char to remove, nothing is added to the placeholder variable
						if (count == whereToRemove) {
							letterFound = true;
						}
						//if the number of times charToRemove is found does not equal the user's input for which char to remove, the placeholder variable holds the char
						else {
							manipulatedString += inputString.charAt(i);
						}
					}
					//if charToRemove is not found, the placeholder variable holds each char
					else {
						manipulatedString += inputString.charAt(i);
					}
				}
				//checking to see if charToRemove exists
				if (letterFound == true) {
					inputString = manipulatedString;
					System.out.println("The new sentence is: " + inputString);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			//checking if command is invalid
			else if (!(command.equalsIgnoreCase("quit"))) {
				System.out.println("Command invalid. Try again");
			}
		} while (!(command.equalsIgnoreCase("quit")));
		
		keyboard.close(); //optional closing of keyboard	

	}

}
