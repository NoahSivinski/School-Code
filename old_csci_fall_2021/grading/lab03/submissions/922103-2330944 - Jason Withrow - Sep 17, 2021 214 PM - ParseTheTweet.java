/*
 * [ParseTheTweet].java
 * Author:  [Jason Withrow] 
 * Submission Date:  [9/17/2021]
 *
 * Purpose: Gets tweet from user input and outputs a formatted
 * version of the tweet. Uses specific identifiers to gather
 * information
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
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("Input Tweet: ");
		String tweet = keyboard.nextLine();
	
		int start = 0; 
		int finish = 0;
		String current = "";
		
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		current = tweet.substring(start+5, finish).trim();
		
		System.out.println("Type: \t\t" + current.toUpperCase());
		
		tweet = tweet.substring(finish + 1, tweet.length());
		
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		current = tweet.substring(start+5, finish).trim();
		
		System.out.println("Detail: \t" + current);
		
		tweet = tweet.substring(finish + 1, tweet.length());
		
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		current = tweet.substring(start+5, finish).trim();
		current = current.replaceAll(",", "-");
		
		System.out.println("Location: \t" + current);
		
		tweet = tweet.substring(finish + 1, tweet.length());
		
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		current = tweet.substring(start+5, finish).trim();
		current = current.replaceAll(",","-");
		
		System.out.println("Latitude: \t" + current);
		
		tweet = tweet.substring(finish + 1, tweet.length());
		
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		current = tweet.substring(start+5, finish).trim();
		
		System.out.println("Longitude: \t" + current);
		
		tweet = tweet.substring(finish + 1, tweet.length());
		
		
		
		
	}

}
