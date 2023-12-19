/*
 * StringFun.java
 * Author:  Jacob Glover
 * Submission Date:  3-19-2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program allows the user
 * to input a string and manipulate it through 6 different commands in a loop.
 * The program will continue to manipulate the string until error or the user exits.
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
//
//

import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// initializations
		String command = "";
		String newString = "";
		
		System.out.println("Enter the string to be manipulated");
		String inputtedString = input.nextLine();
		boolean error = true;
		boolean newSentence = true;
	
		
		do { // beginning of main loop
			int numberOfChars = inputtedString.length();
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)"); // prompts for the command
			command = input.nextLine();
			// beginning of command conditional statements
			if (command.equalsIgnoreCase("reverse")) { 
				newString = "";
				for (int i = 1; i <= numberOfChars;) {
					char currentCharacter = inputtedString.charAt(numberOfChars-1);			
						newString = newString + currentCharacter;
						numberOfChars -= 1;
				}
			}
			else if (command.equalsIgnoreCase("replace first")) { 
				System.out.println("Enter the character to replace");
				char replacedCharacter = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newCharacter = input.nextLine().charAt(0);
				newString = "";
				while (error) { // loop to prevent errors
					for (int i = 0; i<= numberOfChars; i++) {
						char currentCharacter = inputtedString.charAt(i);
						if((i == numberOfChars-1) && (currentCharacter != replacedCharacter)) {
							System.out.println("The letter was not found in the word"); // error prompt
							error = false;
							newSentence = false;
							i = numberOfChars;
						}
						else if (currentCharacter == replacedCharacter) {
							newString = inputtedString.substring(0, i) + newCharacter + inputtedString.substring(i + 1); // replaces the character
							i = numberOfChars; // ends loop
							error = false;
						} 
					}
				}
			} else if (command.equalsIgnoreCase("replace last")) { 
				System.out.println("Enter the character to replace");
				char replacedChar = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newCharacter = input.nextLine().charAt(0);
				while (error) {
				for (int i = 0; i<= numberOfChars; i++) {
					if ((i == numberOfChars-1) && (inputtedString.charAt(i) != replacedChar)) {
						System.out.println("Error: the letter you are trying to remove does not exist");
						error = false;
						newSentence = false;
						i = numberOfChars;
					}
					else if ((inputtedString.charAt(i) == replacedChar) && (i == numberOfChars-1)){
						newString = inputtedString.substring(0,i) + newCharacter + inputtedString.substring(i + 1);
						i = numberOfChars;
						error = false;
					}
					else if (inputtedString.charAt(i) == replacedChar) {
						newString = inputtedString.substring(0,i) + newCharacter + inputtedString.substring(i + 1);
						error = false;
						i = numberOfChars;
					}
					else if (i == numberOfChars-1) {
						i = numberOfChars;
						error = false;
						}
					}
				}
			} else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char removedChar = input.nextLine().charAt(0);
				newString = "";
					for (int i = 0; i <= numberOfChars; i++) {
						if (newString.charAt(i) != removedChar) {
							newString = newString + inputtedString.charAt(i);
					}
				}
			} else if (command.equalsIgnoreCase("remove")) { 
				System.out.println("Enter the character to remove");
				char removedChar = input.nextLine().charAt(0);
				System.out.println("Enter the " + removedChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int instanceOfChar = input.nextInt(); // the number of char the user would like to remove
				input.nextLine(); // for output purposes
				int charInstance = 0;
				while (error) {
					for (int i = 0; i < numberOfChars; i++) {
						if((i == numberOfChars) && ((inputtedString.charAt(i) != removedChar) || (instanceOfChar != charInstance))) {
							System.out.println("Error: the letter you are trying to remove does not exist");
							error = false;
							newSentence = false;
						}
						else if (inputtedString.charAt(i) == removedChar) {
							charInstance++; // to count the number of desired removed characters that have passed
							if (instanceOfChar == charInstance) {
								newString = inputtedString.substring(0,i) + "" + inputtedString.substring(i + 1);
								error = false;
							}
						}
					}
				}
			}
			if (!(command.equalsIgnoreCase("quit")) && (newSentence == true)) {
			System.out.println("The new sentence is: " + newString); //output only prints if the system is not exited
			}
			inputtedString = newString; // updates the string to allow further editing in the next loop
			error = true; // updates the boolean for the next loop
		} while (!(command.equalsIgnoreCase("quit"))); // conditional for closing the loop
		input.close();
		}
	}
