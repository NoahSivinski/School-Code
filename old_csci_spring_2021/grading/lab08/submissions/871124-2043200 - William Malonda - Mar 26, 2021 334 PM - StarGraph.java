/*
 * StarGraph.java
 * Author:  William Malonda
 * Submission Date:  March 26, 2021
 *
 * Purpose: The program StarGraph.java prints out values and a corresponding graph 
 * according to user inputs. It does this by asking the user to input the the number of x values 
 * to process, the minimum x value, and an x increment value and these values go through a formula 
 * to create a y value. Both the x and y values are printed out along with a graph of asterisks that 
 * correspond with the values.
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

		Scanner keyboard = new Scanner(System.in);

		// Declaring variables
		int numofxvalues;
		int i;
		int k;
		double minxvalue;
		double xincrement;

		// Asks user to enter the number of x values they want to have the program
		// output
		System.out.print("Please enter the number of x values to process: ");
		numofxvalues = keyboard.nextInt();

		// If the user enters an integer lower than 0, the program prints an error
		// statement and exits
		if (numofxvalues <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		// Asks user to enter a minimum value for x
		System.out.print("Enter a minimum value for x: ");
		minxvalue = keyboard.nextDouble();

		// Asks user to enter the akmount that x should be incremented in the program
		System.out.print("Enter the amount to increment x: ");
		xincrement = keyboard.nextDouble();

		// If the user enters a value that is lower than 0, the program prints an error
		// statement and exits
		if (xincrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		// Array for the x values
		double[] xvalue = new double[numofxvalues];
		double[] xvalue2 = new double[numofxvalues];
		xvalue[0] = minxvalue;
		xvalue2[0] = minxvalue;
		// For all the values that the user wants to output, it increases the value of x
		// by adding the increment to it
		for (i = 1; i < numofxvalues; i++) {
			xvalue[i] = xvalue[i - 1] + xincrement;
			//Sends xvalue[i] to xvalue2[i] to be rounded and used to get yvalue[i]
			xvalue2[i] = Math.round(xvalue[i] * 100000.0)/100000.0;
		}

		// Array for the y values
		double[] yvalue = new double[numofxvalues];
		// For all of the values that the user wants to output, it takes the value of x
		// and uses it in a formula to output as y
		for (i = 0; i < numofxvalues; i++) {
			yvalue[i] = 20 * Math.abs(Math.sin(xvalue2[i]));
		}

		// Prints out the x and y values
		System.out.println("\nValues");
		for (i = 0; i < numofxvalues; i++) {
			System.out.printf("x: %1.3f, y: %1.3f\n", xvalue2[i], yvalue[i]);
		}

		// Prints out the graph of asterisks
		System.out.println("\nGraph");
		for (i = 0; i < numofxvalues; i++) {
			// Prints out a colon for the beginning of every line
			System.out.print(":");
			for (int j = 0; j < Math.floor(yvalue[i]); j++) {
				// Prints out an asterisk when the position is less than the floor number of the
				// y value for each position
				System.out.print("*");
			}
			// Prints out a newline after printing asterisks
			System.out.print("\n");
		}
		keyboard.close();
	}

}
