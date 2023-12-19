/*
 * [ParseTheTweet].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [9/17/2021]
 *
 * Purpose: This program askes the user to input a tweet. The program
 * will then parse through the tweet separating the tweet into the 
 * type, detail, location, latitude, and longitude. Then the program
 * will print out each part of the tweet making some minor adjustments.
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
		//create Scanner object and prompt user for input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		//declare each part of the tweet and save the index value of # and ; in start and finish
		String typ, det, loc, lat, lng;
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
	
		//save the type part of the tweet in typ then discard
		typ = tweet.substring(start + 5, finish);
		typ = typ.trim();
		tweet = tweet.substring(finish + 2);
		//reset finish value to the index of ; in the new tweet after discarding type
		finish = tweet.indexOf(";");
		System.out.println("Type: " + "\t"+ "\t" + typ.toUpperCase());
		
		//save the detail part of the tweet as det then discard and replacing the commas with dashes
		det = tweet.substring(start + 4, finish);
		det = det.trim();
		tweet = tweet.substring(finish + 2);
		finish = tweet.indexOf(";");
		System.out.println("Detail: "+ "\t" + det.replace(',', '-'));
		
		//save the location part of the tweet as loc then discard and again replacing the commas with dashes 
		loc = tweet.substring(start + 4, finish);
		loc = loc.trim();
		tweet = tweet.substring(finish + 2);
		finish = tweet.indexOf(";");
		System.out.println("Location: " + "\t"+ loc.replace(',', '-'));
		
		//save the latitude part of the tweet as lat then discard
		lat = tweet.substring(start + 4, finish);
		lat= lat.trim();
		tweet = tweet.substring(finish + 2);
		finish = tweet.indexOf(";");
		System.out.println("Latitude: " + "\t" + lat); 
		
		//save the longitude part of the tweet as lng
		lng = tweet.substring(start + 4, finish);
		lng = lng.trim();
		System.out.println("Longitude: " + "\t" + lng); 

		keyboard.close();
		
	}

}
