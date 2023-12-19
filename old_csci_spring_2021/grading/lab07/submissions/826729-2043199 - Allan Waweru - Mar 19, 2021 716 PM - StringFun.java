/*
 * StringFun.java
 * Author:  Allan Waweru 
 * Submission Date:  03/19/2021
 *
 * Purpose: This programs create an environment where the user can enter a sentence (as a string)
 * and then manipulate that string using 5 basic commands. 
 * 
 * Statement of Academic Honesty:
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

		String command, manipulation, manipulationLast;
		char oldCharacter, newCharacter, removeSingle, removeAll;
		int removeFrom;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the string to be manipulated");
		String inputString = keyboard.nextLine();

		//start the loop
		boolean status = true;
		while (status) {
			// prompt input from user
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			manipulation = "";
			manipulationLast = "";

			//Quit command
			if (command.equalsIgnoreCase("quit")) {
				status = false;
				System.out.println("...Execution Ends...");
			}

			//Reverse command
			else  if (command.equalsIgnoreCase("reverse")) {
				for (int i = inputString.length() - 1; i > -1; i--) {
					manipulation += inputString.charAt(i);
				}
				inputString = manipulation;
				System.out.println("The new sentence is: " + inputString);
			}



			//Replace first command
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.nextLine().charAt(0);

				System.out.println("Enter the new character");
				newCharacter = keyboard.nextLine().charAt(0);

				//Replace the oldCharacter
				int found = -1;
				for (int c = 0; c < inputString.length(); c++) {
					if (found < 0 && oldCharacter == inputString.charAt(c)) {
						manipulation += newCharacter;
						found = c;
					}
					else {
						manipulation += inputString.charAt(c);
					}
				}

				//Look to see if character exists
				if (manipulation.equals(inputString)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputString = manipulation;
					System.out.println("The new sentence is: " + inputString);
				}

			}


			//'Replace Last' command
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.nextLine().charAt(0);

				System.out.println("Enter the new character");
				newCharacter = keyboard.nextLine().charAt(0);

				//Replace the oldCharacter
				int found = -1;
				for (int i = (inputString.length() - 1); i > -1; i--) {
					if (found < 0 && oldCharacter == inputString.charAt(i)) {
						manipulation += newCharacter;
						found = i;
					}
					else {
						manipulation += inputString.charAt(i);
					}
				}
				for (int reverse = (inputString.length() - 1); reverse > -1; reverse--) {
					manipulationLast += manipulation.charAt(reverse);
				}

				//Look to see if character exists
				if (manipulationLast.equals(inputString)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputString = manipulationLast;
					System.out.println("The new sentence is: " + inputString);
				}
			}




			//'Remove all' command
			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeAll = keyboard.next().charAt(0);
				keyboard.nextLine();

				//Remove all instances of the character
				for (int i = 0; i < inputString.length(); i++) {
					if (inputString.charAt(i) != removeAll) {
						manipulation += inputString.charAt(i);
					}

				}
				//check to see if the character exist
				if (manipulation.equals(inputString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputString = manipulation;
					System.out.println("The new sentence is: " + inputString);
				}

			}


			//Remove single character Command
			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				removeSingle = keyboard.nextLine().charAt(0);

				System.out.println("Enter the " + removeSingle + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				removeFrom = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;

				//Remove specific instance of the character
				String temp = "";
				for (int i = 0; i < inputString.length(); i++) {
					if (removeSingle != inputString.charAt(i))
						manipulation += inputString.charAt(i);
					else {
						count++;
						if (count != removeFrom)
							manipulation += inputString.charAt(i);
					}

				}
				//check to see if the character exist
				if (manipulation.equals(inputString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputString = manipulation;
					System.out.println("The new sentence is: " + inputString);
					
					
				}
			}


		}

	}
}

