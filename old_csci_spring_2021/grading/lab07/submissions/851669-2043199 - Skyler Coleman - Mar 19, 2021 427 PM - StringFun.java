/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [03/19/2021]
 *
 * Purpose: Program that allows the user to input a string that 
 * can be manipulated successively using the 5 various commands: 
 * Reverse, Replace First, Replace Last, Remove All, and Remove.
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
/**
 * @author sky.cole768
 *
 */
public class StringFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the string to be manipulated");
		String originalResponse = keyboard.nextLine(); // User's original inputed string to be manipulated.
		
		String response = originalResponse; // User's inputed string to be manipulated.
		String response2;
		
		do {
			System.out.println("Enter your command(reverse, replace first, replace last, remove all, remove, quit)");
			response2 = keyboard.next() + keyboard.nextLine(); // User's Command
			
			int length = response.length(); // Length of manipulated response.
			String alteredResponse = ""; // place holder variable while response is being manipulated.
			
			if (response2.equalsIgnoreCase("reverse")){	
			for(int i = 0; i < length; length--) { 
				
				alteredResponse = alteredResponse + response.charAt(length-1); // Response being manipulated.
				
				if (length == 1) {
					System.out.println("The new sentence is: " + alteredResponse);
					
					response = alteredResponse; // Updated Response.
				}
			}
		}
			else if (response2.equalsIgnoreCase("replace first")) {	
			System.out.println("Enter the character to replace");
			char oldCh = keyboard.next().charAt(0); // Old character that user wants to be replace first.
			
			System.out.println("Enter the new character");
			char newCh = keyboard.next().charAt(0); // New character to replace old character. 
			
			char alteredResponse2 = response.charAt(0); // Initial character of user's manipulated/inputed response.
			
			if (alteredResponse2 == oldCh) {	
				alteredResponse = newCh + response.substring(1, length); // Manipulated Response.
				
				System.out.print("The new sentence is: " + alteredResponse);
				System.out.println("");
				
				response = alteredResponse; // Updated Response.
			}
			else {
				for (int i = 0; alteredResponse2 != oldCh && i <= length-1; i++) {
					alteredResponse2 = response.charAt(i); // Character in user's manipulated/inputed response at index i.
					
					if( alteredResponse2 == oldCh) {
						alteredResponse = response.substring(0,i) + newCh + response.substring(i+1, length); // Manipulated Response.
						
						System.out.print("The new sentence is: " + alteredResponse);
						System.out.println("");
						
						response = alteredResponse; // Updated Response.
						}
					}
				if (alteredResponse2 != oldCh) {
					System.out.println("The letter was not found in the word");
					}
				}
			}
		else if (response2.equalsIgnoreCase("replace last")) {
			System.out.println("Enter the character to replace");
			char oldCh = keyboard.next().charAt(0); // Old character that user wants to be replace last.
			
			System.out.println("Enter the new character");
			char newCh = keyboard.next().charAt(0);  // New character to replace old character.
			
			
			char alteredResponse2 = response.charAt(length-1); // Last character of user's manipulated/inputed response.
			
			if( alteredResponse2 == oldCh) {
				alteredResponse = response.substring(0,length-1) + newCh; // Manipulated Response.
				
				System.out.print("The new sentence is: " + alteredResponse);
				System.out.println("");
				
				response = alteredResponse; // Updated Response.
				}
			else {
				for (int i = 1; alteredResponse2 != oldCh && i <= length; length--) {
					alteredResponse2 = response.charAt(length-1); // Character in user's manipulated/inputed response at decreasing length index value.
					
					if( alteredResponse2 == oldCh) {
						alteredResponse = response.substring(0,length-1) + newCh + response.substring(length, response.length()); // Manipulated Response.
						
						System.out.print("The new sentence is: " + alteredResponse);
						System.out.println("");
						
						response = alteredResponse; // Updated Response.
						}
					}
				if (alteredResponse2 != oldCh) {
					System.out.println("The letter was not found in the word");
					}
				}
			}
			else if (response2.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char chToRemove = keyboard.next().charAt(0); // Character that user wants to remove.
			
				char alteredResponse2 = response.charAt(0); // Initial character of user's manipulated/inputed response.
				
				for (int i = 0; i <= length-1 && alteredResponse2 != chToRemove; i++) {
					alteredResponse2 = response.charAt(i); // Character in user's manipulated/inputed response at index i.
				}	
				if (alteredResponse2 != chToRemove) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {	
				for (int i = 0; i <= length-1; i++) {	
					alteredResponse2 = response.charAt(i);
					
					if (alteredResponse2 != chToRemove) {
						alteredResponse = alteredResponse + alteredResponse2; // Manipulated Response.
						}
					}
				
				System.out.println("The new sentence is: " + alteredResponse);
				
				response = alteredResponse; // Updated Response.
				}
			}
		else if (response2.equalsIgnoreCase("remove")) {
			
		System.out.println("Enter the character to remove");
		char chToRemove = keyboard.next().charAt(0); // Character that user wants to remove.

		System.out.println("Enter the " + chToRemove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
		int chToMove = keyboard.nextInt(); // The number of the character the user would like to remove(not index).
		
		int count = 0; // Number of times the chToRemove is in the response.
		int i;

		for(i=0, count=0; count != chToMove && i <= length-1; i++) {
			char alteredResponse2 = response.charAt(i); // Character in user's manipulated/inputed response at index i.
			
			if (alteredResponse2 == chToRemove) {
				count++;
				}
			if (count == chToMove) {
				alteredResponse = response.substring(0, i) +response.substring(i+1, length); // Manipulated Response.
				response = alteredResponse; // Updated Response.
				
				System.out.println("The new sentence is: " + alteredResponse);
				}
			}
		if (count != chToMove){
			System.out.println("Error: the letter you are trying to remove does not exist");
			}
		}
	
		} while (!response2.equals("Quit")); {
			keyboard.close();
			return;
			}
		}
	}
