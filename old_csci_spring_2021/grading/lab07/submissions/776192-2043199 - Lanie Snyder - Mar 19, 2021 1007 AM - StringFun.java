/*
 * StringFun.java
 * Author:  Lanie Snyder 
 * Submission Date:  March 19, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * In this program, the user inputs a sentence and how they want 
 * that sentence to be manipulated. It can be manipulated by 
 * reversing it, replacing the first of a specific character with
 * another character, replacing the last of a specific character
 * with another character, removing a specific character, and 
 * removing all instances of a specific character. This process
 * will continue until the user tell the program to exit. 
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
		String usersSentence; // Sentence that user inputs
		String usersChoice; // How the user wants the string to be manipulated 
		int length; // Length of the inputed sentence 
		length = 0;
		char letter; //The current letter in the inputed sentence that the loop is on
		String newSentence; // Used to build the reversed sentence
		String oldCharString; //The character the user wants to remove/replace as a string
		String newCharString; //The character the user wants to put into the sentence as a string
		char oldChar; //The character the user wants to remove/replace as a char
		char newChar; //The character the user wants to put into the sentence as a char
		int originalLength; // Original length of inputed sentence 
		int count; //Used to count loops for replace first, remove, and remove all
		int charNumber; //Which number of the specific character the user wants removed when using "remove"
		// Which number of the specific character that the user wants removed in the sentence that the loop is on
		int amount; 
	
		System.out.println("Enter the string to be manipulated");
		usersSentence = keyboard.nextLine();
		
		do
		{
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			usersChoice = keyboard.nextLine();
		
			//User picks reverse
			if (usersChoice.equalsIgnoreCase("reverse"))
			{
				newSentence = ""; // To reset the string after every loop
				length = usersSentence.length();
				while (length > 0)
				{
					letter = usersSentence.charAt(length - 1); 
					// Minus one because the index starts at 0 and length starts at 1
					
					newSentence = newSentence + letter; //Adds each letter one by one
					length = length - 1;
				}
				usersSentence = newSentence;
				System.out.println("The new sentence is: " + usersSentence);
			}
			
			//User picks replace first
			else if (usersChoice.equalsIgnoreCase("replace first"))
			{
				System.out.println("Enter the character to replace");
				oldCharString = keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharString = keyboard.nextLine();
				oldChar = oldCharString.charAt(0); // To get the character that is in type string to type char
				newChar = newCharString.charAt(0); // To get the character that is in type string to type char
				
				length = usersSentence.length();
				count = 0; // To reset after every loop
				
				while (count < length)
				{
					letter = usersSentence.charAt(count); 

					if (oldChar == letter) // The current character matches the character to be replaced
					{
						usersSentence = usersSentence.substring(0,count) + newChar + 
										usersSentence.substring((count + 1),length);
						
						System.out.println("The new sentence is: " + usersSentence);
						count = length + 1; //To make while loop stop. 
						//The + 1 is so it does not equal length because that would be when the letter is not found
					}
					else // The current character does not match the character to be replaced
					{
						count = count + 1;
					}
				}
				if (count == length) //The character the user wanted to replace is not in the sentence 
				{
					System.out.println("The letter was not found in the word");
				}
			}
			
			//User picks replace last
			else if (usersChoice.equalsIgnoreCase("replace last"))
			{
				System.out.println("Enter the character to replace");
				oldCharString = keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharString = keyboard.nextLine();
				oldChar = oldCharString.charAt(0); // To get the character that is in type string to type char
				newChar = newCharString.charAt(0); // To get the character that is in type string to type char
				
				length = usersSentence.length();
				originalLength = length;
				
				while (length > 0)
				{
					letter = usersSentence.charAt(length - 1); 
					// Minus one because the index starts at 0 and length starts at 1
		
					if (oldChar == letter) // The current character matches the character to be replaced
					{
						usersSentence = usersSentence.substring(0,(length-1)) + newChar + 
										usersSentence.substring(length,originalLength);
						
						System.out.println("The new sentence is: " + usersSentence);
						length = -1; //To make while loop stop
					}
					else // The current character does not match the character to be replaced
					{
						length = length - 1;
					}
				}
				if (length == 0) //The character the user wanted to replace is not in the sentence 
				{
					System.out.println("The letter was not found in the word");
				}	
			}
			
			//User picks remove
			else if (usersChoice.equalsIgnoreCase("remove"))
			{
				System.out.println("Enter the character to remove");
				oldCharString = keyboard.nextLine();
				oldChar = oldCharString.charAt(0); // To get the character that is in type string to type char
		
				System.out.println("Enter the " + oldChar + 
									" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				charNumber = keyboard.nextInt();
				newSentence = keyboard.nextLine(); //To get rid of the "/n" after the number
				length = usersSentence.length();
				
				//To reset after every loop
				amount = 0;
				count = 0;
				
				while (count < length)
				{
					letter = usersSentence.charAt(count); 
					
					if (oldChar == letter) // The current character matches the character to be removed
					{
						amount = amount + 1;
						
						// The current character is the specific one the user wanted to remove
						if (amount == charNumber) 
						{
							usersSentence = usersSentence.substring(0,count) + 
											usersSentence.substring((count + 1), length);
							count = length; //To stop the loop
						}		
					}
					count = count + 1;
				}
				if (amount == 0) //The input had zero of the specific character
				{
					System.out.println("The letter was not found in the word"); 
					// No period because the examples did not have any
				}
				else if (amount != charNumber) // The input did not have that many of the specific character
				{
					System.out.println("Error: the letter you are trying to remove does not exist"); 
				}
				else // The input did have that many of the specific character
				{
					System.out.println("The new sentence is: " + usersSentence);
				}	
			}
			
			//User picks remove all
			else if (usersChoice.equalsIgnoreCase("remove all"))
			{
				System.out.println("Enter the character to remove");
				oldCharString = keyboard.nextLine();
				oldChar = oldCharString.charAt(0); // To get the character that is in type string to type char
				
				length = usersSentence.length();
				originalLength = length;
				count = 0; // To reset after every loop
				
				while (count < length)
				{
					letter = usersSentence.charAt(count); 
				
					if (oldChar == letter) // The current character is the specific one the user wanted to remove
					{	
						usersSentence = usersSentence.substring(0,count) + 
										usersSentence.substring((count + 1),length);
						
						length = usersSentence.length(); //The length changes each time a character is removed
					}
					else  // The current character is not the specific one the user wanted to remove
					{
						//Count does not increase if remove a letter because the index shifts because of the removed letter
						count = count + 1; 
					}
				}
				if (originalLength == length) //The character the user wanted to remove is not in the sentence 
				{
					System.out.println("The letter was not found in the word");
				}
				else //The sentence had the character that the user wanted to remove
				{
					System.out.println("The new sentence is: " + usersSentence);
				}
			}
			
			//User picks quit
			else if (usersChoice.equalsIgnoreCase("quit"))
			{
				System.exit(0);
			}
			
			// The inputed command is not an option
			else 
			{
				System.out.println("Command not found. Please try again");
				 //No period at the end because the examples did not use periods
			}
		} while (!(usersChoice.equalsIgnoreCase("quit")));
		
		keyboard.close();

	}

}
