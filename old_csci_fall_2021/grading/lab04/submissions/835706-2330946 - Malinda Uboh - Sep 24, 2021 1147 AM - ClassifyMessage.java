/*
 * [ClassifyMessage].java
 * Author:  [Malinda Uboh] 
 * Submission Date:  [09/24/2021]
 *
 * Purpose: 
 * This program uses if-else statements 
 * and enumeration to classify messages based 
 * on keywords located inside of said messages. 
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
	
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN} // Declare the enumeration 
	
	public static void main(String[] args) {
	
		String catString; //raw text of message category 
		String payload; //primary content of message
		double latitude, longitude;
		boolean isInRange; //indicate whether latitude and longitude are in range
		
		double south = 39.882343;
	    double north = 40.231315;
	    double west =	-105.743511;
	    double east = -104.907864;
	   
		MessageCategory category; //The message's category
		
		//Get input for multiple variables from user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString = catString.trim(); //Remove leading and trailing white spaces from the string
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		//Match value stored in catString to one of the categories of the enumeration 
		if ((catString.equalsIgnoreCase("fire") || (catString.equalsIgnoreCase("smoke")))) { //Account for case variations of user input
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;	
		}
		else if  (((catString.equalsIgnoreCase( "structure") || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase( "photo") || ((catString.equalsIgnoreCase("evac"))))))) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
			
		}
		
		//Determine if latitude and longitude are within geographical bounds represented by variables north, south, east, and west
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
			isInRange = true;
		}
		else { 
			isInRange = false;
		}

		System.out.println("Category:    " + category);
		System.out.println("Raw Cat:     " + catString);
		System.out.println("Message:     " + payload);	
		System.out.println("Latitude:    " + latitude);
		System.out.println("Longitude:   " + longitude);
		System.out.println("In Range:    " + isInRange);
			
		
		
		
		
	}	
		

}
