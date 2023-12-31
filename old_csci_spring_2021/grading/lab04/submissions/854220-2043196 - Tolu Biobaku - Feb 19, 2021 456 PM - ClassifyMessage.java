import java.util.Scanner; 
public class ClassifyMessage {
	/*
	 * [csci 1301].java
	 * Author:  [Toluwani Bioaku] 
	 * Submission Date:  [2/19/2021]
	 *
	 * Purpose: This program classifies each message and decalres what the variables are meant to do, as well as breaking it up into smaller branches
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

	
enum MessageCategory { NEED, OFFER, ALERT, INFO, UNKNOWN };

	public static void main(String[] args) {
	   Scanner keyboard = new Scanner(System.in);
	
	
	System.out.println("Please enter a formatted message");
		
		String catString = keyboard.next();
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		String payload = keyboard.nextLine();
		boolean isInRange;
		MessageCategory category;
		String payload_trim = payload.trim();
		
		  final double south = 39.882343;
		   final double north = 40.231315;
		   final double west = -105.743511;
		   final double east = -104.907864;
		
		
		
		if ((catString.equalsIgnoreCase("fire")) || ((catString.equalsIgnoreCase("smoke"))))
		     category = MessageCategory.ALERT;
			else if (catString.equalsIgnoreCase("need"))
			 category = MessageCategory.NEED;
				else if (catString.equalsIgnoreCase("offer"))
					category = MessageCategory.OFFER;
					else if ((catString.equalsIgnoreCase("structure")) || ((catString.equalsIgnoreCase("road")) || ((catString.equalsIgnoreCase("photo")) || ((catString.equalsIgnoreCase("evac"))))))
						category = MessageCategory.INFO;
					else 
						category = MessageCategory.UNKNOWN;
		
		if ((latitude >= south) && ((latitude <= north)) && ((longitude >= west)) && ((longitude <= east)))
		   isInRange = true;
		
		else isInRange = false;
		
		
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message:\t" + payload_trim);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
			
		
		
		
		
		
	}

}
