/*
 * [StringFun].java
 * Author:  [Anchal Patel] 
 * Submission Date:  [March 12, 2021]
 *
 * Purpose: The purpose of my program is to be able to create an environment
 * where the user can enter a string and then manipulate
 * it using five basic commands.
 * 
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
		
		
		String inputString;
		String userCommand;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		inputString = keyboard.nextLine();
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		
		do {
			
			
			
			userCommand = keyboard.nextLine();
			
			
			
			
			if (userCommand.equalsIgnoreCase("REVERSE")) {
				String inputStringReverse = "";
				for (int i = inputString.length(); i > 0; i--) {
					inputStringReverse += inputString.charAt(i-1);
				}
				inputString = inputStringReverse;
				System.out.println("The new sentence is: " + inputString);
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			}
			
			
			else if (userCommand.equalsIgnoreCase("REPLACE FIRST")) {
				char charReplace; 
				int charReplaceIndex = 0;
				char charNew;      
				System.out.println("Enter the character to replace");
				charReplace = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				charNew = keyboard.next().charAt(0);
				
				
				boolean firstFound = false;
				for(int i = 0; i < inputString.length(); i++) {
					if (firstFound != true) {
						if (inputString.charAt(i) == charReplace) {
							charReplaceIndex = i;
							firstFound = true;
						}
					}
				}
				
			
				if (firstFound == true) {
					inputString = inputString.substring(0,charReplaceIndex) + charNew + inputString.substring(charReplaceIndex+1);	
					System.out.println("The new sentence is: " + inputString);
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				}
				else {
					System.out.println("The letter was not found in the word");
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				}
			}
			
			
			else if (userCommand.equalsIgnoreCase("REPLACE LAST")) {
				char charReplace; 
				int charReplaceIndex = 0; 
				char charNew;     
				System.out.println("Enter the character to replace");
				charReplace = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				charNew = keyboard.next().charAt(0);
				
				
				boolean lastFound = false;
				for(int i = inputString.length()-1; i > 0; i--) {
					if (lastFound != true) {
						if (inputString.charAt(i) == charReplace) {
							charReplaceIndex = i;
							lastFound = true;
						}
					}
				}
				
				
				if (lastFound == true) {
					inputString = inputString.substring(0,charReplaceIndex) + charNew + inputString.substring(charReplaceIndex+1);	
					System.out.println("The new sentence is: " + inputString);
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				}
				else {
					System.out.println("The letter was not found in the word");
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				}
			}
			
			
			else if(userCommand.equalsIgnoreCase("REMOVE")) {
				char charRemove; 
				int charRemoveIndex = 0; 
				int charRemoveInstance; 
				System.out.println("Enter the character to remove");
				charRemove = keyboard.next().charAt(0);
				System.out.println("Enter the "+ charRemove +" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				charRemoveInstance = keyboard.nextInt();
				
				
				int instanceCounter = 0;
				for(int i = 0; i < inputString.length(); i++) {
					if (inputString.charAt(i) == charRemove) {
						instanceCounter ++;
						if (instanceCounter == charRemoveInstance) {
							charRemoveIndex = i;
						}
					}	
				}
				
				
				
				if (charRemoveInstance > instanceCounter) {
					System.out.println("Error: the letter you are trying to remove does not exist");
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				}
				else {
					inputString = inputString.substring(0,charRemoveIndex) + inputString.substring(charRemoveIndex+1);		
					System.out.println("The new sentence is: " + inputString);	
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				}
			}
			
			
			else if(userCommand.equalsIgnoreCase("REMOVE ALL")) {
				char charRemove; 
				System.out.println("Enter the character to remove");
				charRemove = keyboard.next().charAt(0);
				
				String inputStringRemoveAll = ""; //
				for(int i = 0; i < inputString.length(); i++) {
					if (inputString.charAt(i) != charRemove) {
						inputStringRemoveAll += inputString.charAt(i);
					}
				}
				inputString = inputStringRemoveAll;
				System.out.println("The new sentence is: " + inputString);
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			}

			
			else if(userCommand.equalsIgnoreCase("QUIT")) {
				System.out.println("...Execution Ends...");
				System.exit(0);
			}
			
		} while(!userCommand.equalsIgnoreCase("QUIT"));	
		keyboard.close();
	}
}

		
		
		
		
		
		
		
		
		
	




