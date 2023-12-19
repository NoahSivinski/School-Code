/*
 * ClassifyMessage.java
 * Author:  Nicolas Blandino
 * Submission Date:  9/24/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program will basically parse the text of a user specified
 * message, identify the category of the message, the latitude, and longitude, and
 * then print out the results.
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
	
	enum MessageCategory {Need, Offer, Alert, Info, Unknown}
	

	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		String CatString;	// The raw text of the message's category
		String Payload;		// The primary content of the message
		double latitude;	// The latitude indicated in the message
		double longitude;	// The longitude indicated in the message
		boolean isInRange;	// A "flag" indicating whether the latitude and
							// the longitude values are within bounds
		MessageCategory category;	// The message's category
		
		// The directions of latitude and longitude
		final double South = 39.882343;
		final double North = 40.231315;
		final double West = -105.743511;
		final double East = -104.907864;
		
		System.out.println("Please enter a formatted message:");
		CatString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		Payload = keyboard.nextLine().trim();
		
		// The if statements
        if (CatString.equalsIgnoreCase("fire") ||CatString.equalsIgnoreCase("smoke"))
        {
            category = MessageCategory.Alert;
        }
        else if (CatString.equalsIgnoreCase("need"))
        {
            category = MessageCategory.Need;
        }
        else if (CatString.equalsIgnoreCase("offer")) {
            category = MessageCategory.Offer;
        }
        else if(CatString.equalsIgnoreCase("structure")||CatString.equalsIgnoreCase("road")
        ||CatString.equalsIgnoreCase("photo")||CatString.equalsIgnoreCase("evac"))
        {
            category = MessageCategory.Info;
        }
        else
        {
            category = MessageCategory.Unknown;
        }
        
        // Determining the range
        if (latitude >= South && latitude <= North && longitude >= West && longitude <= East) {
        	isInRange=true;
        }
        else {
        	isInRange=false;
        }
        
        // The print statements
        System.out.println("Category:\t"+category);
        System.out.println("Raw Cat:\t"+CatString);
        System.out.println("Message:\t"+Payload);
        System.out.println("Latitude:\t"+latitude);
        System.out.println("Longitude:\t"+longitude);
        System.out.println("In Range:\t"+isInRange);
        keyboard.close();

}
}