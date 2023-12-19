/*
 * ClassifyMessage.java
 * Author:  Carla Pena
 * Submission Date:  18 February 2021
 *
 * Purpose: The purpose of this program is to allow a user
 * to input a formatted message. From there the program
 * breaks down the message to identify the importance in
 * the message. 
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
	
	enum MessageCategory { NEED, OFFER, ALERT, INFO, UNKNOWN }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String catString;
		String payload;
		double latitude;
		double longitude; 
		boolean isInRange; 
		MessageCategory category;
		
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		
		System.out.println("Please enter a formatted message:");
		Scanner scan = new Scanner(System.in);
		
		catString = scan.next().trim();
		latitude = scan.nextDouble();
		longitude = scan.nextDouble();
		payload = scan.nextLine().trim();
		
		scan.close();
		
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		if(latitude >= south && latitude <= north) {
			if(longitude >= west && longitude <= east) {	
				isInRange = true;
			}
			else {
				isInRange = false;
			}
		}
		else {
			isInRange = false;
		}
		
		
		System.out.println("Category:\t\t" + category);
		System.out.println("Raw Cat:\t\t" + catString);
		System.out.println("Message:\t\t" + payload);
		System.out.println("Latitude:\t\t" + latitude);
		System.out.println("Longitude:\t\t" + longitude);
		System.out.println("In Range:\t\t" + isInRange);
	}

}
