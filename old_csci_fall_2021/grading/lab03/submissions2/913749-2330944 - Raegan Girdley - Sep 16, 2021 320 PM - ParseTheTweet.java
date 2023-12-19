/*
 * ParseTheTweet.java
 * Author:  Raegan Girdley
 * Submission Date:  9/16/2021
 *
 * Purpose: Reads a tweet and prints out the details of said tweet.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;
public class ParseTheTweet {
	
	public static void main(String[] args) {
		
		//declares variables
		String typ, det, loc, lat, lng;
		
		//prompts user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		//changes , to - and finds first indices of # and ;
		tweet = tweet.replace(",", "-");
		int start = tweet.indexOf("#") + 4, finish = tweet.indexOf(";");
		
		//typ
		typ = tweet.substring(start, finish).trim().toUpperCase();
		tweet = tweet.substring(finish+1);
		
		//det
		start = tweet.indexOf("#") + 4;
		finish = tweet.indexOf(";");
		det = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish+1);
		
		//loc
		start = tweet.indexOf("#") + 4;
		finish = tweet.indexOf(";");
		loc = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish+1);
		
		//lat 
		start = tweet.indexOf("#") + 4;
		finish =  tweet.indexOf(";");
		lat = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish+1);
		
		//lng
		start = tweet.indexOf("#") + 4;
		finish = tweet.indexOf(";");
		lng = tweet.substring(start, finish).trim();
		
		//prints everything out
		System.out.println("Type: \t \t" + typ);
		System.out.println("Detail: \t" + det);
		System.out.println("Location: \t" + loc);
		System.out.println("Latitude: \t" + lat);
		System.out.println("Longitude: \t" + lng);
	}

}
