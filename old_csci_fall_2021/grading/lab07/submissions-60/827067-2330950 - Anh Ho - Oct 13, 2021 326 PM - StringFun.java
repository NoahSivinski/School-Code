/*
 * StringFun.java

 * Author:  Anh Ho
 * Submission Date:  10/11/2021
 *
 * Purpose: program that accept a string and commands including reverse,
 * 			replace first, replace last, remove, remove all, and quit, using nested loops to execute the requested command.
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
		//declare variables
		String input;
		String command;
		String result;
		int searchIndex;
		char oldChar;
		char newChar;
		char remove;
		int removeAt;		
		
		//create new scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//getting user inputs
		System.out.println("Enter the string to be manipulated");
		input = keyboard.nextLine();
		do {
			
			result = "";
			searchIndex = -1;
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");	//prompt for input from user
			command = keyboard.nextLine().toLowerCase();
			switch (command) {
				case "reverse": {
					for (int i=input.length()-1;i>=0;i--) {
						result += input.charAt(i);
					}
					System.out.println("The new sentence is: " + result);
					input = result;
					break;
				}	//end case reverse
				case "replace first": {
					System.out.println("Enter the character to replace");	//prompt for input from user
					oldChar = keyboard.next().charAt(0);
					keyboard.nextLine();
					System.out.println("Enter the new character");
					newChar = keyboard.next().charAt(0);
					keyboard.nextLine();
					for (int i=0;i<input.length();i++) {
						if ((searchIndex<0)&&(oldChar==input.charAt(i))) {
							result +=newChar;
							searchIndex = i;
						}	//if finds, replace and stop
						else {
							result += input.charAt(i);
						}	//else add character from input as is
					}
					if (result.equals(input)) {
						System.out.println("The letter was not found in the word");
					}	//if result and input is the same print out error
					else {
						System.out.println("The new sentence is: " + result);
					}	////else if different, print out new string
					input = result;
					break;
				}	//end case replace first
				case "replace last": {
					String reversedResult="";
					System.out.println("Enter the character to replace");	//prompt for input from user
					oldChar = keyboard.next().charAt(0);
					keyboard.nextLine();
					System.out.println("Enter the new character");
					newChar = keyboard.next().charAt(0);
					keyboard.nextLine();
					for (int i=input.length()-1;i>=0;i--) {	//search backward from remove first
						if ((searchIndex < 0) && (oldChar == input.charAt(i))) {
							reversedResult += newChar;
							searchIndex = i;
						}	//if finds the first letter that fits, replace then stop after first instance
						else {
							reversedResult += input.charAt(i);
						}	//else add each char in input to result as is
					}	//close loop creating reversed result
					for (int i=reversedResult.length()-1;i>=0;i--) {
						result += reversedResult.charAt(i);
					}	//re-reverse result (true result)
					if (result.equals(input)) {
						System.out.println("The letter was not found in the word");
					}	//if result and input is the same print out error
					else {
						System.out.println("The new sentence is: " + result);
					}	//else if different, print out new string
					input = result;
					break;
				}	//end case replace last
				case "remove all": {
					System.out.println("Enter the character to remove");	//prompt for input from user
					remove = keyboard.next().charAt(0);
					keyboard.nextLine();
					for (int i=0;i<input.length();i++) {
						if (remove!=input.charAt(i)) {
							result += input.charAt(i);
						}
					}	//loop to only add character from input to result if that character is different from char user trying to remove
					if (result.equals(input)) {
						System.out.println("The letter was not found in the word");
					}	//if result and input is the same print out error
					else {
						System.out.println("The new sentence is: " + result);
					}	//else if different, print out new string
					input = result;
					break;
				}	//end case remove all
				case "remove": {
					int letterCounter = 0;
					int counterCheck = 0;
					System.out.println("Enter the character to remove");	//prompt for input from user
					remove = keyboard.next().charAt(0);
					keyboard.nextLine();
					System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
					removeAt = keyboard.nextInt();
					keyboard.nextLine();
					for (int i=0;i<input.length();i++) {
						if (input.charAt(i)==remove) {
							counterCheck++;
						}
					}
					if (removeAt<=counterCheck) {
						for (int i=0;i<input.length();i++) {
							if (input.charAt(i)!=remove) {
								result+=input.charAt(i);
							}
							else {
								letterCounter++;
								if (letterCounter!=removeAt) {
									result+=input.charAt(i);
								}
							}
						}	//end loop
						if (result.equals(input)) {
							System.out.println("The letter was not found in the word");
						}	//if result and input is the same print out error
						else {
							System.out.println("The new sentence is: " + result);
						}	//else if different, print out new string
						input = result;
					}	//check if remove at is a valid number compare to string length
					else {
						System.out.println("Error: the letter you are trying to remove does not exist");
					}	//if not print error message
					
					break;
				}	//end case remove
				case "quit": {
					break;
				}	//end case quit
				default: {
					System.out.println("Command invalid. Try again");
				}	//end default case
			}	//end switch check command
		} while (!(command.equals("quit")));
		System.out.println("...Execution Ends...");
		keyboard.close();
	}	//close main
}	//close class
