/*
 * ParseTheTweet.java
 * Author:  Nazha Erakat 
 * Submission Date: 2/12/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? 
 * This program takes in a tweet and organizes the details into specific categories. The tweet gives you a type of media, details of the tweet, the location of the tweet, and the latitude and longitude coordinates. This program uses String methods to organize everything.
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
		
		System.out.print("Enter a tweet below:\n");
		
		String tweet = keyboard.nextLine();
		
			
		int start = tweet.indexOf("#"); 
		int finish = tweet.indexOf(";");
		  
		
		String type = tweet.substring(start + 5 , finish);
			type = type.trim();
			tweet = tweet.substring(finish + 1); 
			type = type.toUpperCase();
				
			
			start = tweet.indexOf("#"); 
			finish = tweet.indexOf(";"); 
				
				
		String detail = tweet.substring(start + 5 , finish).replace(',' , '-');
			detail = detail.trim();  
			tweet = tweet.substring(finish + 1); 
			
				
			start = tweet.indexOf("#");
			finish = tweet.indexOf(";"); 
			
				
		String location = tweet.substring(start + 5 , finish).replace(',' , '-');
			location = location.trim();  
			tweet = tweet.substring(finish + 1); 
		
			
			start = tweet.indexOf("#");
			finish = tweet.indexOf(";");
				
		 
		String latitude = tweet.substring(start + 5 , finish); 
			latitude = latitude.trim(); 
			tweet = tweet.substring(finish + 1);
			 
	
			start = tweet.indexOf("#");
			finish = tweet.indexOf(";"); 
				
				
		String longitude = tweet.substring(start + 5 , finish); 
			longitude = longitude.trim(); 
			tweet = tweet.substring(finish + 1); 
	 
		
		
		System.out.println("Type:\t\t\t" + type); 
		System.out.println("Detail:\t\t\t" + detail);	
		System.out.println("Location:\t\t" + location); 
		System.out.println("Latitude:\t\t" + latitude);
		System.out.println("Longitude:\t\t" + longitude);
		
		

	}

}
