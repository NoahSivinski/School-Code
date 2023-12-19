
/*
 * ClassifyMessage.java
 * Author:  Chloe Hangartner
 * Submission Date:  18 February 2021
 *
 * Purpose: This program will parse the text of a user 
 * specified message, identify the category of the message, 
 * and assign this value to a variable declared to be 
 * of type MessageCategory.
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
	
	public static final double SOUTH = 39.882343;
	public static final double NORTH = 40.231315;
	public static final double WEST = -105.743511;
	public static final double EAST = -104.907864;
	
	public static void main(String[] args) {

		//Declare Variables
		String catString; //the raw text of the message's category
		String payload; //the primary content of the message
		double latitude; //the latitude indicated in the message
		double longitude; //the longitude indicated in the message
		boolean isInRange; //a "flag indicating whether longitude and latitude values are within bounds
		MessageCategory category; //the message's category
		

		//Prompt User Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();

		//Match Values to a MessageCategory
		if (catString.equalsIgnoreCase("fire")) {
			category = MessageCategory.ALERT;
			System.out.println("Category: \t" + category);

		} else if (catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
			System.out.println("Category: \t" + category);

		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
			System.out.println("Category: \t" + category);

		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
			System.out.println("Category: \t" + category);

		} else if (catString.equalsIgnoreCase("structure")) {
			category = MessageCategory.INFO;
			System.out.println("Category: \t" + category);

		} else if (catString.equalsIgnoreCase("road")) {
			category = MessageCategory.INFO;
			System.out.println("Category: \t" + category);

		} else if (catString.equalsIgnoreCase("photo")) {
			category = MessageCategory.INFO;
			System.out.println("Category: \t" + category);

		} else if (catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
			System.out.println("Category: \t" + category);

		} else {
			category = MessageCategory.UNKNOWN;
			System.out.println("Category: \t" + category);
		}

		//Print Output
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload.trim());
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);

		//Determine Truth Value of isInRange
		if ((latitude >= SOUTH) && (latitude <= NORTH) && (longitude >= WEST) && (longitude <= EAST)) {
			isInRange = true;
			System.out.println("In Range: \t" + isInRange);

		} else {
			isInRange = false;
			System.out.println("In Range: \t" + isInRange);
		}

		keyboard.close();


	}
}
