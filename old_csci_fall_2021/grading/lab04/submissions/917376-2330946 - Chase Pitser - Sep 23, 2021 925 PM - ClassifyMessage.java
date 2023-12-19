/*
 * ClassifyMessage.java
 * Author: Chase Pitser 
 * Submission Date: 9/23/21
 *
 * Purpose: The purpose of this java program is to take an input message 
 *  and use an enumeration to categorize a message. It also prints all of the 
 *  details that the message gives and states if the location is within certain boundaries.
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

	enum  MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		MessageCategory category; //Variable of the type MessageCategory from the enumeration
		String catString; // The raw text of the message’s category
		String payload; // The primary content of the message
		double latitude; // The latitude indicated in the message
		double longitude; // The longitude indicated in the message
		boolean isInRange; // A “flag” indicating whether the latitude and longitude values are within bounds
		double south = 39.882343; // southernmost latitude
		double north = 40.231315; // northernmost latitude
		double west = -105.743511; // westernmost longitude
		double east = -104.907864; // easternmost longitude
		//User enters a message, all of the variables are taken from the input
		System.out.println("Please enter a formatted message:");
		catString = Keyboard.next().trim();
		latitude = Keyboard.nextDouble();
		longitude = Keyboard.nextDouble();
		payload = Keyboard.nextLine().trim();
		//determines what category the message is 
		if(catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		}else {
			category = MessageCategory.UNKNOWN;
		}
		//determine if the latitude and longitude are in the range given
		if((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)) {
			isInRange = true;
		}else {
			isInRange = false;
		}
		//all data is printed
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		//Scanner close
		Keyboard.close();
	}

}
