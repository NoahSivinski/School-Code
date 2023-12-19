/*
 * StringFun.java
 * Author: Samir Hadi Cisneros
 * Submission Date:  19 March 2021
 *
 * Purpose: This program utilizes loops to take a users string and manipulate the string through reverse, replace first, replace last, remove all, and remove methods.
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
 * 
 * I agree
 */
import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String enteredString = input.nextLine();

		for (int looper = 0; looper == 0;) { // loop to keep the program running until "quit" is executed
		System.out.println("Enter your command (reverse, " + "replace first, replace last, remove all, remove, quit)");
		
		String command = input.nextLine();
		
		String savedString = enteredString;
		

		String reversed = ""; // store the value for reversed

		if (command.equalsIgnoreCase("reverse")) { 	// this if statement activates the reverse command that reverses the original string

			for (int i = enteredString.length() - 1; i >= 0; i--)		//loop to reverse the charczters in the string
				reversed += enteredString.charAt(i);

			System.out.println("The new sentence is: " + reversed);
		}

		else if (command.equalsIgnoreCase("replace first")) { 	 //this if statement activates the replace first command that replaces the first appearance of a character with the new character
			System.out.println("Enter the character to replace");
			String replace = input.nextLine();
			char replaceChar = replace.charAt(0);	//initialize variables
			System.out.println("Enter the new character");
			String replacement = input.nextLine();
			char replacementChar = replacement.charAt(0);
			String replacedFirst = "";
			for (int count = 0; count < enteredString.length(); count++) { // loop to replace first
				if (enteredString.charAt(count) == replaceChar) {
					enteredString = enteredString.substring(0, count) + replacementChar
							+ enteredString.substring(count + 1);
					System.out.println("The new sentence is: " + enteredString);
					count = enteredString.length();
				}
			}
			if (enteredString == savedString) {
				System.out.println("The letter was not found in the word");
			}
		}

		else if (command.equalsIgnoreCase("replace last")) {		//this if statement activates the replace last command which replaces the last instance of the old character with the new character
			System.out.println("Enter the character to replace");
			String replace = input.nextLine();
			char replaceChar = replace.charAt(0);
			System.out.println("Enter the new character");
			String replacement = input.nextLine();	//initialize variables
			char replacementChar = replacement.charAt(0);
			String replacedLast = "";
			for (int count = enteredString.length() - 1; count > 0; count--) {	//loop to replace last
				if (enteredString.charAt(count) == replaceChar) {
					enteredString = enteredString.substring(0, count) + replacementChar
							+ enteredString.substring(count + 1);
					System.out.println("The new sentence is: " + enteredString);
					count = 0;
				}
			}
			if (enteredString == savedString) {
				System.out.println("The letter was not found in the word");
			}
		}

		else if (command.equalsIgnoreCase("remove")) {		//this if statement activates the remove command which will remove a character in the instance that the user chooses
			System.out.println("Enter the character to remove");
			String remove = input.nextLine();
			char removeChar = remove.charAt(0);
			System.out.println(
					"Enter the " + remove + " you would like to remove (Not the index -1 = 1st, 2 = 2nd, etc.):");
			int charCount = 0;
			int charToRemove = input.nextInt();	//stores the location of the removal
			String removed = "";
			input.nextLine();
			for (int count = 0; count < enteredString.length(); count++) {	//loop for removal
				if (enteredString.charAt(count) == removeChar) {
					charCount++;
				}
				if (charCount == charToRemove) {
					enteredString = enteredString.substring(0, count) + enteredString.substring(count + 1);
					System.out.println("The new sentence is: " + enteredString);
					count = enteredString.length();
				}
			}
			if (enteredString == savedString) {
				System.out.println("Error: the letter you are trying to remove does not exist");	//error message for non existent letter
			}
		}

		else if (command.equalsIgnoreCase("remove all")) {		// this if statement activates the remove all command which removes all instances of a character
			System.out.println("Enter the character to remove");
			String remove = input.nextLine();
			char removeChar = remove.charAt(0);		//initialize variables and store values with them
			String removedAll = "";
			for (int count = 0; count < enteredString.length(); count++) {
				if (enteredString.charAt(count) == removeChar) {
					enteredString = enteredString.substring(0, count) + enteredString.substring(count + 1);		//loop for remove all
					count--;
				}
			}
			if (enteredString != savedString) {
				System.out.println("The new sentence is: " + enteredString);
			}
			if (enteredString == savedString) {
				System.out.println("Error: the letter you are trying to remove does not exist");
			}
		} else if (command.equalsIgnoreCase("quit")) { //this if statement activates the quit command which ends the program
			System.exit(0);
		} else {
			System.out.println("Invalid command");
		}

		

	}

}
}