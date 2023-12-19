
/*
 * ParseTheTweet.java
 * Author: Jonathan Dintino
 * Submission Date: 17 September 2021
 *
 * Purpose: This program will prompt the user for a string input
 * for a tweet in a specific format. Then it will parse the string
 * and find the type, detail, location, latitude, and longitude
 * indicated by three letter tag names opening with a hashtag and
 * closing with a semicolon.
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// declare variables to be used for parsing and storing the results
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;

		char openChar = '#'; 	// opening character
		char closeChar = ';';	// closing character
		int offset = 4; 		// offsets the starting index to ignore the tag
		int start, finish; 		// integer indices to be used for substring

		// prompt the user for the tweet string
		System.out.println("Enter a tweet below");
		String tweet = userInput.nextLine();
		
		// code below could be done much easier with a loop!
		// parse tweet for type
		start = tweet.indexOf(openChar);
		finish = tweet.indexOf(closeChar);

		type = tweet.substring(start + offset, finish);
		type = type.trim().toUpperCase(); // type in uppercase

		// parse tweet for detail
		start = tweet.indexOf(openChar, finish);
		finish = tweet.indexOf(closeChar, start);

		detail = tweet.substring(start + offset, finish);
		detail = detail.trim().replace(",", "-"); // ensure detail does not have commas
		
		// parse tweet for location
		start = tweet.indexOf(openChar, finish);
		finish = tweet.indexOf(closeChar, start);

		location = tweet.substring(start + offset, finish);
		location = location.trim().replace(",", "-"); // ensure location does not have commas
		
		// parse tweet for latitude
		start = tweet.indexOf(openChar, finish);
		finish = tweet.indexOf(closeChar, start);

		latitude = tweet.substring(start + offset, finish);
		latitude = latitude.trim();
		
		// parse tweet for longitude
		start = tweet.indexOf(openChar, finish);
		finish = tweet.indexOf(closeChar, start);

		longitude = tweet.substring(start + offset, finish);
		longitude = longitude.trim();

		// output results after parsing the tweet
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

	}

}
