/*
 * ClassifyMessage.java
 * Author: Samir Hadi Cisneros
 * Submission Date:  [Submission date here]
 *
 * Purpose: This program practices using if else statements to classify information 
 * from tweets into categories.
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
 * 
 * I agree
 */
import java.util.Scanner;

public class ClassifyMessage {
	//create an enumeration to classify the categories
	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN
	};

	public static void main(String[] args) {

		//declare the variables for the program
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;

		//declare these doubles to use as boundaries
		double north = 40.231315;
		double south = 39.882343;
		double east = -104.907864;
		double west = -105.743511;

		
		//prompt the user input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a formatted message: ");

		//use the input to store each category's input
		catString = input.next();
		catString.trim();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine();
		payload.trim();
		input.close();

		
		//use the if else statements to match the stored values to the enumerated values
		if (catString.equalsIgnoreCase("fire") || (catString.equalsIgnoreCase("smoke"))) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else {
			category = MessageCategory.UNKNOWN;
		}

		//determine if the latitude and longitude are in range
		if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		
		//print the output
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);

	}

}
