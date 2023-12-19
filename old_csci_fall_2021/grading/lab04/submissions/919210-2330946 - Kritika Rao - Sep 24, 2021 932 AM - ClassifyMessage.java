/*
 * [ClassifyMessage].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [9/20/21]
 *
 * Purpose: The purpose of this program parse a text from the user
 * and categorize each part of the text into different categories.
 * The program will also check if the latitude and longitutude
 * is in range and will return this information to the user. 
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
	
	//declaring an enumeration outside of main method
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
		//declaring variables for each part of text
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		//geographic boundries saved in variables 
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		//create Scanner object and save each part of the text in variables declared above
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		//checking if the value of catString is equal to fire or smog
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
			
		}
		//checking if value of catString is equal to need
		else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		//checking if value of catString is equal to offer
		else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		//checking if value of catString is equal to structure, road, photo, or evac
		else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		//if the value of catString is not equal to anything above, category is initialized to UNKNOWN
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		//checking to see if the latitude and longitude is in range
		if((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
			isInRange = true; 
		}
		else {
			isInRange = false;
		}
		
		//print out needed information to user
		System.out.println("Category:\t" + category);
		System.out.println("Rew Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close();
	}
}
