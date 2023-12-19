/*
 * [ClassifyMessage].java
 * Author:  [Stephanie Ibarra] 
 * Submission Date:  [2/19/1021]
 *
 * Purpose: This lab is used to parse text of messages like tweets
 * and sort them into categories. It will identify the category of the 
 * message, and assign a value to the category. It will also identify the latitude 
 * and longitude specified and determine if it is within the defined range.
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

public class ClassifyMessage 
{
	enum MessageCategory {NEED,OFFER,ALERT,INFO,UNKNOWN;}
	
	static String catString;
	static String payLoad;
	static double latitude;
	static double longitude;
	static boolean isInRange;
	static MessageCategory category;
	
	static final double SOUTH=39.882343;
	static final double NORTH=40.231315;
	static final double WEST=-105.743511;
	static final double EAST=-104.907864;

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine().trim();
		
		if(catString.equalsIgnoreCase("Fire")||catString.equalsIgnoreCase("Smoke"))
			category = MessageCategory.ALERT;
		else if(catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if(catString.equalsIgnoreCase("Offer"))
			category = MessageCategory.OFFER;
		else if(catString.equalsIgnoreCase("Structure")||catString.equalsIgnoreCase("Road")||catString.equalsIgnoreCase("Photo")||catString.equalsIgnoreCase("Evac"))
				category = MessageCategory.INFO;
		else 
			category = MessageCategory.UNKNOWN;
		
		if(latitude>= SOUTH && latitude<= NORTH && longitude >= WEST && longitude<= EAST)
			isInRange=true;
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payLoad);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close();
	}

}
