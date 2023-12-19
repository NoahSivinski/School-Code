/*
 * ClassifyMessage.java
 * Author:  Claire Fortenberry 
 * Submission Date:  22 September 2021
 *
 * Purpose: This program utilizes if-else statements to read and classify 
 * tweets based on certain keywords it contains. This program could assist in 
 * the timely response to emergencies or natural disasters because it can sort 
 * tweets into categories such as NEED, OFFER, ALERT, INFO, or UNKOWN, as well as 
 * determine if the tweet is relevant based on its compliance with a specified latitude 
 * and longitude range. 
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
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declare constants
		final double SOUTH = 39.882343;
		final double NORTH = 40.231315;
		final double WEST = -105.743511;
		final double EAST = -104.907864;
		
		//Declare variables and Strings
		MessageCategory category;
		double latitude = 0;
		double longitude = 0;
		boolean isInRange; 
		String catString;
		String payload;
		String rawCat;
		
		//Receive user input
		System.out.println("Please enter a formatted message:");
		catString = input.next();
		rawCat = catString;
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine();
		payload = payload.trim();
		
		//Assign tweet to correct MessageCategory
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		//Determine if inInRange should be assigned true or false
		if ((latitude >= SOUTH && latitude <= NORTH) && (longitude >= WEST && longitude <= EAST)) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + rawCat);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		input.close();

	}

}
