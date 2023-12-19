/*
 * ParseTheTweet.java
 * Author:  Justin Hesse 
 * Submission Date:  2/12/21
 *
 * Purpose: Reads in a tweet from the user and uses 
 * various string methods to extract information from different
 * parts of the tweet.
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
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Enter a tweet below"); //Block reads in a string from the user
		String tweet = scan.nextLine();
		System.out.println();
		
		int start = tweet.indexOf("#typ"); 
		int finish = tweet.indexOf(";");
		
		String type = tweet.substring(start + 5, finish);		//Each block extracts the value from a part of the original tweet and assigns the substring to the appropriate String variable
		type = type.trim();										
		type = type.toUpperCase();
		tweet = tweet.substring(finish + 2);					
		
		
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		String details = tweet.substring(start + 5, finish);
		details = details.trim();
		details = details.replace(',', '-');
		tweet = tweet.substring(finish + 2);
		
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		String location = tweet.substring(start + 5, finish);
		location = location.trim();
		location = location.replace(',', '-');
		tweet = tweet.substring(finish + 2);
		
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		String latitude = tweet.substring(start + 5, finish);
		latitude = latitude.trim();
		tweet = tweet.substring(finish + 2);
		
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		String longitude = tweet.substring(start + 5, finish);
		longitude = longitude.trim();
		
		
		System.out.println("Type:" + '\t' + '\t' +type);       //Prints formatted output with the extracted information from the tweet
		System.out.println("Detail:" + '\t' + '\t' + details);
		System.out.println("Location:" + '\t' + location);
		System.out.println("Latitude:" + '\t' + latitude);
		System.out.println("Longitude:" + '\t' + longitude);
		
		
		scan.close();

	}

}
