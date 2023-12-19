/*
 * ParseTheTweet.java
 * Author:  Ashlin Yeo
 * Submission Date:  9/15/2021
 *
 * Purpose: This program processes a certain format of a Twitter message (tweet) that utilizes hashtags (#). This program allows
 * a computer to classify the tweets and to pull out information from the tweet, manipulate it, and print it out to the screen.
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

		Scanner keyboard = new Scanner(System.in);
		String type, detail, location, latitude, longitude;

		//Prompt the user to enter a tweet. Define how the start and beginning of each section of the tweet will appear.
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		
		//Define type and print its value as an uppercase word.
		type = tweet.substring(start + 5, finish);
		type = type.trim();
		System.out.println("Type:\t\t" + type.toUpperCase());
		
		//Discard the used part of the string. Define detail and print its value, replacing commas with hyphens.
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5, finish);
		detail = detail.replace(',', '-');
		detail = detail.trim();
		System.out.println("Detail:\t\t" + detail);
		
		//Discard the used part of the string. Define location and print its value, replacing commas with hyphens.
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5, finish);
		location = location.replace(',', '-');
		location = location.trim();
		System.out.println("Location:\t" + location);
		
		//Discard the used part of the string. Define latitude and print its value.
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5, finish);
		latitude = latitude.trim();
		System.out.println("Latitude:\t" + latitude);
		
		//Discard the used part of the string. Define longitude and print its value.
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5, finish);
		longitude = longitude.trim();
		System.out.println("Longitude:\t" + longitude);
















	}

}
