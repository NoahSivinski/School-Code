/*
 * StarGraph.java
 * Author:  Ashlin Yeo
 * Submission Date:  10/18/21
 *
 * Purpose: This program gets input from the user to find x and y values. Once these
 * values are found and printed, the program prints a graph of the function using asterisks
 * (*) to indicate the magnitude of the y value.
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

		//Get valid array length from user
		System.out.print("Please enter the number of x values to process: ");
		int arraySize = keyboard.nextInt();
		if (arraySize <= 0) {
			System.out.print("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		//Get minimum x value from user
		System.out.print("Enter a minimum value for x: ");
		double xMinimum = keyboard.nextDouble();

		//Get valid increment for x from user
		System.out.print("Enter the amount to increment x: ");
		double xIncrement = keyboard.nextDouble();
		if (xIncrement <= 0) {
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		//Create a double array to hold the x values
		double[] xValue = new double[arraySize];
		for (int i = 0; i < arraySize; i++) {
			xValue[i] = xMinimum;
			xMinimum += xIncrement;
		}

		//Create a double array to hold the y values
		double[] yValue = new double[arraySize];
		for (int i = 0; i < arraySize; i++) {
			double yFromX = 20.0 * Math.abs(Math.sin(xValue[i]));
			yValue[i] = yFromX;
		}

		//Print the values of x and y
		System.out.println("\nValues");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("x: ");
			System.out.printf("%1.3f", xValue[i]);
			System.out.print(", y: ");
			System.out.printf("%1.3f", yValue[i]);
			System.out.println();
		}

		//Plot a graph of the function using asterisks
		System.out.println("\nGraph");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(":");
			yValue[i] = (int) yValue[i];
			for (int j = 0; j < yValue[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}
}
