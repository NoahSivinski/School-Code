import java.util.Scanner; 

/*
 * ClassifyMessage.java
 * Author:  Anastasia Antoine
 * Submission Date:  [2/16/2021]
 * Purpose: The program will parse the text of a user specified 
 * message, identify the category of the message, and assign this value to a variable
 * declared to be of type MessageCategory. 
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
public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};

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
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		
		catString = input.next().trim(); 
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine().trim();
		 
		
		if (catString.equalsIgnoreCase("fire" ) || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED; 
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN; 
		}
		
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east ) {
			isInRange = true;
		}
		else {
			isInRange = false; 
		}
		
		System.out.println("Category:" + "\t" + "\t" + category); 
		System.out.println("Raw Cat:" + "\t" + "\t" + catString);
		System.out.println("Message:" + "\t" + "\t" + payload);
		System.out.println("Latitude:" + "\t" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + "\t" + longitude);
		System.out.println("In Range:" + "\t" + "\t" + isInRange);
		
		input.close();

	}

}
