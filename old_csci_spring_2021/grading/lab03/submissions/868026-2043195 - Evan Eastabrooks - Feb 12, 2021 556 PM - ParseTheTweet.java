/*
 * ParseTheTweet.java
 * Author:  Evan Eastabrooks 
 * Submission Date:  2/12/2021
 *
 * Purpose: ParseTheTweet.java takes the input from the user's tweet
 * and identifies the hashtags in the tweet. These hashtags give
 * important information as to what is going on and this program separates
 * that information to make it easier to read.
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
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		String type, location, detail, latitude, longitude;
		
		// Declaring the start and finish variables
		int start, finish = 0;
		
		// For the first hashtag: sets the beginning of the substring at "#" and its ending at ";"
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start,finish);
		type = type.toUpperCase(); // type.toUpperCase makes the info upper case
		tweet = tweet.substring(finish + 1); // Deletes this hashtag so we can start over with the next
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish);
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location = location.replace(",","-"); // Replaces the comma with a hyphen
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start,finish);
		tweet = tweet.substring(finish + 2);
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start,finish);
		
		// Print statements
		System.out.println("Type:\t\t\t" + type);
		System.out.println("Detail:\t\t\t" + detail);
		System.out.println("Location:\t\t" + location);
		System.out.println("Latitude:\t\t" + latitude);
		System.out.println("Longitude:\t\t" + longitude);
		
	}

}
