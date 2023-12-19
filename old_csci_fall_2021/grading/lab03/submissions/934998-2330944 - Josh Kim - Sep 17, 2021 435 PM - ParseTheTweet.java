/*
 * ParseTheTweet.java
 * Author:  Joshua Kim 
 * Submission Date:  09/17/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This program uses methods of the String class to parse the tweet.
 * The user inputs a tweet, and the program prints out categories 
 * such as the type, detail, location, latitude, and longitude.
 * This structure makes it easier for computers to classify the tweet and determine what
 * is exactly going on in a quicker time.
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
		System.out.println("Enter a tweet below");
		String tweet= keyboard.nextLine();

		//Declare Variables
		String type , detail , location , latitude , longitude;

		//Declare Start and Finish
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		start = start + 5;

		//Extract substrings and trim
		type=tweet.substring(start, finish);
		type=type.trim();

		//Detail
		tweet=tweet.substring(finish+1);
		start=tweet.indexOf("#");
		finish=tweet.indexOf(";");
		start=start+5;
		detail=tweet.substring(start, finish);
		detail=detail.trim();

		//Location
		tweet=tweet.substring(finish+1);
		start=tweet.indexOf("#");
		finish=tweet.indexOf(";");
		start=start+5;
		location=tweet.substring(start, finish);
		location=location.trim();

		//Latitude
		tweet=tweet.substring(finish+1);
		start=tweet.indexOf("#");
		finish=tweet.indexOf(";");
		start=start+5;
		latitude=tweet.substring(start, finish);
		latitude=latitude.trim();

		//Longitude
		tweet=tweet.substring(finish+1);
		start=tweet.indexOf("#");
		finish=tweet.indexOf(";");
		start=start+5;
		longitude=tweet.substring(start, finish);
		longitude=longitude.trim();

		//Convert String type to uppercase
		type=type.toUpperCase();

		//Replaces "," to "-"
		detail=detail.replace(',', '-');
		location=location.replace(',', '-');
		
		//Print Values
		System.out.println("Type: \t\t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
	}

}
