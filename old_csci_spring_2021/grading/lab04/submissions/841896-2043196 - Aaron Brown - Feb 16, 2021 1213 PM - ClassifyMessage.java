/*
 * ClassifyMessage.java
 * Author: Aaron Brown
 * Submission Date: 02/16/2021
 *
 * Purpose: The following program builds upon the program for lab 3 and seeks to
 * provide more information about a certain format of tweets. This format of tweets
 * has four "sections", a category, latitude, longitude, and details. Each section
 * is put into the corresponding value based upon the user's input and helps run
 * the rest of the program. After gathering user input, the program uses an 
 * established enumeration at the beginning to assign a category value based upon
 * the category in the tweet, and also checks the latitude and longitude values
 * to see if they are in the established ranges. After performing these functions
 * the program prints out the final results.
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
		//The scanner is initialized.
		Scanner keyboard = new Scanner (System.in);
		//The variables required for the program are established.
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		//The system prompts the user for input and stores the information in the corresponding variables.
		System.out.print("Please enter a formatted message: \n");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		//The string variables are trimmed.
		payload = payload.trim();
		catString = catString.trim();
		//Using if else statements the category value is assigned using the enumeration.
		if(catString.equalsIgnoreCase("fire"))
		{
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("smoke"))
		{
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("need"))
		{
			category = MessageCategory.NEED;
		}
		else if(catString.equalsIgnoreCase("offer"))
		{
			category = MessageCategory.OFFER;
		}
		else if(catString.equalsIgnoreCase("structure"))
		{
			category = MessageCategory.INFO;
		}
		else if(catString.equalsIgnoreCase("road"))
		{
			category = MessageCategory.INFO;
		}
		else if(catString.equalsIgnoreCase("photo"))
		{
			category = MessageCategory.INFO;
		}
		else if(catString.equalsIgnoreCase("evac"))
		{
			category = MessageCategory.INFO;
		}
		else 
		{
			category = MessageCategory.UNKNOWN;
		}
		//The program checks to see whether or not the isInRange boolean should be true or false.
		if(latitude >= south&&latitude <= north) {
				if(longitude >= west&&longitude <= east) {
					isInRange = true;
				}
				else {
					isInRange = false;
				}
		}
		else {
			isInRange = false;
		}
		//The final results are printed.
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		//Scanner variable is closed.
		keyboard.close();
	}

}
