/*
 * StringFun.java
 * Author:  Eric Shindell 
 * Submission Date:  10/14/2021
 *
 * Purpose: This program lets the user manipulate a string of their choosing in
 * a variety of different ways, whether through inversing the order of the characters,
 * removing specific or all of a specific character, replacing specific characters, starting
 * from the left or from the right, and all of those to a single string multiple times. It then
 * lets you end the code whenever you want by stating 'quit'.
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
		
		//variables. Placeholder string names are to get rid of bugs.
		String manipulatedString;
		String command = "Placeholder";
		
		//variables for the reversed command
		String reversedString;
		
		//variables for the replace commands
		char replacedChar;
		char replacementChar;
		int start;
		String firstHalf = "Placeholder"; 
		String secondHalf = "Placeholder";
		int LoopInt;
		
		//variables for remove commands
		char removedChar;
		int whichChar; //for remove, which one to be removed
		String removedString;
		int counter;
		
		System.out.println("Enter the string to be manipulated");
		
		
		Scanner input = new Scanner(System.in);
		manipulatedString = input.nextLine();
		
		
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = input.nextLine();

			
			//rebuilds the manipulated string from the ground up by setting a new string equal to it then taking the characters backwards
			if(command.equalsIgnoreCase("reverse")) {
				reversedString = manipulatedString;
				manipulatedString = "";
				for(int i = reversedString.length() - 1; i >= 0; i--) {
					manipulatedString = manipulatedString + reversedString.charAt(i);
				}
				System.out.println("The new sentence is: " + manipulatedString);
			}
			
			else if (command.equalsIgnoreCase("replace first")) {
				
				//finds the old character
				System.out.println("Enter the character to replace");
				replacedChar = input.nextLine().charAt(0);
				
				//finds the new character
				System.out.println("Enter the new character");
				replacementChar = input.nextLine().charAt(0);
				
				start = -1; 
				LoopInt = 0;
				//Set to -1 since none of the indexs of a string can be negative
				while (start == -1 && LoopInt < manipulatedString.length()) {
					if (manipulatedString.charAt(LoopInt) == replacedChar){
						start = LoopInt; //changes start from -1 to the new number, breaking the loop.
					}
					LoopInt++; //Basically a for loop without the for.
				}				
				
				//checks to make sure the character is actually present				
				if (start != -1) {
					firstHalf = manipulatedString.substring(0, start);
					secondHalf = manipulatedString.substring(start + 1, manipulatedString.length());
		
					manipulatedString = firstHalf + replacementChar + secondHalf;
					
					//Prints the string after manipulation
					System.out.println("The new sentence is: " + manipulatedString);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
				
			}
			
			//VERY similar to the above command
			else if (command.equalsIgnoreCase("replace last")) {
				
				//finds the old character
				System.out.println("Enter the character to replace");
				replacedChar = input.nextLine().charAt(0);
				
				//finds the new character
				System.out.println("Enter the new character");
				replacementChar = input.nextLine().charAt(0);
				
				start = -1;
				LoopInt = manipulatedString.length();
				
				while (start == -1 && LoopInt > 0) {
					if(manipulatedString.charAt(LoopInt - 1) == replacedChar) {
						start = LoopInt;
					}
					LoopInt--;
				}
				
				//checks to make sure the character is actually present
				if (start != -1) {
					firstHalf = manipulatedString.substring(0, start - 1);
					secondHalf = manipulatedString.substring(start, manipulatedString.length());
		
					manipulatedString = firstHalf + replacementChar + secondHalf;
					
					//Prints the string after manipulation
					System.out.println("The new sentence is: " + manipulatedString);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
				

				
			}
			
			else if (command.equalsIgnoreCase("remove all")) {
				//finds the character to be removed
				System.out.println("Enter the character to remove");
				removedChar = input.nextLine().charAt(0);
				
				removedString = "";
				LoopInt = 0;
				for (int i = 0; i <= manipulatedString.length() - 1; i++) {
					if (manipulatedString.charAt(i) == removedChar) {
						removedString = removedString + manipulatedString.substring(LoopInt, i);
						LoopInt = i + 1;
					}
				}
			
				if (LoopInt > 0) {
					removedString = removedString + manipulatedString.substring(LoopInt);
					manipulatedString = removedString;
					System.out.println("The new sentence is: " + manipulatedString);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			
			else if (command.equalsIgnoreCase("remove")) {
			
				//finds the character to be removed
				System.out.println("Enter the character to remove");
				removedChar = input.nextLine().charAt(0);
				
				//finds which one to be removed
				System.out.println("Enter the " + removedChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				whichChar = input.nextInt();
				
				//removes the bug
				input.nextLine();
				
				LoopInt = 0; //Keeps track of how many of that character have been passed
				counter = 0; //JUst makes sure that the character actually exists
				for (int j = 0;  j <= manipulatedString.length() - 1; j++) {
					if (manipulatedString.charAt(j) == removedChar) {
						LoopInt++;
						if(LoopInt == whichChar) {
							firstHalf = manipulatedString.substring(0, j);
							secondHalf = manipulatedString.substring(j + 1);
							counter++;
						}
					}
				}
				if (counter == 1) {
					manipulatedString = firstHalf + secondHalf;
					System.out.println("The new sentence is: " + manipulatedString);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				
			}
			
			else if (command.equalsIgnoreCase("quit")) {
				//Empty just so that, when the command is 'quit' it doesn't give a command invalid
			}
			
			else {
				//If anything else is said, then it isn't a command and thus invalid.
				System.out.println("Command invalid. Try again");
			}
		}
		//Ends the while loop when 'quit' is said with any capitalization
		while (!command.equalsIgnoreCase("quit"));
		
		//closes the scanner
		input.close();
	}
}
