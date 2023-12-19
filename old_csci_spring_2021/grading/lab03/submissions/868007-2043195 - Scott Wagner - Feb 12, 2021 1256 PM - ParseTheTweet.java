/*
 * ParseTheTweet.java
 * Author:  Scott Wawgner 
 * Submission Date:  2/11/2021
 *
 * This Program interprets Tweets, then organizes and outputs data from specified hashtags.
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

		Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter a tweet below");
			String tweetBody = scan.nextLine();
			
				String type, location, details, latitude, longitude;
				int start, finish;
				
					start = tweetBody.indexOf("#typ");
					finish = tweetBody.indexOf(';');
						type = tweetBody.substring((start + 5), finish);
						type = type.trim();
						type = type.toUpperCase();
							System.out.println("Type:\t\t" + type);
					
					start = finish + 1;
					finish = tweetBody.indexOf(';', start);
						details  = tweetBody.substring((start + 5), finish);
						details = details.trim();
						details = details.replace(',', '-');
							System.out.println("Detail:\t\t" + details);
					
					start = finish + 1;
					finish = tweetBody.indexOf(';', start);
						location = tweetBody.substring((start + 5), finish);
						location = location.trim();
						location = location.replace(',', '-');
							System.out.println("Location:\t" + location);
					
					start = finish + 1;
					finish = tweetBody.indexOf(';', start);
						latitude = tweetBody.substring((start + 5), finish);
						latitude = latitude.trim();
							System.out.println("Latitude:\t" + latitude);
					
					start = finish + 1;
					finish = tweetBody.indexOf(';', start);
						longitude = tweetBody.substring((start + 5), finish);
						longitude = longitude.trim();
							System.out.println("Longitude:\t" + longitude);
					
								
		
		scan.close();
	}

	

}
