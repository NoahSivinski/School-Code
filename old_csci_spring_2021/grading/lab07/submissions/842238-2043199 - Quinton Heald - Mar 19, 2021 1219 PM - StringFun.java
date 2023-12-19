/*
 * String.java
 * Author:  Quinton Heald 
 * Submission Date:  3-19-21
 *
 * Purpose: This program takes a user inputed string, and allows the user to manipulate the string using multiple commands.
 * The user may reverse the string, replace the first instance of a character, replace the last instance of a character,
 * remove all of a specific character, and remove a specific character and its specified occurrence (the 1st, 2nd, etc.).
 * Many of the commands are run using loops and conditional statements as opposed to arrays or other specific string commands.
 * Each time the user completes a command, they are shown their new, manipulated string. The program also has conditions for if the 
 * user inputs the wrong command, or tries to remove a letter that is either not within the string, or does not occur at a specific 
 * index.
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

	public static void main(String[]args) {

		System.out.println("Enter the string to be manipulated");

		Scanner input = new Scanner(System.in);
		String userString = input.nextLine();
		//creates Strings which can have characters concatenated within them to change the String
		String newString = "";
		String holdString = "";
		String response = null;
		//creates a Boolean that will only turn true if the string is able to be manipulated correctly, otherwise results in an error statement
		Boolean change = false;

		do {

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");

			response = input.nextLine();

			//reverse command
			if(response.equalsIgnoreCase("reverse")) {

				//reverses the string by running it backwards through a loop
				for (int i = userString.length() - 1; i >= 0; i--) {
					newString += userString.charAt(i);
				}
				change  = true;
			}

			//replace first command
			if(response.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				char oldFirstChar = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newFirstChar = input.nextLine().charAt(0);

				//checker will be used to make sure if a letter is within a string. If the letter is found, it adds to checker. If not, it remains zero.
				//if checker is above zero, it will run the string through manipulation. If it remains zero, and error statement will be given
				int checker = 0;

				for (int i = 0; i < userString.length(); i++) {	
					if(userString.charAt(i) == oldFirstChar)
						checker++;
				}

				if(checker > 0) {
					for (int i = 0; i < userString.length(); i++) {	

						if(userString.charAt(i) == oldFirstChar) {

							String userString1 = userString.substring(0, i);

							String userString2 = userString.substring(i + 1);

							//this makes sure that the loop will stop running
							i = userString.length() + 9999;

							newString = userString1 + newFirstChar + userString2;

						}

					}
					//if change switches to true, the new string will be shown to the user
					change  = true;
				}
				if (checker == 0) {
					System.out.println("The letter was not found in the word");
					newString = userString;

					//if change remains false, the user will be given an error statement and given the command prompt again
					change = false;
				}

			}


			//replace last
			if(response.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				char oldLastChar = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newLastChar = input.nextLine().charAt(0);

				//the replace boolean is used to make sure that when the loop is trying to find the last instance of a letter, 
				//it won't run the second loop for re-reversing the string, which would result in a repeating string
				boolean replace = false;
				int checker = 0;

				for (int i = 0; i < userString.length(); i++) {	
					if(userString.charAt(i) == oldLastChar)
						checker++;
				}

				if(checker > 0) {
					for (int i = userString.length() - 1; i >= 0; i--) {
						holdString += userString.charAt(i);

					}

					for (int i = 0; i < userString.length(); i++) {	

						if(holdString.charAt(i) == oldLastChar) {

							String holdString1 = holdString.substring(0, i);


							String holdString2 = holdString.substring(i + 1);

							i = userString.length() + 99;

							holdString = holdString1 + newLastChar + holdString2;

							replace = true;

						} else {
							replace = false;
						}

						//will only run once the instance of the letter is found
						if(replace == true) {

							for (int j = userString.length() - 1; j >= 0; j--) {
								newString += holdString.charAt(j);

							}

						}
					}
					change  = true;
				}

				if(checker == 0) {
					System.out.println("The letter was not found in the word");
					newString = userString;
					change = false;
				}

			}

			//remove command
			if(response.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char removeChar = input.nextLine().charAt(0);
				System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int charInstance = input.nextInt();

				//remove count is used to make sure that the user will be deleting the specific instance of a character.
				//a loop counts how many times it finds a character, and once it the characters occurrence matches the user's input, that character is removed
				int removeCount = 0;
				input.nextLine();
				int checker = 0;

				for (int i = 0; i < userString.length(); i++) {	
					if(userString.charAt(i) == removeChar)
						checker++;
				}

				if(checker > 0) {
					for (int i = 0; i < userString.length(); i++) {	

						if(userString.charAt(i) == removeChar) {
							++removeCount;
						}

						if(removeCount == charInstance) {

							String removeString1 = userString.substring(0 , i);

							String removeString2 = userString.substring(i + 1);

							newString = removeString1 + removeString2;

							i = userString.length() + 9999;

						}

					}
					change  = true;
				}

				if(checker == 0) {
					System.out.println("Error: the letter you are trying to remove is not in the string");
					newString = userString;
					change = false;
				}
				if (charInstance > checker) {
					System.out.println("Error: the letter you are trying to remove does not exist");
					newString = userString;
					change = false;
				}

			}

			//remove all command
			if(response.equalsIgnoreCase("remove all")){
				System.out.println("Enter the character to remove");
				char removeAllChar = input.nextLine().charAt(0);
				int checker = 0;

				for (int i = 0; i < userString.length(); i++) {	
					if(userString.charAt(i) == removeAllChar)
						checker++;
				}

				if(checker > 0) {
					for (int i = 0; i < userString.length(); i++) {	

						if(userString.charAt(i) != removeAllChar) {

							newString += userString.charAt(i);

						}

					}
					change  = true;
				}
				if (checker == 0){
					System.out.println("Error: the letter you are trying to remove does not exist");
					newString = userString;
					change = false;
				}

			}

			//quit command
			if(response.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			//makes sure the user inputs the correct command, as well as also making sure if the command is mistyped it does not reprint the string
			if (!response.equalsIgnoreCase("reverse") && !response.equalsIgnoreCase("replace first") && !response.equalsIgnoreCase("replace last") && !response.equalsIgnoreCase("remove") && !response.equalsIgnoreCase("remove all") && !response.equalsIgnoreCase("quit")) {
				System.out.println("Invalid command...");
				newString = userString;
				change = false;
			}

			if(change == true) {
				userString = newString;
				System.out.println("The new sentence is: " + newString);
				newString = "";
				holdString = "";
			}
			if(change == false) {
				userString = newString;
				newString = "";
				holdString = "";
			}
		} while (response != "quit");

		input.close();

	}

}
