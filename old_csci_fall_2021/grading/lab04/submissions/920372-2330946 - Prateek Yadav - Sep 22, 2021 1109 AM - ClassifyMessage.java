/*
 * ClassifyMessage.java
 * Author:  Prateek Yadav
 * Submission Date:  
 * Due Date: 9/24/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program scans a message in order to assign respective variables values based on
 * the contents of the message. An enumeration is used to assign the category value, while
 * strings, doubles, and a boolean are used for the other values.
 *
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
 * I agree with this statement^^
 */
import java.util.Scanner;
//Enumeration
enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}



public class ClassifyMessage {

	public static void main(String[] args) {
		
		//Scanner object creation, variable declaration
		Scanner scan = new Scanner(System.in);
		String catString, payload;
		double latitude, longitude;
		boolean isInRange = true;
		MessageCategory category;
		double south = 39.882343; // Southern-most latitude
		double north = 40.231315; // Northern-most latitude
		double west = -105.743511; // Western-most longitude
		double east = -104.907864; // Eastern-most longitude
		
		
		
		//Prompting user for values, storing values
		System.out.println("Please enter a formatted message:");
		catString = scan.next();
		latitude = scan.nextDouble();
		longitude = scan.nextDouble();
		payload = scan.nextLine();
		//Trimming strings
		catString = catString.trim();
		payload = payload.trim();
		
		
		
		//Category assignment branched if else if statement
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		
		
		//Latitude and Longitude nested if else statement
		if((latitude >= south) && (latitude <= north)) {
			if ((longitude >= west) && (longitude <= east)) {
				isInRange = true;
			}
		}
		else {
			isInRange = false;
		}
		
		
		
		//Outputs
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		
		
		//Closing Scanner
		scan.close();
	}

}
