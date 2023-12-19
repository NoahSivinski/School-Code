
/*
 * ParseTheTweet.java
 * Author:  Sean Payne 
 * Submission Date:  [02/12/21]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 				This program sifts through user inputted 
 * tweets for specific values/information. By the tweet being 
 * formatted a specific way the program is able to cut,
 * organize, and display the important info wanted. In this
 * program's case it is focusing on tweets dealing with 
 * urgent disasters. 
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
		// Initializing Scanner
		Scanner keyboard = new Scanner(System.in);

		// Initializing Variables
		String userTweet; // User inputted tweet
		String type; // Type of Disaster
		String detail; // Specific details/context related to the disaster
		String location;
		String latitude;
		String longitude;

		// Prompting User Input
		System.out.println("Enter a tweet below");
		userTweet = keyboard.nextLine();

		/*
		 * Section splitting and pulling the important information from the user inputed
		 * tweet
		 */
		type = userTweet.split(";")[0]; // Separates #typ and stores the string
		type = type.trim().substring(5, type.length()).toUpperCase();
		detail = userTweet.split(";")[1]; // Separates #det and stores the string
		detail = detail.trim().substring(5, detail.length() - 1);
		location = userTweet.split(";")[2]; // Separates #loc and stores the string
		location = location.trim().substring(5, location.length() - 1);
		latitude = userTweet.split(";")[3]; // Separates #lat and stores the string
		latitude = latitude.trim().substring(5, latitude.length() - 1);
		longitude = userTweet.split(";")[4]; // Separates #lng and stores the string
		longitude = longitude.trim().substring(5, longitude.length() - 1);

		// Displays the extracted information in an organized fashion
		System.out.println("Type:\t\t " + type.trim()); // Use .trim() to cover the tweet with or without quotations
		System.out.println("Detail:\t\t " + detail.replace(",", "-")); // .replace() replaces commas with hyphens
		System.out.println("Location:\t " + location.replace(",", "-"));
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);

		// Closes the Scanner "userTweet"
		keyboard.close();

	}
}
