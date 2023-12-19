/*
 * ParseTheTweet.java
 * Author:  Joshua Wyatt
 * Submission Date:  2/12/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program takes a tweet inputted by the user and extracts from the tweet
 * the type of tweet, the detail, the location, the latitude and the
 * longitude. These are all extracted using the substring and 
 * indexOf pieces of code. This was all string based programming.
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
	
	public static void main(String[]args) {
		
//		Declaring the variables typ, det, loc, lat, lng.
		
		String typ = "";
		String det = "";
		String loc = "";
		String lat = "";
		String lng = "";
		

		Scanner keyboard = new Scanner(System.in);
		
//		Asking the user for input of a tweet.
		
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
//		the calculation and extraction of variable typ/type of tweet from tweet
		
		int fromIndex = 0;
		int start = tweet.indexOf("#typ", fromIndex);
		start = start+5;
		int finish = tweet.indexOf(";", fromIndex);
		typ = tweet.substring(start, finish);
		
//		converting variable to upper case
		typ = typ.toUpperCase();
		
//		trimming of variable typ.
		typ = typ.trim();
		
//		the calculation and extraction of variable det/details from tweet.
		
		start = tweet.indexOf("#det", fromIndex);
		fromIndex = start;
		start = start+5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		det = tweet.substring(start, finish);
		
//		trimming and replacing of variable det.
		det = det.trim();
		det = det.replace(',','-');
		
//		the calculation and extraction of variable loc/location from tweet.
		
		start = tweet.indexOf("#loc", fromIndex);
		fromIndex = start;
		start = start+5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		loc = tweet.substring(start, finish);
		
//		trimming and replacing of variable loc.
		loc = loc.trim();
		loc = loc.replace(',','-');
		
//		the calculation and extraction of variable lat/latitude from tweet.
		
		start = tweet.indexOf("#lat", fromIndex);
		fromIndex = start;
		start = start+5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		lat = tweet.substring(start, finish);
		
//		trimming of variable lat.
		lat = lat.trim();
		
//		the calculation and extraction of variable lng/longitude from tweet
		
		start = tweet.indexOf("#lng", fromIndex);
		fromIndex = start;
		start = start+5;
		finish = tweet.indexOf(";", fromIndex);
		fromIndex = finish;
		lng = tweet.substring(start, finish);
		
//		trimming of variable lng.
		lng = lng.trim();

//		print out and final showing of tweet separated into their
//		respected line to match the certain part of the tweet.
		
		System.out.println("Type: \t\t" + typ);
		
		System.out.println("Detail: \t" + det);
		
		System.out.println("Location: \t" + loc);
		
		System.out.println("Latitude: \t" + lat);
		
		System.out.println("Longitude: \t" + lng);
		
		
	

		keyboard.close();
		
		
	}
}
