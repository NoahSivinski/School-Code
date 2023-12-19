/*
 * ParseTheTweet.java
 * Author:  Manav Patel 
 * Submission Date:  9/16/2021
 *
 * Purpose: This program will prompt the user to input a tweet using the Tweak
 * the Tweet (TtT) protocol. It will then parse the tweet for the tags and print
 * out the type, details, location, latitude, and longitude from the TtT. 
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		
		//gets tweet from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a tweet below: ");
		String tweet = scan.nextLine();	

		/*
		code for type
		this chunk of code is generally reused for all tags. It uses the index of the first '#' and ';' it finds to create a substring
		this substring is then set to a string, while the original tweet is cut off from 2 characters after the 'end' of the last 
		*/
		int start = tweet.indexOf('#');
		int end = tweet.indexOf(';');
		start +=5;
		String type = tweet.substring(start, end);
		type = type.toUpperCase();
		System.out.println("Type: " + "\t" +"\t" + type);
		String newTweet = tweet.substring(end+=2);
		//System.out.println(" The truncated Tweet is" + newTweet);
		
		//code for details
		start = newTweet.indexOf('#');
		end = newTweet.indexOf(';');
		start += 5;
		String det = newTweet.substring(start, end);
		det = det.replace(',', '-');
		System.out.println("Detail: " + "\t" + det);
		newTweet =  newTweet.substring(end+=2);
		//System.out.println("the truncated tweet is: " + newTweet);
		
		//code for location
		start = newTweet.indexOf('#');
		end = newTweet.indexOf(';');
		start += 5;
		String loc = newTweet.substring(start, end);
		loc =  loc.replace(',', '-');
		System.out.println("Location " + "\t" + loc);
		newTweet = newTweet.substring(end += 2);

		
		//code for latitude 
		start = newTweet.indexOf('#');
		end = newTweet.indexOf(';');
		start += 5; 
		String lat = newTweet.substring(start, end);
		System.out.println("Latitude: " + "\t" + lat);
		newTweet = newTweet.substring(end += 2);
		 
		//code for longitude
		start = newTweet.indexOf('#');
		end = newTweet.indexOf(';');
		start += 5; 
		String lon = newTweet.substring(start, end);
		System.out.println("Longitude: " + "\t" + lon);
		
	}

}
