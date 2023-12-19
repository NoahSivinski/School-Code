/*
 * StringFun.java
 * Author:  Natalia Gonzalez
 * Submission Date:  03-19-2021
 *
 * Purpose: When the user enters a sentence as a String 
 * and can manipulate that string using 5 basic commands and quit.
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
        Scanner keyboard = new Scanner(System.in);
        String command, line;
        boolean flag = true;
        System.out.println("Enter the string to be manipulated");
        line = keyboard.nextLine();
        while(line.length() == 0) // If user doesn't enter anything
        {
            System.out.println("Field can't be empty. Enter the string to be manipulated");
            line = keyboard.nextLine();
        }
        while(flag)
        {
        	System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
            command = keyboard.nextLine();
            if(command.equalsIgnoreCase("reverse"))
            {
                int lastIndex = line.length() - 1; //This will hold last character index from string
                for(int i=0; i<line.length(); i++)
                {
                    line = line.substring(0, i) + line.charAt(lastIndex) + line.substring(i, line.length() - 1);
                }
                System.out.println("The new sentence is: " + line);
            }
            else if(command.equalsIgnoreCase("replace first"))
            {
                boolean changed = false;
                System.out.println("Enter the character to replace");
                String toBeReplaced = keyboard.nextLine();
                while(toBeReplaced.length() != 1)
                {
                    System.out.println("Invalid value. Please enter only one character");
                    toBeReplaced = keyboard.nextLine();
                }
                System.out.println("Enter the new character");
                String replaceWith = keyboard.nextLine();
                while(replaceWith.length() != 1)
                {
                    System.out.println("Invalid value. Please enter only one character");
                    replaceWith = keyboard.nextLine();
                }
                for(int i=0; i<line.length() && !changed; i++)
                {
                    if(line.substring(i, i+1).equals(toBeReplaced))
                    {
                        line = line.substring(0, i) + replaceWith + line.substring(i + 1);
                        changed = true;
                    }
                }
                if(changed)
                {
                    System.out.println("The new sentence is: " + line);
                }
                else
                    System.out.println("The letter was not found in the word");
            }
            else if(command.equalsIgnoreCase("replace last"))
            {
                int index = -1;
                System.out.println("Enter the character to replace");
                String toBeReplaced = keyboard.nextLine();
                while(toBeReplaced.length() != 1)
                {
                    System.out.println("Invalid value. Please enter only one character");
                    toBeReplaced = keyboard.nextLine();
                }
                System.out.println("Enter the new character");
                String replaceWith = keyboard.nextLine();
                while(replaceWith.length() != 1)
                {
                    System.out.println("Invalid value. Please enter only one character");
                    replaceWith = keyboard.nextLine();
                }
                for(int i=0; i<line.length(); i++)
                {
                    if(line.substring(i, i+1).equals(toBeReplaced))
                        index = i; //We are updating the index every time when same character is found
                }
                if(index != -1)
                {
                    line = line.substring(0, index) + replaceWith + line.substring(index + 1);
                    System.out.println("The new sentence is: " + line);
                }
                else
                    System.out.println("The letter was not found in the word");
            }
            else if(command.equalsIgnoreCase("remove"))
            {
                int index = -1;
                System.out.println("Enter the character to remove");
                String toBeRemoved = keyboard.nextLine();
                while(toBeRemoved.length() != 1)
                {
                    System.out.println("Invalid value. Please enter only one character");
                    toBeRemoved = keyboard.nextLine();
                }
                System.out.println("Enter the " + toBeRemoved +" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.): ");
                int number = keyboard.nextInt();  
                while(number <= 0)
                {
                    System.out.println("Please enter positive value:");
                    number = keyboard.nextInt();
                }
                int totalCountPassed = 0;
                for(int i=0; i<line.length() && totalCountPassed != number; i++)
                {
                    if(line.substring(i, i+1).equals(toBeRemoved))
                    {
                        index = i; //We are updating the index every time when same character is found
                        totalCountPassed++;
                    }
                }
                if(index != -1 && number <= totalCountPassed)
                {
                    line = line.substring(0, index) + line.substring(index + 1);
                    System.out.println("The new sentence is: " + line);
                }
                else
                    System.out.println("Error: the letter you are trying to remove does not exist");
                keyboard.nextLine(); //To clean any character present in buffer
            }
            else if(command.equalsIgnoreCase("remove all"))
            {
                System.out.println("Enter the character to remove");
                String toBeRemoved = keyboard.nextLine();
                while(toBeRemoved.length() != 1)
                {
                    System.out.println("Invalid value. Please enter only one character");
                    toBeRemoved = keyboard.nextLine();
                }
                boolean removed = false;
                for(int i=0; i<line.length(); i++)
                {
                    if(line.substring(i, i+1).equals(toBeRemoved))
                    {
                        line = line.substring(0, i) + line.substring(i + 1);
                        removed = true;
                        i--;
                    }
                }
                if(removed)
                {
                    System.out.println("The new sentence is: " + line);
                }
                else
                    System.out.println("Error: the letter you are trying to remove does not exist");
            }
            else if(command.equalsIgnoreCase("quit"))
                flag = false;
            else
                System.out.println("Invalid Choice. Please Try Again");
        }
    }
}
