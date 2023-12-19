/*
 * ParseTheTweet.java
 * Author:  Eric Shindell
 * Submission Date:  9/14/2021
 *
 * Purpose: This paragraph takes a tweet about a disaster, one that has been tweaked by Tweak the Tweet to
 * include information that is marked by a hashtag. Since this information is marked,
 * I use my code to find those markings and sort it for easier viewing, taking each
 * piece of information from the tweet and turning it into a substring for type, details,
 * location, latitude, and longitude, which are then modified if required (type is capitalized,
 *  commas are removed). Finally all of the substrings are outputted with labels clearly to see the 
 *  important information from the tweet for data or people helping solve the disasters.
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
		//A basic scanner, but for String, so I use input.NextLine();
		String tweet;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		tweet = input.nextLine();	

		//declaring my variables
		String type;
		String location;
		String detail;
		String latitude;
		String longitude;
		int start;
		int finish;
		
		/*
		 * declares ints start and finish, which are set to the #typ and ; respectively.
		 * Then separate String type into a substring of tweet using those start and finish
		 * ints, from start + 5 till finish. Finally, I trim it to get rid of spacing.
		 */
		
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		
		type = tweet.substring(start + 5, finish);
		String type_trim;
		type_trim = type.trim();
		
		/*
		 * Here I cut off #typ value; from the tweet string, allowing int finish; to
		 * be set to the next ;
		 */
		
		tweet = tweet.substring(finish + 2);
		
		/*
		 * I repeat the same steps as before, but I replace the start index with #det,
		 * and continue to change this as the substring changes to accommodate.
		 */
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		
		detail = tweet.substring(start + 5, finish);
		String detail_trim;
		detail_trim = detail.trim();
		
		tweet = tweet.substring(finish + 2);

		//repeating same steps for detail substring
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		
		location = tweet.substring(start + 5, finish);
		String location_trim;
		location_trim = location.trim();
		
		tweet = tweet.substring(finish + 2);

		//repeating same steps for latitude substring
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		
		latitude = tweet.substring(start + 5, finish);
		String latitude_trim;
		latitude_trim = latitude.trim();
		
		tweet = tweet.substring(finish + 2);
		
		//repeating same steps for final substring of longitude
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		
		longitude = tweet.substring(start + 5, finish);
		String longitude_trim;
		longitude_trim = longitude.trim();
		
		//Here I simply capitalize all of type
		type_trim = type_trim.toUpperCase();
		
		//Replaces all commas in detail_trim and location_trim with hyphens to prevent processing issues
		detail_trim = detail_trim.replace(',','-');
		location_trim = location_trim.replace(',', '-');
		
		//Final output
		System.out.println("Type: \t \t" + type_trim);
		System.out.println("Detail: \t" + detail_trim);
		System.out.println("Location: \t" + location_trim);
		System.out.println("Latitude: \t" + latitude_trim);
		System.out.println("Longitude: \t" + longitude_trim);
		
		//Close the scanner cause I want to make it a habit to close the scanner
		input.close();
	}

}
