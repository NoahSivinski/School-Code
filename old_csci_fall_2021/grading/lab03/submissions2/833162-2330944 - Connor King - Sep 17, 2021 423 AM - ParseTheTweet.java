

/*
 * [ParseTheTweet].java
 * Author:  [Connor King] 
 * Submission Date:  [9/17/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? 
 * - This program takes a user input tweet and outputs the type, location, latitude, latitude and other details as well.
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
    String tweet, typ, det, loc, lat, lng; 
    //typ = Type , det = Detail, loc = Location, lat = Latitude, lng = Longitude.
    // I do not understand why "start" and "finish" variables are needed.
    System.out.println("Enter a tweet below:");
    tweet = keyboard.nextLine();
    typ = tweet.split(";")[0]; // "[] declares what is used instead of using "start and finish" variables
    det = tweet.split(";")[1]; // Shown in Chapter 7.
    loc = tweet.split(";")[2];
    lat = tweet.split(";")[3];
    lng = tweet.split(";")[4];
    typ = typ.trim().substring(5, typ.length()).toUpperCase();	// use .length to get the full value of the array
	det = det.trim().substring(5, det.length()-1);        
	loc = loc.trim().substring(5, loc.length()-1).replace(",", "-");
	lat = lat.trim().substring(5, lat.length()-1).replace(",", "-"); // replace method gets rid of commas
	lng = lng.trim().substring(5, lng.length()-1).replace(",", "-");
   
    System.out.println("Type:           " + typ);
	System.out.println("Detail          " + det);
	System.out.println("Location:       " + loc);
	System.out.println("Latitude:       " + lat);
	System.out.println("Longitude:      " + lng);
}

}



