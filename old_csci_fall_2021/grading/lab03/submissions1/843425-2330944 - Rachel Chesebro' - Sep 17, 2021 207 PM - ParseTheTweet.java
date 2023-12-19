/*
 * [ParseTheTweet].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [9/17/2021]
 *
 * Purpose: The purpose of this program is to process tweets and pull out data from the text,
 * manipulate it, and display it. This program will parse the tweet's information into five
 * different types: type, detail, location, latitude, and longitude.
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
		//Prompt user to enter a tweet
		System.out.println("Enter a tweet below ");
		String tweet = keyboard.nextLine();

		//Define start and finish to hold the indices of where each substring begins and ends 
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");

		//Use substring to print only the data asked for
		String type = tweet.substring(start + 5, finish).toUpperCase();
		String tweet1 = tweet.substring(finish + 6);

		//Create new finish variable to move onto the next data type in the string and discard the prior one (this occurs after each type, so variables finish2, finish3, etc. will be defined).
		int finish1 = tweet1.indexOf(";");
		//Use replace function to change commas to hyphens for detail and location types
		String detail = tweet1.substring(start,finish1).replace(",", "-");
		
		String tweet2 = tweet1.substring(finish1 + 6);
		int finish2 = tweet2.indexOf(";");
		String location = tweet2.substring(start,finish2).replace(",", "-");
		
		//The variables, tweet1, tweet2, etc are used to store a certain part of the tweet (user input) as it is parsed and the original variable, tweet, needed to be updated, similarly to finish1, finish2, etc.
		String tweet3 = tweet2.substring(finish2 + 6);
		int finish3 = tweet3.indexOf(";");
		String latitude = tweet3.substring(start,finish3);
		
		String tweet4 = tweet3.substring(finish3 + 6);
		int finish4 = tweet4.indexOf(";");
		String longitude = tweet4.substring(start,finish4);

		//Display the data that has been parsed into five different types of information
		System.out.println("Type: " + "\t\t" + type);
		System.out.println("Detail: " + "\t" + detail);
		System.out.println("Location: " + "\t" + location);
		System.out.println("Latitude: " + "\t" + latitude);
		System.out.println("Longitude: " + "\t" + longitude);

	}

}
