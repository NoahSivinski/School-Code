/*
 * [CSCI 1301 Section 27832].java

 * Author:  [Kathy Ho] 
 * Submission Date:  [02/12/2021]
 *
 * Purpose: The program allows the user to enter a tweet into the console where it splits it into 
 * different indexes based by the hashtags by capitalizing the content of #typ as well as removing extra spaces
 * and changes commas into hyphens for #det and #loc for easier reading.
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
	
		Scanner keyboard = new Scanner( System.in);
		
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine ();
		
		String type,location,detail,latitude,longitude;
		
		//declares 2 variables of hashtag(start) and semicolon(finish) to indexes
		int hashtag = tweet.indexOf("#");
		int semicolon = tweet.indexOf(";");
		
		//returns a new substring that begins at index hashtag and ends at index semicolon, also returns string as all uppercase 
		type = tweet.substring (hashtag + 5, semicolon).toUpperCase();
		String typeTrimmed = type.trim();
		
		//updates the string of tweet and semicolon after extracting prior substring
		tweet = tweet.substring(semicolon + 1);
		semicolon = tweet.indexOf(";");
		
		//replaces commas with hyphens 
		detail = tweet.substring (hashtag + 5, semicolon).replace(',','-');
        String detailTrimmed = detail.trim();
		tweet = tweet.substring(semicolon + 1);
		semicolon = tweet.indexOf(";");

		location = tweet.substring (hashtag +5 , semicolon).replace(',','-');
		String locationTrimmed = location.trim();
    	tweet = tweet.substring(semicolon + 1);
		semicolon = tweet.indexOf(";");

		latitude = tweet.substring (hashtag + 5, semicolon);
		String latitudeTrimmed = latitude.trim();
		tweet = tweet.substring(semicolon + 1);
		semicolon = tweet.indexOf(";");

		longitude = tweet.substring (hashtag + 5, semicolon);
		String longitudeTrimmed = longitude.trim();

		System.out.println("Type: \t\t\t" + typeTrimmed);
		System.out.println("Detail: \t\t" + detailTrimmed);
		System.out.println("Location: \t\t" + locationTrimmed);
		System.out.println("Latitude: \t\t" + latitudeTrimmed);
		System.out.println("Longitude: \t\t" + longitudeTrimmed);

	}

}
