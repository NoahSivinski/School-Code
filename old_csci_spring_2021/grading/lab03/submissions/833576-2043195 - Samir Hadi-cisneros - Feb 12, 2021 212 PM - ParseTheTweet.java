/*
 * ParseTheTweet.java
 * Author: Samir Hadi Cisneros 
 * Submission Date:  12 February 2021
 *
 * Purpose: This program scans a tweet for useful information denoted by hashtags and outputs
 * the information to provide a more effective way of looking at tweets.
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
 * 
 * I agree
 * 
 */
import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {
	
	//prompt the user to Enter a Tweet and store it in the variable named tweet
	Scanner cs = new Scanner(System.in);
	System.out.println("Enter Tweet Below:");
		String tweet= cs.nextLine();
	
		
		//split the "type" information from the rest of the tweet
		//use the start and finish variables to hold the indexes of where each substring starts and finishes
		int start= 0;
		int finish= tweet.indexOf(";");
		String type=(tweet.substring(start+5, finish));
		type= type.toUpperCase();
	
		
		//split the "detail" information from the rest of the tweet
		//use the trim method to extract the substring from the tweet
		tweet=tweet.substring(finish+1);
		start=0;
		finish=tweet.indexOf(";");
		String detail=(tweet.substring(start+5, finish)).trim();
		detail=detail.replaceAll(",","-");
		
		
		//split the "location" information from the rest of the tweet
		//use the replaceAll method to replace replace commas  with a hyphen
		tweet=tweet.substring(finish+1);
		finish=tweet.indexOf(";");
		String location=(tweet.substring(start+5, finish)).trim();
		location=location.replaceAll(",","-");
		
		
		//split the "latitude" information from the rest of the tweet
		tweet=tweet.substring(finish+1);
		finish=tweet.indexOf(";");
		String latitude=(tweet.substring(start+5, finish )).trim();
		tweet=tweet.substring(finish+1);
		
		
		//split the "longitude" information from the rest of the tweet
		finish=tweet.indexOf(";");
		String longitude=(tweet.substring(start+5, finish)).trim();
		
		
		//using printf() method and the %n to split up lines and more easily format the strings
		//the %-25s formats the width between the identifiers and their information
		
		System.out.printf("%-24s%s\n%-25s%s\n%-25s%s\n%-25s%s\n%-25s%s\n","Type:",type,"Detail:",detail,"Location:",location,
	               "Latitude:",latitude,"Longitude:",longitude);
		cs.close();
				

		
		}


	}

