/*
 * [ClassifyMessage].java
 * Author:  [Davis Klein] 
 * Submission Date:  [9/24/2021]
 *
 * Purpose: This program takes a formatted user input in the form of a string. Each component of the string is assigned to its matching variable. 
 * The category is assigned to its corresponding category in enum MessageCategory, based on keywords listed in the if/elif statement starting on
 * line 51. If the catString does not match any of these keywords, it will be assigned to the MessageCategory unknown. The program then uses 
 * another if/elif branch statement to determine if the user input latitude and longitude are within a constant set of values, declared 
 * beginning on line 39. The resultant variables are then output to the screen.
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
	
	//enumeration MessageCategory is declared and initialized to the five possible categories.
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		
		//in this section, all necessary variables for the program are declared. bool value isInRange is initialized to false, in order for the 
		//program to run. The constant values that declare the bounds of latitude and longitude are declared as final because they are constants,
		//and assigned to the corresponding values.
		String catString, payload;
		double latitude, longitude;
		boolean isInRange = false;
		MessageCategory category;
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		
		//input is taken from the user, and the values are assigned to the corresponding variables. the program is able to be written this way
		//because the input is assumed to be in a specific format.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		//string variables are stripped of any leading or trailing whitespace
		catString = catString.trim();
		payload = payload.trim();
		
		//this branching decision statement assigns the category of the message to its corresponding value in enum MessageCategory. this is
		//done by comparing the raw string input to the condition(s) that must be met in order for the variable to be assigned to its matching
		//category. if there is no match, the category is assigned to MessageCategory.UNKNOWN.
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
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
		
		//this branching decision statement checks if the input latitude and longitude variables are within the set constants mentioned above. 
		//if there are, the variable isInRange is assigned to true. If not, false.
		if (latitude >= south && latitude <= north) {
			if (longitude >= west && longitude <= east) {
				isInRange = true;
			}
		}
		else {
			isInRange = false;
		}
		
		//finally, the resultant variables are output to the screen concatenated with a string that describes the variable. '\t' is used
		//to provide correct formatting.
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		//close the keyboard
		keyboard.close();
	}
}
