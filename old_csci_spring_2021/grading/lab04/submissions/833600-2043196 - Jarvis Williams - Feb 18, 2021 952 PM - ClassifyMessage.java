/*
 * ClassifyMessage.java
 * Author: Jarvis Williams
 * Submission Date:  2/19/2021
 *
 * Purpose: The purpose of this program is to parse tweets
 * * Statement of Academic Honesty:
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

//Importing scanner for user import
import java.util.Scanner;

enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};

public class ClassifyMessage {

    public static void main(String[] args) {
        
    	//Initializing keyboard for user input
    	Scanner keyboard = new Scanner(System.in);
    	
        //value of directional limits
        double south = 39.882343; // Southern latitude limit
        double north = 40.231315; // Northern latitude limit 
        double west = -105.743511; // Western longitude limit
        double east = -104.907864; // Eastern longitude limit
        
        
        //prompt for user import
        System.out.println("Please enter a formatted message: ");
        
        //Initializing variables
        String catString = keyboard.next();
        double latitude = keyboard.nextDouble();
        double longitude = keyboard.nextDouble();
        String payload = keyboard.nextLine();
        payload = payload.trim(); //Trimming payload to get rid of white space
        
        //else if statement for finding category
       if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
    	   System.out.println("Category: \t" + MessageCategory.ALERT);
       }else if (catString.equalsIgnoreCase("need")) {
    	   System.out.println("Category: \t" + MessageCategory.NEED);
       }else if (catString.equalsIgnoreCase("offer")) {
    	   System.out.println("Category: \t" + MessageCategory.OFFER);
       }else if (catString.equalsIgnoreCase("structure") || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo"))) {
    	   System.out.println("Category: \t" + MessageCategory.INFO);
       }else {
       	System.out.println("Category: \t" + MessageCategory.UNKNOWN);
       }
       
        //Initializing and calculating variable for latitude and longitude range
        boolean isInRange; // A “flag” indicating whether the latitude and longitude values are within bounds
        if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
        	isInRange = true;
        else
        	isInRange = false;
       

       
       //Output of desired values
       System.out.println("Raw Cat: \t" + catString);
       System.out.println("Latitude: \t" + latitude);
       System.out.println("Longitude: \t" + longitude);
       System.out.println("Message: \t" + payload);
       System.out.println("In Range: \t" + isInRange);
        
       keyboard.close();
	}
}