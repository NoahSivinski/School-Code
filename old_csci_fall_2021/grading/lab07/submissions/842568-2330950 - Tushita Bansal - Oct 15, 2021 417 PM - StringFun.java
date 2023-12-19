/*
 * StringFun.java
 * Author:  Tushita Bansal 
 * Submission Date:  October 15, 2021
 *
 * Purpose: This program is used to modify user input with the inputted command.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
import java.util.Scanner;
public class StringFun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to be manipulated");
		String input = sc.nextLine();

		boolean ending = true;
		String modifiedInput;
		String reverseModifiedInput;

		while(ending = true) {

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = sc.nextLine();	

			if (command.equalsIgnoreCase("reverse")) {
				String reverseChars="";
				System.out.print("The new sentence is: ");
				for (int i = input.length()-1; i >=0; i-- ) {
					reverseChars += input.charAt(i);	
				}
				input = reverseChars;
				System.out.println("The new sentence is " + input);	
			}
			else if(command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				String charReplace = sc.nextLine();
				System.out.println("Enter the new character");
				String charNew = sc.nextLine();
				boolean replaceFirstBoolean = false;
				for (int i =0; i < input.length(); i++) {
					modifiedInput = input.substring(i, i+1);
					if(modifiedInput.equals(charReplace) && !(replaceFirstBoolean)) {
						input = input.substring(0,i) + charNew + input.substring(i+1);
						replaceFirstBoolean = true;
					}
					}
				if(replaceFirstBoolean) {
					System.out.println("The new sentence is: "+ input);
				}
				else {
					System.out.println("The letter was not found in the word");
				}

			}
			else if(command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				String charLastReplace = sc.nextLine();
				System.out.println("Enter the new character");
				String charLastNew = sc.nextLine();
				boolean replaceLastBoolean = false;
				for (int i =input.length()-1; i >= 0; i--) {
					modifiedInput = input.substring(i, i+1);
					if(modifiedInput.equals(charLastReplace) && !(replaceLastBoolean)) {
						input = input.substring(0,i) + charLastNew + input.substring(i+1);
						replaceLastBoolean = true;
					}
				}
				if(replaceLastBoolean) {
					System.out.println("The new sentence is: " + input);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			else if( command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				String removeCharInput = sc.next();
				System.out.println("Enter the " + removeCharInput + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int removeNum = sc.nextInt();
				int count = 1;
				boolean removeBoolean = false;
				for(int i = 0; i < input.length(); i++) {
					String current = input.substring(i,i+1);
					if(current.equals(removeCharInput)){
						if(count == removeNum) {
							input = input.substring(0,i) + input.substring(i+1, input.length());
							removeBoolean = true;
						}
						count++;
					}
				}
				if (removeBoolean) {
					System.out.println("The new sentence is: " + input);
				}
				else{
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				sc.nextLine();
			}
			else if( command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				String charRemoveAll = sc.nextLine();
				boolean removeAllBoolean = false;
				for (int i =input.length()-1; i >= 0; i--) {
					modifiedInput = input.substring(i, i+1);
					if(modifiedInput.equals(charRemoveAll) && !(removeAllBoolean)) {
						input = input.substring(0,i) + input.substring(i+1);	
					}	
				}
				System.out.println("The new sentence is: "+ input);
			}	
			if ( command.equalsIgnoreCase("Quit")) {
				System.exit(0);
			}
		}
	}
}						