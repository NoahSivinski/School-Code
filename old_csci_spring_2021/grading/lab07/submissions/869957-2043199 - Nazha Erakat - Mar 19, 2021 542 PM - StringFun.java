/*
 * StringFun.java
 * Author:  Nazha Erakat
 * Submission Date:  3/19/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program will take in a user's input (a sentence) and they can choose to manipulate the string using 5 commands (reverse, replace first, replace last, remove, remove all). 
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

		String originalString;
		String yourInput;
		String newOutput;
		char character;
		char oldCharacter;
		char newCharacter;
		boolean characterCanReplace = false;
		int length;

		System.out.println("Enter the string to be manipulated"); // enter your sentence (string)
		originalString = keyboard.nextLine();

		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			yourInput = keyboard.nextLine();

			if (yourInput.equalsIgnoreCase("reverse")) {
				length = originalString.length();
				newOutput = "";

				while (length > 0) {
					length--;
					character = originalString.charAt(length);
					newOutput = (newOutput + character);
				}
				originalString = newOutput;
				System.out.println("The new sentence is:" + originalString);
			}
			if (yourInput.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.next().charAt(0);
				keyboard.hasNextLine();
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				length = 0;
				while (length < originalString.length() && characterCanReplace == false) {
					if (originalString.charAt(length) == oldCharacter) {
						characterCanReplace = true;
					}
					length++;
				}
				if (characterCanReplace == false) {
					System.out.println("The letter was not found in the word");
				} else {
					originalString = originalString.substring(0, length - 1) + newCharacter
							+ originalString.substring(length);
					System.out.println("The new sentence is:" + originalString);
				}
			}

			if (yourInput.equalsIgnoreCase("replace last")) {
				characterCanReplace = false;
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				int instance;
				for (int i = 0; i < originalString.length(); i++) {
					if (originalString.charAt(i) == oldCharacter) {
						originalString = originalString.substring(0, i) + newCharacter
								+ originalString.substring(i + 1);
						characterCanReplace = true;
					}
				}
				if (characterCanReplace == false) {
					System.out.println("The letter was not found in the word");
				} else {
					System.out.println("The new sentence is:" + originalString);
				}
			}
			char characterToRemove;
			if (yourInput.equalsIgnoreCase("remove all")) {
				boolean characterIsRemoved = false;
				length = 0;
				newOutput = "";
				System.out.println("Enter character to remove");
				characterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				while (length < originalString.length()) {
					if (characterToRemove != originalString.charAt(length)) {
						newOutput = newOutput + originalString.charAt(length);
					} else if (characterToRemove == originalString.charAt(length)) {
						characterIsRemoved = true;
					}
					length++;
				}
				if (characterIsRemoved) {
					originalString = newOutput;
					System.out.println("The new sentence is:" + originalString);
				} else {
					System.out.println("Error: the character you are trying to remove does not exist");
				}
			}

			else if (yourInput.equalsIgnoreCase("remove")) {
				boolean characterIsRemoved = false;
				int instanceOfCharacter = 0;    
				System.out.println("Enter character to remove");
				oldCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + oldCharacter
						+ " you would like to remove (Not the index - 1 = 1st,2 = 2nd, etc.):");
				int instanceToRemove = keyboard.nextInt();
				keyboard.nextLine();
				length = 0;
				while (length < originalString.length() && instanceOfCharacter != instanceToRemove) {

					if (originalString.charAt(length) == oldCharacter) {

						characterIsRemoved = true;
						instanceOfCharacter++;
					}
					length++;
				}
				if (instanceOfCharacter != instanceToRemove) {
					System.out.println("Error: the letter you are tryng to remove does not exist");

				} else if (characterIsRemoved) {
					originalString = originalString.substring(0, length - 1) + originalString.substring(length);
					System.out.println("The new sentence is:" + originalString);
				} else {
					System.out.println("The letter was not found in the word");
				}
				
			} else if (yourInput.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
		} while (!(yourInput.equalsIgnoreCase("quit")));
	}
}
