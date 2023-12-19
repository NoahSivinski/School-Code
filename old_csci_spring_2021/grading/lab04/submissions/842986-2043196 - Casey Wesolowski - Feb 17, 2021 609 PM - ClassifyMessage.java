
/*
 * CSCI1301 27827
 * ClassifyMessage.java
 * Author:  Casey Wesolowski 
 * Submission Date:  February 17th, 2021
 *
 * Purpose: 
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

enum MessageCategory {
	NEED, OFFER, ALERT, INFO, UNKNOWN
	}

public class ClassifyMessage {
	
	public static void main(String[] args) {
		//Just assigning an identifier, assignment statements will come later
		String catString; //The raw text of the message's category
		String payLoad; //primary content
		double latitude; 
		double longitude; 
		boolean isInRange; //whether the latitude or longitude are within bounds
		MessageCategory category;
		
		//geographic boundaries - I made them constants
		final double SOUTH = 39.882343;
		final double NORTH = 40.231315;
		final double WEST = -105.743511;
		final double EAST = -104.907864;
		
		//Assignment statements
		System.out.println("Please enter a formatted message: ");
		Scanner keyboard = new Scanner(System.in);
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine();
		
		//trimming if necessary
		catString = catString.trim();
		payLoad = payLoad.trim();
		
		//if-else statement for the category
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
		
		//if-else statement for latitude and longitude
		if (((latitude >= SOUTH) && (latitude <= NORTH)) && 
				(longitude >= WEST) && (longitude <= EAST))
			isInRange = true;
		else
			isInRange = false;
		
		//Output formatting!
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payLoad);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		


		
		keyboard.close();
	}

}
