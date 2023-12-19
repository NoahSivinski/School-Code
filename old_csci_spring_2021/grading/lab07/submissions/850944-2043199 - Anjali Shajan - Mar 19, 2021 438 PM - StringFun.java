/*
 * [StringFun].java
 * Author:  [Anjali Shajan] 
 * Submission Date:  [3/19/2021]
 *
 * Purpose: The program allows a user to input a string to be manipulated. They get to put in whether they want the command to be reversed, replaced first, replaced last,
 * remove all, remove, and quit. The code works to fix the string to be manipulated to the way the user wants.
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
		
		String inputString;
		String outputString;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		inputString = keyboard.nextLine();
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		
		do {
			outputString = keyboard.nextLine();

			if (outputString.equalsIgnoreCase("REVERSE")) {
				String inputStringReverse = " ";
				for (int i = inputString.length(); i >0; i--) {
					inputStringReverse += inputString.charAt(i-1);
				}
				inputString = inputStringReverse;
				System.out.println("The new sentence is: "+inputString);
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)Go");	
				
				
				
		}
			else if (outputString.equalsIgnoreCase("REPLACE FIRST")) {
				char charReplacement;
				int charReplacementIndex =0;
				char charNew;
				System.out.println("Enter the new character to replace");
				charReplacement = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				charNew =keyboard.next().charAt(0);
				
				boolean foundFirst = false;
				for (int i=0; i<inputString.length(); i++) {
					    	if (foundFirst!=true) {
								if (inputString.charAt(i)== charReplacement) {
									charReplacementIndex= i;
									foundFirst =true;
								}
							}
						}
			
				
						
						
						
				    if (foundFirst== true) {
				    	inputString = inputString.substring(0,charReplacementIndex) +charNew +inputString.substring(charReplacementIndex+1);
				    	System.out.println("The new sentence is:"+inputString);
				    	System.out.println("Enter your command(reverse, replace first, replace last, remove all, remove, quit");
				    }
				    else {
				    	System.out.println("The letter was not found in the word");
				    	System.out.println("Enter your command(reverse, replace first, replace last, remove all, remove, quit)");
				    }
				}		
			
			else if (outputString.equalsIgnoreCase("REPLACE LAST")) {
				char charReplace;
				int charReplaceIndex =0;
				char charNew;
				System.out.println("Enter the character to replace");
				charReplace =keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				charNew =keyboard.next().charAt(0);
				
				
				boolean foundLast = false;
				for (int i =inputString.length()-1;i>0; i--) {
					if (foundLast !=true) {
						if (inputString.charAt(i)==charReplace) {
							charReplaceIndex = i;
							foundLast =true;
						}
					}
				}
				
			if (foundLast == true)	{
				inputString =inputString.substring(0,charReplaceIndex)+ charNew +inputString.substring(charReplaceIndex+1);
				System.out.println("The new sentence is:"+inputString);
				System.out.println("Enter your command (reverse,replace first, replace last, remove all, remove, quit)");
			}
			else {
				System.out.println("The letter was not found in the word");
				System.out.println("Enter your command(reverse, replace first, replace last, remove all, remove, quit)");
			}
		}
			
			else if (outputString.equalsIgnoreCase("REMOVE")) {
				char charRemove;
				int charRemoveIndex =0;
				int charRemoveInstance;
				System.out.println("Enter the character to remove");
				charRemove =keyboard.next().charAt(0);
				System.out.println("Enter the"+charRemove +" you would like to remove (Not index-1=1st, 2=2nd, etc.)");
				charRemoveInstance =keyboard.nextInt();
				
				int instanceCounter =0;
				for (int i=0; i< inputString.length(); i++) {
					if (inputString.charAt(i)==charRemove) {
						instanceCounter++;
						if (instanceCounter ==charRemoveInstance) {
							charRemoveIndex =i;
						}
					}
				}
				
				if (charRemoveInstance >instanceCounter) {
					System.out.println("Error: the letter you are trying to remove does not exist");
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit");
				}
				else {
					inputString =inputString.substring(0,charRemoveIndex)+inputString.substring(charRemoveIndex+1);
					System.out.println("The new sentence is: "+inputString);
					System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				}
			}
			
			else if (outputString.equalsIgnoreCase("REMOVE ALL")) {
				char charRemove;
				System.out.println("Enter the character to remove");
				charRemove =keyboard.next().charAt(0);
				
				String inputStringRemoveAll = ""; //
				for (int i=0; i<inputString.length(); i++){
					if (inputString.charAt(i)!= charRemove) {
						inputStringRemoveAll += inputString.charAt(i);
					}
				}
		        inputString =inputStringRemoveAll;
		        System.out.println("The new sentence is:"+inputString);
		        System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit");		
			}
			
			else if (outputString.equalsIgnoreCase("QUIT")){
				System.out.println("....Execution Ends...");
				System.exit(0);
	    	}	    	
		} while (!outputString.equalsIgnoreCase("QUIT"));
		keyboard.close();
	}
	}
		

