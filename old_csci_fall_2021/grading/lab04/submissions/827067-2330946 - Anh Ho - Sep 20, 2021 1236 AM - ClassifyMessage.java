/*
 * ParseTheTweet.java
 * Author:  Anh Ho
 * Submission Date:  9/20/2021
 *
 * Purpose: Program built on top of ParseTheTweet.java, creating enum with 5 message category: need, info, alert, offer, and unknown. Sorting user input using pre-determined keywords. Also check if is in range with the longitude and latitude.
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
	//Declare enum to hold category
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};
	
	public static void main(String args[]) {		
		//Declare variables
		String catString;									//category
		String payLoad;										//content
		double latitude;									//latitude
		double longitude;									//longitude
		boolean isInRange = false;							//check if latitude and longitude are within bound
		MessageCategory category;							//value
		//Declare constants
		final double south = 39.882343;			
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907854;
		
		//Create new scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//Getting user input
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next().toLowerCase().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine().trim();
		
		//Check and assign category
		switch (catString) {
			case "fire": {
				category = MessageCategory.ALERT;
				break;
			}	//case fire
			case "smoke": {
				category = MessageCategory.ALERT;
				break;
			}	//case smoke
			case "need": {
				category = MessageCategory.NEED;
				break;
			}	//case need
			case "offer": {
				category = MessageCategory.OFFER;
				break;
			}	//case offer
			case "structure": {
				category = MessageCategory.INFO;
				break;
			}	//case struct
			case "road": {
				category = MessageCategory.INFO;
				break;
			}	//case road
			case "photo": {
				category = MessageCategory.INFO;
				break;
			}	//case photo
			case "evac": {
				category = MessageCategory.INFO;
				break;
			}	//case evac
			default: {
				category = MessageCategory.UNKNOWN;
			}	//otherwise unknown
		}	//close switch
		
		//check and assign range
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {
			isInRange = true;
		}	//close if assign isInRange
		
		//Output
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payLoad);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		keyboard.close();
	}	//close main	
}	//close class
