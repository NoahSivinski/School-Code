/*
 * ParseTheTweet.java
 * Author:  Zachary Krausman 
 * Submission Date:  11 February 2021
 *
 * Purpose: This program will parse out pertinent information from a tweet into more usable
 * and readable information. This information includes the type of event, the details of the
 * event, the location of the event, the latitude, and the longitude of the event.
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
		
		// Declaration of variables
		String type, detail, location, latitude, longitude; // what will be printed
		int start, finish; // used for substring indices
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		keyboard.close(); // closes scanner to stop resource leak
		
		// Type data parsing
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 5, finish);
		String typeTrim = type.trim();
		tweet = tweet.substring(finish + 2);
		
		// Detail data parsing
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";"); // redefine 'finish' because it's based off the shifted tweet string established on line 46
		detail = tweet.substring(start + 5, finish);
		String detailTrim = detail.trim();
		tweet = tweet.substring(finish + 2);
		
		// Location data parsing
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5, finish);
		String locationTrim = location.trim();
		tweet = tweet.substring(finish + 2);
		
		// Latitude data parsing
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5, finish);
		String latitudeTrim = latitude.trim();
		tweet = tweet.substring(finish + 2);
		
		// Longitude data parsing
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5, finish);
		String longitudeTrim = longitude.trim();
				
		System.out.println("Type:\t\t" + typeTrim.toUpperCase());
		System.out.println("Detail:\t\t" + detailTrim.replace(',' , '-'));
		System.out.println("Location:\t" + locationTrim.replace(',' , '-'));
		System.out.println("Latitude:\t" + latitudeTrim);
		System.out.println("Longitude:\t" + longitudeTrim);

	}

}
