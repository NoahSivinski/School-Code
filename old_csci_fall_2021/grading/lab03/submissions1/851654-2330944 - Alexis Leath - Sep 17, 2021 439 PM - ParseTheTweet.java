/*
 * ParseTheTweet.java
 * Author:  Alexis Leath
 * Submission Date:  09/17/2021
 *
 * Purpose: The code is meant to break down a tweet that is entered by the end user.
 * The tweet is broken down and the output will display the type of tweet,details of the tweet,Location 
 * from where the tweet was sent from, and the latitude and longitude of the tweet.
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
		String tweet;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();

		type = tweet.split(";")[0];
		detail = tweet.split(";")[1];
		location = tweet.split(";")[2];
		latitude = tweet.split(";")[3];
		longitude = tweet.split(";")[4];

		type = type.trim().substring(5, type.length()).toUpperCase();
		detail = detail.trim().substring(5, detail.length()-1).replaceAll(",","-");
		location = location.trim().substring(5, location.length()-1).replaceAll(",", "-");
		latitude = latitude.trim().substring(5,latitude.length()-1).replaceAll(",", "-");
		longitude = longitude.trim().substring(5,longitude.length()-1).replaceAll(",", "-");


		System.out.println("Type:\t\t" + type); 
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t"+ longitude);

		keyboard.close();
	}

}
