
/*
 * ClassifyMessage.java
 * Author:  Sean Payne
 * Submission Date:  02/19/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 			This program identifies important parts of a message and deduces specific context
 * in accordance with the user input. Utilizing enum, if-else, and boolean aspects in order to do so.
 * After the program is done evaluating the message it then displays the important info to the user. 
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

	// Initializing Variables outside the main method
	static String catString;
	static String payload; // message
	static double latitude;
	static double longitude;
	static boolean isInRange;
	static MessageCategory category;

	/*
	 * Initializing Constants to Set Up Boundary for latitude and longitude
	 * variables
	 */
	static final double south = 39.882343;
	static final double north = 40.231315;
	static final double west = -105.743511;
	static final double east = -104.907864;

	public static void main(String args[]) {

		// Initializing Scanner for user input and Notifying user to input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();

		/*
		 * Checks catString's input from user to determine what category that needs to
		 * be assigned
		 */
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;

		/*
		 * Determines whether the variables latitude and longitude are in range or not
		 * using previous constants then assigns true or false value to isInRange
		 * boolean
		 */
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east)
			isInRange = true;

		/*
		 * Displays the information derived from user input with respect to the
		 * boundaries set
		 */
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

		// Closes Scanner "keyboard"
		keyboard.close();
	}

}