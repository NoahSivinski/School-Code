/*
 * StringFun.java
 * Author:  Ashlin Yeo
 * Submission Date:  10/14/2021
 *
 * Purpose: This program prompts the user to enter a sentence and
 * allows them to manipulate the string using 5 commands (and a quit command). 
 * These commands affect the successive commands that will be made.
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
		String sentence, command, newSentence;
		String replaceOld, replaceNew, removeCharacter;
		int removePosition;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the string to be manipulated");
		sentence = keyboard.nextLine();

		do {
			newSentence = "";
			command = "";
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			//Command reverse
			if (command.equalsIgnoreCase("reverse")) {
				for (int i = sentence.length() - 1; i >= 0; i--) {
					newSentence += sentence.charAt(i);
				}
				//Print the result
				sentence = newSentence;
				System.out.println("The new sentence is: " + sentence);
			}
			//Command replace first: Prompt the user to enter the character to replace
			//and the new character. Replace the first instance of the old character with the new character.
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				replaceOld = keyboard.nextLine();
				System.out.println("Enter the new character");
				replaceNew = keyboard.nextLine();
				int count = 0;
				for (int i = 0; i <= sentence.length() - 1; i++) {
					if(sentence.substring(i, i + 1).equals(replaceOld) && count == 0) {
						String firstSectionString = sentence.substring(0, i);
						firstSectionString += replaceNew;
						String secondSectionString = sentence.substring(i + 1);
						newSentence = firstSectionString + secondSectionString;
						count++;
						sentence = newSentence;
					}
				}
				if (count == 0) {
					System.out.println("The letter was not found in the word");
				}
				//Print the modified string
				else {
					System.out.println("The new sentence is: " + sentence);
				}
			}
			//Command replace last: Prompt the user to enter the character to replace
			//and the new character. Replace the last instance of the old character with the  new character.
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				replaceOld = keyboard.nextLine();
				System.out.println("Enter the new character");
				replaceNew = keyboard.nextLine();
				int count = 0;
				int indexMatch = 0;
				for (int i = 0; i <= sentence.length() - 1; i++) {
					if(sentence.substring(i, i + 1).equals(replaceOld)) {
						count++;
						indexMatch = i;
					}
				}
				//Print the modified string
				if (count > 0) { 
					String firstSectionString = sentence.substring(0, indexMatch);
					firstSectionString += replaceNew;
					String secondSectionString = sentence.substring(indexMatch + 1);
					newSentence = firstSectionString + secondSectionString;
					sentence = newSentence;
					System.out.println("The new sentence is: " + sentence);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			//Command remove all: Prompt the user to enter the character to remove.
			//Remove all instances of the given letter in the sentence.
			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeCharacter = keyboard.nextLine();
				int count = 0;
				for (int i = 0; i <= sentence.length() - 1; i++) {
					//If the character should not be removed, add to newSentence
					if(!(sentence.substring(i, i + 1).equals(removeCharacter))) {
						newSentence += sentence.charAt(i);
					}
					//If the character should be removed, increment count
					else {
						count++;
					}
				}
				//Print the modified string
				if (count > 0) {
					sentence = newSentence;
					System.out.println("The new sentence is: " + sentence);
				}
				else {
					System.out.println("The letter you are tyring to remove does not exist");
				}
			}
			//Command remove: Prompt the user to enter the character to remove 
			//and which instance it should remove.
			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				removeCharacter = keyboard.nextLine();;
				System.out.println("Enter the " + removeCharacter + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				removePosition = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;
				for (int i = 0; i <= sentence.length() - 1; i++) {
					//If the character should not be removed, add it to the new string
					if(!sentence.substring(i, i + 1).equals(removeCharacter)) {
						newSentence += sentence.charAt(i);
					}
					//If the character should potentially be removed, increment count
					else {
						count++;
						if (removePosition != count) {
							newSentence += sentence.charAt(i);
						}
					}
				}
				//Print the modified string
				if (count > 0) {
					sentence = newSentence;
					System.out.println("The new sentence is: " + sentence);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			//Command quit: exit the program
			else if (command.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			//User does not type a valid command
			else {
				System.out.println("Command invalid. Try again");
			}
		}while (!(command.equalsIgnoreCase("quit")));
		keyboard.close();
	} 
}
