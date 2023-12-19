/*
 * ParseTheTweet.java
 * Author:  William Malonda 
 * Submission Date:  February 12, 2021
 *
 * Purpose: ParseTheTweet.java is a program that will ask the user to enter a tweet 
 * into the console. The program will then take the user's input and split it up by 
 * hashtags into 5 different pieces of info which are the type of report (#typ), 
 * further details (#det), the location (#loc), the latitude (#lat), and the 
 * longitude (#lng). It then outputs each values accordingly for the user. 
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
		
		//Declared variables
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		String tweet;
		int start;
		int finish;
		
		//Prompts user to enter tweet into box and stores it in the string "tweet"
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();
		
		//Splits code to remove "#typ", takes the input between "#typ" and ";" and outputs it into all uppercase
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 5, finish);
		tweet = tweet.substring(finish + 1);
		System.out.println("Type: \t\t" + type.toUpperCase());
	
		//Splits code to remove "#det", takes input between "#det" and ";" and outputs it
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5, finish);
		tweet = tweet.substring(finish + 1);
		System.out.println("Detail: \t" + detail.replace(',' , '-'));
		
		//Splits code for to remove "#loc", takes input between "#loc" and ";" and outputs it
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5, finish);
		tweet = tweet.substring(finish + 1);
		System.out.println("Location: \t" + location.trim().replace(',' , '-'));
				
		//Splits code for to remove "#lat", takes input between "#lat" and ";" and outputs it
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5, finish);
		tweet = tweet.substring(finish + 1);
		System.out.println("Latitude: \t" + latitude);
				
		//Splits code for to remove "#lng", takes input between "#lng" and ";" and outputs it
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5, finish);
		System.out.println("Longitude: \t" + longitude);
		
		keyboard.close();

	}

}
