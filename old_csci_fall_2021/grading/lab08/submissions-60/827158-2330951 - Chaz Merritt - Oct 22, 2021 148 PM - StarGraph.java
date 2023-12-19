import java.util.Scanner;
/*
 * StarGraph.java
 * Author:  Charles Merritt 
 * Submission Date: 10/22/21
 *
 * Purpose: In this assignment we will use arrays and loops to calculate values of
 * y based on a function and an x min and x increment value, then this data is to
 * be represented visually with a graph drawn out by asterisks. This assignment 
 * is to show us how to use the same loops and iteration techniques that we have
 * used before but in the context of arrays, as well as exposing us to more math
 * techniques.
 *
 * Statement of Academic Honesty: CEM
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

public class StarGraph {
	public static void main(String[] args) {
		// get user input and store in var
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter the number of x values to process: ");
		int xVals = keyboard.nextInt();
		// positive xVals checkpoint
		if (xVals <= 0) {
			System.out.println("The number of x values must be greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double xMins = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double xIncrement = keyboard.nextDouble();
		// positive xIncrement checkpoint
		if (xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		// initialize arrays
		double[] y_array = new double[xVals];
		double[] x_array = new double[xVals];
		// populate arrays with loops
		for (int i = 0; i < xVals; i++) {
			x_array[i] = xMins;
			xMins += xIncrement;
		}
		for (int i = 0; i < xVals; i++) {
			y_array[i] = 20.0 * Math.abs(Math.sin(x_array[i]));
		}
		// "Values" + looping structure
		System.out.print("\nValues");
		// print arrays with loops
		for (int i = 0; i < xVals; i++) {
			System.out.printf("\nx: " + (String.format("%.3f" , x_array[i]) + ", y: " + String.format("%.3f" , y_array[i])));
		}
		// "Graph" + looping structure
		System.out.println("\n\nGraph");
		for (int i = 0; i < xVals; i++) {
			System.out.print(":");
			for (int j = 0; j < (int)y_array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

