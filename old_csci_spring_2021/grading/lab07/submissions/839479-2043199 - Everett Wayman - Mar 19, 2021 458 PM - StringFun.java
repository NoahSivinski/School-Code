/*
 * StringFun.java
 * Author: Everett Wayman
 * Submission Date: 03/19/21
 *
 * Purpose: My program allows the user to edit an input string.
 * The user is able to reverse, replace a the first or last letter, 
 * or remove one or all of a letter in a string.
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
		
		// Prompts user to input a string.
		System.out.println("Enter the string to be manipulated");
		String phrase = keyboard.nextLine();
	
		// Here the command string is declared
		String command;
		
		// Boolean used so that while loop can run.
		boolean alterPhrase = true;
		
		// This is the main loop where all the different commands can be found
		// and used by the user.
		while (alterPhrase){
			
			// Prompts user what command they would like to use.
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			
			// This stops the program from displaying a invalid input 
			// when there isn't one.
			if(command.equals("")) {
				command = keyboard.nextLine();
			}
			
			// The reverse command starts indexing the string from the end
			// the the beginning and prints out the string backwards. The 
			// letter j is used as a counter for each command.
			if (command.equalsIgnoreCase("reverse")) {
				String reverse = "";
				for (int j = phrase.length() - 1; j >= 0; j--) {
					reverse = reverse + phrase.charAt(j);
				}
				phrase = reverse;
				System.out.println("The new sentence is: " + phrase);
			} 
			
			// This command replaces the first instance of a letter in the string.
			else if (command.equalsIgnoreCase("replace first")){
				
				// User enters the letter the want to replace and what they
				// want to replace it with.
				System.out.println("Enter the character to replace");
				char oldChar = keyboard.next().charAt(0);
				
				System.out.println("Enter the new character");
				char newChar = keyboard.next().charAt(0);
								
				String replaceFirst = ""; 
				
				// In this loop the program goes through each character
				// and checks if it is the one that needs to be changed.
				// If it is the correct character then replaces it and prints
				// out the rest of the phrase unchanged. If it is not the correct
				// the program just prints out the original character, unchanged.
				for (int j = 0; j < phrase.length(); j++ ) {
				 
					if (oldChar == phrase.charAt(j)) {
						replaceFirst += newChar;
					    replaceFirst += phrase.substring(j + 1);
					     j = phrase.length();
					}
					else {
						replaceFirst += phrase.charAt(j);
					}
					
				}
				if (replaceFirst.equals(phrase)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					phrase = replaceFirst;
					System.out.println("The new sentence is: " + phrase);
				}
				
			}
			
			// This command only replaces the last instance of a character.
			else if (command.equalsIgnoreCase("replace last")) {
                System.out.println("Enter the character to replace");
                char newChar = keyboard.next().charAt(0);
               
                System.out.println("Enter the new character");
                char oldChar = keyboard.next().charAt(0);
               
                String replaceLast = "";
                boolean searching = true;
                
                // This loop index through the phrase backwards to find the last
                // instance of the character. The new string is reversed.
                for (int i = phrase.length(); i > 0; --i) {
                    replaceLast += (phrase.charAt(i - 1));
                }
                String step1String = replaceLast;
                replaceLast = "";
                for (int i = 0; step1String.length() > i; i++) {
                    char currentChar = step1String.charAt(i);

                    if (currentChar == newChar && searching) {
                        currentChar = oldChar;
                        searching = false;
                        replaceLast += (currentChar);
                    } 
                    else {
                        replaceLast += (step1String.charAt(i));
                    }
                }
                String step2String = replaceLast;
                replaceLast = "";
                
                // This loop takes the reversed string and turns it back to how it was. 
                for (int i = step2String.length(); i > 0; --i) {
                    replaceLast += (step2String.charAt(i - 1));
                }
                if (replaceLast.equals(phrase)) {
                    System.out.println("The letter was not found in the word");
                } 
                else {
                    phrase = replaceLast;
                    System.out.println("The new sentence is: " + phrase);
                }
          
			}
			
			// This command removes all instances of a character.
			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char removedChar = keyboard.next().charAt(0);
				
				String removedAllString = "";
				
				// The loop goes through each character determining if it needs to
				// be taken out depending if character in the phrase matched the one
				// wanting to be removed.
				for (int i = 0; phrase.length() > i; i++) {
					char currentChar = phrase.charAt(i);
					
					if (currentChar == removedChar) {
						
					}
					else {
						removedAllString += (phrase.charAt(i));
					}
				}
				if (removedAllString.equals(phrase)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					phrase = removedAllString;
					System.out.println("The new sentence is: " + phrase);
				}
				
			}
			
			// This command removes the single instance of a letter that the user wants.
			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char removedChar = keyboard.next().charAt(0);
				
				System.out.println("Enter the " + removedChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.): ");
				int instanceOfRemovedChar = keyboard.nextInt();
				
				// Starts at 1 because the index starts at 0. This way they will match.
				int removedCharCounter = 1;
				String removedCharString = "";
				
				// Loop goes through each character and if it matches the one wanted to be removed it
				// will remove it at the specified location and print the rest of the string out.
				for (int j = 0; j < phrase.length(); j++) {
					if(phrase.charAt(j) == removedChar) {
						if(removedCharCounter == instanceOfRemovedChar) {
							removedCharCounter++;
						}
						else {
							removedCharString += phrase.charAt(j);
							removedCharCounter++;
						}
					}
					else {
						removedCharString += phrase.charAt(j);
					}
				}
				if (removedCharString.equals(phrase)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					phrase = removedCharString;
					System.out.println("The new sentence is: " + phrase);
				}
	
			} 
			// This command quits the program.
			else if (command.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			// If a command given does not equal one of the listed commands the program
			// will prompt the user to enter another command.
			else {
				System.out.println("Invalid command, please try again");
			
			}
			
		} 
		keyboard.close();
	}

}
