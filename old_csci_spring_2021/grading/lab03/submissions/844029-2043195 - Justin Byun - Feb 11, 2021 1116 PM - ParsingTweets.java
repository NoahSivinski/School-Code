/*
 * ParseTheTweet.java
 * Author: Justin Byun
 * Submission Date:  February 12th, 2021
 *
 * Purpose: The program analyzes the tweet and finds the type
 * detail, location, latitude, and longitude of the tweet
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

public class ParsingTweets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = sc.nextLine();
		String type;
		String loc;
		String det;
		String lat;
		String lon;
		
		int start = tweet.indexOf("#") + 4;
		int finish = tweet.indexOf(";");
		
		type = tweet.substring(start, finish).trim().toUpperCase();
		tweet = tweet.substring(finish + 1).trim();
		start = tweet.indexOf("#") + 4;
		finish = tweet.indexOf(";");
		det = tweet.substring(start, finish).trim().replace(",", "-");
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#") + 4;
		finish = tweet.indexOf(";");
		loc = tweet.substring(start, finish).trim().replace(",", "-");
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#") + 4;
		finish = tweet.indexOf(";");
		lat = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#") + 4;;
		finish = tweet.indexOf(";");
		lon = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#") + 4;
		finish = tweet.indexOf(";");
		
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + det);
		System.out.println("Location:\t" + loc);
		System.out.println("Latitude:\t" + lat);
		System.out.println("Longitude:\t" + lon);
	
		
		
		
		
		
	}

	
	
}
