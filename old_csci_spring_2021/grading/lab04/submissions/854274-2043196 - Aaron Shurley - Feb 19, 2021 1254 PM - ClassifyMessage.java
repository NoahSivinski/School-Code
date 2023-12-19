/*
 * ClassifiedMessage.java
 * Author: Aaron Shurley
 * Submission Date:  2/17/2021
 *
 * Purpose: The purpose of this program is to translate a  typed
 * message into a more understandable format.
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

enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}

public class ClassifyMessage {

	public static void main(String[] args) {
		
		Scanner keyboard =  new Scanner(System.in); 


     
    
    double south = 39.882343;   //These are limits for  longitude and latitude
 	double north = 40.231315;    
	double west = -105.743511;
	double east =  -104.907864;
	
	//prompt  import//
	System.out.println("Please enter a formatted message");
	
	//initializing varibles
	String catString = keyboard.next();
    double latitude = keyboard.nextDouble();
    double longitude = keyboard.nextDouble();
	String payload = keyboard.nextLine();
	payload = payload.trim();  //trimming  payload to get  rid   of  extra space
	 
	//else if statement to sort the category messages
	if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
	System.out.println("Category: \t"+ MessageCategory.ALERT);
	}else if (catString.equalsIgnoreCase("need")) {
	System.out.println("Category: \t"+ MessageCategory.NEED);
	}else if (catString.equalsIgnoreCase("offer")) {	
	System.out.println("Category: \t"+ MessageCategory.OFFER);
    }else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")||(catString.equalsIgnoreCase("photo"))){ 
    System.out.println("Category: \t"+ MessageCategory.INFO);
    }else  {
    System.out.println("Category: \t"+ MessageCategory.UNKNOWN);
    }
	
	
	//Calculating the  variables for the range of latitude and longitude
		boolean isInRange;
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
		isInRange = true;
		else
		isInRange = false;
		
		//value outputs
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("Message: \t" + payload);
		System.out.println("In Range: \t" + isInRange);
		
		keyboard.close();
	
	
	
	}

}
