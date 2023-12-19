/**
 * StarGraph.java
 * Author:  Jordyn Fulbright
 * Submission Date:  March 26th
 *
 * Purpose: This program allows the user to view values and a 
 * graph for the specific function y = 20.0 * |sin(x)|. The user
 * enters the number of values they would like to see and the
 * minimum x value as well as the amount for x to increment.
 * The program prints out the x and y values for each increment
 * as well as a graph of "*" to visually demonstrate the curve.
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

	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		/**declaring variables to hold the number of x values, X minimum, X increment, as
		 *  well as an additional xIndividualIncrement to help me keep track of the value
		 *  of x in the calculations and calculate the corresponding y.
		 */
		int N;
		double xMin;
		double xIncrement;
		double xIndividualIncrement;
		System.out.print("Please enter the number of x values to process: ");
		N = keyboard.nextInt();
		//if statement for if the user enters a negative number or 0 and an error message needs to be printed
		if (N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		} else {
			System.out.print("Enter a minimum value for x: ");
			xMin = keyboard.nextDouble();
			System.out.print("Enter the amount to increment x: ");
			xIncrement = keyboard.nextDouble();
			//if statement for if the user enters a negative number or 0 and an error message needs to be printed
			if (xIncrement <= 0) {
				System.out.println("The increment must be a decimal number greater than 0.");
				System.exit(0);
			} else {
				xIndividualIncrement = xMin;
				
				//creating arrays
				double[] xValues = new double[N];
				double[] yValues = new double[N];
				
				System.out.println("\n" + "Values");
				
				/**loop for calculating a printing each value for X and Y, you can see how 
				 * I've used the xIndividualIncrement variable to calculate the new
				 * y as each increment of x is added on.
				 */
				for (int i = 0; i < N; i++) {
					xValues[i] = xIndividualIncrement;

					yValues[i] = (20.0) * Math.abs(Math.sin(xIndividualIncrement));
					System.out.print("x: ");
					System.out.format("%.3f", xValues[i]);
					System.out.print(", " + "y: ");
					System.out.format("%.3f",yValues[i]);
					System.out.print("\n");
					xIndividualIncrement += xIncrement;
				}
				System.out.println("\n" + "Graph");
				
			//loop for printing the graph
				for (int i = 0; i < N; i++) {
					System.out.print(":");
					//To truncate, I've used the Math.round and subtracting 0.5 from each value
					for (int j = 0; j < Math.round(yValues[i] - 0.5); j++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
			}
		}
		keyboard.close();
	}
}
