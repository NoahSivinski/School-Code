/**
 * 
 */

/**
 * @author hunterschramm
 *
 */
/*
 * [ParseTheTweet].java
 * Author:  [Hunter Schramm] 
 * Submission Date:  [02/12/21]
 *
 * Purpose: This program is used to remove "hashtags" and properly seperate and print
 * tweet strings.
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Tweet: ");
	    String tweet = keyboard.nextLine();
	    
	    int start = tweet.indexOf("#");
	    int finish = tweet.indexOf(";");
	    
		String type = tweet.trim().substring(start+4,finish).toUpperCase();
		
		String subtweet1=tweet.substring(finish+1);
		
		start = subtweet1.indexOf("#");
	    finish = subtweet1.indexOf(";");
	    
	    String detail = subtweet1.trim().substring(start+4,finish-1).replaceAll(",", "-");
	    
	    String subtweet2=subtweet1.substring(finish+1);
	    
	    start = subtweet2.indexOf("#");
	    finish = subtweet2.indexOf(";");
	    
	    String location = subtweet2.trim().substring(start+4,finish-1).replaceAll(",", "-");
	    
	    String subtweet3=subtweet2.substring(finish+1);
	    
	    start = subtweet3.indexOf("#");
	    finish = subtweet3.indexOf(";");
	    
	    String latitude = subtweet3.trim().substring(start+4,finish-1).replaceAll(",", "-");
	    
	    String subtweet4=subtweet3.substring(finish+1);
	    
	    start = subtweet4.indexOf("#");
	    finish = subtweet4.indexOf(";");
	    
	    String longitude = subtweet4.trim().substring(start+4,finish-1).replaceAll(",", "-");
	    
	    System.out.println("Type: " + type + "\t");
	    System.out.println("Detail: " + detail + "\t");
	    System.out.println("Location: " + location + "\t");
	    System.out.println("Latitude: " + latitude + "\t");
	    System.out.println("Longitude: " + longitude + "\t");
	    
	}

}
