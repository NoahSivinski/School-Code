/*
 * [ClassifyMessage].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [2/19/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The program is designed to take the user input, which can be a type
 * of message, and directs the message into categories such as, 
 * Category, Raw Cat, Message, Latitude, Longitude, and In Range. The
 * program classifies short messages based on keywords in the input
 * message.
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
/**
 * 
 */

/**
 * @author deyhr
 *
 */

import java.util.Scanner;

enum MessageCategory {
	NEED, OFFER, ALERT, INFO, UNKNOWN
}

public class ClassifyMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message: ");
		
		//variables from the instructions
		String catString = keyboard.next();
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		String payload = keyboard.nextLine();
		boolean isInRange = false;

		MessageCategory category;

		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;

		//the if else statements
		if (catString.equalsIgnoreCase("fire") ||catString.equalsIgnoreCase("smoke"))
		{
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("need"))
		{
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer"))
		{
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure"))
		{
			category = MessageCategory.INFO;
		}
		else if (catString.equalsIgnoreCase("road"))
		{
			category = MessageCategory.INFO;
		}
		else if (catString.equalsIgnoreCase("photo"))
		{
			category = MessageCategory.INFO;
		}
		else if (catString.equalsIgnoreCase("evac"))
		{
			category = MessageCategory.INFO;
		}
		else 
		{
			category = MessageCategory.UNKNOWN;
		}
	

		if (latitude>= south && latitude<=north) {
		if (longitude >= west && longitude <= east){
			isInRange = true;
		}else {
			isInRange = false;
		} 
		}
		else { 
			isInRange=false;
}		
		System.out.println("Category: \t"+category);
		System.out.println("Raw Cat: \t"+catString);
		System.out.println("Message:       "+payload);
		System.out.println("Latitude: \t"+latitude);
		System.out.println("Longitude: \t"+longitude);
		System.out.print("In Range: \t" + isInRange);
		
		keyboard.close();
	}
}
