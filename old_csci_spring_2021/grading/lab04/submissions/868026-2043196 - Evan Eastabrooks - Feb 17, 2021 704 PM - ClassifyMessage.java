/*
 * ClassifyMessage.java
 * Author:  Evan Eastabrooks 
 * Submission Date:  2/17/2021
 *
 * Purpose: ClassifyMessage.java prompts the user to input a formatted
 * message and parses it to obtain specific values and categorize them.
 * For example, if the user's message begins with "fire", the program
 * will display "Category: ALERT". From there, the program just does
 * that for the rest of the user's message. This makes it so the people
 * analyzing the messages can easily tell what the message is trying
 * to say and make decisions based on each category.
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

	//Creates the enumerator
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}; 
	
		public static void main(String[] args) {
		
			//Declaring variables
			String catString,payload;
			double latitude,longitude;
			boolean isInRange;
			MessageCategory category;
			
			//Declaring constants
			final double south = 39.882343;
			final double north = 40.231315;
			final double west = -105.743511;
			final double east = -104.907864;
			
			//Getting input from the user
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a formatted message: ");
			catString = keyboard.next();
			latitude = keyboard.nextDouble();
			longitude = keyboard.nextDouble();
			payload = keyboard.nextLine();
			//Trimming these two variables from the user
			catString = catString.trim();
			payload = payload.trim();
			
			//These "if else" statements are determining the category of the user's message
			if(catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke"))
				category = MessageCategory.ALERT;
			else if(catString.equalsIgnoreCase("need"))
				category = MessageCategory.NEED;
			else if(catString.equalsIgnoreCase("offer"))
				category = MessageCategory.OFFER;
			else if(catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
				category = MessageCategory.INFO;
			else
				category = MessageCategory.UNKNOWN;
			
			//Determining if the event is in range or not
			if(((latitude >= south)&&(latitude <= north))&&((longitude >= west)&&(longitude <= east)))
				isInRange = true;
			else
				isInRange = false;
			
			System.out.println("Category:\t\t" + category);
			System.out.println("Raw Cat:\t\t" + catString);
			System.out.println("Message:\t\t" + payload);
			System.out.println("Latitude:\t\t" + latitude);
			System.out.println("Longitude:\t\t" + longitude);
			System.out.println("In Range:\t\t" + isInRange);
	}

}
