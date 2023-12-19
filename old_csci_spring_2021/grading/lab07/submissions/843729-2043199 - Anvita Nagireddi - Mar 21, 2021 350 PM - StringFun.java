/**
 * StringFun.java
 * Author:  Anvita Nagireddi 
 * Submission Date:  Mar-21-2021
 * File name: StringFun.java
 *
 * This program does the following: When the program begins, it asks the user to input a String. This input can range from a single letter to a
 * complete sentence.
 * The program will then list the 6 possible commands that the user can choose from. The user
 * can use these commands to modify the original sentence. The program will continue to ask for commands
 * until the user enters the “quit” command. 
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
		System.out.println("Enter the string to be manipulated");
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		String result = "";
		
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String choice = scan.nextLine();
			//reverse string
			if(choice.equalsIgnoreCase("reverse")) {
				int length = str.length() - 1;
				do {
					result = result + str.charAt(length);
					length--;
				}
				while(length>=0);
				result = result.substring(result.length()-str.length(),result.length());
				System.out.println("The new sentence is: " + result);
				//reassigning the 'result' to 'string' variable
				str = result;
			}
			
			//replace first instance of assigned character
			else if(choice.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				String toBeReplaced = scan.nextLine();
				System.out.println("Enter the new character");
				String toReplace = scan.nextLine();
				if(str.indexOf(toBeReplaced) < 0) {
					System.out.println("The letter was not found in the word");
				}	
				else {
					int indexOfToBeReplaced = str.indexOf(toBeReplaced);	
					String firstPart = str.substring(0,indexOfToBeReplaced);
					String lastPart = str.substring(indexOfToBeReplaced + 1,str.length());
					result = firstPart.concat (toReplace).concat(lastPart);
					System.out.println("The new sentence is: " + result);
					str = result;
				}					
			}
			
			//replace last instance of assigned character
			else if(choice.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				String toBeReplaced = scan.nextLine();
				System.out.println("Enter the new character");
				String toReplace = scan.nextLine();
				if(str.indexOf(toBeReplaced) < 0) {
					System.out.println("The letter was not found in the word");
				}
				else {
					int indexOfToBeReplaced = str.lastIndexOf(toBeReplaced);
					String firstPart = str.substring(0,indexOfToBeReplaced);
					String lastPart = str.substring(indexOfToBeReplaced + 1,str.length());
					result = firstPart.concat (toReplace).concat(lastPart);
					System.out.println("The new sentence is: " + result);
					str = result;	
				}
			}
			
			//remove one indicated instance of a character
			else if(choice.equalsIgnoreCase("remove")) {				
				System.out.println("Enter the character to remove");
				char toRemove = scan.next().charAt(0);
				System.out.println("Enter the " + toRemove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int instance = scan.nextInt();
				String unnecessary = scan.nextLine();
				int counter = 0;
				String tempStr = "";
				for (int i = 0; i < str.length(); i++) {
					if(str.charAt(i) == toRemove) {
						counter++;
						if(counter != instance) {
							tempStr = tempStr + str.charAt(i);
						}
					}
					else {
						tempStr = tempStr + str.charAt(i);
					}
				}
				if(tempStr.equals(str)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					result = tempStr;
					System.out.println("The new sentence is: " + result);
					str = result;	
				}
			}
			
			//remove all instances of a character
			else if(choice.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				String toRemove = scan.nextLine();
				result = str.replaceAll(toRemove,"");
				if (result.equals(str)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					System.out.println("The new sentence is: " + result);
					str = result;
				}
			}
			//quits the program
			else if(choice.equalsIgnoreCase("quit")) {
				System.out.println("...Execution Ends...");
				System.exit(0);
			}
	
		}
		
		while (!str.equals(""));
		
	}

}
