/*
 * FunWithStrings.java
 * Author:  Matthew Hargrove 
 * Submission Date:  3/19/2021
 *
 * Purpose: To identify a sentence or word and manipulate it based on a given command. Then be able to continuously manipulate this new word
 * over and over until you want to end the program. 
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

public class FunWithStrings {

	public static void main(String[] args) {
		

		String sentence;
		String command1;
		String newSentence;
		String manipulationLast;
		char oldChar;
		char newChar;
		char removeall;
		char remove;
		int removeAt;


		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		sentence = keyboard.nextLine();


		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command1 = keyboard.nextLine(); 
			newSentence = ""; 
			manipulationLast = "";
			if (!command1.equalsIgnoreCase("reverse") && !command1.equalsIgnoreCase("replace first") && !command1.equalsIgnoreCase("replace last") && !command1.equalsIgnoreCase("remove all") && !command1.equalsIgnoreCase("remove") &&!command1.equalsIgnoreCase("quit")) 
			{
				System.out.println("Please enter one of the commands (reverse, replace first, replace last, remove all, remove, quit)");
				command1 = keyboard.nextLine();
			}


			if (command1.equalsIgnoreCase("reverse")) {
				for (int reverse = (sentence.length() - 1); reverse > -1; reverse--) {
					newSentence += sentence.charAt(reverse);
				}
				sentence = newSentence;
				System.out.println("The new sentence is: " + sentence);
			}



			if (command1.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				oldChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newChar = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replaceInteger = 0; replaceInteger < sentence.length(); replaceInteger++) {
					if (indexOfSearch < 0 && oldChar == sentence.charAt(replaceInteger)) {
						newSentence += newChar;
						indexOfSearch = replaceInteger;
					}
					else {
						newSentence += sentence.charAt(replaceInteger);
					}
				}
				if (newSentence.equals(sentence)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					sentence = newSentence;
					System.out.println("The new sentence is: " + sentence);
				}

			}



			if (command1.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				oldChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newChar = keyboard.next().charAt(0);
				keyboard.nextLine();

				int indexOfSearch = -1;
				for (int replaceInteger = (sentence.length() - 1); replaceInteger > -1; replaceInteger--) {
					if (indexOfSearch < 0 && oldChar == sentence.charAt(replaceInteger)) {
						newSentence += newChar;
						indexOfSearch = replaceInteger;
					}
					else {
						newSentence += sentence.charAt(replaceInteger);
					}
				}

				for (int reverse = (sentence.length() - 1); reverse > -1; reverse--) {
					manipulationLast += newSentence.charAt(reverse);
				}

				if (manipulationLast.equals(sentence)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					sentence = manipulationLast;
					System.out.println("The new sentence is: " + sentence);
				}

			}



			if (command1.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeall = keyboard.next().charAt(0);
				keyboard.nextLine();


				for (int r = 0; r < sentence.length(); r++) {
					if (removeall != sentence.charAt(r)) {
						newSentence += sentence.charAt(r);
					}

				}
				if (newSentence.equals(sentence)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					sentence = newSentence;
					System.out.println("The new sentence is: " + sentence);
				}

			}



			if (command1.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				remove = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				removeAt = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;

				for (int r = 0; r < sentence.length(); r++) {
					if (remove != sentence.charAt(r))
						newSentence += sentence.charAt(r);
					else {
						count++;
						if (count != removeAt)
							newSentence += sentence.charAt(r);
					}

				}
				if (newSentence.equals(sentence)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					sentence = newSentence;
					System.out.println("The new sentence is: " + sentence);
				}

			}

		} while (!command1.equalsIgnoreCase("quit"));

		System.out.println("...Execution Ends...");

	}

}
