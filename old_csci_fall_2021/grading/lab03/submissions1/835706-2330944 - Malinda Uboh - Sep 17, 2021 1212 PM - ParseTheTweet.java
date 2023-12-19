/*
 * [ParseTheTweet].java
 * Author:  [Malinda Uboh] 
 * Submission Date:  [09/17/2021]
 *
 * Purpose: This program uses methods of the string class to add structure to tweets sent during disasters. This program takes 
 * in user input in the form of a tweet, pulls out important information, manipulates it, and prints it out onto the screen.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class ParseTheTweet {
	
	public static void main(String[] args) {
	
		String tweet, sectionTweet, type, detail, location, latitude, longitude; 
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();// Get tweet from user
		
		int start = 5;
		int finish = tweet.indexOf(";"); //Set the variable finish equal to the index of the first occurrence of the semicolon 
		
		sectionTweet = tweet.substring(start, finish); /* Set the variable sectionTweet equal to the value between the #tag and 
		the semicolon*/ 
		
		type = sectionTweet; // Store the value between the #tag and the semicolon in the type variable
		type = type.trim(); //Remove leading and trailing white spaces from the string
		type = type.toUpperCase(); //Change value to all caps 
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2); // Increase index of the variable finish by 2
		
		sectionTweet = tweet.substring(5, tweet.indexOf(";")); //Set sectionTweet variable to the value between second #tag and semicolon
		detail = sectionTweet; 
		detail = detail.trim();
		detail = detail.replace(",", "-");//Change inputed commas into hyphens 
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2);
		
	
		sectionTweet = tweet.substring(5, tweet.indexOf(";"));
		location = sectionTweet;
		location = location.trim();
		location = location.replace(",", "-");
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2);
		
		
		sectionTweet = tweet.substring(5, tweet.indexOf(";"));
		latitude = sectionTweet;
		latitude = latitude.trim();
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2);
		
		
		sectionTweet = tweet.substring(5, tweet.indexOf(";"));
		longitude = sectionTweet;
		longitude = longitude.trim();
		
		
		System.out.println("Type:" + '\t' + '\t' + type);
		System.out.println("Detail:" + '\t' + '\t' + detail);
		System.out.println("Location:" + '\t' + location);
		System.out.println("Latitude:" + '\t' + latitude);
		System.out.println("Longitude:" + '\t' + longitude);
		
	}

}
