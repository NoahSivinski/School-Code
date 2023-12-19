/* 
* ParseTheTweet.java
* Author: Mohamed Ahmed 
* Date: September 17, 2021
* 
* This program reads a tweet that is inputed by a user
* 			and divides it into 5 different types of information.
* Statement of academic Honesty 
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
* 
* 
*/


import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) 
	{
		// Declaring Variables
		String tweet;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		int start;
		int finish;
		
		// Scanner Statement
		Scanner input = new Scanner(System.in);
		
		
		// Inputing Tweet
		 tweet = input.nextLine();
	
		 
		// Discarding 
		finish = tweet.indexOf(';');
		String trimmed = tweet.trim();
		
		
		
		// Getting the Type Value
		type = tweet.substring(5, tweet.indexOf(';'));
		tweet = tweet.substring(tweet.indexOf(';') + 1);
		type = type.toUpperCase();
		
		// Getting the Detail Value
		detail = tweet.substring(5, tweet.indexOf(';'));
		detail = detail.replace(',', '-');
		tweet = tweet.substring(tweet.indexOf(';') + 1);
		
		
		// Getting the Location Value
		location = tweet.substring(5, tweet.indexOf(';'));
		location = location.replace(',', '-');
		tweet = tweet.substring(tweet.indexOf(';') + 1);
		
		
		// Getting the Latitude Value		
		latitude = tweet.substring(5, tweet.indexOf(';'));
		tweet = tweet.substring(tweet.indexOf(';') + 1);

		
		// Getting the Longitude Value
		longitude = tweet.substring(5, tweet.indexOf(';'));
		tweet = tweet.substring(tweet.indexOf(';') + 1);
		
		
		// Print Statement
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		input.close();
	}

}
