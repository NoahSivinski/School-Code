
/*
 * ClassifyMessage.java
 * Author:  Cole Lanham
 * Submission Date:  2/18/21
 *
 * Purpose: This program is designed to build on our
 * understanding from Lab 3 on parsing data based on user input 
 * and sorting it categorically to produce a structured output.
 * However, within this lab we utilized our understanding of if-else
 * statements and branching in combination with our previous understanding
 * in order to create a program which sorts user input and creates custom 
 * output. 
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
	
	public static final double //Constants 
		south = 39.882343, // southernmost latitude
		north = 40.231315, // northernmost latitude
		west = -105.743511, // westernmost longitude
		east = -104.907864; // easternmost longitude

	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Variable declaration
		String catString; // The raw text of the message’s category
		String payload; // The primary content of the message
		double latitude; // The latitude indicated in the message
		double longitude; // The longitude indicated in the message
		boolean isInRange; // A “flag” indicating whether the latitude and longitude values are within bounds
		MessageCategory category; // The message’s category
		
		//Initial User prompt and input 
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();
		
		//If-else statements to assign category based off the value of catString
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("fire")))  {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road")) || 
				(catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))) {
			category = MessageCategory.INFO;
		}
		else 
			category = MessageCategory.UNKNOWN;
		
		//If-else statements determining if latitude and longitude are within constant parameters 
		if (((latitude <= north) && (latitude >= south)) && ((longitude >= west) && (longitude <= east))) 
			isInRange = true;
		else
			isInRange = false;
			
		
		//Final output
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

		
			

	}

}
