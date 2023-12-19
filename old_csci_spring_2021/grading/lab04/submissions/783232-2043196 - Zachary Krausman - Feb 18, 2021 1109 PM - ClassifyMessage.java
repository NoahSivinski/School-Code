/*
 * ClassifyMessage.java
 * Author:  Zachary Krausman 
 * Submission Date:  18 February 2021
 *
 * Purpose: The purpose of this program is to, again, parse out information given by the user
 * but the program relies on enumeration values established by the coder/ lab and if-else statements
 * to correctly define extra information based off of the user's input information. 
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
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN} // always declare outside of main - given

	public static void main(String[] args) {
		
		// Variable declarations - given
		String catString; // The raw text of the message's category
		String payload; // The primary content of the message
		double latitude; // The latitude indicated in the message
		double longitude; // The longitude indicated in the message
		boolean isInRange; // A "flag" indicating whether the latitude and longitude values are w/in bounds
		MessageCategory category; // The message's category
		
		// Geographic boundary declarations - given
		final double south = 39.882343; // southernmost latitude
		final double north = 40.231315; // northernmost latitude
		final double west = -105.743511; // westernmost longitude
		final double east = -104.907864; // easternmost longitude
		
		// parse out all important information
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		keyboard.close();
		
		// trim whitespace from strings
		payload = payload.trim();
		catString = catString.trim();
		
		/* If-else statements to determine the value of 'category'
		 *use equalsIgnoreCase because == would give the memory address, not actual information
		 */
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		// if-else statements to determine if the call is in range (isInRange)
		if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		
		// Output of user submitted data
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

	}

}
