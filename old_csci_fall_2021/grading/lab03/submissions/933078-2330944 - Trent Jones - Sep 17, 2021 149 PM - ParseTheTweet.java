/*
 * ParseTheTweet.java
 * Author:  Trent Jones
 * Submission Date:  17 September 2021
 *
 * Purpose: This program is designed to sift through the Tweet input by the user
 * and scan the Tweet to find useful information about disasters through the use 
 * of a streamline Tweet structure manually followed by the user. This would make 
 * it possible for people to find the essential information about a disaster or 
 * situation as it happens to gain an understanding of what is going in.
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
		String tweet = keyboard.nextLine();
		
		int start, finish;
		String type, detail, location, latitude, longitude;
	
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.substring(4,type.length()).trim().toUpperCase();
		tweet = tweet.substring(finish +2);
		System.out.println("Type: \t\t" + type);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start+4, finish).trim().replace("," , "-");
		tweet = tweet.substring(finish +2);
		System.out.println("Detail: \t" + detail);
		
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location = location.substring(4, location.length()).trim().replace(",", "-");
		tweet = tweet.substring(finish +2);
		System.out.println("Location: \t" + location);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start+4, finish).trim();
		tweet = tweet.substring(finish +2);
		System.out.println("Latitude: \t" + latitude);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start+4, finish).trim();
		tweet = "";
		System.out.println("Longitude: \t" + longitude);
		keyboard.close();
	}
	}