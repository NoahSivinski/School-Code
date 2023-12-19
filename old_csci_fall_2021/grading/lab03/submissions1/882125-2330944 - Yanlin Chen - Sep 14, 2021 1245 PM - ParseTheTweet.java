/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [9/17/2021]
 *
 * Purpose: The purpose is to parse a tweet's type, detail, location, latitude, and longitude by inputting the TtT.
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

		//String Variables
		Scanner keyboard = new Scanner(System.in);
		String tweet;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		
		//Type
		System.out.println("Enter a tweet below:");
		tweet = keyboard.nextLine();
		int typeIndexStart;
		int typeIndexEnd;
		typeIndexStart = tweet.indexOf("#typ");
		typeIndexEnd = tweet.indexOf(";");
		typeIndexStart += 5;
		type = tweet.substring(typeIndexStart, typeIndexEnd);
		type = type.toUpperCase();
		

		//Detail
		tweet = tweet.substring(typeIndexEnd + 1); 
		tweet = tweet.trim();
		int detailIndexStart;
		int detailIndexEnd;
		detailIndexStart = tweet.indexOf("#det");
		detailIndexEnd = tweet.indexOf(";");
		detailIndexStart += 5;
		detail = tweet.substring(detailIndexStart, detailIndexEnd);
		detail = detail.replace(",", "-");
		
		
		//Location
		tweet = tweet.substring(detailIndexEnd + 1);
		tweet = tweet.trim();
		int locationIndexStart;
		int locationIndexEnd;
		locationIndexStart = tweet.indexOf("#loc");
		locationIndexEnd = tweet.indexOf(";");
		locationIndexStart +=5;
		location = tweet.substring(locationIndexStart, locationIndexEnd);
		location = location.replace(",", "-");
		
		//Latitude
		tweet = tweet.substring(locationIndexEnd + 1);
		tweet = tweet.trim();		
		int latitudeIndexStart;
		int latitudeIndexEnd;
		latitudeIndexStart = tweet.indexOf("#lat");
		latitudeIndexEnd = tweet.indexOf(";");
		latitudeIndexStart +=5;
		latitude = tweet.substring(latitudeIndexStart, latitudeIndexEnd);		
		
		//longitude
		tweet = tweet.substring(latitudeIndexEnd + 1);
		tweet = tweet.trim();
		int longitudeIndexStart;
		int longitudeIndexEnd;
		longitudeIndexStart = tweet.indexOf("#lng");
		longitudeIndexEnd = tweet.indexOf(";");
		longitudeIndexStart +=5;
		longitude = tweet.substring(longitudeIndexStart, longitudeIndexEnd);
		
		//output
		System.out.println("Type: \t\t" + type);		
		System.out.println("Detail: \t" + detail);		
		System.out.println("Location: \t" + location);		
		System.out.println("Latitude: \t" + latitude);		
		System.out.println("Longitude: \t" + longitude);		

		
		
		
		
		
		
		keyboard.close();
		
	}

}
