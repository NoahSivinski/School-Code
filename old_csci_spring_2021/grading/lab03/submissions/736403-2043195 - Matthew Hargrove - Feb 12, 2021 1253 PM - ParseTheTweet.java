/*
 * ParseTheTweet.java
 * Author:  Matthew Hargrove 
 * Submission Date:  Feb. 11 2021
 *
 * Purpose: To divide tweets based on the #tags and then give the info to you in a strctured format
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
		Scanner keyboard=new Scanner(System.in);
		String tweet=keyboard.nextLine();
		
		String typ, loc, det, lat, lng;
		
		int start, finish;
		start=tweet.indexOf("#typ");
		finish=tweet.indexOf(";");
		
		typ=tweet.substring(start+4, finish);
		String Typ=typ.trim().toUpperCase();
//		System.out.println(start);
//		System.out.println(finish);
		System.out.println("Type:\t\t"+Typ);
		
		int finish2=tweet.indexOf("#loc");
		det=tweet.substring(finish+6,finish2-2);
//		System.out.println(finish+5);
//		System.out.println(finish2);
		String Det=det.trim();
		System.out.println("Detail:\t\t"+Det);
		
		int finish3=tweet.indexOf("#lat");
		loc=tweet.substring(finish2+4, finish3-2);
		String Loc=loc.trim();
		System.out.println("Location:\t"+Loc);
		
		int finish4=tweet.indexOf("#lng");
		lat=tweet.substring(finish3+4, finish4-2);
		String Lat=lat.trim();
		System.out.println("Latitude:\t"+Lat);
		
		int finish5=tweet.lastIndexOf(";");
		lng=tweet.substring(finish4+4,finish5);
		String Lng=lng.trim();
		System.out.println("Longitude:\t"+Lng);
		
		
		
		
		
	}

}
