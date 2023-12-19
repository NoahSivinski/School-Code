/*
 * ParseTheTweet.java
 * Author: Chase Pitser 
 * Submission Date: 9/16/21
 *
 * Purpose: The purpose of this program is to take in a properly formatted 
 * tweet from the user, categorizing its contents into 5 different main 
 * categories. I did this using the indexOf and substring methods in the 
 * String class. This allowed me to separate the different parts of the 
 * message into their respective variables, printing them in the proper I/O.
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
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = Keyboard.nextLine();
		tweet = tweet.replace(",","-");
		//type substring
		int start = tweet.indexOf("#")+4;
		int finish = tweet.indexOf(";");
		String type = tweet.substring(start,finish).toUpperCase().trim();
		//discarding type from tweet
		tweet = tweet.substring(finish+1);
		//detail substring
		start = tweet.indexOf("#")+4;
		finish = tweet.indexOf(";");
		String detail = tweet.substring(start,finish).trim();
		//discarding detail from tweet
		tweet = tweet.substring(finish+1);
		//location substring
		start = tweet.indexOf("#")+4;
		finish = tweet.indexOf(";");
		String location = tweet.substring(start,finish).trim();
		//discarding location from tweet
		tweet = tweet.substring(finish+1);
		//latitude substring
		start = tweet.indexOf("#")+4;
		finish = tweet.indexOf(";");
		String latitude = tweet.substring(start,finish).trim();
		//discarding latitude from tweet
		tweet = tweet.substring(finish+1);
		//longitude substring
		start = tweet.indexOf("#")+4;
		finish = tweet.indexOf(";");
		String longitude = tweet.substring(start,finish).trim();
		//output
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		Keyboard.close();
	}
	
}