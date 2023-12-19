/**
 * File name: StringFun.java
 * Author: Jacob Tate
 * Submission Date: Friday, October 15th, 2021.
 *
 *This program allows the user to manipulate a string using various commands. 
 *The six commands, defined in the problem stimulus, are reverse, replace first, replace last, remove, remove all, and quit.
 *Each time a command is run, it will return the modified string and will repeatedly ask for a command. The only way for the program to not return an empty string is 
 *Only when the word quit, ignoring case, is entered, will the program terminate.
 *
 *Statement of Academic Honesty:
 *
 *The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be playerMoveled in accordance with
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
		Scanner keyboard = new Scanner(System.in);
		String userString = keyboard.nextLine();
		boolean isRunning = true; // boolean that controls the while loop
		while(isRunning == true) //loop that keeps the program running unless the quit command is entered.
		{
			//Below code prints the command prompt and allows the user to implement their desired command. 
			System.out.print("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			System.out.print("\n");
			String command = keyboard.nextLine();
			//Below code shows what would happen if the command is reverse
			if(command.equalsIgnoreCase("reverse"))
			{
				String newString = "";
				//Below code loops through the string to get its letter, then places it at the beginning of an empty string, causing the initial string to be reversed.
				for(int i = 0; i < userString.length(); i++)
				{
					String letter = userString.substring(i, i +1);
					newString = letter + newString;
				}
				userString = newString;
				System.out.println("The new sentence is " + userString); //Prints out the result.
			}
			//Below code shows what would happen if the command is replace first
			else if(command.equalsIgnoreCase("replace first"))
			{
				//Below code asks the user for the character to replace and the character they would like to be used in place of the initial character
				System.out.println("Enter the character to replace");
				char replaceChar = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);
				int replaceCount = 0;
				//Below code loops through the string at the beginning to find the first case of the character to be replaced. 
				for(int i = 0; i < userString.length(); i++)
				{
					if(userString.charAt(i) == replaceChar && replaceCount < 1)
					{
						userString = userString.substring(0, i) + newChar + userString.substring(i+1);
						replaceCount++;
						System.out.println("The new sentence is " + userString); //Prints out the result
					}
				}
				if(replaceCount == 0)
				{
						System.out.println("The letter was not found in the word"); 
						//If the letter desired in the string is not present based on the local variable replaceCount, this statement will print.

				}
			}
			//Below code shows what would happen if the command is replace last
			else if(command.equalsIgnoreCase("replace last"))
			{
				//Below code asks the user for the character to replace and the character they would like to be used in place of the initial character
				System.out.println("Enter the character to replace");
				char replaceChar = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char newChar = keyboard.nextLine().charAt(0);
				int replaceCount = 0;
				//Below code loops through the string at the end to find the last case of the character to be replaced. 
				for(int i = userString.length()-1; i > 0; i--)
				{
					if(userString.charAt(i) == replaceChar && replaceCount < 1)
					{
						userString = userString.substring(0, i) + newChar + userString.substring(i+1);
						replaceCount++;
						System.out.println("The new sentence is " + userString);
					}
				}
				if(replaceCount == 0)
				{
						System.out.println("The letter was not found in the word");
						//If the letter desired in the string is not present based on the local variable replaceCount, this statement will print.
				}
				
			}
			//Below code would show what would happen if the command was remove.
			else if(command.equalsIgnoreCase("remove"))
			{
				//Below code asks for the character that should be removed and also asks what specific index of the character you would like to remove.
				System.out.println("Enter the character to remove");
				char removeChar = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1, 2 = 2nd, etc.):");
				int instance = keyboard.nextInt();
				keyboard.nextLine();
				int removeCharCount = 0;
				int initialStringLength = userString.length();
				//Below code loops through the string at the beginning, checking to see if the character at the index is equivalent to the desired character to be removed. If so, a counter variable will increment until the variable reaches the instance the user stated earlier.
				for(int i = 0; i < userString.length(); i++)
				{
					if(userString.charAt(i) == removeChar)
					{
						removeCharCount++;
						if(removeCharCount == instance)
						{
							userString = userString.substring(0, i) + userString.substring(i + 1);
						}
					}
				}
				if(removeCharCount == 0 || (removeCharCount != instance && initialStringLength == userString.length())) //If the removeCharCount variable is zero, then no change was done to the string, resulting in this condition. But, if the string is altered, it will depend on the instance the user wants to remove the character.
				{
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else
				{
					System.out.println("The new sentence is " + userString);//Prints the result.
				}
				
			}
			//Below code shows what will happen if command is remove all
			else if(command.equalsIgnoreCase("remove all"))
			{
				//Below code asks the user for the character to remove.
				String newString = "";
				System.out.println("Enter the character to remove");
				char removeChar = keyboard.nextLine().charAt(0);
				int removeCount = 0;
				//Below code loops through the string at the beginning and any character that is not the desired character to remove, its added to a new string that is equivalent to the original string.
				for(int i = 0; i < userString.length(); i++)
				{
					String letter = userString.substring(i, i +1);
					if(userString.charAt(i) != removeChar)
					{
						newString = newString + letter;
					}
					else
					{
						removeCount++;
					}
					
				}
				if(removeCount == 0)
				{
					System.out.println("Error: the letter you are trying to remove does not exist");//If the remove count is zero, that means that there was no change to the string, therefore, the desired letter is not in the string, resulting in this condition.
				}
				else
				{
					userString = newString;
					System.out.println("The new sentence is " + userString);//Prints the result.
				}
				
			}
			//Below code shows what would happen if the command was quit.
			else if(command.equalsIgnoreCase("quit"))
			{
				isRunning = false; //alters the boolean that runs the while loop
			}
			// If the command string is not any one of the six commands, this part of the if else statement will execute.
			else
			{
				System.out.println("Command invalid. Try again");
					
			}
		}
		System.exit(0); //Terminates the program
	}
}