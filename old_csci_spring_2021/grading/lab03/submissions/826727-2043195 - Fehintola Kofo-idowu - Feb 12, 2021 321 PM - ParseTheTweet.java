/*
 * [CSCI 1301].java
 * Author:  [Fehintola Kofo-Idowu] 
 * Submission Date:  [2/12/2021]
 *
 * Purpose: This code aims pulling out pieces of information from a sentence,
 * and print out these informations separately rather than being in a sentence.
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

		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Enter a Tweet Below\n");// Allows user to input Tweet(sentence).
		String tweet = keyboard.nextLine();

		//Declares the variable to hold the informations as strings
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;

		int start = tweet.indexOf("#");//finds the first "#" character in the tweet and assigns it to the variable "start"
		int finish = tweet.indexOf(";");//finds the first ";" character in the tweet and assigns it to the variable "finish"
		type = tweet.substring(start + 5, finish);//extracts a substring from the tweet skipping the "#" and the 5 character that follows,
		//then assigning it to the "type" variable
		type = type.trim();//removes the extra white spaces in the string extracted and assigned to "type" 
		type=type.toUpperCase();// converts "type" string to uppercase. 

		//repeat same steps taken to get "type" to find "detail"
		//Add 1 to finish variable to skip the next whitespace after ";"
		tweet = tweet.substring(finish+1);
		start= tweet.indexOf("#");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start+5,finish);
		detail=detail.trim();
		detail=detail.replace(',', '-');//this replaces the character ',' with '-'

		//repeat same steps taken to get "detail" to find "location"
		tweet=tweet.substring(finish+1);
		start=tweet.indexOf("#");
		finish=tweet.indexOf(";");
		location = tweet.substring(start+5, finish);
		location=location.trim();
		location=location.replace(',', '-');
		//repeat same steps taken to get "detail" to find "latitude"
		tweet = tweet.substring(finish+1);
		start= tweet.indexOf("#");
		finish = tweet.indexOf(";");
		latitude = tweet.substring(start+5, finish);
		latitude=latitude.trim();

		//repeat same steps taken to get "detail" to find "longitude"
		tweet = tweet.substring(finish+1);
		start= tweet.indexOf("#");
		finish = tweet.indexOf(";");
		longitude = tweet.substring(start+5, finish);
		longitude=longitude.trim();



		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);



		keyboard.close();
	}


}
