/*
 * ClassifyMessage.java
 * Author: Kaushalkumar A. Patel 
 * Submission Date: 02/18/2021
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * The program will parse the text of a user specified message, 
 * identify the category of the message, and assign this value to the
 * variable category declared to be of the type MessageCategory. 
 * The program will also identify the latitude and longitude specified in 
 * the user's message and determine whether these are within the defined 
 * ranges.
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

	// Enumeration type of the set values specified.
	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN
	}

	public static void main(String[] args) {

		String catString; // The raw text of the message’s category.
		String payload; // The primary content of the message.
		double latitude; // The latitude indicated in the message.
		double longitude; // The longitude indicated in the message.
		boolean isInRange; // Indicated if latitude and longitude values are within bounds.
		MessageCategory category; // The message's category.

		final double south = 39.882343; // southernmost latitude.
		final double north = 40.231315; // northernmost latitude.
		final double west = -105.743511; // westernmost longitude.
		final double east = -104.907864; // easternmost longitude.

		// Instance of Scanner. User will input their message. String values set.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload.trim();
		keyboard.close();

		// Matches the value stored in catString to one of the elements of the
		// enumeration.
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}

		// Check if latitude and longitude specified in the message are within the
		// geographic boundaries.
		if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		// Outputs
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);

	}

}
