/*
 * ParseTheTweet.java
 * Author: Jarvis Williams
 * Submission Date:  2/10/2021
 *
 * Purpose: The purpose of this program is to calculate the amount of months
 * needed to pay off credit card debt given principal amount, annual interest rate,
 * and monthly payment.
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

//Importing Scanner for user input.
import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		//Initializing the scanner for inputs.
		Scanner input = new Scanner(System.in);
		
		//User input for tweet as a string.
		System.out.println("Enter a tweet below");
		String tweet = input.nextLine();
		
		//Setting the index of the substring length
		int start = tweet.indexOf('#');
		int finish = tweet.indexOf(';');
		 
		//Extracting the value of type
		String type = tweet.substring(start + 5, finish);
			type = type.trim();
			tweet = tweet.substring(finish + 1);
			type = type.toUpperCase();
			
			//setting variable for beginning and end of substring
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');
			
		//Extracting the value of detail
		String detail = tweet.substring(start + 5, finish);
			detail = detail.trim();
			tweet = tweet.substring(finish + 1);
			detail = detail.replace(';' , '-');
			
			//setting variable for beginning and end of substring
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');

		//Extracting the value of location
		String location = tweet.substring(start + 5, finish);
			location = location.trim();
			tweet = tweet.substring(finish + 1);
			location = location.replace(';' , '-');
				
			//setting variable for beginning and end of substring
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');
		
		//Extracting the value of latitude
		String latitude = tweet.substring(start + 5, finish);
			latitude = latitude.trim();
			tweet = tweet.substring(finish + 1);
			
			//setting variable for beginning and end of substring
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');
			
		//Extracting the value of longitude
		String longitude = tweet.substring(start + 5, finish);
			longitude = longitude.trim();
			tweet = tweet.substring(finish + 1);
				
			//setting variable for beginning and end of substring
			start = tweet.indexOf('#');
			finish = tweet.indexOf(';');
			
		//Output of values as TtT data
		System.out.println("Type: \t\t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
			
		//Close the scanner.
		input.close();
		
		

	}

}
