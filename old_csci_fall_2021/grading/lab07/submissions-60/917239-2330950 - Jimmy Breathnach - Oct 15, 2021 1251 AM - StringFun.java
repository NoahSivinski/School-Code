/*
 * StringFun.java
 * Author:  James Breathnach
 * Submission Date:  10/15/2021
 *
 * Purpose: The purpose of this program is to perform certain actions on a string inputed by 
 * a user. The user can continue using any of the available commands on the string until they put 
 * in quit.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;
public class StringFun {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		//Input is the string the user enters
		String input ="";
		// command is the string that user enters for what they want to do with the input
		String command = "";
		// temp is a blank string used by the program to get the new strings
		String temp = "";

		System.out.println("Enter the string to be manipulated");

		input = keyboard.nextLine();
		// the loop starts here and q is set up which ends the program only when quit is typed.
		for(int q=0; q<1;) {

			command ="";
			//sets temp to blank so it can be reused after every command
			temp ="";
			//prompts the user to give the command that they want to do.
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			System.out.print("");
			//Next line is being ignored but this works for some stupid reason
			command = keyboard.next();
			command= command + keyboard.nextLine();
			command= command.trim();
			//this is the reverse section
			if(command.equalsIgnoreCase("reverse")) {
				//using a for loop, it takes the index of the last character and prints it backwards.
				for(int a = input.length()-1; a>=0; a--)
				{
					temp= temp + input.charAt(a);
				}
				// the temp string becomes the input string and is printed
				input = temp;
				System.out.println("The new sentence is " + input);

				//The section for replace first.
			}else if(command.equalsIgnoreCase("replace first")) {
				//prompts the user for what they want to replace
				System.out.println("Enter the character to replace");
				char c = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				//prompts the user for what they want to replace with
				char d = keyboard.next().charAt(0);
				//b is simply used to determine whether there are any of the letters in the string. b is always used for this purpose.
				int b =0;
				for (int a=0; a < input.length(); a++) {
					//checks if the character is the same and then if it is it prints the replacement one.
					if (input.charAt(a) == (c) && b==0) {
						temp= temp +d ;
						b++;
						// if there are no replacement characters it prints it normally.
					}else {
						temp = temp + input.charAt(a);
					}

				}
				//if the letter isn't found, then an error message is displayed
				if (b==0) {
					System.out.println("The letter was not found in the word");	
				}
				else{
					input= temp;
					System.out.println("The new sentence is " + input);
				}
			}
			//Code for replace last
			else if(command.equalsIgnoreCase("replace last")) {
				//finds the character to replace and what to replace it with
				System.out.println("Enter the character to replace");
				char c = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				char d = keyboard.next().charAt(0);
				//b used so only the last one will be picked
				int b = 0;
				//The loops works like the previous one except it prints the characters backwards
				for (int a=input.length() - 1; a >=0; a--) {
					if (input.charAt(a) == (c) && b==0) {
						temp= temp +d ;
						b++;
					}else {
						temp = temp + input.charAt(a);
					}
				}
				// sets the input to the temp so it can be reversed and the temp is reset.
				input = temp;
				temp="";
				//the same loop for reverse command
				for(int a = input.length()-1; a>=0; a--) {
					temp= temp + input.charAt(a);
				}
				input=temp;

				
				//the error message if it is not found.
				if ( b == 0) {
					System.out.println("The letter was not found in the word");	
				}
				else {
					//Prints the new string
					System.out.println("The new sentence is " + input);
				}
			}
			//The section for remove all
			else if(command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char c = keyboard.next().charAt(0);
				int b=0;
				for (int a =0; a<input.length(); a++) {
					//if the character is in the string then it doesn't print it and b goes up
					if (input.charAt(a) == (c)) {
						b++;
					}else {
						temp = temp +input.charAt(a);
					}
				}
				//prints out the error message if the character doesn't exist
				if ( b == 0) {
					System.out.println("The letter was not found in the word");	
				}
				else{
					input=temp;
					System.out.println("The new sentence is " + input);
				}
			}
			//this is the remove section
			else if(command.equalsIgnoreCase("remove")) {
				//The character and which number of the character to be removed is asked.
				System.out.println("Enter the character to remove");
				char c = keyboard.next().charAt(0);
				System.out.println("Enter the " + c + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):" );
				int x = keyboard.nextInt();
				int b =0;
				for (int a =0; a<input.length(); a++) {
					//checks the character and counts if it is correct.
					if (input.charAt(a) == (c)) {
						b++;
						//if it is the right number, than it won't be printed
						if (b!=x) {
							temp= temp + input.charAt(a);
						}
					}
					// Prints the character normally if its not the one selected
					else {
						temp= temp + input.charAt(a);

					}
				}
				//Makes sure that letter that wants to be removed exists
				if (b<x) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					input=temp;
					System.out.println("The new sentence is " + input);
				}
			}


			//If the user enters quit then q becomes greater than 0 making the boolean false.
			else if(command.equalsIgnoreCase("quit")) {
				System.out.println("...Execution Ends...");
				q++;
			}

			//If the user doesn't enter a valid command then they are prompted to again.
			else {
				System.out.println("Command invalid. Try again");

			}
		}

	}
}

