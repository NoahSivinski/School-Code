/*
 * ClassifyMessage.java
 * Author:  Sunny Shah 
 * Submission Date:  02/19/2021
 *
 * Purpose: This program will use java enumeration that lists several
 * message categories. The program will parse the text of a user specified
 * message, identify the category of the message, and assign this value to a
 * variable category.Latitude and longitude will also be specified in the message
 * and determined whether they are within ranges defined in the program.
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
		
		Scanner keyboard = new Scanner(System.in);
		
		String catString; // The raw text of the message’s category.
		String payload; // The primary content of the message.
		double latitude; // The latitude indicated in the message.
		double longitude; // The longitude indicated in the message.
		
		double south = 39.882343; // Southernmost latitude.
		double north = 40.231315; // Northernmost latitude.
		double west = -105.743511; // Westernmost longitude.
		double east = -104.907864; // Easternmost longitude.
		
		System.out.println("Please enter a formatted message:");
	
		// Parsing the message.
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		// Trimming catString and payload.
		catString = catString.trim();
		payload = payload.trim();
		
		// category is the message’s category.
		MessageCategory category = MessageCategory.ALERT;
		
		// Assign ALERT if catString equals fire or smoke.
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
		{
			System.out.println("Category:\t" + category);
		}
		
		// Assign NEED if catString equals need.
		else if (catString.equalsIgnoreCase("need"))
		{
				System.out.println("Category:\t" + MessageCategory.NEED);
		}
		
		// Assign OFFER if catString equals offer.
		else if (catString.equalsIgnoreCase("offer"))
		{
				System.out.println("Category:\t" + MessageCategory.OFFER);
		}
		
		// Assign INFO if catString equals structure, road, photo, or evac.
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
		|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
		{
				System.out.println("Category:\t" + MessageCategory.INFO);
		}
		
		// Assign UNKNOWN if catString equals anything else.
		else
		{
				System.out.println("Category:\t" + MessageCategory.UNKNOWN);
		}
		
		/* 
		isInRange indicates whether the latitude and longitude values are within bounds.
		For isInRange to be true, latitude must be greater than equal to southernmost latitude 
		and less than equal to northernmost latitude, and longitude must be greater than equal to
		westernmost longitude and less than equal to easternmost longitude.
		*/
		boolean isInRange = (((latitude >= south) && (latitude <= north)) && 
				((longitude >= west) && (longitude <= east)));
		
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close();

	}

}
