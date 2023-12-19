/*
 * StringFun.java
 * Author:  Chidubem Ireh
 * Submission Date:  3/21/21
 *
 * Purpose: The purpose of this lab is to create a program that helps the user manipulate a string until they wish to stop.
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
      
	   int removeLoc;
       char badChar, newChar, allChar, remove;
       String input, command, change, changeLastLet;
       
       System.out.println("Enter the string to be manipulated");
       Scanner keyboard = new Scanner(System.in);
       input = keyboard.nextLine();

       do {
           System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
           command = keyboard.nextLine();
           change = "";
           changeLastLet = "";
           if (!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first") && !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all") && !command.equalsIgnoreCase("remove") &&!command.equalsIgnoreCase("quit")) {
               System.out.println("Please enter one of the commands (reverse, replace first, replace last, remove all, remove, quit)");
               command = keyboard.nextLine();
           }
           //reverse
           if (command.equalsIgnoreCase("reverse")) {
               for (int i = (input.length() - 1); i > -1; i--) {
                   change += input.charAt(i);
               }
               input = change;
               System.out.println("The new sentence is: " + input);
           }

           //replaces first char
           if (command.equalsIgnoreCase("replace first")) 
           {
           System.out.println("Enter the character to replace");
           badChar = keyboard.next().charAt(0);
           keyboard.nextLine();
           System.out.println("Enter the new character");
           newChar = keyboard.next().charAt(0);
           keyboard.nextLine();

           int indexOfSearch = -1;
           for (int replacef = 0; replacef < input.length(); replacef++) {
           if (indexOfSearch < 0 && badChar == input.charAt(replacef)) {
               change += newChar;
               indexOfSearch = replacef;
           }
           else {
               change += input.charAt(replacef);
           }
           }
           if (change.equals(input)) 
           {
               System.out.println("The letter was not found in the word");
           }
           else {
           input = change;
           System.out.println("The new sentence is: " + input);
           }

           }

           //replaces last char
           if (command.equalsIgnoreCase("replace last")) 
           {
           System.out.println("Enter the character to replace");
           badChar = keyboard.next().charAt(0);
           keyboard.nextLine();
           System.out.println("Enter the new character");
           newChar = keyboard.next().charAt(0);
           keyboard.nextLine();

           int indx = -1;
           for (int replacef = (input.length() - 1); replacef > -1; replacef--)
           {
           if (indx < 0 && badChar == input.charAt(replacef))
           {
           change += newChar;
           indx = replacef;
           }
           else {
           change += input.charAt(replacef);
           }
           }
           for (int reverse = (input.length() - 1); reverse > -1; reverse--) {
               changeLastLet += change.charAt(reverse);
           }
           if (changeLastLet.equals(input)) {
               System.out.println("The letter was not found in the word");
           }
           else {
               input = changeLastLet;
               System.out.println("The new sentence is: " + input);
           }
           }
           //removes all instances of the character from the string
           if (command.equalsIgnoreCase("remove all")) 
           {
           System.out.println("Enter the character to remove");
           allChar = keyboard.next().charAt(0);
           keyboard.nextLine();
           for (int i = 0; i < input.length(); i++) {
               if (allChar != input.charAt(i)) {
                   change += input.charAt(i);
           }
           }
           if (change.equals(input))
           {
               System.out.println("Error: the letter you are trying to remove does not exist");
           }
           else 
           {
           input = change;
           System.out.println("The new sentence is: " + input);
           }
           }
           //remove one char
           if (command.equalsIgnoreCase("remove"))
           {
           System.out.println("Enter the character to remove");
           remove = keyboard.next().charAt(0);
           keyboard.nextLine();
           System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
           removeLoc = keyboard.nextInt();
           keyboard.nextLine();
           int count = 0;

           for (int i = 0; i < input.length(); i++) 
           {
           if (remove != input.charAt(i))
	       {
		   change += input.charAt(i);
	       }
           else {
               count++;
           if (count != removeLoc)
           change += input.charAt(i);
           }
              
           }
           if (change.equals(input)) {
               System.out.println("Error: the letter you are trying to remove does not exist");
           }
           else {
               input = change;
               System.out.println("The new sentence is: " + input);
           }
           }
       	   } 
       //quit
       while (!command.equalsIgnoreCase("quit"));

       System.out.println("...Execution Ends...");
       keyboard.close();
   }

}