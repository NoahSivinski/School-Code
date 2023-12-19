/*
 * StringFun.java
 * Author:  Dominique Coney 
 * Submission Date:  3/19/2021
 *
 * Purpose: The purpose of this program is to manipulate strings without using the common manipulation methods.
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
/**
 * 
 */

/**
 * @author Dominique Coney
 *
 */
import java.util.Scanner;

public class StringFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the String to be manipulated");
		String manString = keyboard.nextLine();
		System.out.println("Enter you command (reverse, replace first, replace last, remove all, remove, quit)");
		String command = keyboard.nextLine();
		// Variables to be used during each execution.
		char newChar;
		char replaceChar;
		char newChar2;
		char replaceChar2;
		char removeChar;
		char removeAllChar;
		int removeCharAt;
		// Loop will continue to run until user inputs "quit".
		while (!command.equalsIgnoreCase("quit")) {

			if (command.equalsIgnoreCase("reverse")) {
				String newMan = "";
				for (int i = manString.length() - 1; i >= 0; i = i - 1) {
					newMan += manString.charAt(i);
				}
				manString = newMan;
				System.out.println("The new sentence is: " + manString);
			} 
			else if (command.equalsIgnoreCase("replace first")) {
				String replacedString = "";
				System.out.println("Enter the character to replace");
				replaceChar = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				newChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				replacedString = manString;
				for (int i = 0; i < manString.length(); i++) {
					if (manString.charAt(i) == replaceChar) {
						replacedString = manString.substring(0, i) + newChar + manString.substring(i + 1);
						i = manString.length();
					}
				}
				if (manString.equals(replacedString)) {
					System.out.println("The letter was not found in the word.");
				} 
				else {
					manString = replacedString;
					System.out.println("The new sentence is: " + manString);
				}
			} 
			else if (command.equalsIgnoreCase("replace last")) {
				String lastRepString = "";
				int finalIndex = -1;
				System.out.println("Enter the character to replace");
				replaceChar2 = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				newChar2 = keyboard.next().charAt(0);
				keyboard.nextLine();
				lastRepString = manString;
				for (int i = 0; i < manString.length(); i++) {
					if (manString.charAt(i) == replaceChar2) {
						finalIndex = i;
					}
				}
				if (finalIndex == -1) {
					lastRepString = manString;
					System.out.println("The letter was not found in the word.");
				} 
				else {
					lastRepString = manString.substring(0, finalIndex) + newChar2 + manString.substring(finalIndex + 1);
					manString = lastRepString;
					System.out.println("The new sentence is: " + manString);
				}
			} 
			else if (command.equalsIgnoreCase("remove all")) {
				String removeAllString = "";
				System.out.println("Enter the character to remove");
				removeAllChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				for (int i = 0; i < manString.length(); i++) {
					if (removeAllChar != manString.charAt(i)) {
						removeAllString += manString.charAt(i);
					}
				}
				manString = removeAllString;
				System.out.println("The new sentence is: " + manString);
			} 
			else if (command.equalsIgnoreCase("remove")) {
				String removeString = "";
				System.out.println("Enter the character to remove");
				removeChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + removeChar
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				removeCharAt = keyboard.nextInt();
				keyboard.nextLine();
				int number = 0;
				for (int i = 0; i < manString.length(); i++) {
					if (removeChar != manString.charAt(i)) {
						removeString += manString.charAt(i);
					} 
					else {
						number++;
						if (number != removeCharAt) {
							removeString += manString.charAt(i);
						}
					}
				}
				if (removeString.equals(manString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} 
				else {
					manString = removeString;
					System.out.println("The new sentence is " + manString);
				}
			}
			System.out.println("Enter you command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			if(command.equalsIgnoreCase("quit")) {
				System.out.println("... Execution Ends...");
			}
		}
		keyboard.close();
	}
}
