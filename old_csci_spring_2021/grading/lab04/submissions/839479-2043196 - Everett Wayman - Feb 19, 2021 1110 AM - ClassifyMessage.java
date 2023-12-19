/*
 * ClassifyMessage.java
 * Author: Everett Wayman 
 * Submission Date:  02/19/2021
 *
 * Purpose: The purpose of my program is to parse different parts of a short
 * into different categories. Theses include what kind of message it is, a
 * short description of the issue, the location, and if it that location
 * is in range.
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
	
	// I define what my different categories are.
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	// I assign my constants to the farthest point for each cardinal direction.
	static final double SOUTH = 39.882343;
	static final double NORTH = 40.231315;
	static final double WEST = -105.743511;
	static final double EAST = -104.907864;

	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a formatted message:");
		
		// Here I parse the message into different parts.
		String catString = keyboard.next();
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		String payload = keyboard.nextLine();
		
		System.out.print("Category:\t");

		// Here I use switch-case statements to sort the different types of
		// categories. 
		switch (catString) {
		  case "fire":
		  case "smoke":
			  System.out.println(MessageCategory.ALERT);
			  break;
		  case "need":
			  System.out.println(MessageCategory.OFFER);
			  break;
		  case "offer":
			  System.out.println(MessageCategory.OFFER);
			  break;
		  case "structure":
		  case "road":
		  case "photo":
			  System.out.println(MessageCategory.INFO);
			  break;
		  default:
		      System.out.println(MessageCategory.UNKNOWN);
		      break;
		}
		
		// These just print out the raw category, the short description, 
		// the latitude, and the longitude.
		System.out.println("Raw Cat:\t" + catString.trim());
		System.out.println("Message:\t" + payload.trim());
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		// Here I use an if-else statement to test if the location is in range with
		// given max and min latitude and longitude.
		System.out.print("In Range:\t");
		if ((latitude >= SOUTH) && (latitude <= NORTH) && (longitude >= WEST) && (longitude <= EAST)) {
			System.out.println(true);
		} else
			System.out.println(false);
		
		keyboard.close();
	}

}
