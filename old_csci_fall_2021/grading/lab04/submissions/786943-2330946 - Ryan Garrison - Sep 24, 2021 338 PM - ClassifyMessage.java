/*
 * [ClassifyMessage].java
 * Author:  [Ryan Garrison] 
 * Submission Date:  [09/24/2021]
 *
 * Purpose: The purpose of this code is to take a user input that is a signal for help. The program will parse
 * the test of the user and identify the category of the message, the latitude, longitude and whether
 * the latitude and longitude tells if the user's inputed position is within range. 
 * 
 *
 * * Statement of Academic Honesty:
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

	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN,}
	
	public static void main(String[] args) {
		
		// Here I declared each variable
		String catstring;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		// Here I set the boundaries of north south east and west that would be considered in range.
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.907864;
		double east = -104.907864;
		
		//These lines of code display a message to the user and prompt them ton enter their input.
		System.out.println("Please enter a formatted message: ");
		Scanner keyboard = new Scanner(System.in);
		catstring = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		//Here I use a if else statement to determine the users input for which category it will fall under,
		// alert, need, offer, info or unknown.
		if(catstring.equalsIgnoreCase("fire") || catstring.equalsIgnoreCase("smoke")) 
			category = MessageCategory.ALERT;
		else if(catstring.equalsIgnoreCase("NEED"))
			category = MessageCategory.NEED;
		else if(catstring.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if(catstring.equalsIgnoreCase("structure") || catstring.equalsIgnoreCase("road") || catstring.equalsIgnoreCase("photo") || catstring.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;
		
		// Here I use another if else statement to figure out if the users location is within range and to 
		//display true if it is and false if it is not.
		if((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
			isInRange = true;
		else
			isInRange = false;
		
		//This is the final step that prints out all the information in a neat display to condense down the
		//user's input.
		System.out.println("Category:" +"\t" + category);
		System.out.println("Raw Cat:" + "\t" + catstring.trim());
		System.out.println("Meassage:" + "\t" + payload.trim());
		System.out.println("latitude:" + "\t" + latitude);
		System.out.println("longitude:" + "\t" + longitude);
		System.out.println("In Range:" + "\t" + isInRange);
		
		
			
		
			
		
		
		
		
		
		
	}

}
