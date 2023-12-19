/*
 * [ParseTheTweet].java
 * Author:  [Anchal Patel] 
 * Submission Date:  [Feburary 12, 2021]
 *
 * Purpose: The purpose of my program is to sift through tweets 
 * for useful information. The program will parse the information
 * in the tweet into five different types of information specified by 
 * the hashtags.
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
public class ParseTheTweet
{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Tweet Below:");
		String tweet = keyboard.nextLine();

		String type, location, detail, latitude, longitude;
		

		int start = tweet.indexOf("#");
		int end = tweet.indexOf(";");
		start = start + 5;


		type = tweet.substring(start, end);
		type = type.trim();
		type = type.toUpperCase();
		System.out.println("Type:\t\t" + type);


		tweet = tweet.substring(end+1);
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 5;
		detail = tweet.substring(start, end);
		detail = detail.trim();
		detail = detail.replace(",", "-");
		System.out.println("Detail:\t\t" + detail);


		tweet = tweet.substring(end+1);
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 5;
		location = tweet.substring(start, end);
		location = location.trim();
		location = location.replace("," , "-");
		System.out.println("Location:\t" + location);


		tweet = tweet.substring(end+1);
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 5;
		latitude = tweet.substring(start, end);
		latitude = latitude.trim();
		System.out.println("Latitude:\t" + latitude);

		tweet = tweet.substring(end+1);
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 5;
		longitude = tweet.substring(start, end);
		longitude = longitude.trim();
		System.out.println("Longitude:\t" + longitude);


		keyboard.close();





	}

}
