/*
 * StringFun.java
 * Author:  Morgan McGrath 
 * Submission Date:  10/15/2021
 *
 * Purpose: This program modifies a user-entered string based on commands the user inputs.
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

	public static void main(String [] args) {
		//getting string
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String sentence=keyboard.nextLine();
		String command="";
		String newSentence="";
		//keep looping until the command is quit
		while(!(command.equalsIgnoreCase("quit"))) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command=keyboard.nextLine();
			//what happens when you enter reverse
			if(command.equalsIgnoreCase("reverse")) {
				for(int i=sentence.length()-1; i>=0;i--) {
					newSentence=newSentence+sentence.charAt(i);
				}
				System.out.print("The new sentence is: "+newSentence);
				System.out.println();
				sentence=newSentence;
				newSentence="";
			}
			//what happens when you enter replace first
			else if(command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				String stringReplace=keyboard.nextLine();
				stringReplace.trim();
				char charReplace=stringReplace.charAt(0);
				System.out.println("Enter the new character");
				String newString=keyboard.nextLine();
				newString.trim();
				char newChar=newString.charAt(0);
				boolean keepGoing=true;
				int index=0;
				while(index<sentence.length()&&keepGoing) {
					if(sentence.charAt(index)==charReplace) {
						newSentence=sentence.substring(0,index)+newChar+sentence.substring(index+1,sentence.length());
						keepGoing=false;
						System.out.print("The new sentence is: "+newSentence);
						System.out.println();
						sentence=newSentence;
						newSentence="";
					}
					else if(index==sentence.length()-1) {
						System.out.println("The letter was not found in the word");
						keepGoing=false;
					}
					index=index+1;;
				}
			}
			//what happens when you enter replace last
			else if(command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
				String stringReplace=keyboard.nextLine();
				stringReplace.trim();
				char charReplace=stringReplace.charAt(0);
				System.out.println("Enter the new character");
				String newString=keyboard.nextLine();
				newString.trim();
				char newChar=newString.charAt(0);
				boolean keepGoing=true;
				int index=sentence.length()-1;
				while(index>=0&&keepGoing) {
					if(sentence.charAt(index)==charReplace) {
						newSentence=sentence.substring(0,index)+newChar+sentence.substring(index+1,sentence.length());
						keepGoing=false;
						System.out.print("The new sentence is: "+newSentence);
						System.out.println();
						sentence=newSentence;
						newSentence="";
					}
					else if(index==0) {
						System.out.println("The letter was not found in the word");
						keepGoing=false;
					}
					index=index-1;;
				}
			}
			//what happens when you enter remove
			else if(command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				String stringRemove=keyboard.nextLine();
				stringRemove.trim();
				char charRemove=stringRemove.charAt(0);
				System.out.println("Enter the "+ charRemove+" you would like to remove (Not the index - 1=1st, 2=2nd, etc.):");
				String a = keyboard.nextLine();
				int userInput= (int) Double.parseDouble(a);
				int count=0;
				boolean charFound=false;
				for(int i=0; i<sentence.length(); i++) {
					if(charRemove==sentence.charAt(i)) {
						count=count+1;
						charFound=true;
						if(count==userInput) {
							newSentence=sentence.substring(0, i)+sentence.substring(i+1, sentence.length());
							System.out.print("The new sentence is: "+newSentence);
							System.out.println();
							sentence=newSentence;
							newSentence="";
						}
					}
					else if((!(charFound)||(userInput<0||userInput>count)) && (i==sentence.length()-1)) {
						System.out.println("Error: the letter you are trying to remove does not exist");
					}
				}
			}
			//what happens when you enter remove all
			else if(command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				String stringRemove=keyboard.nextLine();
				stringRemove.trim();
				char charRemove=stringRemove.charAt(0);
				//newSentence=sentence;
				boolean charFound=false;
				for(int i=0; i<sentence.length(); i++) {
					if(charRemove==sentence.charAt(i)) {
						//newSentence=newSentence.substring(0, i)+newSentence.substring(i+1, newSentence.length());
						//System.out.println(newSentence);
						charFound=true;
					
						
						
					}
					else if((i==sentence.length()-1)&&charFound==false) {
						System.out.println("Error: the letter you are trying to remove does not exist");
					} else {
						
						newSentence += sentence.charAt(i);
						if(i==sentence.length()-1) {
							System.out.print("The new sentence is: "+newSentence);
							System.out.println();
							sentence=newSentence;
							//newSentence="";
							i++;
						}
					}
				}
			}
			//what happens if the command is invalid
			else {
				if(!(command.equalsIgnoreCase("quit"))) {
					System.out.println("Command invalid. Try again");
				}
				
			}
		}
	}
}

