/*
 * ParseTheTweet.java
 * Author:  Hannah Kwak 
 * Submission Date:  September 16, 2021
 *
 * Purpose: This program takes a tweet that was put from the 
 * user and organizes them based off their hashtags and outputs 
 * them neatly into different categories; 
 * #type, #detail, #location, #latitude, and #longitude. 
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

		int start;
		int finish;
		String tweet;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();

		//starting at #typ and ending at the semicolon, we store the value of type.
		//uppercase the string type. 
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 5, finish).toUpperCase().trim();

		//create a substring to better distinguish (update) our start and finish.
		//start at #det and end at the semicolon, store the value of detail
		//replaced all of the commas with hyphens. 
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5, finish).replace(',','-').trim();

		//created a new substring to update our start and finish 
		//start at #loc and end at the semicolon, store the value of location 
		//replaced all of the commas with hyphens 
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5, finish).replace(',','-').trim();

		//created a new substring to update our start and finish 
		//start at #lat and end at the semicolon, store the value of latitude
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5, finish).trim();

		//created a new substring to update our start and finish
		//start at #lng and end at the semicolon, store the value of longitude
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5, finish).trim();

		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude\t" + longitude);

		keyboard.close(); 













	}


}
