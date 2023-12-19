/*
 * ClassifyMessage.java
 * Author:  Lincoln Ledet
 * Submission Date:  9/24/21
 * lab 04
 *
 * Purpose: This program takes an input from the user and then divides it into 4 category's. Based on the catString variable 
 * it assigns the message to an enumerated category. It also determiners if the message is in range based on latitude
 * and longitude coordinates.
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
	
	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
		
		double north = 40.231315;
		double south = 39.882343;
		double east = -104.907864;
		double west = -105.743511;
		
		//scans input and assigns to variables 
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = Keyboard.next();
		latitude = Keyboard.nextDouble();
		longitude = Keyboard.nextDouble();
		payload = (Keyboard.nextLine()).trim();
		
		//assigns message category
		if (catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke"))
		{
			 category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need"))
		{
			 category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer"))
		{
			 category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
		{
			 category = MessageCategory.INFO;
		}
		else
		{
			category = MessageCategory.UNKNOWN;
		}
		
		//finds if message is in range
		isInRange = !((latitude>north||latitude<south) || (longitude>east)||(longitude<west ) );

		System.out.println("Category:\t"+category);
		System.out.println("Raw Cat:\t"+catString);
		System.out.println("Message:\t"+payload);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
		System.out.println("In Range:\t"+isInRange);
		

	}

}
