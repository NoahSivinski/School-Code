/*
 * ParseTheTweet.java
 * Author:  Cole Lanham 
 * Submission Date:  2/11/21
 *
 * Purpose: This program takes user input in the form of a "tweet" and organizes date accordingly to
 * sequences of #'s and ;'s. This program utilized our understanding of variables and String classes. 
 * We constantly redefine the variable "tweet" so that we can take new segments of the user input
 * and organize it accordingly.
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
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		//User prompt
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		type = tweet.substring(start + 5,finish); //Defines types to specified string now
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#"); //Redefine start index
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5,finish);
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#"); //Redefine start index
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5 ,finish);
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#"); //Redefine start index
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5 ,finish);
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#"); //Redefine start index
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5 ,finish);
		
		//Cleaning up detail and location values 
		detail = detail.replace(",", "-");
		location = location.replace(",", "-");
		
		System.out.println("Type = " + type.toUpperCase());
		System.out.println("Detail = " + detail);
		System.out.println("Location = " + location);
		System.out.println("Latitude = " + latitude);
		System.out.println("Longitude = " + longitude);
		
		

	}

}
