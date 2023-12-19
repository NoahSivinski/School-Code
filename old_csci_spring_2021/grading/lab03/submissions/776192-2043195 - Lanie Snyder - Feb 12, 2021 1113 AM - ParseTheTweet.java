/*
 * ParseTheTweet.java
 * Author: Lanie Snyder
 * Submission Date:  February 12, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * I made this program to add structure to tweets sent during 
 * disasters. The tweet is inputed by the user. The program 
 * will break down the tweet and display the type, detail,
 * location, latitude, and longitude included in the tweet.
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
		
		String type;
		String location;
		String detail;
		String latitude;
		String longitude;
		String tweet;
		int start;
		int finish;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();
		
		//Extracting the type
		start = tweet.indexOf("#");
		start = start + 5; //this is to get rid of the information before the actual value
		finish = tweet.indexOf(";");
		
		type = tweet.substring(start,finish);
		type = type.trim();
		type = type.toUpperCase();

		//Extracting the detail
		finish = finish + 1; //+1 because the last ; can not be included 
		tweet = tweet.substring(finish);
		
		start = tweet.indexOf("#");
		start = start + 5; //this is to get rid of the information before the actual value
		finish = tweet.indexOf(";");
		
		detail = tweet.substring(start,finish);
		detail = detail.trim();
		detail = detail.replace(',','-');

		//Extracting the location
		finish = finish + 1; //+1 because the last ; can not be included 
		tweet = tweet.substring(finish);
		
		start = tweet.indexOf("#");
		start = start + 5; //this is to get rid of the information before the actual value
		finish = tweet.indexOf(";");

		location = tweet.substring(start,finish);
		location = location.trim();
		location = location.replace(',','-');

		//Extracting the latitude
		finish = finish + 1; //+1 because the last ; can not be included 
		tweet = tweet.substring(finish);

		start = tweet.indexOf("#");
		start = start + 5; //this is to get rid of the information before the actual value
		finish = tweet.indexOf(";");

		latitude = tweet.substring(start,finish);
		latitude = latitude.trim();

		// Extracting the longitude
		finish = finish + 1; //+1 because the last ; can not be included 
		tweet = tweet.substring(finish);

		start = tweet.indexOf("#");
		start = start + 5; //this is to get rid of the information before the actual value
		finish = tweet.indexOf(";");

		longitude = tweet.substring(start,finish);
		longitude = longitude.trim();
	
		System.out.println("Type: \t \t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		
		keyboard.close();
	}

}
