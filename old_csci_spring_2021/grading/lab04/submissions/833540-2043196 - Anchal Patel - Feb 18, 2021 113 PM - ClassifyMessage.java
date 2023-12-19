/*
 * [ClassifyMessage].java
 * Author:  [Anchal Patel] 
 * Submission Date:  [February 18, 2021]
 *
 * Purpose: The purpose of this program is to be able to sort through
 * messaged based on keywords in the message. The purpose of this is
 * so that tweets with important information will be acted on quickly.
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
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		MessageCategory category;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		
		if  ((catString .equalsIgnoreCase ("smoke")) || (catString .equalsIgnoreCase ("fire")))
		{
			category = MessageCategory.ALERT;
			System.out.println("Category:\t" + category);
		}
		else if (catString .equalsIgnoreCase ("need")) 
		{
			category = MessageCategory.NEED;
			System.out.println("Category:\t" + category);
		}
		else if (catString .equalsIgnoreCase ("offer"))
		{
			category = MessageCategory.OFFER;
			System.out.println("Category:\t" + category);
		}
		else if ((catString .equalsIgnoreCase ("structure")) || (catString .equalsIgnoreCase ("photo")) || (catString .equalsIgnoreCase ("road")) || (catString .equalsIgnoreCase ("evac")))
		{
			category = MessageCategory.INFO;
			System.out.println("Category:\t" + category);
		}
		else 
		{	
			category = MessageCategory.UNKNOWN;
			System.out.println("Category:\t" + category);
		}
		
			
		
		
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
		{
			isInRange = true;
			System.out.println("In Range:\t" + isInRange);		
		}
		else {
			isInRange = false;
			System.out.println("In Range:\t" + isInRange);
		}
		
				
		keyboard.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}

		





		
				
		
		
		
	
