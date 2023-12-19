/*
 * ParseTheTweet.java
 * Author:  Evan McKinney 
 * Submission Date:  9/17/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 	This program takes in user input as a tweet during a natural
 *  disaster. It then looks through the tweet for the relevant information like 
 *  the type of tweet, description, location, latitude and longitude. It then
 *  stores each of those in its own variable and outputs it at the end.
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
		
		//User input
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		String type, detail, location, latitude, longitude;
		
		int start, finish;
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		type = tweet.substring(start,finish);
		//We want to disregard the #typ and the space after it, so 
		//we start the new String at the 5th index
		type = type.substring(5);
		//capitalizes the type
		type = type.toUpperCase();
		type = type.trim();
		
		//The +1 gets rid of the semi colon at the start
		tweet = tweet.substring(finish + 1);
		
		//Do a similar thing as above for the next 4 variables
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		detail = tweet.substring(start,finish);
		detail = detail.substring(5);
		//replaces all commas with hyphens
		detail = detail.replace(',','-');
		detail = detail.trim();
		
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		location = tweet.substring(start,finish);
		location = location.substring(5);
		//replaces all commas with hyphens
		location = location.replace(',','-');	
		location = location.trim();
		
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		latitude = tweet.substring(start,finish);
		latitude = latitude.substring(5);
		latitude = latitude.trim();
		
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		longitude = tweet.substring(start,finish);
		longitude = longitude.substring(5);
		longitude = longitude.trim();
		
		//Output
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		keyboard.close();
	}
}
