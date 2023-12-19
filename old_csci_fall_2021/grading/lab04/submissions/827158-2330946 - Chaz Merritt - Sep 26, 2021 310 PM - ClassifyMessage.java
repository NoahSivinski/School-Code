/*
 * ClassifyMessage.java
 * Author:  Charles Merritt
 * Submission Date:  9/26/21
 *
 * Purpose: This program serves a similar function to the ParseTheTweet program we created last week,
 * that is to say, it takes in a string "tweet" as an input from the user. Then, the program will seperate the 
 * string using keywords and if-else statements.
 *
 * Statement of Academic Honesty: CEM
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
		// TODO Auto-generated method stub
		//variables
		final double north = 40.231315;
		final double south = 39.882343;
		final double east = -104.907864;
		final double west = -105.743511;
		String catString, payload, catStringTrim, payloadTrim;
		Double latitude, longitude;
		Boolean isInRange;
		MessageCategory category;
		//input
		System.out.print("Please enter a formatted message: ");
		Scanner keyboard = new Scanner(System.in);
        catString = keyboard.next();
        catStringTrim = catString.trim();
        latitude = keyboard.nextDouble();
        longitude = keyboard.nextDouble();
        payload = keyboard.nextLine();
        payloadTrim = payload.trim();
		//math
		if (catStringTrim.equalsIgnoreCase("smoke") || catStringTrim.equalsIgnoreCase("fire")) {
			category = MessageCategory.ALERT;
		}
		else if (catStringTrim.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catStringTrim.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catStringTrim.equalsIgnoreCase("structure") || catStringTrim.equalsIgnoreCase("road") || catStringTrim.equalsIgnoreCase("photo") || catStringTrim.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		if ((latitude >= south & latitude <= north) && (longitude >= west & longitude <= east)) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		//print
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catStringTrim);
		System.out.println("Message:\t" + payloadTrim);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	}

}

/*
*  else if (a == 2)
		category = MessageCategory.OFFER;
		else if (a == 2)
		category = MessageCategory.ALERT;
		else if (a == 2)
		category = MessageCategory.INFO;
*
*/