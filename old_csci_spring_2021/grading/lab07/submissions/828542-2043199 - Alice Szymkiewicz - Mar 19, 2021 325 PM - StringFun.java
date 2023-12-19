/*
 * StringFun.java
 * Author:  Alice Szymkiewicz
 * Submission Date: 03/19/2021
 *
 * Purpose: 
 * 
 * This code takes a user's String input and manipulates it based 
 * on the user's command. There are 6 possible commands the user 
 * can choose from: reverse, replace first, replace last, remove, 
 * remove all, and quit. The if-else if statements that correspond to 
 * each command are under a while loop that assume the user has
 * not quit the program. If the user inputs 'reverse', a for loop 
 * sorts the String in reverse order. If the user inputs 'replace first',
 * the program will ask which character to replace and what character 
 * they wish to replace it wish, then promptly replaces the first instance
 * of that character. For 'repalce last', the program does the same 
 * but for the last instance of the character. In the user inputs 
 * 'remove' the program asks what character to remove and which 
 * instance of that character to remove. 'Remove all' will ask which 
 * character to remove then removes all instances of that character. 
 * 'Quit' stops the program. If the user inputs a character that is not 
 * present in the String, there will be an error message. 
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
		
		String temp = ""; // temporary string to hold the new string when it is reversed
		System.out.println("Enter the string to be manipulated");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine(); // scan for text
		
		boolean quit = false;
		while (!quit) { // while loop and continuously asks for commands until the user quits
			
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = scan.nextLine();
			
			if (command.equalsIgnoreCase("reverse")) {
				for (int i = (text.length() - 1); i > -1; i--) {
					temp = temp + text.charAt(i);
				} 	
				
				text = temp;
				System.out.println("The new sentence is: " + text);
				temp = ""; // resets temp value in case reverse is called again
			} 
			
			else if (command.equalsIgnoreCase("replace first")) {
				
				System.out.println("Enter the character to replace");
				char replacechar = scan.nextLine().charAt(0);
				System.out.println("Enter the new character");
				String newchar = scan.nextLine();
				boolean found = false;
				boolean first = true;
				
				for (int j = 0; j < (text.length()); j++) {
					if (text.charAt(j) == replacechar && first) { 
						text = text.substring(0, j) + newchar + text.substring(j + 1);
						System.out.println("The new sentence is: " + text);
						found = true;
						first = false;
					}
				}
				
				if (!found) { // if the letter was found then this does not print, but if it was not found,
					System.out.println("The letter was not found in the word");
				}
				
			} 
			
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				char replacechar = scan.nextLine().charAt(0);
				System.out.println("Enter the new character");
				String newchar = scan.nextLine();
				boolean found = false;
				boolean first = true;
				
				for (int j = (text.length()) - 1; j > -1; j--) { // same code as the last one but for loop starts at the end of the string and works its way backwards
					if (text.charAt(j) == replacechar && first) {
						text = text.substring(0, j) + newchar + text.substring(j + 1);
						System.out.println("The new sentence is: " + text);
						found = true;
						first = false;
					}
				}
				if (!found) {
					System.out.println("The letter was not found in the word");
				}
			} 
			
			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char removechar = scan.nextLine().charAt(0);
				System.out.println("Enter the " + removechar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int occurrence = Integer.parseInt(scan.nextLine());
				int counter = 0;
				boolean found = false;
				for (int j = 0; j < (text.length()); j++) {
					if (text.charAt(j) == removechar) {
						counter += 1;
					}
					if (text.charAt(j) == removechar && (counter == occurrence)) {
						text = text.substring(0, j) + text.substring(j + 1);
						System.out.println("The new sentence is: " + text);
						found = true;
					}
				}
				if (!found) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}

			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char removechar = scan.nextLine().charAt(0);
				boolean found = false;
				for (int j = (text.length()) - 1; j > -1; j--) { // same code as before but it prints outside the for loop, allowing the for loop to go through all the times it needs to remove a letter
					if (text.charAt(j) == removechar) {
						text = text.substring(0, j) + text.substring(j + 1);
						found = true;
					}
				}
				if (!found) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} 
				else {
					System.out.println("The new sentence is: " + text);
				}
			} 
			
			else if (command.equalsIgnoreCase("quit")) {
				quit = true;
			} 
			else { // error catcher
				System.out.println("Invalid command input. Try again...");
			}

		}
		scan.close();
	}
}