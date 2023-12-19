/*
 * [Intro to Computing and Program}.java
 * Author:  [Nataly Garcia] 
 * Submission Date:  [February 11 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? In the program below, the system
 * scans a line of input and takes parts of the line to obtain
 * information. For example, the input would start with "#typ value;..."
 * The program reads from after the '#typ' and uses the 'value' to 
 * print in a new line. Then, the program reads the other following 
 * variables and processes the same results with different modifications, 
 * such as changing the comma to a hyphen or making the letters in 
 * uppercase letters.
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
		System.out.println("Enter a tweet below");
		Scanner input = new Scanner(System.in);
		String tweet = input.nextLine();
		

		int start = 5;
		int finish = tweet.indexOf(";");
		String originaltype = tweet.substring(start, finish);
		String type = originaltype.trim();
		System.out.println("Type:\t\t" + type.toUpperCase());
				
		tweet = tweet.substring(finish + 2);
		finish = tweet.indexOf(";");
		String originalDetail = tweet.substring(start,finish);
		String detail = originalDetail.replace(',', '-');
		System.out.println("Detail:\t\t" + detail);
		
		tweet = tweet.substring(finish + 2);
		finish = tweet.indexOf(";");
		String originalLocation = tweet.substring(start, finish);
		String location = originalLocation.replace(',', '-');
		System.out.println("Location:\t" + location);
		
		tweet = tweet.substring(finish + 2);
		finish = tweet.indexOf(";");
		String latitude = tweet.substring(start, finish);
		System.out.println("Latitude:\t" + latitude);
		
		tweet = tweet.substring(finish + 2);
		finish = tweet.indexOf(";");
		String longitude = tweet.substring(start, finish);
		System.out.println("Longitude:\t" + longitude);
		
		input.close();
	}

}
