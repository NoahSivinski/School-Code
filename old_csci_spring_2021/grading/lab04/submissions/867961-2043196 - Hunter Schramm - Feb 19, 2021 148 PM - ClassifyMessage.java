/**
 * 
 */

/**
 * @author hunterschramm
 *
 *
 * [ClassifyMessage].java
 * Author:  [Hunter Schramm] 
 * Submission Date:  [02/19/21]
 *
 * Purpose: The purpose of this program is to parse the text of a user's
 * message, identify the category of the message, and assign this value 
 * to a category declared to be of type MessageCategory. The program also 
 * identifies the latitude and longitude in the message and it determines
 * whether they are within the ranges specified in the program.
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

	enum MessageCategory 
	{
		NEED, OFFER, ALERT, INFO, UNKNOWN
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a formatted message:" + "\n");
		
				
		MessageCategory category;
		
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		String catString = keyboard.next().trim();
		
			if ( catString.equalsIgnoreCase("fire") ||  catString.equalsIgnoreCase("smoke") ) {
			category = MessageCategory.ALERT;
		}
			else if ( catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
	
			else if ( catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
			else if ( catString.equalsIgnoreCase("structure") ||  catString.equalsIgnoreCase("road") 
					||  catString.equalsIgnoreCase("photo") ||  catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
			else {
			category = MessageCategory.UNKNOWN;
			
		}
		

		System.out.println("Category: " + category + "\t");
		System.out.println("Raw Cat: " + catString + "\t");
		
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		
		String payload = keyboard.nextLine().trim();
		System.out.println("Message: " + payload);
		System.out.println("Latitude: " + latitude);
		System.out.println("Longitude: " + longitude);
		
		boolean isInRange;
		
	    if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {
	        isInRange =true;
	        System.out.println("In Range: " + isInRange + "\t");
	          
	    }
	    else {
	        isInRange = false;
	        System.out.println("In Range: " + isInRange + "\t");
	                
	            }
		} 
	
}
