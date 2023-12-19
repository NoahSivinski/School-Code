/*
 * StringFun.java
 * Author:  Cole Lanham 
 * Submission Date:  3/19/21
 *
 * Purpose: This program is an assessment of our understand
 * of loops, if-then statements, and the process of nesting.
 * This program prompts the user for string, then manipulates it 
 * based off a prompted command. After being manipulated, the program
 * prints the manipulated string, where it can be manipulated again. 
 * This process occurs infinitely until the user inputs "quit".
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
		System.out.println("Enter the string to be manipulated"); //Initial Prompt
		String stringInput = keyboard.nextLine();
		String newInput = "";
		boolean stop = false;
		int lengthOfStringInput = stringInput.length();

		while (stop == false) { //Overall infinite-loop 
			boolean issueWithInput = false;
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)"); //Initial prompts 
			String nextCommand = keyboard.nextLine();
			if (nextCommand.equalsIgnoreCase("quit"))// Exits loop for string manipulation
				System.exit(0);

			if (nextCommand.equalsIgnoreCase("reverse")) { //Command for reverse
				int count = lengthOfStringInput; 
				for (int i = 0; i < lengthOfStringInput; i++) {
					char desiredCharacter = stringInput.charAt(--count);
					newInput = "" + newInput + desiredCharacter;
				}	
			}

			if (nextCommand.equalsIgnoreCase("replace first")) { //Establishes command for replace first
				int count = 0;
				boolean continueIfThen = true;
				System.out.println("Enter the character to replace");//User prompting
				char oldCharacter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newCharacter = keyboard.nextLine().charAt(0);
				for (int i = 0; i < lengthOfStringInput; i++) {
					char charactersOfInput = stringInput.charAt(i);//Goes through each character of the Input string in order from left to right
					if ((charactersOfInput == oldCharacter) && (continueIfThen == true)) {
						charactersOfInput = newCharacter;
						continueIfThen = false;
					}
					else 
						++count;
					if (count == lengthOfStringInput) {
						System.out.println("The letter was not found in the word");
						issueWithInput = true;
					}

					newInput = "" + newInput + charactersOfInput;
				}
			}

			if (nextCommand.equalsIgnoreCase("replace last")) { //Establishes command for replace first
				int count = 0;
				int indexOfDesiredCharacter = -1;
				System.out.println("Enter the character to replace");//User prompting
				char oldCharacter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newCharacter = keyboard.nextLine().charAt(0);

				for (int i = 0; i < lengthOfStringInput; i++) {
					char charactersOfInput = stringInput.charAt(i);//Goes through each character of the Input string in order from left to right
					if ((charactersOfInput == oldCharacter)) {
						indexOfDesiredCharacter = i;
						if (indexOfDesiredCharacter == i)
							charactersOfInput = newCharacter;
					}
					else 
						++count;
					if (count == lengthOfStringInput) {
						System.out.println("The letter was not found in the word");
						issueWithInput = true;
					}
					newInput = "" + newInput + charactersOfInput;
				}
			}

			if (nextCommand.equalsIgnoreCase("remove all")) { //Establishes command for remove all 
				System.out.println("Enter the character to remove");
				char desiredRemovedCharacter = keyboard.nextLine().charAt(0);
				for (int i = 0; i < lengthOfStringInput; i++) {
					char charactersOfInput = stringInput.charAt(i); //Simply replaces all instances of the a desired character with nothing
					if (charactersOfInput == desiredRemovedCharacter) {
						charactersOfInput = (0);
					}
					newInput = "" + newInput + charactersOfInput;
				}
			}

			if (nextCommand.equalsIgnoreCase("remove")) { //Establishes command for remove
				System.out.println("Enter the character to remove");
				char desiredRemovedCharacter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + desiredRemovedCharacter + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int numberOfRemovedCharacter = keyboard.nextInt();
				keyboard.nextLine(); //Serves to keep output formatting correct
				int characterCount = 0;
				int finalCharacterCount = 0;
				for (int i = 0; i < lengthOfStringInput; i++) {
					char charactersOfInput = stringInput.charAt(i);
					if (charactersOfInput == desiredRemovedCharacter) { 
						++characterCount;
						++finalCharacterCount;
						if (characterCount == numberOfRemovedCharacter) { //What if the there are two instances where 
							charactersOfInput = (0);
							if (charactersOfInput == (0)) 
								characterCount = -100;	
						}
					}

					newInput = "" + newInput + charactersOfInput;
				}				
				if (finalCharacterCount < numberOfRemovedCharacter) { //Attempt at providing error message (issue is that now it's 
					System.out.println("Error: the letter you are trying to remove does not exist");
					issueWithInput = true;
				}
			}
			
			if (issueWithInput == false) 	//If any issue with a command occurs, the user will not see their manipulated String again.
				System.out.println("The new sentence is: " + newInput);

			stringInput = newInput;
			newInput = "";
			}

		keyboard.close();
	}
}

