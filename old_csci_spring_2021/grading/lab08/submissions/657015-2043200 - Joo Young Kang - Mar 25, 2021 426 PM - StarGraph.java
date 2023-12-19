/*
 * CSCI 1301.java
 * Author:	Joo Young Kang
 * Submission Date: March 26, 2021
 *
 * Purpose: This program uses a combination loops and 1d arrays to print out a graphical representation
 * of a the function: y = 20.0 * |sinx| using a sequence of symbols '*' to display the magnitude of y.
 * The users will be able to input the number of x values, minimum values, and the increment amount of x to
 * that the program will use to display the graphical function output.
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

public class StarGraph {

	public static void main(String[] args) {
		
		// set scanner instance: keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// set string, int, and double equal to 0
		int n = 0;
		double x = 0;
		double incremental = 0;
		double y = 0;
		
		// requesting the user input on the number of x values
		System.out.print("Please enter the number of x values to process: ");
		n = keyboard.nextInt(); // set n equal to the keyboard input
		keyboard.nextLine(); // skip to next line
		
		// if condition to check whether or not x value is greater than 0
		if (n > 0) {
			// requesting to enter minimum (lowest) x value
			System.out.print("Enter a minimum value for x: ");
			x = keyboard.nextDouble(); // set x equal to the keyboard input
			keyboard.nextLine();// skip to next line
			
			// requesting to enter minimum (lowest) x value
			System.out.print("Enter the amount to increment x: ");
			incremental = keyboard.nextDouble(); // set incremental equal to keyboard input
			keyboard.nextLine(); // skip to next line
			
			// incremental condition to check if increment value is greater than 0
			if (incremental > 0) {
				System.out.println("Values");
				
				double [] xArray = new double[n]; // establish an array for x values
				double [] yArray = new double[n]; // establish an array for y values (output)
				
				// loop to go through based on the length of array x-values
				for (int i = 0; i < xArray.length; i++) {
					xArray[i] = xArray[i] + x; // adding x value to value at position "i" of array 
					y = 20.0*(Math.abs(Math.sin(xArray[i]))); // formula to calculate y value at x value position "i" of array
					x = x + incremental; // adding increments to the x value
					yArray[i] = yArray[i] + y; // adding y value to value to y value at position "i" of array
					
					System.out.print("x: ");
					System.out.printf("%.3f",xArray[i]); // round 3 decimal places and print x value at array position "i"
					System.out.print(", y: ");
					System.out.printf("%.3f",yArray[i]); // round 3 decimal places and print y value at array position "i"
					System.out.print("\n"); // goes to the next line
				}
				
				System.out.println("Graphs");
				
				// loop to go through based on length of array x-values
				for (int i = 0; i < xArray.length; i++) {
					System.out.print(": ");
					yArray[i] = (int) yArray[i]; // y array value is not rounded up but flat (consistent with one's place)
						for (int z = 0; z < yArray[i]; z++) { // loop to go through based on length of array y-values
							System.out.print("*");
						}
						System.out.print("\n"); // goes to the next line
				}
			}
			// result if increment is not greater than 0.
			else {
				System.out.println("The increment must be a decimal number greater than 0.");
			}
		}
		// result if number of x values is not greater than 0.
		else {
			System.out.println("The number of x values must be an integer greater than 0.");
		}
	} // no touchy; end of static void bracket

}
