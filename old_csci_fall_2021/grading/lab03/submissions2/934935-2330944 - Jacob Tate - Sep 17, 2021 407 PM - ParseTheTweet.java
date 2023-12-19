/*
 * ParseTheTweet.java
 * Author:  Jacob Tate 
 * Submission Date:  Friday, September 17, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The purpose of the program is to split up (parse)
 * the information from a user-inputted tweet into 5 different types
 * of information based on hashtags. Using the substring method, it is possible
 * to take a segment of the tweet and store it in a value without removing that
 * section of the tweet. Later on, after said information is stored in its value,
 * we move to the next part of the tweet by using the substring method to start a 
 * new tweet by starting at the end of the previous part. The process is repeated
 * until the very end of the tweet is reached by the substring method. 
 * 
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
		System.out.println("Enter a tweet below: ");
		Scanner keyboard = new Scanner(System.in);
		String TWEET = keyboard.nextLine();
		int START = TWEET.indexOf("#");
		int FINISH = TWEET.indexOf(";");
		String TYPE = TWEET.substring(START + 4,FINISH).toUpperCase();
		//Above code initializes a Scanner to input the tweet, then, using int variables, begins to log the first piece of information. 
		
		String NEWTWEET = TWEET.substring(FINISH+1).trim();
		START = NEWTWEET.indexOf("#");
		FINISH = NEWTWEET.indexOf(";");
		String DETAIL = NEWTWEET.substring(START+4,FINISH).replace(',', '-');
		
		NEWTWEET = NEWTWEET.substring(FINISH+1).trim();
		START = NEWTWEET.indexOf("#");
		FINISH = NEWTWEET.indexOf(";");
		String LOCATION = NEWTWEET.substring(START+4, FINISH).replace(',', '-');
		
		
		NEWTWEET = NEWTWEET.substring(FINISH+1).trim();
		START = NEWTWEET.indexOf("#");
		FINISH = NEWTWEET.indexOf(";");
		String LATITUDE = NEWTWEET.substring(START+4, FINISH);
		
		NEWTWEET = NEWTWEET.substring(FINISH+1).trim();
		START = NEWTWEET.indexOf("#");
		FINISH = NEWTWEET.indexOf(";");
		String LONGITUDE = NEWTWEET.substring(START+4,FINISH);
		/*Above code creates a new tweet based on the original tweet for each section, reinitializes the int variables 
		 * START and FINISH each time for each section of the tweet, then the specified information 
		 * is stored in its respective variable. 
		 */
		
		System.out.println("Type: " + '\t'+ '\t' + TYPE);
		System.out.println("Detail: " + '\t' + DETAIL);
		System.out.println("Location: " + '\t' + LOCATION);
		System.out.println("Latitude: " + '\t' + LATITUDE);
		System.out.println("Longitude:" + '\t' + LONGITUDE);
		System.exit(0);
		//Above code prints out the various information we wanted to find, then stops the program from continuing to run. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
