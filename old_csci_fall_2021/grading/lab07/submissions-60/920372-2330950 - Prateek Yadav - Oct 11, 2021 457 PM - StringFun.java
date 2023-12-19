/*
 * StringFun.java
 * Author:  Prateek Yadav
 * Submission Date:  10/11/2021
 * Due Date: 10/15/2021
 *
 *Code Description:
 *This program prompts the user for a string,
 *and then allows the user to use a certain set of
 *commands to alter the string, without using any imported
 *packages beyond the scanner.
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
 * 
 * I agree with this statement^
 */
import java.util.Scanner;
public class StringFun {

	public static void main(String[] args) {
		
		
		//Creating Scanner Object
		Scanner scan = new Scanner(System.in);
		//Declaring Variables
		String original = "";
		String newStr = "";
		String command = "";
		String toReplace, replacement, toRemove;
		boolean unreplaced = true;
		boolean ready = true;
		int count = 0;
		int removeNum;
		
		
		//Prompting user
		System.out.println("Enter the string to be manipulated");
		original = scan.nextLine();
		
		
		//Repeating Prompts loop
		while(ready){
			
			
			//Variable Resets
			unreplaced = true;
			count = 0;
			
			
			//Question prompt
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = scan.nextLine();
			
				//All command code indented to this level for clarity
			
				//Reverse
				if(command.equalsIgnoreCase("reverse")) {
					for(int i = original.length()-1; i > 0 ; i--) {
						newStr = newStr.concat(original.substring(i,i+1));
					}
					newStr = newStr.concat(original.substring(0,1));
					System.out.println("The new String is: " + newStr);
					original = newStr;
					newStr = "";
					command = "";	
				}
				
				
				
				//Replace First
				else if(command.equalsIgnoreCase("replace first")) {
					System.out.println("Enter the character to replace");
					toReplace = scan.nextLine();
					System.out.println("Enter the new character");
					replacement = scan.nextLine();
					
					for(int i = 0; i < original.length() ; i++) {
						if((original.substring(i,i+1).equals(toReplace))&&unreplaced){
							newStr = newStr.concat(replacement);
							unreplaced = false;
						}
						else {
							newStr = newStr.concat(original.substring(i,i+1));
						}
					}
					if(original.equals(newStr)) {
						System.out.println("The letter was not found in the word");
					}
					else {
						System.out.println("The new String is: " + newStr);
						original = newStr;
						newStr = "";
						command = "";
					}
				}
				
				
				
				//Replace Last
				else if(command.equalsIgnoreCase("replace last")) {
					System.out.println("Enter the character to replace");
					toReplace = scan.nextLine();
					System.out.println("Enter the new character");
					replacement = scan.nextLine();
					
					for(int i = 0; i < original.length() ; i++) {
						if(original.substring(i,i+1).equals(toReplace)){
							count++;
						}
					}
					
					for(int i = 0; i < original.length() ; i++) {
						if(original.substring(i,i+1).equals(toReplace)){
							if(count == 1){
								newStr = newStr.concat(replacement);
								unreplaced = false;
							}
							else {
								newStr = newStr.concat(original.substring(i,i+1));
								count--;
							}
						}
						else {
							newStr = newStr.concat(original.substring(i,i+1));
						}
					}
					if(original.equals(newStr)) {
						System.out.println("The letter was not found in the word");
					}
					else {
						System.out.println("The new String is: " + newStr);
						original = newStr;
						newStr = "";
						command = "";	
					}
				}
				
				
				
				//Remove
				else if(command.equalsIgnoreCase("remove")){
					System.out.println("Enter the character to remove");
					toRemove = scan.nextLine();
					for(int i = 0; i < original.length() ; i++) {
						if(original.substring(i,i+1).equals(toRemove)){
							count++;
						}
					}
					System.out.println("Enter the "+ toRemove +" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
					removeNum = scan.nextInt();
					
					if(removeNum > count){
						System.out.println("Error: the letter you are trying to remove does not exist");
						scan.nextLine();
					}
					else {
						for(int i = 0; i < original.length() ; i++) {
								
							if(!(original.substring(i,i+1).equals(toRemove))){
								newStr = newStr.concat(original.substring(i,i+1));
							}
							else{
								removeNum--;
								if(removeNum != 0){
									newStr = newStr.concat(original.substring(i,i+1));
								}
							}
						}
						System.out.println("The new String is: " + newStr);
						original = newStr;
						newStr = "";
						command = "";	
						scan.nextLine();
						
					}
				}
				
				
				
				//Remove All
				else if(command.equalsIgnoreCase("remove all")) {
					System.out.println("Enter the character to remove");
					toRemove = scan.nextLine();
					
					for(int i = 0; i < original.length() ; i++) {
						if(!(original.substring(i,i+1).equals(toRemove))){
							newStr = newStr.concat(original.substring(i,i+1));
						}
					}
					System.out.println("The new String is: " + newStr);
					original = newStr;
					newStr = "";
					command = "";	
				}
				
				
				
				//Quit
				else if(command.equalsIgnoreCase("quit")) {
					ready = false;
					System.exit(0);
				}
				else {
					System.out.println("Command invalid. Try again");
				}
			
		}//Main Loop
		
		
		//Closing Scanner Object
		scan.close();
	}

}
