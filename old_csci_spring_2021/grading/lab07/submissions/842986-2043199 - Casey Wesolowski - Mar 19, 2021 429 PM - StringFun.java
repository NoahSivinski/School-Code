

/*
 * CSCI1301 27827
 * StringFun.java
 * Author:  Casey Wesolowski 
 * Submission Date:  March 19th, 2021
 *
 * Purpose:  The purpose of this program is to prompt the user
 * to input a string of character and then give the user six 
 * commands the user can chose from. The six commands include
 * reverse, replace first, replace last, remove, remove all, 
 * and quit.
 * 
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
		//Variables
		String sentence;
		String command;
		String reverse = "";
		int endd = 0;
		String before = "";
		String after = "";

		//Scanner
		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		sentence = keyboard.nextLine();
		//To get the length of the user inputed string
		int sentenceLength = sentence.length();
		
		if (sentenceLength < 0)	{
			System.out.println("Invalid String.");
		}
		
		
		//While statement to run the loop
		boolean play = true;
		boolean quit = false;
		while (play == true)	{
			System.out.println("Enter your command (reverse, replace first, replace last,"
					+ " remove all, remove, quit)");
			command = keyboard.nextLine();
		
		
			//Error if-else statement
			if ((command.equalsIgnoreCase("reverse")) || (command.equalsIgnoreCase("replace first")) ||
					(command.equalsIgnoreCase("replace last")) || (command.equalsIgnoreCase("remove all")) || 
					(command.equalsIgnoreCase("remove")) || (command.equalsIgnoreCase("quit")))	{
				
				
				
				//If-else statement for the 6 commands
				//Reverse
				if (command.equalsIgnoreCase("reverse"))	{
						for (int reverseReps = sentenceLength - 1; reverseReps >= 0; reverseReps--)	{
							reverse = reverse + sentence.charAt(reverseReps);
						}
						sentence = reverse;
						System.out.println("The new sentence is: " + sentence);
						reverse = "";
				}
				
				//Replace First
				else if (command.equalsIgnoreCase("replace first"))	{
					int endTwo = 0;
					while (endTwo < 1) {
						System.out.println("Enter the character to replace");
						char replaceFirst = keyboard.nextLine().charAt(0);
						
						String replaceF = "";
						
						for (int go = 0; go < sentenceLength; go++)	{
							if (sentence.charAt(go) == replaceFirst)	{
								replaceF += sentence.charAt(go);
								
								before = sentence.substring(0, go);
								after = sentence.substring(go + 1, sentenceLength);
								
								go = sentenceLength;
							}
							else	{
								System.out.println("The letter was not found in the word");
								go = sentenceLength;
								endd = 1;
							}
						}
						if (endd != 1)	{
							System.out.println("Enter the new character");
							replaceF = keyboard.nextLine();
							sentence = before.concat(replaceF).concat(after);
							System.out.println("The new sentence is: " + sentence);
						
							endTwo = 1;
						}
						endTwo++;
					}
				}
				//Replace Last
				else if (command.equalsIgnoreCase("replace last"))	{
					int endThree = 0;
					while (endThree < 1)	{
						System.out.println("Enter the character to replace");
						char replaceLast = keyboard.nextLine().charAt(0);
						
						String replaceL = "";
						
						for (int go = sentenceLength - 1; go > sentenceLength - 2; go--)	{
							if (sentence.charAt(go) != replaceLast)	{
								replaceL = Character.toString(sentence.charAt(go));
								
								before = sentence.substring(0, go - 1);
								after = sentence.substring(go, sentenceLength);
								
								go = sentenceLength - 2;
							}
							else	{
								System.out.println("The letter was not found in the word");
								go = sentenceLength;
								endd = 1;
							}
						}
						if (endd != 1)	{
							System.out.println("Enter the new character");
							replaceL = keyboard.nextLine();
							sentence = before.concat(replaceL).concat(after);
							System.out.println("The new sentence is: " + sentence);
						
							endThree = 1;
						}
						endThree++;
					}
				}
				
				//Remove all
				else if (command.equalsIgnoreCase("remove all"))	{
					int endFour = 0;
					while (endFour < 1)	{
						System.out.println("Enter the character to remove");
						char removeAll = keyboard.nextLine().charAt(0);
					
						String rebuild = "";
						
						for (int go = 0; go < sentenceLength; go++)	{
							if (sentence.charAt(go) != removeAll)	{
								rebuild += sentence.charAt(go);
							}
						}
						sentence = rebuild;
						System.out.println("The new sentence is: " + sentence);
						
						endFour++;
					}
				}
				//Remove
				else if (command.equalsIgnoreCase("remove"))	{
					int endFive = 0;
					while (endFive < 1)	{
						System.out.println("Enter the character to remove");
						String remove = keyboard.nextLine();
	
						System.out.println("Enter the " + remove + " you would like to remove "
							+ "(Not the index - 1 = 1st, 2 = 2nd, ect.):");
						int removeCharacter = keyboard.nextInt();
						String extraSpace = keyboard.nextLine(); //To get rid of the extra space
						extraSpace.equalsIgnoreCase("");
			
						for (int removeOne = 1; removeOne < sentenceLength; removeOne++)	{
							if (sentence.charAt(removeOne) == sentence.charAt(0))	{
								System.out.println("Error: the letter you are trying to remove does not exist");
								removeOne = sentenceLength;
							}
						}
						String sentenceHalfOne = sentence.substring(0, removeCharacter);
						String sentenceHalfTwo = sentence.substring(removeCharacter + 1, sentenceLength);
						
						sentence = sentenceHalfOne.concat(sentenceHalfTwo);
						
						System.out.println("The new sentence is: " + sentence);
						
						endFive++;
					}
				}
				//Quit
				else if (command.equalsIgnoreCase("quit"))	{
					play = quit;
				}
				
				//error if-else statement bracket
			}
			else	{
				System.out.println("Error: this is not a valid command");
				play = quit;
			}
		
		}	//while loop bracket
		keyboard.close();
	}

}
