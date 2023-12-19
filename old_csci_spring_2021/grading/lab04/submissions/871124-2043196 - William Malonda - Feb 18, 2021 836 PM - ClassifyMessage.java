/*
 * ClassifyMessage.java
 * Author:William Malonda 
 * Submission Date:  February 18, 2021
 *
 * Purpose: The program ClassifyMessage.java takes the user's input of a formatted tweet and is then split up. The output is then 
 * shown in the console with the category of the tweet, its raw category, its message, the latitude, the longitude, and if it 
 * is in range or not.
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
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// Declaring variables and constants
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;

		// Asks user to enter a formatted message into the console and is then divided up
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();

		// Takes value of catString and and allocates it to different enumerations to be displayed
		if (catString.equalsIgnoreCase("smoke") || catString.equalsIgnoreCase("fire")) {
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

		// Determines if latitude and longitude are in range
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		// Outputs category, raw category, message, latitude, longitude and isInRange variable in console
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload.trim());
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);

		keyboard.close();
	}

}
