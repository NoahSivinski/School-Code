/*
 * StringFun.java
 * Author:  Angel Marsh
 * Submission Date:  March 19, 2021
 *
 * Purpose: The purpose of this program is to manipulate a
 * string inputted by the user with five basic commands.
 * The corresponding commands can reverse the string, replace
 * the first instance of a user-specified character in a string, 
 * replace the last instance of a user-specified character in a 
 * string, remove a user-specified character at an instance also 
 * specified by the user, and remove all instances of a user-
 * specified character.
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

		String originalString;
		String yourCommand;
		String newString = "";
		char characterToReplace;
		char newCharacter;
		char characterToRemove;
		boolean characterIsReplaced = false;
		// this is my name for i
		int indexInString;
		int occurrenceOfCharacter;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the string to be manipulated");
		originalString = keyboard.nextLine();

		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			yourCommand = keyboard.nextLine();
			if (yourCommand.equalsIgnoreCase("reverse")) {
				// Since we are reversing the string, we must start with the last character.
				indexInString = originalString.length();
				newString = "";
				while (indexInString > 0) {
					indexInString--;
					// building a new string character by character
					newString = (newString + originalString.charAt(indexInString));
				}
				originalString = newString;
				System.out.println("The new sentence is: " + originalString);

			} else if (yourCommand.equalsIgnoreCase("replace first")) {
				characterIsReplaced = false;
				System.out.println("Enter the character to replace");
				characterToReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				indexInString = 0;
				while (indexInString < originalString.length() && characterIsReplaced == false) {
					if (originalString.charAt(indexInString) == characterToReplace) {
						// Boolean will switch to true and end the loop when the first instance the user
						// wishes to replace is reached
						characterIsReplaced = true;
					}
					indexInString++;
				}
				// If the boolean never turns false, the character the user inputted was not in
				// the string.
				if (characterIsReplaced == false) {
					System.out.println("The letter was not found in the word");
				} else {
					// The outputted string = the original string up to the instance of the
					// character the user desires to replace + the new character and the characters
					// that followed the replaced character in the original string.
					originalString = originalString.substring(0, indexInString - 1) + newCharacter
							+ originalString.substring(indexInString);
					System.out.println("The new sentence is: " + originalString);
				}
			} else if (yourCommand.equalsIgnoreCase("replace last")) {
				characterIsReplaced = false;
				System.out.println("Enter the character to replace");
				characterToReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				// initializing the variable for the number of times the character the user
				// wants to remove has shown up in the string
				occurrenceOfCharacter = 0;
				indexInString = 0;
				while (indexInString < originalString.length()) {
					if (originalString.charAt(indexInString) == characterToReplace) {
						// This will keep track of the instance of the character
						occurrenceOfCharacter++;
						// This tells us the indexes of the string where the character occurs.
						occurrenceOfCharacter = indexInString;
						characterIsReplaced = true;
					}
					indexInString++;
				}
				if (characterIsReplaced == false) {
					System.out.println("The letter was not found in the word");
				} else {
					originalString = originalString.substring(0, occurrenceOfCharacter) + newCharacter
							+ originalString.substring(occurrenceOfCharacter + 1);
					System.out.println("The new sentence is: " + originalString);
				}
			} else if (yourCommand.equalsIgnoreCase("remove all")) {
				boolean characterIsRemoved = false;
				newString = "";
				System.out.println("Enter the character to remove");
				characterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				indexInString = 0;
				while (indexInString < originalString.length()) {
					// If characterToRemove = originalString.charAt(length), characterToRemove is
					// omitted from the string.
					if (characterToRemove != originalString.charAt(indexInString)) {
						// building the string character by character
						newString = newString + originalString.charAt(indexInString);
					} else if (characterToRemove == originalString.charAt(indexInString)) {
						characterIsRemoved = true;
					}
					indexInString++;
				}
				if (characterIsRemoved) {
					originalString = newString;
					System.out.println("The new sentence is: " + originalString);
				} else {
					System.out.println("The letter was not found in the word");
				}
			} else if (yourCommand.equalsIgnoreCase("remove")) {
				boolean characterIsRemoved = false;
				occurrenceOfCharacter = 0;
				System.out.println("Enter the character to remove");
				characterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + characterToRemove
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int occurrenceToRemove = keyboard.nextInt();
				keyboard.nextLine();
				indexInString = 0;
				// loop ends when we have reached the specified occurrence of the character the
				// user wants to remove
				while (indexInString < originalString.length() && occurrenceOfCharacter != occurrenceToRemove) {
					// when the character in originalString at this point in the iteration is the
					// character the user wants to remove
					if (originalString.charAt(indexInString) == characterToRemove) {
						// increment when the occurrence does not equal the occurrence specified by user
						characterIsRemoved = true;
						occurrenceOfCharacter++;
					}
					indexInString++;
				}
				// if characterToRemove is in the string but not the particular user-specified
				// instance of it
				if (occurrenceOfCharacter != occurrenceToRemove && characterIsRemoved) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else if (characterIsRemoved) {
					// The outputted string is the original string up to the index of the
					// character the user desires to replace + the characters that followed the
					// removed character in the original string.
					originalString = originalString.substring(0, indexInString - 1)
							+ originalString.substring(indexInString);
					System.out.println("The new sentence is: " + originalString);
					// if characterToReplace is not in the string at all
				} else {
					System.out.println("The letter was not found in the word");
				}
			} else if (yourCommand.equalsIgnoreCase("quit")) {
				System.exit(0);
			}

			else {
				System.out.println("Invalid command");
			}
		} while (!(yourCommand.equalsIgnoreCase("quit")));

		keyboard.close();
	}

}