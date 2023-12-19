/*
 * ParseTheTweet.java
 * Author:  Anh Ho
 * Submission Date:  9/14/2021
 *
 * Purpose: Program that take input from the user with hashtag commands and print it out based on the command.
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
		//Declare variables
		String tweet;
		String type;
		String location;
		String detail;
		String latitude;
		String longtitude;
		int start;
		int end;

		//Getting input
		Scanner keyboard = new Scanner(System.in);								//create new scanner object
		System.out.println("Enter a tweet below:");								//prompt user input
		tweet = keyboard.nextLine();											//create string and save input

		//Extracting info	
		start = tweet.indexOf("#");												//initialize start index
		end = tweet.indexOf(";");												//initialize end index
		start = start+5;														//skip hashtag and space
		type = tweet.substring(start, end);										//extract information
		type = type.trim();														//trim

		tweet = tweet.substring(end+2);											//trim out parts already worked on
		start = tweet.indexOf("#");												//initialize start index
		end = tweet.indexOf(";");												//initialize end index
		start = start+5;														//skip hashtag and space
		detail = tweet.substring(start, end);									//extract information
		detail = detail.trim();													//trim
		detail = detail.replace(',','-');										//replace , with -

		tweet = tweet.substring(end+2);											//trim out parts already worked on
		start = tweet.indexOf("#");												//initialize start index
		end = tweet.indexOf(";");												//initialize end index
		start = start+5;														//skip hashtag and space
		location = tweet.substring(start, end);									//extract information
		location = location.trim();												//trim
		location = location.replace(',','-');									//replace , with -
		
		tweet = tweet.substring(end+2);											//trim out parts already worked on
		start = tweet.indexOf("#");												//initialize start index
		end = tweet.indexOf(";");												//initialize end index
		start = start+5;														//skip hashtag and space
		latitude = tweet.substring(start, end);									//extract information
		latitude = latitude.trim();												//trim

		tweet = tweet.substring(end+2);											//trim out parts already worked on
		start = tweet.indexOf("#");												//initialize start index
		end = tweet.indexOf(";");												//initialize end index
		start = start+5;														//skip hashtag and space
		longtitude = tweet.substring(start);									//extract information
		longtitude = longtitude.trim();											//trim
		
		//Print output
		System.out.println("Type:\t\t\t"+type.toUpperCase());					//print out type in upper case
		System.out.println("Detail:\t\t\t"+detail);								//print out detail
		System.out.println("Location:\t\t"+location);							//print out location
		System.out.println("Latitude:\t\t"+latitude);							//print out latitude
		System.out.println("Longtitude:\t\t"+longtitude);						//print out longtitude
	}
}
