/*
 * StarGraph.java
 * Author:  Scott Wagner 
 * Submission Date:  3/25/2021
 *
 * Purpose: Creates a star array based on user input. 
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

		Scanner scan = new Scanner(System.in);

		// Gets number of array values (N.)
		System.out.print("Please enter the number of x values to process: ");
		int numArrayValues = scan.nextInt();

		// Array values validity check.
		if (numArrayValues <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		// Gets minimum x value.
		System.out.print("Enter a minimum value for x: ");
		double minX = scan.nextDouble();

		// Gets increment value.
		System.out.print("Enter the amount to increment x: ");
		double incValue = scan.nextDouble();

		// Increment value validity check.
		if (incValue <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		// Creates arrays and sets length to number of array values (N.)
		double xAxis[] = new double[numArrayValues];
		double yAxis[] = new double[numArrayValues];

		// Sets initial x & y values.
		xAxis[0] = minX;
		yAxis[0] = (Math.abs(Math.sin(minX))) * 20;

		// Loop increments x values in array.
		for (int i = 1; i < numArrayValues; i++) {
			xAxis[i] = minX += incValue;

			// Loop sets y array values from processed x values.
			for (int j = 1; j < numArrayValues; j++) {
				yAxis[j] = (Math.abs(Math.sin(xAxis[j])) * 20);

			}
		}

		// Outputs Values in chart.
		System.out.println("\nValues");
		for (int i = 0; i < numArrayValues; i++) {

			// Formats and prints chart.
			System.out.println("x: " + String.format("%.3f", xAxis[i]) + ", y: " + String.format("%.3f", yAxis[i]));
		}

		// Prints graph.
		System.out.println("\nGraph");
		for (int i = 0; i < numArrayValues; i++) {

			// Gets number of stars.
			int numOfStars = (int) yAxis[i];
			System.out.print(":");

			// Prints stars after each colon.
			for (int j = 0; j < numOfStars; j++) {
				System.out.print("*");

			}
			// Adds new line for each row.
			System.out.println();
		}

		scan.close();
	}

}
