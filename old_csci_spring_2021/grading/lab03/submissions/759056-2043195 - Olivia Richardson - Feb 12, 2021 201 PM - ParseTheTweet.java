/*
 * CSCI1301.java
 * Author:  Olivia Richardson
 * Submission Date:  2/12/2021
 *
 * Purpose: This program uses methods of the String class (substring and other methods) 
 * to process tweets to pull out encoded information from the text, manipulate it, 
 * and print the text back out on the screen that follows the output examples. 
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


	static final String Tweets = null;

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); // Scanner keyboard initialized for reading user input.
		System.out.println("Enter a tweet below"); // Prompting user input
		String tweet = keyboard.nextLine(); // Line 36 reads user input
		
		//Lines 40-42 finding the type information from the Tweet.
		int typStartInt = tweet.indexOf('#');
		int typStopInt = tweet.indexOf(';');
		String typ = tweet.substring(typStartInt+4, typStopInt).trim();
		
		//Lines 44-47 finding the detail information from the Tweet.
		int detStartInt = tweet.indexOf('#',typStopInt);
		int detStopInt = tweet.indexOf(';', detStartInt);
		String det = tweet.substring(detStartInt+4, detStopInt).trim();
		
		//Lines 49-52 finding the location information from the Tweet.
		int locStartInt = tweet.indexOf('#',detStopInt);
		int locStopInt = tweet.indexOf(';', locStartInt);
		String loc = tweet.substring(locStartInt+4, locStopInt).trim();
		
		//Lines 57-59 finding the latitude information from the Tweet.
		int latStartInt = tweet.indexOf('#',locStopInt);
		int latStopInt = tweet.indexOf(';', latStartInt);
		String lat = tweet.substring(latStartInt+4, latStopInt).trim();
		
		//Lines 61-64 finding the latitude information from the Tweet.
		int lngStartInt = tweet.indexOf('#',latStopInt);
		int lngStopInt = tweet.indexOf(';', lngStartInt);
		String lng = tweet.substring(lngStartInt+4, lngStopInt).trim();
	
		//Lines 67-71 show the extracted values
		System.out.println("Type:\t\t" + typ.toUpperCase());
		System.out.println("Detail:\t\t" +  det);
		System.out.println("Location:\t" + loc);
		System.out.println("Latitude:\t" + lat);
		System.out.println("Longitude:\t" + lng);
		
		keyboard.close();
	        

	}

}
