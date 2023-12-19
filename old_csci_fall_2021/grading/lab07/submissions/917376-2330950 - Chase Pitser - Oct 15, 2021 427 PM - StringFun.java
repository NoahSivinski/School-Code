/*
 * StringFun.java
 * Author: Chase Pitser
 * Submission Date: 10/15/2021
 *
 * Purpose: The purpose of this java program is to take a String input from the user. 
 * The user can then enter one of the 6 commands in order to alter the string and print it out.
 * If a command that is not recognized is typed in, the program prints an error and asks for a new command.
 * The user continues to enter commands until they input "quit", and the program terminates.
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
 * on an assignment buildd by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */


import java.util.Scanner;

public class StringFun {
	
	public static void main(String[] args) {
		//initialize Scanner
		Scanner keyboard = new Scanner(System.in);
		//input of main/original string
		System.out.println("Enter the string to be manipulated");
		String stringToManipulate = keyboard.nextLine();
		//initializing variables
		String desiredOperation;
		String manipulatedString;
		char charToReplace;
		char replacementChar;
		char charToRemove;
		boolean exit = false;
		//whole overall loop
		while(!exit) {
			manipulatedString=""; //resets the manipulated string to an empty  string
			//input of desired operation
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			desiredOperation = keyboard.nextLine();
			//switch statement to determine which operation to do
			switch(desiredOperation.toLowerCase()) {
				//
				//REVERSE
				case "reverse":
					//loop to build reversed string by adding chars from end to beginning 
					for(int i=stringToManipulate.length()-1; i>=0; i--) {
						manipulatedString += stringToManipulate.charAt(i);
					}
					System.out.println("The new sentence is: " + manipulatedString);
					stringToManipulate = manipulatedString;
					break;
				//
				//REPLACE FIRST
				case "replace first":
					//input of desired character to replace
					System.out.println("Enter the character to replace");
					charToReplace = keyboard.nextLine().charAt(0);
					//input of desired character to fill in replaced character
					System.out.println("Enter the new character");
					replacementChar = keyboard.nextLine().charAt(0);
					//loop to find index of the first instance of the old char
					int indexOfFirst = -1; //if the loop does not find the value, index of -1 is returned
					for(int i=stringToManipulate.length()-1; i>=0; i--) {
						if(stringToManipulate.charAt(i)==charToReplace) {
							indexOfFirst = i;
						}
					}
					//if index is -1 return error, otherwise build modified string with new char
					if(indexOfFirst==-1) {
						System.out.println("The letter was not found in the word");
					}else {
						for(int i=0; i<stringToManipulate.length();i++) {
							if(i != indexOfFirst) {
								manipulatedString += stringToManipulate.charAt(i);
							}else {
								manipulatedString += replacementChar;
							}
						}
						System.out.println("The new sentence is: " + manipulatedString);
						stringToManipulate = manipulatedString;
					}					
					break;
				//
				//REPLACE LAST
				case "replace last":
					//input of desired character to replace
					System.out.println("Enter the character to replace");
					charToReplace = keyboard.nextLine().charAt(0);
					//input of desired character to fill in replaced character
					System.out.println("Enter the new character");
					replacementChar = keyboard.nextLine().charAt(0);
					//loop to find index of the last instance of the old char
					int indexOfLast = -1; //if the loop does not find the value, index of -1 is returned
					for(int i=0; i<stringToManipulate.length(); i++) {
						if(stringToManipulate.charAt(i)==charToReplace) {
							indexOfLast = i;
						}
					}
					//if index is -1 return error, otherwise build modified string with new char
					if(indexOfLast==-1) {
						System.out.println("The letter was not found in the word");
					}else {
						for(int i=0; i<stringToManipulate.length();i++) {
							if(i != indexOfLast) {
								manipulatedString += stringToManipulate.charAt(i);
							}else {
								manipulatedString += replacementChar;
							}
						}
						System.out.println("The new sentence is: " + manipulatedString);
						stringToManipulate = manipulatedString;
					}					
					break;
				//
				//REMOVE ALL
				case "remove all":
					//input of char to remove
					System.out.println("Enter the character to remove");
					charToRemove = keyboard.nextLine().charAt(0);
					//loop to build modified string without old char
					for(int i=0; i<stringToManipulate.length(); i++) {
						if(stringToManipulate.charAt(i) != charToRemove) {
							manipulatedString += stringToManipulate.charAt(i);
						}
					}
					System.out.println("The new sentence is: " + manipulatedString);
					stringToManipulate = manipulatedString;
					break;
				//
				//REMOVE
				case "remove":
					//input of char to remove
					System.out.println("Enter the character to remove");
					charToRemove = keyboard.nextLine().charAt(0);
					//input of specific instance of the char to remove
					System.out.println("Enter the "+ charToRemove +" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
					int whichCharToRemove = keyboard.nextInt();
					keyboard.nextLine();
					int counter = 0;  //counts the times that the character is in the string so it can replace the correct one
					//loop to build modified string without indicated specific instance of char to remove
					for(int i=0; i<stringToManipulate.length(); i++) {
						//counts to identify each instance of the char that the program is looking to remove
						if(stringToManipulate.charAt(i)==charToRemove) {
							counter++;
						}
						//builds modified string without the specific indicated char
						if(counter!=whichCharToRemove || stringToManipulate.charAt(i)!=charToRemove) {
							manipulatedString += stringToManipulate.charAt(i);
						}
					}
					//if the counter returns less than the number of instance indicated, the indicated instance does not exist
					if(counter<whichCharToRemove) {
						System.out.println("Error: the letter you are trying to remove does not exist");
					}else {
						System.out.println("The new sentence is: " + manipulatedString);
						stringToManipulate = manipulatedString;
					}
					break;
				//
				//QUIT
				case "quit":
					//when user types "quit" the program terminates
					System.exit(0);
				default:
					//if the input is not one of the given commands, the program gives an error and asks for new command
					System.out.println("Command invalid. Try again");
			}
		}
		keyboard.close();
	}
	
}
