/*
 * ParseTheTweet.java
 * Author:  Joon Hugh 
 * Submission Date:  9/16/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program takes a tweet and distinguishes between start and 
 * finish points to create substrings and then neatly organizes
 * them into different categories. 
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

//importing Scanner
import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);


		// prompts user to enter a tweet
		System.out.println("Enter a tweet below ");
		// waits on user to enter a tweet
		String tweet = keyboard.nextLine();


		// declaring variables
		String type, detail, location, latitude, longitude, tweetWithoutCommas, UpperCaseType;


		// replaces all the ',' with '-' 
		tweetWithoutCommas = tweet.replace(",", "-");

		

		// declaring start and finish
		int start, finish;
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");



		// takes substring of first 4 characters right of start
		// to the first semicolon it reaches
		type = tweetWithoutCommas.substring(start+4, finish);
		// trims and unnecessary leading or ending white spaces
		type = type.trim();


		//Capitalizes the whole type
		UpperCaseType = type.toUpperCase(); 


		// tells tweetWithoutCommas to store everything to the 
		// right of the semicolon
		tweetWithoutCommas = tweetWithoutCommas.substring(finish+1);      


		// reassigns finish so it detects the next semicolon
		// and finishes in the correct spot
		finish = tweetWithoutCommas.indexOf(";"); 
		// again, takes substring of first 4 characters right of start
		// to the first semicolon it reaches
		detail = tweetWithoutCommas.substring(start+4, finish); 
		// again, trims and unnecessary leading or ending white spaces
		detail = detail.trim();


		// again, tells tweetWithoutCommas to store everything to the 
		// right of the semicolon
		tweetWithoutCommas = tweetWithoutCommas.substring(finish+1); 


		// reassigns finish so it detects the next semicolon
		// and finishes in the correct spot
		finish = tweetWithoutCommas.indexOf(";");
		// again, takes substring of first 4 characters right of start
		// to the first semicolon it reaches
		location = tweetWithoutCommas.substring(start+4, finish);
		// again, trims and unnecessary leading or ending white spaces
		location = location.trim();

		
		// again, tells tweetWithoutCommas to store everything to the 
		// right of the semicolon
		tweetWithoutCommas = tweetWithoutCommas.substring(finish+1);

		
		// reassigns finish so it detects the next semicolon
		// and finishes in the correct spot
		finish = tweetWithoutCommas.indexOf(";");
		// again, takes substring of first 4 characters right of start
		// to the first semicolon it reaches
		latitude = tweetWithoutCommas.substring(start+4, finish);
		// again, trims and unnecessary leading or ending white spaces
		latitude = latitude.trim();

		
		// again, tells tweetWithoutCommas to store everything to the 
		// right of the semicolon
		tweetWithoutCommas = tweetWithoutCommas.substring(finish+1);

		
		// reassigns finish so it detects the next semicolon
		// and finishes in the correct spot
		finish = tweetWithoutCommas.indexOf(";");
		// again, takes substring of first 4 characters right of start
		// to the first semicolon it reaches
		longitude = tweetWithoutCommas.substring(start+4, finish);
		// again, trims and unnecessary leading or ending white spaces
		longitude = longitude.trim();




		// prints out the output for the program
		System.out.println("Type:\t\t" + UpperCaseType);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);


	}

}