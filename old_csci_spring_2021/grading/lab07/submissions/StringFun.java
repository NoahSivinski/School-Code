
/*
 * [StringFun].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [3/19/2021]
 *
 * Purpose: This program is supposed to manipulate the inputed string using various commands such as reverse, remove, and replace.
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

		// declaring the input string and command variables
		String inputString;
		String inputCommand;

		// outside the loop
		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);

		inputString = keyboard.nextLine();
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		inputCommand = keyboard.nextLine();

		// beginning of the loop
		while (!inputCommand.equalsIgnoreCase("quit")) {

			// declaring length variable
			int length = inputString.length();
			// reverse command
			if (inputCommand.equalsIgnoreCase("reverse")) {
				String reverseSentence = "";

				for (int i = length - 1; i >= 0; i--) {
					reverseSentence = reverseSentence + inputString.charAt(i);
				}
				System.out.println("The new sentence is: " + reverseSentence);
				inputString = reverseSentence;

			}

			// replace first command
			if (inputCommand.equalsIgnoreCase("replace first")) {
				// declaring the variables for replace first
				char characterReplace;
				char newCharacter;

				System.out.println("Enter the character to replace");
				String replace = new String();
				replace = keyboard.nextLine();
				characterReplace = replace.charAt(0);
				System.out.println("Enter the new character");
				String newchar = new String();
				newchar = keyboard.nextLine();
				newCharacter = newchar.charAt(0);

				String newstring = new String();
				boolean charwasFound = false;
				for (int i = 0; i < inputString.length(); i++) {
					if (inputString.charAt(i) == (characterReplace)) {
						newstring += inputString.substring(0, i) + newchar + inputString.substring(i + 1);
						System.out.println("The new sentence is: " + newstring);
						charwasFound = true;
						inputString = newstring;
						i = inputString.length();
					}

				}
				// error message for replace first
				if (charwasFound == false) {
					System.out.println("The letter was not found in the word");
				}

			}
			// replace last command
			if (inputCommand.equalsIgnoreCase("replace last")) {
				// declaring variables for replace last
				char characterReplace;
				char newCharacter;

				System.out.println("Enter the character to replace");
				String replace = new String();
				replace = keyboard.nextLine();
				characterReplace = replace.charAt(0);
				System.out.println("Enter the new character");
				String newchar = new String();
				newchar = keyboard.nextLine();
				newCharacter = newchar.charAt(0);

				String newstring = new String();
				boolean charwasFound = false;
				for (int i = inputString.length() - 1; i >= 0; i--) {
					if (inputString.charAt(i) == (characterReplace)) {
						newstring += inputString.substring(0, i) + newchar + inputString.substring(i + 1);
						System.out.println("The new sentence is: " + newstring);
						charwasFound = true;
						inputString = newstring;
						i = inputString.length();
					}

				}
				// error message for replace last
				if (charwasFound == false) {
					System.out.println("The letter was not found in the word");
				}

			}
			// remove command
			if (inputCommand.equalsIgnoreCase("remove")) {
				String newstring = new String();
				int counter = 0;
				System.out.println("Enter the character to remove");
				String removeCharacter = keyboard.next();
				System.out.println("Enter the " + removeCharacter
						+ " would you like to remove (Not the index -1 = 1st, 2 = 2nd, etc.):");
				int instanceRemove = keyboard.nextInt();
				keyboard.nextLine();

				for (int i = 0; i <= inputString.length() - 1; i++) {
					if (inputString.substring(i, i + 1).equals(removeCharacter)) {
						counter++;
					}

					if (inputString.substring(i, i + 1).equals(removeCharacter) && (instanceRemove == counter)) {
						if (i == 0) {
							newstring = inputString.substring(i + 1);
						}

						else if (i == inputString.length() - 1) {
							newstring = inputString.substring(0, i);
						}

						else {
							newstring = inputString.substring(0, i).concat(inputString.substring(i + 1));
						}
						i = inputString.length();
					}

				}
				// error message for remove
				if (counter != instanceRemove) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}

				else {
					inputString = newstring;
					System.out.println("The new sentence is: " + inputString);
				}
			}

			// remove all command
			if (inputCommand.equalsIgnoreCase("remove all")) {

				String newstring = new String();
				int i = 0;
				System.out.println("Enter the character to remove");
				String removeAllCharacter = keyboard.nextLine();

				while (i <= inputString.length() - 1) {
					if (removeAllCharacter.equals(inputString.substring(i, i + 1))) {
						if (i == 0) {
							newstring = inputString.substring(i + 1);
							inputString = newstring;
						}

						else if (i == inputString.length() - 1) {
							newstring = inputString.substring(0, i);
							inputString = newstring;
						}

						else {
							newstring = inputString.substring(0, i).concat(inputString.substring(i + 1));
							inputString = newstring;
						}
					} else {
						i++;
					}
				}
				System.out.println("The new sentence is: " + inputString);
			}
			// recurring "Enter your command..."
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			inputCommand = keyboard.nextLine();
		}
		// quit command
		System.exit(0);

		keyboard.close();
	}

}
