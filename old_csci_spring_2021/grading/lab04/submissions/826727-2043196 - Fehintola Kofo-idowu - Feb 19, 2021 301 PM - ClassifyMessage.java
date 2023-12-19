import java.util.Scanner;

public class ClassifyMessage {
	enum MessageCategory{
		NEED, OFFER, ALERT, INFO, UNKNOWN;
		}

	public static void main(String[] args) {
		//Declare Variable 
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;

		final double south = 39.882343; // southernmost latitude
		final double north = 40.231315; // northernmost latitude
		final double west = -105.743511; // westernmost longitude
		final double east = -104.907864;// easternmost longitude

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a formatted message:\n");// Allows user to input message.
		catString = input.next().trim();// reads the first strings from the user input and assigns to catstring variable
        latitude = input.nextDouble();// reads the latitude from the user input and assigns to latitude variable
        longitude = input.nextDouble();// reads the longitude from the user input an assigns to the longitude variable.
        payload = input.nextLine().trim();


		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))//checks for "fire" or "smoke" in the catstring variable
		{
			category = MessageCategory.ALERT;
			System.out.print("Category:\t\t" + "ALERT");// will print out "	ALERT" if "fire" or "smoke" appears in the catstring variable

		}

		else if (catString.equalsIgnoreCase("need")) { //checks for "need" in the catstring variable
			category = MessageCategory.NEED;
			System.out.print("Category:\t\t" + "NEED");// will print out "NEED" if "need" appears in the catstring variable
		}


		else if (catString.equalsIgnoreCase("offer")) {//checks for "offer" in the catstring variable
			category = MessageCategory.OFFER;
			System.out.print("Category:\t\t" + "OFFER");// will print out "OFFER" if "offer" appears in the catstring variable	
		}

		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
			System.out.print("Category:\t\t" + "INFO");

		}

		else
			System.out.print("Category:\t\t" + "UNKNOWN");//will print out "UNKNOWN" if non of the conditions above are fulfilled	
		

		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east)
			isInRange = true;
		else
			isInRange = false;




		
		System.out.println("\nRaw Cat:\t\t" + catString);
		System.out.println("Message:\t\t" + payload);
		System.out.println("Latitude:\t\t" + latitude);
		System.out.println("Longitude:\t\t" + longitude);
		System.out.println("In Range:\t\t" + isInRange);

		input.close();


	}

}
