/*
 * [StringFun].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [3/19/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * It allows the user to input a sentence or a word and then gives them the
 * option to either reverse, replace the first or the last letter 
 * of the word, replace all the letters in the word/sentence and 
 * modify to their liking. 
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
		Scanner keyboard = new Scanner(System.in);
		String userInput = "";
		System.out.print("Enter the string to be manipulated: ");
		String original = keyboard.nextLine();

		//user's choices
		do {
			System.out.print("\n\nEnter your command: " + "(reverse, replace first, replace last, "
					+ "remove all, remove, quit) ");
			String choice = keyboard.nextLine();
			//reverse
			if (choice.equalsIgnoreCase("reverse")) {
				String reverse = "";
				for (int c = original.length() - 1; c >= 0; c--)
					reverse += original.charAt(c);
				original = reverse;
				System.out.print("\n The new sentence is: " + original);

				//replace first
			} else if (choice.equalsIgnoreCase("replace first")) {
				String replace = "";
				System.out.print("\n Enter the character to replace: ");
				char toReplace = keyboard.next().charAt(0);
				System.out.print("\n Enter the new character: ");
				char newChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				int found = -1;
				for (int c = 0; c < original.length(); c++) {
					if (original.charAt(c) == toReplace) {
						replace += newChar;
						found = c;
						replace += original.substring(c + 1);
						c = original.length();
					} else
						replace += original.charAt(c);
				}
				if (found == -1) {
					System.out.print("\nThe letter was not found in the word.");
				} else {
					userInput = replace;
					if (userInput != null) {
						System.out.print("\n The new sentence is: " + userInput);
						original = userInput;
					}
				}

				//replace last
			} else if (choice.equalsIgnoreCase("replace last")) {
				String replace_1 = "";
				System.out.print("\n Enter the character to replace: ");
				char toReplace = keyboard.next().charAt(0);
				System.out.print("\n Enter the new character: ");
				char newChar = keyboard.next().charAt(0);
				keyboard.nextLine();

				int found = -1;
				for (int c = original.length() - 1; c >= 0; c--) {
					if (original.charAt(c) == toReplace) {
						replace_1 = newChar + replace_1;
						found = c;
						replace_1 = original.substring(0, c) + replace_1;
						c = -1;

					} else
						replace_1 = replace_1 + original.charAt(c);
				}
				if (found == -1) {
					System.out.print("\nThe letter " + toReplace + " was not found in the word.");

				} else
					userInput = replace_1;
				if (userInput != null) {
					System.out.print("\n The new sentence is: " + userInput);
					original = userInput;
				}

				//remove all
			} else if (choice.equalsIgnoreCase("remove all")) {
				System.out.print("\n Enter the character to remove: ");
				char toRemove = keyboard.next().charAt(0);
				keyboard.nextLine();
				String originalString = original;
				userInput = original;
				for (int j = 0; j < original.length(); j++) {
					boolean removed = false;
					for (int i = 0; i < userInput.length(); i++) {
						if (userInput.charAt(i) == toRemove && removed == false) {
							userInput = userInput.substring(0, i) + userInput.substring(i + 1);
							removed = true;
						}
					}
				}
				original = userInput;
				if (original.compareTo(originalString) == 0) {
					System.out.print("\n The letter " + toRemove + " was not found in the word.");
				} else {
					System.out.print("\n The new sentence is: " + original);
				}

				//remove
			} else if (choice.equalsIgnoreCase("remove")) {
				System.out.print("\n Enter the character to remove: ");
				char Remove_1 = keyboard.next().charAt(0);
				System.out.print("\nEnter the " + Remove_1
						+ " you would like to remove (Not the index -1 = 1st, 2 = 2nd, etc.)");
				int indexPosition = keyboard.nextInt();

				keyboard.nextLine();

				if (indexPosition < 0 || indexPosition >= original.length()) {
					System.out.print("\n Invalid index position: " + indexPosition);
				}
				else {
					boolean removed = false;
					int counter = 0;
					for (int i = 0; i < original.length(); i++) {
						if (original.charAt(i) == Remove_1) {
							counter++;
						}
						if (counter == indexPosition && removed == false) {
							userInput = original.substring(0, i) + original.substring(i + 1);
							removed = true;
						}
					}
					if (counter < indexPosition) {
						System.out.print("\nError: the letter you are trying to remove does not exist");
					} else {
						System.out.print("\n The new sentence is: " + userInput);
						original = userInput;
					}
				}

			} else if (choice.equalsIgnoreCase("quit"))
				System.exit(0);
			else
				System.out.print("Input Invalid");
		} while (true);
	}
}