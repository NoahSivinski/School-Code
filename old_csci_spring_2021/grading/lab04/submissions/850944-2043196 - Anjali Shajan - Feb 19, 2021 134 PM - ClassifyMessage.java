
/*
 * [ClassifyMessage].java
 * Author:  [Anjali Shajan] 
 * Submission Date:  [2/19/2021]
 *
 * Purpose: The program allows a user to input a message and you are able to figure out the importance of the message of 
 *the type of category it is alert, offer and know the place it is by latitude and longitude as well as if it is nearby
 *the message helps give the user an understanding of the situation at hand 
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

enum MessageCategory {NEED, OFFER, ALERT,INFO, UNKNOWN}; 

public static void main(String[] args) {
	
			Scanner keyboard = new Scanner (System.in);
			
			double south= 39.882343;
			double north =40.231315;
			double west= -105.743511;
			double east =-104.907864;
			
	
			// declared the variable//
			String payload,catString;
		    double latitude,longitude;
			boolean isInRange;
	     	MessageCategory category;
			
			
			System.out.println("Please enter a formatted message: ");
			
			
			catString=keyboard.next();
			latitude= keyboard.nextDouble();
			longitude= keyboard.nextDouble();
			payload =keyboard.nextLine();
			payload =payload.trim();
			 
			 if ((catString. equalsIgnoreCase("smoke")|| ( catString.equalsIgnoreCase("fire")))) 
				 {
					 category =MessageCategory.ALERT;
					 System.out.println("Category:\t"+category);	 
				 }
			 
			 else if ((catString.equalsIgnoreCase("need")))
				 {
					 category=MessageCategory.NEED;
					 System.out.println("Category:\t"+category);
				 }
			 else if ((catString.equalsIgnoreCase("offer")))
				 {
					 category=MessageCategory.OFFER;
					 System.out.println("Category:\t"+category);
				 }
			 else if ((catString.equalsIgnoreCase("structure")||(catString.equalsIgnoreCase("road") ||(catString.equalsIgnoreCase("photo")||(catString.equalsIgnoreCase("evac")))))) {
					 category=MessageCategory.INFO;
					 System.out.println("Category:\t"+category);
				 }
			 
			 else  {
					 category=MessageCategory.UNKNOWN;
		             System.out.println("Category:\t"+category);
				 }
			 
			 System.out.println("Raw Cat:\t"+catString);
			 System.out.println("Message:\t"+ payload);
			 System.out.println("Latitude:\t"+latitude);
			 System.out.println("Longitutde:\t"+longitude);
			 
			 
			 
			 if ((latitude >= south && latitude<=north &&longitude>= west &&longitude<=east)) 
					 {
						 isInRange =true;
						 System.out.println("isInRange:\t"+isInRange);
					 } 
			 else {
					 isInRange= false;
					 System.out.println("isInRange:\t"+isInRange);
				 }
					 keyboard.close();
					 
				 }
}

