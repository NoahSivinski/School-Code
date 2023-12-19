/*
 * [ParseTheTweet].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [2/12/2021]
 *
 * Purpose: This program takes a tweet from the user and breaks up each part of it denoted from # to ; that provides the type, location, latitude, longitude
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
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter a tweet below: ");
		String tweet = input.nextLine();
		
		//Takes the Start (s) and Final (f) as the start and finish
		int s = tweet.indexOf("#");
		int f = tweet.indexOf(";");
		String type = tweet.substring(s+5,f);
		
		tweet = tweet.substring(f + 1);
		s = tweet.indexOf("#");
		f = tweet.indexOf(";");
		String detail = tweet.substring(s+5,f);
		
		tweet = tweet.substring(f + 1);
		s = tweet.indexOf("#");
		f = tweet.indexOf(";");
		String location = tweet.substring(s+5,f);

		tweet = tweet.substring(f + 1);
		s = tweet.indexOf("#");
		f = tweet.indexOf(";");
		String latitude = tweet.substring(s+5,f);
		
		tweet = tweet.substring(f + 1);
		s = tweet.indexOf("#");
		f = tweet.indexOf(";");
		String longitude = tweet.substring(s+5,f);
		
		System.out.println("Type:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
	}
}


