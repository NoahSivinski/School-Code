/*
 * ClassifyMessage.java
 * Author:  Evan Zimmerman 
 * Submission Date:  19th February 2021
 *
 * Purpose: The exercise being explored by Lab #4 is exploring the uses of if-else statements and enums.
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

	//Declare the enum.
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Declare variables.
		
		String catString;
		String payload; 
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		//Prompt for a message.
		
		System.out.println("Please enter a formatted message: ");
		
		//Assign values for variables based on input message. Some Strings are trimmed.
		
		catString = input.next();
		catString = catString.trim();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine();
		payload = payload.trim();
		
		//Assign value for category based on catString's value. Uses equalsIgnoreCase for more accuracy than ==.
		
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke"))) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}
		
		//Assigns value for isInRange based on values of latitude and longitude.
		
		if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
			isInRange = true;
		} else {
			isInRange = false;
		}
		
		//Prints output.
		
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
		input.close();
		
	}

}
