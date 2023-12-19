/**
 *
 * File name: TemperatureConverter.java
 * Author:	Joo Young Kang
 * Submission Date:	Feburary 23, 2021
 *
 *This program does the following:
 *Prompts the user to enter a temperature in Fahrenheit and a
 *temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
 *the temperature scale are valid, the program converts the temperature in Fahrenheit to 
 *the specified temperature scale and displays the converted value.
 *
 *The following code represents my own work. I have neither
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

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees;
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
	 // System.out.println(fahrenheit)
	 
	 // Verify the user's input
	 // Fixed "if statement" where fahrenheit is "<" MIN_FAHRENHEIT
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
	 
	 // Changed "if statement" where "tempscale" cannot be less than 1 or greater than 4
	 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 
		 // Changed "convertedDegrees" where fahrenheit is negative and adds 
		 // with MIN_FAHRENHEIT then multiply by (5/9). Following the order of operations
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit + (-MIN_FAHRENHEIT))*5/9;
			 tempScaleStr="Kelvin";
			 // System.out.println((fahrenheit + (-MIN_FAHRENHEIT))*5/9);
			 
		//Fixed where tempScale == 2 not including "tempscale == 3"
		//Replaced convertedDegrees with fahrenheit
		 } else if (tempScale == 2) { 
 			convertedDegrees = fahrenheit + (-MIN_FAHRENHEIT);  
 			tempScaleStr="Rankine";
 			// System.out.println(fahrenheit + (-MIN_FAHRENHEIT);
 			
 		// Changed "tempScaleStr" to "Reaumur"
 		// Changed order of operation where (fahrenheit - 32) then multiply by (4/9)
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32)*4/9 ; // Set a breakpoint here
			 tempScaleStr="Rankine";
			 // System.out.println((fahrenheit - 32)*4/9);
			 
		// Fixed formula where (9/5) was corrected to (5/9)		 
		 } else {
			 convertedDegrees = (fahrenheit - 32)*5/9; // Set a breakpoint here
			 tempScaleStr="Celsius";
			 // System.out.println((fahrenheit - 32)*5/9);
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}