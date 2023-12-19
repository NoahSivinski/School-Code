/*
 * ParseTheTweet.java
 * Author:  Tushita Bansal 
 * Submission Date: 15 September, 2021
 *
 * Purpose: This program is used to add structure to "TtT" tweets to make it easier for a computer to classify them as well 
 * as sift through the tweets to get and display the useful information. This information is extremely important for 
 * emergency management agencies and even the general public. In the case of an emergency, sorting through these tweets get
 * the useful information, such as location and the form of emergency, to the right people. 
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
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a tweet below");
		String tweet = s.nextLine();
		String type, location, detail, latitude, longitude; 
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";"); 
		start = start + 5;
		
		type = tweet.substring(start,finish);
		type = type.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		start = start + 5;
		
		detail = tweet.substring(start,finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		start = start + 5;
		
		location = tweet.substring(start,finish);
		location = location.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		start = start + 5;
		
		latitude = tweet.substring(start,finish);
		latitude = latitude.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		start = start + 5;
		
		longitude = tweet.substring(start,finish);
		longitude = longitude.trim();
			
		System.out.println("Type: " + "\t\t" + type.toUpperCase());
		System.out.println("Detail:" + "\t\t" + detail.replace(",","-"));
		System.out.println("Location: " + "\t" + location.replace(",","-"));
		System.out.println("Latitude: " + "\t" + latitude);
		System.out.println("Longitude: " + "\t" +longitude);
		
		
	}

}
