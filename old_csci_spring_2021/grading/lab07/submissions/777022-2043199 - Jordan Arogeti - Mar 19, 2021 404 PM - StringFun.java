/*
 * StringFun.java
 * Author:  Jordan Arogeti 
 * Submission Date:  3/19/21
 *
 * Purpose: The purpose of this code is to have the user input a word 
 * or a sentence and then they can change and manipulate the sentence
 * or word by choosing to either reverse, replace first, replace last
 * remove all, remove, or to quit.  
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
		

			System.out.println("Enter the string to be manipulated");
			// Scanner keyboard = new Scanner(System.in);
			String userString = keyboard.nextLine();
			
			do {
				
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			
				
			
			// Reverse command
			if (command.equalsIgnoreCase("reverse")) {
				int j = userString.length();
				System.out.print("The new sentence is: ");
				String newString = "";

				while (j > 0) {
					System.out.print(userString.charAt(j - 1));
					newString = newString + userString.charAt(j - 1);
					j--;
				} // while

				System.out.println("");
				userString = newString;
			} // if for reverse command

			// Replace first command
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				char charToReplace = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);
				boolean found = false;

				for (int i = 0; i < userString.length(); i++) {

					char currentChar = userString.charAt(i);

					if (currentChar == charToReplace) {
						if (!found) {
							found = true;
							String newSentence = userString.substring(0, i);
							newSentence = newSentence + newChar;
							newSentence = newSentence + userString.substring(i + 1, userString.length());
							System.out.println("The new sentence is: " + newSentence);
							userString = newSentence;
						} // if !found
					} // if currentChar=charToReplace

				} // for for reverse

				if (!found) {
					System.out.println("The letter was not found in the word.");
				} // if !found

			} // else if for replace first

			// Replace last command
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter character to replace ");
				char charToReplace = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);
				boolean found = false;

				for (int i = userString.length() - 1; i >= 0; i--) {

					char currentChar = userString.charAt(i);

					if (currentChar == charToReplace) {
						if (!found) {
							found = true;
							String newSentence = userString.substring(0, i);
							newSentence = newSentence + newChar;
							newSentence = newSentence + userString.substring(i + 1, userString.length());
							System.out.println("The new sentence is: " + newSentence);
							userString = newSentence;
						} // if !found
					} // if currentChar == charToReplace

				} // for for replace last

				if (!found) {
					System.out.println("The character to replace is not found.");
				} // if !found

			} // else if for replace last

			// Remove command
			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove ");
				char charToRemove = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + charToRemove
						+ " you would like to remove (Not the index- 1 = 1st, 2 = 2nd, etc.):");
				int removedChar = keyboard.nextInt();
				keyboard.nextLine();
				
				boolean found = false;

				for (int i = 0; i < userString.length(); i++) {

					char currentChar = userString.charAt(i);

					if (currentChar == charToRemove) {

						if (removedChar == 1) {
							if (!found) {
								found = true;
								String newSentence = userString.substring(0, i);
								newSentence = newSentence + userString.substring(i + 1, userString.length());
								System.out.println("The new sentence is: " + newSentence);
								userString = newSentence;
							} // if !found
						} // removedChar=1
						else {
							removedChar--;
						} // else

					} // if currentChar=charToRemove

				} // for for remove

				if (!found) {
					System.out.println("The character to remove is not found.");
				} // if !found

			} // else if for remove

			// Remove all command
			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove ");
				char charToRemove = keyboard.nextLine().charAt(0);
				boolean found = false;

				for (int i = 0; i < userString.length(); i++) {
					char currentChar = userString.charAt(i);

					if (currentChar == charToRemove) {
						String newString = userString.substring(0, i);
						newString = newString + userString.substring(i + 1, userString.length());
						userString = newString;
						found = true;
						i--;
					} // if currentChar=charToRemove

				} // for for remove all

				if (!found) {
					System.out.println("The character to remove is not found.");
				} // if !found
				else {
					System.out.println("The new sentence is: " + userString);
				} // else

			} // else if remove all
			else if(command.equalsIgnoreCase("quit")) {
				System.out.println("...Execution Ends...");
				keyboard.close();
				System.exit(0);
				
				
			} // else if for quit
			else {
				System.out.println("Invalid Input. Try again.");	
			} // else
		
			
		} while(true);
			
	
	} // main

} // class
