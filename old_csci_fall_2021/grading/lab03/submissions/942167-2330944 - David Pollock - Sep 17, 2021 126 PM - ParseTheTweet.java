/*
 * ParseTheTweet.java
 * Author:  Samuel Pollock
 * Submission Date: September 17, 2021
 *
 * Purpose: To gather information from a tweet and highlight important parts
 * for use in various emergency situations 
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
		int Start, Finish;
		String Tweet;
		String TweetPart;
		// Declaring the Strings and the Integers needed for the program
		// TweetPart will be acting as the divided up version of the tweet

		System.out.println("Enter a tweet below");
		Tweet = keyboard.nextLine();
		keyboard.close();
		// Taking user input and then closing the keyboard to prevent extra inputs

		TweetPart = Tweet.trim(); // Using .trim to clear out unneeded spaces and make the output look more presentable
		Start = TweetPart.indexOf("#");
		Finish = TweetPart.indexOf(";");
		// After taking the first index, I make the new index step off the current one to the next one like a ladder
		System.out.print("Type:  \t \t");
		System.out.println(TweetPart.substring(Start + 4, Finish).toUpperCase());

		Start = TweetPart.indexOf("#",Finish);
		Finish = TweetPart.indexOf(";", Start);
		// Since I am just doing this process repeatedly, all I need to do is repeat the code once for every section
		System.out.print("Detail: \t");
		System.out.println(TweetPart.substring(Start + 4, Finish).replace(',', '-'));

		Start = TweetPart.indexOf("#",Finish);
		Finish = TweetPart.indexOf(";", Start);
		System.out.print("Location: \t");
		System.out.println(TweetPart.substring(Start + 4, Finish).replace(',', '-'));

		Start = TweetPart.indexOf("#",Finish);
		Finish = TweetPart.indexOf(";", Start);
		System.out.print("Latitude: \t");
		System.out.println(TweetPart.substring(Start + 4, Finish));

		Start = TweetPart.indexOf("#",Finish);
		Finish = TweetPart.indexOf(";", Start);
		System.out.print("Longitude: \t");
		System.out.println(TweetPart.substring(Start + 4, Finish));
		// Now the process has been done for each segment of the tweet, and all the formatting has been set up for the output
	}

}
