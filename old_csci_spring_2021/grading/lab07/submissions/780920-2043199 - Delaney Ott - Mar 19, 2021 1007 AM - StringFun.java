/*
 * StringFun.java
 * Author:  Delaney Ott 
 * Submission Date:  March 19th, 2021
 *
 * Purpose: This program is designed to manipulate strings based on the command that the user
 * inputs. First the user will input a string and then be presented with multiple string command
 * options where they can continuously change the string, until they choose to quit.
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
		
		String originalInput, command; 
		char replacedCharacter, newCharacter, removedCharacter;
		int length, instanceNumber, removeCounter;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		originalInput = keyboard.nextLine();
		
		do {
			System.out.println("Enter your command(reverse, replace first, replace last,  remove all, remove, quit)");
			command = keyboard.nextLine();
			
			//length of original string that was input
			length = originalInput.length();
			
			//Reverse
			if (command.equalsIgnoreCase("reverse")) {
				String reverseString = "";
				for(int i=length; i>0; i--) {
					reverseString += originalInput.charAt(i-1);
				}
				originalInput = reverseString;
				System.out.println("The new sentence is: " + reverseString);
				
			//Replace First	
			} else if (command.equalsIgnoreCase("replace first")) {
				String replaceFirstString = "";
				System.out.println("Enter the character to replace");
				replacedCharacter = keyboard.next().charAt(0); 
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				boolean replaced = true;
				for(int i = 0; i < length; i++) {
					if ((originalInput.charAt(i) == replacedCharacter)&&(replaced == true)) {
						replaceFirstString += newCharacter;
						replaced = false;
					} else {
						replaceFirstString += originalInput.charAt(i);
					}	
				}
				//Error
				if(replaceFirstString.equals(originalInput)) {
					System.out.println("The letter was not found in the word");
				} else {
					originalInput = replaceFirstString;
					System.out.println("The new sentence is: "+ replaceFirstString);
				}
				
			//Replace Last	
			} else if (command.equalsIgnoreCase("replace last")) {
				String replaceLastString = "", replaceLastStringFinal = "";
				System.out.println("Enter the character to replace");
				replacedCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				for(int i=length; i>0; i--) {
					if (originalInput.charAt(i-1) == replacedCharacter) {
						replaceLastString += newCharacter;
						newCharacter = replacedCharacter;
					} else {
						replaceLastString += originalInput.charAt(i-1);
				}
			}
				for(int i=length; i>0; i--) {
					replaceLastStringFinal += replaceLastString.charAt(i-1);
				}
				//Error
				if(replaceLastStringFinal.equals(originalInput)) {
					System.out.println("The letter was not found in the word");
				} else {
					System.out.println("The new sentence is: "+ replaceLastStringFinal);
				}
				
			//Remove All	
			} else if (command.equalsIgnoreCase("remove all")) {
				String removedAllString = "";
				System.out.println("Enter the character to remove");
				removedCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				for(int i=0; i<length; i++) {
					if(originalInput.charAt(i) == removedCharacter) {
						removedAllString += "";
					} else {
						removedAllString += originalInput.charAt(i);
					}
				}
				//Error	
				if(removedAllString.equals(originalInput)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					originalInput = removedAllString;
					System.out.println("The new sentence is: "+ removedAllString);
				}
			//Remove	
			} else if (command.equalsIgnoreCase("remove")) {
				String removeString = "";
				removeCounter = 1;
				System.out.println("Enter the character to remove");
				removedCharacter = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the " + removedCharacter + " you would like to remove(Not the index - 1 = 1st, 2 = 2nd, etc.):");
				instanceNumber = keyboard.nextInt();
				keyboard.nextLine();
				for(int i=0; i<length; i++) {
					if((originalInput.charAt(i) == removedCharacter)&&(removeCounter == instanceNumber)) {
						 removeCounter ++;
						 removeString += ""; 
					} else if((originalInput.charAt(i) == removedCharacter)&&(removeCounter != instanceNumber)) {
						removeCounter++;
						removeString += originalInput.charAt(i);
					} else {
						removeString += originalInput.charAt(i);
					}
				}
				//Error
				if(removeString.equals(originalInput)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					originalInput = removeString;
					System.out.println("The new sentence is: "+ removeString);
				}
			}
	} while (!command.equalsIgnoreCase("quit"));
	System.out.println("...Execution Ends...");	
		
	keyboard.close();
	System.exit(0);
	}
}


