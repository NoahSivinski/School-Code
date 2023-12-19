/*
 * StringFun.java
 * Author:  Austin Debrody
 * Submission Date:  10/15/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This lab is a program where the user can enter a sentence as a
 * string and then manipulate that string using 6 basic commands: 
 * reverse, replace first, replace last, remove, remove all, and
 * quit. The program continues after each command is prompted until
 * the program is quit by the user.
 * 
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
		Scanner scan = new Scanner(System.in);
		
		String userInput;
		String userMove ="";
		String output = "";
		
		String charOut;
		String charIn;
		
		boolean letterFound;
		
		System.out.println("Enter the string to be manipulated");
		userInput = scan.nextLine();
		
		output = userInput;
		
		while(!userMove.equalsIgnoreCase("quit")) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			userMove = scan.nextLine();
			
			if(userMove.equalsIgnoreCase("reverse")) {
				String newString = "";
				for(int i = output.length() - 1; i >= 0; i--) {
					newString += output.charAt(i);
				}
				
				output = newString;
				
				System.out.println("The new sentence is: " + newString);
			} else if(userMove.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				charOut = scan.nextLine();
				System.out.println("Enter the new character");
				charIn = scan.nextLine();
				
				int charVal = 0;
				boolean appears = false;
				
				while(charVal < output.length() - 1 && !appears) {
					if(output.substring(charVal, charVal + 1).equals(charOut)) {
						appears = true;
					}else {
						charVal++;
					}
				}
				
				if(output.substring(charVal).equals(charOut)) {
						appears = true;
				}
				
				if(!appears) {
					System.out.println("The letter was not found in the word");
				}else {
					String newString = output.substring(0, charVal) + charIn + output.substring(charVal + 1);
					
					output = newString;
					
					System.out.println("The new sentence is: " + output);
				}
				
				
					
			} else if(userMove.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				charOut = scan.nextLine();
				System.out.println("Enter the new character");
				charIn = scan.nextLine();
				
				int charVal = output.length() - 1;
				boolean appears = false;
				
				if(output.substring(charVal).equals(charOut)) {
					appears = true;
				}
				
				while(charVal >= 0 && !appears) {
					if(output.substring(charVal - 1, charVal).equals(charOut)) {
						appears = true;
					}else {
						charVal--;
					}
				}
				
				// System.out.println(charVal);
				
				if(!appears) {
					System.out.println("The letter was not found in the word");
				}else {
					String newString = output.substring(0, charVal - 1) + charIn + output.substring(charVal);
					
					output = newString;
					
					System.out.println("The new sentence is: " + output);
				}
				
				
			} else if(userMove.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				charOut = scan.nextLine();
				
				boolean appears = false;
				
				String newString = "";
				
				for(int i = 0; i < output.length() - 1; i++) {
					if(!output.substring(i, i + 1).equals(charOut)){
						newString += output.substring(i, i + 1);
					}else {
						appears = true;
					}
				}
				
				if(!output.substring(output.length() - 1).equals(charOut)) {
					newString += output.substring(output.length() - 1);
				}
				
				if(newString.charAt(0) == ' ') {
					newString = newString.substring(1);
				}
				
				if(appears) {
					output = newString;
					System.out.println("The new sentence is: " + output);
				}else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				
			} else if(userMove.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				charOut = scan.nextLine();
				
				System.out.println("Enter the " + charOut + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int charOutNum = scan.nextInt();
				scan.nextLine();
				
				int charCount = 0;
				
				String newString = "";
				
				//System.out.println(output);
				
				for(int i = 0; i < output.length(); i++) {
					if(output.substring(i, i + 1).equals(charOut)) {
						charCount ++;
						if(charCount == charOutNum) {
							// nothing occurs
						} else {
							newString += output.substring(i, i + 1);
						}
					} else {
						newString += output.substring(i, i + 1);
					}						
				}
				
				if(newString.charAt(0) == ' ') {
					newString = newString.substring(1);
				}
				
				if(charCount >= charOutNum) {
					output = newString;
					System.out.println("The new sentence is: " + output);
				} else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				
			} else if(userMove.equalsIgnoreCase("quit")) {
				// nothing occurs
			} else {
				System.out.println("Command invalid. Try again");
			}
		}
	}

}
