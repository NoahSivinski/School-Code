/*
 * StringFun.java
 * Author: Aaron Brown
 * Submission Date: 03/12/2021
 *
 * Purpose: The following program allows the user to input a string and manipulate it
 * in multiple ways. The options are reversing the string, replacing parts of the string,
 * removing parts of the string, and quitting. The program has two other ways to end besides
 * the user inputting quit, if the user doesn't enter a string to begin with the program ends
 * since it cannot manipulate an empty string. If the user removes the entire string including
 * spaces, then the program is ended since it cannot manipulate an empty string.
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
		/*Two strings are established to hold the value of the user's inputted String, and the
		 *methods used to manipulate the string as well.
		 */
		String userString = "";
		String manipulationInput = "";
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the string to be manipulated");
		userString = input.nextLine();
		/*The following executes if the user presses enter without typing anything.
		 *It ends the program since the program cannot do anything to an empty string.
		 */
		if(userString.equals("")) {
			System.out.println("The string has no input. Ending program.");
			System.exit(0);
		}
		//After the user inputs a string, the loop begins to manipulate the string.
		while(true) {
			/*The loop starts, and the length of the string is established in a value to help simplify code.
			 *A temporary string and character is also established to help store values. Two separate character
			 *values are established for when the user picks a method that involves replacing or removing characters
			 *to store those letters. 'userChar1' is for all four character oriented methods and the first input, 
			 *while 'userChar2' is for the replace methods to store the replacement character as well. There is 
			 *also a boolean value established to help with printing the new sentence if it changes.
			 */
			boolean checkForChange = true;
			int lengthOfString = userString.length();
			char tempChar = ' ';
			String tempString = "";
			char userChar1 = ' ';
			char userChar2 = ' ';
			//The loop prompts the user for a manipulation input.
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			manipulationInput = input.nextLine();
			//If the input is 'quit' the boolean value for quitting is switched to false to end the loop.
			if(manipulationInput.equalsIgnoreCase("quit")) {
				input.close();
				System.exit(0);
			}
			/*If reverse is entered the loop filters through the string backwards using length values to
			 *make the string reverse.
			 */
			else if(manipulationInput.equalsIgnoreCase("reverse")) {
				for(int i = 0; i < userString.length(); i++) {
					lengthOfString--;
					tempChar = userString.charAt(lengthOfString);
					tempString = tempString + tempChar;
				}
			}
			/*If replace first is entered the loop prompts the user to enter the letter to replace
			 *followed by the replacement letter and finds the location of the first instance of the
			 *letter and replaces it during a loop of the string. Integer counter is established, so that
			 *if the string contains multiple instances, it only replaces one and not all of them.
			 */
			else if(manipulationInput.equalsIgnoreCase("replace first")) {
				int counter = 0;
				System.out.println("Enter the character to replace");
				userChar1 = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				userChar2 = input.nextLine().charAt(0);
				for(int i = 0; i < userString.length(); i++) {
					tempChar = userString.charAt(i);
					if(Character.compare(tempChar, userChar1) != 0) {
						tempString = tempString + tempChar;
					}
					else {
						if(counter == 0) {
							tempString = tempString + userChar2;
							counter++;
						}
						else tempString = tempString + userChar1;
					}
				}
				if(tempString.equals(userString)) {
					checkForChange = false;
					System.out.println("The letter was not found in the word");
				}
			}
			/*If replace last is entered the loop prompts the user to enter the letter to replace
			 *followed by the replacement letter and finds the location of the last instance of the
			 *letter and replaces it during a loop of the string. It finds the last instance by using
			 *the reverse code and then using replace first, and finally reversing again to return the
			 *string in the correct order.
			 */
			else if(manipulationInput.equalsIgnoreCase("replace last")) {
				int counter = 0;
				System.out.println("Enter the character to replace");
				userChar1 = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				userChar2 = input.nextLine().charAt(0);
				for(int i = 0; i < userString.length(); i++) {
					lengthOfString--;
					tempChar = userString.charAt(lengthOfString);
					tempString = tempString + tempChar;
				}
				userString = tempString;
				tempString = "";
				for(int i = 0; i < userString.length(); i++) {
					tempChar = userString.charAt(i);
					if(Character.compare(tempChar, userChar1) != 0) {
						tempString = tempString + tempChar;
					}
					else {
						if(counter == 0) {
							tempString = tempString + userChar2;
							counter++;
						}
						else tempString = tempString + userChar1;
					}
				}
				if(tempString.equals(userString)) {
					checkForChange = false;
					System.out.println("The letter was not found in the word");
				}
				userString = tempString;
				tempString = "";
				lengthOfString = userString.length();
				for(int i = 0; i < userString.length(); i++) {
					lengthOfString--;
					tempChar = userString.charAt(lengthOfString);
					tempString = tempString + tempChar;
				}
			}
			/*If the user inputs remove all the program returns a string that has
			 *had all instances of the requested letter removed. This is done by
			 *looping the string and checking every letter against the requested
			 *letter.
			 */
			else if(manipulationInput.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				userChar1 = input.nextLine().charAt(0);
				for(int i = 0; i < userString.length(); i++) {
					tempChar = userString.charAt(i);
					if(Character.compare(tempChar, userChar1) != 0) {
						tempString = tempString + tempChar;
					}
				}
			}
			/*If the user inputs remove the user is prompted to input a letter in to remove
			 *the user is then asked which instance of the letter they would like to remove
			 *from the string. The loop goes through the string and checks each letter, if 
			 *the letter is the same as the input an integer counter is increased, as long
			 *as counter doesn't equal the requested instance, the letter is not removed.
			 *If counter never reaches the requested instance an error is given since it 
			 *does not exist.
			 */
			else if(manipulationInput.equalsIgnoreCase("remove")) {
				int counter = 0;
				System.out.println("Enter the character to remove");
				userChar1 = input.nextLine().charAt(0);
				System.out.println("Enter the " + userChar1 + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.): ");
				int removalSpot = input.nextInt();
				for(int i = 0; i < userString.length(); i++) {
					tempChar = userString.charAt(i);
					if(Character.compare(tempChar, userChar1) != 0) {
						tempString = tempString + tempChar;
					}
					else {
						counter++;
						if(counter != removalSpot) {
							tempString = tempString + tempChar;
						}
					}
				}
				if(tempString.equals(userString)) {
					checkForChange = false;
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				manipulationInput = input.nextLine();
			}
			else {
				System.out.println("Invalid input for manipulation.");
				checkForChange = false;
			}
			if(checkForChange) {
				userString = tempString;
				System.out.println("The new sentence is: " + userString);
			}
			/*This if statement is here in case the user removes the entire string, including spaces.
			 *Since the program cannot do anything to an empty string it ends the program.
			 */
			if(userString.equals("")) {
				System.out.println("The entire string has been erased, ending the program.");
				System.exit(0);
			}
			//The following statements clears the tempString and tempChar.
			tempString = "";
			tempChar = ' ';
		}
	}

}
