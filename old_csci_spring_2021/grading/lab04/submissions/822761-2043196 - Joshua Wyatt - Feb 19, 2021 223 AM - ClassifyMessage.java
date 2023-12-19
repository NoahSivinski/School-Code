/*
 * ClassifyMessage.java
 * Author:  Joshua Wyatt
 * Submission Date:  2/19/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program takes a message inputed from a user and outputs sections
 * of the message to be displayed and separated to show the category, the 
 * raw category, the base of the message, the longitude and latitude and
 * whether or not the message or location is in range based on the farthest
 * points via the longitude or latitude. The program then takes the input
 * from the user and separates each critical part of the program and inserts
 * it into the output. If-then statements are used to figure out if the
 * start of the message starts with a certain word it will tell us what
 * category of message the message inputed is. It then lists the core of the
 * message followed by the latitude, longitude and whether or not it is
 * in range.
 *
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
	
//	ENUM DECLARATION
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[]args) {
		
//		DECLARATIONS in the message inputed by the user.
		
		String catString = "";
		String payload = "";
		double latitude = 0;
		double longitude = 0;
		boolean isInRange;
		MessageCategory category;
		
//		Longitude and Latitude Declarations
		
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
	
//		The user input for the code
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		
//		Methods to read values inputed by the user from the message
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();

//		if-else statements classifying what kind of string it is,
//		such as what category
		
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}else if (catString.equalsIgnoreCase("evac") || catString.equalsIgnoreCase("structure") 
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("road")) {
			category = MessageCategory.INFO;
		}else {
			category = MessageCategory.UNKNOWN;
		}
		
//		Longitude and Latitude statements stating whether or not
//		an input is in range or not. If it is in range its true
//		if not, its false.
	
		if ((latitude >= south && latitude <= north ) 
				&& (longitude >= west && longitude <= east))
			isInRange = true;
		
		else
			isInRange = false;
		
//		Printed lines that display the values of each part of the message
//		inputed by the user.
		
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message: \t"+ payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);

		keyboard.close();
}
}