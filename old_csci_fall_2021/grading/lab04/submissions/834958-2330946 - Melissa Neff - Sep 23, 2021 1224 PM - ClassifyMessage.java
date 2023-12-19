/*
 * ClassifyMessage.java
 * Author:  Melissa Neff
 * Submission Date:  9/22/2021
 *
 * Purpose: The purpose of this program is to parse through a message and identify
 * which category the message falls into based on which keywords the message contains,
 * if any. The program will also identify other information in the message (raw cat, 
 * message, latitude, and longitude), and will state whether or not the message is 
 * within the geographic range specified by the given coordinates.
 * 
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
//the following line declares the enumerations of MessageCategory
enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
	
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		//the following lines give geographic boundaries:
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		Scanner keyboard = new Scanner(System.in);
		//the following line prints a string to the console:
		System.out.println("Please enter a formatted message:");
		//catString will be the next string input by the user
		catString = keyboard.next();
		//latitude will be the next double input by the user
		latitude = keyboard.nextDouble();
		//longitude will be the next double, after latitude, input by the user
		longitude = keyboard.nextDouble();
		//payload will be the next line input by the user
		payload = keyboard.nextLine();
		keyboard.close();
		//the following lines trim any leading or trailing white spaces from the message
		catString = catString.trim();
		payload = payload.trim();
		/*if the message contains the keywords "fire" or "smoke," the message category
		 * will be ALERT
		 */
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke"))) {
			category = MessageCategory.ALERT;
		}
		/*if the message contains the keyword "need," the message category
		 * will be NEED
		 */
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		/*if the message contains the keyword "offer," the message category
		 * will be OFFER
		 */
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		/*if the message contains the keywords "structure," "road,"
		 * "photo," or "evac," the message category will be INFO
		 */
		else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))) {
			category = MessageCategory.INFO;
		}
		/*if the message does not contain any of the above keywords, the
		 * message category will be UNKNOWN
		 */
		else
			category = MessageCategory.UNKNOWN;
		/*For the message to be considered "in range," the latitude must be within the
		 * "north" and "south" boundaries and the longitude must be within the "east" and
		 * "west" boundaries. Otherwise, the message is not in range.
		 */
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
			isInRange = true;
		}
		else
			isInRange = false;
		
		//The following lines all print to the console:
		System.out.println("Category:     " + category);
		System.out.println("Raw Cat:      " + catString);
		System.out.println("Message:      " + payload);
		System.out.println("Latitude:     " + latitude);
		System.out.println("Longitude:    " + longitude);
		System.out.println("In Range:     " + isInRange);
		
		}

	}


