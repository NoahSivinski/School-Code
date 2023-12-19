/*
 * CSCI 1301.java
 * Author:  Adam Ruehle
 * Submission Date:  September 16, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The purpose of this program is to implement a proposal
 * called Tweak the Tweat (TtT). The program pulls the useful,
 * marked information from tweets by examining their hashtags and
 * prints it on the screen for easy response by emergency
 * services.
 * 
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
	
		//Tweet Input
		System.out.println("Enter a tweet below");
		Scanner keyboard = new Scanner(System.in);
		String tweet = keyboard.nextLine();
		
		int start = tweet.indexOf("#") + 5; //The useful information always begins at the index of 5, so a + 5 is included
		int finish = tweet.indexOf(";");    //on line 43 to not include the hashtagged information in the substrings.
		
		//Parsing The Tweet
		String type = tweet.substring(start, finish);
		
		start = finish + 6;
		/* The int start is originally initialized to the start of the useful info after #typ. So, the program needs to assign
		 * the int start the value of the beginning of the next useful info, which is 6 positions behind the int finish. */
		finish = start + tweet.substring(start).indexOf(";"); //Assigns int finish the value of the next semicolon.
		String detail = tweet.substring(start, finish);
		
		start = finish + 6;
		finish = start + tweet.substring(start).indexOf(";");
		String location = tweet.substring(start, finish);
		
		start = finish + 6;
		finish = start + tweet.substring(start).indexOf(";");
		String latitude = tweet.substring(start, finish);
		
		start = finish + 6;
		finish = start + tweet.substring(start).indexOf(";");
		String longitude = tweet.substring(start, finish);
		
		//Print Useful Info
		System.out.println("Type:\t\t " + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		
	}
}
