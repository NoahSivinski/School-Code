/*
 * ParseTheTweet.java
 * Author:  Reid Cogswell 
 * Submission Date:  2/10/2021
 *
 * Purpose: This code uses string methods in order to find variables 
 * by creating a starting point and an ending point to find the 'value' 
 * between each start and end point. Then do that for each point in the string. 
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
		
		final String typ = "#typ";
		
		final String det = "#det";
		
		final String loc = "#loc";
		
		final String lat = "#lat";
		
		final String lng = "#lng";
		
		int start;
		
		int finish; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a tweet below");
		
		String tweet = keyboard.nextLine();
		
		keyboard.close();
		
		start = tweet.indexOf(typ) + 4;
		
		finish = tweet.indexOf("; #det");
		
		String type = tweet.substring(start, finish);
		
		type.trim();
		
		start = tweet.indexOf(det) + 4;
		
		finish = tweet.indexOf("; #loc");
		
		String detail = tweet.substring(start, finish);
		
		detail.trim();
		
		start = tweet.indexOf(loc) + 4;
		
		finish = tweet.indexOf("; #lat");
		
		String location = tweet.substring(start, finish);
		
		location.trim();	
		
		start = tweet.indexOf(lat) + 4;
		
		finish = tweet.indexOf("; #lng");
		
		String latitude = tweet.substring(start, finish);
		
		latitude.trim();
		
		keyboard = new Scanner(latitude);
		
		double latValue = keyboard.nextDouble();
		
		keyboard.close();
		
		start = tweet.indexOf(lng) + 4;
		
		finish = tweet.indexOf(";\"");
		
		String longitude = tweet.substring(start, finish);
		
		longitude.trim();
		
		keyboard = new Scanner(longitude);
		
		double lngValue = keyboard.nextDouble();
		
		keyboard.close();
				
		System.out.println("Type: \t\t" + type.toUpperCase());
		
		System.out.println("Detail:\t\t" + detail.replace(',', '-'));
		
		System.out.println("Location:\t" + location.replace(',', '-'));
		
		System.out.println("Latitude:\t " + latValue);
		
		System.out.println("Longitude:\t " + lngValue);
		
		

	}

}
