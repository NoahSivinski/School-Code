/*
 * ParseTheTweet.java
 * Author:  Carla A Pena 
 * Submission Date:  12 Feburary 2021
 *
 * Purpose: The propose of this program is to allow people
 * to communicate in real time. The hashtags help provide essential
 * information for emergency responders or to the public by
 * providing specific details to that situation.  
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
		//TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		keyboard.close();
		
		System.out.println(tweet);
		int start, finish;
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		String typ = tweet.substring(start + 5, finish).trim().toUpperCase();
		tweet = tweet.substring(finish + 1);		//We drop the #typ from the tweet
		finish = tweet.indexOf(";");
		
		String det = tweet.substring(start + 5, finish).trim();
		tweet = tweet.substring(finish + 1);		//We drop the #det from the tweet
		finish = tweet.indexOf(";");
		
		String loc = tweet.substring(start + 5, finish).trim();
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		
		String lat = tweet.substring(start + 5, finish).trim();
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		
		String lng = tweet.substring(start + 5, finish).trim();
		
		System.out.println("Type:\t\t" + typ);
		System.out.println("Detail:\t\t" + det);
		System.out.println("Location:\t" + loc);
		System.out.println("Latitude:\t" + lat);
		System.out.println("Longitude:\t" + lng);
	}
	
}