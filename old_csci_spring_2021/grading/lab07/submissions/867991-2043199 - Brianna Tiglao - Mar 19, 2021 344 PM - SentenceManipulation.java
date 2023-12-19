/*
 * SentenceManipulation.java
 * Author:  Brianna Tiglao 
 * Submission Date: March 19, 2021
 *
 * Purpose: The purpose of this program is to take a sentence and manipulate it five different ways:
 * Reversing the sentence, replacing the first instance of a letter, replacing the last instance of a letter, 
 * removing a letter, and removing all of a certain letter.
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

public class SentenceManipulation {

	public static void main(String[] args) {
		String sentence;
		String command;
		char oldChara;
		char newChara;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the string to be manipulated");
		sentence = input.nextLine();

		while (1 > 0) {

			String finalOutput = "";

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = input.nextLine();

			if (command.equalsIgnoreCase("reverse")) {

				for (int i = sentence.length() - 1; i >= 0; i--) {
					char currentChar = sentence.charAt(i);

					finalOutput += currentChar;
				}

				sentence = finalOutput;

				System.out.println("The new sentence is: " + finalOutput);
			}

			else if (command.equalsIgnoreCase("replace first")) {

				System.out.println("Enter the character to replace");
				oldChara = input.nextLine().charAt(0);

				System.out.println("Enter the new character");
				newChara = input.nextLine().charAt(0);

				boolean replaced = false; 

				for (int i = 0; i < sentence.length(); i++) {
					char currentChar = sentence.charAt(i);
					if (currentChar == oldChara && !replaced) {
						finalOutput += newChara;

						replaced = true;
					}
					else {
						finalOutput += currentChar;
					}
				}

				if (!replaced) {
					System.out.println("The letter was not found in the word");
				}

				else {
					sentence = finalOutput;
					System.out.println("The new sentence is: " + finalOutput);
				}

			}

			else if (command.equalsIgnoreCase("replace last")) {

				System.out.println("Enter the character to replace");
				oldChara = input.nextLine().charAt(0);

				System.out.println("Enter the new character");
				newChara = input.nextLine().charAt(0);

				String unreversed = "";

				boolean replaced = false; 

				for (int i = sentence.length() - 1; i >= 0; i--) {
					char currentChar = sentence.charAt(i);
					if (currentChar == oldChara && !replaced) {
						unreversed += newChara;

						replaced = true;
					}
					else {
						unreversed += currentChar;
					}
				}

				for (int i = unreversed.length() - 1; i >= 0; i--) {
					char currentChar = unreversed.charAt(i);

					finalOutput += currentChar;
				}

				if (!replaced) {
					System.out.println("The letter was not found in the word");
				}

				else {
					sentence = finalOutput;
					System.out.println("The new sentence is: " + finalOutput);
				}
			}

			else if (command.equalsIgnoreCase("remove all")) {

				System.out.println("Enter the character to remove");

				char removeChar = input.nextLine().charAt(0);

				boolean removed = false;

				for (int i = 0; i < sentence.length(); i++) {
					char currentChar = sentence.charAt(i);

					if (currentChar != removeChar) {

						finalOutput += currentChar;
					}
					else {
						removed = true;
					}
				}

				if (!removed) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}

				else {
					sentence = finalOutput;

					System.out.println("The new sentence is: " + finalOutput);
				}

			}

			else if (command.equalsIgnoreCase("remove")) {

				System.out.println("Enter the character to remove");

				char removeChar = input.nextLine().charAt(0);

				System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");

				int count = input.nextInt();
				input.nextLine();

				int charaCount = 0;

				for (int i = 0; i < sentence.length(); i++) {
					char currentChar = sentence.charAt(i);

					if (currentChar == removeChar) {

						charaCount++;

						if (charaCount != count) {
							finalOutput += currentChar;
						}
					}
					else {
						finalOutput += currentChar;
					}
				}

				if (charaCount == 0) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}

				else if (charaCount < count) {
					System.out.println("You tried to remove the " + count + " " + removeChar + " from the sentence, which does not exist.");
				}

				else {

					sentence = finalOutput;
					System.out.println("The new sentence is: " + finalOutput);

				}
			}

			else if (command.equalsIgnoreCase("quit")) {
				System.exit(0);
				input.close();
			}

			else {
				System.out.println("Invalid command. Please try again.");
			}
			
		}

	}

}
