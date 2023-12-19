/*
 * [Intro Computing and Program].java
 * Author:  [Nataly Garcia] 
 * Submission Date:  [Friday February 19th 2021]
 * 
 * Purpose: A brief paragraph description of the
 * program. What does it do? The program essentially reads 
 * a line of input given. It reads in an order of category,
 * latitude, longitude, then a payload. This information
 * is then gathered and classified until certain subjects.
 * For example, a category that says "offer" will show a OFFER 
 * message, which means it is in the OFFER category. After
 * the message placed in a specific category, then the latitude
 * and longitude are used to indicated if information is 
 * "In Range" using a boolean values and another classification
 * list.
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
		String originalCatString, originalPayload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
		final double south =  39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		originalCatString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		originalPayload = keyboard.nextLine();
		
		String catString = originalCatString.trim();
		String payload = originalPayload.trim();
		
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke")))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac")))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		if ((latitude < south) || (latitude > north))
			isInRange = false;
		else if ((longitude < west) || (longitude > east))
			isInRange = false;
		else 
			isInRange = true;
		
		System.out.print("In Range:\t" + isInRange);
		
		keyboard.close();
		
	}

}
