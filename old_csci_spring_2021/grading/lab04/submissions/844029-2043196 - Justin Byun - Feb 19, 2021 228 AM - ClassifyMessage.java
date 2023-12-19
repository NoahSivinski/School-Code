/*
 * ClassifyMessage.java
 * Author: Justin Byun
 * Submission Date:  February 19th, 2021
 *
 * Purpose: The program will calculate the latitude and longitude
 * of a location and will tell if the coordinates are in the 
 * range.
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
enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

public class ClassifyMessage {
	public static void main(String[] args) {
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString=keyboard.next();
	    latitude=keyboard.nextDouble();
	    longitude=keyboard.nextDouble();
	    payload=keyboard.nextLine().trim();
	    
	    if(catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke")){
			category = MessageCategory.ALERT;
	    } else if (catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}
	    if (latitude >= south && latitude <= north && longitude >= west && latitude >= south) {
			isInRange = true;
		} else {
			isInRange = false;
		}
		
	    switch(category) {
			case NEED:
				System.out.println("Category:\tNEED");
				break;
			case OFFER:
				System.out.println("Category:\tOFFER");
				break;
			case ALERT:
				System.out.println("Category:\tALERT");
				break;
			case INFO:
				System.out.println("Category:\tINFO");
				break;
			case UNKNOWN:
				System.out.println("Category:\tUNKNOWN");
				break;
		
	    }
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	


