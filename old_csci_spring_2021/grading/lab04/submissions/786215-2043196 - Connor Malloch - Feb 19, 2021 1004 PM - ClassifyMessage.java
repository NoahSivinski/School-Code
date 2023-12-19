/*
 * ClassifyMessage.java
 * Author:  Connor Malloch
 * Submission Date:  Feburary 19th 2021
 *
 * Purpose: parses the text of a user specified message, identify the category of the message. identify the latitude and longitude specified in the message and determine whether these are within ranges defined elsewhere in the program.
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
	NEED, OFFER, ALERT, INFO, UNKNOWN 
	}
//enumeration

public static final double SOUTH = 39.882343;
public static final double NORTH = 40.231315;
public static final double WEST = -105.743511;
public static final double EAST = -104.907864;
// Geographical bounds

public static void main(String[] args) {
String catString ="";
String payload = "";
double latitude = 0;
double longitude = 0;
MessageCategory category;
boolean isInRange = false;


// Variables

Scanner keyBoard = new Scanner(System.in);

System.out.println("Please enter a formatted message:");

catString = keyBoard.next();
latitude = keyBoard.nextDouble();
longitude = keyBoard.nextDouble();
payload = keyBoard.nextLine();


catString = catString.trim();
payload = payload.trim();

if (catString.equalsIgnoreCase("fire") 
|| (catString.equalsIgnoreCase("smoke"))) {
		category = MessageCategory.ALERT;
	} else if (catString.equalsIgnoreCase("need")) {
		category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
			} else if (catString.equalsIgnoreCase("structure")
				|| catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo")
				|| catString.equalsIgnoreCase("evac")) {
					category = MessageCategory.INFO;
					} else {
						category = MessageCategory.UNKNOWN;
					}
if (latitude >= SOUTH && latitude <= NORTH) {
if(longitude >= WEST && longitude <= EAST) {
	isInRange = true;
	}
}

//if Statements

System.out.printf("Category: \t" +  category +"\nRaw Cat: \t" + catString + 
	"\nMessage: \t" + payload + "\nLatitude: \t" + latitude + 
	"\nlatitude: \t" + longitude + "\nIn Range: \t" + isInRange );

}
}



