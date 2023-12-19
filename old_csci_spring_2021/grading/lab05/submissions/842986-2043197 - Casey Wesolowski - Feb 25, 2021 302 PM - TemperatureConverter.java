/*
 * CSCI1301 27827
 * TemperatureConverter.java
 * Author:  Casey Wesolowski 
 * Submission Date:  February 25th, 2021
 *
 * Purpose: The purpose of this lab is to prompt the user for a 
 * temperature in Fahrenheit, ask the user for a temperature
 * scale, and then display the correct conversion.
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



/**
 *
 * File name: TemperatureConverter.java
 *
 *This program does the following:
 *Prompts the user to enter a temperature in Fahrenheit and a
 *temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
 *the temperature scale are valid, the program converts the temperature in Fahrenheit to 
 *the specified temperature scale and displays the converted value.
 *
*/

import java.util.Scanner;

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare variables. 
	 double fahrenheit;
	 double convertedDegrees = 0.0;
	 int tempScale;
	 String tempScaleStr = "";
 
	 
	 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 
	 
	 // Verify the user's input
	 if (fahrenheit < MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here
		 System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
		 System.exit(0);
	 }
 
	 
	 System.out.print (
			 "Enter the temperature scales you want to convert to:\n"+ 
			 "1. Kelvin \n"+
			 "2. Rankine \n"+
			 "3. Reaumur \n"+
			 "4. Celsius\n"+
			 "Enter a temperature scale: ");
	 tempScale = keyboard.nextInt();
	 
	 
	 if ((tempScale < 1) || (tempScale > 4)) {  // Second-if statement: Set a breakpoint here
		 System.out.print("Unknown temperature scale, cannot do calculation. Bye");
		 System.exit(0);
	 }
	 
	 
	 
	if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit + 459.67) * 5/9;
			 tempScaleStr = "Kelvin"; 
			 System.out.println(fahrenheit + " degrees Fahrenheit is " +
					 			convertedDegrees + " degrees " + tempScaleStr + ".");
		 } 
		 
		 else if (tempScale == 2) { 
			
			convertedDegrees = fahrenheit + 459.67;
 			tempScaleStr = "Rankine";
 			System.out.println(fahrenheit + " degrees Fahrenheit is " +
		 			convertedDegrees + " degrees " + tempScaleStr + ".");
		 } 
		 
		 else if (tempScale == 3) { 
			 
			 convertedDegrees = (fahrenheit - 32.0) * 4/9; // Set a breakpoint here
			 tempScaleStr = "Reaumur"; 
			 System.out.println(fahrenheit + " degrees Fahrenheit is " +
			 			convertedDegrees + " degrees " + tempScaleStr + ".");
		 } 
		 
		 else if (tempScale == 4) {
			 
			 convertedDegrees = (fahrenheit - 32.0) * 5/9; // Set a breakpoint here
			 tempScaleStr = "Celsius";
			 System.out.println(fahrenheit + " degrees Fahrenheit is " +
			 			convertedDegrees + " degrees " + tempScaleStr + ".");
		 }

		 keyboard.close();
	 }
 }
