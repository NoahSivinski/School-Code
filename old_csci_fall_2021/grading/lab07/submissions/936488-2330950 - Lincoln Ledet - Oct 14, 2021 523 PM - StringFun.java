/*
 * StringFun.java
 * Author: Lincoln Ledet
 * Submission Date:  10/14/21
 * Lab 07 – Fun with Strings 
 * 
 * Purpose: This program lets a user edit a string. It can
 * reverse, replace and remove characters from a string. 
 * 
 * 
 *  * Statement of Academic Honesty:
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
		System.out.println("Enter the string to be manipulated");//
		String userString = keyboard.nextLine();
		String command = "";

		while (!(command.equalsIgnoreCase("quit"))) {

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();//gets user input

			String tempString = "";
			String replace = "";
			String newChar = "";
			int charIndex = 0;
			int counter = 1;
			boolean stringContains = false;

			//reverse case
			if (command.equalsIgnoreCase("reverse")) {

				for (int i = userString.length(); i > 0; i--) {//reads string backwards 
					tempString = (tempString + userString.substring(i - 1, i));//reassembled string as "tempString"
				}
				userString = tempString;//replaces string 
				System.out.println("The new sentence is: " + userString);

			} 
			//replace first case
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				replace = keyboard.nextLine();
				System.out.println("Enter the new character");
				newChar = keyboard.nextLine();

				for (int i = 0; i < userString.length(); i++) {//after the first string is replaced, the program stops looking for the letter the user wanted to replace.
					if (userString.substring(i, i + 1).equals(replace)) {
						tempString = (tempString + newChar);
						replace = "";
						stringContains = true;
					} else {
						tempString = (tempString + userString.substring(i, i + 1));
					}
				}

				if (stringContains) {
					userString = tempString;
					System.out.println("The new sentence is: " + userString);
				} else {
					System.out.println("The letter was not found in the word");
				}

			} 
			//replace last case
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				replace = keyboard.nextLine();

				System.out.println("Enter the new character");
				newChar = keyboard.nextLine();

				for (int i = userString.length(); i > 0; i--) {//after the last string is replaced, the program stops looking for the letter the user wanted to replace.
					if (userString.substring(i - 1, i).equals(replace)) {
						tempString = (newChar + tempString);
						replace = "";
						stringContains = true;
					} else {
						tempString = (userString.substring(i - 1, i) + tempString);
					}
				}
				if (stringContains) {
					userString = tempString;
					System.out.println("The new sentence is: " + userString);
				} else {
					System.out.println("The letter was not found in the word");
				}

			} 
			//remove all case
			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				replace = keyboard.nextLine();
				for (int i = 0; i < userString.length(); i++) {//cycles through string and if the letter equals "replace" it gets replaced
					if (userString.substring(i, i + 1).equals(replace)) {
						tempString = (tempString + "");
						stringContains = true;
					} else {
						tempString = (tempString + userString.substring(i, i + 1));
					}

				}
				if (stringContains) {
					userString = tempString;
					System.out.println("The new sentence is: " + userString);
				} else {
					System.out.println("The letter was not found in the word");
				}

			} 
			//remove case
			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				replace = keyboard.nextLine();

				System.out.println("Enter the z you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				charIndex = keyboard.nextInt();
				int amountInString = 0;
				counter = 1;

				for (int i = 0; i < userString.length(); i++) {//filters through string 
					if (userString.substring(i, i + 1).equals(replace)) {
						stringContains = true;//Confirms "replace" (string) is inside "userString". 
						amountInString += 1;//counts amount of times "replace" occurs in the string
						if (counter == charIndex) {//removes the "replace" string in the correct place
							tempString = (tempString + "");
						} else {
							tempString = (tempString + userString.substring(i, i + 1));
						}
						counter += 1;

					} else {
						tempString = (tempString + userString.substring(i, i + 1));
					}

				}
				if (!(stringContains)) {
					System.out.println("The letter was not found in the word");
				} else if (amountInString < charIndex) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					userString = tempString;
					System.out.println("The new sentence is: " + userString);
				}
				command = keyboard.nextLine();

			} 
			
			else if (!(command.equalsIgnoreCase("quit"))) {
				System.out.println("Command invalid. Try again");
			}
		}
	}

}
