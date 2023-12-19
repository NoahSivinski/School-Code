/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [10/15/2021]
 *
 * Purpose: The program can reverse sentence, replace character and remove character based on user's input.
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
		System.out.println("Enter the string to be manipulated");
		String inputString = keyboard.nextLine();
		String commands = "Enter your command (reverse, replace first, replace last, remove all, remove, quit)";
		boolean keepGoing = true;
		int length;
		String commandChose;

		//reverse
		while (keepGoing) {
			System.out.println(commands);
			commandChose = keyboard.nextLine();
			if (commandChose.equalsIgnoreCase("reverse")){
				String inputString2 = inputString;
				length = inputString2.length();
				System.out.print("The new sentence is: ");
				inputString = "";
				for (int indexStartAt = length - 1; indexStartAt >= 0; indexStartAt--) {
					String newChar = "" + inputString2.charAt(indexStartAt);
					inputString = inputString + newChar.concat("");
				} 	
				System.out.print(inputString);
				System.out.println();
			}

			//replace first
			else if (commandChose.equalsIgnoreCase("replace first")) {
				length = inputString.length();
				int indexPlace = -1;
				System.out.println("Enter the character to replace");
				String replaceChar = keyboard.next().substring(0,1);
				System.out.println("Enter the new character");
				String newChar = keyboard.next().substring(0,1);
				for (int index = length - 1; index >= 0; index --) {
					String indexChar = "" + inputString.charAt(index);
					if (indexChar.equals(replaceChar)) {
						indexPlace = index;
					}
				}
				if (indexPlace == -1) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputString = inputString.substring(0, indexPlace) + newChar + inputString.substring(indexPlace + 1, length);
					System.out.println("The new sentence is: " + inputString);
				}
				keyboard.nextLine();
			}

			//replace last
			else if (commandChose.equalsIgnoreCase("replace last")) {
				length = inputString.length();
				int indexPlace = -1;
				System.out.println("Enter the character to replace");
				String replaceChar = keyboard.next().substring(0,1);
				System.out.println("Enter the new character");
				String newChar = keyboard.next().substring(0,1);
				for (int index = 0; index <= length - 1; index ++) {
					String indexChar = "" + inputString.charAt(index);
					if (indexChar.equals(replaceChar)) {
						indexPlace = index;
					}
				}
				if (indexPlace == -1) {
					System.out.println("The letter was not found in the word");
				}
				else {
					inputString = inputString.substring(0, indexPlace) + newChar + inputString.substring(indexPlace + 1, length);
					System.out.println("The new sentence is: " + inputString);
				}
				keyboard.nextLine();
			}

			//remove all
			else if (commandChose.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				String removeChar = keyboard.next().substring(0,1);
				length = inputString.length();
				int originLength = length;
				int count = 0;
				boolean charLeft = true;
				for (int iindex = 0; iindex <= length - 1; iindex ++) {
					String iindexChar = "" + inputString.charAt(iindex);
					if (iindexChar.equals(removeChar)) {
						count++;
					}
				}
				if (count == 0) {
					System.out.println("Error: the letter you are tring to remove does not exist");
					keyboard.nextLine();
				}
				else {
					while (charLeft) {
						for (int index = 0; index <= length - 1; index ++) {
							String indexChar = "" + inputString.charAt(index);
							if (indexChar.equals(removeChar)) {
								int indexPlace = index;
								inputString = inputString.substring(0,indexPlace) + inputString.substring(indexPlace + 1); 
								length = inputString.length();
								if (originLength - length == count) {
									charLeft = false;
								}

							}

						}

					}
					System.out.println("The new sentence is: " + inputString);
					keyboard.nextLine();
				}
			}

			//remove
			else if (commandChose.equalsIgnoreCase("remove")) {
				System.out.println("Enter the charater to remove");
				String removeChar = keyboard.next().substring(0,1);
				System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				String inputString2 = inputString;
				int num = keyboard.nextInt();
				int count = 0;
				int indexPlace = 0;
				length = inputString2.length();
				for (int index = 0; index <= length - 1; index ++) {
					String indexChar = "" + inputString2.charAt(index);
					if (indexChar.equals(removeChar)) {
						count++;
						if (num == count) {
							indexPlace = index;
							inputString = inputString2.substring(0,indexPlace) + inputString.substring(indexPlace + 1); 
							System.out.println("The new sentence is: " + inputString);
							keyboard.nextLine();
						}
					}
				}
				if (num > count) {
					System.out.println("Error: the letter you are trying to remove does not exist");
					keyboard.nextLine();
				}
			}


			//quit
			else if (commandChose.equalsIgnoreCase("quit")) {
				keepGoing = false;
			}

			
			//command invalid
			else {
				System.out.println("Command invalid. Try again");
			}

			
		}//End of while

		
		keyboard.close();

		
	}

}
