/*
 * [ClassifyMessage.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [2/17/2021]
 *
 * Purpose: ClassifyMessage.java is a program that receives a input message from the user that
 * needs to be sorted into correct categories of importance. It parses the message and using
 * next(), if else statements, and enumerations, assigns the correct value to each variable and then
 * displays the information on the screen in an orderly way. This allows the user to see the
 * category, raw catString, message or payload, latitude and longitude (and if they are in
 * a certain range stated by constants, WEST, EAST, NORTH, and SOUTH).
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

	//the enumeration that declares the elements NEED, OFFER, ALERT, INFO, UNKNOWN as constants
	//to be used
	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN;
	}
	
	//declaring the constants SOUTH, NORTH, WEST, and EAST to be used to see if the longitude
	//and latitude are in the boundaries
	public static final double SOUTH = 39.882343;
	public static final double NORTH = 40.231315;
	public static final double WEST = -105.743511;
	public static final double EAST = -104.907864;
	
	public static void main(String[] args) {
		//declaring the variables catString, payload, latitude, longitude, isInRange, and
		//category to be used in the program
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange = true;
		MessageCategory category;
		
		//using the Scanner class to get input from the user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a formatted message: ");
		
		//storing the first input in catString and trimming it
		catString = keyboard.next();
		catString = catString.trim();
		
		//storing the second and third inputs in latitude and longitude
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		
		//storing the last input in payload and trimming it
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		//an if else statement that looks at the value of catString to see which element of the
		//enumeration is assigned to category
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke"))) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road"))
				|| (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		//if else statement that compares latitude and longitude to the constants
		//SOUTH, NORTH, WEST, and EAST to see if they are in the geographic boundaries
		if ((latitude >= SOUTH) && (latitude <= NORTH)) {
			if ((longitude >= WEST) && (longitude <= EAST)) {
				isInRange = true;
			}
		}
		else {
			isInRange = false;
		}
		
		//print statements that display values asked for
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
		keyboard.close();
	}

}
