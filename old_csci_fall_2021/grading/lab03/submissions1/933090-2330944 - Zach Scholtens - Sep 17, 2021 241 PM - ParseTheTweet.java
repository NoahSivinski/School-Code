/*
 * ParseTheTweet.java
 * Author:  Zach Scholtens 
 * Submission Date:  09/17/21
 *
 * Purpose: The purpose of this program is to parse a tweet that the user inputs and then outputs 
 * the users input in an organized way
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
import java.util.Scanner ; 
public class ParseTheTweet {
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);	
		
		int start , finish ; 
		
		System.out.println("Enter a tweet below") ; 
		
		String tweet = keyboard.nextLine();
		start =  tweet.indexOf(0) ;
		finish = tweet.indexOf(";") ;
		
		String type , location , details , latitude , longitude  ; 
		type = tweet.substring(start + 6,finish).trim() ;
		tweet = tweet.substring(finish + 2) ;
		finish = tweet.indexOf(";");
		details = tweet.substring(start + 5,finish).trim() ;
		details = details.replace(',','-');
		tweet = tweet.substring(finish + 2) ;
		finish = tweet.indexOf(";");
		location = tweet.substring(start + 5,finish).trim() ;
		location = location.replace(',', '-');
		tweet = tweet.substring(finish + 2) ;
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start + 5, finish).trim() ;
		tweet = tweet.substring(finish + 2) ;
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start + 5,finish).trim() ;
		
		System.out.println("Type:		 " + type.toUpperCase());
		System.out.println("Detail:		 " + details);
		System.out.println("Location:	 " + location);
		System.out.println("Latitude:	 " + latitude);
		System.out.println("Longitude:	 " + longitude);
		
		keyboard.close();
		
		
	}

}
