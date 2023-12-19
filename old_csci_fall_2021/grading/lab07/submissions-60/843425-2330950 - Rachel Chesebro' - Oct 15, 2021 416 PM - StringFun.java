/*
 * [StringFun].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [10/15/2021]
 *
 * Purpose: The purpose of this program is to prompt the user to enter a string and manipulate it
 * by one of five ways (reverse, replace first, replace last, remove, or remove all). This program
 * will repeat until the user chooses to quit.
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
		
		//import scanner and create variables
		Scanner keyboard = new Scanner(System.in);
		String userString;
		String command;
		char character = 0;
		char newCharacter;
		String reverseCommand = "";
		String replaceCommand = "";
		char whichCharacter;
		boolean charFound = false;
		int count=0;
		int i;
		int index;

		//prompt user to enter a string and ask how they want to change it
		System.out.println("Enter the string to be manipulated");
		userString = keyboard.nextLine();
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		command = keyboard.nextLine();
		
		//create loop so the program repeats until the user says "quit"
		while(!command.equals("quit")) {
			
			if (command.equals("reverse")) {
				for (i = (userString.length()-1); i >= 0; i--) {
					reverseCommand += userString.charAt(i); }
				System.out.println("The new sentence is: " + reverseCommand); 
				System.out.println("Enter the string to be manipulated");
				userString = keyboard.nextLine();
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}

			//loop forward, find oldChar, replace index with newChar, end loop once char is found
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace"); 
				character = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				for (i = 0; i < userString.length(); i++) {
					if (userString.charAt(i) == character) {
						count++;
						if (count==1) {
							replaceCommand += newCharacter;
							charFound=true;	
						}
						else {
							replaceCommand += userString.charAt(i);
						}
					}	
					else {
						replaceCommand += userString.charAt(i);
					}
				}	
				if (charFound==true ) {
					System.out.println("The new sentence is: " + replaceCommand);
					System.out.println("Enter the string to be manipulated");
					userString = keyboard.nextLine();
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
					command = keyboard.nextLine();
				}
				else {
					System.out.println("The letter was not found in the word");
					System.out.println("Enter the string to be manipulated");
					userString = keyboard.nextLine();
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
					command = keyboard.nextLine();
				}
			}

			//loop backward, find oldChar, replace index with newChar, end loop once char is found
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace"); 
				character = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				count = 0;
				index = 0;
				for (i = (userString.length() - 1); i >= 0; i--) {
					if (userString.charAt(i) == character) {
						count++;
						if (count==1) {
							replaceCommand += newCharacter;
							charFound=true;	
						}
						else {
							replaceCommand += userString.charAt(i);
						}
					}
					else {
						replaceCommand += userString.charAt(i);
					}
				}	
				if (charFound=true ) {
					System.out.println("The new sentence is: " + replaceCommand);
					System.out.println("Enter the string to be manipulated");
					userString = keyboard.nextLine();
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
					command = keyboard.nextLine();
				}
				else {
					System.out.println("The letter was not found in the word");
					System.out.println("Enter the string to be manipulated");
					userString = keyboard.nextLine();
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
					command = keyboard.nextLine();
				}
			}

			//loop forward, find oldChar, replace index with empty char (first part + second part), don't end loop
			else if (command.equals("remove all")) {
				System.out.println("Enter the character to remove"); 
				character = keyboard.next().charAt(0);
				i = userString.indexOf(character);
				if (userString.charAt(0) == character) {
					System.out.println("The new sentence is: " + userString.substring(0,i) + userString.substring(i + 1));
					System.out.println("Enter the string to be manipulated");
					userString = keyboard.nextLine();
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
					command = keyboard.nextLine();
				}
				else {
					replaceCommand = userString;
					System.out.println("The letter was not found in the word");
					System.out.println("Enter the string to be manipulated");
					userString = keyboard.nextLine();
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
					command = keyboard.nextLine();
				}
			}

			//loop forward, find oldChar, replace index with empty char (first part + second part) and end loop once char is found
			else if (command.equals("remove")) {
				System.out.println("Enter the character to remove");
				character = keyboard.next().charAt(0);
				System.out.println("Enter the " + character + " you would like to remove (Not the index-1 = 1st, 2 = 2nd, etc.):");
				whichCharacter = keyboard.next().charAt(0);
				i = userString.indexOf(whichCharacter);
				System.out.println("The new sentence is: " + userString.substring(0,i) + userString.substring(i + 1));
				System.out.println("Enter the string to be manipulated");
				userString = keyboard.nextLine();
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}
			else {
				System.out.println("Command invalid. Try again");
				System.out.println("Enter the string to be manipulated");
				userString = keyboard.nextLine();
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}
		}
		
		//execution ends
		if (command.equals("quit")) {
		}

	}

}
