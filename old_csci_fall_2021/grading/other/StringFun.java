/*
 * [StringFun].java
 * Author:  [Davis Klein] 
 * Submission Date:  [10/17/2021]
 *
 * Purpose: This program takes a string input from the user and modifies it based on user command. There are 5 different commands the user
 * is able to use. The program continues to run until the user enters the quit command.
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
		
		System.out.println("Enter the string to be manipulated");
		String userInput = keyboard.nextLine();
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		String userCommand = keyboard.nextLine();
		boolean systemRun = true;
		
		while (systemRun) {
			if (userCommand.equalsIgnoreCase("reverse")) {
				String newUserInput = "";
				for (int i = userInput.length()-1; i > 0; i--) {
					newUserInput += userInput.charAt(i);
				}
				newUserInput += userInput.charAt(0);
				userInput = newUserInput;
				System.out.print("The new sentence is " + userInput);
			}
			
			if (userCommand.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				String replaceStr = keyboard.next();
				char replaceChar = replaceStr.charAt(0);
				System.out.println("Enter the new character");
				String newStr = keyboard.next();
				char newChar = newStr.charAt(0);
				for (int i = 0; i < userInput.length()-1; i++) {
					int charFound = 0;
					if (replaceChar == userInput.charAt(i) && charFound == 0) {
						charFound++;
						userInput = userInput.substring(0, i) + newChar + userInput.substring(i + 1);
					}
				}
				System.out.print("The new sentence is " + userInput);
			}
			
			if (userCommand.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				String replaceStr = keyboard.next();
				char replaceChar = replaceStr.charAt(0);
				System.out.println("Enter the new character");
				String newStr = keyboard.next();
				char newChar = newStr.charAt(0);
				for (int i = userInput.length()-1; i > 0; i--) {
					int charFound = 0;
					if (replaceChar == userInput.charAt(i) && charFound == 0) {
						charFound++;
						userInput = userInput.substring(0, i) + newChar + userInput.substring(i + 1);
					}
				}
				System.out.print("The new sentence is " + userInput);
			}
			
			if (userCommand.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				String removeStr = keyboard.next();
				char removeChar = removeStr.charAt(0);
				System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int removeIndex = keyboard.nextInt();
				for (int i = 0; i < userInput.length()-1;i++) {
					
					
				}
				System.out.print("The new sentence is " + userInput);
			}
			
			if (userCommand.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				String removeStr = keyboard.next();
				char removeChar = removeStr.charAt(0);
				for (int i = 0; i < userInput.length()-1; i++) {
					if (removeChar == userInput.charAt(i)) {
						userInput = userInput.substring(0,i) + userInput.substring(i+1);
					}
				}
				System.out.print("The new sentence is " + userInput);
			}
			
			if (userCommand.equalsIgnoreCase("quit")) {
				systemRun = false;
				
			}
		}
		
		
		
		
	}

}
