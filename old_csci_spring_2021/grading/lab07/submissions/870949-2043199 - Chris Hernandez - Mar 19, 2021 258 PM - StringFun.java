/*
 * [StringFun].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [3/19/2021]
 *
 * Purpose: 
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
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String sentence = input.nextLine();
		String result = "";
		
		while (true) {
			
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = input.nextLine();
			
			if (command.equalsIgnoreCase("reverse")) {
				result = "";
				for (int i = sentence.length() - 1; i >= 0; i--) {
					result = result + sentence.charAt(i);		
				}
			}
			
			else if (command.equalsIgnoreCase("replace first")) {
				result = "";
				System.out.println("Enter the character to replace: ");
				char older = input.next().charAt(0);
				System.out.println("Enter the new character");
				char newer = input.next().charAt(0);
				input.nextLine();
				int charIndex = -1;
					for (int i = 0; i < sentence.length(); i++) {
						if (sentence.charAt(i) == older && charIndex == -1) {
							result += newer;
							charIndex = i;
							result += sentence.substring(i + 1);
						}
						else if (charIndex == -1) {
							result += sentence.charAt(i);
						}
					}
					if (charIndex == -1) {
							System.out.println("The letter was not found in the word.");
					}
					else {
							result = sentence.substring(0, charIndex) + newer + sentence.substring(charIndex + 1);
					}
			}
			
			else if (command.equalsIgnoreCase("replace last")) {
				result = "";
				System.out.println("Enter the character to replace: ");
				char older = input.next().charAt(0);
				System.out.println("Enter the new character");
				char newer = input.next().charAt(0);
				input.nextLine();
				int charIndex = -1;
					for (int i = sentence.length() - 1; i >= 0; i--) {
						if (sentence.charAt(i) == older && charIndex == -1) {
							result += newer;
							charIndex = i;
							result += sentence.substring(0, i);
						}
						else {
							result += sentence.charAt(i);
						}
					if (charIndex == -1) {
						System.out.println("The letter was not found in the word.");
					}
					else {
						result = sentence.substring(0, charIndex) + newer + sentence.substring(charIndex + 1);
					}
				}
			}
			
			else if (command.equalsIgnoreCase("remove")) {
				result = "";
				System.out.println("Enter the character to remove: ");
				char charRem = input.next().charAt(0);
				System.out.println("Enter the " + charRem + " you would like to remove (Note the index - 1 = 1st, 2 = 2nd, etc)");
				int charIndex  = input.nextInt() - 1;
				input.nextLine();
					if (charIndex < 0 || charIndex >= sentence.length()) {
						System.out.println("Invalid index position: " + charIndex);
					}
					else if (sentence.charAt(charIndex) != charRem){
						System.out.println("Error: the letter you are trying to remove does not exist.");
					}
					else {
						if (charIndex == 0) {
							result += sentence.substring(1);
						}
						else {
							result += sentence.substring(0, charIndex) + sentence.substring(charIndex + 1);
						}		
					}
			}
			else if (command.equalsIgnoreCase("remove all")) {
				result = "";
				System.out.println("Enter the character to remove: ");
				char charRem = input.next().charAt(0);
				input.nextLine();
				for (int i = 0; i <= sentence.length() - 1; i++) {
					if (sentence.charAt(i) != charRem) {
						result += sentence.charAt(i);
					}
				}
			}
			
			else if (command.equalsIgnoreCase("quit")) {
					System.out.println("...Execution Ends...");
					System.exit(0);
				}	
			
			System.out.println("The new sentence is " + result);
			sentence = result;
			
		}
	}
}