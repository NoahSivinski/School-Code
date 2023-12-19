/*
 * ClassifyMessage.java
 * Author:  Jordan Arogeti 
 * Submission Date:  2/18/21
 *
 * Purpose: This program sifts through the information presented in a message
 * and then puts the information in their specified slot while also identifying
 * the category of the message and giving it the right name. 
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

//Importing Scanner
import java.util.Scanner;

public class ClassifyMessage {

	// Declaring the enumeration
	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN
	};

	public static void main(String[] args) {

		// Declaring Variables
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange = false;
		MessageCategory category = MessageCategory.UNKNOWN;
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;

		// Gathering User Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString = catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();

		// If-Else For Figuring Out The Category Of The Message
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}

		// Determining If The Location Is In Range
		if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east))
			isInRange = true;

		// Printing Out The Gathered Information
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);

		keyboard.close();

	}

}
