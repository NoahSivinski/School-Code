/*
 * ClassifyMessage.java
 * Author:  Brandon 
 * Submission Date: Sep 23 2021
 *
 * Purpose: Uses if-else statements, branching statements, and enumerations to classify short messages based on keywords in the message.
 * as well as determine if the location of the message is in bound to specific latitudes and longitudes. Displays information to user in list.
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

	// enumerates message categories
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	// declare and initialize values of geographic boundaries used in program as constants
	public static final double SOUTH = 39.882343; //southernmost latitude
	public static final double NORTH = 40.231315; //northernmost latitude
	public static final double WEST = -105.743511; //westernmost longitude
	public static final double EAST = -104.907864; //easternmost longitude

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// declaring variables to used in program
		String catString; //The raw text of the message's category
		String payload; //The primary content of the message
		double latitude; //The latitude indicated in the message
		double longitude; //The longitude indicated in the message
		boolean isInRange; //A "flag" indicating whether latitude and longitude values are within bounds
		MessageCategory category; //The message's category

		System.out.println("Please enter a formatted message:");

		// grabs each part of user input and reads in values for each part
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();

		//classify messages to a category based on cat string
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}

		//determines if latitude and longitude is with in the bounds set, sets value to true if in range and false if not in range
		if(latitude >= SOUTH && latitude <= NORTH && longitude >= WEST && longitude <= EAST) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}

		//Outputs information grabbed to user in list
		System.out.println("Category:    " + category);
		System.out.println("Raw Cat:     " + catString);
		System.out.println("Message:     " + payload);
		System.out.println("Latitude:    " + latitude);
		System.out.println("Longitude:   " + longitude);
		System.out.println("In Range:    " + isInRange);

		keyboard.close();
	}

}
