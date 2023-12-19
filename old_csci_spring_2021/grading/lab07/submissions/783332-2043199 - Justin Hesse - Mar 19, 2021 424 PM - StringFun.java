/*
 * StringFun.java
 * Author:  Justin Hesse 
 * Submission Date:  3/19/2021
 *
 * Purpose: Reads a string from the user and allows them to manipulate it 
 * through various commands. 
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

		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the string to be manipulated");
		String userInput = scan.nextLine();

		//isFinished controls the while loop. Once the user inputs the quit command, isFinished is set to "true"
		Boolean isFinished = false;
		while(isFinished == false) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = scan.nextLine();

			//iterates backwards through the original string and assigns each index to reversedInput
			if(command.equalsIgnoreCase("reverse")) {
				String reversedInput = "";
				for(int i = userInput.length() - 1; i >= 0; i--) {
					reversedInput = reversedInput + userInput.charAt(i);
				}
				userInput = reversedInput;
				System.out.println("The new sentence is: " + userInput);
			}


			else if(command.equalsIgnoreCase("Replace first")) {
				System.out.println("Enter the character to replace");
				char toReplaceFirst = scan.next().charAt(0);
				scan.nextLine();
				System.out.println("Enter the new character");
				char replaceFirstWith = scan.next().charAt(0);
				scan.nextLine();
				for(int i = 0; i < userInput.length(); i++) {		//Loop iterates through userInput until the char to replace is found
					if(userInput.charAt(i) == toReplaceFirst) {     //The String is then divided and the new character is inserted at that index
						userInput = userInput.substring(0,i) + replaceFirstWith + userInput.substring(i+1);
						System.out.println("The new sentence is: " + userInput);
						i = userInput.length() + 1;					
					}
					else if(i == userInput.length() - 1) {
						System.out.println("The letter was not found in the word");
					}
				}
			}

			else if(command.equalsIgnoreCase("Replace last")) {
				System.out.println("Enter the character to replace");
				char toReplaceLast = scan.next().charAt(0);
				scan.nextLine();
				System.out.println("Enter the new character");
				char replaceLastWith = scan.next().charAt(0);
				scan.nextLine();
				for(int i = userInput.length() - 1; i >= 0; i--) {	//Loop iterates backwards through userInput until the char to replace is found			
					if(userInput.charAt(i) == toReplaceLast) {		//The String is then divided and the new character is inserted at that index.
						userInput = userInput.substring(0,i) + replaceLastWith + userInput.substring(i+1);
						System.out.println("The new sentence is: " + userInput);
						i = -1;
					}
					else if (i == 0) {
						System.out.println("The letter was not found in the word");
					}					
				}
			}

			else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char toRemove = scan.next().charAt(0);
				scan.nextLine();
				System.out.println("Enter the " + toRemove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int whichOne = scan.nextInt();
				scan.nextLine();
				int count = 0;
				for (int i = 0; i < userInput.length(); i++) {	//Loop iterates through userInput until the correct char is found
					if (userInput.charAt(i) == toRemove) {		//The string is then divided and that char is excluded
						count++;
						if (count == whichOne) {
							userInput = userInput.substring(0,i) + userInput.substring(i+1);
							System.out.println("The new sentence is: " + userInput);
						}
					}					
				}
				if (count == 0) {
					System.out.println("The letter was not found in the word");
				}
				else if (count < whichOne) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}

			else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char toRemoveAll = scan.next().charAt(0);
				scan.nextLine();
				String holder = "";				
				for (int i = 0; i < userInput.length(); i++) {	//Loop iterates through userInput and assigns all index values that are
					if (userInput.charAt(i) != toRemoveAll) {	//not equal to the char the user wants to remove to the String holder
						holder = holder + userInput.charAt(i);	//holder is then assigned to userInput					
					}
				}
				if(holder.equals(userInput)){
					System.out.println("The letter was not found in the string");
				}
				else {
					userInput = holder;
					System.out.println("The new sentence is: " + userInput);	
				}
			}

			else if (command.equalsIgnoreCase("quit")) {
				isFinished = true;
			}

			else {
				System.out.println("Invalid command.");
			}
		}
		scan.close();
	}

}
