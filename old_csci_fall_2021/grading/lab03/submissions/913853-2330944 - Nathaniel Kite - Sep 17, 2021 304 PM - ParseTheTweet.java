/*
 * ParseTheTweet.java
 * Author: Nate Kite
 * Submission Date: 9/17/2021
 *
 * Purpose: Reads a tweet. If it's formatted in a specific way,
 * it cuts out the formatting and returns the useful information.
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


import java.util.*;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		
		//Set up scanner, get tweet input from user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		//set up start & finish variables, find indices for type
		int start = tweet.indexOf("#typ");
		int finish = tweet.indexOf(";");
		
		//return type value
		System.out.println("Type: \t\t" + tweet.substring(start+4, finish).strip().toUpperCase());
		
		//redefine tweet, find indices for details, and return detail value
		tweet = tweet.substring(finish+1).strip();
		
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		System.out.println("Details: \t" + tweet.substring(start+4, finish).strip().replaceAll(",", "-"));
		
		//repeat for other values
		tweet = tweet.substring(finish+1).strip();
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		System.out.println("Location: \t" + tweet.substring(start+4, finish).strip());
		
		tweet = tweet.substring(finish+1).strip();
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		System.out.println("Latitude: \t" + tweet.substring(start+4, finish).strip());
		
		tweet = tweet.substring(finish+1).strip();
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		System.out.println("Longitude: \t" + tweet.substring(start+4, finish).strip());
		
		keyboard.close();
		
	}

}
