import java.util.Scanner;

/*
 * ClassifyMessage.java
 * Author:  Jonathan Anderson
 * Submission Date:  9/24/21
 *
 * Purpose: Parses information from a formatted message and determines what category the
 * message falls into, based off a small list of potential categories.
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
    enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

    public static void main(String[] args){
        //Declaring and initializing longitude and latitude constants
        final double north = 40.231315;
        final double south = 39.882343;
        final double east = -104.907864;
        final double west = -105.743511;

        //Getting input from user
        System.out.println("Please enter a formatted message: ");
        Scanner input = new Scanner(System.in);

        //Parsing information from formatted message
        String catString = input.next().trim();
        double latitude = input.nextDouble();
        double longitude = input.nextDouble();
        String payload = input.nextLine().trim();


        //Declaring and initializing other variables to default values
        boolean isInRange = false;
        MessageCategory category = MessageCategory.UNKNOWN;

        //Checks to see if the message falls into the ALERT category
        if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
            category = MessageCategory.ALERT;

        //Checks to see if the message falls into the NEED category
        else if(catString.equalsIgnoreCase("need"))
            category = MessageCategory.NEED;

        //Checks to see if the message falls into the OFFER category
        else if(catString.equalsIgnoreCase("offer"))
            category = MessageCategory.OFFER;

        //Checks to see if the message falls into the INFO category
        else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
            category = MessageCategory.INFO;
        //If the message doesn't fall into any of the above categories, then the message category is UNKNOWN - the default value

        //Checks to see if the message is inRange based off north / south & east / west constants
        if((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east))
            isInRange = true;

        //Printing results to user
        System.out.println("Category: \t\t" + category);
        System.out.println("Raw Cat: \t\t" + catString);
        System.out.println("Message: \t\t" + payload);
        System.out.println("Latitude: \t\t" + latitude);
        System.out.println("Longitude: \t\t" + longitude);
        System.out.println("In Range: \t\t" + isInRange);
    }
}
