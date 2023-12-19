/*
 * [StringFun].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [3/19/2021]
 *
 * Purpose: pain.
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
		//note:
		//The ONLY String methods that you can use for this lab are:
		//length, concat, +, charAt, substring, and equals (or equalsIgnoreCase).
		//need to do: remove all
		//done: reverse, quit, replace first, replace last, remove
		
		
		Scanner keyboard = new Scanner (System.in);
		boolean quit = false;
		String removeAllString="";
		String reverseString = "";
		String replaceFirstString = "";
		String replaceLastString ="";
		String removeString = "";
		char charChecker;



		//gets the original string to be modified
		System.out.println("Enter the string to be manipulated");
			String baseString = keyboard.nextLine();
		
			
			while (quit == false) {
		//prompts user for a command to modify the string
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = keyboard.nextLine();
				int baseStringLength = baseString.length();
		
		//handles the string reversal command
		if (command.equalsIgnoreCase("reverse")) {
			int i;
			reverseString = ""; // without this the reversal string will pile on characters and become longer after each command of reverse
			//prints the whole thing backward by setting the initialization to the max length and have it stop at index 0
				for(i=baseStringLength -1; i>=0;i--) {
					reverseString = reverseString + baseString.charAt(i);
			}
				System.out.println("The new sentence is: " + reverseString);
				baseString = reverseString;
		}
		

		//handles replace first command
		else if (command.equalsIgnoreCase("replace first")) {
			System.out.println("Enter the character to replace");
				char replacementChar = keyboard.nextLine().charAt(0);

			System.out.println("Enter the new character");
				char replacerChar = keyboard.nextLine().charAt(0);
				
				
			
				//checks first if the character is in the spot being looked at in the loop, if so then it will check if the character matches the character to be replace, then it makes a substring sandwich 
			int i;
				boolean charIsThere = false;
					for(i = 0; i < baseStringLength;i++) {
						charChecker = baseString.charAt(i);
						if (charIsThere == false) {
							if (charChecker==replacementChar) {
						
								String replaceFirstLeftSubstring = baseString.substring(0,i);
								String replaceFirstRightSubstring = baseString.substring(i+1,baseString.length());
								String newString = replaceFirstLeftSubstring + replacerChar + replaceFirstRightSubstring;
								System.out.println("The new sentence is: " + newString);
								replaceFirstString = newString;
								charIsThere = true;
					}
							
				}		
			}
					baseString = replaceFirstString;
			
			

		
		}
		
		//handles replace last command
		else if (command.equalsIgnoreCase("replace last")) {
			System.out.println("Enter the character to replace");
				char replacementChar = keyboard.nextLine().charAt(0);
			
			System.out.println("Enter the new character");
				char replacerChar = keyboard.nextLine().charAt(0);
			
				//same mechanism as the other replace but works backwards
			int i;
				boolean charIsThere = false;
					for(i = baseStringLength-1 ; i >= 0;i--) {
						 charChecker = baseString.charAt(i);
						if (charIsThere == false) {
							if (charChecker==replacementChar) {
								charIsThere = true;
								String replaceFirstLeftSubstring = baseString.substring(0,i);
								String replaceFirstRightSubstring = baseString.substring(i+1,baseString.length());
								String newString = replaceFirstLeftSubstring + replacerChar + replaceFirstRightSubstring;
								System.out.println("The new sentence is: " + newString);
								replaceLastString = newString;

					}
				}
					
			}
					baseString = replaceLastString;		

			
			
			
		}
		
		//handles remove command
		else if(command.equalsIgnoreCase("remove")) {
			System.out.println("Enter the character to remove");
				char removedChar = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + removedChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)" );
					int numberedCharToRemove = keyboard.nextInt();
					keyboard.nextLine();
					int numberedCharToRemoveCounter = 0;
					int i =0;
					//checks if the character is there and creates 2 substrings behind and ahead without the character and concats them
					for(i=0; i <baseStringLength; i++) {
						 charChecker = baseString.charAt(i);
						
						
						
							if(charChecker==removedChar) {
								numberedCharToRemoveCounter++;
								
							
							if (numberedCharToRemoveCounter==numberedCharToRemove) {
								String removeLeftSubstring = baseString.substring(0,i);
								String removeRightSubstring = baseString.substring(i+1,baseString.length());
								String newString = removeLeftSubstring+ removeRightSubstring;
								System.out.println("The new sentence is: " + newString);
								removeString = newString;
								
								
						}
							
							
					}
					
						
				} 
					baseString = removeString;
			
		}
		
		//handles remove all command
		else if(command.equalsIgnoreCase("remove all")) {
			System.out.println("Enter the character to remove");
			char charToRemove = keyboard.nextLine().charAt(0);
			//checks if the character is there and prints every letter that isnt that letter that gets removed
			int i=0;
			System.out.print("The new sentence is: ");

			for(i=0; i <baseStringLength; i++) {
				 charChecker = baseString.charAt(i);
				
				if(!(charChecker==charToRemove)) {
					removeAllString =removeAllString +baseString.charAt(i); 
					
				}
			}
			System.out.println(removeAllString);
			
			baseString = removeAllString;

		}

		//handles the remove command
		else if(command.equalsIgnoreCase("quit")) {
			//quits program
			System.exit(0);
			
		}
		
			}
		
	}
	
}
