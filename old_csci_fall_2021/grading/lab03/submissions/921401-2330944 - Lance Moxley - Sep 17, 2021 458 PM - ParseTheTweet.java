/*
 * ParseTheTweet.java
 * Author:  Lance Moxley
 * Submission Date: 09/17/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * The program parses through strings that all contain a hashtag, 
 * three characters after the hashtag, the text inputted by the 
 * user, and the semicolon to end the string. Essentially, this 
 * program gathers the text found between the fourth index value
 * and the value at where the semicolon is located and is then 
 * displayed to the user in the console. The type string is made
 * into all upper case, and the detail and location strings have
 * all of their commas replaced with hyphens. The latitude and 
 * longitude strings are not affected, so they display as 
 * entered by the user. 
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

import java.util.*;

public class ParseTheTweet {

	public static void main(String[] args) {

		// Prompts the user to enter a tweet and provides a meanings of entering the
		// tweet
		System.out.print("Enter a tweet below\n");
		Scanner KB = new Scanner(System.in);

		// Declaring the strings: tweet, type, detail, location. latitude, and
		// longitude. Tweet is the entire user input, while the other strings are based
		// on their respective hastags and the three characters that follow the hashtag.
		String tweet = KB.nextLine();
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;

		// Declaring the start and finish variables, to store the indexes of the sub
		// strings. These will update for each individual tweet that starts with a
		// hashtag and a semicolon.
		int start;
		int finish;

		// Starting each of the strings with an index of 4, because each of the tweets
		// starts with using the first 3 index values. Then it finishes at the index
		// where the semicolon is located. Any empty spaces after the string but before
		// the semicolon, are trimmed off.
		start = tweet.indexOf("#typ") + 4;
		finish = tweet.indexOf("; #det");
		type = tweet.substring(start, finish);
		type.trim();

		start = tweet.indexOf("#det") + 4;
		finish = tweet.indexOf("; #loc");
		detail = tweet.substring(start, finish);
		detail.trim();

		start = tweet.indexOf("#loc") + 4;
		finish = tweet.indexOf("; #lat");
		location = tweet.substring(start, finish);
		location.trim();

		start = tweet.indexOf("#lat") + 4;
		finish = tweet.indexOf("; #lng");
		latitude = tweet.substring(start, finish);
		latitude.trim();

		start = tweet.indexOf("#lng") + 4;
		finish = tweet.indexOf(";\"");
		longitude = tweet.substring(start, finish);
		longitude.trim();

		// New string is initalized for type to make the text within the string all
		// uppercase.
		String typeUpCase = type.toUpperCase();
		System.out.println("Type:\t\t " + typeUpCase);

		// New Strings are initalized for the detail and location, to replace each of
		// the commas in the String with hyphens.
		String detailHyphen = detail.replace(",", "-");
		System.out.println("Detail:\t\t " + detailHyphen);
		String locationHyphen = location.replace(",", "-");
		System.out.println("Location:\t " + locationHyphen);

		// Nothing is affected for these strings, so they are grabbing the direct string
		// input from the #lat and #lng.
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);

		KB.close();
	}
}
