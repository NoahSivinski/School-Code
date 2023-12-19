/*
 * ClassifyMessage.java
 * Author:  Scott Wagner 
 * Submission Date:  2/19/2021
 *
 * Purpose: This program categorizes formatted messages utilizing an if else
 * branching statement. 
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
		NEED, OFFER, ALERT, INFO, UNKNOWN;
	}
	
		public static final double SOUTH = 39.882343, NORTH = 40.231315;
		public static final double WEST = -105.743511, EAST = -104.907864;
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
			System.out.println("Please enter a formatted message:");
				catString = scan.next();
				latitude = scan.nextDouble();
				longitude = scan.nextDouble();
				payload = scan.nextLine();
				
					payload = payload.trim();
					catString = catString.trim();
					
								
	if(catString.equalsIgnoreCase("fire")) {
		category = MessageCategory.ALERT;
	} else if(catString.equalsIgnoreCase("smoke")) {
		category = MessageCategory.ALERT;
	} else if(catString.equalsIgnoreCase("need")) {
		category = MessageCategory.NEED;
	} else if(catString.equalsIgnoreCase("offer")) {
		category = MessageCategory.OFFER;
	} else if(catString.equalsIgnoreCase("structure")) {
		category = MessageCategory.INFO;
	} else if(catString.equalsIgnoreCase("road")) {
		category = MessageCategory.INFO;
	} else if(catString.equalsIgnoreCase("photo")) {
		category = MessageCategory.INFO;
	} else if(catString.equalsIgnoreCase("evac")) {
		category = MessageCategory.INFO;
	} else {
		category = MessageCategory.UNKNOWN;
		}
					
	
	if((latitude >= SOUTH) && (latitude <= NORTH) && (longitude >= WEST) && (longitude <= EAST)) {
		isInRange = true;
	} else {
		isInRange = false;
	}
	
	
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	
	scan.close();	
	}

}
