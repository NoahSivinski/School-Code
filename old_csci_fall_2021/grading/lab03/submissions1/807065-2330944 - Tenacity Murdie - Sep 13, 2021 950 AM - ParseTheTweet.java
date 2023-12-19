/*
 *ParseTheTweet.java
 * Author:  Tenacity Murdie 
 * Submission Date:  9-13-2021
 *
 * Purpose: This program takes in user input for a tweet, and manipulates the string data
 * in order to print out details about the tweet's type, detail, location, latitude, and longitude.
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
		
		//calling instance of scanner, prompting for user input, and initializing variable with user input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a tweet below\n");
		String tweet = keyboard.nextLine();
		
		//declaring all variables
		String tweetType;
		String tweetLocation;
		String tweetDetail;
		String tweetLatitude;
		String tweetLongitude;
		int start;
		int finish;
		
		start = tweet.indexOf("#") + 4; //starting position for our value
		finish = tweet.indexOf(";");
		tweetType = tweet.substring(start,finish).trim().toUpperCase(); //storing substring for tweetType and modifying string
		tweet = tweet.substring(finish+1); //discarding tweetType to get new substring for tweet
		
		start = tweet.indexOf("#") + 4; //starting position for our new value
		finish = tweet.indexOf(";");
		tweetDetail = tweet.substring(start,finish).trim().replace(",","-"); //storing substring for tweetDetail and modifying string
		tweet = tweet.substring(finish+1); //discarding tweetDetail to get new substring for tweet
		
		start = tweet.indexOf("#") + 4; //starting position for our new value
		finish = tweet.indexOf(";");
		tweetLocation = tweet.substring(start,finish).trim().replace(",","-"); //storing substring for tweetLocation and modifying string
		tweet = tweet.substring(finish+1); //discarding tweetLocation to get new substring for tweet
		
		start = tweet.indexOf("#") + 4; //starting position for our new value
		finish = tweet.indexOf(";");
		tweetLatitude = tweet.substring(start,finish).trim(); //storing substring for tweetLatitude and modifying string
		tweet = tweet.substring(finish+1); //discarding tweetLatitude to get new substring for tweet
		
		start = tweet.indexOf("#") + 4; //starting position for our new value
		finish = tweet.indexOf(";");
		tweetLongitude = tweet.substring(start,finish).trim(); //storing substring for tweetLongitude and modifying string
		
		System.out.println("Type:\t\t" + tweetType);
		System.out.println("Detail:\t\t" + tweetDetail);
		System.out.println("Location:\t" + tweetLocation);
		System.out.println("Latitude:\t" + tweetLatitude);
		System.out.println("Longitude:\t" + tweetLongitude);

		keyboard.close(); //optional closing of keyboard
	}

}
