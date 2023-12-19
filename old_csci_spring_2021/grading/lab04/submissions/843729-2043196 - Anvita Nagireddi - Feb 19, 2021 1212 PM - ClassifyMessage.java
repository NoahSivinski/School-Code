/*
 * ClassifyMessage.java
 * Author:  Anvita Shreya Nagireddi
 * Submission Date: February 19, 2021
 *
 * Purpose:using if-else and other branching statements to classify short messages (like tweets) based on keywords in the message
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
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		System.out.println("Please enter a formatted message:");
		Scanner scan = new Scanner (System.in);
		catString = scan.next();
		latitude = scan.nextDouble();
		longitude = scan.nextDouble();
		payload = scan.nextLine();

		if (catString.equalsIgnoreCase("fire")|| catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
		}
		else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if(catString.equalsIgnoreCase("structure")|| catString.equalsIgnoreCase("road")|| catString.equalsIgnoreCase("photo")|| catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		
		if(((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		
		System.out.println("Category:" + "\t" + category);
		System.out.println("Raw Cat:" + "\t" + catString);
		System.out.println("Message:" + "\t" + payload.trim());
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		System.out.println("In Range:" + "\t" + isInRange);
	}

}
