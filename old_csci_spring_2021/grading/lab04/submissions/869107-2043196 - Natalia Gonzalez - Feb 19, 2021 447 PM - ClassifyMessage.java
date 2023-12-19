/*
 * ClassifyMessage.java
 * Author:  Natalia Gonzalez 
 * Submission Date:  02-19-2021
 *
 * Purpose: This program will parse the text of a user specified 
 * message, identify the category, and assign this value to the
 * variable declared to be of type MessageCategory enumeration.
 * And then also includes whether the longitude and latitude are
 * within range.
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
		// TODO Auto-generated method stub

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
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString = catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		if (catString.contains("fire") || catString.contains("smoke")) {
			System.out.println("Category: \t" + MessageCategory.ALERT);
		}
		else if (catString.contains("need")) {
			System.out.println("Category: \t" + MessageCategory.NEED);
			}
		else if (catString.contains("offer")) {
			System.out.println("Category: \t" + MessageCategory.OFFER);
		}
		else if (catString.contains("structure") || catString.contains("road") ||  catString.contains("photo") ||  catString.contains("evac") ) {
			System.out.println("Category: \t" + MessageCategory.INFO);
		}
		else {
			System.out.println("Category: \t" + MessageCategory.UNKNOWN);
		}
		
		
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);


		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {
			System.out.println("In Range: \t" + true);
		}
		else {
			System.out.println("In Range: \t" + false);
		}
		
		
	}

}
