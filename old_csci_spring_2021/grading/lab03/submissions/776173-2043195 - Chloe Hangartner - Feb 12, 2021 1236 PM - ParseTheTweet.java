/*
 * ParseTheTweet.java
 * Author:  Chloe Hangartner
 * Submission Date:  12 February 2021
 *
 * Purpose: This lab uses methods of
 * the String class to process messages similar to 
 * TtT tweets. By using methods from the class
 * String, information will be pulled from the text,
 * manipulated, and printed to the screen.
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

		//Create Instance of Scanner and Prompt User Input
		System.out.println("Enter a tweet below");
		Scanner keyboard = new Scanner(System.in);
		String tweet = keyboard.nextLine();

		//Declare variables
		String type, detail, location, latitude, longitude;
		int start, finish;

		//Parse Type
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		type = tweet.substring((start + 4), finish);
		type = type.trim();

		//Update Tweet
		tweet = tweet.substring(finish + 2);

		//Parse Detail
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring((start + 4), finish);
		detail = detail.trim();

		//Update Tweet
		tweet = tweet.substring(finish + 2);

		//Parse Location
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		location = tweet.substring((start + 4), finish);
		location = location.trim();

		//Update Tweet
		tweet = tweet.substring(finish + 2);

		//Parse Latitude 
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring((start + 4), finish);
		latitude = latitude.trim();
		
		//Update Tweet
		tweet = tweet.substring(finish + 2);

		//Parse Longitude 
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring((start + 4), finish);
		longitude = longitude.trim();
		
		//Formatting Output
		detail = detail.replace(",",  "-"); 
		location = location.replace(",",  "-");

		//Print Lines
		System.out.println("Type:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		keyboard.close();
		
	}

}
