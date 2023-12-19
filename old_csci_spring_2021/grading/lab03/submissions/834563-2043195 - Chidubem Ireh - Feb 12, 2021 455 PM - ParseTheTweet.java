/*
 * ParseTheTweet.java
 * Author:  Chidubem Ireh 
 * Submission Date:  2/12/2021
 *
 * Purpose: The purpose of this program is to categorize tweets into different hashtags
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

		Scanner keyboard = new Scanner(System.in);
		System.out.println ("Enter a tweet below");
		String tweet= keyboard.nextLine();
		
		//typ
		int start = tweet.indexOf("#");
		int finish =tweet.indexOf( ";");
		
		String type= tweet.substring(start + 5, finish);
		type= type.toUpperCase().trim();
		System.out.println("Type:\t\t" + type);
		
		String tweet1=tweet.substring(finish + 1);
		
		//det
		start = tweet1.indexOf("#");
		finish =tweet1.indexOf( ";");
		String detail = tweet1.substring(start + 5 , finish);
		String detailReplace= detail.replace(',' ,'-').trim();
		System.out.println("Detail:\t\t" + detailReplace );
		
		//loc
		String tweet2= tweet1.substring(finish + 1);	
		start = tweet2.indexOf("#");
		finish =tweet2.indexOf( ";");
		String location= tweet2.substring(start + 5, finish);
		String locationReplace= location.replace(',' ,'-').trim();
		System.out.println("Location:\t" + locationReplace);
		
		//lat
		String tweet3= tweet2.substring(finish + 1);
		start = tweet3.indexOf("#");
		finish =tweet3.indexOf( ";");
		String latitude= tweet3.substring(start + 5,finish);
		String latitudeTrimmed= latitude.trim();
		System.out.println("Latitude:\t" + latitudeTrimmed);
		
		//lng
		String tweet4= tweet3.substring(finish + 1);
		start = tweet4.indexOf("#");
		finish =tweet4.indexOf( ";");
		String longitude= tweet4.substring(start + 5, finish);
		String trimmedLongitude= longitude.trim();
		System.out.println("Longitude:\t" + trimmedLongitude);
		keyboard.close();
		
		
		
	}


		
	}

	


