/*
 * ParseTheTweet.java
 * Author:  Anvita Shreya Nagireddi
 * Submission Date: February 12, 2021
 *
 * Purpose:  to read a tweet and separate the contents into various components
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
 * 
 */
import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {
		System.out.println("Enter a tweet below:");
		Scanner scan = new Scanner (System.in);
		String tweet = scan.nextLine();
		
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		String type = tweet.substring(start + 5,finish);	
		System.out.println("Type:" + "\t\t" + type.toUpperCase());
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		String det = tweet.substring(start + 5,finish);
		System.out.println("Details:" + "\t" + det.replace(",", "-"));
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		String loc = tweet.substring(start + 5,finish);
		System.out.println("Location:" + "\t" + loc.replace(",", "-"));
	
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		String lat = tweet.substring(start + 5,finish);
		System.out.println("Latitude:" + "\t" + lat);
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		String lng = tweet.substring(start + 5,finish);
		System.out.println("Longitude:" + "\t" + lng);

		
	}

}
