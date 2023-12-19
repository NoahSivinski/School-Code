/*
 * StringFun.java
 * Author:  Derek Li
 * Submission Date:  10/16/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program asks for a user inputted string then
 * gives users ways to manipulate it. The program can
 * reverse the string, replace the first or last instance of
 * a character in the string, remove all instances of a character
 * in the string, or remove a specific instance of the character
 * in the string.
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
		String str, input, newString;
		char replace, newChar;
		int index, charCount;
		boolean isReplaced = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the string to be manipulated");
		str = keyboard.nextLine();
		
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit");
			input = keyboard.nextLine();
			newString = "";
			isReplaced = false;
			charCount = 1;
			
			if (input.equalsIgnoreCase("reverse"))
			{
				//the last character in str becomes the first in str
				for(int i = str.length() - 1; i >= 0; i--)
					newString += str.charAt(i);
				str = newString;	
				System.out.println("The new sentence is: " + str);
			}
			
			
			else if (input.equalsIgnoreCase("replace first"))
			{
				System.out.println("Enter the character to replace");
				replace = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				newChar = keyboard.next().charAt(0);
				for(int i = 0; i < str.length(); i++)
				{
					if (str.charAt(i) == replace && !isReplaced)
					{
						newString = str.substring(0, i) + newChar;
						//if i is the last char in the string, substring(i + 1) causes a runtime error
						if(i != str.length() - 1)
							newString += str.substring(i + 1);
						isReplaced = true;
					}
				}
				str = newString;
				if (!isReplaced)
					System.out.println("The letter was not found in the word");
				else
					System.out.println("The new sentence is: " + str);
				keyboard.nextLine();
			}
			
			
			
			else if (input.equalsIgnoreCase("replace last"))
			{
				System.out.println("Enter the character to replace");
				replace = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				newChar = keyboard.next().charAt(0);
				for(int i = str.length() - 1; i >= 0; i--)
				{
					if (str.charAt(i) == replace && !isReplaced)
					{
						newString = str.substring(0, i) + newChar;
						if (i != str.length() - 1)
							newString += str.substring(i + 1);
						isReplaced = true;
					}
				}
				str = newString;
				if (!isReplaced)
					System.out.println("The letter was not found in the word");
				else
					System.out.println("The new sentence is: " + str);
				keyboard.nextLine();
			}
			
		
			
			else if(input.equalsIgnoreCase("remove"))
			{
				System.out.println("Enter the character to remove");
				replace = keyboard.next().charAt(0);
				System.out.println("Enter the " + replace + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				index = keyboard.nextInt();
				for(int i = 0; i < str.length(); i++)
				{
					if(charCount == index && str.charAt(i) == replace)
					{
						newString = str.substring(0, i);
						if(i != str.length() - 1);
							newString += str.substring(i + 1);
						isReplaced = true;
						charCount++;
					}
					else if(str.toLowerCase().charAt(i) == replace)
						charCount++;
				}
				str = newString;
				
				if (!isReplaced)
					System.out.println("Error: the letter you are trying to remove does not exist");
				else
					System.out.println("The new sentence is: " + str);
				keyboard.nextLine();
			}
			
			
			
			else if(input.equalsIgnoreCase("remove all"))
			{
				System.out.println("Enter the character to remove");
				replace = keyboard.next().charAt(0);
				for(int i = 0; i < str.length(); i++)
				{
					//any char that isn't the one that should be removed gets added to a new string
					if(str.toLowerCase().charAt(i) != replace)
						newString += str.charAt(i);
				}
				str = newString;
				System.out.println("The new sentence is: " + str);
				keyboard.nextLine();
			}
			
			
			//after this if loop the only other option is that the user inputed quit
			else if(!input.equalsIgnoreCase("quit"))
				System.out.println("Command invalid. Try again");
		}while (!input.equals("quit"));
		

	}

}
