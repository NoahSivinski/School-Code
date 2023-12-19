/*
 * ParseTheTweet.java
 * Author:  Quinton Heald 
 * Submission Date:  2-11-21
 *
 * Purpose: This program takes a user-inputed tweet, parses it for 
 * its individual hash-tags and values, and then divides each analyzed string
 * into its respective category of hash-tag. The program is responsible
 * for taking each hash-tag and analyzing the value that follows it
 * while also discarding the hash-tag and only displaying the value of that
 * specific category. In its output, the program displays the value of
 * each hash-tag for the user to read off and understand with ease.
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
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		String typTweet, detTweet, locTweet, latTweet, lngTweet;
		int typ1, det1 , loc1, lat1 , lng1;
		
		//establishes starting points for each specific hash-tag in the tweet
		typ1 = tweet.indexOf("#typ");
		det1 = tweet.indexOf("#det");
		loc1 = tweet.indexOf("#loc");
		lat1 = tweet.indexOf("#lat");
		lng1 = tweet.indexOf("#lng");
		
		typTweet = tweet.substring(typ1);
		int typSem = tweet.indexOf(";");
		typTweet = tweet.substring(typ1 , typSem);
		typTweet = typTweet.substring(4);
		String typFinal = typTweet.trim();
		typFinal = typFinal.toUpperCase();
		
		detTweet = tweet.substring(det1);
		int detSem = detTweet.indexOf(";");
		int detStart = detTweet.indexOf("#det");
		detTweet = detTweet.substring(detStart , detSem);
		detTweet = detTweet.substring(4);
		String detFinal = detTweet.trim();
		detFinal = detFinal.replace(',', '-');
		
		locTweet = tweet.substring(loc1);
		int locSem = locTweet.indexOf(";");
		int locStart = locTweet.indexOf("#loc");
		locTweet = locTweet.substring(locStart , locSem);
		locTweet = locTweet.substring(4);
		String locFinal = locTweet.trim();
		locFinal = locFinal.replace(',' , '-');
		
		latTweet = tweet.substring(lat1);
		int latSem = latTweet.indexOf(";");
		int latStart = latTweet.indexOf("#lat");
		latTweet = latTweet.substring(latStart , latSem);
		latTweet = latTweet.substring(4);
		String latFinal = latTweet.trim();
		
		lngTweet = tweet.substring(lng1);
		int lngSem = lngTweet.indexOf(";");
		int lngStart = lngTweet.indexOf("#lng");
		lngTweet = lngTweet.substring(lngStart , lngSem);
		lngTweet = lngTweet.substring(4);
		String lngFinal = lngTweet.trim();
		
		System.out.println("Type:\t\t" + typFinal);
		System.out.println("Detail:\t\t" + detFinal);
		System.out.println("Location:\t" + locFinal);
		System.out.println("Latitude:\t" + latFinal);
		System.out.println("Longitude:\t" + lngFinal);

		keyboard.close();
		
		
	}

}
