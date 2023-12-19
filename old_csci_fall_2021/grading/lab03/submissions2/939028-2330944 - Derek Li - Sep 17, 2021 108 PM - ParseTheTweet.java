/*
 * ParseTheTweet.java
 * Author:  Derek Li
 * Submission Date:  9/16/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? ParseTheTweet prompts the user for a String 
 * variable that encode several descriptors and variables using hashtags. 
 * Then, the program decodes what information the hashtags contains to
 * present the information back to the user in a legible format.
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
		Scanner input = new Scanner(System.in);
		String tweet, type, detail, location, latitude, longitude;
		int semicolonIndex;
		
		System.out.println("Enter a tweet below");
		tweet = input.nextLine();
		
		//consistent parameters and the index of the semicolon separating parameters are used to determine where information begins and ends
		semicolonIndex = tweet.indexOf(";");
		type = tweet.substring(6, semicolonIndex).toUpperCase();
		//tweet is shortened so it begins at the next parameter - parameters will always be in the same order so finding out which is which is unnecessary
		tweet = tweet.substring(semicolonIndex + 7);
		
		//process is repeated
		semicolonIndex = tweet.indexOf(";");
		detail = tweet.substring(0, semicolonIndex);
		detail = detail.replace(',', '-');
		tweet = tweet.substring(semicolonIndex + 7);
		
		semicolonIndex = tweet.indexOf(";");
		location = tweet.substring(0, semicolonIndex);
		location = location.replace(',', '-');
		tweet = tweet.substring(semicolonIndex + 7);
		
		semicolonIndex = tweet.indexOf(";");
		latitude = tweet.substring(0, semicolonIndex);
		tweet = tweet.substring(semicolonIndex + 7);
		
		semicolonIndex = tweet.indexOf(";");
		longitude = tweet.substring(0, semicolonIndex);
		//tweet no longer needs to be shortened
		
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
	}

}
