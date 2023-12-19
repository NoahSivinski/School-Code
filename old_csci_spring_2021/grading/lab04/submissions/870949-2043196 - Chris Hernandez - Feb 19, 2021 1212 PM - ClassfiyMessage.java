/*
 * [ClassifyMessage].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [2/19/2021]
 *
 * Purpose: This program takes a message and categorizes it as well as breaking it up and returning the category, message, location, and checks if the location
 * is within the bounds given.
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

public class ClassfiyMessage {
	enum MessageCategory {
		NEED,
		OFFER,
		ALERT,
		INFO,
		UNKNOWN
	}
	
	static String catString;
	static String payload;
	static double latitude;
	static double longitude;
	static boolean IsInRange; 
	static MessageCategory category;
	
	static double south = 39.882343;
	static double north = 40.231315;
	static double west = -105.743511;
	static double east = -104.907864;
	
	public static void main(String[] args) {
				
		Scanner keyboard = new Scanner(System.in);	
		System.out.println("Please enter a formatted message: ");
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();
		
		// Determines which category depending on which word it contains
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		
		else if (catString.equalsIgnoreCase("need")) 
			category = MessageCategory.NEED;
		
		else if (catString.equalsIgnoreCase("offer")) 
			category = MessageCategory.OFFER;
		
		else if (catString.equalsIgnoreCase("structure") || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))) 
			category = MessageCategory.INFO;

		else 
			category = MessageCategory.UNKNOWN;
		
		// Determines if location is within bounds	
		if (latitude >= south && latitude <= north && longitude >= west && longitude <=east) 
			IsInRange = true;
		
		else 
			IsInRange = false;

		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + IsInRange);
	}
}

