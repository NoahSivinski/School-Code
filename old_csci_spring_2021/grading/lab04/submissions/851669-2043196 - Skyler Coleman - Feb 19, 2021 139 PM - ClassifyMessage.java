/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [02/19/2002]
 *
 * Purpose: This program parses a formatted message inputed by the 
 * user, identifies the category of the message, and identifies the 
 * latitude and longitude of the message and whether or are not 
 * they are in range or out of range.
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
/**
 * @author sky.cole768
 *
 */
public class ClassifyMessage {

	enum MessageCategory  {
		NEED, OFFER, ALERT, INFO, UNKNOWN // The different message categories
	}
	
	final static double south = 39.882343; // southernmost latitude
	final static double north = 40.231315; // northernmost latitude
	final static double west = -105.743511; // westernmost longitude
	final static double east = -104.907864;  // easternmost longitude
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.println("Please enter a formatted message:");
		String catString = keyboard.next(); // The raw text of the message's category
		catString = catString.trim();
		double latitude = keyboard.nextDouble(); // The latitude indicated in the message
		double longitude = keyboard.nextDouble(); // The longitude indicated in the message
		String payload = keyboard.nextLine();  // The primary content of the message
		payload = payload.trim();
		
		boolean isInRange; // A "flag" indicating whether the latitude and longitude values are within bounds
		MessageCategory category; // The messages's category
		
		if (catString.equalsIgnoreCase("smoke") || catString.equalsIgnoreCase("fire")) {
			category = MessageCategory.ALERT;
		}	
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}	
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}	
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}	
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		if (((latitude >= south) && (latitude <= north)) && ((longitude >= west)&(longitude <= east))) {
			isInRange = true; // The latitude and longitude are within bounds
		}
		else {
			isInRange = false; // The latitude and longitude are out of bounds
		}
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	
		keyboard.close();
	}

}
