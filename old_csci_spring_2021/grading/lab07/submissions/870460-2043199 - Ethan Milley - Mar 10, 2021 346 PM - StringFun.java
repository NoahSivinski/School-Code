/*
 * StringFun.java
 * Author:  Ethan Milley 
 * Submission Date:  3/10/21
 *
 * Purpose: This Program manipulates a string based on a command
 * given by the user. It does this by using a variety of loops and 
 * branching statements. However, it is limited to a small set of
 * commands.
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
		
		String string; //The string that the user wants to manipulate
		String command; //The command the user wants to use
		String newString; //Temporary placeholder for string during manipulation
		
		char current; //Current character the user wants to replace/remove
		char replacement; //The character the user wants to replace current with 
		char character; //Current character being manipulated 
		
		int stringLength; //Length of the string
		int count; //Placeholder variable used in loops
		int currentI; //Index position of the variable "current"
		int desiredChar; //Used to determine which character to remove
		int currentP; //Position of variable "current" used to determine removal
		
		boolean run;//Determines whether or not to run a loop
		
		System.out.println("Enter the string to be manipulated");
		string = keyboard.nextLine();
		
		do {
			stringLength = string.length();
			newString = "";
			count = 0;
			currentP = 0;
			run = true;
			
			System.out.println("Enter your command (reverse, replace first, replace last,"
			+ " remove all, remove, quit)");
			command = keyboard.nextLine();
			
			if (command.equalsIgnoreCase("Reverse")) {
				count++;
				
				while (count < (stringLength + 1)) {
				character = string.charAt(stringLength - count);	
				newString = newString + character;
				count++;
				}
				string = newString;
				System.out.println(string);
			}
			
			else if (command.equalsIgnoreCase("Replace First")) {
				System.out.println("Enter the character to replace");
				current = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				System.out.println("Enter the new character");
				replacement = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				character = string.charAt(count);
				
				for (count = 0; ((current != character) && (run)); count++) {
					character = string.charAt(count);
		
					if ((current != character) && (count == stringLength - 1)) {
						run = false;
						System.out.println("Error: letter was not found in string");		
					}
					else {
						run = true;
					}
				}
				if (count == 0) {
					currentI = count;
					}
					else {
						currentI = count - 1;
					}
				if (run) {
					newString = string.substring(0,(currentI));
					string = string.substring(currentI + 1);
				
					string = newString + replacement + string;
					System.out.println(string);
				}
			}
			
			else if (command.equalsIgnoreCase("Replace Last")) {
				System.out.println("Enter the character to replace");
				current = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				System.out.println("Enter the new character");
				replacement = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				count++;
				character = string.charAt(stringLength - count);
				
				for (count = 1; ((current != character) && (run)); count++) {
					character = string.charAt(stringLength - count);
					
					if ((current != character) && ((stringLength - count) == 0 )) {
						run = false;
						System.out.println("Error: letter was not found in string");
					}
					else {
						run = true;
					}
				}
				if (run) {
					currentI = count - 1;
					
					newString = string.substring(0,(stringLength - currentI));
					string = string.substring((stringLength - currentI) + 1);
				
					string = newString + replacement + string;
					System.out.println(string);
				}
			}

			else if (command.equalsIgnoreCase("Remove")) {
				System.out.println("Enter the character to remove");
				current = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				System.out.println("Enter the " + current + " you would like to remove" +
				"(Not the index - 1 = 1st, 2 = 2nd, etc):");
				desiredChar = keyboard.nextInt();
				keyboard.nextLine();
				
				character = string.charAt(0);
				
				for (count = 0; ((current != character) && (run)); count++) {
					character = string.charAt(count);
					
					if ((current != character) && (count == stringLength - 1)) {
						run = false;	
						System.out.println("Error: letter was not found in string");
					}
					else {
						run = true;
					}
				}
				character = string.charAt(0);
				count = 0;
				
				while ((currentP < desiredChar) && (run)) {
					for (count = count; ((current != character) && (run)); count++) {
						character = string.charAt(count);
			
						if ((current != character) && (count == stringLength - 1)) {
							run = false;
							System.out.println("Error: letter was not found in string");
						}
						else {
							run = true;
						}
					}
					
					currentP++;
					character = string.charAt(count + 1);
				}
				
				if ((run) && (currentP == desiredChar)) {
					if (count == 0) {
						currentI = count;
					}
					else {
						currentI = count - 1;
					}
				
					newString = string.substring(0,(currentI));
					string = string.substring(currentI + 1);
				
					string = newString + string;
					System.out.println(string);
				}
			}
			
			else if (command.equalsIgnoreCase("Remove All")) {
				System.out.println("Enter the character to remove");
				current = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				character = string.charAt(0);
				
				for (count = 0; ((current != character) && (run)); count++) {
					character = string.charAt(count);
					
					if ((current != character) && (count == stringLength - 1)) {
						run = false;	
						System.out.println("Error: letter was not found in string");
					}
					else {
						run = true;
					}
				}
				character = string.charAt(0);
				
				while (run) {
					for (count = 0; ((current != character) && (run)); count++) {
						character = string.charAt(count);
						
						if ((current != character) && (count == stringLength - 1)) {
							run = false;	
						}
						else {
							run = true;
						}
					}
					if (count == 0) {
						currentI = count;
					}
					else {
						currentI = count - 1;
					}
					
					if (run) {
						newString = string.substring(0,(currentI));
						string = string.substring(currentI + 1);
					
						string = newString + string;
						stringLength = string.length();
					
						count = 0;
						character = string.charAt(count);
					}
				}
				System.out.println(string);
			}
			else if (command.equalsIgnoreCase("Quit")) {
				System.exit(0);
			}
			else {
				System.out.println("Error: invalid command, please enter valid command");
			}
		} while (!(command.equalsIgnoreCase("Quit")));
	}
}
