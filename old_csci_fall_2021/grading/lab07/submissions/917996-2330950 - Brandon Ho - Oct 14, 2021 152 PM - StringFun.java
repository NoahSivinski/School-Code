/*
 * StringFun.java
 * Author:  Brandon Ho
 * Submission Date:  Oct 14 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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

		//asks user to enter string, declaring variables
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String stringUser = keyboard.nextLine();
		String command = ("");

		//will ask for another command until quit is typed in
		while(!command.equalsIgnoreCase("quit")) {

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();


			//reverses string and prints out
			if(command.equalsIgnoreCase("reverse")) {
				String newString = ("");
				for(int i = stringUser.length() - 1 ; i >= 0 ; i--) {
					newString = newString + stringUser.charAt(i);
				}
				stringUser = newString;
				System.out.println("The new sentence is: " + stringUser);
			}

			//replaces first instance of letter found in string with new character user inputs
			else if(command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				String replaceLetter = keyboard.nextLine();
				System.out.println("Enter the new character");
				String newLetter = keyboard.nextLine();
				int x = 0;

				for(int i = 0 ; i < stringUser.length() ; i++ ) {
					if(replaceLetter.charAt(0) == stringUser.charAt(i)) {
						stringUser = stringUser.substring(0 , i) + newLetter + stringUser.substring(i + 1 , stringUser.length());
						i = stringUser.length();
						x = 1;
						System.out.println("The new sentence is: " + stringUser);
					}

				}
				//if a letter was not found in word, prints message
				if (x == 0) {
					System.out.println("The letter was not found in the word");
				}

			}

			//replaces last instance of the letter found in string with new character user inputs
			else if(command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				String replaceLetter = keyboard.nextLine();
				System.out.println("Enter the new character");
				String newLetter = keyboard.nextLine();
				int x = 0;

				for(int i = stringUser.length() - 1 ; i >= 0 ; i-- ) {
					if(replaceLetter.charAt(0) == stringUser.charAt(i)) {
						stringUser = stringUser.substring(0 , i) + newLetter + stringUser.substring(i + 1 , stringUser.length());
						i = -1;
						x = 1;
						System.out.println("The new sentence is: " + stringUser);
					}

				}
				//if a letter was not found in word, prints message
				if (x == 0) {
					System.out.println("The letter was not found in the word");
				}

			}

			// removes a specific letter at a specific instance of that letter
			else if(command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				String removeLetter = keyboard.nextLine();
				System.out.println("Enter the " + removeLetter + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int instanceNumber = keyboard.nextInt();
				keyboard.nextLine();
				int counter = 0;

				for(int i = 0 ; i < stringUser.length() ; i++) {
					if (removeLetter.charAt(0) == stringUser.charAt(i)) {
						counter++;
					}
					if(counter == instanceNumber) {
						stringUser = stringUser.substring(0 , i) + stringUser.substring(i + 1 , stringUser.length());
						System.out.println("The new sentence is: " + stringUser);
						i = stringUser.length();
					}
				}
				// if letter isn't found error message is sent
				if(counter != instanceNumber) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}

			}

			//removes all instance of the letter user enters
			else if(command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				String removeLetter = keyboard.nextLine();
				int x = 0;

				for(int i = stringUser.length() - 1 ; i >= 0 ; i--) {
					if (removeLetter.charAt(0) == stringUser.charAt(i)) {
						stringUser = stringUser.substring(0 , i) + stringUser.substring(i + 1 , stringUser.length());
						x = 1;
					}

				}
				if(x == 0) {
					System.out.println("There are no " + removeLetter + "'s to remove");
				}
				else {
					System.out.println("The new sentence is: " + stringUser);
				}

			}

			else if(!command.equalsIgnoreCase("quit")) {
				System.out.println("Command invalid. Try Again");
			}

		}

		keyboard.close();

	}

}
