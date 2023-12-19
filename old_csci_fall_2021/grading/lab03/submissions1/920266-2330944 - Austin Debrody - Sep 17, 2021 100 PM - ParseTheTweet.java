/*
 * ParseTheTweet.java
 * Author:  Austin Debrody
 * Submission Date:  9/17/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This program is designed to take an input of different tweets by 
 * a user and break them up into their own values. The program will 
 * also remove the hashtags and put them in standard, non-hashtag 
 * form. This is so the user can see clearly the type, details, 
 * location, latitude, and longitude of a series of tweets.
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
		//creation of scanner object
		Scanner scan = new Scanner(System.in);
		
		//declaration of variables used throughout program
		String tweet;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		//creation of temporary parameter variables
		int start;
		int finish;
		
		//asks for input and assigns it to the tweet variable
		System.out.println("Enter a tweet below");
		tweet = scan.nextLine();
		
		//sets parameters for the type value
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		
		//sets value of the type using parameters
		type = tweet.substring(start + 5, finish);
		
		//outputs type value for user in all upper case
		System.out.println("Type: \t\t" + type.toUpperCase());
		
		//removes the type portion of the string
		tweet = tweet.substring(finish +1);
		
		//sets new parameters for the detail value
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		
		//sets value of the detail using parameters
		detail = tweet.substring(start + 5, finish);
		
		//removes commas and prints detail output
		detail = detail.replace(',', '-');
		System.out.println("Detail: \t" + detail);
		
		//removes the detail portion of the string
		tweet = tweet.substring(finish + 2);
		
		//sets new parameters for the location value
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		
		//sets value of the location using parameters
		location = tweet.substring(start + 5, finish);
		
		//removes and replaces commas and prints out location info
		location = location.replace(',', '-');
		System.out.println("Location: \t" + location);
		
		//removes the location portion of the string
		tweet = tweet.substring(finish + 1);
				
		//sets new parameters for the latitude value
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
				
		//sets value of the latitude using parameters
		latitude = tweet.substring(start + 5, finish);
		
		//outputs latitude value for user
		System.out.println("Latitude: \t" + latitude);
		
		//removes the latitude portion of the string
		tweet = tweet.substring(finish + 1);
				
		//sets new parameters for the longitude value
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
				
		//sets value of the logitude using parameters
		longitude = tweet.substring(start + 5, finish);
		
		//outputs longitude value for user
		System.out.println("Longitude: \t" + longitude);
		
	}

}
