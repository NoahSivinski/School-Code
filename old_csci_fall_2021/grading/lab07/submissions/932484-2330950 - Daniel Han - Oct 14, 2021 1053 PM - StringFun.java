/*
 * [StringFun].java
 * Author:  [Daniel Han] 
 * Submission Date:  [10/14/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program will receive a string and will have a variety of commands. 
 * The program can reverse the string, replace the first and last occurences of a character, remove all occurences of a character, and remove one specific ocurrence of a character
 * The program will continue until the user inputs the quit command which will exit the program following proper I/O.
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



//imports scanner class
import java.util.*;

public class StringFun {
	public static void main(String[] args) {
		//creates a scanner named keyboard
		Scanner keyboard = new Scanner(System.in);
		//asks the user for the string input
		System.out.println("Enter the string to be manipulated");
		//sets the user's input to a string variable input
		String input = keyboard.nextLine();
		//creates a string that will be changed
		String changedInput = "";
		//creates a string to hold the user's command
		String command = "";
		//creates a char variable for the replace/remove methods
		char replace = '!';
		//creates a string char for the character that will get removed or replaced
		char willBeReplaced = '!';
		//creates a boolean variable  to determine if a character has been removed or replaced
		boolean isReplaced = false;
		//creates a boolean error variable to see if there is an error
		boolean isError = false;
		//counter variable for while loops
		int j = 0;
		//integer variables for the remove command
		int index = 0;
		int counter = 0;
		

		//creates a do-while loop for the user's commands
		do {
			//asks the user for which command they want to use
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine().trim();
			//if the command equals "reverse", then the program will reverse the string
			if (command.equalsIgnoreCase("reverse")) {
				//resets changedInput to ""
				changedInput = "";

				//creates a for loop that iterates for the length of the input string and will reverse all of its indexes and set them to changedInput
				for (int i = input.length() - 1; i>= 0; i --) {

					//concatenates changedInput with substring string from input
					changedInput += input.charAt(i);

				}
				//sets input to changedInput
				input = changedInput;
				//prints out the string
				System.out.println("The new sentence is: " + input);
				//resets changedInput
				changedInput = "";
			}

			else if (command.equalsIgnoreCase("replace first")) {
				//automatically sets isReplaced to false
				isReplaced = false;
				isError = false;
				//automatically sets replaced and willBeReplaced to default
				replace = '!';
				willBeReplaced = '!';
				System.out.println("Enter the character to replace");
				willBeReplaced = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replace = keyboard.nextLine().charAt(0);
				for (int i = 0; i < input.length(); i++) {
					if (willBeReplaced == input.charAt(i) && !isReplaced && i != input.length()-1) {
						//sets changedInput to a substring for i, the new character, and the substring after i
						changedInput = input.substring(0, i) + replace + input.substring(i+1);
						//changes isReplaced to true
						isReplaced = true;
					}
					else if (willBeReplaced == input.charAt(i) && !isReplaced && i == input.length() - 1) {
						//sets changedInput to a substring from i to the new character plus the new character
						changedInput = input.substring(0, i) + replace;
						//sets isReplaced to true
						isReplaced = true;
					}
					//if the character hasn't been replaced, if i is on the last index of the for loop, and the final char of the string isn't equal to willBeReplaced, it will output an error statement and set isError to true
					if (i == input.length()-1 && input.charAt(i) != willBeReplaced && !isReplaced) {
						//outputs error statement
						System.out.println("The letter was not found in the word");
						//sets isError to true
						isError = true;
					}

				}
				if (!isError) {
					//sets input to changedInput
					input = changedInput;
					//prints out the new string
					System.out.println("The new sentence is: " + input);
					//resets changedInput
					changedInput = "";

				}
				//resets isError to false
				isError = false;
			}

			//code for the replace last program
			else if (command.equalsIgnoreCase("replace last")) {
				//automatically sets isReplaced to false
				isReplaced = false;
				isError = false;
				//automatically sets replaced and willBeReplaced to default
				replace = '!';
				willBeReplaced = '!';
				System.out.println("Enter the character to replace");
				willBeReplaced = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				replace = keyboard.nextLine().charAt(0);
				for (int i = input.length()-1; i >= 0; i--) {
					if (willBeReplaced == input.charAt(i) && !isReplaced && i != input.length()-1) {
						//sets changedInput to a substring for i, the new character, and the substring after i
						changedInput = input.substring(0, i) + replace + input.substring(i+1);
						//changes isReplaced to true
						isReplaced = true;
					}
					else if (willBeReplaced == input.charAt(i) && !isReplaced && i == input.length() - 1) {
						//sets changedInput to a substring from i to the new character plus the new character
						changedInput = input.substring(0, i) + replace;
						//sets isReplaced to true
						isReplaced = true;
					}
					//if the character hasn't been replaced, if i is on the first index of the for loop, and the final char of the string isn't equal to willBeReplaced, it will output an error statement and set isError to true
					if (i == 0 && input.charAt(i) != willBeReplaced && !isReplaced) {
						//outputs error statement
						System.out.println("The letter was not found in the word");
						//sets isError to true
						isError = true;
					}

				}
				if (!isError) {
					//sets input to changedInput
					input = changedInput;
					//prints out the new string
					System.out.println("The new sentence is: "+ input);
					//resets changedInput
					changedInput = "";
					//resets the error boolean variable back to false
					isError = false;
				}
			}
			//code block for the remove all command
			else if (command.equalsIgnoreCase("remove all")) {
				//resets counter loop to zero
				j = 0;
				//resets isError
				isError = false;
				//resets changedInput variable
				changedInput = "";
				//automatically resets the isReplaced variable to false
				isReplaced = false;
				//automatically sets the willBeReplaced char variable back to default
				willBeReplaced = '!';
				//asks for the input char to be removed
				System.out.println("Enter the character to remove");
				willBeReplaced = keyboard.nextLine().charAt(0);

				//creates a while loop and a counter variable to remove all characters from the string
				while ( j < input.length()) {
					if (willBeReplaced == input.charAt(j) && j != input.length()-1) {
						//if a matching character is found and if j isn't input.length() -1, then it will set changedInput to a substring concatenation
						changedInput = input.substring(0, j).concat(input.substring(j+1));
						//sets input to changedInput
						input = changedInput;
						//sets the isReplaced variable to true
						isReplaced = true;
						j--;
					}
					else if (willBeReplaced == input.charAt(j) && j == input.length()-1) {
						//if a matching character is found, and if i is that last index, then it will just use the substring method once
						changedInput = input.substring(0, j);			
						//sets input to changedInput
						input = changedInput;
						//sets the isReplaced variable to true
						isReplaced = true;
						j--;
					}
					else if (willBeReplaced != input.charAt(j) && j == input.length()-1 && !isReplaced) {
						//if a character has not been removed, it will output an error message
						System.out.println("Error: the letter you are trying to remove does not exit");
						//sets the isError variable to true
						isError = true;
					}

					//increments j
					j++;
				}
				//will only print the new string if there is no error
				if (!isError) {
					System.out.println("The new sentence is: " + input);

				}
				//resets isError back to false
				isError = false;


			}
			//code block for the remove command
			else if (command.equalsIgnoreCase("remove")) {
				//resets j while loop variable back to 0
				j = 0;
				//resets index variable back to 0
				index = 0;
				//resets isError
				isError = false;
				//resets changedInput variable
				changedInput = "";
				//resets counter variable back to 0
				counter = 0;
				//automatically resets the isReplaced variable to false
				isReplaced = false;
				//automatically sets the willBeReplaced char variable back to default
				willBeReplaced = '!';
				System.out.println("Enter the character to remove");
				willBeReplaced = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + willBeReplaced + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				index = keyboard.nextInt();
				//while loop, whenever a matching character is found, then it will increment the counter variable, and will remove that character at that index
				while (j < input.length()) {
					if (input.charAt(j) == willBeReplaced) {
						counter++;
					}
					//if index is equal to the counter
					if (counter == index && j != input.length()-1) {
						//if the if condition is true, then changedInput is set to a concatenation of a substring of input from 0, j and j+1
						changedInput = input.substring(0, j) + input.substring(j+1);
						//sets isReplaced to true
						isReplaced = true;
					}
					//if index is equal to the counter and the index is the last index of the string then changedInput will be set to just a substring of input from 0 to j
					if (counter == index && j == input.length()-1) {
						changedInput = input.substring(0,j);
						//sets isReplaced to true
						isReplaced = true;
					}
					//increments j
					j++;
				}
				//if isReplaced still is false, then it will output an error statement
				if (!isReplaced) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				//if isReplaced is true, then it will output the new string
				if (isReplaced) {
					input = changedInput;
					System.out.println("The new sentence is: " +  input);
				}
				//this code exists to help fix an error of the program repeating asking for the code
				changedInput = keyboard.nextLine();
				//resets isReplaced
				isReplaced = false;
				
			}
			else {
				//output statement is none of the commands match
				System.out.println("Command invalid. Try again");
			}

		} while (!command.equalsIgnoreCase("quit"));

		//once the user enters the exit command, then the program will print the system exiting output
		System.out.println("...Execution Ends...");
	}
}
