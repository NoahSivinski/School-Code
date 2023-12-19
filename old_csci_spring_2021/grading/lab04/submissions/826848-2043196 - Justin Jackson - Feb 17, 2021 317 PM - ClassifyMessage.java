/*
 * ClassifyMessage.java
 * Author:  Justin Jackson 
 * Submission Date:  2/17/2021
 *
 * Purpose: Reads inputted messages to scan for partiuclar details, categorize messages and save this information 
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
enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};
public class ClassifyMessage {

	public static void main(String[] args) {
		String catString;
		String payLoad;
		Double latitude;
		Double longitude;
		boolean isInRange;
		MessageCategory category;
		final Double south = 39.882343;
		final Double north = 40.231315;
		final Double west = -105.743511;
		final Double east = -104.907864;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine();
		payLoad = payLoad.trim();
		catString = catString.trim();
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) 
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need")) 
		category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east)
			isInRange = true;
		else
			isInRange = false;
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payLoad);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);

	}

}
