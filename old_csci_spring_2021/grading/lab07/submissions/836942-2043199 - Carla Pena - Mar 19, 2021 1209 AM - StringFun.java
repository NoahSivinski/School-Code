/*
 * StringFun.java
 * Author:  Carla Pena
 * Submission Date:  19 March 2021
 *
 * Purpose: The program allows user to enter 
 * a sentence. From there they have the option
 * to modify the original sentence. There are
 * six commands the user can use to modify the 
 * original sentence. The program will ask the 
 * user for commands over again until the user 
 * commands quit. 
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
		// TODO Auto-generated method stub
		
		String command = "";
		String message = "";
		boolean skip = false;
		
		Scanner scan = new Scanner(System.in);
		
		while(!command.equalsIgnoreCase("quit")) {
			if (!skip) {
				System.out.println("Enter the string to be manipulated");
				message = scan.nextLine();
			}
			
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = scan.nextLine();
			
			
			if(command.equalsIgnoreCase("reverse")) {
				String output = "";
				skip = true;
				
				for (int i = 0; i < message.length(); i++) {
					output = output + message.charAt(message.length() - 1 - i);
				}
				
				message = output;
				System.out.println("The new sentence is: " + output);
			}
			else if (command.equalsIgnoreCase("replace first")) {
				String output = "";
				skip = true;
				
				System.out.println("Enter the character to replace");
				String first = scan.next();
				
				System.out.println("Enter the new character");
				String second = scan.next();
				
				if (message.substring(0,1).equals(first)) {
					output = second + message.substring(1, message.length());
					System.out.println("The new sentence is: " + output);
					message = output;
					scan.nextLine();
				}
				else {
					System.out.println("The letter was not found in the word");
				}
				
			}
			else if (command.equalsIgnoreCase("replace last")) {
				String output = "";
				skip = true;
				
				System.out.println("Enter the character to replace");
				String first = scan.next();
				
				System.out.println("Enter the new character");
				String second = scan.next();
				
				if (message.substring(message.length() - 1, message.length()).equals(first)) {
					output = message.substring(0, message.length() - 1) + second;
					System.out.println("The new sentence is: " + output);
					message = output;
					scan.nextLine();
				}
			}
			else if (command.equalsIgnoreCase("remove all")) {
				String output = "";
				skip = true;
				boolean leave = false;
				int count = 0;
				
				System.out.println("Enter the character to remove");
				char remove = scan.next().charAt(0);
				
				while(!leave) {
					if (message.charAt(count) == remove) {
						if (count != message.length() - 1) {
							count++;
						}
						else {
							count++;
						}
					}
					else {
						if (count == message.length() - 1)
						{
							output = output + message.substring(count, message.length());
							leave = true;
						}
						else {
							output = output + message.substring(count, count + 1);
							count++;
						}
					}
				}
				System.out.println("The new sentence is: " + output);
				message = output;
				scan.nextLine();
			}
			else if (command.equalsIgnoreCase("remove")) {
				String output = "";
				skip = true;
				boolean leave = false;
				int count = 0;
				int charNumber = 0;
				
				System.out.println("Enter the character to remove");
				char remove = scan.next().charAt(0);
				
				System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int toRemove = scan.nextInt();
				
				while(!leave) {
					if (message.charAt(count) == remove) {
						charNumber++;
						if (charNumber != toRemove && count != message.length() - 1) {
							count++;
						}
						else {
							if (count > 0) {
								output = message.substring(0, count) + message.substring(count + 1, message.length());
							}
							else {
								output = message.substring(1, message.length());
							}
							System.out.println("The new sentence is: " + output);
							message = output;
							scan.nextLine();
							leave = true;
						}
					}
					else {
						if (count == message.length() - 1 && charNumber < toRemove) {
							System.out.println("Error: the letter you are trying to remove does not exist");
							leave = true;
							scan.nextLine();
						}
						else {
							count++;
						}
					}
				}
			}
			else if (command.equalsIgnoreCase("quit")) {
				
			}
			else {
				if (!skip) {
					System.out.println(command + " is not a command.");
				}
			}
		}
		scan.close();
		System.out.println("...Execution Ends...");
	}

}
