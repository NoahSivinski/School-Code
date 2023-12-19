/*
 * [StringFun].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [10/15/21]
 *
 * Purpose: This program will ask the user for a string that they
 * would want to manipulate. The program then gives the user the
 * options of reverse, replace first, replace last, remove all,
 * remove, or quit. If the user enters one the these manipulations,
 * the program will manipulate their string accordingly. If the user
 * enters a manipulation that is not represented to the user, the
 * program will prompt the user to try again. Also, if the user decides
 * they are done manipulating their string, the program will read the
 * user input, quit, to stop the program. 
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
		String tempString = "";
		String userString;
		//creating scanner object and asking user for their string 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		userString = keyboard.nextLine();

		//keep on asking user for their command until they enter quit
		do {
			//asking user for their command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = keyboard.nextLine();

			//if user enters reverse, the last character will be stored in a temporary string first then each letter from 
			//left to right will be concatenated to the temporary string
			if(command.equalsIgnoreCase("reverse")) {
				tempString = "";
				for(int i = userString.length() - 1; i >= 0; i--) {
					tempString += userString.charAt(i);
				}
				//the temporary string is put back into the variable that initially held the user's string
				userString = tempString;
				System.out.println("The new sentence is: " + userString);
			}
			//if user enters replace first, prompt them to enter the character they want to 
			//replace and the new character that will take its place
			else if(command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				String characToReplace = keyboard.nextLine();
				System.out.println("Enter the new character");
				String replacingCharacter = keyboard.nextLine();
				//counter makes sure only the first character match the program across will get changed
				int counter = 0;

				for(int i = 0; i < userString.length(); i++) {
					//checking to see if the character user wants to replace is part of the string
					if(userString.substring(i, i + 1).equals(characToReplace) && counter == 0) {
						String firstHalfString = "";
						String secondHalfString = "";
						//when the character the user desires to replace is found, their string
						//is split up right before the character is found and after the character is found
						firstHalfString = userString.substring(0, i);
						firstHalfString += replacingCharacter;
						secondHalfString = userString.substring(i + 1);
						//the new character is added to the first half and the two halves are put back together while removing the old character
						tempString = firstHalfString + secondHalfString;
						counter++;
						userString = tempString;
					}
				}
				//if user enters a character they desire to replace and it was not found in the string
				//friendly message is printed to the user
				if (counter == 0) {
					System.out.println("The letter was not found in the word");
				}
				//if the character was replaced, the new string is printed to the user
				else {
					System.out.println("The new sentence is: " + userString);
				}
			}
			//if user enters replace last, prompt them to enter the character they want to replace and what they would like to replace it with 
			else if(command.equalsIgnoreCase("Replace Last")) {
				System.out.println("Enter the character to replace");
				String characToReplace = keyboard.nextLine();
				System.out.println("Enter the new character");
				String replacingCharacter = keyboard.nextLine();
				int counter = 0;
				int lastLetterIndex = 0;
				//if the character user wants to replace is found within the string, its last index is saved in lastLetterIndex
				for(int i = 0; i < userString.length(); i++) {
					if(userString.substring(i, i + 1).equals(characToReplace)) {
						counter ++;
						lastLetterIndex = i;
					}
				}
				//if the character was found, the user's string will be split and the character they want to replace with will be added to the first half of the string then both halves of the string will be joined back together
				if(counter > 0) {
					String firstHalfString = "";
					String secondHalfString = "";

					firstHalfString = userString.substring(0, lastLetterIndex);
					firstHalfString += replacingCharacter;
					secondHalfString = userString.substring(lastLetterIndex + 1);
					tempString = firstHalfString + secondHalfString;
					userString = tempString;
					System.out.println("The new sentence is: " + userString);
				}
				//if the letter the user wants to replace is not found, a friendly message is displayed
				else {
					System.out.println("The letter was not found in the word");
				}


			}
			//if user enters remove, user is prompted to enter which occurrence of the character they would like to remove
			else if(command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				String characToRemove = keyboard.nextLine();
				System.out.println("Enter the " + characToRemove +  " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int characOccurrence = keyboard.nextInt();
				keyboard.nextLine();
				int counter = 0;
				boolean characFound = false;
				//the number of times the character is found in the user's string is saved in counter
				for(int i = 0; i < userString.length(); i++) {
					if(userString.substring(i, i + 1).equals(characToRemove)) {
						counter++;
						//when the character occurrence has been reached, the string is once again split up and put back together without the character the user wanted to remove
						if(counter == characOccurrence) {
							characFound = true;
							String firstHalfString = "";
							String secondHalfString = "";

							firstHalfString = userString.substring(0, i);
							secondHalfString = userString.substring(i + 1);
							tempString = firstHalfString + secondHalfString;
							//the manipulated string is put back into the variable that initially held the user's string before manipulation
							userString = tempString;

							System.out.println(userString);
						}

					}
				}
				//if the character at that occurrence was not found, a friendly message is displayed to the user 
				if(!characFound) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}

			}
			//if the user enters remove all, the user is prompted to enter which character they would like to remove entirely from the string
			else if(command.equalsIgnoreCase("remove all")){
				System.out.println("Enter the character to remove");
				String characToRemove = keyboard.nextLine();

				int counter = 0;
				String firstHalfString = "";
				String secondHalfString = "";
				//the user's string is split up and then put back together without the character the user wants to remove
				for(int i = 0; i < userString.length(); i++) {
					if(userString.substring(i, i + 1).equals(characToRemove)) {
						counter++;
						firstHalfString = userString.substring(0, i);
						secondHalfString = userString.substring(i + 1);
						tempString = firstHalfString + secondHalfString;
						userString = tempString;
						//the index is decremented since the string length has changed and the same index must be checked again for a match
						i--;
					}
				}
				//if the character the user wants to remove was not found, a friendly message is displayed to the user
				if(counter < 1) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				//if the character was found, the new string is displayed to the user
				else {
					System.out.println("The new sentence is: " + userString);
				}

			}
			//if the user enters quit, the program will terminate
			else if(command.equalsIgnoreCase("Quit")) {
				System.exit(0);
			}
			//if the user enters a manipulation that is not done by this program, a friendly message is displayed
			else {
				System.out.println("Command invalid. Try again");
			}
			//user will be prompted continuously to enter a manipulation as long as their string is not quit
		} while (!userString.equalsIgnoreCase("Quit"));

		keyboard.close();
	}

}

