/*
 * ClassifyMessage.java
 * Author: Nnamdi Obichi 
 * Submission Date: September 24th, 2021
 *
 * Purpose: 
 * This program takes an inputed message and parses the 
 * information inside of it. This messages are supposed to
 * follow the following format:
 * 
 * <category latitude longitude payload>
 * 
 * The category value is a String value that is checked to
 * see what predetermined Message Category in falls under. The
 * latitude and longitude are double values used to determine
 * if the one sending the message is within range for emergency
 * services to come to their location. The payload variable is just
 * a general short description of one's reported issue. This information
 * is then shown on screen in a more presentable way for the reader
 * to process.   
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
	
// Establishes an enum class with a specific set a values
enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

// Establishes latitude and longitude boundaries used later to determine if a value is in range
static final double NORTH = 40.231315;
static final double SOUTH = 39.882343;
static final double EAST = -104.907864;
static final double WEST = -105.743511;
	
public static void main(String[] args) {
	
	// Establishes an enum variable which can only be the values in MessageCategory
	MessageCategory category;
	
	Scanner keyBo = new Scanner(System.in);
	
	// Prompts user for an input and parses the inputed message 
	System.out.println("Please enter a formatted message:");
	String catString = keyBo.next().trim();
	double latitude = keyBo.nextDouble();
	double longitude = keyBo.nextDouble();
	String payload = keyBo.nextLine().trim();
	
	// Establishes Boolean values for the following branching if-else statements 
	boolean alertBool1 = catString.equalsIgnoreCase("fire");
	boolean alertBool2 = catString.equalsIgnoreCase("smoke");
	boolean needBool = catString.equalsIgnoreCase("need");
	boolean offerBool = catString.equalsIgnoreCase("offer");
	boolean infoBool1 = catString.equalsIgnoreCase("structure");
	boolean infoBool2 = catString.equalsIgnoreCase("road");
	boolean infoBool3 = catString.equalsIgnoreCase("photo");
	boolean infoBool4 = catString.equalsIgnoreCase("evac");
	
	/* Assigns the category variable to a specific enum value if catString's value was equal
	 * to one or more of the String literals in the block of code above.
	 * 
	 * --alertBool corresponds to the ALERT enum value
	 * --needBool corresponds to the NEED enum value
	 * --offerBool corresponds to the OFFER enum value
	 * --infoBool corresponds to the INFO enum value  
	 * 
	 *  If any of the Boolean values are true in their respective if statements,
	 *  category is assigned to that value in MessageCategory listed in the if statement.
	 *  If none of the Boolean values are true, then the category variable equals UNKNOWN.
	 */
	if (alertBool1 || alertBool2) {
		category = MessageCategory.ALERT;
	}
	else if (needBool) {
		category = MessageCategory.NEED;
	}
	else if (offerBool) {
		category = MessageCategory.OFFER;
	}
	else if (infoBool1 || infoBool2 || infoBool3 || infoBool4) {
		category = MessageCategory.INFO;
	}
	else {
		category = MessageCategory.UNKNOWN;
	}
	
	/* Declares two Boolean variables that determine if the
	 * longitude is in the NORTH to SOUTH range in the longiRng variable 
	 * and if latitude is in the EAST to WEST range in the latiRng variable. 
	 */
	boolean latiRng = (latitude >= SOUTH) && (latitude <= NORTH);
	boolean longiRng = (longitude >= WEST) && (longitude <= EAST);
	
	// Determines if both the longitude and latitude are in range
	boolean isInRange = latiRng && longiRng;
	
	System.out.println("Category:\t" + category);
	System.out.println("Raw Cat:\t" + catString);
	System.out.println("Message:\t" + payload);
	System.out.println("Latitude:\t" + latitude);
	System.out.println("Longitude:\t" + longitude);
	System.out.println("In Range:\t" + isInRange);

	keyBo.close();
	}
}
