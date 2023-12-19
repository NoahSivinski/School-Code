import java.util.Scanner;

/*
 * StringFun.java
 * Author:  Jonathan Anderson
 * Submission Date:  10/15/2021
 *
 * Purpose: This program manipulates a user given string in one of 6 different ways, based of user choice.
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
public class StringFun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Prompting user for sentence input
        System.out.println("Enter the string to be manipulated");
        String sentence = input.nextLine();

        boolean quit = false;

        while(!quit){
            //Prompting user for command input
            System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
            String command = input.next();

            //returns reversed version of user input
            if(command.equalsIgnoreCase("reverse")){
                sentence = reverse(sentence);
                System.out.println("The new sentence is: " + sentence);
            }

            //removes first instance of a given char
            else if(command.equalsIgnoreCase("replace first")){
                //Prompting user inputs
                System.out.println("Enter the character to replace");
                char replaceChar = input.nextLine().charAt(0);

                System.out.println("Enter the new character");
                String newChar = input.nextLine();

                String replaced = "";
                boolean charFound = false;

                //loops through the entirety of the string from beginning to end
                for(int i = 0; i < sentence.length(); i++){
                    //checks to see if first instance of char has been found and if the current char is the char to be replaced
                    if(!charFound && sentence.charAt(i) == replaceChar){
                        //replaces first instance with new character and flags that the char has been found
                        replaced += newChar;
                        charFound = true;
                    }
                    //all other characters simply get added to modified string
                    else{
                        replaced += sentence.charAt(i);
                    }
                }

                //if the character was not found, program tells user
                if(!charFound){
                    System.out.println("The letter was not found in the word");
                }
                else{
                    //if character was found, program tells user modified string
                    sentence = replaced;
                    System.out.println("The new sentence is: " + sentence);
                }
            }

            //this code does the exact same thing as replace first, but reverses the string so that the "first instance" of a character is really the last instance
            //the string is then reversed before returning the input to the user
            else if(command.equalsIgnoreCase("replace last")){
                System.out.println("Enter the character to replace");
                char replaceChar = input.nextLine().charAt(0);

                System.out.println("Enter the new character");
                String newChar = input.nextLine();

                String replaced = "";
                String temp = reverse(sentence);

                boolean charFound = false;

                for(int i = 0; i < temp.length(); i++){
                    if(!charFound && temp.charAt(i) == replaceChar){
                        replaced += newChar;
                        charFound = true;
                    }
                    else{
                        replaced += temp.charAt(i);
                    }
                }

                if(!charFound){
                    System.out.println("The letter was not found in the word");
                }
                else{
                    sentence = reverse(replaced);
                    System.out.println("The new sentence is: " + sentence);
                }
            }

            //removes all instances of a character from the sentence
            else if(command.equalsIgnoreCase("remove all")){
                System.out.println("Enter the character to remove: ");
                char removeChar = input.nextLine().charAt(0);

                String removed = "";

                //loops through the string. only adds characters that are not the same as the one that is to be removed
                for(int i = 0; i < sentence.length(); i++){
                    if(!(sentence.charAt(i) == removeChar)){
                        removed += sentence.charAt(i);
                    }
                }

                sentence = removed;
                System.out.println("The new sentence is: " + sentence);
            }

            //removes a specified character from the string
            else if(command.equalsIgnoreCase("remove")){
                System.out.println("Enter the character you want to remove");
                char removeChar = input.nextLine().charAt(0);

                System.out.println("Enter the " + removeChar + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
                int removePosition = input.nextInt();

                int removeCharCount = 0;
                String removed = "";

                //loops through the string
                for(int i = 0; i < sentence.length(); i++){
                    //if the current character is the same as the one being removed, then increase remove count
                    if(sentence.charAt(i) == removeChar){
                        removeCharCount++;
                        //if the remove count is equal to the position of the character being removed, increment the index by one to skip that character from concatenation
                        if(removeCharCount == removePosition){
                            i++;
                        }
                    }

                    //checks to see if the index is still in bounds; if so, then we add the character at that index to the string
                    if(i < sentence.length()){
                        removed += sentence.charAt(i);
                    }
                }

                //if the remove count is greater than or equal to the indicated character, that means that the letter that is being removed does not exist.
                if(removeCharCount > removePosition || removePosition > removeCharCount){
                    System.out.println("Error: the letter you are trying to remove does not exist");
                }
                else{
                    //returns to user
                    sentence = removed;
                    System.out.println("The new sentence is: " + sentence);
                }
            }

            //quits the program by setting the while loop condition to true
            else if(command.equalsIgnoreCase("quit")){
                quit = true;
            }
            else{
                System.out.println("Command invalid. Try again");
            }
        }
    }

    //reverse method is used several times to simplify code
    public static String reverse(String sentence){
        String reversed = "";

        //loops through the string backwards, concatenating each character to create a reversed string
        for(int i = sentence.length() - 1; i >= 0; i--){
            reversed += sentence.charAt(i);
        }

        return reversed;
    }
}
