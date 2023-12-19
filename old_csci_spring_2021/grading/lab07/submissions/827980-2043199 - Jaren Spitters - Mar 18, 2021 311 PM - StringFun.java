/*
 * StringFun.java
 * Author:  Jaren Spitters 
 * Submission Date:  3/18/21
 *
 * Purpose: This program prompts a user for a string. It then allows the user to perform actions on the string, such as removing 
 * characters, reversing the string, and replacing characters with other characters. The user can perform as many actions as they 
 * want, and then they type in the quit command when they are done so the program terminates. 
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
		String userString = keyboard.nextLine();
		String newString = "";
		
		boolean commandIsValid = false;
		boolean running = true;
		String command = "";
		
		
		while (running) {
			
			while (commandIsValid == false) { 
		
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			
				if ((command.equalsIgnoreCase("reverse")) || (command.equalsIgnoreCase("replace first")) || 
					(command.equalsIgnoreCase("replace last")) || (command.equalsIgnoreCase("remove all")) || 
					(command.equalsIgnoreCase("remove")) || (command.equalsIgnoreCase("quit"))) {
				
				commandIsValid = true;
				
				} else { 
				
				commandIsValid = false;
				System.out.println("Error: command is not valid - please enter a valid command");
				}
			}
			
			if (command.equalsIgnoreCase("reverse")) {
		
				for (int i = userString.length(); i>0; --i) {  
			
					newString = newString + (userString.charAt(i-1));
			}
			
				userString = newString;
				System.out.println("the new sentence is: " + userString);
				commandIsValid = false;
			}
		
			if (command.equalsIgnoreCase("replace first")) {
				
				System.out.println("Enter the character to replace");
				char originalChar = keyboard.nextLine().charAt(0);
				
				System.out.println("Enter the new character");
				char replacingChar = keyboard.nextLine().charAt(0);
				
				int index = -1;
				
				for (int i = 0; i<userString.length(); ++i) {
					
					if (userString.charAt(i) == originalChar) {
						index = i;
						i = userString.length();
					}
				}
				
				if (index == -1) {
					
					System.out.println("The letter was not found in the word");
					commandIsValid = false;
					
				} else {
				
				String beginning = userString.substring(0,index);
				String end = userString.substring(index + 1,userString.length());
				userString = beginning + replacingChar + end;
				System.out.println("The new sentence is : " + userString);
				commandIsValid = false;
				}
			}
			
			if (command.equalsIgnoreCase("replace last")) {
				
				System.out.println("Enter the character to replace");
				char originalChar = keyboard.nextLine().charAt(0);
				
				System.out.println("Enter the new character");
				char replacingChar = keyboard.nextLine().charAt(0);
				
				int index = -1;
				
				for (int i = 0; i<userString.length(); ++i) {
					
					if (userString.charAt(i) == originalChar) {
						index = i;
					}
				}
				
				if (index == -1) {
					
					System.out.println("The letter was not found in the word");
					commandIsValid = false;
				
				} else {
					
					String beginning = userString.substring(0,index);
					String end = userString.substring(index + 1,userString.length());
					userString = beginning + replacingChar + end;
					System.out.println("The new sentence is: " + userString);
					commandIsValid = false;
				}
			}
			
			if (command.equalsIgnoreCase("remove all")) {
				
				System.out.println("Enter the character to remove");
				char removeChar = keyboard.nextLine().charAt(0);
				
				int instances = 0;
				int index = -1;
				newString = userString;
				
				for (int i = 0; i<newString.length(); ++i) {
					
					if (userString.charAt(i) == removeChar) {
						
						index = i;
						instances += 1;
						String beginning = newString.substring(0,index + 1 - instances);
						String end = newString.substring(index + 2 - instances,newString.length());
						newString = beginning + end;
					}
				}
				
				if (index == -1) {
					
					System.out.println("The letter was not found in the word");
					commandIsValid = false;
					
				} else {
				
					userString = newString;
					System.out.println("The new sentence is: " + userString);
					commandIsValid = false;
				}
			}
			
			if (command.equalsIgnoreCase("remove")) {
				
				System.out.println("Enter the character to remove");
				char removeChar = keyboard.nextLine().charAt(0);
				
				System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int wanted = keyboard.nextInt();
				
				@SuppressWarnings("unused")							//so that the next instance of nextLine does not pick up the empty
				String emptyStr = keyboard.nextLine();				//space left by nextInt, and the warning for an unused variable leaves
				
				int instances = 0;
				int index = -1;
				
				for (int i = 0; i<userString.length(); ++i) {
					 
					if (userString.charAt(i) == removeChar) {
						
						instances += 1;
						
						if (instances == wanted) {
							
							index = i;
							i = userString.length();
						}
					}
				}
				if ((index == -1 && instances >= wanted) || (index == -1 && instances == 0)) {
					
					System.out.println("The letter was not found in the word");
					commandIsValid = false;
				
				} else if (wanted > instances) {
					
					System.out.println("Error: the letter you are trying to remove does not exist");
					commandIsValid = false;
					
				} else {
					
					String beginning = userString.substring(0,index);
					String end = userString.substring(index + 1,userString.length());
					userString = beginning + end;
					System.out.println("The new sentence is: " + userString);
					commandIsValid = false;
				}
			}
			
			if (command.equalsIgnoreCase("quit")) {
				
				System.exit(0);			
			}
		}
			
		keyboard.close();
	}
}
