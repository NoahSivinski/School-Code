/*
 * ParseTheTweet.java
 * Author:  Brandon Ho 
 * Submission Date:  Sep 16 2021
 *
 * Purpose: Prompts user to enter a tweet, then takes each part of the tweet and stores into substrings.
 * Then prints out each part organized into a list of Type,Detail,Location,Latitude, and Longitude information of the tweet to the user.
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

		//readies program for user input
		Scanner keyboard = new Scanner(System.in);

		//Allows user to enter tweet and stores it into string variable named tweet
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();

		//Declaring variables to store each part of the tweet
		String tweetType;
		String tweetDetail;
		String tweetLocation;
		String tweetLatitude;
		String tweetLongitude;

		//Takes out the tweet type and stores it into a substring
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		tweetType = tweet.substring(start + 5, finish);
		tweetType = tweetType.trim();
		tweetType = tweetType.toUpperCase();

		//takes off type substring from main tweet and takes out tweet detail and stores it in substring
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		tweetDetail = tweet.substring(start + 5, finish);
		tweetDetail = tweetDetail.trim();
		tweetDetail = tweetDetail.replace(',', '-');

		//takes off details substring from main tweet and takes out tweet location and stores it in substring
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		tweetLocation = tweet.substring(start + 5, finish);
		tweetLocation = tweetLocation.trim();
		tweetLocation = tweetLocation.replace(',', '-');

		//takes off location substring from main tweet and takes out tweet latitude and stores it in substring
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		tweetLatitude = tweet.substring(start + 5, finish);
		tweetLatitude = tweetLatitude.trim();

		//takes off latitude substring from main tweet and takes out tweet longitude and stores it into substring
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		tweetLongitude = tweet.substring(start + 5, finish);
		tweetLongitude = tweetLongitude.trim();

		//prints out each substring in a list of their types
		System.out.println("Type: \t \t" + tweetType );
		System.out.println("Detail: \t" + tweetDetail);
		System.out.println("Location: \t" + tweetLocation);
		System.out.println("Latitude: \t" + tweetLatitude);
		System.out.println("Longitude: \t" + tweetLongitude);

		keyboard.close();


	}

}
