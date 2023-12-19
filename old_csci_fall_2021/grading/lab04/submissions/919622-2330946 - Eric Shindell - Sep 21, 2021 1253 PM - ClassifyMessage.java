/*
 * ClassifyMessage.java
 * Author:  Eric Shindell 
 * Submission Date:  9/21/2021
 *
 * Purpose: This program takes a string that contains a category, a latitude number, a 
 * longitude number, and details in that order, and then modifies it into its essential
 * components. It first takes each part and assigns it to a variable for that part, such
 * as String catString being set equal to the category, double latitude and double longitude
 * being set to the longitude and latitude, and String payload being set to the rest. It then
 * finds the category it is apart of using catString and MessageCategory, setting it equal to
 * NEED, OFFER, ALERT, INFO, or UNKNOWN based on what it specifies. It also uses the constant
 * limits for latitude and longitude to see if the original string is within range.
 * Finally, it prints out it all with labels, detailing the info it found out through the code.
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

	public enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN
	}

	public static void main(String[] args) {		
		//The raw text of the message's category
		String catString;
		
		//The primary content of the message
		String payload;
		
		//The latitude indicated in the message
		double latitude;
		
		//The longitude indicated in the message
		double longitude;
		
		//A "flag" indicating whether the latitude and longitude values are within bounds
		boolean isInRange;
		
		//The message's category
		MessageCategory category;
		
		//Extreme constant latitudes & longitudes
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		

		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = input.next();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine();
		
		//closes the scanner
		input.close();
		
		//Trimming catString and payload's excess blank spaces
		catString = catString.trim();
		payload = payload.trim();
		
		//Checks what category the catString is equal to, ignoring case.
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke") ) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need") ) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer") ) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac") ){
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		//checks whether the latitude and longitude are both within the limits
		if (latitude >= south && latitude <= north) {
			if (longitude >= west && longitude <= east) {
				isInRange = true;
			}
			else {
				isInRange = false;
			}
		}
		else {
			isInRange = false;
		}
		
		//output
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
	}

}
