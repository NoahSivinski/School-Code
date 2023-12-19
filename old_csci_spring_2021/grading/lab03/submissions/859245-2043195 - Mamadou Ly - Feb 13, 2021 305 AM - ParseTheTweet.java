/*
 * ParseTheTweet.java
 * Author:  Mamadou Ly
 * Submission Date:  02/12/2021
 *
 * Purpose: To create better mobile version to 
 * respond to hotline by tweeting.
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
	
	public static String type;
	public static String detail;
	public static String location;
	public static String latitude;
	public static String longitude;
	

	public static void main(String[] args) {
		int start;
		int finish;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet:");
		String tweet = keyboard.nextLine();
		
		start = tweet.indexOf("#typ")+5;
		finish = tweet.indexOf(';');
		type = tweet.substring(start, finish);
		type = type.trim();
		type = type.toUpperCase();
		
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#det")+5;
		finish = tweet.indexOf(';');
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		detail = detail.replace(',', '-');
		
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#loc")+5;
		finish = tweet.indexOf(';');
		location = tweet.substring(start, finish);
		location = location.trim();
		location = location.replace(',', '-');

		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#lat")+5;
		finish = tweet.indexOf(';');
		latitude = tweet.substring(start, finish);
		latitude = latitude.trim();

		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#lng")+5;
		finish = tweet.indexOf(';');
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
