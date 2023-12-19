/*
 * StringFun.java
 * Author:  Evan Eastabrooks 
 * Submission Date:  3/19/2021
 *
 * Purpose: StringFun.java takes the user's input and manipulates
 * it according to the command the user wants. There are 5 commands
 * (1 of them, quit, ends the programs) for the user to choose from. 
 * Reverse simply reverses the order of the indices in the string and
 * it appears reversed. Replace first replaces the first instance of
 * a char with something the user wants. Replace last does the same
 * thing but with the last instanceof that char. Remove all removes
 * all instances of the chosen character. Remove removes only the
 * specified instance of a char by the user. Quit ends the execution
 * of the program.
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
		
		int loopChecker = 1; //if loopChecker is 0, execution ends
		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		String manipulatedString = keyboard.nextLine();
		
		while(loopChecker>=1) { //if loopChecher is 0, execution ends
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = keyboard.nextLine();
			
			if(command.equalsIgnoreCase("reverse")) {
				String reversedString = "";//sets up the reversed string
				for(int i = manipulatedString.length()-1; i>=0; i--) {	
					reversedString = reversedString + manipulatedString.charAt(i);
				}
				manipulatedString = reversedString;
				System.out.println("The new sentence is: "+manipulatedString);
			}
			
			else if(command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				char replacedCharacter = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				char characterToReplace = keyboard.next().charAt(0);
				keyboard.nextLine(); //gets rid of the double "enter command" statement
				int indexOfReplacedCharacter = -1; //if this is -1 at the end, prompts the error statement
				for(int i = 0; i < manipulatedString.length(); i++) {
					if(manipulatedString.charAt(i) == replacedCharacter) {
						indexOfReplacedCharacter = i; //no longer -1
						int substring1 = indexOfReplacedCharacter;
						int substring2 = indexOfReplacedCharacter + 1;
						String substringFormula = manipulatedString.substring(0,substring1) + characterToReplace + manipulatedString.substring(substring2);
						manipulatedString = substringFormula;
						i = manipulatedString.length(); //ends this loop
						System.out.println("The new sentence is: "+manipulatedString);
					}
				}
					if(indexOfReplacedCharacter == -1) {
						System.out.println("The letter was not found in the word"); //goes back to beginning
					}
			}
			
			else if(command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				char replacedCharacter = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				char characterToReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				int indexOfReplacedCharacter = -1;
				for(int i = manipulatedString.length()-1; i >= 0; i--) {
					if(manipulatedString.charAt(i) == replacedCharacter) {
						indexOfReplacedCharacter = i;
						int substring1 = indexOfReplacedCharacter;
						int substring2 = indexOfReplacedCharacter + 1;
						String substringFormula = manipulatedString.substring(0,substring1) + characterToReplace + manipulatedString.substring(substring2);
						manipulatedString = substringFormula;
						i = -1; //ends loop
						System.out.println("The new sentence is: "+manipulatedString);
					}
				}
					if(indexOfReplacedCharacter == -1) {
						System.out.println("The letter was not found in the word");
					}
			}
			
			else if(command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char replacedCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				int indexOfReplacedCharacter = -1;
				for(int i = 0; i < manipulatedString.length(); i++) {
					if(manipulatedString.charAt(i) == replacedCharacter) {
						indexOfReplacedCharacter = i;
						int substring1 = indexOfReplacedCharacter;
						int substring2 = indexOfReplacedCharacter + 1;
						String substringFormula = manipulatedString.substring(0,substring1) + manipulatedString.substring(substring2);
						manipulatedString = substringFormula;
						i--; //ends loop
					}
				}
				if(indexOfReplacedCharacter == -1) {
					System.out.println("The letter was not found in the word"); //goes back to beginning
				}
				else {
					System.out.println("The new sentence is: "+manipulatedString);
				}
			}
			
			else if(command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char characterToRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				int invalidChar = -1; //if this is greater than 0, will print error message
				for(int i = 0; i < manipulatedString.length(); i++) {
					if(manipulatedString.charAt(i) == characterToRemove) {
						invalidChar = 1; //will print error message
					}
				}
				if(invalidChar < 0) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					System.out.println("Enter the " + characterToRemove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
					int instanceOfCharacterToRemove = keyboard.nextInt();
					keyboard.nextLine();
					int numberOfCharacterToRemove = 0;
					for(int j = 0; j < manipulatedString.length(); j++) {
						if(manipulatedString.charAt(j) == characterToRemove)
							numberOfCharacterToRemove++; //counts how many characters there are that might be removed
					}
					if(instanceOfCharacterToRemove > numberOfCharacterToRemove || instanceOfCharacterToRemove <= 0) {
						System.out.println("Error: the letter you are trying to remove does not exist");
					}
					else {
						numberOfCharacterToRemove = 0;
						for(int j = 0; j < manipulatedString.length(); j++) {
							if(manipulatedString.charAt(j) == characterToRemove) {
								numberOfCharacterToRemove++;
								}
							if(numberOfCharacterToRemove == instanceOfCharacterToRemove) {
								int indexOfRemovedCharacter = j;
								int substring1 = indexOfRemovedCharacter;
								int substring2 = indexOfRemovedCharacter + 1;
								String substringFormula = manipulatedString.substring(0,substring1) + manipulatedString.substring(substring2);
								manipulatedString = substringFormula;
								System.out.println("The new sentence is: "+manipulatedString);
								j = manipulatedString.length(); //ends the loop
							}
						}
					}
				}
			}
			
			else if(command.equalsIgnoreCase("quit")) {
				loopChecker = 0;
				keyboard.close(); //ends the program
			}
			else {
				System.out.println("Invalid command, try again"); //goes back to beginning
			}
		}
	}
}

