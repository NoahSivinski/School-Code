
/*
 * ClassifyMessage.java
 * Author:  Vietmy Vo 
 * Submission Date:  2/19/2021
 *
 * Purpose: The following program parses short messages using the keyboard next(),nextDouble(),
 * and nextLine(). Then it uses if-else statements to get certain outputs depending on 
 * the short statement.
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

	public static final double SOUTH = 39.882343;
	public static final double NORTH = 40.231315;
	public static final double WEST = -105.743511;
	public static final double EAST = -104.907864;

	public static void main(String[] args) {

		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter a formatted message:");

		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();

		if (catString.equalsIgnoreCase("smoke") || catString.equalsIgnoreCase("fire"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}

		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString.trim());
		System.out.println("Message:\t" + payload.trim());
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

		if (latitude >= SOUTH && latitude <= NORTH && longitude >= WEST && longitude <= EAST) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		System.out.println("In Range:\t" + isInRange);

		keyboard.close();

	}

}
