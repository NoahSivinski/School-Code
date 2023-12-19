/*
 * ParseTheTweet.java
 * Author:  Asia Grant 
 * Submission Date:  September 15th, 2021
 *
 * Purpose: The purpose of this program is to parse a tweet that 
 * is input by the user. the program takes the tweet that is entered
 * and gives the user the type, detail, location, latitude, and longitude.
 * This program is supposed to break the tweet down to a form thats 
 * easier to read and comprehend.
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
		Scanner keyboard= new Scanner(System.in);
		// This line of code creates the scanner object and allows the user 
		// to input tweets through the keyboard.
		System.out.println("Enter a tweet below");
		String tweet= keyboard.nextLine();
		// this line of code assigns the string tweet to what ever the user 
		//inputs in the computer.
		
		String type;
		String location;
		String detail;
		String latitude;
		String longitude;
		//These lines of codes declare the variables of type string that are used
		// in the following program.
		
		int start=tweet.indexOf("#");
		int finish=tweet.indexOf(";");
		// these lines of code declare the variables start and finish as intergers
		// they also assign the variable to specific indices in the string 'tweet'.
		
		start= start+ 5;
		// this line of code moves up the variable start up 5 indices so that the varibale
		// start doesnt grab the first 5 characters (the hashtag, tweet initals, and white space)
		//in the tweet substring.
		
	    type= tweet.substring(start, finish);
	    type=type.trim();
	    // these lines of code  assign the variable type to what is in between the start and finish 
	    // varible and creates a sub string. line 58 removes the white spaces from in front and behind
	    // the substring.
	    
	    tweet= tweet.substring(finish+1);
	   	start= tweet.indexOf("#");
	    finish= tweet.indexOf(";");
	    start=start+5;
	    detail= tweet.substring(start,finish);
	    detail= detail.trim();

	    
	    tweet=tweet.substring(finish+1);
	    start=tweet.indexOf("#");
	    finish= tweet.indexOf(";");
	    start= start+5;
	    location= tweet.substring(start,finish);
	    location= location.trim();
	    
	    tweet=tweet.substring(finish+1);
	    start=tweet.indexOf("#");
	    finish= tweet.indexOf(";");
	    start= start+5;
	    latitude= tweet.substring(start,finish);
	    latitude= latitude.trim();
	    
	    tweet=tweet.substring(finish+1);
	    start=tweet.indexOf("#");
	    finish= tweet.indexOf(";");
	    start= start+5;
	    longitude= tweet.substring(start,finish);
	    longitude= longitude.trim();
	    
		
		type=type.toUpperCase();
		// This line of code makes the string type go from lowercase to uppercase.
		detail=detail.replace (',','-');
		location=location.replace (',','-');
		// these lines of code replace the commas with hyphens in the detail and location strings.
		System.out.println("Type:\t\t"+type);
		System.out.println("Detail:\t\t"+detail);
		System.out.println("Location:\t"+location);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
		// The lines of code above output the varibles with their designated name based off the tweet 
		// that was input by the user.
		keyboard.close();
 
	}
}
