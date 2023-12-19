/*
 * [ClassifyMessage].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [February 17, 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *This program is used to classify short messages. 
 *The short message is then listed in categories of (NEED, OFFER, ALERT, INFO, UNKNOWN).
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
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
	
		// Declare Variable 
		Scanner s = new Scanner(System.in);
		String  catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
	
		//determine double variable
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		// message prompt
		System.out.print("Please enter a formatted message:");
		catString = s.next().trim();
		latitude =  s.nextDouble();
		longitude = s.nextDouble();
		payload = s.nextLine().trim();
		
		//Message Category
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
		{
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("neeed"))
		{
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer"))
		{
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
		{
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}
		// Determine whether latitude and longitude are in bound
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east)
		{
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		//Print
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);

		s.close();
	}

}
