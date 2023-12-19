
import java.util.Scanner; 

/*
 * ParseTheTweet.java
 * Author:  Lindsey Lee
 * Submission Date:  02/12/2021
 *
 * Purpose: The purpose of this program is to parse, or split up, 
 * information from a tweet and to categorize said information
 * based on type, details, location, latitude, and longitude. 
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

public class ParseTheTweet {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		keyboard.close();
		
		/* Declare string variables */ 
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		/* Declare substring variables */
		int start, finish;
		
		/* Assign values to substring type */
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 5, finish).trim().toUpperCase();
		
		/* Assign values to substring detail */
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";", finish + 1);
		detail = tweet.substring(start + 5, finish).trim().replace(',', '-');
		
		/* Assign values to substring location */
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";", finish + 1);
		location = tweet.substring(start + 5, finish).trim().replace(',', '-');
		
		/* Assign values to substring latitude */
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";", finish + 1);
		latitude = tweet.substring(start + 5, finish).trim();
		
		/* Assign values to substring longitude */
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";", finish + 1);
		longitude = tweet.substring(start + 5, finish).trim();
		
		System.out.print("Type:\t\t" + type);
		System.out.print("\nDetail:\t\t" + detail);
		System.out.print("\nLocation:\t" + location);
		System.out.print("\nLatitude:\t" + latitude);
		System.out.print("\nLongitude:\t" + longitude);
	}

}
