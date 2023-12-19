/*
 * ParseTheTweet.java
 * Author: Angel Cyrus
 * Submission Date: February 12, 2021
 *
 * Purpose: Understanding String constants in objects
 * in order to declare, initialize, and assign variables
 * of type String.
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
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter a tweet below");
		String tweet = input.nextLine();
		
			int start = 0;
			int finish = tweet.indexOf(";");
		
			String type =(tweet.substring(start+5, finish));
			type = type.toUpperCase();
			
			tweet = tweet.substring(finish + 1);
			finish = tweet.indexOf(";");
			String detail = (tweet.substring(start+5, finish)).trim();
			detail = detail.replace(",","-");
			
			tweet = tweet.substring(finish + 1);
			finish = tweet.indexOf(";");
			String location = (tweet.substring(start+5, finish)).trim();
			location = location.replace(",","-");
			
			tweet = tweet.substring(finish + 1);
			finish = tweet.indexOf(";");
			String latitude = (tweet.substring(start+5, finish)).trim();
			tweet=tweet.substring(finish + 1);
			
			finish = tweet.indexOf(";");
			String longitude = (tweet.substring(start+5, finish)).trim();
			
			System.out.printf("%-24s%s\n%-25s%s\n%-25s%s\n%-25s%s\n%-24s%s\n","Type:",type,"Detail:",detail,"Location:",location,
		               "Latitude:",latitude,"Longitude:",longitude);
		
		input.close();
		

	}

}
