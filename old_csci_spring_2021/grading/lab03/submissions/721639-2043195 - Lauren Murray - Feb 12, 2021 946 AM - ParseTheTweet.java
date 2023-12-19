/*
 * CSCI1301.java
 * Author:  Lauren Murray 
 * Submission Date:  2/12/2021
 *
 * Purpose: This lab uses user input to extract information from tweets that can 
 * be used by emergency management agencies and personnel during natural disasters
 * and other emergencies.
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
		// TODO Auto-generated method stub

		String tweet;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();

		String type= "", detail = "", location = "", latitude = "", longitude = "";


		int fromIndex = 0;
		int start = tweet.indexOf("#typ", fromIndex);
		start = start + 5; //adding 5 accounts for the hashtag, 3 letters, and a space
		int finish = tweet.indexOf(";", fromIndex);
		type = tweet.substring(start, finish);
		type = type.trim();
		type = type.toUpperCase(); //this makes the type string print in all capital letters

		/*The above process of extracting the information relating to the type string
		 * is repeated four more times to extract the details, location,
		 * latitude, and longitude from the tweets. 
		 */
		
		start = tweet.indexOf("#det", fromIndex);
		fromIndex = start;
		start = start + 5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		detail = tweet.substring(start,finish);
		detail = detail.replace(',', '-'); //this replaces any commas with a hyphen
		detail = detail.trim();

		start = tweet.indexOf("#loc", fromIndex);
		fromIndex = start;
		start = start + 5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		location = tweet.substring(start, finish);
		location = location.replace(',', '-');
		location = location.trim();

		start = tweet.indexOf("#lat", fromIndex);
		fromIndex = start;
		start = start + 5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		latitude = tweet.substring(start, finish);
		latitude = latitude.trim();

		start = tweet.indexOf("#lng", fromIndex);
		fromIndex = start;
		start = start + 5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		longitude = tweet.substring(start, finish);
		longitude = longitude.trim();


		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);


		keyboard.close();

	}

}
