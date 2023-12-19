/*
 * StringFun.java
 * Author:  Will Harrison
 * Submission Date:  3/19/2021
 *
 * Purpose: This program prompts the user to enter a message.
 * The user can then manipulate this message by reversing it,
 * replacing the first instance of a character, replacing the 
 * last instance of a letter, removing an entire character from
 * the message, or removing a single character in a certain position.
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
		String message, str = "";
		Scanner input = new Scanner(System.in);
		String command = null;
		
		System.out.println("Enter the string to be manipulated");
		message = input.nextLine();
		
		do {
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		command = input.nextLine();
		
			if (command.equalsIgnoreCase("reverse")) {
				for (int i = message.length() - 1; i >= 0; i--) {
					str = str + message.charAt(i);	
				}
				message = str;
				str = "";
				System.out.println("The new sentence is: " + message);
			}
			if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				char replaceFirstChar = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				String newFirstChar = input.nextLine();
				
				
				for (int i = 0; i <= message.length() - 1; i++) {
					if (message.charAt(i) == replaceFirstChar) {
						str = message.substring(0 , i) + newFirstChar + message.substring(i + 1);
						message = str;
						str = "";
						System.out.println("The new sentence is: \n" + message);
						i = 1000000000;
					}
				}
				
			}
			
			if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				char replaceLastChar = input.nextLine().charAt(0);
				System.out.println("Enter the new character");
				String newLastChar = input.nextLine();
				
				for (int i = message.length() - 1; i >=0; i--) {
					if (message.charAt(i) == replaceLastChar) {
						str = message.substring(0 , i) + newLastChar + message.substring(i + 1);
						message = str;
						str = "";
						System.out.println("The new sentence is: " + message);
						i = -1000000000;
					}
				}
			}
			
			if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char removeAllChar = input.nextLine().charAt(0);
				
				for (int i = 0; i <= message.length() -1; i++) {
					if (message.charAt(i) != removeAllChar) {
						str = str + message.charAt(i);
					}
				}
				message = str;
				str = "";
				System.out.println("Your new sentence is: " + message);
			}
			if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char removeChar = input.nextLine().charAt(0);
				System.out.println("Enter the " + removeChar + " that you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int charLocation = input.nextInt();
				input.nextLine();
				int counter = 0;
				
				for (int i = 0; i <= message.length() - 1; i++) {
					if (message.charAt(i) == removeChar) {
						counter++;
					}
					if (counter == charLocation) {
						str = message.substring(0 , i) + message.substring(i + 1);
						message = str;
						str = "";
						System.out.println("Your new sentence is: \n" + message);
						i = 1000000000;
					}
				}
			}
		}
		while (!(command.equalsIgnoreCase("quit")));
		
		input.close();
	}

}
