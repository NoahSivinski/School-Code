/*
 * ParseTheTweet.java
 * Author:  Brandon Czech
 * Submission Date:  February 12, 2021
 *
 * Purpose: This program analyzes the user's input for a tweet, then finds the tweet's type
 * detail, location, latitude, and longitude.
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
		System.out.print("Enter a tweet below \n");
		String tweet = keyboard.nextLine();
		
		String type;
		String detail;
		String location;
		String latitude;
		String longitude; 
		int start = tweet.indexOf("#") + 4;
		int finish = tweet.indexOf(";");
		
		type = tweet.substring(start,finish).trim().toUpperCase(); /*Sets "type" to equal to the substring after the next # until the closest semicolon*/
		tweet = tweet.substring(finish + 1).trim(); /*assigns tweet to equal the next substring following the index after the previous semicolon*/
		start = tweet.indexOf(tweet) + 5; /*assigns "start" the index value of the next # */
		finish = tweet.indexOf(";");
		
		detail = tweet.substring(start,finish).trim().replace(",", "-");
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf(tweet) + 5;
		finish = tweet.indexOf(";");
		
		location = tweet.substring(start,finish).trim().replace(",", "-");
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf(tweet) + 5;
		finish = tweet.indexOf(";");
		
		latitude = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf(tweet) + 5;
		finish = tweet.indexOf(";");
		
		longitude = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf(tweet) + 5;
		finish = tweet.indexOf(";");
		
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		

	}

}
