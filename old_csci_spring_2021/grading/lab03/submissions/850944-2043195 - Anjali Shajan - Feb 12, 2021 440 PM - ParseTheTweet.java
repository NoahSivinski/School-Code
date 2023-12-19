/*
 * [ParseTheTweet].java
 * Author:  [Anjali Shajan] 
 * Submission Date:  [2/09/2021]
 *
 * Purpose: The program allows a user to input to enter a tweet and figure out what each part belongs it where its type, detail,location
 * , latitude and longitude. You are able to enter any tweet and figure out from the hashtag.
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
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter a tweet below");
		String tweet= keyboard.nextLine();
		
		// declared the variable//
		String type, detail, location, latitude,longitude;
		
		
		 type =tweet.split(";") [0]; //where tweet ends//
		 type = type.trim().substring(5,type.length()).toUpperCase();// trims the tweet and helps format the letters//
		 System.out.println("Type: \t\t\t"+type);
		 
		 detail=tweet.split(";")[1];
		 detail= detail.trim().substring(5,detail.length()-1);//// trimmed each part and set value//
		 System.out.println("Detail: \t\t"+ detail);
		 
		 
		 location =tweet.split(";")[2];
		 location= location.trim().substring(5,location.length()-1);
		 System.out.println("Location: \t\t"+location);// print out each part and its value//
		 
		 
		 latitude= tweet.split(";")[3];
		 latitude= latitude.trim().substring(5,latitude.length()-1).replaceAll(",","-"); //replace comma with hypen//
		 System.out.println("Latitude: \t\t" +latitude);
		 
		 longitude = tweet.split(";")[4];
		 longitude =longitude.trim().substring(5,longitude.length()-1).replaceAll(",","-");
		 System.out.println("Longitude: \t\t"+longitude);
		 
		
		keyboard.close();
		
		
	}

}
