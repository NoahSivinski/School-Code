/*
 * StringFun.java
 * Author:  Melissa Neff
 * Submission Date:  10/17
 *
 * Purpose: This program manipulated a string input by the user. It gives
 * the user the option to reverse the string, replace the first instance
 * of a character in the string, replace the last instance of a character
 * in the string, remove all instances of a character in the string, or remove
 * one specific instance of a character in the string. The program will
 * continue prompting the user for their command until the user inputs "quit."
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
		
		char replaced, newChar, charToRemove;
		int removeAt;
		String command;
		
		Scanner keyboard = new Scanner(System.in);
		//The following prints to the console:
		System.out.println("Enter the string to be manipulated");
		//The next string input by the user will be used for manipulations:
		String input = keyboard.nextLine();
		
		do {
		//The user is prompted for a command:
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		//The command is the next line input by the user:
		command = keyboard.nextLine();
		//The strings manipulation and lastManipulation will be used later:
		String manipulated = "";
		String lastManipulation = "";
		/*If the user does not input any of the valid command options, the 
		 * program prompts them to try again.
		 */
		if(!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first") && !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all") && !command.equalsIgnoreCase("remove") &&!command.equalsIgnoreCase("quit")) {
            System.out.println("Command invalid. Try again");
		 
		command = keyboard.nextLine();
		}
		/*The following code reverses the string, if the user inputs
		 * the command "reverse":
		 */
		
		 if(command.equalsIgnoreCase("reverse")) {
			for(int reverse = (input.length()-1); reverse > -1; reverse--) {
				manipulated += input.charAt(reverse);
			}
			input = manipulated;
			System.out.println("The new sentence is: "+input);
			
		}
		 /*The following code replaces the first instance of a character
			 * in a string, if the user inputs "replace first":
			 */
		else if(command.equalsIgnoreCase("replace first")) {
			//The user is prompted for which character they would like to replace:
			System.out.println("Enter the character to replace");
			replaced = keyboard.next().charAt(0);
			keyboard.nextLine();
			/*The user is prompted for which new character they would like to
			 * replace the old character with:
			 */
			System.out.println("Enter the new character");
			newChar = keyboard.next().charAt(0);
			keyboard.nextLine();
			
			int index = -1;
			for(int replaceFirst = 0; replaceFirst < input.length(); replaceFirst++) {
				if (index < 0 && replaced == input.charAt(replaceFirst)) {
					manipulated += newChar;
					index = replaceFirst;
				}
				else {
					manipulated += input.charAt(replaceFirst);
				}
			}
			
			if (manipulated.equals(input)) {
				System.out.println("The letter was not found in the word");
			}
			else {
				input = manipulated;
				System.out.println("The new sentence is: " +input);
			}
		}
		/*The following code replaces the last instance of a character in
		 * the string, if the user inputs "replace last":
		 */
		else if(command.equalsIgnoreCase("replace last")) {
			//Prompts user for character to replace:
			System.out.println("Enter the character to replace");
			replaced = keyboard.next().charAt(0);
			keyboard.nextLine();
			//Prompts user for new character to replace old character:
			System.out.println("Enter the new character");
			newChar = keyboard.next().charAt(0);
			keyboard.nextLine();
			
			int index = -1;
					for (int replaceLast = (input.length() -1); replaceLast > -1; replaceLast--) {
						if (index < 0 && replaced == input.charAt(replaceLast)) {
							manipulated += newChar;
							index = replaceLast;
						}
						else {
							manipulated += input.charAt(replaceLast);
						}
					}
			for(int reverse = (input.length()-1); reverse > -1; reverse--) {
				lastManipulation += manipulated.charAt(reverse);
			}
			if (manipulated.equals(input)) {
				System.out.println("The letter was not found in the word");
			}
			else {
				input = lastManipulation;
				System.out.println("The new sentence is: " +input);
			}
		}
		/*The following code removes one instance of a character, if
		 * the user inputs the command "remove":
		 */
		else if (command.equalsIgnoreCase("remove")) {
			System.out.println("Enter the character to remove");
			charToRemove = keyboard.next().charAt(0);
			keyboard.nextLine();
			System.out.println("Enter the " +charToRemove+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
			removeAt = keyboard.nextInt();
			keyboard.nextLine();
			int count = 0;
			
			for(int i = 0; i < input.length(); i++) {
				if (charToRemove != input.charAt(i)) {
					manipulated += input.charAt(i);
				}
				else {
					count++;
					if (count != removeAt) {
						manipulated += input.charAt(i);
					}
						else {
							input = manipulated;
							System.out.println("The new sentence is: " +input);
							keyboard.nextLine();
						}
				}
				}
			if (manipulated.equals(input)) {
			System.out.println("Error: the letter you are trying to remove does not exist");
		}
		}
		/*The following code removes all instances of a character from
		 * the string, if the user inputs the command "Remove all":
		 */
		else if (command.equalsIgnoreCase("remove all")) {
		System.out.println("Enter the character to remove:");
				charToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				for (int r = 0; r < input.length(); r++) {
					if (charToRemove != input.charAt(r)) {
						manipulated += input.charAt(r);
						
					}
				}
				if (manipulated.equals(input)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
					
				}
				else {
					input = manipulated;
					System.out.println("The new sentense is: " +input);
				}
	}
		
//If the user inputs "quit," the execution ends.
} while(!command.equalsIgnoreCase("quit"));
		System.out.println("...Execution ends...");
		keyboard.close();
		}
	}
