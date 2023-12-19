/* [CSCI 1301 Section 27832].java

 * Author:  [Kathy Ho] 
 * Submission Date:  [2/19/2021]
 *
 * Purpose: The program allows the user to input a message into the console where it will 
 * then categorize and parse the whole message into separate, distinct message sections using enumeration. 
 * It also uses multi-branch if-else statements to identify the proper categories.
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

//final constants for geographic bounds
	public static final double south = 39.882343;
	public static final double north = 40.231315;
	public static final double west = -105.74511;
	public static final double east = -104.907864;

	public static void main(String[] args) {

		String catString, payLoad;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter a formatted message:");

		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payLoad = keyboard.nextLine();
		// trimmed strings to remove extra spaces and blanks
		catString = catString.trim();
		payLoad = payLoad.trim();
		{
			// if-else statement that identifies proper category of ENUM based on the variable catString
			if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke")))
				category = MessageCategory.ALERT;
			else if (catString.equalsIgnoreCase("need"))
				category = MessageCategory.NEED;
			else if (catString.equalsIgnoreCase("offer"))
				category = MessageCategory.OFFER;
			else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road"))
					|| (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac")))
				category = MessageCategory.INFO;
			else
				category = MessageCategory.UNKNOWN;
		}
		{
			// if-else statement that identifies true/false value of boolean variable isInRange
			if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east))
				isInRange = true;
			else
				isInRange = false;

		}
		System.out.println("Category: \t\t" + category);
		System.out.println("Raw Cat: \t\t" + catString);
		System.out.println("Message: \t\t" + payLoad);
		System.out.println("Latitude: \t\t" + latitude);
		System.out.println("Longitude: \t\t" + longitude);
		System.out.println("In Range: \t\t" + isInRange);

	}
}
