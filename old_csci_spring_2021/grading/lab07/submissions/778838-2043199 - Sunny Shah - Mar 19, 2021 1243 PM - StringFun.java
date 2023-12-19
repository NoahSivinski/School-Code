/*
 * StringFun.java
 * Author:  Sunny Shah 
 * Submission Date:  03/19/2021
 *
 * Purpose: This program will create an environment where the user can enter a sentence (as a string) and then 
 * manipulate that string using 5 basic commands. These manipulations will affect the successive commands 
 * that they make. These commands are implemented using loops and basic string methods.
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
		String originalString = keyboard.nextLine(); // Original user inputed string
		String command; // How will the string be manipulated?

		do // start do-while loop
		{
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine(); // User chooses one of the commands listed 

			String newString = ""; // the manipulated string
			String newStringReplaceLast = ""; // the manipulated string for replace last command

			if (!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first") && 
					!command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all") && 
					!command.equalsIgnoreCase("remove") &&!command.equalsIgnoreCase("quit")) // If the user doesn't inputs one of the commands listed 
			{
				System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
			}

			if (command.equalsIgnoreCase("reverse")) // User chooses reverse
			{
				for (int i = originalString.length() - 1; i >= 0; i--)
				{
					newString = newString + originalString.charAt(i); // reverses the string
				}
				originalString = newString; // saves the manipulated string as the original string
				System.out.println("The new sentence is: " + originalString);
			}

			if (command.equalsIgnoreCase("replace first")) // User chooses replace first
			{
				System.out.println("Enter the character to replace");
				char replaceFirst = keyboard.next().charAt(0); // character to replace

				System.out.println("Enter the new character");
				char newCharacter = keyboard.next().charAt(0); // new character
				keyboard.nextLine();

				int z = 1; // counter used to stop replacing after first replacement

				for (int i = 0; i < originalString.length(); i++)
				{
					if (replaceFirst == originalString.charAt(i) && z < 2)
					{
						newString = newString + newCharacter; // replaces the character if it equals to the character to replace
						z++; // increases to prevent replacing other characters
					}
					else
					{
						newString = newString + originalString.charAt(i); // if character doesn't equal to the character to replace then keep the original character
					}
				}

				if (newString.equals(originalString))
				{
					System.out.println("The letter was not found in the word"); // no characters were replace because the character wasn't in the original string
				}
				else
				{
					originalString = newString; // if character was replaced, the manipulated string equals the original string
					System.out.println("The new sentence is: " + originalString); 
				}
			}

			if (command.equalsIgnoreCase("replace last")) // User chooses replace last
			{
				System.out.println("Enter the character to replace");
				char replaceLast = keyboard.next().charAt(0); // character to replace

				System.out.println("Enter the new character");
				char newCharacter = keyboard.next().charAt(0); // new character
				keyboard.nextLine();

				int z = 1; // counter used to stop after first replacement

				for (int i = originalString.length() - 1; i >= 0; i--)
				{
					
					if (z < 2 && replaceLast == originalString.charAt(i))
					{
						newString = newString + newCharacter; // reverses the original string and replaces the character if it equals to the character to replace
						z++; // increases to prevent replacing other characters
					}
					else
					{
						newString = newString + originalString.charAt(i); // if character doesn't equal to the character to replace then keep the original character
					}
				}

				for (int i = originalString.length() - 1; i >= 0; i--)
				{
					newStringReplaceLast = newStringReplaceLast + newString.charAt(i); // new string reversed
				}

				if (newStringReplaceLast.equals(originalString))
				{
					System.out.println("The letter was not found in the word"); // no characters were replace because the character wasn't in the original string
				}
				else
				{
					originalString = newStringReplaceLast;
					System.out.println("The new sentence is: " + originalString); // if character was replaced, the manipulated string equals the original string
				}
			}

			if (command.equalsIgnoreCase("remove")) // User chooses remove
			{	
				System.out.println("Enter the character to remove"); 
				char remove = keyboard.next().charAt(0); // character to remove

				System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				int removeNumber = keyboard.nextInt(); // which number character to remove?
				keyboard.nextLine();

				int z = 0; // counter used count the character number to remove

				for (int i = 0; i < originalString.length(); i++)
				{
					if (remove != originalString.charAt(i))
					{
						newString = newString + originalString.charAt(i); // if character to remove isn't being compared, keep the original string
					}
					else
					{
						z++;
						if (z != removeNumber)
						{
							newString = newString + originalString.charAt(i); // if the character number doesn't equal the character to remove, then keep the original string
						}
					}
				}

				if (newString.equals(originalString) || removeNumber <= 0 || removeNumber >= originalString.length())
				{
					System.out.println("Error: the letter you are trying to remove does not exist"); // no character was removed because the character wasn't in the original string or incorrect remove number was selected
				}
				else
				{
					originalString = newString;
					System.out.println("The new sentence is: " + originalString); // if character was removed, the manipulated string equals the original string
				}
			}

			if (command.equalsIgnoreCase("remove all")) // User chooses remove all
			{
				System.out.println("Enter the character to remove"); 
				char removeAllString = keyboard.next().charAt(0); // character to remove
				keyboard.nextLine();

				for (int i = 0; i < originalString.length(); i++)
				{
					if (originalString.charAt(i) != removeAllString)
					{
						newString = newString + originalString.charAt(i); // if character doesn't equal to the character to remove then keep the original character
					}
				}
				
				if (newString.equals(originalString))
				{
					System.out.println("Error: the letter you are trying to remove does not exist"); // no character was removed because the character wasn't in the original string
				}
				else
				{
					originalString = newString;
					System.out.println("The new sentence is: " + originalString); // if character was removed, the manipulated string equals the original string
				}
			}
		} while (!command.equalsIgnoreCase("quit")); // end do-while loop if user enters quit

		keyboard.close();

	}
}
