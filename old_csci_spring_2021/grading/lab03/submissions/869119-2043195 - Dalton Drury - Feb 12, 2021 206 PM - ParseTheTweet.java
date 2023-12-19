/*
 * ParseTheTweet.java
 * Author:  Dalton Drury 
 * Submission Date:  Feb. 12, 2021
 *
 * Purpose: My program prompts the user to input a tweet, 
 * and my scanner then outputs and extracts the specified lab instruction requirements for these tweets.
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
		// Below I input my scanner and used the identifier "keyboard" for my scanner object.
		Scanner keyboard = new Scanner(System.in);

		// Here I prompt the user to "Enter a tweet below". 
		System.out.println("Enter a tweet below");

		// Below I created a string variable named tweet.
		String tweet = keyboard.nextLine();

		// Here I split up the strings into type, detail, location, latitude, longitude.
		String type = "#typ";
		String detail = "#det";
		String location = "#loc";
		String latitude = "#lat";
		String longitude = "#lng";

		/* Below I declare two variables start and finish, as stated in the instructions, and I also divide the inputed tweet into separate substrings.
		I also trim here as stated in the instructions and use indexOf to return the index of the first occurrence of the substring.
		I do this for type, detail, location, latitude, longitude. */
		int start = tweet.indexOf("#") + 5;
		int finish = tweet.indexOf(";");
		type = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start,finish).trim();

		type=type.toUpperCase();

		// Here I take out the comma and replace it with a hyphen as directed in our instructions. 
		detail=detail.replace(',','-');
		location=location.replace(',', '-');

		// Here I print to produce the proper formatted output. I used "\t" for proper indentation.
		System.out.println("Type:\t\t"+type);
		System.out.println("Detail:\t\t"+detail);
		System.out.println("Location:\t"+location);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);

		keyboard.close();

	}
}