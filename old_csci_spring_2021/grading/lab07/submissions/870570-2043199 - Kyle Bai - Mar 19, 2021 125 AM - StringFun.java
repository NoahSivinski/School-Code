/*
 * [StringFun].java
 * Author:  [Kyle Bai] 
 * Submission Date:  [03/19/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program can reverse, replace, remove word for user.
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

		String input;
		String command = "";

		System.out.println("Enter the string to be manipulated");
		input = keyboard.nextLine();

		while(!command.equalsIgnoreCase("quit")) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			String storageVariable = "";

			if (command.equalsIgnoreCase("reverse")) { // reverse the word that user input
				for (int reverse = input.length() - 1; reverse >= 0; reverse--) {
					storageVariable = storageVariable + input.charAt(reverse);
				}
				input = storageVariable;
				System.out.println("The new sentence is: " + input);
			}
			else if (command.equalsIgnoreCase("replace first")) { // replace character from the first word that user input
				System.out.println("Enter the character to replace");
				char oldLetter = keyboard.nextLine().charAt(0); // ask user for the character that user want to replace
				System.out.println("Enter the new character");
				char newLetter = keyboard.nextLine().charAt(0); // ask user the new character that user want switch
				int index = -1;
				for (int replace = 0; replace < input.length(); replace++) {
					if (index < 0 && oldLetter == input.charAt(replace)) {
						index = index + newLetter;
						index = replace;
						storageVariable = input.substring(0, index) + newLetter + input.substring(index + 1);
						input = storageVariable;
						System.out.println("The new sentence is: " + input);
					}
				}
				if (index == -1) {
					System.out.println("The letter was not found in the word");
				}
			}
			else if (command.equalsIgnoreCase("replace last")) { // replace character from the last word that user input
				System.out.println("Enter the character to replace");
				char oldLetter = keyboard.nextLine().charAt(0); // ask user for the character that user want to replace
				System.out.println("Enter the new character");
				char newLetter = keyboard.nextLine().charAt(0); // ask user the new character that user want switch
				int index = -1;
				for (int replace = input.length() - 1; replace >= 0; replace--) {
					if (index < 0 && oldLetter == input.charAt(replace)) {
						index = index + newLetter;
						index = replace;
						storageVariable = input.substring(0,index) + newLetter + input.substring(index + 1);
						input = storageVariable;
						System.out.println("The new sentence is: " + input);
					}
				}
				if (index == -1) {
					System.out.println("The letter was not found in the word");
				}
			}
			else if (command.equalsIgnoreCase("remove")) { // remove a single character that user want to remove
				System.out.println("Enter the character to remove");
				char remove = keyboard.nextLine().charAt(0); // ask user for the character that user want remove
				System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int removeIndex = keyboard.nextInt(); // ask for the location of the character that user want remove
				keyboard.nextLine(); // to prevent System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)"); run twice
				int count = 0;
				for (int reMove = 0; reMove < input.length(); reMove++) {
					if (input.charAt(reMove) != remove) {
						storageVariable = storageVariable + input.charAt(reMove);
					}
					else {
						count++;
						if (count != removeIndex)
							storageVariable = storageVariable + input.charAt(reMove);
					}
				}
				if (storageVariable.equals(input)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					input = storageVariable;
					System.out.println("The new sentence is: " + input);
				}
			}
			else if (command.equalsIgnoreCase("remove all")) { // remove all of the character that user want to remove
				System.out.println("Enter the character to remove");
				char removeAll = keyboard.nextLine().charAt(0); // ask user for the character that user want remove
				for (int removeall = 0; removeall < input.length(); removeall++) {
					if (input.charAt(removeall) != removeAll) {
						storageVariable = storageVariable + input.charAt(removeall);
					}
				}
				if (storageVariable.equals(input)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					input = storageVariable;
					System.out.println("The new sentence is: " + input);
				}
			}
		}
		System.out.println("…Execution Ends…");
		keyboard.close();
	}
}