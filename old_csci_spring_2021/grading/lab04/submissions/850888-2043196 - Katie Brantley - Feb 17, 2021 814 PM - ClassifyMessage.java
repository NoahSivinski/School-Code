
import java.util.Scanner; 
public class ClassifyMessage {
        enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN} 
	
	public static void main(String[] args) { 
		
		//declare variables 
		String catString;                  //raw text of message's category
		String payload;                    // primary content of the message
		double latitude;                   // latitude indicated in the message
		double longitude;                  // longitude indicated in the message
		boolean isInRange;                 // indicates if latitude and longitude are in range 
		MessageCategory category;          // the message's category 
		
		// declare constants 
		final double south = 39.882343;    //southernmost 
		final double north = 40.231315;    //northernmost 
		final double west = -105.743511;   //westernmost 
		final double east = -104.907864;   //easternmost 
		
       // get input from user 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formated message:");
		catString = keyboard.next(); 
		catString.trim(); 
		latitude = keyboard.nextDouble(); 
		longitude = keyboard.nextDouble(); 
		payload = keyboard.nextLine(); 
		payload.trim(); 
		
		
		keyboard.close(); 
		
		//assigning the catString to its category 
		if (catString.equalsIgnoreCase("fire")|| catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT; 
		} else if (catString.equalsIgnoreCase("stricture") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO; 
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED; 
		} else if (catString.equalsIgnoreCase("offer")) { 
			category= MessageCategory.OFFER; 
		} else {
			category = MessageCategory.UNKNOWN; 
		} 
		
		//determine whether the latitude and longitude specified in the message are within the geographic boundaries indicated by north, south, east, and west.
		if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
			isInRange = true; 
		} else {
			isInRange = false; 
		} 
		// output statements 
		System.out.println("Category: \t "+ category); 
		System.out.println("Raw Cat: \t " + catString); 
		System.out.println("Message: \t" + payload); 
		System.out.println("Latitude:  \t " + latitude); 
		System.out.println("Longitude:  \t " + longitude); 
		System.out.println("In Range: \t " + isInRange); 
		
			
		}
	}

