/*
 * [ParseTheTweet].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [February 12, 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *This program is designed to pull out information from a tweet.
 *It determines what to pull out from the tweet by knowing that "#" is where it starts and ";" is where it ends. 
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
		// Scanner 
		System.out.println("Enter a tweet below");
		Scanner s = new Scanner(System.in);
		String tweet = s.nextLine();
		
		String type, detail, location, longitude, latitude;
		int start, finish;
		
		//Parsing information from tweet
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start,finish);
		type.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish);
		detail.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location.trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start,finish);
		latitude.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start,finish);
		longitude.trim();
		tweet = tweet.substring(finish+1);
		
		
		//Make type string upper case
		type = type.toUpperCase();
		//Replace commas to hyphens
		detail = detail.replace(",", "-");
		location = location.replace(",", "-");
				
		//Produce output
		System.out.println("Type: \t\t" + type.toUpperCase());
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		
		s.close();
	
		


	}

}
