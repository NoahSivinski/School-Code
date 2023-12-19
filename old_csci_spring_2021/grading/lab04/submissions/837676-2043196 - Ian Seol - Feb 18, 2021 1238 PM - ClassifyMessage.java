/*
 * [CSCI1301L].java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [02182021]
 *
 * Purpose:This program reads user's formatted message and categorizes
 * message and prints the message depending on the category of message.
 * The program uses if-else statements to figure out the categories of message
 * and prints the information in a readable manner.
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

public class ClassifyMessage{

	//category of messages declared
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};

	public static void main(String[] args) {

		//for keyboard user input
		Scanner keyboard = new Scanner(System.in);

		String catString;   // The raw text of the message's category
		String payload;     // The primary content of the message
		double latitude;    // The latitude indicated in the message
		double longitude;   // The longitude indicated in the message
		boolean isInRange;  // A "flag" indicating whether the latitude and
		// longitude values are within bounds

		ClassifyMessage.MessageCategory category;  // The message's category

		//latitude and longitudes in range
		double south = 39.882343;	// southernmost latitude
		double north = 40.231315;	// northenmost latitude
		double west = -105.743511;	// westernmost longitude
		double east = -104.907864;	// eaternmost longitude

		//user will be prompted with a message to enter formatted messsage
		System.out.println("Please enter a formatted message:");

		//User's formatted input is saved under different variables
		catString = keyboard.next();	
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();

		//If-else branches to categorize the message to appropriate category
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") 
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else 
			category = MessageCategory.UNKNOWN;

		//if-else method to determine if the user's latitude is in the range
		if (latitude >= south && north >= latitude)
			isInRange = true;
		else
			isInRange = false;

		//if-else method to determine if the user's longitude is in the range
		if (longitude >= west && east >= longitude)
			isInRange = true;
		else
			isInRange = false;

		//printing formatted user input
		System.out.print("Category:\t" + category);
		System.out.println();
		System.out.print("Raw Cat:\t" + catString);
		System.out.println();
		System.out.printf("Message:\t" + payload.trim());//trimmed for possible spaces
		System.out.println();
		System.out.printf("Latitude:\t" + latitude);
		System.out.println();
		System.out.printf("Longitude:\t" + longitude);
		System.out.println();
		System.out.printf("In Range:\t" + isInRange);
		System.out.println();

		keyboard.close();
		System.exit(0);
	}
}
