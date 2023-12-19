/*
 * [ParseTheTweet].java
 * Author:  [Davis Klein] 
 * Submission Date:  [9/17/2021]
 *
 * Purpose: This program reads a user input from the keyboard, in the format of a tweet. This tweet input
 * is specifically formatted with 5 different types of information, designated by a '#' and 3 letter acronym.
 * The program parses the tweet into substrings based on the information type. This is done using the .substring
 * method. The resultant substrings are output to the screen, separated by newline and grouped by information type.
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

		//keyboard object initialized and tweet input is read from the user and assigned to the tweet String variable.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a tweet below\n");
		String tweet = keyboard.nextLine();
		
		//int start and stop values initialized and assigned to the index value of the '#' character and ';'
		//at their first occurrence in the string tweet.
		int startI = tweet.indexOf("#"); 
		int stopI = tweet.indexOf(";");
		
		//the first substring variable tweetTyp is initialized and assigned to the substring created by the .substring method
		// using the start/stop variables assigned above
		String tweetTyp = tweet.substring(startI, stopI);
		
		//a new start variable is initialized and assigned to the original start variable plus the int 3. This is done in order
		//to remove the #tag that designates the type of information that is stored in the substring. the resultant string
		//is then trimmed of any leading or trailing whitespace using the .trim method.
		int startI2 = startI + 3;
		tweetTyp = tweetTyp.substring(startI2);
		tweetTyp = tweetTyp.trim();
		
		//the stop variable is reassigned to the original value plus the int 1 so that it can be used as the start variable in the 
		//next .substring method. the variable tweet is then reassigned to the substring of tweet starting with the aforementioned
		//stop variable. The resultant string is now the original tweet minus the first of 5 information pieces. stopI is then 
		//reassigned to its original value to be used in the next step of the sequence.
		stopI += 1;
		tweet = tweet.substring(stopI);
		stopI = tweet.indexOf(";");
		
		//the sequence is now repeated for the next four information pieces
		String tweetDet = tweet.substring(startI, stopI);
		startI2 = startI + 3;
		tweetDet = tweetDet.substring(startI2);
		tweetDet = tweetDet.trim();
		
		stopI += 1;
		tweet = tweet.substring(stopI);
		stopI = tweet.indexOf(";");

		String tweetLoc = tweet.substring(startI, stopI);
		startI2 = startI + 3;
		tweetLoc = tweetLoc.substring(startI2);
		tweetLoc = tweetLoc.trim();
		
		stopI += 1;
		tweet = tweet.substring(stopI);
		stopI = tweet.indexOf(";");
		
		String tweetLat = tweet.substring(startI, stopI);
		startI2 = startI + 3;
		tweetLat = tweetLat.substring(startI2);
		tweetLat = tweetLat.trim();
		
		stopI += 1;
		tweet = tweet.substring(stopI);
		stopI = tweet.indexOf(";");
		
		String tweetLng = tweet.substring(startI, stopI);
		startI2 = startI + 3;
		tweetLng = tweetLng.substring(startI2);
		tweetLng = tweetLng.trim();
		
		//using the .toUpperCase method, the tweetTyp string is reassigned to itself in all uppercase letters.
		//the variables tweetDet and tweetLoc are reassigned to themselves with any ',' chars replaced with
		//'-' using the .replace method
		tweetTyp = tweetTyp.toUpperCase();
		tweetDet = tweetDet.replace(",", "-");
		tweetLoc = tweetLoc.replace(",", "-");
		
		//the resultant variables are output to the screen using '\t' to provide correct formatting
		System.out.println("Type:\t\t" + tweetTyp);
		System.out.println("Detail:\t\t" + tweetDet);
		System.out.println("Location:\t" + tweetLoc);
		System.out.println("Latitude:\t" + tweetLat);
		System.out.println("Longitude:\t" + tweetLng);
		
		keyboard.close();	
		
	}

}
