/*
 * ParseTheTweet.java
 * Author:  Apurva Sharma
 * Submission Date:  9/16/21
 *
 * Purpose: This program sifts through tweets and display the useful/essential information 
 * regarding the emergencies.
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
		Scanner scan = new Scanner(System.in);
		
		//inputing the tweet
		System.out.println("Enter the tweet below");
		String tweet = scan.nextLine();
		
		//initializing variables
		String type;
		String location;
		String detail;
		String latitude;
		String longitude;
		
		//finding and printing the type
		int start = tweet.indexOf("#") + 5;
		int finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		String trimmedType = type.trim();
		System.out.println("Type:\t\t" + trimmedType.toUpperCase());
		
		//discarding the type
		tweet = tweet.substring(finish + 1);
		
		//finding and printing the detail
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.replace(',', '-');
		String trimmedDetail = detail.trim();
        System.out.println("Detail:\t\t" + trimmedDetail);
        
        //discarding the detail
        tweet = tweet.substring(finish + 1);
		
        //finding and printing the location
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location = location.replace(',', '-');
		String trimmedLocation = location.trim();
        System.out.println("Location:\t" + trimmedLocation);
        
        //discarding the location
        tweet = tweet.substring(finish + 1);
		
        //finding and printing the latitude
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start, finish);
		String trimmedLatitude = latitude.trim();
        System.out.println("Latitude:\t" + trimmedLatitude);
        
        //discarding the latitude
        tweet = tweet.substring(finish + 1);
		
        //finding and printing the longitude
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start, finish);
		String trimmedLongitude = longitude.trim();
        System.out.println("Longitude:\t" + trimmedLongitude);
	}

}
