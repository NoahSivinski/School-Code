/*
 * StringFun.java
 * Author:  Claire Fortenberry 
 * Submission Date:  17 October 2021
 *
 * Purpose: This program allows the user to input a sentence and gives them the option 
 * to manipulate that sentence using 5 commands. The commands the user can choose from
 * are: reverse, replace first, replace last, remove all, remove. The program continues to prompt 
 * the user to input a command until they have entered "quit".
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
		Scanner input = new Scanner(System.in);
		
		// Declare and initialize Strings
		String userString = "";
		String userCommand = "";
		
		System.out.println("Enter the string to be manipulated");
		userString = input.nextLine();
		
		do {
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		userCommand = input.nextLine();
		
			//Command 1: reverse
			if (userCommand.equalsIgnoreCase("reverse")) {
				String newString = "";
				
				for (int i = userString.length()-1; i >= 0; i--) {
					newString = newString + userString.charAt(i);
				}
				
				System.out.println("The new sentence is: " + newString);
				userString = newString;
			}
			
			//Command 2: replace first
			else if (userCommand.equalsIgnoreCase("replace first")) {
				String newString = "";
				String characterToReplaceInput;
				char characterToReplace;
				String newCharacter;
				int found = -1;
				
				System.out.println("Enter the character to replace");
				characterToReplaceInput = input.next();
				characterToReplace = characterToReplaceInput.charAt(0);
				System.out.println("Enter the new character");
				newCharacter = input.next();
				input.nextLine();
				
				//Check for characterToReplace in userString
				for (int i = 0; i < userString.length(); i++) {
					if (userString.charAt(i) == characterToReplace) 
						found = 1;	
				}
				
				//Character not found
				if (found == -1) {
					System.out.println("The letter was not found in the word");
				}
				
				//Character found
				else {
					newString = userString.substring(0, userString.indexOf(characterToReplace)) + newCharacter + userString.substring(userString.indexOf(characterToReplace)+1, userString.length());
					System.out.println("The new sentence is: " + newString);
					userString = newString;
				}
			}
			
			//Command 3: replace last
			else if (userCommand.equalsIgnoreCase("replace last")) {
				String newString = "";
				String characterToReplaceInput;
				char characterToReplace;
				String newCharacter;
				int found = -1;
				
				System.out.println("Enter the character to replace");
				characterToReplaceInput = input.next();
				characterToReplace = characterToReplaceInput.charAt(0);
				System.out.println("Enter the new character");
				newCharacter = input.next();
				input.nextLine();
				
				//Check for characterToReplace in userString
				for (int i = 0; i < userString.length(); i++) {
					if (userString.charAt(i) == characterToReplace) 
						found = i;	
				}
				
				//Character not found
				if (found == -1) {
					System.out.println("The letter was not found in the word");
				}
				
				//Character found
				else {
					newString = userString.substring(0, userString.lastIndexOf(characterToReplace)) + newCharacter + userString.substring(userString.lastIndexOf(characterToReplace)+1, userString.length());
					System.out.println("The new sentence is: " + newString);
					userString = newString;
				}
			}
			
			//Command 4: remove all
			else if (userCommand.equalsIgnoreCase("remove all")) {
				String newString = "";
				String characterToRemoveInput;
				int found = -1;
				
				System.out.println("Enter the character to remove");
				characterToRemoveInput = input.next();
				input.nextLine();
				
				char characterToRemove = characterToRemoveInput.charAt(0);
				
				for (int i = 0; i < userString.length(); i++) {
					if (userString.charAt(i) != characterToRemove) {
						newString = newString + userString.charAt(i);
					}
					else {
						found = i;
					}
				}
				
				//Character not found
				if (found == -1) {
					System.out.println("The letter was not found in the word");
				}
				
				//Character found
				else {
					System.out.println("The new sentence is: " + newString);
					userString = newString;	
				}
			}
			
			//Command 5: remove
			else if (userCommand.equalsIgnoreCase("remove")) {
				String newString = "";
				String characterToRemoveInput;
				char characterToRemove;
				int specificCharacter;
				int count = 0;
				boolean present = false;
				
				System.out.println("Enter the character to remove");
				characterToRemoveInput = input.next();
				characterToRemove = characterToRemoveInput.charAt(0);
				System.out.println("Enter the " + characterToRemoveInput + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				specificCharacter = input.nextInt();
				input.nextLine();
				
				for (int i = 0; i < userString.length(); i++) {
					if (userString.charAt(i) == characterToRemove) { 
						present = true;	
					}
				}
					
				if (present == false) {
					System.out.println("The letter was not found in the word");
				}
				else {
					for (int i = 0; i < userString.length(); i++) {
						if (userString.charAt(i) == characterToRemove) {
							count++;
						}
						if (count == specificCharacter) {
							newString = userString.substring(0,i) + userString.substring(i+1, userString.length());
						}
					}
				}
				if (count < specificCharacter) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					userString = newString;
					System.out.println("The new sentence is: " + newString);
				}	
			}
				
			//Command 6: quit
			else if (userCommand.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			
			//Command invalid
			else {
				System.out.println("Command invalid. Try again");
			}
		
		} while (!userCommand.equalsIgnoreCase("quit"));
	
		
		
		
		input.close();
	}
}


