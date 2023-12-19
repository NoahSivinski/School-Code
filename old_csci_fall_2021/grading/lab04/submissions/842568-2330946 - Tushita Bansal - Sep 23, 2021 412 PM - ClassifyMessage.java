/*
 * ClassifyMessage.java
 * Author:  Tushita Bansal 
 * Submission Date:  September 23, 2021
 *
 * Purpose: This program is used to identify and decipher important tweets with time sensitive information that 
 * require immediate action. The program also identifies latitude and longitude based on the message to help determine
 * if they are in range. 
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class ClassifyMessage {

	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN;}
	static String catString; // The raw text of the message’s category
	static String payLoad;  // The primary content of the message
	static double latitude; // The latitude indicated in the message
	static double longitude; // The longitude indicated in the message
	static boolean isInRange; // A “flag” indicating whether the latitude and longitude values are within bounds
	static MessageCategory category; // The message’s category
	static double south = 39.882343; // southernmost latitude
	static double north = 40.231315; // northernmost latitude
	static double west = -105.743511; // westernmost longitude
	static double east = -104.907864; // easternmost longitude

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine().trim();

		if (catString.equalsIgnoreCase("Fire")||catString.equalsIgnoreCase("Smoke"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("Structure")||catString.equalsIgnoreCase("Road")||
				catString.equalsIgnoreCase("Photo")||catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else 
			category = MessageCategory.UNKNOWN;
		if (latitude>=south && latitude<=north && longitude<=east && longitude>=west)
			isInRange = true;

		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payLoad);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

	}

}
