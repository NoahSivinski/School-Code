/*
 * ParseTheTweet.java
 * Author:  Aysha Amreen 
 * Submission Date:  9/16/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The program takes user input for a tweet and divides the 
 * information into separate categories using #tags as start
 * points and semi-colons as end points. It then displays 
 * the information next to the category.
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

		System.out.println("Enter a tweet below");

		String Tweet;

		Scanner keyboard = new Scanner(System.in);
		Tweet = keyboard.nextLine();

		String Type;
		String Detail;
		String Location;
		String Latitude;
		String Longitude;

		int start = Tweet.indexOf("#typ");
		int finish = Tweet.indexOf(";");

		/*Taking out the information for 'Type' using a substring method with start point 
		 * adjusted for characters '#typ'. Using trim method to omit preceding white space
		 */
		Type = Tweet.substring(start + 4,finish);
		Type = Type.trim();
		Type = Type.toUpperCase();
		System.out.println("Type:\t\t" + Type);

		//Using substring method to discard used part of the tweet
		Tweet = Tweet.substring(finish + 1);

		//defining new start and finish points for next part of tweet
		start = Tweet.indexOf("#det");
		finish = Tweet.indexOf(";");

		//Parsing tweet for Detail
		Detail = Tweet.substring(start + 4,finish);
		Detail = Detail.trim();
		Detail = Detail.replace(',','-');
		System.out.println("Detail:\t\t" + Detail);

		Tweet = Tweet.substring(finish + 1);

		//Parsing tweet for Location
		start = Tweet.indexOf("#loc");
		finish = Tweet.indexOf(";");

		Location = Tweet.substring(start + 4,finish);
		Location = Location.trim();
		Location = Location.replace(',','-');
		System.out.println("Location:\t" + Location);

		Tweet = Tweet.substring(finish + 1);

		//Parsing tweet for Latitude
		start = Tweet.indexOf("#lat");
		finish = Tweet.indexOf(";");

		Latitude = Tweet.substring(start + 4,finish);
		Latitude = Latitude.trim();
		System.out.println("Latitude:\t" + Latitude);

		Tweet = Tweet.substring(finish + 1);

		//Parsing tweet for Longitude
		start = Tweet.indexOf("#lng");
		finish = Tweet.indexOf(";");

		Longitude = Tweet.substring(start + 4,finish);
		Longitude = Longitude.trim();
		System.out.println("Longitude:\t" + Longitude);

		keyboard.close();
	}

}
