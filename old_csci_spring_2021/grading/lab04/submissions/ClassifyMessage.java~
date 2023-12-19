/*
 * [ClassifyMessage].java
 * Author:  [Kyle Bai] 
 * Submission Date:  [02/19/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program us if-else to classify short messages based on keywords in the message.
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

	enum MessageCategory{NEED,OFFER,ALERT,INFO,UNKNOWN}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter a formatted message:");

		String catString = keyboard.next();//read values for catString
		double latitude = keyboard.nextDouble();//read values for latitude
		double longitude = keyboard.nextDouble();//read values for longitude
		String payload = keyboard.nextLine();//read values for payload

		keyboard.close();

		boolean isInRange;// A “flag” indicating whether the latitude and longitude values are within bounds
		MessageCategory category;// The message’s category

		double south = 39.882343;// southernmost latitude
		double north = 40.231315;// northernmost latitude
		double west = -105.743511;// westernmost longitude
		double east = -104.907864;// easternmost longitude

		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) { //If the value of catString is fire or smoke, then assigned the value MessageCategory.ALERT
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) { //If the value of catString is need, then assigned the value MessageCategory.NEED
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) { //If the value of catString is offer, then assigned the value MessageCategory.OFFER
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) { //If the value of catString is structure, road or photo, then category assigned the value MessageCategory.INFO
			category = MessageCategory.INFO;
		}
		else { //Otherwise, assigned the value MessageCategory.UNKNOWN
			category = MessageCategory.UNKNOWN;	
		}

		System.out.println("Category:" + '\t' + category);
		System.out.println("Raw Cat:" + '\t' + catString.trim());
		System.out.println("Message:" + '\t' + payload.trim());
		System.out.println("Latitude:" + '\t' + latitude);
		System.out.println("Longitude:" + '\t' + longitude);

		if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)) { // If the value of latitude and longitude is in range, then print true
			isInRange = true;
			System.out.println("In Range" + '\t' + isInRange);
		}
		else { // If the value of latitude and longitude is not in range, then print false
			isInRange = false;
			System.out.println("In Range" + '\t' + isInRange);
		}
	}
}