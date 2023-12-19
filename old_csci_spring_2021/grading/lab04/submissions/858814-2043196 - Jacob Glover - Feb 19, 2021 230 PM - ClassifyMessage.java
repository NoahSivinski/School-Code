import java.util.Scanner;

public class ClassifyMessage {
	// This is the enumeration of the categories.
	enum MessageCategory{
		NEED, OFFER, ALERT, INFO, UNKNOWN;
	}
	
	public static void main(String[] args) {
		
		
		// Constant variables for determining bounds
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		
		// Initializing the boolean "isInRange" and the variable "category".
		Scanner keyboard = new Scanner(System.in);
		boolean isInRange = false;
		MessageCategory category; 
		
		// Prompts for user input and divides the input into sections for the output.
		System.out.println("Enter a formatted message.");
		String catString = keyboard.next();
		catString = catString.trim();
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		String payload = keyboard.nextLine();
		payload = payload.trim();
		
		
		/* The next block of code consists of conditional statements that
		 * convert the raw categories into the new categories.
		 */
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke"))) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road"))
		|| (catString.equalsIgnoreCase ("photo")) || (catString.equalsIgnoreCase("evac"))) {
			category = MessageCategory.INFO;
		} else category = MessageCategory.UNKNOWN;
	
		// This is a conditional statement that determines if the location is in range.
		if ((latitude>= south) && (latitude <= north))
			if ((longitude >= west) && (longitude <= east)) {
				isInRange = true;
		} else {
			isInRange = false;
		}
		
		// This is the output.
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t " + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);
		
		keyboard.close();
	}

}
