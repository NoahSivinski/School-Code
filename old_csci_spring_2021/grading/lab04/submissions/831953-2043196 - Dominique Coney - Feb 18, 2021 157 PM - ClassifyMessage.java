import java.util.Scanner;

/**
 * 
 */

/** 
 /*
 * [ClassifyMessage].java
 * Author:  [Dominique Coney] 
 * Submission Date:  [February 18, 2021]
 *
 * Purpose: The purpose of this program is to utilize if-else statements to classify different parts of messages into specific categories, using specific words within the messages.
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
 
public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter a formatted message: ");
		String catString = keyboard.next();
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		String payload = keyboard.nextLine();
	    payload = payload.trim();
	    catString = catString.trim();
		boolean isInRange;
		MessageCategory category;
		final double south=39.882343;
		final double north=40.231215;
		final double west=-105.743511;
		final double east=-104.907864;
		if (  catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke") ) {
			category = MessageCategory.ALERT;
		}
		else if ( catString.equalsIgnoreCase("need") ) {
			category = MessageCategory.NEED;
		}
		else if ( catString.equalsIgnoreCase("offer") ) {
			category = MessageCategory.OFFER;
		}
		else if ( catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")  ) {
			category = MessageCategory.INFO;
		}
		else  {
			category = MessageCategory.UNKNOWN;	
		}
		if (latitude>=south && latitude <=north && longitude>= west && longitude <= east) {	
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close();
		}
}