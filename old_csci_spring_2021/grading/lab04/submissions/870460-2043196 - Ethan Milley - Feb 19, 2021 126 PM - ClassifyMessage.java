/*
 * ClassifyMessage.java
 * Author:  Ethan Milley 
 * Submission Date:  2/19/2021
 *
 * Purpose: The following code separates parts of a formated tweet
 * and defines it's category and whether it is within a specific
 * longitudinal and latitudinal range. It does this by using a
 * variety of if-else statements. However, this program is limited
 * to a specific format for the tweet and has a limited amount of 
 * categories. 
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
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKOWN}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String catString, /*The raw text of the message's category*/ payload; //The primary content of the message
		double latitude, /*The latitude indicated in the message*/ longitude; //The longitude indicated in the message
		boolean isInRange; //A "flag" indicating whether the latitude and longitude values are within bounds
		MessageCategory category; //The message's category
		
		double south, /*southernmost latitude*/ north;//northernmost latitude
		double west, /*westermost longitude*/ east; //easternmost longitude
		south = 39.882343;
		north = 40.231315;
		west = -105.743511;
		east = -104.907864;
		
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		catString = catString.trim();
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke")))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road"))
		|| (catString.equalsIgnoreCase("photo")))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKOWN;
		
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
			isInRange = true;
		else
			isInRange = false;
			
		payload = payload.trim();
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

	}

}
