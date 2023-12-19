/*
 * ClassifyMessage.java
 * Author:  Ashlin Yeo
 * Submission Date:  9/20/2021
 *
 * Purpose: This program parses the text of a user specified message,
 * identifies the category of the message, and the latitude and longitude of the message.
 * The program also determines if the latitude and longitude are within range.
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

	public enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
		
		String catString, payload;
		MessageCategory category;
		double latitude, longitude;
		double south = 39.882343, north = 40.231315, west = -105.743511, east = -104.907864;
		boolean isInRange;
		
		//Parse the text input by the user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		
		//Categorize messages as alert, need, offer, info, or unknown depending on their text
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;	
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		//Parameters for if something is in range
		isInRange = ((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east));
		
		//Print values for categories, message, latitude, longitude, and if the location is in range
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString.trim());
		System.out.println("Message:\t" + payload.trim());
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close();
		}
}
