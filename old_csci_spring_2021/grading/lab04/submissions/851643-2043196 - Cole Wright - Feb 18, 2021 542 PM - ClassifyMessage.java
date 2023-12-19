/*
 * ClassifyMessage.java
 * Author: Cole Wright 
 * Submission Date:  2/18/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program builds on the previous lab and parses information as well as categorizes the message type
 * and determines if the area effected is in range. Using if/else statements the program will determine the message type.
 * It uses a similar method to determine if the latitude and longitude are in range of the area. After determining those things
 * and taking in the user input, the program will display and output that parses the message into an easier to read structure.
 * This program can save time and alert an area if a threat is present in their area.
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
		NEED, OFFER, ALERT, INFO, UNKNOWN
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		MessageCategory category;
		System.out.println("Please enter a formatted message: ");
		catString = input.next().trim();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine().trim();

		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else {
			category = MessageCategory.UNKNOWN;
		}

		if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In range: \t" + isInRange);
		
		input.close();
	}
		
	
}

