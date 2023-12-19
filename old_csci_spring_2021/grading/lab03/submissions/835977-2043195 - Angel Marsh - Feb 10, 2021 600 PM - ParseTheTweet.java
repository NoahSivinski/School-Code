/*
 * ParseTheTweet.java
 * Author:  Angel Marsh 
 * Submission Date:  February 10, 2021
 *
 * Purpose: The purpose of this program is to process messages
 * inputted by the user, pull information from the text,
 * manipulate it, and print it to the screen.
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
		
		String typ = "Type: \t\t";
		String det = "Detail: \t";
		String loc = "Location: \t";
		String lat = "Latitude: \t";
		String lng = "Long: \t\t";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(';');
		
		String type = tweet.substring(start+4, finish);
		type = type.toUpperCase();
		String typeTrimmed = type.trim();
		System.out.println(typ + typeTrimmed);
		
		tweet = tweet.substring(finish+1);
		String tweetTrimmed = tweet.trim();
		
		start= tweet.indexOf("#");
		finish= tweet.indexOf(';');
		
		String detail = tweetTrimmed.substring(start+4, finish-1);
		detail = detail.replace(',', '-');
		String detailTrimmed = detail.trim();
		System.out.println(det + detailTrimmed);
		
		tweet = tweet.substring(finish+1);
		tweetTrimmed = tweet.trim();
		
		start= tweet.indexOf("#");
		finish= tweet.indexOf(';');
		
		String location = tweetTrimmed.substring(start+4, finish-1);
		location = location.replace(',', '-');
		String locationTrimmed = location.trim();
		System.out.println(loc + locationTrimmed);
		
		tweet = tweet.substring(finish+1);
		tweetTrimmed = tweet.trim();
		
		start= tweet.indexOf("#");
		finish= tweet.indexOf(';');
		
		String latitude = tweetTrimmed.substring(start+4, finish-1);
		String latitudeTrimmed = latitude.trim();
		System.out.println(lat + latitudeTrimmed);
		
		tweet = tweet.substring(finish+1);
		tweetTrimmed = tweet.trim();
		
		start= tweet.indexOf("#");
		finish= tweet.indexOf(';');
		
		String longitude = tweetTrimmed.substring(start+4, finish-1);
		String longitudeTrimmed = longitude.trim();
		System.out.println(lng + longitudeTrimmed);
		
		keyboard.close();
	}

}
