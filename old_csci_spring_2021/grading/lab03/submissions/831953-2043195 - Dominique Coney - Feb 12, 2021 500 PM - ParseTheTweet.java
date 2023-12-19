import java.util.Scanner;
/**
/*
 * [ParseTheTweet].java
 * Author:  [Dominique Coney] 
 * Submission Date:  [2/12/2021]
 *
 * Purpose: The purpose of this program is to create tweets on twitter using "hashtags". 
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
/**
 * @author Dominique Coney
 *
 */
public class ParseTheTweet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter A Tweet Below ");
		String tweet=keyboard.nextLine();
		int start=tweet.indexOf("#");
		int finish=tweet.indexOf(";");
		String type;
		String location;
		String detail;
		String latitude;
		String longitude;
		type=tweet.substring(start + 5, finish).trim();
		location=tweet.substring(start + 5, finish).trim();
		detail=tweet.substring(start + 5, finish).trim();
		latitude=tweet.substring(start + 5, finish).trim();
		longitude=tweet.substring(start + 5 , finish).trim();
		System.out.println(" Type: " + type.toUpperCase());
		System.out.println(" Location: " + location.replace(",","-"));
		System.out.println(" Detail: " + detail.replace(",","-"));
		System.out.println(" Latitude: " + latitude);
		System.out.println(" Longitude: " + longitude);
		keyboard.close();
		
		
		
		
		
		
		
		

	}

}
