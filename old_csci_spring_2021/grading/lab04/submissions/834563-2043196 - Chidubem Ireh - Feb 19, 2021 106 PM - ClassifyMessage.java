/*
 * ClassifyMessage.java
 * Author: Chidubem Ireh
 * Submission Date: 02-19-2021
 *
 * Purpose: The purpose of this program is to break apart the user input so it can be understood by the system.
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
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};

	public static void main(String[] args) {

		
		String rawCat;
		String payload;
		double latitude;
		double longitude;
		boolean inRange;
		
		// directions
		final double south = 39.882343; // southernmost latitude
		final double north = 40.231315; // northernmost latitude
		final double east = -104.907864; // easternmost longitude
		final double west = -105.743511; // westernmost longitude

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		
		rawCat=keyboard.next();
		latitude=keyboard.nextDouble();
		longitude=keyboard.nextDouble();
		payload=keyboard.nextLine().trim();

		if ((rawCat.equalsIgnoreCase("fire") || (rawCat.equalsIgnoreCase("smoke"))))
			System.out.println("Category:\t\t" + MessageCategory.ALERT);
		else if (rawCat.equalsIgnoreCase("need")) {
			System.out.println("Category:\t\t" + MessageCategory.NEED);
		} else if (rawCat.equalsIgnoreCase("offer")) {
			System.out.println(MessageCategory.OFFER);
		} else if ((rawCat.equalsIgnoreCase("structure")) || (rawCat.equalsIgnoreCase("road"))|| (rawCat.equalsIgnoreCase("photo")) || (rawCat.equalsIgnoreCase("evac"))) {
			System.out.println("Category:\t\t" + MessageCategory.INFO);
		} else {
			System.out.println("Category:\t\t" + MessageCategory.UNKNOWN);
		}
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)){
			inRange = true;
		} else
			inRange = false;
		
		System.out.println("Raw Cat: \t\t" + rawCat);
		System.out.println("Message:\t\t" + payload);
		System.out.println("Latitude: \t\t" + latitude);
		System.out.println("Longitude: \t\t" + longitude);
		System.out.println("In Range: \t\t" + inRange);
keyboard.close();

	}
}




