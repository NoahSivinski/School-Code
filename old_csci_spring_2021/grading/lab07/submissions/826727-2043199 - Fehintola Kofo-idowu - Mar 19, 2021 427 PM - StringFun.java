/*
 * [CSCI 1301].java
 * Author:  [Fehintola Kofo-Idowu] 
 * Submission Date:  [3/19/2021]
 *
 * Purpose: This code aims at manipulation the users input however they want it.

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
		//Declare variables 
		String hold,choice,lasthold;
		char oldchar,newchar;

		//Allows user to input value 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String word = input.nextLine();
		
		// Allows the body of code in it to run at least once and asks the user to pick an option
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			choice = input.nextLine();
			// creates an empty spaceto hold the strings while its being manipulated
			hold = "";
			lasthold = "";
			//checks for the option the user inputs and asks to input the right thing if smthing else is inputed
			if (!choice.equalsIgnoreCase("reverse") && !choice.equalsIgnoreCase("replace first") && !choice.equalsIgnoreCase("replace last") && !choice.equalsIgnoreCase("remove all") && !choice.equalsIgnoreCase("remove") &&!choice.equalsIgnoreCase("quit")) {
				System.out.println("Please enter one of these :reverse, replace first, replace last, remove all, remove, quit)");
				choice = input.nextLine();
	           }
			// checks if the user inputes "reverse" and then proceeds to loop through the inputed string,runs and stores the reverse of the string inputed

			if (choice.equalsIgnoreCase("reverse")) {
				for (int i = word.length() - 1; i >= 0; i--) {
					hold = hold + word.charAt(i);
				}
				word = hold;
				System.out.println("The new sentence is: " + word);
			}
			//checks if the user inputes "replacd first" and then proceeds to loop through the inputed string and replaces the first character of the string inputed with the new charcter user inputs
			else if (choice.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				oldchar = input.next().charAt(0);
				input.nextLine();
				System.out.println("Enter the new character");
				newchar = input.next().charAt(0);
				input.nextLine();
				int replacedindex = -1;
				for (int i = 0; i < word.length(); i++) {
					if (replacedindex < 0 && oldchar == word.charAt(i)) {
	                       hold += newchar;
	                       replacedindex = i;
	                   }
	                   else {
	                       hold += word.charAt(i);
	                   }
	               }
				if (hold.equals(word)) {
	                   System.out.println("The letter was not found in the word");
	               }
	               else {
	                   word = hold;
	                   System.out.println("The new sentence is: " + word);
	               }
	           }
			else if (choice.equalsIgnoreCase("replace last")) {
	               System.out.println("Enter the character to replace");
	               oldchar = input.next().charAt(0);
	               input.nextLine();
	               System.out.println("Enter the new character");
	               newchar= input.next().charAt(0);
	               input.nextLine();

	               int replacedindex = -1;
	               for (int i = (word.length() - 1); i > -1; i--) {
	                   if (replacedindex < 0 && oldchar == word.charAt(i)) {
	                       hold += newchar;
	                       replacedindex = i;
	                   }
	                   else {
	                       hold += word.charAt(i);
	                   }
	               }

	               for (int j = (word.length() - 1); j > -1; j--) {
	                   lasthold += hold.charAt(j);
	               }

	               if (lasthold.equals(word)) {
	                   System.out.println("The letter was not found in the word");
	               }
	               else {
	                   word = lasthold;
	                   System.out.println("The new sentence is: " + word);
	               }
	           }
			else if (choice.equalsIgnoreCase("remove all")) {
	               System.out.println("Enter the character to remove");
	               char removechar = input.next().charAt(0);
	               input.nextLine();

	               for (int i = 0; i < word.length(); i++) {
	                   if (removechar != word.charAt(i)) {
	                       hold += word.charAt(i);
	                   }

	               }
	               if (hold.equals(word)) {
	                   System.out.println("Error: the letter you are trying to remove does not exist");
	               }
	               else {
	                   word = hold;
	                   System.out.println("The new sentence is: " + word);
	               }
	           }
			else if (choice.equalsIgnoreCase("remove")) {
	               System.out.println("Enter the character to remove");
	               char removeonechar = input.next().charAt(0);
	               input.nextLine();
	               System.out.println("Enter the " + removeonechar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
	               int removenum = input.nextInt();
	               input.nextLine();
	               int count = 0;

	               for (int i = 0; i < word.length(); i++) {
	                   if (removeonechar != word.charAt(i))
	                       hold += word.charAt(i);
	                   else {
	                       count++;
	                       if (count != removenum)
	                           hold += word.charAt(i);
	                   }
	                  
	               }
	               if (hold.equals(word)) {
	                   System.out.println("Error: the letter you are trying to remove does not exist");
	               }
	               else {
	                   word = hold;
	                   System.out.println("The new sentence is: " + word);
	               }

	           }
		}while (!choice.equalsIgnoreCase("quit"));

	       System.out.println("...Execution Ends...");
	       input.close();
				
	}
		
	}

		


