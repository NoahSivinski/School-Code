/*
 * ParseTheTweet.java
 * Author:  Jordan Arogeti
 * Submission Date: 2/9/21
 *
 * Purpose: The purpose of this code is to read a tweet and pick out the important
 * information and place it in the corresponding location. It uses user input and
 * then sorts through the information by recognizing that the information begins after
 * a hashtag and ends with a semicolon. 
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
		
		
		// Importing Scanner, Prompting User, and Declaring Variables
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		String typ;
		String det;
		String loc;
		String lat;
		String lng;
		int start;
		int end;
		
		//Type
		
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 4;
		typ = tweet.substring(start, end);
		typ = typ.trim();
		System.out.println("Type: \t \t" + typ.toUpperCase());
		tweet = tweet.substring(end + 1, tweet.length());

		
		//Detail
		
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 4;		
		det = tweet.substring(start, end);
		det = det.trim();		
		System.out.println("Detail: \t" + det.replace(',','-'));
		tweet = tweet.substring(end + 1, tweet.length());
		
		
		//Location
		
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 4;		
		loc = tweet.substring(start, end);
		loc = loc.trim();		
		System.out.println("Location: \t" + loc.replace(',','-'));
		tweet = tweet.substring(end + 1, tweet.length());
		
		
		//Latitude
		
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 4;
		lat = tweet.substring(start, end);
		lat = lat.trim();
		System.out.println("Latitude: \t" + lat);
		tweet = tweet.substring(end + 1, tweet.length());
		
		
		//Longitude
		start = tweet.indexOf("#");
		end = tweet.indexOf(";");
		start = start + 4;
		lng = tweet.substring(start, end);
		lng = lng.trim();
		System.out.println("Longitude: \t" + lng);
		tweet = tweet.substring(end + 1, tweet.length());
		
		keyboard.close();
		
	}
	
}
