
/*
 * ClassifyMessage.java
 * Author: Jonathan Dintino
 * Submission Date: 23 September 2021
 *
 * Purpose: This program will seperate an input line to find various
 * information for a message including the category, coordinates, and
 * if the coordinates are in range to a hardcoded geographic location.
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

	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		// declare variables to store message data
		String catString; 			//: the raw text of the messages's category
		String payload; 			//: the primary content of the message
		double latitude; 			//: the latitude indiciated in the message
		double longitude; 			//: the longitude indicated in the message
		boolean isInRange; 			//: a "flag" indicating whether the latitude and longitude values are within bounds
		MessageCategory category; 	//: the message's category

		// numerical values that define a geographic boundary
		double south = 39.882343;	//: southernmost latitude
		double north = 40.231315; 	//: northernmost latitude
		double west = -105.743511; 	//: westernmost longitude
		double east = -104.907864; 	//: easternmost longitude

		// prompt the user to input message
		System.out.println("Please enter a formatted message:");
		catString = userInput.next().trim();
		latitude = userInput.nextDouble();
		longitude = userInput.nextDouble();
		payload = userInput.nextLine().trim();

		// get message category from raw category
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

		// calculate if coordinates are in range
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		// output results to console
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

	}

}