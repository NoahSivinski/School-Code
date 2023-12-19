 
/*
 * ParseTheTweet.java
 * Author:  Justin Jackson
 * Submission Date:  2/10/2021
 *
 * Purpose: Reads tweets to find specific information based on hashtags
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
		
		String tweet, typ, det, loc, lat, lng;
		int trimStart, trimEnd;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a Tweet Below");
		tweet = keyboard.nextLine();
	//Gathers tweet
			trimStart = tweet.indexOf("#") + 5;
			trimEnd = tweet.indexOf(";");
		typ = tweet.substring(trimStart, trimEnd);
		typ = typ.trim();
		tweet = tweet.substring(trimEnd + 2);
			trimStart = tweet.indexOf("#") + 5;
			trimEnd = tweet.indexOf(";");
		det = tweet.substring(trimStart, trimEnd);
		det = det.trim();
		tweet = tweet.substring(trimEnd + 2);
				trimStart = tweet.indexOf("#") + 5;
				trimEnd = tweet.indexOf(";");
		loc = tweet.substring(trimStart, trimEnd);
		loc = loc.trim();
		tweet = tweet.substring(trimEnd + 2);
			trimStart = tweet.indexOf("#") + 5;
			trimEnd = tweet.indexOf(";");
		lat = tweet.substring(trimStart, trimEnd);
		lat = lat.trim();
		tweet = tweet.substring(trimEnd + 2);
			trimStart = tweet.indexOf("#") + 5;
			trimEnd = tweet.indexOf(";");
		lng = tweet.substring(trimStart, trimEnd);
		lng = lng.trim();
		
		typ = typ.toUpperCase();
		det = det.replace(",", "-");
		loc = loc.replace(',', '-');
		System.out.println("Type: \t \t" + typ);
		System.out.println("Detail: \t" + det);
		System.out.println("Location: \t" + loc);
		System.out.println("Latitude: \t" + lat);
		System.out.println("Longitude: \t" + lng);
		
	
	
	}
}
