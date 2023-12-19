/*
 * ParseTheTweet.java
 * Author: [Darren Thammavong]
 * Submission Date: [Friday, September 17, 2021 at 5:00 PM]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The program will take the user's input (or tweet), and the
 * tweet contains information specified by the hashtags - which
 * includes type, location, detail, latitude, and longitude. The
 * program will output the type, location, detail, latitude, and
 * longitude in an organized fashion.
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

		// Creating a Scanner object
		Scanner keyboard = new Scanner(System.in);

		// This allows the user to input a tweet as
		// a single line of text.
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();

		// These are the integer variables that will hold the indices 
		// of where each substring starts and finishes.
		int start, finish;

		// These lines of codes hold the user's value between #typ
		// and the semicolon. This also uppercases the substring.
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(';');
		String type = tweet.substring(start + 5, finish).toUpperCase().trim();
		
		/*
		 * These lines of code start at #det and remove the rest of the
		 * information before it, and it holds the user's value between #det
		 * and the semicolon. This also replaces any commas with hyphens.
		 */
		tweet = tweet.substring(finish + 2).trim();
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(';');
		String detail = tweet.substring(start + 5, finish).replace(',', '-').trim();

		/*
		 * These lines of code start at #loc and remove the rest of the
		 * information before it, and it holds the user's value between #loc
		 * and the semicolon. This also replaces any commas with hyphens. 
		 */
		tweet = tweet.substring(finish + 2).trim();
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(';');
		String location = tweet.substring(start + 5, finish).replace(',', '-').trim();

		/*
		 * These lines of code start at #lat and remove the rest of the
		 * information before it, and it holds the user's value between #lat
		 * and the semicolon.
		 */
		tweet = tweet.substring(finish + 2).trim();
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(';');
		String latitude = tweet.substring(start + 5, finish).trim();

		/*
		 * These lines of code start at #lng and remove the rest of the
		 * information before it, and it holds the user's value between #lng
		 * and the semicolon.
		 */
		tweet = tweet.substring(finish + 2).trim();
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(';');
		String longitude = tweet.substring(start + 5, finish).trim();

		// These lines of code print out the type, detail, location, latitude
		// and longitude in an orderly fashion.
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

		keyboard.close();

	}

}
