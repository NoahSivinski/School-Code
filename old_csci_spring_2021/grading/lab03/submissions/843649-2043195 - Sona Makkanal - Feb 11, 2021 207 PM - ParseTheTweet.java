/*
 * [ParseTheTweet].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [2/11/21]
 *
 * Purpose: This program processes messages similar to TtT tweets using various methods in order to pull information from the text and print it out to the screen.
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
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		//declaring the 5 variables
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		//declaring 2 variables (start and finish)
		//type
		int start = tweet.indexOf("#typ ");
		int finish = tweet.indexOf(";");
	
		type = tweet.substring(start + 5,finish).trim();
		type = type.toUpperCase();
		
		//detail
		start = tweet.indexOf("#det ");
		finish = tweet.indexOf(";", finish + 1);
		
		detail = tweet.substring(start + 5,finish).trim();
		detail = detail.replace(",","-");
		
		//location
		start = tweet.indexOf("#loc ");
		finish = tweet.indexOf(";", finish + 1);
		
		location = tweet.substring(start + 5,finish).trim();
		location = location.replace(",","-");
		
		//latitude
		start = tweet.indexOf("#lat ");
		finish = tweet.indexOf(";", finish + 1);
		
		latitude = tweet.substring(start + 5,finish).trim();
		
		//longitude
		start = tweet.indexOf("#lng ");
		finish = tweet.indexOf(";", finish + 1);
		
		longitude = tweet.substring(start + 5,finish).trim();
		
		//output
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		keyboard.close();

	}

}
