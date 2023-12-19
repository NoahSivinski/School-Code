/*
 * ClassifyMessage.java
 * Author:  Quinton Heald 
 * Submission Date:  2-18-21
 *
 * Purpose: This program is meant to take in a string of user inputed text, and divide the information of the text into separate categories
 * for the user to easily distinguish. The text's first word falls into a specific category that is under an enumeration
 * within the code. The code recognizes what category the word falls into and displays that specific category
 * in addition to the original word that was inputed (This is done through a series of if-else statements.)
 * In addition to this, the program also recognizes the latitude and longitude in the message, as well as the 
 * detailed user payload. The latitude and longitude are compared to a set of constants for north, south, east and west.
 * This comparison determines if the latitude and longitude are within range through an if-else statement. If the latitude and longitude
 * are within range, the program will notify the user. Lastly, the payload which is a longer message is displayed under its category. 
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
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[]args) {
		
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		
		String catString;
		String payload;
		Double latitude;
		Double longitude;
		Boolean isInRange;
		MessageCategory category;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a formatted mesage: ");
		
		catString = input.next();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine();
		
		catString = catString.trim();
		payload = payload.trim();
		
		if (catString.equalsIgnoreCase("fire") || (catString.equalsIgnoreCase("smoke"))) {
			category = MessageCategory.ALERT;
		}else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}else if (catString.equalsIgnoreCase("structure") || (catString.equalsIgnoreCase("road") || (catString.equalsIgnoreCase("photo") || (catString.equalsIgnoreCase("evac"))))){
			category = MessageCategory.INFO;
		}else{ 
			category = MessageCategory.UNKNOWN;
		}
		
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
			isInRange = true;
		}else {
			isInRange = false;
		}
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
	input.close();
		
	}

}
