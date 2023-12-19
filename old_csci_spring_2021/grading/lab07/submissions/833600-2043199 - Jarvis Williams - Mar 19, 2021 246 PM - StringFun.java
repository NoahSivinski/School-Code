/*
 * StringFun.java
 * Author: Jarvis Williams
 * Submission Date:  3/19/2021
 *
 * Purpose: The purpose of this program is to manipulate
 * a users message inside of a loop until user enters command to end
 * the loop.
 * * Statement of Academic Honesty:
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

		//initializing variables
		String message;
		String userCommand;
		String newMessage = "";
		char replaceCharacter;
		char characters;
		char newCharacter;
		char removeCharacter;
		boolean characterReplaced = false;
		int length;

		//initializing Keyboard
		Scanner keyboard = new Scanner(System.in);

		//Prompt for user input
		System.out.println("Enter the string to be manipulated");
		message = keyboard.nextLine();

		//Start of loop
		do {
			//prompt user for input of command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			userCommand = keyboard.nextLine(); //Give value to command

			//if statement for reverse
			if (userCommand.equalsIgnoreCase("reverse")) {
				length = message.length();
				newMessage = "";

				while (length > 0) {
					length--;
					characters = message.charAt(length);
					newMessage = (newMessage + characters);
				}
				message = newMessage;
				System.out.println("The new sentence is: " + message);

			//if statement for replace first
			} else if (userCommand.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace"); //prompt user to enter character to be replaced
				replaceCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character"); //prompt user to enter new character
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				length = 0;
				characterReplaced = false;
				while (length < message.length() && characterReplaced == false) {
					if (message.charAt(length) == replaceCharacter) {
						characterReplaced = true;
					}
					length++;
				}
				//if user enters non-present character
				if (characterReplaced == false) {
					System.out.println("The letter was not found in the word");
				//if letter is replaceable
				} else {
					message = message.substring(0, length - 1) + newCharacter
							+ message.substring(length);
					System.out.println("The new sentence is: " + message);
				}
			//if statement for replace last
			} else if (userCommand.equalsIgnoreCase("replace last")) {
				characterReplaced = false;
				System.out.println("Enter the character to replace"); //prompt user to enter character to be replaced
				replaceCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character"); //prompt user to enter new character
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				int occurrence = 0;
				length = 0;
				while (length < message.length()) {
					if (message.charAt(length) == replaceCharacter) {
						occurrence++;
						occurrence = length;
						characterReplaced = true;
					}
					length++;
				}
				//if user enters non-present character
				if (characterReplaced == false) {
					System.out.println("The letter was not found in the word");
				} else {
					message = message.substring(0, occurrence) + newCharacter
							+ message.substring(occurrence + 1);
					System.out.println("The new sentence is: " + message);
				}
			//if statement for remove all
			} else if (userCommand.equalsIgnoreCase("remove all")) {
				boolean characterIsRemoved = false;
				length = 0;
				newMessage = "";
				System.out.println("Enter character to remove"); //prompt user to enter character
				removeCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				while (length < message.length()) {
					if (removeCharacter != message.charAt(length)) {
						newMessage = newMessage + message.charAt(length);
					} else if (removeCharacter == message.charAt(length)) {
						characterIsRemoved = true;
					}
					length++;
				}
				if (characterIsRemoved) {
					message = newMessage;
					System.out.println("The new sentence is: " + message);
				//if user enters non-present character
				} else {
					System.out.println("Error: the character you are trying to remove does not exist");
				}
			//if statement for remove
			} else if (userCommand.equalsIgnoreCase("remove")) {
				boolean characterIsRemoved = false;
				int occurrenceOfCharacter = 0;
				System.out.println("Enter character to remove"); //prompt user to enter character
				removeCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + removeCharacter
						+ " you would like to remove (Not the index - 1 = 1st,2 = 2nd, etc.):");
				int occurrenceToRemove = keyboard.nextInt();
				keyboard.nextLine();
				length = 0;
				while (length < message.length() && occurrenceOfCharacter != occurrenceToRemove) {
					if (message.charAt(length) == removeCharacter) {
						characterIsRemoved = true;
						occurrenceOfCharacter++;
					}
					length++;
				}
				if (occurrenceOfCharacter != occurrenceToRemove) {
					System.out.println("Error: the letter you are tryng to remove does not exist");

				} else if (characterIsRemoved) {
					message = message.substring(0, length - 1) + message.substring(length);
					System.out.println("The new sentence is: " + message);
				} else {
					System.out.println("The letter was not found in the word");
				}
			//if statement for if user enters quit
			} else if (userCommand.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			//if user enter an invalid command
			else {
				System.out.println("Invalid command");
			}
		//Statement to keep loop going
		} while (!(userCommand.equalsIgnoreCase("quit")));

		keyboard.close();
	}

}