/*
 * ParseTheTweet.java
 * Author:  Jaren Spitters 
 * Submission Date:  02/12/2020
 *
 * Purpose: This program asks the user for a TtT and parses it, outputting the type of tweet, details of the tweet, location of origin of 
 * the tweet, and coordinates of the origin of the tweet.
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
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter a tweet below.");
		
		String tweet = keyboard.nextLine();
		
		int typeStart = tweet.indexOf("#typ");
		int typeFinish = tweet.indexOf(";", tweet.indexOf("#typ"));
			
			String type = tweet.substring(typeStart + 5, typeFinish).trim(); 
		
		int detailStart = tweet.indexOf("#det");
		int detailFinish = tweet.indexOf(";", tweet.indexOf("#det"));
			
			String detail = tweet.substring(detailStart + 5, detailFinish).trim();
		
		int locationStart = tweet.indexOf("#loc");
		int locationFinish = tweet.indexOf(";", tweet.indexOf("#loc"));
			
			String location = tweet.substring(locationStart + 5, locationFinish).trim();
		
		int latitudeStart = tweet.indexOf("#lat");
		int latitudeFinish = tweet.indexOf(";", tweet.indexOf("#lat"));
			
			String latitude = tweet.substring(latitudeStart + 5, latitudeFinish).trim();		
		
		int longitudeStart = tweet.indexOf("#lng");
		int longitudeFinish = tweet.indexOf(";", tweet.indexOf("#lng"));
			
			String longitude = tweet.substring(longitudeStart + 5, longitudeFinish).trim();
		
		System.out.println("Type:" + "\t" + "\t" + type.toUpperCase());
		System.out.println("Detail:" + "\t" + "\t" + detail.replace(",","-"));
		System.out.println("Location:" + "\t" + location.replace(",", "-"));
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		
		keyboard.close();

	}

}
