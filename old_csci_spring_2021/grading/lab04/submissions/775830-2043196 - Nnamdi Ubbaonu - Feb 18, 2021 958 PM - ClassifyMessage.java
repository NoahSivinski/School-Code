/*
 * ClassifyMessage.java
 * Author:  Nnamdi Ubbaonu
 * Submission Date:  02/19/2021
 *
 * The purpose of this project is to take a tweet and provide 
 * certain information from this tweet such as: the type of message,
 * the coordinates of the person who sent it, and if the person who 
 * sent it is in range of retrieval.
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
	//southernmost latitude
	public static final double SOUTH = 39.882343;
	// northernmost latitude
	public static final double NORTH = 40.231315;
	// westernmost longitude
	public static final double WEST = -105.743511;
	// easternmost longitude
	public static final double EAST = -104.907864;
	public static void main(String[] args) {
		// catString: The raw text of the message’s category
		// payload: The primary content of the message
		String catString,payload;
		double longitude, latitude;
		//a flag indicating whether the latitude and longitude values are within bounds
		boolean isInRange;
		MessageCategory category;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString.trim();
			if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
				category = MessageCategory.ALERT;
				else if(catString.equalsIgnoreCase ("need"))
					category = MessageCategory.NEED;
				else if(catString.equalsIgnoreCase ("offer"))
					category = MessageCategory.OFFER;
				else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
					category = MessageCategory.INFO;
			else
				category = MessageCategory.UNKNOWN;
		System.out.println("Category:" + "\t" + category);
		System.out.println("Raw Cat:" + "\t" + catString);
		
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		
		payload = keyboard.nextLine();
		payload.trim();
		
		System.out.println("Message:       "+ payload);
		System.out.println("Latitude" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		
		if (((latitude >= SOUTH) && (latitude <= NORTH)) && ((longitude >= WEST) && (longitude <= EAST)))
			isInRange = true;
		else {
			isInRange = false;
		System.out.println("In Range:" + "\t" + isInRange);
		keyboard.close();
	}
}
}