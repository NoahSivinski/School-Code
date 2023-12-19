/*
 *ClassifyMessage.java
 * Author:  Parth Patel 
 * Submission Date: February 19,2020
 *
 * Purpose: The purpose of this lab is to use if-else statements to classify
 * short messages. These short messages can be used in real-world situations 
 * that would need immediate action.
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
 * 
 */


import java.util.Scanner;
public class ClassifyMessage {

     enum MessageCategory {
        NEED, OFFER, ALERT, INFO, UNKNOWN
    }



    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);

        final double north = 40.231315;
        final double south = 39.882343;
        final double east = -104.907864;
        final double west = -105.743511;
        
        String catString;
        String payload;
        double latitude; 
        double longitude;
        boolean isInRange = false;
        
        MessageCategory category;
        System.out.print("Please enter a formatted message: ");
        catString = input.next().trim();
        latitude = input.nextDouble();
        longitude = input.nextDouble();
        payload = input.nextLine().trim();

   
        if (catString.equalsIgnoreCase("fire") ||catString.equalsIgnoreCase("smoke"))
        {
            category = MessageCategory.ALERT;
        }
        else if (catString.equalsIgnoreCase("need"))
        {
            category = MessageCategory.NEED;
        }
        else if (catString.equalsIgnoreCase("offer")) {
            category = MessageCategory.OFFER;
        }
        else if(catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")
        ||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
        {
            category = MessageCategory.INFO;
        }
        else
        {
            category = MessageCategory.UNKNOWN;
        }
       
        System.out.println("Category: \t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t " + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);

    }

}

	
