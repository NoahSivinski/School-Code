/*
 * [Twitter].java
 * Author:  [Stephanie Ibarra] 
 * Submission Date:  [2/12/2021]
 *
 * Purpose: This program uses hashtags to add structure 
 * and make it easier when looking for specific things. It
 * classifies the tweets, which can help emergency management agencies and 
 * members of the public, since the Twitter platform is a large
 * one that many people are familiar with and use.
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

public class Twitter {

	public static void main(String[] args) {

		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet=keyboard.nextLine();

		// declare the two variables to hold the indices of
		//where each substring starts and finishes
		int start=0;
		int finish=tweet.indexOf(";");
		// Define the five different types of information
		//specified by the hashtags and use the trim method and
		//the toUpperCase method
		String type=(tweet.substring(start+5, finish)).trim();
		type=type.toUpperCase();
		tweet=tweet.substring(finish+1);
		start=0;
		finish=tweet.indexOf(";");
		String detail=(tweet.substring(start+5, finish)).trim();
		detail=detail.replaceAll(",","-");    // Use the replace 
		//method and use (-) instead of (,)
		tweet=tweet.substring(finish+1);
		finish=tweet.indexOf(";");
		String location=(tweet.substring(start+5, finish)).trim();
		location=location.replaceAll(",","-");
		tweet=tweet.substring(finish+1);
		finish=tweet.indexOf(";");
		String latitude=(tweet.substring(start+5, finish)).trim();
		tweet=tweet.substring(finish+1);
		finish=tweet.indexOf(";");
		String longitude=(tweet.substring(start+5, finish)).trim();
		tweet=tweet.substring(finish+1);
		finish=tweet.indexOf(";");

		// Produce the formatted statements and indent as needed
		System.out.println("Type:\t\t "+ type);
		System.out.println("Detail:\t\t "+ detail);
		System.out.println("Location:\t "+ location);
		System.out.println("Latitude:\t "+ latitude);
		System.out.println("Longitude:\t "+ longitude);

		keyboard.close();
	}
}