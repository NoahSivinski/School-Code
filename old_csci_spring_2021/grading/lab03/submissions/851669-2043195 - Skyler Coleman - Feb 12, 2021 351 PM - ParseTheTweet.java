/*
 * [CSCI1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [02/12/2021]
 *
 * Purpose: Program to pull out information from a tweet, 
 * manipulate the information, and print it out onto the screen.
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
/**
 * @author sky.cole768
 *
 */
public class ParseTheTweet {	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		String originalTweet = tweet; // Storing value of original tweet.
		
		String type; // It indicates meaning of the tweet.
		String detail; // Additional information of the tweet.
		String location; // Location from the tweet.
		String latitude; // Latitude from the tweet.
		String longitude; //longitude from the tweet.
		
		char start; //Where the substring starts.
		char finish; //Where the substring ends.
		start = '#'; 
		finish = ';';	
		
		type = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); // It extracts the information from substring of the tweet and displays type.
		type = type.trim(); 
		tweet = tweet.replaceFirst("#[^#]*;", ""); 
		detail = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); // It extracts the information from substring of the tweet and displays detail.
		tweet = tweet.replaceFirst("#[^#]*;", ""); 
		detail = detail.trim();
		detail = detail.replace(',', '-'); // It changes all commas in the detail substring to hyphens. 
		location = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); // It extracts the information from substring of the tweet and displays location.
		location = location.trim();
		location = location.replace(',', '-'); // It changes all commas in location substring to hyphens. 
		tweet = tweet.replaceFirst("#[^#]*;", "");
		latitude = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); // It extracts the information from substring of the tweet and displays latitude.
		latitude = latitude.trim();
		tweet = tweet.replaceFirst("#[^#]*;", "");
		longitude = tweet.substring(tweet.indexOf(start) + 4,tweet.indexOf(finish)); // It extracts the information from substring of the tweet and displays longitude.
		longitude = longitude.trim();
		
		System.out.println("Type:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
	
		keyboard.close();
	}

}
