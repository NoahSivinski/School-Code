/*
 * ParseTheTweet.java
 * Author:  Anna Kerber
 * Submission Date:  2/10/21
 *
 * Purpose: This program scans in a string with information about
 * a tweet and prints that information back out organized and in
 * a more readable form.
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
		Scanner scanner = new Scanner(System.in);
		String tweet, type, detail, location, latitude, longitude;
		int start, finish;
		
		System.out.println("Enter a tweet below");
		tweet = scanner.nextLine();
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		type = tweet.substring(start+4, finish);
		type = type.trim().toUpperCase();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start+4, finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		location = tweet.substring(start+4, finish);
		location = location.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start+4, finish);
		latitude = latitude.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start+4, finish);
		longitude = longitude.trim();		
		
		System.out.println("Type:\t\t"+type);
		System.out.println("Detail:\t\t"+detail);
		System.out.println("Location:\t"+location);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
		
		scanner.close(); 
	}

}
