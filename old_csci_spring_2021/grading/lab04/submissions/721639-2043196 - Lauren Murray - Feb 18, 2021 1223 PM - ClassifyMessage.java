/*
 * CSCI1301.java
 * Author:  Lauren Murray
 * Submission Date:  2/18/2021
 *
 * Purpose: This program uses user input to parse and categorize text using
 * if-else statements. This program is valuable in the event of natural disasters
 * or other emergencies, as this program would allow the most important information
 * to be addressed first (such as fires, smoke, etc). 
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

		double south = 39.882343; //these four directional values are not declared as constants.
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;

		System.out.println("Please enter a formatted message:");

		Scanner keyboard = new Scanner(System.in);
		catString= keyboard.next();
		catString = catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();

		/*
		 * below, we use the equalsIgnoreCase method instead of "==", because "=="
		 * cannot be used to compare strings
		 */
		if (catString.equalsIgnoreCase("fire") || (catString.equalsIgnoreCase("smoke"))){
			category = MessageCategory.ALERT;	
			System.out.println("Category:\t" + category);
		}
		else 
		{ if (catString.equalsIgnoreCase("need"))	{
			category = MessageCategory.NEED;
			System.out.println("Category:\t" + category);
		}
		else
		{ if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
			System.out.println("Category:\t" + category);
		}
		else
		{ if (catString.equalsIgnoreCase("structure") || (catString.equalsIgnoreCase("road")) 
				|| (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))) {
			category = MessageCategory.INFO;
			System.out.println("Category:\t" + category);
		}
		else
		{ 		
			category = MessageCategory.UNKNOWN;
			System.out.println("Category:\t" + category);
		}
		}
		}
		}

		if ((latitude >= south) && (latitude <= north) && 
				(longitude >= west) && (longitude <= east)) {
			isInRange = true;
		}
		else
		{ 
			isInRange = false;
		}


		keyboard.close();



		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	}
}
