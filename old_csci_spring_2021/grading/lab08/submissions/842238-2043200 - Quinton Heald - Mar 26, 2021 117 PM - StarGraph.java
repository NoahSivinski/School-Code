/*
 * StarGraph.java
 * Author:  Quinton Heald 
 * Submission Date:  3-25-21
 *
 * Purpose: This program is meant to take in user inputed values, and run those values
 * through multiple equations where they are stored, then eventually printed
 * and used to create a graph that represents said values. The program
 * allows the user to input 3 separate values: The number of x values the user would like processed, 
 * the minimum value for x, and the amount they would like to increment x by.
 * Both the x values and y values are stored with the use of two separate arrays.
 * The first array is run through a for loop which takes the minimum value of x, and 
 * Increments it by the inputed value, with each increment being stored
 * in the array until it reaches the amount of values the user wanted processed. 
 * Within the same loop, each x value is run through the equation for y,
 * with each of the newly made y values being stored within a separate array.
 * For each loop iteration, both the x and y values are printed and formatted
 * for the user to see. At the bottom of the output, the graph is displayed.
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

		// establishes variables
		int xAmount = 0;
		double xMin = 0;
		double xIncrement = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the number of x values to process: ");
		xAmount = input.nextInt();

		if (xAmount <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		xMin = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the amount to increment x: ");
		xIncrement = input.nextDouble();
		input.nextLine();

		if (xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		// establishes arrays
		double[] xValues = new double[xAmount];

		double[] yValues = new double[xAmount];

		System.out.println();
		System.out.println("Values");

		for (int i = 0; i < xAmount; i++) {

			// cycles through the array
			xValues[i] = xMin;

			// creates the y value and stores it
			yValues[i] = (20 * Math.sin(Math.abs(xMin)));

			// increments the x value
			xMin += xIncrement;

			System.out.printf("x: %,.3f, y: %,.3f \n", xValues[i], Math.abs(yValues[i]));

		}

		System.out.println();
		System.out.println("Graph");

		for (int i = 0; i < xValues.length; i++) {

			System.out.print(":");

			// truncates and prints out stars in relation to y values
			for (int j = 0; j < Math.floor(Math.abs(yValues[i])); j++) {
				System.out.print("*");

			}

			System.out.println();
		}
		input.close();
	}

}
