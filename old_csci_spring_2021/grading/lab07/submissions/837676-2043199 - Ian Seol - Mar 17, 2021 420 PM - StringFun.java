/*
 * [CSCI1301L].java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [03172021]
 *
 * Purpose:This program manipulates user-input string in five different ways(reverse, replace first occurring chosen character, 
 * replace last occurring chosen character, removes all chosen character, and removes chosen character)
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

		char enterReplaceChar;//char being replaced
		char enterNewChar;//char to replace
		char enterRemoveChar;//char to remove
		int whichToRemove;//int to select which char to remove
		int stopOrGo = 0;
		String modifiedString;//result string
		String command;//command input variable declared

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be manupulated");
		String originalString = scanner.nextLine();

		do {//start of loops
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = scanner.nextLine();

			// reverse command
			if (command.equalsIgnoreCase("reverse")) {
				//resetting modifiedstring to avoid string remaining in the buffer
				modifiedString = "";
				for (int i = originalString.length() - 1; i >= 0; i--) {
					modifiedString = modifiedString + originalString.charAt(i);
				}
				System.out.println("The new sentence is: " + modifiedString);
				//saving result to originalString for repeated operation 
				originalString = modifiedString;
			}

			//replace user entered char from string at the most front
			else if (command.equalsIgnoreCase("replace first")) {
				//resetting modifiedstring to avoid string remaining in the buffer
				modifiedString = "";
				System.out.println("Enter the character to replace");
				enterReplaceChar = scanner.next().charAt(0);
				System.out.println("Enter the new character");
				enterNewChar = scanner.next().charAt(0);
				scanner.nextLine();//clearing buffer
				for (int i = 0; originalString.length() > i; i++) {
					if (stopOrGo < 1)
						if (originalString.charAt(i) == enterReplaceChar) {
							stopOrGo++;
							modifiedString = modifiedString + enterNewChar;
						} else {
							modifiedString = modifiedString + originalString.charAt(i);
						}
					else {
						modifiedString = modifiedString + originalString.charAt(i);
					}
				}
				if (modifiedString.equals(originalString)) {
					System.out.println("The letter was not found in the word");
				} else {
					System.out.println("The new sentence is:" + modifiedString);
				}
				//saving result to originalString for repeated operation
				originalString = modifiedString;
			}
			//replace user entered char from string at the most end
			else if (command.equalsIgnoreCase("replace last")) {
				modifiedString = "";
				//resetting modifiedstring to avoid string remaining in the buffer
				System.out.println("Enter the character to replace");
				enterReplaceChar = scanner.next().charAt(0);
				System.out.println("Enter the new character");
				enterNewChar = scanner.next().charAt(0);
				scanner.nextLine();//clearing buffer
				for (int i = originalString.length() - 1; i >= 0; i--) {
					if (stopOrGo < 1)
						if (originalString.charAt(i) == enterReplaceChar) {
							stopOrGo++;
							modifiedString = enterNewChar + modifiedString;
						} else {
							modifiedString = originalString.charAt(i) + modifiedString;
						}
					else {
						modifiedString = originalString.charAt(i) + modifiedString;
					}
				}
				if (modifiedString.equals(originalString)) {
					System.out.println("The letter was not found in the word");
				} else {
					System.out.println("The new sentence is:" + modifiedString);
				}
				//saving result to originalString for repeated operation
				originalString = modifiedString;
			}

			// remove all loop
			else if (command.equalsIgnoreCase("remove all")) {
				modifiedString = "";
				//resetting modifiedstring to avoid string remaining in the buffer
				System.out.println("Enter the character to remove");
				enterRemoveChar = scanner.next().charAt(0);
				scanner.nextLine();//clearing buffer
				for (int i = 0; originalString.length() > i; i++)
					if (originalString.charAt(i) == enterRemoveChar) {
						modifiedString = modifiedString + originalString.substring(i, i);
					} else {
						modifiedString = modifiedString + originalString.substring(i, i + 1);
					}
				if (modifiedString.equals(originalString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					System.out.println("The new sentence is:" + modifiedString);
				}
				//saving result to originalString for repeated operation
				originalString = modifiedString;
			}

			// remove selected loop
			else if (command.equalsIgnoreCase("remove")) {
				modifiedString = "";
				//resetting modifiedstring to avoid string remaining in the buffer
				int selectedCharToRemove = 0; 
				System.out.println("Enter the character to remove");
				enterRemoveChar = scanner.next().charAt(0);
				System.out.println("Enter the " + enterRemoveChar
						+ " you would like to remove (Not the index-1=1st, 2=2nd, etc.):");
				whichToRemove = scanner.nextInt();
				scanner.nextLine();//clearing buffer
				for (int i = 0; originalString.length() > i; i++) {
					if (originalString.charAt(i) == enterRemoveChar) {
						selectedCharToRemove++;
						if (selectedCharToRemove == whichToRemove) {
							modifiedString = modifiedString + originalString.substring(i, i);
						} else {
							modifiedString = modifiedString + originalString.substring(i, i + 1);
						}
					} else {
						modifiedString = modifiedString + originalString.substring(i, i + 1);
					}
				}
				if (modifiedString.equals(originalString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					System.out.println("The new sentence is:" + modifiedString);
				}
				//saving result to originalString for repeated operation
				originalString = modifiedString;
			}

		} while (!command.equalsIgnoreCase("quit"));
		//closing the program
		System.out.println("...Execution Ends...");
		scanner.close();
		System.exit(0);

	}
}
