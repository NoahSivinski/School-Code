
/*
 * [ClassifyMessage].java
 * Author:  [Ethan Delamater] 
 * Submission Date:  [2/17/2021]
 *
 * Purpose: Breaks down user inputs into different categories along with determining if the location is inside the boundaries
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
		NEED, OFFER, ALERT, INFO, UNKNOWN
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // adding scanner

		String catString; // establishing variables
		String payLoad;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;

		final double south = 39.882343; // establishing constants
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;

		System.out.println("Please enter a formatted message:"); // prompting the user
		catString = input.next();
		catString.trim();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payLoad = input.nextLine();
		payLoad.trim(); // formatting

		input.close(); // closing the scanner

		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) { // dividing the user prompts
																							// into categories
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}

		if // determining if the coordinates are in the parameters
		(((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		System.out.println("Category:\t " + category); // output with the variables
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t" + payLoad);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);

	}
}