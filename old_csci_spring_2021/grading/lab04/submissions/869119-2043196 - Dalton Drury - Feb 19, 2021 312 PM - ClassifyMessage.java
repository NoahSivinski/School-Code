
/*
 * ClassifyMessage.java
 * Author:  Dalton Drury 
 * Submission Date:  Feb 19, 2021
 *
 * Purpose: My program prompts the user to enter a formatted message (sample input), and my program
 * parses this text, similar to "ParseTheTweet", but here I used If/Else, Branching, and Enumerations to classify
 * these short messages based on the keywords in these messages. Our output here gives us the desired type 
 * of output specified in the instructions. 
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
	// Here I declared the enumeration message categories.
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};

	public static void main(String[] args) {
		// Here I created my scanner "keyboard" 
		Scanner keyboard = new Scanner(System.in);

		String catString = "Raw Cat";
		String payLoad = "Payload";
		double latitude;
		double longitude;
		boolean inRange = false;
		MessageCategory category;

		// Below I declared my double variables, but I made them a constant since we aren't changing them.
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;

		// Here I prompt the user to "Please enter a formatted message". 
		System.out.println("Please enter a formatted message:");

		catString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine().trim();

		// Here I enter the desired if/else statements from the instructions. 
		if (catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke")) 
		{
			category=MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) 
		{
			category=MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) 
		{
			category=MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")
				||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
		{
			category=MessageCategory.INFO;
		}
		else 
		{
			category=MessageCategory.UNKNOWN;
		}
		if (latitude>=south && latitude<=north && longitude>=west && longitude<=east) 
			inRange=true;
		else 
			inRange=false;

		// Here I print the line for our desired output. 
		System.out.println("Category:\t"+category);
		System.out.println("Raw Cat:\t"+catString);
		System.out.println("Message:\t"+payLoad);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("longitude:\t"+longitude);
		System.out.println("In Range:\t"+inRange);

		keyboard.close();

	}

}

