/*
 * ParseTheTweet.java
 * Author:  Andrew Glaze
 * Submission Date:  9/16/2021
 *
 * Purpose: This takes a Tweet as an input, and then parses 
 * and outputs it's values to the console.
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
		String type = new String();
		String detail = new String();
		String location = new String();
		String latitude = new String();
		String longitude = new String();
		
		// get a tweet form the console
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = key.nextLine();
		key.close();
		
		// Extract the Type from the tweet
		int start = tweet.indexOf("#typ");
		int finish = tweet.indexOf(';');
		type = tweet.substring(start + 5, finish);
		type = type.toUpperCase();
		type = type.trim();
		
		// Delete the Type from the tweet
		tweet = tweet.substring(finish + 1);
		
		// Extract the Detail from the tweet
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(';');
		detail = tweet.substring(start + 5, finish);
		detail = detail.replace(',', '-');
		detail = detail.trim();
		
		// Delete the detail from the tweet
		tweet = tweet.substring(finish + 1);
		
		// Extract the location from the tweet
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(';');
		location = tweet.substring(start + 5, finish);
		location = location.replace(',', '-');
		location = location.trim();
		
		// Delete the location from the tweet
		tweet = tweet.substring(finish + 1);
		
		// Extract the latitude from the tweet
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(';');
		latitude = tweet.substring(start + 5, finish);
		latitude = latitude.trim();
		
		// Delete the latitude from the tweet
		tweet = tweet.substring(finish + 1);
		
		// Extract the longitude from the tweet 
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(';');
		longitude = tweet.substring(start + 5, finish);
		longitude = longitude.trim();
		
		//Print all values to the console
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

	}

}
