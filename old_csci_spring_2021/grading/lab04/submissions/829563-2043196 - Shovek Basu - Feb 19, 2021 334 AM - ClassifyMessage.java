/*
 * [ClassifyMessage].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [02/19/2021]
 *
 * Purpose: Organizes a message into different parts.
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
enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN};

public class ClassifyMessage {


	public static void main(String[] args){
	
	String catString;
	String payload;
	double latitude;
	double longitude;
	boolean isInRange;
	MessageCategory category;
	final double south = 39.882343;
	final double north = 40.231315;
	final double east = -105.743511;
	final double west = -104.907864;
	
	System.out.println("Please enter a formatted message:");
	Scanner keyboard = new Scanner (System.in);
	catString = keyboard.next().trim();
	latitude = keyboard.nextDouble();
	longitude = keyboard.nextDouble();
	payload = keyboard.nextLine().trim();
	
	//branching if else statement for message category
	if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){
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
	else 
		category = MessageCategory.UNKNOWN;
	
	//branching if else statements to check if latitude and longitude are in range
	if((latitude >= south) && (latitude <=north)){
		isInRange = true;
	}
	else if ((longitude >= west) && (longitude <= east)) {
		isInRange = true;
	}
	else 
		isInRange = false;
	
	System.out.println("Category:\t"+category);
	System.out.println("Raw Cat:\t"+catString);
	System.out.println("Message:\t"+payload);
	System.out.println("Latitude:\t"+latitude);
	System.out.println("Latitude:\t"+longitude);
	System.out.println("In Range:\t"+isInRange);

	
	keyboard.close();
	}
}