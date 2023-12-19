/*
 * ClassifyMessage.java
 * Author:  Jacob Tate 
 * Submission Date:  Thursday, September 23rd, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The purpose of the program is to classify short messages based on
 * keywords in said messages. Using a Scanner, the user of the program
 * can input a message and then the message will be broken down into various sections.
 * The last four double variables before the first if statement are defined in the
 * problem stimulus. The remaining variables, aside from keyboard, are in the problem
 * stimulus, but were not initialized; I initialized them. To determine the category,
 * I used a multi-branch if-else statement based on the value of catString, which is 
 * acquired by the Scanner class's next() method. I also used an if-else statement for the
 * boolean isInRange. Based on certain conditions defined in the problem stimulus, it could be
 * determined if isInRange is true or isInRange is false. For the latitude and longitude variables,
 * using the format found in the problem stimulus, I used the Scanner class's nextDouble() method
 * to get the doubles found in the String. For the payload variable, I used the Scanner class's 
 * nextLine() method to get the remainder of the message. 
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
enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

public class ClassifyMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message: ");
		String catString = keyboard.next();
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		String payload = keyboard.nextLine().trim();
		boolean isInRange;
		MessageCategory category;
		
		double SOUTH = 39.882343;
		double NORTH = 40.231315;
		double WEST = -105.743511;
		double EAST = -104.907864;
		//Above code initializes the variables that contain the various classifications of the message.
		
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
		{
			category = MessageCategory.ALERT;
		}
		
		else if(catString.equalsIgnoreCase("need"))
		{
			category = MessageCategory.NEED;
		}
		
		else if(catString.equalsIgnoreCase("offer"))
		{
			category = MessageCategory.OFFER;
		}
		
		else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
		{
			category = MessageCategory.INFO;
		}
		
		else
		{
			category = MessageCategory.UNKNOWN;
		}
		//Above code creates the if statement that defines the appropriate category for the variable category. 
		
		if (((latitude >= SOUTH) && (latitude <= NORTH)) && ((longitude >= WEST) && (longitude <= EAST)))
		{
			isInRange = true;
		}
		
		else
		{
			isInRange = false;
		}
		//Above code creates an if statement that defines the variable isInRange, using certain conditions to check and see if isInRange should be true or if isInRange should be false. 
		
		System.out.println("Category " + '\t' + category);
		System.out.println("Raw Cat:" + '\t' + catString);
		System.out.println("Message: " + '\t' + payload);
		System.out.println("Latitude: " + '\t' + latitude);
		System.out.println("Longitude: " + '\t' + longitude);
		System.out.println("In Range: " + '\t' + isInRange);
		//Above code prints out the various classifications of the message from the user. 

	}

}
