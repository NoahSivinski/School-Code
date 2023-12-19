/*
 * ParseTheTweet.java
 * Author: Aaron Brown
 * Submission Date: 02/09/2021
 *
 * Purpose: The following program takes a user input in the format of a tweet
 * which is separated by hashtags and semicolons. The hashtags and semicolons
 * help divide the tweet into 5 different categories which the program then 
 * separates and designates each part of the tweet that represents a category
 * into the corresponding string. The end result of the program prints each
 * category separately and organizes them. The program does have two special
 * changes from the input tweet and output, the type is printed in all capitals
 * and any comma inside of the tweet is changed to a hyphen.
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
		//Scanner is initialized.
		Scanner input = new Scanner (System.in);
		//User is prompted for tweet input.
		System.out.println("Enter a tweet below ");
		String tweet = input.nextLine();
		//The variables used to separate the tweet are established
		int start;
		int finish;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		//The following replaces all instances of a comma with a hyphen.
		tweet = tweet.replace(',', '-');
		/*The following begins parsing the tweet by finding the beginning and
		 *end of the type part stores it in the type string and separates it 
		 *from the tweet string.
		 */
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		start = start + 4;
		type = tweet.substring(start, finish);
		type = type.trim();
		type = type.toUpperCase();
		finish++;
		tweet = tweet.substring(finish);
		/*The next set of code deals with the detail part of the tweet
		 *and stores it in the detail string and separates it.
		 */
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		start = start + 4;
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		finish++;
		tweet = tweet.substring(finish);
		/*The next set of code deals with the location part of the tweet
		 *and stores it in the location string and separates it.
		 */
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		start = start + 4;
		location = tweet.substring(start, finish);
		location = location.trim();
		finish++;
		tweet = tweet.substring(finish);
		/*The next set of code deals with the latitude part of the tweet
		 *and stores it in the latitude string and separates it.
		 */
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		start = start + 4;
		latitude = tweet.substring(start, finish);
		latitude = latitude.trim();
		finish++;
		tweet = tweet.substring(finish);
		/*The next set of code deals with the longitude part of the tweet
		 *and stores it in the longitude string and separates it.
		 */
		start = tweet.indexOf('#');
		finish = tweet.indexOf(';');
		start = start + 4;
		longitude = tweet.substring(start, finish);
		longitude = longitude.trim();
		finish++;
		tweet = tweet.substring(finish);
		//The program prints out the result of parsing the tweet.
		System.out.println("Type: \t\t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
	}

}
