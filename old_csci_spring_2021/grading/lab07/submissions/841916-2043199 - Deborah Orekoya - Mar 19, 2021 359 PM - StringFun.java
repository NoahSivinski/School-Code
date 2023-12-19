/*
 * StringFun.java
 * Author:  Deborah Orekoya
 * Submission Date:  03-19-2021
 *
 * Purpose: 
 * 
 * The purpose of this program is to create an environment where the
 * user can enter a sentence (as a string) and then manipulate that 
 * string using five basic commands, which consist of reverse, replace
 * first, replace last, remove, and remove all. These manipulations 
 * will affect the successive commands that they make. My program will 
 * implement these commands using loops and basic string methods. 
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
		
		//Declare variables 
		String placeHolder;
		String command;
		String lastPlaceHolder;
		char oldCharacter;
		char newCharacter;

		//Allows user to input value 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String inputedString = keyboard.nextLine();

		//Loop for manipulation of the string based on command
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			placeHolder = "";
			lastPlaceHolder = "";
			if (!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first") && !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all") && !command.equalsIgnoreCase("remove") &&!command.equalsIgnoreCase("quit")) {
				System.out.println("Enter one of these commands: reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}
			//Reverse command
			if (command.equalsIgnoreCase("reverse")) {
				for (int i = inputedString.length() - 1; i >= 0; i--) {
					placeHolder = placeHolder + inputedString.charAt(i);
				}
				inputedString = placeHolder;
				System.out.println("The new sentence is: " + inputedString);
			}
			//Replace first command
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				int replacedindex = -1;
				for (int i = 0; i < inputedString.length(); i++) {
					if (replacedindex < 0 && oldCharacter == inputedString.charAt(i)) {
						placeHolder += newCharacter;
						replacedindex = i;
					}
					else {
						placeHolder += inputedString.charAt(i);
					}
				}
				if (placeHolder.equals(inputedString)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputedString = placeHolder;
					System.out.println("The new sentence is: " + inputedString);
				}
			}
			//Replace last command
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				oldCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharacter= keyboard.next().charAt(0);
				keyboard.nextLine();

				int replacedIndex = -1;
				for (int i = (inputedString.length() - 1); i > -1; i--) {
					if (replacedIndex < 0 && oldCharacter == inputedString.charAt(i)) {
						placeHolder += newCharacter;
						replacedIndex = i;
					}
					else {
						placeHolder += inputedString.charAt(i);
					}
				}

				for (int j = (inputedString.length() - 1); j > -1; j--) {
					lastPlaceHolder += placeHolder.charAt(j);
				}

				if (lastPlaceHolder.equals(inputedString)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputedString = lastPlaceHolder;
					System.out.println("The new sentence is: " + inputedString);
				}
			}
			//Remove all command
			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char removeAll = keyboard.next().charAt(0);
				keyboard.nextLine();

				for (int i = 0; i < inputedString.length(); i++) {
					if (removeAll != inputedString.charAt(i)) {
						placeHolder += inputedString.charAt(i);
					}

				}
				if (placeHolder.equals(inputedString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputedString = placeHolder;
					System.out.println("The new sentence is: " + inputedString);
				}
			}
			//Remove command
			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char remove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				int removeAt = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;

				for (int i = 0; i < inputedString.length(); i++) {
					if (remove != inputedString.charAt(i))
						placeHolder += inputedString.charAt(i);
					else {
						count++;
						if (count != removeAt)
							placeHolder += inputedString.charAt(i);
					}

				}
				if (placeHolder.equals(inputedString)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputedString = placeHolder;
					System.out.println("The new sentence is: " + inputedString);
				}
			}
		//Quit command
		} while (!command.equalsIgnoreCase("quit"));

		System.out.println("...Execution Ends...");
		
		keyboard.close();
	}
}








