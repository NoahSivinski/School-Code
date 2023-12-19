/*
 * ParseTheTweet.java
 * Author:  Evan Zimmerman 
 * Submission Date:  12th February 2021
 *
 * Purpose: The exercise being explored by Lab #3 is exploring strings and string methods.
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

public class ParseTheTweet {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for a tweet.
		
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		//Declare variables.
		
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		int start;
		int finish;
		
		//Print out the original tweet string here since it is modified later in the code.
		
		System.out.println("'" + tweet + "'");
		
		//Starts a pretty repetitive series of reassigning values to start and finish and taking the substrings,
		//I understand that this is repetitive and clunky but this was the fastest and easiest method I could come
		//up with to assign the proper substrings to each string variable.
		
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		//For the type substring, gets and trims substring between start and finish variables.
		
		type = tweet.substring(start, finish).trim().toUpperCase();
		
		//Uses the substring method to cut out the stuff for the 'type' variable, and redefines start and finish variables.
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		//Repeat.
		
		detail = tweet.substring(start, finish).trim().replace(',' , '-');
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		location = tweet.substring(start, finish).trim().replace(',', '-');
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		latitude = tweet.substring(start, finish).trim();
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		longitude = tweet.substring(start, finish).trim();
		
		//Print output.
		
		System.out.println("Type: \t\t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		
		keyboard.close();
		
	}

}
