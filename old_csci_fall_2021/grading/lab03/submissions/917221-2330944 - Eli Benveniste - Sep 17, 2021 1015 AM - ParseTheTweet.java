import java.util.Scanner;
/*
 * ParseTheTweet.java
 * Author:   Eli Benveniste
 * Submission Date:   9/17/21
 *
 * Purpose: Parse a Tweet and print the values after 
 * specific hashtags to the console. This program accepts a 
 * tweet as input, and outputs the type, details, 
 * location, and a more specific location including longitude
 * and latitude coordinates.
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
public class ParseTheTweet {
	public static void main(String[] args) {
		System.out.println("Enter a tweet below");
		Scanner keyboard = new Scanner(System.in);
		
		String fullTweet = keyboard.nextLine();
		
		
		//Type
		int typIndex = fullTweet.indexOf("#typ");
		int typEnd = fullTweet.indexOf(";");
		String typTweet = fullTweet.substring(typIndex + 5, typEnd);
		System.out.println("Type:\t\t" + typTweet.toUpperCase());
		
		/*
		 * Methodology
		 * 1. Get string from the hashtag to the end
		 * 2. find index of ";" in the string obtained from step 1
		 * 3. substring the string from step 1, and go until the next ";" 
		 * 4. Repeat for each hashtag
		 */
		
		//Detail
		int detIndex = fullTweet.indexOf("#det");
		String detTweet = fullTweet.substring(detIndex + 5, fullTweet.length());
		int detEnd = detTweet.indexOf(";");
		detTweet = detTweet.substring(0, detEnd);
		System.out.println("Detail:\t\t" + detTweet);
		
		//Location
		int locIndex = fullTweet.indexOf("#loc");
		String locTweet = fullTweet.substring(locIndex + 5, fullTweet.length());
		int locEnd = locTweet.indexOf(";");
		locTweet = locTweet.substring(0, locEnd);
		System.out.println("Location:\t" + locTweet);
		
		
		//Latitude
		int latIndex = fullTweet.indexOf("#lat");
		String latTweet = fullTweet.substring(latIndex + 5, fullTweet.length());
		int latEnd = latTweet.indexOf(";");
		latTweet = latTweet.substring(0, latEnd);
		System.out.println("Latitude:\t" + latTweet);
		
		//Longitude 
		int lngIndex = fullTweet.indexOf("#lng");
		String lngTweet = fullTweet.substring(lngIndex + 5, fullTweet.length());
		int lngEnd = lngTweet.indexOf(";");
		lngTweet = lngTweet.substring(0, lngEnd);
		System.out.println("Longitude:\t" + lngTweet);
	}
}
