/*
 * ParseTheTweet.java
 * Author:  Gage Roney
 * Submission Date:  2/11/2021
 *
 * Purpose: This lab program takes a users tweet and parses or breaks up the tweet and separates it into different
 * categories that each section of the tweet is defined as. 
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

import java.util.Scanner;		//the imported scanner used to allow for the user inputs
	public class ParseTheTweet {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a tweet below\n"); //The prompt for the user to input their tweets for the program
		String tweet = keyboard.nextLine();
		
		/*The start and finish values defined as integer values for the program to recognized the index of when the 
		 * '#' and the ';' are found in the tweet so the computer will split up and output the right value 
		 * for each category that is needed
		 */
		
		int start = tweet.indexOf('#');		
		int finish = tweet.indexOf(';');
		
		/*This is the first set of the string used with the integer values of the tweet index. It takes the substring 
		 * of the tweet and goes to the 5th index and finishes the after it recognizes the ';' , it is also trimmed so
		 * that the space in front of each detail or type etc. is deleted and it outputs the message that is desired.
		 * Afterwards the same is applied for each other with minor changes.
		 */
		String type = tweet.substring(start + 5, finish);	
			type = type.trim();
			tweet = tweet.substring(finish + 1); //Is the rest of the entire tweet with the start cut out.
			type = type.toUpperCase();	//Used to output the first type as a fully upper cased word.
			
			start = tweet.indexOf('#');	//Start and finished are altered and are not used as integer values again.
			finish = tweet.indexOf(';');
		
		String  detail = tweet.substring(start + 5, finish);
			detail = detail.trim();
			tweet = tweet.substring(finish + 1);
			detail = detail.replace(',' , '-'); //Where the comma in the tweet is manipulated and replaced to a hiphen. 
			
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');
		
		String location  = tweet.substring(start + 5, finish);
			location = location.trim();
			tweet = tweet.substring(finish + 1);
			location = location.replace(',' , '-');	//Same replace method as stated before
			
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');
		
		String latitude  = tweet.substring(start + 5, finish);
			latitude = latitude.trim();
			tweet = tweet.substring(finish + 1);
			
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');
		
		String longitude  = tweet.substring(start + 5, finish);
			longitude = longitude.trim();
			tweet = tweet.substring(finish + 1);
		//The rest of the print lines that utilize the subtrings and output the correct line of text for each category	
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		
		
		keyboard.close();
	}

}
