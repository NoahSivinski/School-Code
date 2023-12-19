import java.util.Scanner;
/*
 * Stringfun.java
 * Author:  Toluwani Biobaku
 * Submission Date:  03/09/20
 *
 * Purpose: The purpose of this lab is to be able to manipulate a users initial sentence using 5 basic commands.
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

public class StringFun {

	public static void main(String[] args) {
		
		String hold,choice,lasthold;
		char manipulatechar,newchar;

		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String phrase = keyboard.nextLine();
		
		// 
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			choice = keyboard.nextLine();
			hold = "";
			lasthold = "";
			if (!choice.equalsIgnoreCase("reverse") && !choice.equalsIgnoreCase("replace first") && !choice.equalsIgnoreCase("replace last") && !choice.equalsIgnoreCase("remove all") && !choice.equalsIgnoreCase("remove") &&!choice.equalsIgnoreCase("quit")) {
				System.out.println("Please enter one of these :reverse, replace first, replace last, remove all, remove, quit)");
				choice = keyboard.nextLine();
	           }

			if (choice.equalsIgnoreCase("reverse")) {
				for (int i = phrase.length() - 1; i >= 0; i--) {
					hold = hold + phrase.charAt(i);
				}
				phrase = hold;
				System.out.println("The new sentence is: " + phrase);
			}
			else if (choice.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				manipulatechar = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newchar = keyboard.next().charAt(0);
				keyboard.nextLine();
				int replacementindex = -1;
				for (int i = 0; i < phrase.length(); i++) {
					if (replacementindex < 0 && manipulatechar == phrase.charAt(i)) {
	                       hold += newchar;
	                       replacementindex = i;
	                   }
	                   else {
	                       hold += phrase.charAt(i);
	                   }
	               }
				if (hold.equals(phrase)) {
	                   System.out.println("The letter was not found in the word");
	               }
	               else {
	                   phrase = hold;
	                   System.out.println("The new sentence is: " + phrase);
	               }
	           }
			else if (choice.equalsIgnoreCase("replace last")) {
	               System.out.println("Enter the character to replace");
	               manipulatechar = keyboard.next().charAt(0);
	               keyboard.nextLine();
	               System.out.println("Enter the new character");
	               newchar= keyboard.next().charAt(0);
	               keyboard.nextLine();

	               int replacementindex = -1;
	               for (int i = (phrase.length() - 1); i > -1; i--) {
	                   if (replacementindex < 0 && manipulatechar == phrase.charAt(i)) {
	                       hold += newchar;
	                       replacementindex = i;
	                   }
	                   else {
	                       hold += phrase.charAt(i);
	                   }
	               }

	               for (int j = (phrase.length() - 1); j > -1; j--) {
	                   lasthold += hold.charAt(j);
	               }

	               if (lasthold.equals(phrase)) {
	                   System.out.println("The letter was not found in the word");
	               }
	               else {
	                   phrase = lasthold;
	                   System.out.println("The new sentence is: " + phrase);
	               }
	           }
			else if (choice.equalsIgnoreCase("remove all")) {
	               System.out.println("Enter the character to remove");
	               char removechar = keyboard.next().charAt(0);
	               keyboard.nextLine();

	               for (int i = 0; i < phrase.length(); i++) {
	                   if (removechar != phrase.charAt(i)) {
	                       hold += phrase.charAt(i);
	                   }

	               }
	               if (hold.equals(phrase)) {
	                   System.out.println("Error: the letter you are trying to remove does not exist");
	               }
	               else {
	                   phrase = hold;
	                   System.out.println("The new sentence is: " + phrase);
	               }
	           }
			else if (choice.equalsIgnoreCase("remove")) {
	               System.out.println("Enter the character to remove");
	               char removeonechar = keyboard.next().charAt(0);
	               keyboard.nextLine();
	               System.out.println("Enter the " + removeonechar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
	               int removenum = keyboard.nextInt();
	               keyboard.nextLine();
	               int count = 0;

	               for (int i = 0; i < phrase.length(); i++) {
	                   if (removeonechar != phrase.charAt(i))
	                       hold += phrase.charAt(i);
	                   else {
	                       count++;
	                       if (count != removenum)
	                           hold += phrase.charAt(i);
	                   }
	                  
	               }
	               if (hold.equals(phrase)) {
	                   System.out.println("Error: the letter you are trying to remove does not exist");
	               }
	               else {
	                   phrase = hold;
	                   System.out.println("The new sentence is: " + phrase);
	               }

	           }
		}while (!choice.equalsIgnoreCase("quit"));

	       System.out.println("...Execution Ends...");
	       keyboard.close();
				
	}
		
	}

		


