/*
 * StarGraph.java
 * Author:  Sean Payne 
 * Submission Date:  [03/26/21]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 				This program produces a graph and table based off user input.
 * By utilizing arrays and for loops we are able to do exactly that. This is all while
 * having respect to the given y formula.
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

		double[] xValues, yValues;
		Scanner keyboard = new Scanner(System.in);

		// input of the length of array x
		System.out.print("Please enter the number of x values to process: ");
		// getting user value length
		int numberX = keyboard.nextInt();
		// checking if length is equal to or greater than 0
		if (numberX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(1); // exits out if condition is true
		}

		// this will be executed only if the above condition is false
		System.out.print("Enter a minimum value for x: ");
		// getting initial x value
		double min_val = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		// gets the value of the increment
		double increment = keyboard.nextDouble();
		// checking if increment value is <= zero, if true then printing error msg and
		// exiting
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(1);
		}

		// this will be executed only if the above condition is false
		// creating two arrays of double type with length entered by user
		xValues = new double[numberX];
		yValues = new double[numberX];

		// initializes first element in the x and y arrays
		xValues[0] = min_val;
		yValues[0] = 20.0 * Math.abs(Math.sin(xValues[0]));

		// table
		System.out.println("\nValues");
		System.out.printf("x: %.3f, y: %.3f\n", xValues[0], yValues[0]);
		for (int i = 1; i < numberX; i++) {
			// incrementing the value of array x by user input
			xValues[i] = xValues[i - 1] + increment;
			// calculating the angle and storing in array yValues
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
			// displaying the output to the screen
			System.out.printf("x: %.3f, y: %.3f\n", xValues[i], yValues[i]);
		}

		// printing the graph
		System.out.println("\nGraph");
		for (int i = 0; i < numberX; i++) {
			// printing ":" but not changing lines
			System.out.print(":");
			for (int j = 0; j < Math.floor(yValues[i]); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}
}
