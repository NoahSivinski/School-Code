/*
 * CSCI 1301.java
 * Author: Rayman Ng 
 * Submission Date: 3/19/2021
 *
 * Purpose: This program allows the user to create their own string and modify it 5 different ways. These ways include:
 * reverse - Their string will flip, such that their last word becomes their first word, their second last word becomes the second word, etc.
 * replace first - The program will prompt the user to enter in a character they want removed, and if it exists, the program will replace the first instance of the character from the string with whatever character the user wanted.
 * replace last - The program will prompt the user to enter in a character they want removed, and if it exists, the program will replace the last instance of the character from the string with the character the user wanted.
 * remove all - The program will prompt the user to enter in a character they want removed. If it exists, the program will remove every instance of the character from the string.
 * remove - The program will prompt the user to enter in a character they want removed, and afterwards, will prompt the user to enter in which instance of the character they want removed. If it exists, the program will expunge it from the string.
 * Once the user has had their fun, they can leave by entering in quit. 
 *  
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
		Scanner keyboard = new Scanner (System.in);
		String userString;
		String userCommand;
		char letter;
		char otherLetter;
		System.out.println("Enter the string to be manipulated");
		userString = keyboard.nextLine();

		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		userCommand = keyboard.nextLine();
		while (!(userCommand.equalsIgnoreCase("quit"))) {
			if (userCommand.equalsIgnoreCase("reverse")) {
				String modifiedString = "";
				for (int i = 0; (userString.length()-1) - i >=0; i++) {
					letter = userString.charAt((userString.length()-1) - i);
					modifiedString = modifiedString + letter;
				}
				System.out.println("The new setence is:" + modifiedString);
				userString = modifiedString;
			}
			else if (userCommand.equalsIgnoreCase ("replace first")) {
				int count = 0;
				System.out.println("Enter the character to replace");
				letter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				otherLetter = keyboard.nextLine().charAt(0);
				while (((userString.length()-1) - count > 0) && (letter != userString.charAt(count))) {
					count++;
				}
				if (letter == userString.charAt(count)) {
					userString = userString.substring(0, count) + otherLetter + userString.substring(count + 1);
					System.out.println("The new sentence is:" + userString);
				}
				else if (letter != userString.charAt(count)){
					System.out.println("The letter was not found in this word");
				}
			}
			else if (userCommand.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				letter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				otherLetter = keyboard.nextLine().charAt(0);
				int stringLength = userString.length() -1;
				if (letter != userString.charAt(stringLength)) {
					while ((stringLength > 0) && (letter != userString.charAt(stringLength))) {
						stringLength--;
					}
					if (letter == userString.charAt(stringLength)) {
						userString = userString.substring(0, stringLength) + otherLetter + userString.substring(stringLength + 1);
						System.out.println("The new sentence is:" + userString);
					}
					else if ((stringLength >= 0) && (letter != userString.charAt(stringLength))){
						System.out.println("The letter was not found in this word");
					}
				}
				else if (letter == userString.charAt(stringLength)) {
					userString = userString.substring(0, stringLength) + otherLetter + userString.substring(stringLength + 1);
					System.out.println("The new sentence is:" + userString);
				}

				stringLength = userString.length() - 1;
			}
			else if (userCommand.equalsIgnoreCase("remove")) {
				int count = 0;
				int innerCount = 0;
				int instance;

				System.out.println("Enter the character to remove");
				letter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the" + " " + letter + " " + "you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				instance = keyboard.nextInt();
				while (count < instance) {
					while (((userString.length()-1) - innerCount > 0) && (letter != userString.charAt(innerCount))) {
						innerCount++;
					}
					count++;
					if ((count < instance) && (innerCount != (userString.length()-1))) {
						innerCount ++;
					}
					else if (( (userString.length() -1) - innerCount == 0) && (letter == userString.charAt(innerCount)) && count != instance) {
						instance = -1;
					}
				}
				if ((letter != userString.charAt(innerCount)) || (instance == -1)){
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else if ((letter == userString.charAt(innerCount)) && (instance != -1)) {
					userString = userString.substring(0, innerCount) + userString.substring(innerCount + 1);
					System.out.println("The new sentence is:" + userString);
				}
				keyboard.nextLine();
			}
			else if (userCommand.equalsIgnoreCase("remove all")) {
				int count = 0;
				int stringLength = userString.length()-1;
				int originalLength = stringLength;
				System.out.println("Enter the character to remove");
				letter = keyboard.nextLine().charAt(0);
				while (stringLength - count > 0) {
					if (userString.charAt(count) == letter) {
						userString = userString.substring(0, count) + userString.substring(count + 1);
						stringLength = userString.length() - 1;
					}
					else {
						count++;
					}
				} 
				if ((stringLength == 0) &&(userString.charAt(0)) == letter ) {
					userString = "";
				}
				if (originalLength == stringLength) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else if (originalLength != stringLength) {
					System.out.println("The new sentence is:" + userString);
				}
				count = 0;
			}
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			userCommand = keyboard.nextLine();
		}
		if (userCommand.equalsIgnoreCase("quit")) {
			System.out.println("...Execution Ends...");
		}
		keyboard.close();
	}

}