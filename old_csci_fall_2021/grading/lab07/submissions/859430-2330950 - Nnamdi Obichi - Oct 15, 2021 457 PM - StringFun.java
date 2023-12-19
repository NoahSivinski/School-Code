/*
 * StringFun.java
 * Author: Nnamdi Obichi 
 * Submission Date:  October 15th, 2021
 *
 * Purpose: 
 * 
 * In this program a user inputs a sentence and
 * can REVERSE the order of the characters, 
 * REPLACE FIRST instances of selected characters with new characters, 
 * REPLACE LAST instances of selected characters with new characters,
 * REMOVE ALL instances of a selected character, or REMOVE specified 
 * instances of characters. This program will loop the previously 
 * stated processes if the user inputs the valid commands 
 * (reverse, replace first, replace last, remove all, remove).
 * An invalid command will also loop the process just without
 * modifying or attempting to modify the sentence. The command 'quit'
 * stops the loop and ends the process. This lab is meant to help
 * students learn how to modify Strings manually.   
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
		
		Scanner keyBo = new Scanner(System.in);
		
		// Creates input variables
		String command;
		String input1;
		String input2;
		int numInput;
		
		// Creates variables used in the while loop below 
		String fillStr;
		int strlen;
		boolean inString;
		int charIndex;
		int charCount;
		
		// This variable controls the while loop below
		int loopControl = 0;
		
		// Prompts and stores a user's inputed sentence to be modified later
		System.out.println("Enter the string to be manipulated");
		String strInput = keyBo.nextLine();
		String newStr = strInput;
		
		// If the loopControl variable is NOT EQUAL to 0, the loop ends
		while (loopControl == 0) {
			
			// Sets defaults for variables to be reset every loop
			strlen = newStr.length();
			fillStr = "";
			charIndex = -1;
			charCount = 0;
			inString = false;
			
			// User inputs a command, regardless of case, to alter the previously inputed sentence
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyBo.nextLine();
			command = command.toLowerCase();
			
			// Reverses the users sentence
			if (command.equals("reverse")){
				
				/* Reads through the sentence character by character and puts reverses
				 * their order when concatenating them into the fillStr variable
				 */
				for (int i = 0; i < strlen; ++i) {
					fillStr += newStr.charAt(strlen - (i+1));
				}
				
				newStr = fillStr;
				System.out.println("The new sentence is: " + newStr);
			}
			
			
			// Replaces the first instance of a character in a sentence
			else if (command.equals("replace first")) {
				
				
				/* Prompts user for a character to be replaced. The user
				 * can input more than one character, but only the first
				 * character is stored
				 */
				System.out.println("Enter the character to replace");
				input1 = keyBo.nextLine();
				input1 = input1.substring(0,1); 
				
				
				/* Prompts user for a new character to replace the old one.
				 * The user can input more than one character, but only
				 * the first character is stored
				 */
				System.out.println("Enter the new character");
				input2 = keyBo.nextLine();
				input2 = input2.substring(0,1); 
				
				/* Reads through the sentence backwards and stores the 
				 * index of the first character to be replaced   
				 */
				for (int i = strlen; i > 0; --i) {
					inString = false;
					inString = (input1.equals(newStr.substring(i-1,i)));
					
					if (inString) {
						charIndex = i-1;  
					}
				}
				
				// If the index of the character is a positive number (charIndex is -1 by default)
				if (charIndex >= 0) {
					
					// Modifies the String to not have the removed first character
					fillStr = newStr.substring(0, charIndex)+input2+newStr.substring(charIndex+1, strlen);
					newStr = fillStr;
					System.out.println("The new sentence is: "+newStr);
				}
				
				// Else the letter is not in the sentence and the String remains unchanged 
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			
			
			// Replaces the last instance of a character in a sentence
			else if (command.equals("replace last")) {
				
				/* Prompts user for a character to be replaced. The user
				 * can input more than one character, but only the first
				 * character is stored
				 */
				System.out.println("Enter the character to replace");
				input1 = keyBo.nextLine();
				input1 = input1.substring(0,1); 
				
				/* Prompts user for a new character to replace the old one.
				 * The user can input more than one character, but only
				 * the first character is stored
				 */
				System.out.println("Enter the new character");
				input2 = keyBo.nextLine();
				input2 = input2.substring(0,1); 
				
				/* Reads through the sentence in order and stores the 
				 * index of the last character to be replaced   
				 */
				for (int i = 0; i < strlen; ++i) {
					inString = false;
					inString = (input1.equals(newStr.substring(i,i+1)));
					
					if (inString) {
						charIndex = i;  
					}
				}
				
				// If the index of the character is a positive number (charIndex is -1 by default)
				if (charIndex >= 0) {
					
					// Modifies the String to not have the removed last character
					fillStr = newStr.substring(0, charIndex)+input2+newStr.substring(charIndex+1, strlen);
					newStr = fillStr;
					System.out.println("The new sentence is: "+newStr);
				}
				
				// Else the letter is not in the sentence and the String remains unchanged 
				else {
					
					System.out.println("The letter was not found in the word");
				}
			}
			
			
			// Removes all selected characters from the sentence
			else if (command.equals("remove all")) {
				
				/* Prompts user for a character to be replaced. The user
				 * can input more than one character, but only the first
				 * character is stored
				 */
				System.out.println("Enter the character to remove");
				input1 = keyBo.nextLine();
				input1 = input1.substring(0,1);
				
				/* Reads through the sentence character by character in order
				 * and a new String is made to hold every character but the 
				 * ones to be removed 
				 */
				for (int i = 0; i < strlen; ++i) {
					inString = false;
					inString = (input1.equals(newStr.substring(i,i+1)));
					
					/* If the selected character in input1 is NOT EQUAL
					 * to the current character in the loop, add the 
					 * current character to the new String
					 */
					if (inString == false) {
						fillStr += newStr.substring(i,i+1); 
					}
					++charCount;
				}
				
				/* If the number of removed character (counted in charCount) are
				 * above 0, then the new String copies its contents into newStr
				 */
				if (charCount > 0) {
					newStr = fillStr;
					System.out.println("The new sentence is: "+newStr);
				}
				
				// Else newStr is not changed as no characters were removed
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			
			
			// Removes a specific character in a sentence
			else if (command.equals("remove")) {
				
				/* Prompts user for a character to be replaced. The user
				 * can input more than one character, but only the first
				 * character is stored
				 */
				System.out.println("Enter the character to remove");
				input1 = keyBo.nextLine();
				input1 = input1.substring(0,1);
				
				// Prompts the user for which instance of the character to be removed (integer) 
				System.out.println("Enter the "+input1+" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				numInput = keyBo.nextInt();
				keyBo.nextLine();
				
				/* Reads through the sentence in order and counts the number of
				 * instances of the selected character in input1 exist. It also
				 * stores the index of the instance of character which the user
				 * wants to remove. 
				 */
				for (int i = 0; i < strlen; ++i) {

					if (input1.equals(newStr.substring(i,i+1))) {
						++charCount;
						if (charCount == numInput) {
							charIndex = i;
						}
					}
					
				}
				
				/* If the number of characters equal to the selected character in input1
				 * are greater than 0 and the index of character is positive or 0 
				 */
				if (charCount > 0 && charIndex >= 0) {
					
					// Creates a new sentence without the removed character
					fillStr = newStr.substring(0, charIndex)+newStr.substring(charIndex+1, strlen);
					newStr = fillStr;
					System.out.println("The new sentence is: "+newStr);
				}
				
				/* Else the user either chose a character that wasn't in the sentence 
				 * at all or the instance of that character did not exist, thus the 
				 * sentence does NOT CHANGE.
				 */
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			
			
			/* If the user inputs this command the loopControl variable increments by 1
			 * breaking the loop (as it is only true when loopControl == 0)
			 */
			else if (command.equals("quit")) {
					++loopControl;
			}
			
			// Tells the user that the input was invalid and immediate restarts the loop
			else {
				System.out.println("Command invalid. Try again");
			}
		}
		keyBo.close();
	}

}
