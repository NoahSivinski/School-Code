/*
 * [StringFun.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [3/18/2021]
 *
 * This program does the following: 
 * StringFun.java allows the user to input a string for them to edit using a variety of different commands including:
 * reverse, replace first, replace last, remove all, remove, and quit. Reverse turns the string backwards, replace
 * first replaces the first instance of a user-inputed character with a new desired character, replace last replaces 
 * the last instance of a user-inputed character with a new desired character, remove all removes all instances of a
 * user-inputed character, remove removes a specified instance of a user-inputed character, and finally quit ends the program.
 * This program accounts for all user errors or input errors while typing, and should display an appropriate error message
 * based off the error.
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
		
		//Using the Scanner object and nextLine to get an input from the user on what string they want to manipulate
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String str = input.nextLine();
		
		//Initializing command to be used to get command from user
		String command = "";
		
		//do-while loop that loops until the user inputs "quit"
		do {
			//asking the user for the command they want to perform on the string and storing it in command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = input.nextLine();
			
			//if-else statement that checks to see what command the user inputed
			if ( command.equalsIgnoreCase("reverse") ) {
				//for loop that runs for the length of str(string) and places the characters of the string in rev(reverse)
				
				//initializing rev
				String rev = "";
				
				//for loop that continues for the length of the string and sets rev equal to the backwards string
				for (int i = str.length() - 1; i >= 0; i--) {
					rev = rev + str.charAt(i);
				}
				//setting rev equal to str
				str = rev;
				//resetting rev
				rev = "";
				System.out.println("The new sentence is: " + str);
			}
			else if ( command.equalsIgnoreCase("replace first") ) {
				//asking the user for the character to replace and storing it in original
				System.out.println("Enter the character to replace");
				char original = input.next().charAt(0);
		
				//asking the user for the new character to replace with and storing it in replacement
				System.out.println("Enter the new character");
				char replacement = input.next().charAt(0);
				
				//boolean isReplaced to check to see if a replacement has been completed
				boolean isReplaced = false;
				
				//for loop that goes for the length of the string
				for (int i = 0; i < str.length(); i++) {
					//if isReplaced is false, the the loop continues to check for a comparison, otherwise it continues
					if ( (isReplaced == false) ) {
						//if statement that compares original to each character in the string
						if ( (original == str.charAt(i)) ) {
							//the replacement equation
							str = str.substring(0, i) + replacement + str.substring(i + 1);
							//turns isReplaced to true if a replacement is done
							isReplaced = true;
						}
					}
				}
				//if statement that prints out the new string if a replacement is done, otherwise it prints the letter was not found
				if (isReplaced == true) {
					System.out.println("The new sentence is: " + str);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
					
			}
			else if ( command.equalsIgnoreCase("replace last") ) {
				//a repeat of replace last except this time the for loop starts from the back of the string
				
				//asking the user for the character to replace and storing it in original
				System.out.println("Enter the character to replace");
				char original = input.next().charAt(0);
		
				//asking the user for the new character to replace with and storing it in replacement
				System.out.println("Enter the new character");
				char replacement = input.next().charAt(0);
				
				//boolean isReplaced to check to see if a replacement has been completed
				boolean isReplaced = false;
				
				//for loop that goes for the length of the string starting from the end
				for (int i = str.length() - 1; i >= 0; i--) {
					//if isReplaced is false, the the loop continues to check for a comparison, otherwise it continues
					if ( (isReplaced == false) ) {
						//if statement that compares original to each character in the string
						if ( (original == str.charAt(i)) ) {
							//the replacement equation
							str = str.substring(0, i) + replacement + str.substring(i + 1);
							//turns isReplaced to true if a replacement is done
							isReplaced = true;
						}
					}
				}
				//if statement that prints out the new string if a replacement is done, otherwise it prints the letter was not found
				if (isReplaced == true) {
					System.out.println("The new sentence is: " + str);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			else if ( command.equalsIgnoreCase("remove all") ) {
				//asks the user for the character to be removed from the string and puts it in remove
				System.out.println("Enter the character to remove");
				char remove = input.next().charAt(0);
	
				//for loop that goes through the string using length
				for (int i = 0; i < str.length(); i++) {
					//if statement that compares remove to each character in the string
					if ( (remove == str.charAt(i)) ) {
						//the removal equation
						str = str.substring(0, i) + str.substring(i + 1);
						//if a character gets removed, it removes one from i so it can continue through the entire string
						i--;
					}
				}
				System.out.println("The new sentence is: " + str);
		
			}
			else if ( command.equalsIgnoreCase("remove") ) {
				//asks the user for the character to be removed from the string and puts it in removeOne
				System.out.println("Enter the character to remove");
				char removeOne = input.next().charAt(0);
				
				//asks the user which instance of the character the want to remove
				System.out.println("Enter the " + removeOne + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				int num = input.nextInt();
				input.nextLine();
				
				//initializing count and beenRemoved, to count how many correct characters have gone through the loop,
				//and beenRemoved checks to see if the character has been removed from the string
				int count = 1;
				boolean beenRemoved = false;
				
				//for loop that goes through str
				for (int i = 0; i <str.length(); i++) {
					//if statement that checks to see if the character has been removed before continuing
					if (beenRemoved == false) {
						//checks to see if the character is the character at index i
						if ( removeOne == str.charAt(i) ) {
							//if the count of the number of correct characters equals the number of the character that the
							//user wants to remove, then that character is removed, else it adds one to count to go to the next
							//character
							if (count == num) {
								str = str.substring(0, i) + str.substring(i + 1);
								beenRemoved = true;
							}
							else {
								count++;
							}
						}
					}
				}
				//if else statement that checks to see if beenRemoved is true and prints the next str, else, it prints an error
				//message because the character was not able to be removed
				if (beenRemoved == true) {
					System.out.println("The new sentence is: " + str);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist. Please try again");
				}

				
			}
			//program ends if user inputs quit
			else if ( command.equalsIgnoreCase("quit") ) {
				System.out.println("Program ending...");
				System.exit(0);
			}
			//outputs error message if a invalid command is inputed
			else {
				System.out.println("Not a valid command. Please try again.");
			}
			
			//if statement to fix bug where code repeated twice due to the command being taken from nextLine too early
			if ( (command.equalsIgnoreCase("replace first")) || (command.equalsIgnoreCase("replace last")) || 
					(command.equalsIgnoreCase("remove all")) ) {
				input.nextLine();
			}
			
		} while (command != "quit");
		
		input.close();
	}
}