/*
 * CSCI1301.java
 * Author: Rayman Ng
 * Submission Date: 2/12/2021
 *
 * Purpose: It sifts through tweets, picks out their tags, and lists the tweet's prevelant information based on its tags in a reader friendly manner.  
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
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		type = tweet.substring(start + 4, finish);
		type = type.toUpperCase();
		type = type.trim();
		
		tweet =tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5, finish);
		detail = detail.replace(",", "-");
		detail = detail.trim();
		
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 6, finish);
		location = location.replace(",", "-");
		location = location.trim();
		
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 6, finish);
		latitude = latitude.trim();
		
		tweet = tweet.substring(finish + 1);
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 6, finish);
		longitude = longitude.trim();
		
		System.out.println("Type:" + '\t' + '\t' +  type);
		System.out.println("Detail:" + '\t' + '\t' + detail);
		System.out.println("Location:" + '\t' + location);
		System.out.println("Latitude:" + '\t' + latitude);
		System.out.println("Longitude:" + '\t' + longitude);
		keyboard.close();

	}

}
