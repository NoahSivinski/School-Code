/*
 * ParseTheTweet.java
 * Author:  Sunny Shah 
 * Submission Date:  02/12/2021
 *
 * Purpose: This program uses methods of the String class to
 * process messages similar TtT tweets. Substring and other methods
 * are also used to pull out information from the text, manipulate it, 
 * and print it out to the screen.
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
		
		String tweet;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();
		
		/*
		Variable start and variable finish hold the indices 
		of where the type substring starts and finishes.
		*/
		int start = tweet.indexOf("#typ");
		int finish = tweet.indexOf(";");
		
		System.out.print("Type:\t\t");
		type = tweet.substring(5, finish);
		type = type.toUpperCase();
		System.out.println(type.trim());
		
		/*
		Variable startDet and variable finishDet hold the indices 
		of where the detail substring starts and finishes.
		*/
		int startDet = tweet.indexOf("#det");
		int finishDet = tweet.indexOf(";", finish + 1);
		
		System.out.print("Detail:\t\t");
		detail = tweet.substring(startDet + 5, finishDet);
		detail = detail.replace(',', '-');
		System.out.println(detail.trim());
		
		/*
		Variable startLoc and variable finishLoc hold the indices 
		of where the location substring starts and finishes.
		*/
		int startLoc = tweet.indexOf("#loc");
		int finishLoc = tweet.indexOf(";", finishDet + 1);
		
		System.out.print("Location:\t");
		location = tweet.substring(startLoc + 5, finishLoc);
		location = location.replace(',', '-');
		System.out.println(location.trim());
		
		/*
		Variable startLat and variable finishLat hold the indices 
		of where the latitude substring starts and finishes.
		*/
		int startLat = tweet.indexOf("#lat");
		int finishLat = tweet.indexOf(";", finishLoc + 1);
		
		System.out.print("Latitude:\t");
		latitude = tweet.substring(startLat + 5, finishLat);
		System.out.println(latitude.trim());
		
		/*
		Variable startLng and variable finishLng hold the indices 
		of where the longitude substring starts and finishes.
		*/
		int startLng = tweet.indexOf("#lng");
		int finishLng = tweet.indexOf(";", finishLat + 1);
		
		System.out.print("Longitude:\t");
		longitude = tweet.substring(startLng + 5, finishLng);
		System.out.println(longitude.trim());
		
		keyboard.close();

	}

}
