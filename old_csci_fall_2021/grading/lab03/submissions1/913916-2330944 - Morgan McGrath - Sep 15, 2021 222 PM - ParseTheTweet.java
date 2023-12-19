/*
 * ParseTheTweet.java
 * Author:  Morgan McGrath 
 * Submission Date:  September 15th, 2021
 *
 * Purpose: This program lets the user type in a tweet, and it analyzes the information associated
 * with the hashtages #typ, #det, #loc, #lat, #lng. If you put information after these hashtags, separated
 * by semicolons, the program will group the information into its respective category and print it out.
 * This program would be helpful in assisting people in difficult situations.
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
		//get tweet
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet=keyboard.nextLine();
		tweet=tweet.trim();
		//declare variables to store the 5 different types of information
		String type, location, detail, latitude, longitude;
		//divide tweet into the substrings of information
		int start, finish;
		//type
		start=tweet.indexOf("#typ");
		finish=tweet.indexOf(";");
		type=tweet.substring(start+5,finish);
		tweet=tweet.substring(finish+1);
		tweet=tweet.trim();
		//detail
		start=tweet.indexOf("#det");
		finish=tweet.indexOf(";");
		detail=tweet.substring(start+5,finish);
		tweet=tweet.substring(finish+1);
		tweet=tweet.trim();
		//location
		start=tweet.indexOf("#loc");
		finish=tweet.indexOf(";");
		location=tweet.substring(start+5,finish);
		tweet=tweet.substring(finish+1);
		tweet=tweet.trim();
		//latitude 
		start=tweet.indexOf("#lat");
		finish=tweet.indexOf(";");
		latitude=tweet.substring(start+5,finish);
		tweet=tweet.substring(finish+1);
		tweet=tweet.trim();
		//longitude
		start=tweet.indexOf("#lng");
		finish=tweet.indexOf(";");
		longitude=tweet.substring(start+5,finish);
		tweet=tweet.substring(finish+1);
		//make type value all caps
		type=type.toUpperCase();
		//make detail and location values free of commas
		detail=detail.replace(',', '-');
		location=location.replace(',', '-');
		//print the information
		System.out.println("Type:\t\t"+type);
		System.out.println("Detail:\t\t"+detail);
		System.out.println("Location:\t"+location);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
	}
	
}
