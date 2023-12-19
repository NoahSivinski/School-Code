
/*
 * ParseTheTweet.java
 * Author:  Alice Szymkiewicz 
 * Submission Date:  02/12/2021
 *
 * Purpose:
 * 
 * This program takes the user's input, a tweet, and then parses 
 * the tweet based on if the information is a type, detail, location, 
 * latitude, or longitude. The program first scans for the user's input 
 * of the tweet. Since each hashtag (ex. #typ) is 4 characters long, 
 * the variable start counts the characters starting from the '#' 
 * to the 4th character. The finish is set at the ';', so the 
 * program trims the information between the # and ;. For each 
 * piece of information, the tweet substring adds one to the 
 * variable to count and trim the next piece of information. 
 * The program does this for each piece of information. 
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

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a tweet below"); // user inputs tweet
		String tweet = scan.nextLine();

		int start = (tweet.indexOf('#')) + 4;
		int finish = tweet.indexOf(';');
		String type = tweet.substring(start, finish).toUpperCase();
		String typeTrim = type.trim();
		System.out.println("Type:\t\t" + typeTrim); // outputs type

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 4;
		finish = tweet.indexOf(";");
		String detail = (tweet.substring(start, finish)).replace(',', '-');
		String detailTrim = detail.trim();
		System.out.println("Detail:\t\t" + detailTrim); // outputs details

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 4;
		finish = tweet.indexOf(";");
		String location = (tweet.substring(start, finish)).replace(',', '-');
		String locationTrim = location.trim();
		System.out.println("Location:\t" + locationTrim); // outputs location

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 4;
		finish = tweet.indexOf(";");
		String latitude = (tweet.substring(start, finish));
		String latitudeTrim = latitude.trim();
		System.out.println("Latitude:\t" + latitudeTrim); // outputs latitude

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf('#') + 4;
		finish = tweet.indexOf(";");
		String longitude = (tweet.substring(start, finish));
		String longitudeTrim = longitude.trim();
		System.out.println("Longitude:\t" + longitudeTrim); // outputs longitude

		scan.close();
	}
}
