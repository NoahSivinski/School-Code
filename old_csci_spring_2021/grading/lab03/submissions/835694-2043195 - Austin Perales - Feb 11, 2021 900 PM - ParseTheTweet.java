/*
 * [ParseTheTweet.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [2/11/2021]
 *
 * Purpose: The purpose of ParseTheTweet.java is to break a tweet up into
 * named sections to make it easier to sift through. If the user adds prefixes
 * on to the information being sent, this program picks those up and separates
 * them in to their correct categories for a much easier read and a better
 * understanding of the information being sent, especially if it is critical.
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
		//declare the String tweet
		String tweet;
		
		
		//receive the input from the user using the Scanner class which gets stored in the String tweet
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below: ");
		tweet = keyboard.nextLine(); 

		
		//Declaring the strings that we will be storing the information from the tweet in
		//along with the trimmed strings
		String type;
		String trimmedType;
		
		String detail;
		String trimmedDetail;
		
		String location;
		String trimmedLocation;
		
		String latitude;
		String trimmedLatitude;
		
		String longitude;
		String trimmedLongitude;
		
		
		//variable that will hold indices of the substrings
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		
		
		//uses .replace() to replace any instance of a comma with a - so there are no coding errors
		tweet = tweet.replace("," , "-");
		
		
		//creating a substring using knowledge of the starting position and ending position
		//of the tweet and trimming the String we take out
		type = tweet.substring(start + 4, finish);
		//trim the string to remove any blank spaces
		trimmedType = type.trim();
		
		
		//Trimming off the part of the String we already used to restart the substring
		//so we can find the next value
		tweet = tweet.substring(finish + 1);
		tweet = tweet.trim();
		
		
		//reseting finish so it finds the next semicolon in the String
		finish = tweet.indexOf(";");
		
		
		//a repetition of the process for taking out the value, now for detail
		detail = tweet.substring(start + 4, finish);
		trimmedDetail = detail.trim();
		
		tweet = tweet.substring(finish + 1);
		tweet = tweet.trim();
		
		finish = tweet.indexOf(";");
		
		
		//a repetition of the process for taking out the value, now for location
		location = tweet.substring(start + 4, finish);
		trimmedLocation = location.trim();
		
		tweet = tweet.substring(finish + 1);
		tweet = tweet.trim();
		
		finish = tweet.indexOf(";");
		
		
		//a repetition of the process for taking out the value, now for latitude
		latitude = tweet.substring(start + 4, finish);
		trimmedLatitude = latitude.trim();
		
		tweet = tweet.substring(finish + 1);
		tweet = tweet.trim();
		
		finish = tweet.indexOf(";");

		
		//a repetition of the process for taking out the value, now for latitude
		//we do not need to reset the substring because this is the last value in the tweet
		longitude = tweet.substring(start + 4, finish);
		trimmedLongitude = longitude.trim();
		
		
		//turns the trimmed type to upper case before it is printed
		trimmedType = trimmedType.toUpperCase();
	
		
		//the print statements for displaying the values
		System.out.println("Type: \t\t" + trimmedType);
		System.out.println("Detail: \t" + trimmedDetail);
		System.out.println("Location: \t" + trimmedLocation);
		System.out.println("Latitude: \t" + trimmedLatitude);
		System.out.println("Longitude: \t" + trimmedLongitude);		
		
		keyboard.close();
	}

}
