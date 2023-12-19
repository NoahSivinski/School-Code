/*
 * ClassifyMessage.java
 * Author:  Austin Debrody
 * Submission Date:  9/24/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program breaks down an input of 1 string with different values and places
 * them into their own designated variable. It also identifies the correct category
 * of the message and assigns the value to a variable declared to be of type 
 * MessageCategory. The latitude and longitude are also taken and are then compared
 * to the designated ranges defined in the top of the program and says whether they 
 * within the limits or not.
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
	
	public enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // create a scanner object "scan"
		
		String catString; // the raw text of the message's category
		String payload; // the primary content of the message
		Double latitude; // the latitude indicated in the message
		Double longitude; // the longitude indicated in the message
		boolean isInRange; // a "flag" indicating whether the latitude and 
		                   // longitude values are within bounds
		MessageCategory category; // the message's category
		
		final Double SOUTH = 39.882343; // southernmost latitude
		final Double NORTH = 40.231315; // northernmost latitude
		final Double WEST = -105.743511; // westernmost longitude
		final Double EAST = -104.907864; // easternmost longitude
		
		System.out.println("Please enter a formatted message: ");
		catString = scan.next();
		latitude = scan.nextDouble();
		longitude = scan.nextDouble();
		payload = scan.nextLine();
		
		catString = catString.trim();
		payload = payload.trim();
		
		/*
		System.out.println(catString);
		System.out.println(latitude);
		System.out.println(longitude);
		System.out.println(payload);
		*/
		
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		} else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") 
				   || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}
		
		if((latitude >= SOUTH && latitude <= NORTH) && (longitude >= WEST && longitude <= EAST)) {
			isInRange = true;
		} else {
			isInRange = false;
		}
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
	}

}
