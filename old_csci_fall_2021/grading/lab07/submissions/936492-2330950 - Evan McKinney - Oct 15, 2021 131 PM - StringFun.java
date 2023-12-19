/*
 * StringFun.java
 * Author:  Evan McKinney
 * Submission Date:  10/15/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *	This program asks the user for a string to manipulate. Then it asks the 
 *	user for a command, either reverse, replace first, replace last, remove, remove all, or quit.
 *	Reverse reverses the string, replace first/last replaces the first/last instance of a character
 *	with a new character the user inputs. Remove removes the character in the position the user inputs. 
 *	Remove all removes all instances of the character the user inputs. Quit stops the program from looping.
 *	If the user doesn't input quit, the program will keep asking for commands until the user does quit.
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
		
		Scanner keyboard = new Scanner(System.in);
		String s, command, newString = "";
		char toChange, replacement;
		
		//input for string to be manipulated
		System.out.println("Enter the string to be manipulated");
		s = keyboard.nextLine();
		
		do {
			//input for the command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			
			//reverse
			if(command.equalsIgnoreCase("reverse")) {
				for(int i = s.length() - 1; i >= 0; i--) {
					newString = newString + s.charAt(i);
				}
				System.out.println("The new sentence is: " + newString);
				
			//replace first
			}else if(command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter a character to replace");
				toChange = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replacement = keyboard.nextLine().charAt(0);
				
				//finds the index of the first appearance of the character by looping through the string backwards
				int firstIndex = -1;
				for(int i = s.length() - 1; i >= 0; i--) {
					if(s.charAt(i) == toChange) {
						firstIndex = i;
					}
				}
				
				//firstIndex was originally -1, so if its value never changed then the letter wasn't found
				if(firstIndex == -1) {
					System.out.println("The letter was not found in the word");
				}else {
					//newString becomes everything before the first index to the letter before the firstIndex plus the replacement letter
					newString = s.substring(0, firstIndex) + replacement;
					//if the firstIndex is the last index of the string, then don't want to add the letters after the firstIndex because there are none 
					if(firstIndex != s.length() - 1) {
						//adds the letters after the firstIndex
						newString = newString + s.substring(firstIndex + 1, s.length());
					}
					System.out.println("The new sentence is: " + newString);
				}
				
			//replace last
			}else if(command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter a character to replace");
				toChange = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replacement = keyboard.nextLine().charAt(0);
				
				//finds the last index by looping through the string
				int lastIndex = -1;
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == toChange) {
						lastIndex = i;
					}
				}
				
				//same as replace first
				if(lastIndex == -1) {
					System.out.println("The letter was not found in the word");
				}else {
					newString = s.substring(0, lastIndex) + replacement;
					if(lastIndex != s.length() - 1) {
						newString = newString + s.substring(lastIndex + 1, s.length());
					}
					System.out.println("The new sentence is: " + newString);
				}
				
			//remove all
			}else if(command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter a character to remove");
				toChange = keyboard.nextLine().charAt(0);
				
				
				//goes through the string and only adds it to newString if it isn't the letter the user wants removed
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) != toChange) {
						newString = newString + s.charAt(i);
					}
				}
				if(newString.equals(s)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}else {
					System.out.println("The new sentence is: " + newString);
				}
				
			//remove
			}else if(command.equalsIgnoreCase("remove")) {
				System.out.println("Enter a character to remove");
				toChange = keyboard.nextLine().charAt(0);
				
				System.out.println("Enter the " + toChange + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int positionOfCharToRemove = keyboard.nextInt();
				keyboard.nextLine();
				int charCount = 0;
				
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == toChange) {
						charCount++;
						if(charCount != positionOfCharToRemove) {
							newString = newString + s.charAt(i);
						}
					}else {
						newString = newString + s.charAt(i);
					}
				}
				//if strings end up being the same, then the letter wasn't found
				if(newString.equals(s)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}else {
					System.out.println("The new sentence is: " + newString);
				}
				
			//invalid command, needs to make sure the user didn't input quit b/c quit is a valid command
			}else if(!command.equalsIgnoreCase("quit")) {
				System.out.println("Command invalid. Try again");
			}
			//switches s to newString and newString becomes an empty string again so that the loop can
			//continue to manipulate the string s
			//if the user input an invalid command, and newString stayed empty, then don't need to switch them
			if(newString != "") {
				s = newString;
				newString = "";
			}
		//only repeats while the user didn't input quit
		}while(!command.equalsIgnoreCase("quit"));
		
		keyboard.close();
	}
}
