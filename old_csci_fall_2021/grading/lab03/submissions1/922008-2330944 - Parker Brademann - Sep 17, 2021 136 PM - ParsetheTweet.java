/*
 * ParsetheTweet.java
 * Author:  Parker Brademann
 * Submission Date:  September 17, 2021
 *
 * Purpose: To parse (break down) a Tweet's information and to display information included in a more legible way, including latitude,
 * longitude, type of Tweet (is it an emergency or not?), and the details of the Tweet.
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
public class ParsetheTweet {
	public static void main (String args[])
		{
				try (Scanner sc = new Scanner(System.in)) {
				//the "try" declaration terminates the scan operation, hence the parentheses usage
				System.out.println("Enter a tweet below: ");
				String tweet = sc.nextLine(); 
				//sets the value of the string to the user input
	
				
				
				/*REMINDER: WHEN USING THE SPLIT FUNCTION ON AN INSTANCE OF A CHARACTER APPEARING, YOU ARE INPUTTING THE ORDER OF THE
				* INSTANCE MINUS ONE
				*/
				
				String type = tweet.split(";")[0];
				//finds the first semicolon and stores everything before it as a separate string
				String detail = tweet.split(";")[1];
				//finds the second semicolon and stores everything before it as a separate string
				String location = tweet.split(";")[2];
				//finds the third semicolon and stores everything before it as a separate string
				String latitude = tweet.split(";")[3];
				//finds the fourth semicolon and stores everything before it as a separate string
				String longitude = tweet.split(";")[4];
				//finds the fifth semicolon and stores everything before it as a separate string
				
				
				
				/*trims a string at character five (the space after the hashtag and continues for the rest of the string, but utilizes a
				 * -1 operation to make the end character match the string length
				 */
				
				type = type.trim().substring(5, type.length()).toUpperCase();
				type = type.trim();
				detail = detail.trim().substring(5, detail.length()-1);
				detail = detail.trim();
				location = location.trim().substring(5, location.length()-1);
				location = location.trim();
				latitude = latitude.trim().substring(5,latitude.length()-1);
				latitude = latitude.trim();
				longitude = longitude.trim().substring(5,longitude.length()-1);
				longitude = longitude.trim();
				 
				System.out.println("\nType:\t\t" + type);
				System.out.println("Detail:\t\t" + detail);
				System.out.println("Location:\t" + location);
				System.out.println("Latitude:\t" + latitude);
				System.out.println("Longitude:\t" + longitude);
				 
			}
		}
}