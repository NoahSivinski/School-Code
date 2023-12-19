
import java.util.Scanner;

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKOWN}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
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
		
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		

		//Below are statements that determine what the category of the message is based on the users input		
		if (catString.equalsIgnoreCase("Fire")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("Smoke")){
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure")){
			category = MessageCategory.INFO;
		}
		else if (catString.equalsIgnoreCase("road")){
			category = MessageCategory.INFO;
		}
		else if (catString.equalsIgnoreCase("photo")){
			category = MessageCategory.INFO;
		}
		else if (catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKOWN;
		}
		
		// below are the conditions for whether the boolean for isInRange should be assigned true or false
		if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east)))  {
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		
		
		System.out.println("Category:" + "\t" + category);
		System.out.println("Raw Cat:" + "\t" + catString);
		System.out.println("Message:" + "\t" + payload.trim());
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		System.out.println("In Range:" + "\t" + isInRange);
		
		keyboard.close();
		

	}
}
