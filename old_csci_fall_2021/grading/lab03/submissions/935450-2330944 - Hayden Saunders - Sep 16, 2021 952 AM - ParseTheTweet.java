/*
 * ParseTheTweet.java
 * Author:  Hayden Saunders
 * Submission Date:  9/16/21
 *
 * Purpose: The purpose of this program is to first prompt a 
 * user for a tweet message which is inputed in a certain 
 * structure. This specific structure then allows the computer 
 * to process these messages and pull out the specific 
 * information from the emergency message and then display 
 * it on the screen. Specifically, it pulls out the type,
 * details, location, latitude, and longitude of the 
 * emergency and then outputs this information. 
 * 
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
		
		//Intializing String Variables 
		String tweet;
		String type;
		String detail;
		String location;
		String latitude; 
		String longitude;
		
		//Prompt user to input tweet
		System.out.println("Enter a tweet below");
		tweet = keyboard.nextLine();
		
		//Intialize start and finish integer variables
		int start; 
		int finish;
		
		//Parse the tweet string for type information
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 5, finish);
		type = type.trim();
		type = type.toUpperCase();
		tweet = tweet.substring(finish + 1);
		
		//Parse the tweet string for detail information
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start + 5, finish);
		detail = detail.trim();
		detail = detail.replace(',', '-');
		tweet = tweet.substring(finish + 1);
        
		//Parse the tweet string for location information
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5, finish);
		location = location.trim();
		location = location.replace(',', '-');
		tweet = tweet.substring(finish + 1);
        
		//Parse the tweet string for latitude information
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5, finish);
		latitude = latitude.trim();
		tweet = tweet.substring(finish + 1);
        
		//Parse the tweet string for longitude information 
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5, finish);
		longitude = longitude.trim();
		tweet = tweet.substring(finish + 1);
        
		//Print statements stored in each string variable that was parsed from the tweet string 
		System.out.print("Type:    \t" + type + "\n");
		System.out.print("Detail: \t" + detail + "\n");
		System.out.print("Location: \t" + location + "\n");
		System.out.print("Latitude: \t" + latitude + "\n");
		System.out.print("Longitude: \t" + longitude + "\n");
		
        
		keyboard.close();
	}

}
