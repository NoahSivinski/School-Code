/*
 * ParseTheTweet.java

 * Author:  Deborah Orekoya 
 * Submission Date:  02-12-2021
 *
 * Purpose: 
 * 
 * The purpose of my program is to use methods of String class to 
 * process messages similar to TtT tweets. The program is also
 * designed to use the substring and other method to pull out 
 * information from the text, manipulate it, and print it out to 
 * the screen.
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
		System.out.printf("Enter a tweet below\n");
		String tweet = keyboard.nextLine();
	
		//declare variable
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		//type
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		type = tweet.substring(start + 5, finish);
		type = type.trim();
		type = type.toUpperCase();
		
		//detail
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5, finish);
		detail = detail.trim();
		detail = detail.replace(",", "-");
		
		//location
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5, finish);
		location = location.trim();
		location = location.replace(",", "-");
		
		//latitude
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5, finish);
		latitude = latitude.trim();
		latitude = latitude.replace(",", "-");
		
		//longitude
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5, finish);
		longitude = longitude.trim();
		longitude = longitude.replace(",", "-");
		
		//print value
		System.out.println("type:\t\t" + type);
		System.out.println("detail:\t\t" + detail);
		System.out.println("location:\t" + location);
		System.out.println("latitude:\t" + latitude);
		System.out.println("longitude:\t" + longitude);
		
		
		keyboard.close();	
	}

}
