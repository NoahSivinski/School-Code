/* 
 * PayoffDebt.java
 * Author:  Allan Waweru
 * Submission Date:  [01/12/2021]
 *
 * Purpose: This program will Sift through  tweets for useful information
 *
 * Statement of Academic Honesty: The following code represents my own work. I have neither
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
		 System.out.print("Enter Tweet: ");
	
		 
		String type, detail, location, longitude, latitude;
		int first;
		int last;
	
		String tweet = keyboard.nextLine();
			first = tweet.indexOf("#typ");
			last = tweet.indexOf(";");
			type = tweet.substring(first + 5,last);
			tweet = tweet.substring(last + 2, tweet.length());
			type.trim();
			
			first = tweet.indexOf("#det");
			last = tweet.indexOf(";");
			detail = tweet.substring(first + 5, last);
			tweet = tweet.substring(last + 2, tweet.length());
			detail.trim();
			
			
			first = tweet.indexOf("#loc");
			last = tweet.indexOf(";");
			location = tweet.substring(first + 5, last);
			tweet = tweet.substring(last + 2, tweet.length());
			location.trim();
		
			
			first = tweet.indexOf("#lat");
			last = tweet.indexOf(";");
			latitude = tweet.substring(first + 5, last);
			tweet = tweet.substring(last + 2, tweet.length());
			latitude.trim();
			
			first = tweet.indexOf("#long");
			last = tweet.indexOf(";");
			longitude = tweet.substring(first + 6, last);
			longitude.trim();
			

			
			
			
			System.out.println("Type: \t\t " + type.toUpperCase());
		       System.out.println("Detail: \t" + detail.replace(',', '-'));
		       System.out.println("Location: \t" + location);
		       System.out.println("Latitude: \t" + latitude.replace(',', '-'));
		       System.out.println("Longitude: \t" + longitude);


		 
		 
		       keyboard.close();
		  
		 
		 
	}
	

}
