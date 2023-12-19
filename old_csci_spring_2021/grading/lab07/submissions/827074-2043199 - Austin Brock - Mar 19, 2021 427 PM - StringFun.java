/*
 * [StringFun].java
 * Author:  [Austin Brock] 
 * Submission Date:  [3/19/2021]
 *
 * Purpose: This program allows the user to enter sentences as strings
 * and change them with 5 commands
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

	
		char replaced;
		char replacing;
		char removeall; 
		char remove;
		int removeAt;

		
		
		String inputString1; 
		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		inputString1 = keyboard.nextLine();

		//This is where the code loops so that you can manipulate it based on the command1

		String command1;
		String manipulated;
		String manipulationLast;
		do {
			System.out.println("Enter your command1 (reverse, replace first, replace last, remove all, remove, quit)");
			command1 = keyboard.nextLine();
			manipulated = "";
			manipulationLast = "";
			if (!command1.equalsIgnoreCase("reverse") && !command1.equalsIgnoreCase("replace first") && !command1.equalsIgnoreCase("replace last") && !command1.equalsIgnoreCase("remove all") && !command1.equalsIgnoreCase("remove") &&!command1.equalsIgnoreCase("quit")) {
				System.out.println("Please enter one of the command1s (reverse, replace first, replace last, remove all, remove, quit)");
				command1 = keyboard.nextLine();
			}

			// This is where the string gets reversed
			if (command1.equalsIgnoreCase("reverse")) {
				for (int reverse = (inputString1.length() - 1); reverse > -1; reverse--) {
					manipulated += inputString1.charAt(reverse);
				}
				inputString1 = manipulated;
				System.out.println("The new sentence is: " + inputString1);
			}

			//replaces first character so that it matched the other character inputed by the user 
			if (command1.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				replaced = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacing = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replacef = 0; replacef < inputString1.length(); replacef++) {
					if (indexOfSearch < 0 && replaced == inputString1.charAt(replacef)) {
						manipulated += replacing;
						indexOfSearch = replacef;
					}
					else {
						manipulated += inputString1.charAt(replacef);
					}
				}
				if (manipulated.equals(inputString1)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputString1 = manipulated;
					System.out.println("The new sentence is: " + inputString1);
				}

			}

			//replaces last character that matches the new character inputed by the user
			if (command1.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				replaced = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				replacing = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replacef = (inputString1.length() - 1); replacef > -1; replacef--) {
					if (indexOfSearch < 0 && replaced == inputString1.charAt(replacef)) {
						manipulated += replacing;
						indexOfSearch = replacef;
					}
					else {
						manipulated += inputString1.charAt(replacef);
					}
				}

				for (int reverse = (inputString1.length() - 1); reverse > -1; reverse--) {
					manipulationLast += manipulated.charAt(reverse);
				}

				if (manipulationLast.equals(inputString1)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputString1 = manipulationLast;
					System.out.println("The new sentence is: " + inputString1);
				}

			}

			// removes all the specific characters from the string
			if (command1.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeall = keyboard.next().charAt(0);
				keyboard.nextLine();


				for (int r = 0; r < inputString1.length(); r++) {
					if (removeall != inputString1.charAt(r)) {
						manipulated += inputString1.charAt(r);
					}

				}
				if (manipulated.equals(inputString1)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputString1 = manipulated;
					System.out.println("The new sentence is: " + inputString1);
				}

			}

			// This removes only one character
			if (command1.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				remove = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				
				
				System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				removeAt = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;

				for (int r = 0; r < inputString1.length(); r++) {
					if (remove != inputString1.charAt(r))
						manipulated += inputString1.charAt(r);
					else {
						count++;
						if (count != removeAt)
							manipulated += inputString1.charAt(r);
					}

				}
				if (manipulated.equals(inputString1)) {
					
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					inputString1 = manipulated;
					
					System.out.println("The new sentence is: " + inputString1);
				}

			}

		} while (!command1.equalsIgnoreCase("quit"));

		System.out.println("...Execution Ends...");
		keyboard.close();
	}
}