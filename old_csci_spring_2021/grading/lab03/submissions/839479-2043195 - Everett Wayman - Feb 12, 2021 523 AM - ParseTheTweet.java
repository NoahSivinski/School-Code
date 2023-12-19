/*
 * ParseTheTweet.java
 * Author:  Everett Wayman 
 * Submission Date:  02/12/2021
 *
 * Purpose: The purpose of my program is to take a user's tweet and pull out information
 * from it such as type, detail, location, latitude, and longitude. The user's tweets
 * are formatted using different hashtags. These organized hashtags can be used to get
 * information about a disaster.
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

		// Here I declare the different variables, assigning them to the hashtags.
		String type = "#typ";
		String detail = "#det";
		String location = "#loc";
		String latitude = "#lat";
		String longitude = "#lng";

		// Here I use indexOf to find the integer from which each hashtag starts with
		// and finishes with. 
		int typStart = tweet.indexOf("#typ");
		int detStart = tweet.indexOf("#det");
		int locStart = tweet.indexOf("#loc");
		int latStart = tweet.indexOf("#lat");
		int lngStart = tweet.indexOf("#lng");
		int typFinish = tweet.indexOf("; #det");
		int detFinish = tweet.indexOf("; #loc");
		int locFinish = tweet.indexOf("; #lat");
		int latFinish = tweet.indexOf("; #lng");
		int lngFinish = tweet.lastIndexOf(";");

		// Using these found integers I pull out the substring needed from each tweet
		// making sure to only include the information after the "#___" and before the ';'.
		type = tweet.substring(typStart + 5, typFinish).trim();
		detail = tweet.substring(detStart + 5, detFinish).trim();
		location = tweet.substring(locStart + 5, locFinish).trim();
		latitude = tweet.substring(latStart + 5, latFinish).trim();
		longitude = tweet.substring(lngStart + 5, lngFinish).trim();

		// This then prints out the information found in each hashtag in different sections.
		System.out.println("Type:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail.replace(',', '-'));
		System.out.println("Location:\t" + location.replace(',', '-'));
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

		keyboard.close();

	}

}
