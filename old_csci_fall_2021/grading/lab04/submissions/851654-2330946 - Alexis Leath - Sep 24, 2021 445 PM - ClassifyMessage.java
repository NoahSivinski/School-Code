/*
 * ClassifyMessage.java
 * Author:  Alexis Leath
 * Submission Date:  09/24/2021
 *
 * Purpose: This program takes in a tweet from the user and breaks down the message into categories.
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
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		final double north = 40.231315;
		final double south = 39.882343;
		final double east = -104.907864;
		final double west = -105.743511;


		//Get user input
		Scanner keyboard =new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString=keyboard.next();
		latitude=keyboard.nextDouble();
		longitude=keyboard.nextDouble();
		payload=keyboard.nextLine().trim();
		//Check and assign category
		if(catString.equalsIgnoreCase("Fire")||catString.equalsIgnoreCase("Smoke"))
			category=MessageCategory.ALERT;
		else if(catString.equalsIgnoreCase("need"))
			category=MessageCategory.NEED;
		else if(catString.equalsIgnoreCase("offer"))
			category=MessageCategory.OFFER;
		else if(catString.equalsIgnoreCase("Structure")||catString.equalsIgnoreCase("Road")||
				catString.equalsIgnoreCase("Photo")||catString.equalsIgnoreCase("evac"))
			category=MessageCategory.INFO;
		else
			category=MessageCategory.UNKNOWN;
		//Check and assign isInRange
		if(latitude>=south && latitude<=north && longitude>=west && longitude<=east) {
			isInRange=true;
		} else 
			isInRange = false;
		//Display details
		System.out.println("Category:\t"+category);
		System.out.println("Raw Cat:\t"+catString);
		System.out.println("Message:\t"+payload);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
		System.out.println("In Range:\t"+isInRange);
		keyboard.close();
	}

}






