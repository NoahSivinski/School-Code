/*
 * ClassifyMessage.java
 * Author:  Alice Szymkiewicz
 * Submission Date:  2/19/2021
 *
 * Purpose: 
 * 
 * This program takes a user's input of a tweet message and then 
 * classifies the message as a category and parses the info into 
 * latitude, longitude, message content, category, and if it is 
 * in range of a boundary. The enumeration MessageCategory is 
 * declared outside of the main method because it is a type that 
 * cannot be declared within a method. Then the south, north, east, 
 * and west coordinates are declared as constants. After the 
 * Scanner is initialized, the program takes the user's tweet 
 * then assigns a start and finish value. The catString section 
 * is found by reading the input from index 0 to the end of the 
 * substring. The finish variable then has a new value at the end 
 * of this substring. payload is found the same way. Latitude and 
 * longitude are found using a parseDouble() method. The if and 
 * else-if statements determine the category of the problem from 
 * the tweet. If there is a certain String value in the message, 
 * the if and else statements will then assign the MessageCategory 
 * specified to the Category value. An if and else statement is 
 * used to determine if the disaster is within the set coordinates' range. 
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

enum MessageCategory {
	NEED, OFFER, ALERT, INFO, UNKNOWN
}

public class ClassifyMessage {

	public static void main(String[] args) {
		
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		MessageCategory category; //message's category, enum 
		boolean isInRange; //a "flag" indicating whether the latitude and longitude values are within bounds
		
		Scanner scan = new Scanner(System.in); //initializing Scanner
		System.out.println("Please enter a formatted message:");
		String message = scan.nextLine();
		
		int start = 0; //starting value
		int finish = message.indexOf(' ');
		
		String catString = message.substring(start, finish);
		message = message.substring(finish + 1);
		finish = message.indexOf(' ');
		double latitude = Double.parseDouble(message.substring(start, finish)); // finds latitude
		
		String payload = message.substring(finish + 1);
		message = message.substring(finish + 1);
		finish = message.indexOf(' ');
		double longitude = Double.parseDouble(message.substring(start, finish)); // finds longitude
		
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		} 
		
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} 
		
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} 
		
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} 
		
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		if (latitude >= south && latitude <= north) {
			
			if (longitude >= west && longitude <= east) {
				isInRange = true;
			} 
			else {
				isInRange = false;
			}
		}
		
		else {
			isInRange = false;
		}
		
		System.out.print("Category:\t" + category + "\n");
		System.out.print("Raw Cat:\t" + catString + "\n");
		System.out.print("Message:\t" + payload + "\n");
		System.out.print("Latitude:\t" + latitude + "\nLongitude:\t" + longitude + "\n");
		System.out.print("In Range:\t" + isInRange);

		scan.close();
	}
}