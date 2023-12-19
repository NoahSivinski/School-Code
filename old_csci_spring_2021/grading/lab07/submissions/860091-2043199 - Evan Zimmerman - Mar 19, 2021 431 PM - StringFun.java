/*
 * StringFun.java
 * Author:  Evan Zimmerman 
 * Submission Date:  19th March 2021
 *
 * Purpose: The exercise being explored by Lab #7 is to build on learned material about Strings and methods.
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
		
		Scanner input = new Scanner(System.in);
		
		//Prompt for a string.
		System.out.println("Enter the string to be manipulated");
		String userString = input.nextLine();
		
		//Declare a boolean to keep the do-while loop running for as long as the user doesn't enter "quit."
		Boolean quit = false;
		
		//Do-while loop to run the program for as long as the user wants.
		do {
			
			//Prompts for a command.
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String userInput = input.nextLine();
			
			//If reverse, goes through the string to add another copy of each letter except the last one(going from right to left) and then
			//using a substring to delete everything but the last character, this results in a reversed String.
			if (userInput.equalsIgnoreCase("reverse")) {
				int stringOriginalLength = userString.length();
				for (int i = userString.length()-1; i >= 0; i--) {
					char indexChar = userString.charAt(i);
					userString += indexChar;
				}
				userString = userString.substring(stringOriginalLength);
				System.out.println("The new sentence is: " + userString);
			}
			
			//Replace First
			if (userInput.equalsIgnoreCase("replace first")) {
				//Prompts for a character, and gets it as a char value from the user's input
				System.out.println("Enter the character to replace");
				String charToBeReplacedString = input.next();
				char charToBeReplaced = charToBeReplacedString.charAt(0);
				//Same as above, but with the character that will replace the previous one
				System.out.println("Enter the new character");
				String charToReplaceWithString = input.next();
				char charToReplaceWith = charToReplaceWithString.charAt(0);
				
				//Declares a boolean to keep the loop running, and declares two "sentence fragment" strings
				//because the character is removed and replaced in the string using substrings that are then
				//stitched back together.
				boolean haveReplacedCharacter = false;
				String sentenceFrag1;
				String sentenceFrag2;
				
				//Declares variables for the do-while loop
				int loopCount = 0;
				int replacedCharIndex = -1;
				do {
					//If the char at the index of the string matches the intended char to replace, records the index of the char.
					if (charToBeReplaced == userString.charAt(loopCount)) {
						replacedCharIndex = loopCount;
						haveReplacedCharacter = true;
					}
					loopCount++;
				} while (!haveReplacedCharacter && loopCount < userString.length());
				
				//If the character was not replaced, it means it was not found, and notifies the user.
				//Otherwise it takes two substrings, excluding the character intended to be replaced, and adds the new
				//char to the first substring, and the two Strings are put together to form the new complete String.
				if (!haveReplacedCharacter) {
					System.out.println("The letter was not found in the word");
				} else {
				sentenceFrag1 = userString.substring(0, replacedCharIndex);
				sentenceFrag2 = userString.substring(replacedCharIndex+1);
				sentenceFrag1 += charToReplaceWith;
				userString = sentenceFrag1 + sentenceFrag2;
				System.out.println("The new sentence is: " + userString);
				}
			}
			
			//Replace last is functionally identical to replace first, except the do-while loop reads the String from
			//right to left instead of left to right.
			if (userInput.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				String charToBeReplacedString = input.next();
				char charToBeReplaced = charToBeReplacedString.charAt(0);
				
				System.out.println("Enter the new character");
				String charToReplaceWithString = input.next();
				char charToReplaceWith = charToReplaceWithString.charAt(0);
				
				boolean haveReplacedCharacter = false;
				String sentenceFrag1;
				String sentenceFrag2;
				
				int loopCount = userString.length()-1;
				int replacedCharIndex = -1;
				do {
					if (charToBeReplaced == userString.charAt(loopCount)) {
						replacedCharIndex = loopCount;
						haveReplacedCharacter = true;
					}
					loopCount--;
				} while (!haveReplacedCharacter && loopCount >= 0);
				
				if (!haveReplacedCharacter) {
					System.out.println("The letter was not found in the word");
				} else {
				sentenceFrag1 = userString.substring(0, replacedCharIndex);
				sentenceFrag2 = userString.substring(replacedCharIndex+1);
				sentenceFrag1 += charToReplaceWith;
				userString = sentenceFrag1 + sentenceFrag2;
				System.out.println("The new sentence is: " + userString);
				}
			}
			
			//Remove specific character
			if (userInput.equalsIgnoreCase("remove")) {
				//Gets char from an input
				System.out.println("Enter the character to remove");
				String charToBeRemovedString = input.next();
				char charToBeRemoved = charToBeRemovedString.charAt(0);
				
				//Determines number of time that the specified character occurs in the String
				int noOfSpecChar = 0;
				for(int i = 0; i < userString.length()-1;i++) {
					if (charToBeRemoved == userString.charAt(i)) {
						noOfSpecChar++;
					}
				}
				
				//Notifies user if the specified character is not present in the String
				if (noOfSpecChar == 0) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					//Prompts user for specific instance of the character to be removed
					System.out.println("Enter the " + charToBeRemoved + " that you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
					int instanceToRemove = input.nextInt();
					//Extra nextLine input to prevent the commands list from being printed twice
					String fillerInput = input.nextLine();
					//Declare boolean and sentence fragment substrings
					boolean haveRemovedCharacter = false;
					String sentenceFrag1;
					String sentenceFrag2;
					
					//do-while loop
					int loopCount = 0;
					int removedCharIndex = -1;
					noOfSpecChar = 0;
					do {
						//"noOfSpecChar" increases every time the char in the string matches the specified char, if
						//"noOfSpecChar" reaches the user's specified instance of the char, it records the index and
						//changes the boolean to true which breaks the do-while loop.
						if (charToBeRemoved == userString.charAt(loopCount)) {
							noOfSpecChar++;
							if (instanceToRemove == noOfSpecChar) {
								removedCharIndex = loopCount;
								haveRemovedCharacter = true;
							}
						}
						loopCount++;
					} while (!haveRemovedCharacter && loopCount < userString.length()-1);
					
					//If the instance to be removed is higher than the times the char is present in the String, it notifies
					//the user.
					if (instanceToRemove > noOfSpecChar) {
						System.out.println("Error: the letter you are trying to remove does not exist");
					} else {
					//Stitches together the substrings.
					sentenceFrag1 = userString.substring(0, removedCharIndex);
					sentenceFrag2 = userString.substring(removedCharIndex+1);
					userString = sentenceFrag1 + sentenceFrag2;
					System.out.println("The new sentence is: " + userString);
					}
				}
			}
			
			if (userInput.equalsIgnoreCase("remove all")) {
				//Prompts for the character to be removed.
				System.out.println("Enter the character to remove");
				String charToBeRemovedString = input.nextLine();
				char charToBeRemoved = charToBeRemovedString.charAt(0);
				
				//Like before, finds out the number of times the specified character is in the String.
				int noOfSpecChar = 0;
				for(int i = 0; i < userString.length()-1;i++) {
					if (charToBeRemoved == userString.charAt(i)) {
						noOfSpecChar++;
					}
				}
				
				//If the character is not present, notifies the user.
				if (noOfSpecChar == 0) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					//Declare variables.
					boolean haveRemovedCharacter;
					String sentenceFrag1;
					String sentenceFrag2;
					int loopCount;
					int removedCharIndex;
					//Runs a for-loop for as many times as the character appears in the String, and in each
					//iteration of the loop, breaks the String into substrings and re-arranges them minus each
					//appearance of the specified character.
					for (int i = 0; i < noOfSpecChar; i++) {
						loopCount = 0;
						removedCharIndex = 0;
						haveRemovedCharacter = false;
						do {
							if (charToBeRemoved == userString.charAt(loopCount)) {
									removedCharIndex = loopCount;
									haveRemovedCharacter = true;
								}
							loopCount++;
						} while (!haveRemovedCharacter && loopCount < userString.length()-1);
						sentenceFrag1 = userString.substring(0, removedCharIndex);
						sentenceFrag2 = userString.substring(removedCharIndex+1);
						userString = sentenceFrag1 + sentenceFrag2;
					}
					System.out.println("The new sentence is: " + userString);
			}
			
			}
			
			//If the user enters "quit", changes the Boolean to true which breaks the do-while loop.
			if (userInput.equalsIgnoreCase("quit")) {
				quit = true;
			}
			
		} while (!quit);
		
		input.close();
		
	}

}
