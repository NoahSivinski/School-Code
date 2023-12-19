/*
 * ParseTheTweet.java

 * Author:  Vietmy Vo
 * Submission Date:  2/12/2021
 *
 * Purpose: The purpose of this program is to a take a tweet and output the value in the tweet. In
 * the case of this program we want the value thats between each # and semicolon. For example the tweat
 * could have #typ exac;. The output of the program would give you evac.
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
		
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();
		String replaceTweet = tweet.replace(',','-');
		

		String type, location, detail, latitude, longitude;
		
		
		System.out.print("Type:\t\t");
		int start = replaceTweet.indexOf("#");
		int finish = replaceTweet.indexOf(";");
		type = replaceTweet.substring(start + 5, finish);
        System.out.println(type.toUpperCase().trim());
        replaceTweet = replaceTweet.substring(finish+1); 
        
        System.out.print("Detail:\t\t");
        start = replaceTweet.indexOf("#");
        finish = replaceTweet.indexOf(";");
        detail = replaceTweet.substring(start + 5, finish);
        System.out.println(detail.trim());
        replaceTweet = replaceTweet.substring(finish+1);
        
        System.out.print("Location:\t");
        start = replaceTweet.indexOf("#");
        finish = replaceTweet.indexOf(";");
        location = replaceTweet.substring(start + 5, finish);
		System.out.println(location.trim());
		replaceTweet = replaceTweet.substring(finish+1);
		
		System.out.print("Latitude:\t");
		start = replaceTweet.indexOf("#");
        finish = replaceTweet.indexOf(";");
        latitude = replaceTweet.substring(start + 5, finish);
        System.out.println(latitude.trim());
        replaceTweet = replaceTweet.substring(finish+1);
        
        System.out.print("Longitude:\t");
        start = replaceTweet.indexOf("#");
        finish = replaceTweet.indexOf(";");
        longitude = replaceTweet.substring(start + 5, finish);
        System.out.println(longitude.trim());
        replaceTweet = replaceTweet.substring(finish+1);
        
 
		
		keyboard.close();
	
	}

}
