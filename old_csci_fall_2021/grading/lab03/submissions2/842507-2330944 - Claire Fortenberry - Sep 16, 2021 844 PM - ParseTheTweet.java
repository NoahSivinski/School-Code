/*
 * ParseTheTweet.java
 * Author:  Claire Fortenberry 
 * Submission Date:  16 September 2021
 *
 * Purpose: This program aims to use methods of the String class 
 * to process information much like the Tweak the Tweet proposal. 
 * The program will extract information from a tweet that the user inputs 
 * and categorize the values as either type, detail, location, latitude, or longitude
 * based on the corresponding hashtag. 
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
		
		// Prompt user to input a tweet
		System.out.println("Enter a tweet below");
		String tweet = input.nextLine();
		
		String start = ("#");
		String finish = (";");
		
		String type = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); //Get value for #typ (excluding the hashtag)
		String typeTrimmed = type.trim();
		tweet = tweet.substring(tweet.indexOf(finish) + 1); //Discard first part of the tweet String
		
		String detail = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); //Get value for #det (excluding the hashtag)
		String detailTrimmed = detail.trim();
		tweet = tweet.substring(tweet.indexOf(finish) + 1); //Discard second part of the tweet String
		
		String location = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); //Get value for #loc (excluding the hashtag)
		String locationTrimmed = location.trim();
		tweet = tweet.substring(tweet.indexOf(finish) + 1); //Discard third part of the tweet String
		
		String latitude = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); //Get value for #lat (excluding the hashtag)
		String latitudeTrimmed = latitude.trim();
		tweet = tweet.substring(tweet.indexOf(finish) + 1); //Discard fourth part of the tweet String
		
		String longitude = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); //Get value for #lng (excluding the hashtag)
		String longitudeTrimmed = longitude.trim();
		
		// Output formatted information
		System.out.println("Type:\t\t" + typeTrimmed.toUpperCase());
		System.out.println("Detail:\t\t" + detailTrimmed);
		System.out.println("Location:\t" + locationTrimmed);
		System.out.println("Latitude:\t" + latitudeTrimmed);
		System.out.println("Longitude:\t" + longitudeTrimmed);
	
		input.close();
	}

}
