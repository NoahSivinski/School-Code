/*
 * CSCI 1301.java
 * Author: [Mamadou Ly]
 * Submission Date:  [03/19/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The program demonstrated below shows the many ways you can change a string by removing letters, replacing them, or reversing them.
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
		String input = keyboard.nextLine();
		String command;
		Boolean active = true;
		
		while (active == true) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			
			if (command.equalsIgnoreCase("reverse")) {
				String inputBackwards = input.substring(input.length()-1);
				for(int i = (input.length()-1); i>0; i--) {
					inputBackwards = inputBackwards + input.substring((i-1),i);
				}
				System.out.println("The new sentence is: " + inputBackwards);
				input = inputBackwards;
			}
			else if (command.equalsIgnoreCase("remove")) {
				String removeaLetter;
				System.out.println("Enter the character to remove");
				removeaLetter = keyboard.nextLine();
				System.out.println("Enter the " + removeaLetter + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				int numToRemove = Integer.parseInt(keyboard.nextLine());
				int counter = 0;
				for (int i = 0; i < input.length(); i++) {
					if (removeaLetter.charAt(0) == input.charAt(i)) {
						counter ++;
						if(counter == numToRemove) {
							input = input.substring(0,i) + input.substring(i+1);
							i = input.length();
						}
					
					}
				}
				if (counter < numToRemove) {
					System.out.println("Error: the letter you are trying to remove does not exist");	
				}
				else {
					System.out.println("The new sentence is: " + input);
				}
			}
			else if (command.equalsIgnoreCase("replace last")) {
				String replacement;
				String instance;
				System.out.println("Enter the character to replace");
				instance = keyboard.nextLine();
				System.out.println("Enter the new character");
				replacement = keyboard.nextLine();
				for (int i = input.length()-1; i > 0; i--) {
					if (instance.charAt(0) == input.charAt(i)) {
						input = input.substring(0,i) + replacement + input.substring(i+1);
						System.out.println("The new sentence is: " + input);
						i = 0;
					}
				}
			}
			else if (command.equalsIgnoreCase("replace first")) {
				String fReplacement;
				String fInstance;
				System.out.println("Enter the character to replace");
				fInstance = keyboard.nextLine();
				System.out.println("Enter the new character");
				fReplacement = keyboard.nextLine();
				for (int i = 0; i < input.length(); i++) {
					if (fInstance.charAt(0) == input.charAt(i)) {
						input = input.substring(0,i) + fReplacement + input.substring(i+1);
						System.out.println("The new sentence is: " + input);
						i = input.length();
			}
					else {
					System.out.println("The letter was not found in the word");
					}	
		}
		
	}
			else if (command.equalsIgnoreCase("remove all")) {
				String removeLetters;
				System.out.println("Enter the character to remove");
				removeLetters = keyboard.nextLine();
				for (int i = input.length()-1; i > 0; i--) {
					if (removeLetters.charAt(0) == input.charAt(i)) {
						input = input.substring(0, i) + input.substring(i+1);
					}
					else {
						System.out.println("The letter was not found in the word");
						}	
				}
				System.out.println("The new sentence is: " + input);
			}
			else if (command.equalsIgnoreCase("quit")) {
				active = false;
				System.exit(0);
			}
			else {
				System.out.println("Invalid Command.");
			}
}
	}
}
