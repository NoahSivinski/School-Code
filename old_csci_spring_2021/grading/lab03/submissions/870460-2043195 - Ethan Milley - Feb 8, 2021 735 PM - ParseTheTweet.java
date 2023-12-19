/*
 * ParseTheTweet.java
 * Author:  Ethan Milley 
 * Submission Date:  February, 8th, 2021
 *
 * Purpose: 
 * 
 * The following code uses tweets structured in TtT (Tweak the Tweet)
 * format to separate and alter a tweet depending on the kind of
 * information provided. It completes this task by using Strings and 
 * substrings. However it is limited to tweets being structured and 
 * ordered in a specific way.   
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
		String tweet; 
		String type, detail, location, latitude, longitude; //substrings
		int start /*start of a substring*/, finish /*end of a substring*/;
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();
		start = tweet.indexOf("#");
		finish= tweet.indexOf(";");
		
		type = tweet.substring(start, finish);
		type = tweet.substring(5, finish);
		type = type.toUpperCase();
		System.out.println("Type:\t\t" + type);
		
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#");
		finish= tweet.indexOf(";");
		
		detail = tweet.substring(start, finish);
		detail = detail.substring(5, finish);
		detail = detail.replace(',', '-');
		System.out.println("Detail:\t\t" + detail);
		
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#");
		finish= tweet.indexOf(";");
		
		location = tweet.substring(start, finish);
		location = location.substring(5, finish);
		location = location.replace(',', '-');
		System.out.println("Location:\t" + location);
		
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#");
		finish= tweet.indexOf(";");
		
		latitude = tweet.substring(start, finish);
		latitude = latitude.substring(5, finish);
		System.out.println("Latitude:\t" + latitude);
		
		tweet = tweet.substring(finish + 2);
		start = tweet.indexOf("#");
		finish= tweet.indexOf(";");
		
		longitude = tweet.substring(start, finish);
		longitude = longitude.substring(5, finish);
		System.out.println("Longitude:\t" + longitude);

	}

}
