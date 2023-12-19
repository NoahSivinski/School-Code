/*
 *  StringFun.java
 * Author:  Malinda Uboh
 * Submission Date: 10/15/2021
 *
 * Purpose: This program is an environment in which 
 * a user can enter a string and manipulate it using 
 * five basic methods. This string gives the user the
 * option to reverse their string, replace the first 
 * instance of a selected character in their string 
 * with another character, replace the last instance 
 * of a selected character in their string with another 
 * character, remove a particular instance of a character, 
 * and remove all instances of a character. 
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

		String manipulatedString, usersInput, command, beginningOfString, EndOfString;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		usersInput = keyboard.nextLine();

		
		//Assure that correct loop executes at least once after user inputs string
		do {

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();

			//restrict valid user input to five basic commands and quit option
			if (!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first")
					&& !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all")
					&& !command.equalsIgnoreCase("remove") && !command.equalsIgnoreCase("quit")) {
				System.out.println(
						"Command invalid. Try again\nEnter your command (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}
			
			
			if (command.equalsIgnoreCase("reverse")) {//reverse user inputed string

				manipulatedString = (""); //Set manipulatedString to empty string

				for (int i = usersInput.length() - 1; i >= 0; i--) { //Set for loop to end once it decrements through the length - 1 of the user input
					manipulatedString = manipulatedString + usersInput.charAt(i); //Add user input characters into the manipulatedString empty string as i decrements

				}
				
				usersInput = manipulatedString; //modify users string to ensure updated value for next iteration
				System.out.println("The new sentence is: " + usersInput);
			}

			if (command.equalsIgnoreCase("replace last")) {//replace last instance of user entered character

				System.out.println("Enter the character to replace");
				char toReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				char newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				manipulatedString = (""); //Set manipulatedString to empty string

				int counter = 0; //Set counter to 0 before for loop begins 
				for (int i = 0; i < usersInput.length(); i++) {//Set for loop to end once it increments through the length of the user input

					usersInput.substring(i); //create a substring of the user input 

					if (toReplace == usersInput.charAt(i)) { //Stop in this if-statement if the substring of user input ever equals toReplace

						beginningOfString = usersInput.substring(0, i); //Set beginningOfString from 0 to where you stopped, not including where you stopped
						EndOfString = usersInput.substring(i + 1);//Set EndOfString to where you stopped, not including where you stopped, to the end of the string
						manipulatedString = beginningOfString + newCharacter + EndOfString;//Add beginningOfString, newCharacter, and EndOfString to the empty string
						counter++; //Increment counter when character is found
					}
					
				}
				if (counter > 0) { //print sentence if user inputed letter is found, signified by counter increasing
					usersInput = manipulatedString;
					System.out.println("The new sentence is: " + usersInput);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
				
			}

			if (command.equalsIgnoreCase("replace first")) { //replace first instance of user entered character

				System.out.println("Enter the character to replace");
				char toReplace = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				char newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();

				manipulatedString = ("");
				int counter = 0;
				for (int i = 0; i < usersInput.length(); i++) {

					usersInput.substring(i, i + 1);//increment i through the length of user input

					if (toReplace == usersInput.charAt(i) && counter == 0) { //Stop in this if-statement if the substring of user input ever equals toReplace and if the counter equals zero

						beginningOfString = usersInput.substring(0, i);
						EndOfString = usersInput.substring(i + 1, usersInput.length());
						manipulatedString = beginningOfString + newCharacter + EndOfString;
						counter++;// set counter to increment so that once the first instance of the character is the found the if statement will not run again
					}

				}

				if (counter == 0) { //if the letter is not found, signified by count not increasing, print friendly error message 
					System.out.println("The letter was not found in the word");
				}

				else {
					usersInput = manipulatedString;
					System.out.println("The new sentence is: " + usersInput);
				}
			}

			if (command.equalsIgnoreCase("remove all")) {// Remove all instances of particular character

				System.out.println("Enter the character to remove");
				char toRemove = keyboard.next().charAt(0);
				keyboard.nextLine();

				manipulatedString = ("");

				for (int i = 0; i < usersInput.length(); i++) {

					if (usersInput.charAt(i) != toRemove) {  //Execute body if i is not equal to the character the user wants to remove 

						manipulatedString += usersInput.charAt(i);// Add all of characters that the user does not want to remove into the empty string
					}

				}
				if (manipulatedString.equals(usersInput)) {//print a friendly error message if user tries to remove a character not in the input string
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					usersInput = manipulatedString;
					System.out.println("The new sentence is: " + usersInput);
				}
			}

			if (command.equalsIgnoreCase("remove")) {//remove a particular instance of a character 

				System.out.println("Enter the character to remove");
				char toRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + toRemove
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int toRemoveInstance = keyboard.nextInt();
				keyboard.nextLine();
				int counter = 0; //Set counter to 0

				manipulatedString = ("");

				for (int i = 0; i < usersInput.length(); i++) {

					if (toRemove != usersInput.charAt(i))  //Execute body if i is not equal to the character the user wants to remove 
						manipulatedString += usersInput.charAt(i);
					else {
						counter++; //if i is equal to the character the user wants to remove increment counter until the counter is not equal to the instance of the character the user wants to remove 
						if (counter != toRemoveInstance)
							manipulatedString += usersInput.charAt(i);

					}
				}
				if (manipulatedString.equals(usersInput)) {//print a friendly error message if user tries to remove a character not in the input string
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					usersInput = manipulatedString;
					System.out.println("The new sentence is: " + usersInput);
				}
			}

		} while (!command.equalsIgnoreCase("quit")); //reiterate loop as long as the user does not enter quit, regardless of case

		System.out.println("...Execution Ends...");
		keyboard.close();
	}
}
