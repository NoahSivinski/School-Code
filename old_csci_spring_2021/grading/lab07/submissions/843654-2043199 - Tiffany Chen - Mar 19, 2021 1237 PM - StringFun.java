/*
 * [StringFun].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [March 19, 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program allows the user to reverse, replace first, replace last. remove all, and remove characters in the string.
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
Scanner s = new Scanner(System.in);
		
		//prompt user for string input
		System.out.println("Enter the string to be manipulated");
		String original = s.nextLine();
		String command = "";
		
		boolean status = false;
		while (!status)
		{
		//Prompt to enter command
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		command = s.nextLine();
		
			String reverse = " ";
			
			//  If command is  reverse
			if (command.equalsIgnoreCase("reverse"))
			{
				int length = original.length();
				for (int a = length - 1; a >= 0; a--)
				{
					reverse += original.charAt(a);
				}
			System.out.println("Your new string is:" + reverse);
			original = reverse;
			}
			
			
			//If command replace first
			else if (command.equalsIgnoreCase("replace first"))
			{
				//prompt user to enter the character to replace and the new character 
				System.out.println("Enter the character to replace");
				char oldChar = s.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newChar = s.nextLine().charAt(0);
			
				String replaceFirst = " ";
				int length = original.length();
				boolean found = false;
				for (int b= 0; b < length; b++)
				{
					if ((original.charAt(b)) == (oldChar) && !found && (Character.isLetter(oldChar)))
					{
						replaceFirst += newChar;
						found = true;
					}
					else
					{
						replaceFirst += original.charAt(b);
					}
				}
				// If the letter isn't found and the next sentence 
				if (!found)
				{
					System.out.println("The letter was not found in the word");
				}
				else
				{
					System.out.println("The new sentence is: " + replaceFirst);
					original = replaceFirst;
				}
			}
			
		
			//Command to replace last
			else if (command.equalsIgnoreCase("replace last"))
			{
				// prompt user to enter the character to replace and the new character 
				System.out.println("Enter the character to replace");
				char oldChar = s.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newChar = s.nextLine().charAt(0);
				String replaceLast = " ";
				
				int length = original.length();
				boolean found = false;
				String firstHalf = " ", secondHalf = " ";
				
				for (int c = length - 1; c >= 0; c--)
				{
					if ((original.charAt(c)) == oldChar && !found && (Character.isLetter(oldChar)))
					{
						firstHalf = original.substring(0, c);
						secondHalf = original.substring(c + 1, length);
						found = true;
					}
					replaceLast = firstHalf + newChar + secondHalf;
				
				}
				// If  the letter isn't in the word and print new sentence
				if (!found)
				{
					System.out.println("cThe letter was not found in the word");
				}
				else
				{
					System.out.println("The new sentence is: " + replaceLast);
					original = replaceLast;
				}
			}
			
					
			//If command to remove
			else if (command.equalsIgnoreCase("remove"))
			{
				// prompt user to enter the character to replace and the new character 
				System.out.println("Enter the character to remove");
				char oldChar = s.nextLine().charAt(0);
				System.out.println("Enter the " + oldChar + " you would like to remove");
				int nthChar = s.nextInt();
				s.nextLine();
				int letterCount = 0;
			
				String remove = "";
				int length = original.length();
				boolean found = false;
				String firstHalf = "", secondHalf = "";
				
				for (int d = 0; d < length; d++)
				{
					// the number the letter is to be replaced in the sentence
					if (original.charAt(d) == oldChar && !found)
					{
						letterCount++;
						if (nthChar == letterCount)
						{
							firstHalf = original.substring(0, d);
							secondHalf = original.substring(d + 1, length);
							found = true;
						}
					}
					else
					{
						remove += original.charAt(d);
					}
					remove = firstHalf + secondHalf;
				}
			
				if (!found || nthChar != letterCount)
				{
					// print the letter doesn't exist and the  new  sentence
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else
				{
				System.out.println("The new sentence is:" + remove);
				original = remove;
				}
			}
			
			
			//Command remove all 
			else if (command.equalsIgnoreCase("remove all"))
			{
				//Prompt to enter character to remove
				System.out.println("Enter the character to remove");
				int length = original.length();
				String removeAll = "";
				String rem = "";
				
				boolean found = false;
				for (int e = 0; e < length; e++)
				{
					if ((original.charAt(e)) == (removeAll.charAt(0)))
					{
						removeAll += rem;
						found = true;
					}
					else
					{
						removeAll += original.charAt(e);
					}
				}
				if (!found)
				{
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else
				{
				System.out.println("The new sentence is:" + removeAll);
				original = removeAll;
				}
			}
		
			
			//end program
			else if (command.equalsIgnoreCase("quit"))
			{
				status = true;
				System.exit(0);
				s.close();
				
			}
		}
	}
}

