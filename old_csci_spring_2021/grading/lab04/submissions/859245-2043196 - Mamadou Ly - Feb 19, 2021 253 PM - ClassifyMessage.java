/*
 * ClassifyMessage.java
 * Author: Mamadou Ly
 * Submission Date: 02/19/2021
 *
 * Purpose: The purpose of the program is to display the amount of credit card debt you're in. 
 * It also explains how many months, the total amount paid, and the total interest paid, when 
 * paying back.
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
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN;}
	
	public static String catString;
	public static String payload;
	public static boolean isInRange;
	public static double latitude;
	public static double longitude;
	public static MessageCategory category;
	
	static final double south = 39.882343;
	static final double north = 40.231315;
	static final double west = -105.743511;
	static final double east = -104.907864;
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();
		
		
		if(catString.equalsIgnoreCase("Fire")||catString.equalsIgnoreCase("Smoke"))
	           category=MessageCategory.ALERT;
	       else if(catString.equalsIgnoreCase("need"))
	           category=MessageCategory.NEED;
	       else if(catString.equalsIgnoreCase("offer"))
	           category=MessageCategory.OFFER;
	       else if(catString.equalsIgnoreCase("Structure")||catString.equalsIgnoreCase("Road")||
	               catString.equalsIgnoreCase("Photo")||catString.equalsIgnoreCase("evac"))
	           category=MessageCategory.INFO;
	       else
	           category=MessageCategory.UNKNOWN;
	       
	       if(latitude>=south && latitude<=north && longitude>=west && longitude<=east)
	           isInRange=true;
	
	       System.out.println("Category:\t"+category);
	       System.out.println("Raw Cat:\t"+catString);
	       System.out.println("Message:\t"+payload);
	       System.out.println("Latitude:\t"+latitude);
	       System.out.println("Longitude:\t"+longitude);
	       System.out.println("In Range:\t"+isInRange);
	       keyboard.close();
	   }

	}