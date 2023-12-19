/*
 * [ClassifyMessage].java
 * Author:  [Jordyn Griffith] 
 * Submission Date:  [Friday, September 24, 2021]
 *
 * Purpose:  This program is designed to parse the text of a user 
 * specified message, identify the category of the message, and assign 
 * this value to a variable (category) declared to be of type MessageCategory.
 * It also identifies the latitude and longitude specified in the message
 * and determines whether these are within ranges defined elsewhere in the program. 
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
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:"); //prompts the User to enter a formatted message 
		
		String catString = keyboard.next(); //The Raw Text of the message's category  
		double latitude = keyboard.nextDouble(); //The latitude indicated in the message 
		double longitude = keyboard.nextDouble(); //The longitude indicated in the message 
		boolean isInRange = true; //A "flag" indicating whether the latitude and longitude values are within bounds 
		MessageCategory category; //The message's category 
		final double SOUTH = 39.882343; //southernmost latitude 
		final double NORTH = 40.231315; //northernmost latitude
		final double WEST = -105.743511; //westernmost longitude
		final double EAST = -104.907864; //easternmost longitude
		
		String payload = keyboard.nextLine(); //The primary content of the message
		
		if (catString.equalsIgnoreCase("fire")) //matches the value of catString to one of the elements in the enumeration MessageCategory
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure"))
			category = MessageCategory.INFO;
		else if (catString.equalsIgnoreCase("road"))
			category = MessageCategory.INFO;
		else if (catString.equalsIgnoreCase("photo"))
			category = MessageCategory.INFO;
		else if (catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else 
			category = MessageCategory.UNKNOWN;
		
		System.out.println("Category:\t" + category);
		String [] message = catString.split(" "); //splits the text after the first whitespace is detected
		for (String rawCat : message) {
			System.out.println("Raw Cat:\t" + rawCat.trim()); //prints the raw category and trims the value for any leading and trailing white spaces from the text
		}
		 
		System.out.println("Message:\t" + payload.trim()); //prints the message and trims the value for any leading and trailing white spaces from the text
		System.out.println("Latitude:\t" + latitude); //prints the value for latitude 
		System.out.println("Longitude:\t" + longitude); //prints the value for longitude 
		
		if (latitude >= SOUTH && latitude <= NORTH)
		{
			if (longitude >= WEST && longitude <= EAST)
				isInRange = true;
		}
		else 
			isInRange = false;
			System.out.println("In range:\t" + isInRange); 
		
		keyboard.close();


	}

}
