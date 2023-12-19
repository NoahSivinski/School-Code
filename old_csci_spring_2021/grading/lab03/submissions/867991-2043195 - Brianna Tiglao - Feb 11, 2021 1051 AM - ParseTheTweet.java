/*
 * ParseTheTweet.java
 * Author:  Brianna Tiglao 
 * Submission Date:  February 11, 2021
 *
 * Purpose: This program takes a tweet that utilizes the appropriate hashtags (#typ, #det, #loc, etc.)
 * and breaks them down into their respective labels within the output.
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
		System.out.println("Enter a tweet below");
		Scanner input = new Scanner(System.in);
		String tweet = input.nextLine(); 
		
		input.close();
		
		int typeStart = tweet.indexOf("#typ"); 
		int typeEnd = tweet.indexOf(";");
		String type = tweet.substring(typeStart + 5, typeEnd);//I used "+ 5" since the information starts at index 5
		String typeTrim = type.trim();
		String typeOutput = typeTrim.toUpperCase();
		
		tweet = tweet.substring(typeEnd + 1);//Since each section ends with a ";" and a space, I did "+ 1" since that is the start position I wanted
		int detailStart = tweet.indexOf("#det"); 
		int detailEnd = tweet.indexOf(";");
		String detail = tweet.substring(detailStart + 5, detailEnd);
		String detailTrim = detail.trim();
		String detailOutput = detailTrim.replace(',', '-');
		
		tweet = tweet.substring(detailEnd + 1);
		int locationStart = tweet.indexOf("#loc"); 
		int locationEnd = tweet.indexOf(";");
		String location = tweet.substring(locationStart + 5, locationEnd);
		String locationTrim = location.trim();
		String locationOutput = locationTrim.replace(',', '-');
		
		tweet = tweet.substring(locationEnd + 1);
		int latitudeStart = tweet.indexOf("#lat"); 
		int latitudeEnd = tweet.indexOf(";");
		String latitude = tweet.substring(latitudeStart + 5, latitudeEnd);
		String latitudeTrim = latitude.trim();
		
		tweet = tweet.substring(latitudeEnd + 1);
		int longitudeStart = tweet.indexOf("#lng"); 
		int longitudeEnd = tweet.indexOf(";");
		String longitude = tweet.substring(longitudeStart + 5, longitudeEnd);
		String longitudeTrim = longitude.trim();
		
		System.out.println("Type:\t\t" + typeOutput);
		System.out.println("Detail:\t\t" + detailOutput);
		System.out.println("Location:\t" + locationOutput);
		System.out.println("Latitude:\t" + latitudeTrim);
		System.out.println("Longitude:\t" + longitudeTrim);
	}

}
