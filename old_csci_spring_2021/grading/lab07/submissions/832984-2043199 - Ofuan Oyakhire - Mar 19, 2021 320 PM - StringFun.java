/*
 * StringFun.java
 * Author: Ofuan Oyakhire
 * Submission Date: 03/19/21
 *
 * Purpose: create an environment where the user can enter a sentence (as a string) and then
manipulate that string using 5 basic commands.
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

        // Initialize variables
        String input = "";
        String command;
        String result;
        String target;
        String replaceWith;



        Scanner keyboard = new Scanner(System.in);

        // Enter a string to be manipulated
        while (input.length() <= 0) {
            System.out.println("Enter the string to be manipulated");
            input = keyboard.nextLine();
            if (input.length() <= 0) {
                System.out.println("Enter at least a single letter to be manipulated.");
            }
        }



        do {
            // How the user wants to manipulate the String
            System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
            command = keyboard.nextLine();

            result = "";

            if (command.equalsIgnoreCase("reverse")) {
                // Reverse the input

                for (int i = input.length() - 1; i >= 0; i--) {
                    result += input.charAt(i);
                }


            } else if (command.equalsIgnoreCase("replace first")) {
                // Replace the first instance of the old character with the new character

                System.out.println("Enter the character to replace");
                target = keyboard.nextLine();

                System.out.println("Enter the new character");
                replaceWith = keyboard.nextLine();


                for (int i = 0; i < input.length() && result.equals(""); i++) {
                    if (("" + input.charAt(i)).equals(target)) {
                        result = input.substring(0, i) + replaceWith + input.substring(i + 1);
                    }
                }


            } else if (command.equalsIgnoreCase("replace last")) {
                // Replace the last instance of the old character with the new character

                System.out.println("Enter the character to replace");
                target = keyboard.nextLine();

                System.out.println("Enter the new character");
                replaceWith = keyboard.nextLine();

                for (int i = input.length() - 1; i >= 0 && result.equals(""); i--) {
                    if (("" + input.charAt(i)).equals(target)) {
                        result = input.substring(0, i) + replaceWith + input.substring(i + 1);
                    }
                }


            } else if (command.equalsIgnoreCase("remove")) {
                // remove any instance of a character that the user chooses

                int counter = 0;
                int index = -1;
                int occurrence;

                System.out.println("Enter the character to remove");
                target = keyboard.nextLine();

                System.out.println("Enter the " + target + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
                occurrence = Integer.parseInt(keyboard.nextLine());

                for (int i = 0; i < input.length(); i++) {

                    if (("" + input.charAt(i)).equals(target)) {
                        counter++;
                    }

                    if (counter == occurrence && index == -1) {
                        index = i;
                        result = input.substring(0, index) + input.substring(index + 1);
                    }
                }



            } else if (command.equalsIgnoreCase("remove all")) {
                // remove all instance of the character

                int counter = 0;

                System.out.println("Enter the character to remove");
                target = keyboard.nextLine();
                for (int i = 0; i < input.length(); i++) {
                    if (("" + input.charAt(i)).equals(target)) {
                        counter++;
                    } else {
                        result += input.charAt(i);
                    }
                }

                if (counter == 0) {
                    result = "";
                }

            }



            if (!result.equalsIgnoreCase("")) {

                if (("" + result.charAt(0)).equals(" ")) {
                    result = result.substring(1);
                }
                if (("" + result.charAt(result.length() - 1)).equals(" ")) {
                    result = result.substring(0, result.length() - 1);
                }
                System.out.println("The new sentence is: " + result);
                input = result;
            } else if (command.equalsIgnoreCase("replace first") ||
                    command.equalsIgnoreCase("replace last")) {
                System.out.println("The letter was not found in the word");
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.println("Error: the letter you are trying to remove does not exist");
            } else if (command.equalsIgnoreCase("remove all")) {
                System.out.println("Character could not be found");
            }

        } while (!command.equalsIgnoreCase("quit"));

    }
}


