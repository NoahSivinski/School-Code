/*
 * ClassifyMessage.java
 * Author:  Deborah Orekoya
 * Submission Date:  02-18-2021
 *
 * Purpose: 
 * 
 * The purpose of my program is to use if-else and other branching
 * statements to classify short messages, like tweets, based on 
 * keywords in the message. My program is designed to parse the
 * text of a user specified message, identify the category of the 
 * message, and assign that value to a variable (category) declared 
 * to be of type MessageCategory. This program can also identify the
 * latitude and longitude specified in the message and determine 
 * whether they are within ranges defined elsewhere in the program. 
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

	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};
	
	public static void main(String[] args) {
			
		//declare variables
		String catString; //The raw text of the message’s category
		String payload; // The primary content of the message
		double latitude; // The latitude indicated in the message
		double longitude; // The longitude indicated in the message
		boolean isInRange; // A “flag” indicating whether the latitude and longitude values are within bounds

		MessageCategory category; // The message’s category
		
		//declare variables and initialize them
		double south = 39.882343; //southern most latitude
		double north = 40.231315; // northern most latitude
		double west = -105.743511; //western most longitude
		double east = -104.907864; //eastern most longitude
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter a formatted message:\n");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();		
		
		payload = payload.trim();
		catString = catString.trim();
		
		//used if-else statement for catString
		if (catString.equalsIgnoreCase ("fire") || catString.equalsIgnoreCase ("smoke")) {category = MessageCategory.ALERT;}
		else if (catString.equalsIgnoreCase ("need")) {category = MessageCategory.NEED;}
		else if (catString.equalsIgnoreCase ("offer")) {category = MessageCategory.OFFER;}
		else if (catString.equalsIgnoreCase ("structure") || catString.equalsIgnoreCase ("road") || catString.equalsIgnoreCase ("photo") || catString.equalsIgnoreCase ("evac")) {category = MessageCategory.INFO;}
		else {category = MessageCategory.UNKNOWN;}
		
		//used if-else statement for latitude and longitude
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {isInRange = true;}
		else {isInRange = false;}
		
		
		//print values
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close();
	}

}
