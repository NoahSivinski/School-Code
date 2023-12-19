/**
 * ParseTheTweet.java
 * Author:  Jordyn Fulbright
 * Submission Date:  February 12th
 *
 * Purpose:This program extracts information from tweets using hashtags.
 * The program reads the tweet that is input and identifies the hashtag,
 * then displays the information entered after the hashtag(s) as outputs.
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
		
		Scanner keyboard = new Scanner(System.in);
		
		String tweet;
		String type;
		String location;
		String detail;
		String longitude;
		String latitude;
		int start;
		int finish;
		
		System.out.println("Enter Tweet Below: ");
		tweet = keyboard.nextLine();
	
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 5,finish);
		//instead of declaring a new variable, I used the trim() method and the println() method together
		type = type.toUpperCase();
		System.out.println("Type:" + "\t" + "\t" + type.trim());
		
		/* in the following code you will see an algorithm of redefining the variable tweet after each piece
		 * of information is extracted and consequently redefining the variables start and finish to correspond
		 * with each new hashtag. This is so that I can extract the information after each subsequent hashtag.
		 */
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5,finish);
		detail = detail.replace(',','-');
		//instead of declaring a new variable, I used the trim() method and the println() method together
		System.out.println("Detail:" + "\t" + "\t" + detail.trim());
	
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5,finish);
		location = location.replace(',','-');
		//instead of declaring a new variable, I used the trim() method and the println() method together
		System.out.println("Location:" + "\t" + location.trim());
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5,finish);
		//instead of declaring a new variable, I used the trim() method and the println() method together
		System.out.println("Latitude:" + "\t" + latitude.trim());
		
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5,finish);
		//instead of declaring a new variable, I used the trim() method and the println() method together
		System.out.println("Latitude:" + "\t" + longitude.trim());
		
		keyboard.close();
		
	}
}
	
