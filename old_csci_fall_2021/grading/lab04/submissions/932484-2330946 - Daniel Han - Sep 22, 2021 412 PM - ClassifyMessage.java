/*
 * [ClassifyMessage].java
 * Author:  [Daniel Han] 
 * Submission Date:  [9/22/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program is supposed to receive an input and then extract data and assign various variables. It will also use enumeration for the category type. This program created the MessageCategory enumeration with the NEED, OFFER, ALERT, INFO, AND UNKNOWN CATEGORIES
 * Then I initialized and assigned the final double variables south, east, north, and west using the floating point numbers we were given. 
 * The program then asked for the input data and then assigned data, strings and doubles to the catString, payLoad, latitude, and longitude variables
 * The program then uses a series of if and if-else statements to determine how to assign the MessageCategory variable category and whether to assign it with NEED, OFFER, ALERT, INFO, AND UNKNOWN.
 * The program then uses some if statements to determine to make the isInRange variable true (The variable was automatically assigned to false so skip a few lines of if-else code to make the variable false)
 * The program will then output data following proper I/O
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



//imported scanner class and method
import java.util.*;

public class ClassifyMessage {
    //created the enumeration and created several message categories for it
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	
	public static void main(String[] args) {
		//created the scanner object and named it keyboard
		Scanner keyboard = new Scanner(System.in);


		//initialized the input variables and the MessageCategory variable and assigned a default false value to the boolean isInRange to save a few lines of code
		String catString; String payLoad;
		double latitude; double longitude; 
		boolean isInRange = false;
		MessageCategory category;


		//created and assigned the south, north, west, and east final double variables
		final double SOUTH = 39.882343;
		final double NORTH = 40.231315;
		final double WEST = -105.743511;
		final double EAST = -104.907864;


		//asked for the user's input data
		System.out.println("Please enter a formatted message:");


		//used the scanner object methods to extract strings or doubles from the input data
		catString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine().trim();

		
		//series of if statements and if-else statements to assign a value to the MessageCategory category variable
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


		
		//if statements to see if the latitude and longitude are in range, if not, no action will be taken because the variable was already assigned to false
		if ( SOUTH <= latitude && NORTH >= latitude) {
			if (WEST <= longitude && EAST >= longitude) {
				isInRange = true;
			}
		}


		//output block of code following proper I/O
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payLoad);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);


		//closes the scanner object
		keyboard.close();
	}
}
