/*
 * ClassifyMessage.java
 * Author:  Evan McKinney 
 * Submission Date:  9/24/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 	This program gets a formatted message from the user. The program
 * 	categorizes the type of message it is. It also outputs the message
 * 	in a more readable format.
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
	//creation of enum and declaration of all constants
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static final double NORTH = 40.231315;
	public static final double EAST = -104.907864;
	public static final double SOUTH = 39.882343;
	public static final double WEST = -105.743511;
	
	public static void main(String[] args) {
		//variable declarations
		Scanner keyboard = new Scanner(System.in);
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
		//user input
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		//assigns the value of category
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}else {
			category = MessageCategory.UNKNOWN;
		}
		
		//finds if its in range
		//latitude must be within NORTH and SOUTH and longitude must be within EAST and WEST
		isInRange = (NORTH >= latitude && latitude >= SOUTH) && (EAST >= longitude && longitude >= WEST);
		
		//output
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close();
	}
}
