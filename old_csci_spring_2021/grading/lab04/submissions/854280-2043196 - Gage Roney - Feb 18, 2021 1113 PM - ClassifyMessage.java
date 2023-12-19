
/*
 * ClassifyMessage.java
 * Author: Gage Roney 
 * Submission Date:  2/18/2021
 *
 * Purpose:The purpose of ths program is to take some sort of formatted message and parse
 * the information up to easily determine values and variables that will be in the message
 * and allow the program to separate and categorize in a neat way that shows the information
 * easier.
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
import java.util.Scanner; //Scanner used to allow for the user to input a formatted message 

public class ClassifyMessage {
	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN // Set of the enumerations that the program will recognize later in this
											// program
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// The range of the latitude and longitute variables are set as constants here
		double south = 39.882343; // southernmost latitude
		double north = 40.231315; // northernmost latitude
		double west = -105.743511; // westernmost longitude
		double east = -104.907864; // easternmost longitude

		System.out.println("Please enter a formatted message:");
		// All of the desired values given a set of variables that will be easily
		// noticed and manipulated through the program
		String catString = keyboard.next();
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		String payload = keyboard.nextLine();
		payload = payload.trim();
		boolean isInRange;
		// A multi-branch if else statement that analyzes and parses the formatted
		// message
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			System.out.println("Category:\t" + MessageCategory.ALERT);
		} else if (catString.contentEquals("need")) {
			System.out.println("Category:\t" + MessageCategory.NEED);
		} else if (catString.equals("offer")) {
			System.out.println("Category:\t" + MessageCategory.OFFER);
		} else if (catString.equals("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			System.out.println("Category:\t" + MessageCategory.INFO);
		} else {
			System.out.println("Category:\t" + MessageCategory.UNKNOWN);
		}
		// A if else statement that analyzes the longitudinal and latitudinal values to
		// see if it is in range or not
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
			isInRange = true;

		else
			isInRange = false;
		// A series of the rest of the desired outputs needed for the program
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		keyboard.close();
	}

}
