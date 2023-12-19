/*
 * ParseTheTweet.java
 * Author:  Kaushalkumar A. Patel 
 * Submission Date:  02-11-21
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * The program will use methods of the String class to process messages 
 * similar to "TtT" tweets. The program will use the substring and other 
 * methods to pull out information from the text (tweet), manipulate it, 
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
		
		//Instance of new scanner.
		Scanner keyboard = new Scanner (System.in);
		
		//The user will be prompted to enter a tweet.
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		keyboard.close();
		
		//Parsing the information in the tweet that was entered.
		String thisType = "#typ";
		String thisDetail = "#det";
		String thisLocation = "#loc";
		String thisLatitude = "#lat";
		String thisLongitude = "#lng";
		
		//Start and Finish to hold the indices.
		int theStart;
		int theFinish;
		
		//Indicate the type.
		theStart = tweet.indexOf(thisType) + 4;
		theFinish = tweet.indexOf("; #det");
		String typ = tweet.substring(theStart, theFinish);
		typ.trim();
		
		//Indicate the detail.
		theStart = tweet.indexOf(thisDetail) + 4;
		theFinish = tweet.indexOf("; #loc");
		String det = tweet.substring(theStart, theFinish);
		det.trim();
		
		//Indicate the location.
		theStart = tweet.indexOf(thisLocation) + 4;
		theFinish = tweet.indexOf("; #lat");
		String loc = tweet.substring(theStart, theFinish);
		loc.trim();
		
		//Indicate the latitude with a double floating point and user entry.
		theStart = tweet.indexOf(thisLatitude) + 4;
		theFinish = tweet.indexOf("; #lng");
		String lat = tweet.substring(theStart, theFinish);
		lat.trim();
		keyboard = new Scanner(lat);
		double latValue = keyboard.nextDouble();
		keyboard.close();
		
		//Indicate the longitude with a double floating point and user entry.
		theStart = tweet.indexOf(thisLongitude) + 4;
		theFinish = tweet.indexOf(";\"");
		String lng = tweet.substring(theStart, theFinish);
		lng.trim();
		keyboard = new Scanner(lng);
		double lngValue = keyboard.nextDouble();
		keyboard.close();
		
		//Proper Outputs
		System.out.println("Type:\t\t" + typ.toUpperCase());
		System.out.println("Detail:\t\t" + det);
		System.out.println("Location:\t" + loc);
		System.out.println("Latitude:\t " + latValue);
		System.out.println("Longitude:\t " + lngValue);
		keyboard.close();

	}

}
