/*
 * ClassifyMessage.java
 * Author:  Nazha Erakat 
 * Submission Date:  2/19/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program takes in a short message and assigns it a category using a multi-branch if-else statement. It also will check to see if the coordinates are in range of the coordinates we have been given.   
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

		String catString; // The raw text of the message's category
		String payload; // The primary content of the message
		double latitude; // The latitude indicated in the message
		double longitude; // The longitude indicated in the message
		boolean isInRange; // A "flag" indicating whether the latitude and longitude values are within
							// bounds
		MessageCategory category; // The message's category

		final double SOUTH = 39.882343; // southernmost longitude
		final double NORTH = 40.231315; // northernmost longitude
		final double WEST = -105.743511; // westernmost longitude
		final double EAST = -104.907864; // easternmost longitude

		System.out.print("Please enter a formatted message:\n");
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble(); 
		longitude = keyboard.nextDouble(); 
		payload = keyboard.nextLine();
		payload = payload.trim(); 
	
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
			System.out.println("Category:\t\t" + MessageCategory.ALERT);
		else if (catString.equals("need"))
			System.out.println("Category:\t\t" + MessageCategory.NEED);
		else if (catString.equals("offer"))
			System.out.println("Category:\t\t" + MessageCategory.OFFER);
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			System.out.println("Category:\t\t" + MessageCategory.INFO);
		else
			System.out.println("Category:\t\t" + MessageCategory.UNKNOWN);

		
		catString = catString.substring(0);
		System.out.println("Raw Cat:\t\t" + catString);
		
 
		System.out.println("Message:\t\t" + payload); 
		

		System.out.println("Latitude:\t\t" + latitude);

		 
		System.out.println("Longitude:\t\t" + longitude);
		
		

		if (latitude >= SOUTH && latitude <= NORTH && longitude >= WEST && longitude <= EAST)
			System.out.println("In Range:\t\ttrue");
		else
			System.out.println("In Range:\t\tfalse");

	}

}
