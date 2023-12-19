/*
 * String.java
 * Author:  Reid Cogswell 
 * Submission Date:  3-19-2021
 *
 * Purpose: Takes a string and reverses, replaces a character, and removes
 * characters from a string and then places it (if needed) with a new character.
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
 */import java.util.Scanner;

public class StringFun {
	
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter the string to be manipulated");
		String original = input.nextLine();
		boolean status = true;
		
		while (status) {
			System.out.println("Enter your command (reverse, replace first, replace last, replace all, remove, quit)");
			String command = input.nextLine();
			
			if (command.equalsIgnoreCase("quit")) {
				status = false;
			}
			
			else if (command.equalsIgnoreCase("reverse")) {
				String reverse = "";
				for (int i = original.length() - 1; i >= 0; i--) {
					reverse += original.charAt(i);
				}
				
				System.out.println("The new sentence is:" + reverse);
			}
			
			else if (command.equalsIgnoreCase("replace all")) {
				System.out.println("Enter the character to replace");
				char oldChar = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newChar = input.nextLine().charAt(0);
				String temp = "";
				boolean notFound = true;
				for (int i = 0; i < original.length(); i++) {
					if (original.charAt(i) == oldChar) { 
						temp += newChar;
						notFound = false;
					}
					else {
						temp += original.charAt(i);
					}
				}
				if (notFound == true) {
					System.out.println("Error: the letter you are trying to replace does not exist");
				}

				else {
					original = temp;
					System.out.println("The new sentence is: " + original);
				}
			}
				else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char removeChar = input.nextLine().charAt(0);
				
				String temp = "";
				for (int i = 0; i < original.length(); i++) {
					if (original.charAt(i) == removeChar) {
						continue;
					}
					else {
						temp += original.charAt(i);
					}
							
				}	
				if (original.equals(temp)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					original = temp;
					System.out.println("The new string is: " + original);
				input.close();
				}
			}
			
		}
	}
}

