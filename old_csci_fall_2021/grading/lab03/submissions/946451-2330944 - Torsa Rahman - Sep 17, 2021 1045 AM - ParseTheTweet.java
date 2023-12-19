/*
 * [ParseTheTweet].java
 * Author:  [Torsa Rahman] 
 * Submission Date:  [09-16-2021]
 *
 * Purpose: This program uses user input to to process messages about
 * disasters and output  timely and location specific information about 
 * these events to keep the public informed. 
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
 */

import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {
		
		//declaring string class variables 
		String type, detail, location, latitude, longitude, tweet, partOfTweet;
		
		//getting input from user for tweet 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();

		//declaring variables start and finish to hold 
		//indices of where each substring starts and finishes
		int start = 5;
		int finish = tweet.indexOf(";");
		
		//splitting up parsing the information in the tweet
		//into five different types of information specified 
		//by the hashtags type,location,detail,latitude, and longitude 
		partOfTweet = tweet.substring(start, finish);
		type = partOfTweet;
		type = type.toUpperCase();//using toUpperCase method to make the variable type all upper case 
		type = type.trim();
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2);//using substring method to extract the substring of the tweet variable starting where the last hashtag finished 

		partOfTweet = tweet.substring(5,tweet.indexOf(";"));
		detail = partOfTweet;
		detail = detail.replace(",", "-");//using replace method to make sure detail and location values do not have commas
		detail = detail.trim();//using trim to remove white spaces
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2);
		
		partOfTweet = tweet.substring(5,tweet.indexOf(";"));
		location = partOfTweet;
		location = location.replace(",", "-");
		location = location.trim();
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2);
		
		partOfTweet = tweet.substring(5,tweet.indexOf(";"));
		latitude = partOfTweet;
		latitude = latitude.trim();
		
		tweet = tweet.substring(tweet.indexOf(";")+ 2);
		
		partOfTweet = tweet.substring(5,tweet.indexOf(";"));
		longitude = partOfTweet;
		longitude = longitude.trim();
		
		//printing and formatting outputs 
		System.out.println("Type:" + "\t" + "\t" + type);
		System.out.println("Detail:" +"\t" + "\t" + detail);
		System.out.println("Location:" + "\t" + location);
		System.out.println("Latitude:" + "\t" +  latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		
		keyboard.close();

	}

}
