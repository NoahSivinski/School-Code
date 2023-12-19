/*
 * ParsetheTweet.java
 * Author: Aaron Shurley
 * Submission Date:  2/11/2021
 *
 * Purpose: The purpose of this program is to translate a  typed
 * tweet into a more understandable format.
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
public class Parsethetweet {

	public static void main(String[] args) {
		Scanner keyboard =  new Scanner(System.in);
		System.out.print("Enter a tweet below\n");
		String tweet = keyboard.nextLine();
		//Separate the the  info listed under "type"//
		int start = tweet.indexOf('#');
		int finish = tweet.indexOf(";");
		
		String type = tweet.substring(start +5, finish);
		type =type.trim();
		tweet = tweet.substring(finish +1);
		//makes all outputs come out in upper case//
		type = type.toUpperCase();
		
		//Separate the info listed under detail// 
		
		start = tweet.indexOf('#');
		 finish = tweet.indexOf(";");
	
		String detail= tweet.substring(start +5, finish);
		detail=detail.trim();
		tweet= tweet.substring(finish +1);
		detail = detail.replace(',','-');
		
		//Separate the info  listed as location//
		
		start = tweet.indexOf('#');
		 finish = tweet.indexOf(";");
		
		String location = tweet.substring(start +5, finish);
		location =  location.trim();
		tweet= tweet.substring(finish +1);
		location = location.replace(',','-');
		
		//Separate  the info listed  as latitude//
		start = tweet.indexOf('#');
		 finish = tweet.indexOf(";");
		
		String latitude = tweet.substring(start +5, finish);
		latitude = latitude.trim();
		tweet= tweet.substring(finish +1);
		
		//Separate the info  listed as longitude//
		start = tweet.indexOf('#');
		 finish = tweet.indexOf(";");
		
		String longitude = tweet.substring(start +5, finish);
		longitude = longitude.trim();
		tweet= tweet.substring(finish +1);
		
		//Output the given information//
		System.out.println("Type:\t\t"+ type);
		System.out.println("Detail:\t\t"+ detail);
	    System.out.println("Location:\t"+ location);
		System.out.println("Latitude:\t"+ latitude);
		System.out.println("Longitude:\t"+ longitude);
		
		
		
		
	keyboard.close();	
	}

}
