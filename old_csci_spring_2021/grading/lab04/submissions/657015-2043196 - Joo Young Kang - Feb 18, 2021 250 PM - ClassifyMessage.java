/*
 * CSCI 1301.java
 * Author: Joo Young Kang
 * Submission Date: February 18, 2021
 *
 * Purpose: The purpose of this program is help users parse
 * the text of a specific message to identify the message 
 * category and content such as latitude, longitude, and message.
 * Furthermore, it help determine whether or not the directions
 * are within criteria "range."
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

public class ClassifyMessage {
	
	//set enumeration known as MessageCategory
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		
		//set scanner instance
		Scanner keyboard = new Scanner(System.in);
		
		//set strings, doubles, and boolean
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		
		//set constant directions (latitude and longitude)
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		//message to enter the input
		System.out.println("Please enter a formatted message");
		
		//catString
		//set new string, parse by substring, and trim() to eliminate spaces
		catString = keyboard.nextLine();
		String catString1;
		int end = catString.indexOf("4");
		catString1 = catString.substring(0,end).trim();
		
		//Raw Cat (payload)
		//use catString1 and make letters lowercase
		payload = catString1.toLowerCase();
		
		//Latitude
		//set 2 strings, start with catString, parse by substring, and convert string to double 
		String lat;
		String lat1;
		lat = catString.substring(end);
		int end2 = lat.indexOf(" ");
		lat1 = lat.substring(0,end2);
		latitude = Double.parseDouble(lat1);
		
		//Longitude
		//repeat previous process but start with string lat
		String lon;
		String lon1;
		lon = lat.substring(end2).trim();
		int end3 = lon.indexOf(" ");
		lon1 = lon.substring(0,end3);
		longitude = Double.parseDouble(lon1);
		
		//Message
		//start with String lon, parse by substring, and trim to eliminate spaces
		String message;
		String message1;
		message = lon.substring(end3).trim();
		
		//if catString1 equals to "fire" or "smoke", set MessageCategory to ALERT
		//similar process: "need" is NEED, "offer" is OFFER, and etc..
		//if it matches none of them, then it will be assigned: UNKNOWN
		if (catString1.equalsIgnoreCase("fire") || catString1.equalsIgnoreCase("smoke")) {
			MessageCategory category = MessageCategory.ALERT;
			System.out.println("Category:\t" + category);
		}
		else if (catString1.equalsIgnoreCase("need")) {
			MessageCategory category = MessageCategory.NEED;
			System.out.println("Category:\t" + category);
		}
		else if (catString1.equalsIgnoreCase("offer")) {
			MessageCategory category = MessageCategory.OFFER;
			System.out.println("Category:\t" + category);
		}
		else if (catString1.equalsIgnoreCase("structure") || catString1.equalsIgnoreCase("road") || 
						catString1.equalsIgnoreCase("photo") || catString1.equalsIgnoreCase("evac")) {
				MessageCategory category = MessageCategory.INFO;
			System.out.println("Category:\t" + category);
		}
		else {
			MessageCategory category = MessageCategory.UNKNOWN;
			System.out.println("Category:\t" + category);
		}
		
		//print messages
		System.out.println("Raw Cat:\t" + payload);
		System.out.println("Message:\t" + message);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
	
		//if the directions (numbers) is within the criteria range, "In Range" will show true
		//if not, "In Range" will show false
		if (latitude >= south && latitude <= north && longitude <= east && longitude >= west) {
			boolean inRange = true;
			System.out.println("In Range:\t" + inRange);
		}
		else {
			boolean inRange = false;
			System.out.println("In Range:\t" + inRange);
		}
			
	}
}
