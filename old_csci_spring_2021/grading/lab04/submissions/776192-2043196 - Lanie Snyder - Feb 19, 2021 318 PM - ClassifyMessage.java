/*
 * ClassifyMessage.java
 * Author:  Lanie Snyder 
 * Submission Date: February 19, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * I made this program to classify short messages based on
 * keywords in the message. The user will input a message. 
 * The program will then classify the message. The program 
 * outputs the data in the categories named Category, Raw 
 * Cat, Message, Latitude, Longitude, and In Range. 
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

	public static final double SOUTH = 39.882343; // southernmost latitude
	public static final double NORTH = 40.231315; // northernmost latitude
	public static final double WEST = -105.743511; // westernmost longitude
	public static final double EAST = -104.907864; // easternmost longitude

	public static void main(String[] args) {

		String catString; // The raw text of the message’s category
		String payload; // The primary content of the message
		double latitude; // The latitude indicated in the message
		double longitude; // The longitude indicated in the message
		boolean isInRange; // A “flag” indicating whether the latitude and
							// longitude values are within bounds
		MessageCategory category; // The message’s category

		System.out.println("Please enter a formatted message:");

		Scanner keyboard = new Scanner(System.in);
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();

		catString = catString.trim();
		payload = payload.trim();

		// to determine the value for catString
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke")))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road"))
				|| (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac")))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;

		// to determine the value for isInRange
		if ((latitude >= SOUTH) && (latitude <= NORTH) && (longitude >= WEST) && (longitude <= EAST))
			isInRange = true;
		else
			isInRange = false;

		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);

		keyboard.close();

	}

}
