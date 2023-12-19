/*
 * StringFun.java
 * Author:  Husain Naseer 
 * Submission Date: 10/16/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * In this lab we used strings and nested loops to manipulate and change a sentence entered by the user. 
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

	public static void main(String [] args) {
		Scanner str = new Scanner(System.in);

		System.out.println("Enter the string to be manipulated");
		String input = str.nextLine();

		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		String command = str.nextLine();
		String newInput = input;

		while(!command.equalsIgnoreCase("quit")) {
			if(command.equalsIgnoreCase("reverse")) {
				String reversed = "";
				for(int i = newInput.length() - 1; i >= 0; --i) {
					reversed += newInput.charAt(i);
				}
				newInput = reversed;
				System.out.println("The new sentence is: " +newInput + "\n");
			}
			if(command.equalsIgnoreCase("replace first")) {
				String rFirst = "";
				System.out.println("Enter the character to replace");
				char firstToReplace = str.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char firstNewChar = str.nextLine().charAt(0);
				boolean foundChar = false;
				boolean foundOnce = false;

				while(!foundChar) {
					for (int i = 0; i < newInput.length(); i++) {
						char a = newInput.charAt(i);
						if(a == firstToReplace && !foundOnce) {
							foundChar = true;
							rFirst = newInput.substring(0,i) + firstNewChar + newInput.substring(i+1);
							foundOnce = true;
						}
					}
					if(foundChar) {
						newInput = rFirst;
						System.out.println("The new sentence is: " + newInput);
					}
					else
						System.out.println("The letter was not found in the word");
					foundChar = true;
				}
			}
			if(command.equalsIgnoreCase("replace last")) {
				String rLast = "";
				System.out.println("Enter the character to replace");
				char lastToReplace = str.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char lastNewChar = str.nextLine().charAt(0);
				boolean foundChar = false;
				boolean foundOnce = false;

				while(!foundChar) {
					for(int i = newInput.length() - 1; i > 1; i--) {
						char a = newInput.charAt(i);
						if(a == lastToReplace && !foundOnce) {
							foundChar = true;
							rLast = newInput.substring(0,i) + lastNewChar + newInput.substring(i + 1);
							foundOnce = true;
						}
					}
					if(foundChar) {
						newInput = rLast;
						System.out.println("The new sentence is: " + newInput);
					}
					else
						System.out.println("The letter was not found in the word");
					foundChar = true;
				}
			}
			if(command.equalsIgnoreCase("remove all")) {
				String removedAll = "";
				System.out.println("Enter the character to remove");
				char toRemove = str.nextLine().charAt(0);
				for(int i = 0; i < newInput.length(); i++) {
					if(newInput.charAt(i) == toRemove){
						removedAll += "";
					}
					else {
						removedAll += newInput.charAt(i);
					}
				}
				newInput = removedAll;
				System.out.println("The new sentence is: " + newInput);
			}
			if(command.equalsIgnoreCase("remove")) {
				String removedOne = "";
				System.out.println("Enter the character to remove");
				char toRemoveOne = str.nextLine().charAt(0);
				System.out.println("Enter the " + toRemoveOne + "you would like to remove (Not the index -1 = 1st, 2 = 2nd, etc.):");
				int givenNumber = Integer.parseInt(str.nextLine());
				int count = 0;
				for(int i = 0; i < newInput.length(); i++) {
					if(newInput.charAt(i) == toRemoveOne) {
						count++;
						if(count == givenNumber) {
							removedOne = newInput.substring(0,i) + newInput.substring(i + 1);
						}
					}
				}
				newInput = removedOne;
				System.out.println("The new sentence is: " + newInput);
			}
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = str.nextLine();
		}
		str.close();
	}
}