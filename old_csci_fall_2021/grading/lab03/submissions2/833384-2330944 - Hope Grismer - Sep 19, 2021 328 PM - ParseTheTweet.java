/*
 * [ParseTheTweet].java
 * Author:  [Hope Grismer] 
 * Submission Date:  [September 17, 2021]
 *
 * Purpose: The purpose of this program is to change a user input (in this case, the input is a tweet with hashtags)     
 * into a categorized list of the type, detail, location, latitude, and longitude.
 * This is helpful in situations such as a disaster.
 * to help organize the mass amounts of data and communicate more effectively.
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
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in); // use of a scanner will be needed for line 32
		System.out.println("Enter a tweet below"); // prompts user input 
		String tweet = sc.nextLine(); // saves user input as the variable tweet 
		int start = 0; // starting character
		int finish = tweet.indexOf(";");
		String type = (tweet.substring(start+5, finish)).trim();
		type = type.toUpperCase(); // changes the output to uppercase for only this variable 
		tweet= tweet.substring(finish+1);
		start = 0; // assigns the starting character as 0 and intializing the start variable 
		finish = tweet.indexOf(";");
		String detail = tweet.substring(start+5, finish).trim();
		detail = detail.replaceAll(",", "-"); // removal of these characters and replacement to a dash
		tweet= tweet.substring(finish+1);
		finish = tweet.indexOf(";"); // tells program where to stop capturing each 
		String location = (tweet.substring(start+5, finish).trim());
		location = location.replaceAll(",", "-");
		tweet = tweet.substring(finish+1);
		finish = tweet.indexOf(";"); // captures the index value of a semicolon which is the end of each tweet
		String latitude = (tweet.substring(start+5, finish)).trim();
		tweet = tweet.substring(finish+1);
		finish = tweet.indexOf(";");
		String longitude = (tweet.substring (start+5, finish)).trim();

		System.out.println("Type:" + "\t" + "\t" + type);
		System.out.println("Detail:" + "\t" + "\t" + detail); 
		System.out.println("Location:" +"\t" +  location); // attaches output to the variable 
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude:"+ "\t" + longitude);



		sc.close(); // closes keyboard, exit command 



	}


}
