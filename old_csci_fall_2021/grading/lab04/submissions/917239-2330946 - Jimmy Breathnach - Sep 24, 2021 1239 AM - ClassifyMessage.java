
/*
 * ClassifyMessage.java
 * Author:  James Breathnach
 * Submission Date:  9/24/2021
 *
 * Purpose: This program takes messages given to it by the user and categorize it into 5 differing categories by using if else statements.
 * The program also displays the category, he type of incident, the latitude and logitude and also if it is in range.
 * It does this with an if else statement as well.
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

	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN} //the enum the instructions told me to set up. Creates the categories which will be later used.


	// the constants for the values which will be used to determing if it is in range is listed here.
	public static final double SOUTH= 39.882343; // southernmost latitude
	public static final double NORTH= 40.231315; // northernmost latitude
	public static final double WEST= -105.743511; // westernmost longitude
	public static final double EAST= -104.907864; // easternmost longitude

	public static void main(String[] args) {




		boolean isInRange;// A “flag” indicating whether the latitude and  longitude values are within bounds





		System.out.println("Please enter a formatted message:"); //Prompts the user Input

		Scanner keyboard = new Scanner(System.in); // makes the scanner object the keyboard
		String catString = keyboard.next();// The primary content of the message
		double latitude = keyboard.nextDouble(); // The latitude indicated in the message 
		double longitude = keyboard.nextDouble(); // The longitude indicated in the message		
		String payload = keyboard.nextLine();  // The raw text of the message’s category		


		//the if, else if, else statements are used to determine the type of message it is and it prints it out as well
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke") ) {
			MessageCategory type = MessageCategory.ALERT; // type called type as the type of category is being determined.
			System.out.println("Category:\t" + type); // type is printed in a new line
		} else if (catString.equalsIgnoreCase("need")){
			MessageCategory type = MessageCategory.NEED;
			System.out.println("Category:\t" + type);
		} else if (catString.equalsIgnoreCase("offer")){
			MessageCategory type = MessageCategory.OFFER;
			System.out.println("Category:\t" + type);
		} else if (catString.equalsIgnoreCase("structure") ||catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			MessageCategory type = MessageCategory.INFO;
			System.out.println("Category:\t" + type);
		} else {
			MessageCategory type = MessageCategory.UNKNOWN;
			System.out.println("Category:\t" + type);
		}

		//this part is used to determine weather if the value of latitude and longitude put it in range.
		if (latitude >= SOUTH && latitude <= NORTH && longitude >= WEST && longitude <= EAST) {
			isInRange = true ; 
		}else {
			isInRange = false;
		}

		//Prints out the values according to the instructions.
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload.trim());
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

	}

}