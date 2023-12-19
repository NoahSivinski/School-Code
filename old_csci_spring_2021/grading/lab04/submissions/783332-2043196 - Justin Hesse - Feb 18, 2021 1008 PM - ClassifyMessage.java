/*
 * ClassifyMessage.java
 * Author:  Justin Hesse 
 * Submission Date:  2/18/2021
 *
 * Purpose: Reads in a message from the user and uses conditional statements
 * as well as string methods to determine the message category and whether or not
 * it is within a predefined geographical range.
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
		
		boolean isInRange;
		MessageCategory category;
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a formatted message: ");
		
		String catString = scan.next();		//Block iterates the scanner through the user's message and assigns different parts to the appropriate variables
		catString = catString.trim();			//Also trims white space from catString and payload
		double latitude = scan.nextDouble();
		double longitude = scan.nextDouble();
		String payload = scan.nextLine();
		payload = payload.trim();
		
		
			if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("Smoke")) {	//Chain of if-elses determines the value of category based on the value of catString variable
				
				category = MessageCategory.ALERT;				
			}
			
			else if (catString.equalsIgnoreCase("need")) {
				
				category = MessageCategory.NEED;
			}
			
			else if (catString.equalsIgnoreCase("offer")){
				
				category = MessageCategory.OFFER;
			}
			
			else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
				
				category = MessageCategory.INFO;
			}
			
			else {
				
				category = MessageCategory.UNKNOWN;
			}
			
			
			
			if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) { //This if-else statement determines if the location of the message is within a pre-defined range of latitude and longitude
				
				isInRange = true;
			}
			
			else {
				
				isInRange = false;
				
			}
			
				
		System.out.println("Category:" + '\t' + category);		//Block prints formatted outputs
		System.out.println("Raw Cat:" + '\t' + catString);
		System.out.println("Message:" + '\t' + payload);
		System.out.println("Latitude:" + '\t' +latitude);
		System.out.println("Longitude:" + '\t' + longitude);
		System.out.println("In Range:" + '\t' + isInRange);
		
		
		scan.close();

	}

}
