/*
 * [ClassifyMessage].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [9/24/2021]
 *
 * Purpose: The purpose of this program is to parse the text of a message input by the user, separating it into categories.
 * It will display the content of the message based on type, and it will also use latitude and longitude to determine if the
 * coordinates are within the ranges defined in the program.
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
	//Create enumeration to determine which category the message falls under
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	//Define variables (strings, booleans, doubles, etc. based on type) that will be used to read the formatted message
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		String catString = " ";
		String payload = " ";
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category; 
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;

		//Ask user to enter a formatted message
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		int finish = payload.indexOf(" ");

		//Use if-else statements to determine message category using the enumeration previously created
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT; }
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED; }
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER; }
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO; }
		else {
			category = MessageCategory.UNKNOWN; }

		String rawcat = catString.substring(finish);

		//Use if-else statement to create a boolean value based on latitude and longitude coordinates within the message
		if ((latitude >= south && latitude <= north) & (longitude >= west && longitude <= east)) {
			isInRange = true; }
		else {
			isInRange = false; }

		keyboard.close();

		//Display the formatted message that has been organized using variables defined earlier (category, message, etc.)
		System.out.println("Category: " + "\t" + category);
		System.out.println("Raw Cat: " + "\t" + rawcat.trim());
		System.out.println("Message: " + "\t" + payload.trim());
		System.out.println("Latitude: " + "\t" + latitude);
		System.out.println("Longitude: " + "\t" + longitude);
		System.out.println("In Range: " + "\t" + isInRange);


	}

}


