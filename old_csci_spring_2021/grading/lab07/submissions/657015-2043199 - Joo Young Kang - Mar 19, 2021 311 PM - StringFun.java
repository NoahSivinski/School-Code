/*
 * CSCI 1301.java
 * Author: Joo Young Kang
 * Submission Date: March 15, 2021
 *
 * Purpose: The purpose of this program is that it provides an environment where the user
 * can enter a sentence (String) and can manipulate the sentence using any 6 basic commands.
 * The first 5 commands involve the usage of reverse, replacement, and removal within the sentence.
 * While the last command allows the user to exit the program.
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
		
		String inputSentence;
		String inputCommand = "";
		
		System.out.println("Enter the string to be manipulated");
		inputSentence = keyboard.nextLine();
		
		do {
			System.out.println("Enter your command (reverse,replace first,"
					+ "replace last,remove all,remove, quit)");
			inputCommand = keyboard.nextLine().trim();
			
			String outputSentence = "";
			String input1 = "";
			String input2 = "";
			String input3 = "";
			String initialChar;
			String newChar;
			String checkInput = "";
			String reverseOutput = "";
			String forwardOutput = "";
			String removeAllOutput = "";
			String removeOutput = "";
			
			// reverse method
			if (inputCommand.equalsIgnoreCase("reverse")) {
				for (int i = inputSentence.length()-1; i >= 0; i--) { // for loop to reverse backwards
					outputSentence = outputSentence + inputSentence.charAt(i);
				}
				inputSentence = outputSentence; // set inputSentence = outputSentence (so it can be user again)
				System.out.println("The new sentence is: " + inputSentence);
			}

			// replace first
			else if (inputCommand.equalsIgnoreCase("replace first")){
				
				System.out.println("Enter the character to replace"); // user input for old character
				initialChar = keyboard.nextLine();
				
				System.out.println("Enter the new character"); // user input for new desire character
				newChar = keyboard.nextLine();
				
				for (int i = 0; i < inputSentence.length(); i++) { // for loop through inputSentence
					if (inputSentence.charAt(i) != initialChar.charAt(0)) {
						input1 = input1 + inputSentence.charAt(i); // input += inputSentence (character letters)
						if (inputSentence.equals(input1)) { // if inputSentence equals input1 (no changes)
							System.out.println("The letter was not found in the word");
						}
					}
					else {
						input1 = input1 + newChar; // input1 (part of inputSentence) combined with new character
						input2 = inputSentence.substring(i+1); // input2 (rest of inputSentence)
						input1 = input1 + input2; // input1 & input2 combined for new output
						break;
					}
				}
				if (!inputSentence.equals(input1 + input2)) {
					inputSentence = input1; // sets inputSentence = new output (so it can be used again)
					System.out.println("The new sentence is: " + input1.trim()); // trim(): eliminate leading spaces
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}

			// replace last
			else if (inputCommand.equalsIgnoreCase("replace last")) {
				
				System.out.println("Enter the character to replace"); // user input for old character
				initialChar = keyboard.nextLine();

				System.out.println("Enter the new character"); // user input for new desire character
				newChar = keyboard.nextLine();
				
				// purpose of this loop is similar to "replace first" which goes through
				// the inputSentence to check if the character is within
				for (int check = 0; check < inputSentence.length(); check++) {
					if (inputSentence.charAt(check) != initialChar.charAt(0)) {
						checkInput = checkInput + inputSentence.charAt(check);
					}
				}
				
				for (int i = inputSentence.length()-1; i >= 0; i--) { // for loop to reverse inputSentence
					if (inputSentence.charAt(inputSentence.length()-1) != initialChar.charAt(0)) {
						input1 = input1 + inputSentence.charAt(i); // input1 equals " " + each character letter after loop
					}
				}

				for (int j = 0; j < input1.length(); j++) { // for loop through input1
					if (input1.charAt(j) != initialChar.charAt(0)) {
						input2 = input2 + input1.charAt(j); // input2 equals " " + each character letter after loop
					}
					else {
						input2 = input2 + newChar; // input2 (part of inputSentence) combined with new character
						input3 = input1.substring(j+1); // input1 (rest of inputSentence)
						reverseOutput = input2 + input3; // input2 + input3 combined for new output
						break;
					}
				}

				for (int k = reverseOutput.length()-1; k >= 0; k--) { // for loop through new output
					forwardOutput = forwardOutput + reverseOutput.charAt(k); // results: new output is forward again
				}
				
				if (!inputSentence.equals(checkInput)) { // desired character within inputSentence
					inputSentence = forwardOutput; // inputSentence = new output (so it can be used again)
					System.out.println("The new sentence is: " + forwardOutput.trim()); // trim(); eliminate trailing spaces
				}
				else {
					System.out.println("Error: the letters you are trying to remove does not exist");
				}
				
			}

			// remove all
			else if (inputCommand.equalsIgnoreCase("remove all")) {
				
				System.out.println("Enter the character to remove"); // user input for desired character removal
				initialChar = keyboard.nextLine();

				for (int i = 0; i < inputSentence.length(); i++) { // for loop through inputSentence
					if (initialChar.charAt(0) == inputSentence.charAt(i)) {
						continue; // continue through process if character is within the inputSentence
					}
					else {
						removeAllOutput = removeAllOutput + inputSentence.charAt(i); // removeAllOutput = " " + char after each loop
						input1 = removeAllOutput; // inputSentence = new output (so it can be used again)
					}
				}
				
				if (!removeAllOutput.equals(inputSentence)) {
					inputSentence = input1; //inputSentence = new output (so it can be used again)
					System.out.println("The new sentence is: " + input1.trim());
				}
				else { //testing
					System.out.println("Error: the letters you are trying to remove does not exist");
				}
			}

			// remove
			else if (inputCommand.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");  // user input to remove for desired character removal
				initialChar = keyboard.nextLine();

				System.out.println("Enter the " + initialChar + " you would like to remove "
						+ "(Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int placement = keyboard.nextInt(); // // choice of nth character position
				keyboard.nextLine();
				
				// j is "counter"
				int j = 0;

				for (int i = 0; i < inputSentence.length(); i++) { // for loop through inputSentence
					if (initialChar.charAt(0) != inputSentence.charAt(i)) {
						removeOutput = removeOutput + inputSentence.charAt(i); // removeOutput = " " + each letter after loop
					}
					else {
						j = j + 1; // increase "counter", the same as (j++) incrementally
						if (j!= placement) { // "counter" does not equal nth character position
							removeOutput = removeOutput + inputSentence.charAt(i); // removeOutput = " " + each letter after loop
						}
					}
				}
				if(!removeOutput.equals(inputSentence)) {
					inputSentence = removeOutput; //inputSentence = new output (so it can be used again)
					System.out.println("The new sentence is: " + inputSentence.trim()); 
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			
			// quit
			else if ((inputCommand.equalsIgnoreCase("quit"))) {
				break; // discontinues the loop & not trigger the "else" condition (Invalid!...)
			}
			
			else {
				System.out.println("Invalid! Please try again."); // inputCommand is invalid
			}
			
		} while(!inputCommand.equalsIgnoreCase("quit")); // "Quit" to end loop
		System.out.println("...Execution Ends...");
	}
}