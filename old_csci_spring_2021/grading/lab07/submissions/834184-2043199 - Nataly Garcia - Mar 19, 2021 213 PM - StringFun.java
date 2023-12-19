/*
 * [Intro to Coding and Program].java
 * Author:  [Nataly Garcia] 
 * Submission Date:  [Friday March 19th]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? In this program, a sentence, word, or phrase
 * is given by the user. Using commands, such as reverse,
 * replace first, replace last, remove, remove all, and quit, the user can
 * receive the sentence based on what the input commands. For example,
 * the sentence will reverse if the user commands reverse.
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
		System.out.println("Enter the string to be manipulated");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		int stringLength = string.length();
		char character, newCharacter;
		String firstPart, secondPart;
		boolean stringFun = true;

		while (stringFun) {
			System.out.println("Enter your command(reverse, replace first, replace last, remove all, remove, quit)");
			String command = input.nextLine();

			if (command.equalsIgnoreCase("reverse")) {
				String string2 = "";

				for(int u=stringLength-1;u>=0;u--) 
					string2 += string.charAt(u);
				string = string2;

				System.out.println("The new sentence is: " + string);
			}

			else if (command.equalsIgnoreCase("replace first")) {
				boolean foundV = false;

				System.out.println("Enter the character to replace");
				character = input.nextLine().charAt(0);

				for (int v = 0; v < stringLength; v++) {
					if (character == string.charAt(v) && !foundV) {
						System.out.println("Enter the new charater");
						newCharacter = input.nextLine().charAt(0);
						firstPart = string.substring(0, v);
						secondPart = string.substring(v+1);
						string = firstPart + newCharacter + secondPart;
						foundV = true;
					}
				}

				if (!foundV) {
					System.out.println("Enter the new character");
					newCharacter = input.nextLine().charAt(0);
					System.out.println("The letter was not found in the word.");
				}
				else {
					System.out.println("The new sentence is: " + string);
				}
			}

			else if (command.equalsIgnoreCase("replace last")) {
				boolean foundW = false;

				System.out.println("Enter the character to replace");
				character = input.nextLine().charAt(0);

				for (int w = (stringLength -1); w >= 0; w--) {
					if (character == string.charAt(w) && !foundW) {
						System.out.println("Enter the new character");
						newCharacter = input.nextLine().charAt(0);
						firstPart = string.substring(0,w);
						secondPart = string.substring(w+1);
						string = firstPart + newCharacter + secondPart;
						foundW = true;
					}
				}
				if (!foundW) {
					System.out.println("Enter the new character");
					newCharacter = input.nextLine().charAt(0);
					System.out.println("The letter was not found in the word.");
				}
				else {
					System.out.println("The new setence is: " + string);
				}
			}

			else if (command.equalsIgnoreCase("remove")) {

				System.out.println("Enter the character to remove");
				character = input.nextLine().charAt(0);
				System.out.println("Enter the " + character + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int chosenCharacter = input.nextInt();
				input.nextLine();

				int numberOfInstances = 0;

				for (int x = 0; x < stringLength; x++) {
					if (character == string.charAt(x)) {
						numberOfInstances++;
					}
				}

				if (chosenCharacter > numberOfInstances) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					int matchingNumbers = 0;

					for (int y = 0; y < stringLength; y++) {
						if (character == string.charAt(y)) {
							matchingNumbers++;

							if (matchingNumbers == chosenCharacter) {
								firstPart = string.substring(0,y);
								secondPart = string.substring(y+1);
								string = firstPart + secondPart;
								stringLength = string.length();
							}
						}

					}
					System.out.println("The new sentence is: " + string);
				}

			}

			else if (command.equalsIgnoreCase("remove all")) {

				System.out.println("Enter the character to remove");
				character = input.nextLine().charAt(0);

				for (int z = 0; z < stringLength; z++) {
					if (character == string.charAt(z)) {
						firstPart = string.substring(0,z);
						secondPart = string.substring(z+1);
						string = firstPart + secondPart;
						stringLength = string.length();
						z--;
					}
				}
				System.out.println("The new sentence is: " + string);
			}

			else if (command.equalsIgnoreCase("Quit")) {
				System.exit(0);

			}


		}
		input.close();

	}

}
