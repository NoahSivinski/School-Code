/*
 * CSCI1301 27827
 * ParseTheTweet.java
 * Author:  Casey Wesolowski 
 * Submission Date:  February 11th, 2021
 *
 * Purpose:  To sort through hashtags in tweets to find useful and
 * necessary disaster information. Ordinary citizens can tweet about
 * a natural or manmade disasters so that both emergency management 
 * and the public can act accordingly.
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
		System.out.println("Enter a tweet below "); //Don't forget to enter the tweet with quotation marks included
		Scanner keyboard = new Scanner(System.in);
		String tweet = keyboard.nextLine(); //Just one Scanner and corresponding String necessary

		
		int start = tweet.indexOf("#");//Effective 0
		int finish = tweet.indexOf(";");
		String type = tweet.substring(start + 4,finish);//+ 4 to start without spaces
		
		type = type.toUpperCase(); //For all caps
		String typeTrimmed = type.trim();//to remove extra spaces
		System.out.println("Type: \t\t" + typeTrimmed);
		
		tweet = tweet.substring(finish + 2);//to remove extra spaces again
	
		//Don't forget to change String names
		start = tweet.indexOf("#"); //Now we copy!!
		finish = tweet.indexOf(";");//I like this part
		String detail = tweet.substring(start + 4,finish);
		
		detail = detail.toLowerCase();
		detail = detail.replace(',','-');
		String detailTrimmed = detail.trim();
		System.out.println("Detail: \t" + detailTrimmed);
		
		tweet = tweet.substring(finish + 2);	
		
		//Copy!!
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		String location = tweet.substring(start + 4,finish);
		
		location = location.toLowerCase();
		location = location.replace(',','-');
		String locationTrimmed = location.trim();
		System.out.println("Location: \t" + locationTrimmed);
		
		tweet = tweet.substring(finish + 2);
	
		//Copy!!
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		String latitude = tweet.substring(start + 4,finish);
		
		latitude = latitude.toLowerCase();
		String latitudeTrimmed = latitude.trim();
		System.out.println("Latitude: \t" + latitudeTrimmed);
		
		tweet = tweet.substring(finish + 2);
		
		//Copy!!
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		String longitude = tweet.substring(start + 4,finish);
		
		longitude = longitude.toLowerCase();
		String longitudeTrimmed = longitude.trim();
		System.out.println("Longitude: \t" + longitudeTrimmed);
		
		tweet = tweet.substring(finish + 1);
		
		
		keyboard.close(); //Close the keyboard
	}

}
