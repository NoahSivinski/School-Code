/*
 * ParseTheTweet.java
 * Author:  Jacob Glover 
 * Submission Date:  2/9/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program receives a tweet
 * from input, and it parses specific information between the 
 * hashtags and semicolons to compile data. The data is printed
 * into the output.
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
		
			//creates Scanner object
			Scanner input = new Scanner(System.in);
		
			// These lines prompt the user to enter a tweet.
			System.out.println("Enter your tweet below."); 
			String tweet = input.nextLine(); 
			
			/* The following lines of code find the index of each respective
			 * variable and its place in the input. This finds the starting
			 * point of the variable's parced data
			 */
			int positionType = tweet.indexOf("#typ");
			int positionDetail = tweet.indexOf("#det");
			int positionLocation = tweet.indexOf("#loc");
			int positionLattitude = tweet.indexOf("#lat");
			int positionLongitude = tweet.indexOf("#lng");
			int positionLongitude2 = tweet.lastIndexOf(";");
			
			/* The next lines of code use the index to indicate 
			 * where the beginning and the end of the parced data
			 * should be. This is necessary to use substring.
			 */
			String type = tweet.substring(positionType+4, positionDetail-2);
			String newType1 = type.toUpperCase(); //capitalizes the string
			String newType = newType1.trim(); //trims the edges of the string
			
			String detail = tweet.substring(positionDetail+4, positionLocation-2);
			String newDetail = detail.trim();
			newDetail.replace(',', '-'); //replaces all commas with hyphens 
			
			
			String location = tweet.substring(positionLocation+4, positionLattitude-2);
			String newLocation = location.trim();
			newLocation.replace(',', '-'); 
			
			String lattitude = tweet.substring(positionLattitude+4, positionLongitude-2);
			String newLattitude = lattitude.trim();
			
			/* Longitude ends with a different value because it is the end of the input.
			 * This is necessary to remove the last semicolon.
			 */
			String longitude = tweet.substring(positionLongitude+4, positionLongitude2); 
			String newLongitude = longitude.trim();
			
			// The following code displays the output of the parced data.
			System.out.println("Type:\t\t" + newType);
			System.out.println("Detail:\t\t" + newDetail);
			System.out.println("Location:\t" + newLocation);
			System.out.println("Lattitude:\t" + newLattitude);
			System.out.println("Longitude:\t" + newLongitude);
			input.close();

		}
}
