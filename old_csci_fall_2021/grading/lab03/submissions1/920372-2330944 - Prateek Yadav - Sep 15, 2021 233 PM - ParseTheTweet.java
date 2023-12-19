/*
 * ParseTheTweet.java
 * Author:  Prateek Yadav 
 * Submission Date:  9/15/2021
 * Due Date: 9/17/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program parses tweets, creating specified substrings such 
 * that the tweets can be easily analyzed in times of emergency.
 * The substring, trim, indexOf, toUpperCase and replace methods
 * are used in tandem to format the output.
 *
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
 * 
 * I agree with this statement^
 */



import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		
		//Scanner object creation
		Scanner keyboard = new Scanner(System.in);
		
		
		//Prompting user for tweet, storing tweet
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		
		//Variable declaration
		String type, location, detail, latitude, longitude;
		int start, finish;
		
		
		//Type
		start = tweet.indexOf("#typ");
		start += 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.toUpperCase();
		type = type.trim();
		
		
		
		//Detail
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#det");
		start += 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish);
		detail = detail.replace(',', '-');
		detail = detail.trim();
	
				
		
		//Location
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#loc");
		start += 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location = location.replace(',', '-');
		location = location.trim();
		
		
		
		//Latitude
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#lat");
		start += 5;
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start,finish);
		latitude = latitude.trim();
		
		
		
		//Longitude
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#lng");
		start += 5;
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start,finish);
		longitude = longitude.trim();

		
		
		//Outputs
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		//Closing Scanner Object
		keyboard.close();

	}

}
