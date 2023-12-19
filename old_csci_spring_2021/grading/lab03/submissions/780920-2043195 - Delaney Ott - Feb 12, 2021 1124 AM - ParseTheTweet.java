/*
 * ParseTheTweet.java
 * Author:  Delaney Ott 
 * Submission Date:  February 12th, 2021
 *
 * Purpose: This program is designed to process messages like TtT 
 * tweets. While processing, it will break apart the message and print 
 * out the desired information onto the screen.
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
		
		String tweet;
		String type;
		String location;
		String detail;
		String latitude;
		String longitude;
		int start;
		int finish;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 4, finish);
		type = type.trim();
		System.out.println("Type: \t\t" + type.toUpperCase());
		
		tweet = tweet.substring(finish + 2);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 4, finish);
		detail = detail.trim();
		detail = detail.replace(",", "-");
		System.out.println("Detail: \t" + detail);
		
		tweet = tweet.substring(finish +2);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 4, finish);
		location = location.trim();
		location = location.replace(",", "-");
		System.out.println("Location: \t" + location);
		
		tweet = tweet.substring(finish +2);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 4, finish);
		latitude = latitude.trim();
		System.out.println("Latitude: \t" + latitude);
		
		tweet = tweet.substring(finish +2);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 4, finish);
		longitude = longitude.trim();
		System.out.println("Longitude: \t" + longitude);
		
		keyboard.close();
	}

}
