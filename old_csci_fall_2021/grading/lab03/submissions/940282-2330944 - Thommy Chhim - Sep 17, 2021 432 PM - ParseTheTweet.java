/*
 * ParsetheTweet.java
 * Author:  Thommy Chhim
 * Submission Date:  9/17/21
 *
 * Purpose: The program asks the user to put in a tweet in a specific format. The tweet is stored as a string, but then is split up into 5 types of information by the hashtags. Then, the program will print out these 5 types of information to inform the user. 
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

		//Initializing keyboard scanner
		Scanner Keyboard = new Scanner (System.in);

		//Declaring variables 
		String tweet, type, detail, location, latitude, longitude; 

		//User inputs the tweet 
		System.out.println("Enter a tweet below");
		tweet = Keyboard.nextLine();

		//the tweet is stored 
		type = tweet.split(";")[0];
		detail = tweet.split(";")[1];
		location = tweet.split(";")[2];
		latitude = tweet.split(";")[3];
		longitude= tweet.split(";")[4];

		//the values are set
		type = type.trim().substring(5, type.length()).toUpperCase();
		detail = detail.trim().substring(5, detail.length()-1).replaceAll(",", "-");
		location = location.trim().substring(5, location.length()-1).replaceAll(",", "-");
		latitude = latitude.trim().substring(5,latitude.length()-1).replaceAll(",", "-");
		longitude = longitude.trim().substring(5,longitude.length()-1).replaceAll(",", "-");

		//the values are printed 
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t " + detail);
		System.out.println("Location:\t " + location);
		System.out.println("Latitude:\t " + latitude); 
		System.out.println("Longitude:\t " + longitude);

	}

}
