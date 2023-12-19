/*
 * StarGraph.java
 * Author: Everett Wayman
 * Submission Date: 03/26/21
 *
 * Purpose: In this program the user is able to graph the the function 
 * y = 20.0 * |sin(x)|. The program shows the number of x values the user 
 * wants to see and the increment these x values increase by. The user will also 
 * enter the starting value for x. These x values are used to find the y values 
 * by use of the given equation. They are then output as a x and y table and a graph
 * using "*" to show the height of the y values.
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

		// User enters the number of x value they want to compute.
		System.out.print("Please enter the number of x values to process: ");
		int numberOfX = keyboard.nextInt();

		// If the number is 0 then the program will stop.
		if (numberOfX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		// Here the program initializes the two arrays used for x and y to
		// store the values of the equation.
		double[] xValue = new double[numberOfX];
		double[] yValue = new double[numberOfX];

		// Here the user enters the x value they would like to start at.
		System.out.print("Enter a minimum value for x: ");
		xValue[0] = keyboard.nextDouble();

		// User enters the amount they want x to increment by.
		System.out.print("Enter the amount to increment x: ");
		double amountIncrement = keyboard.nextDouble();

		// If the number is 0 then the program will stop.
		if (amountIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		System.out.println("");
		System.out.println("Values");

		// This part populates the x array by use of a loop.
		for (int i = 0; i < numberOfX; i++) {

			if (i == 0) {
				// This part starts the first index a the minimum x chosen previously.
				xValue[i] = xValue[0];
			} else {
				// This part adds the previous x value plus the increment you want
				// to increase by.
				xValue[i] =  xValue[i-1] + amountIncrement;
			}

		}
		
		// Here the program populates the y array by use of a loop.
		for (int i = 0; i < numberOfX; i++) {
			// Here the given equation is used to populate the y array.
			yValue[i] = 20.0 * Math.abs(Math.sin(xValue[i]));
		}
		
		// Here I print out the x and y table values.
		for (int i = 0; i < numberOfX; i++) {
			// This makes sure the x values display properly with out numbers like -0.0
			xValue[i] = Math.round(xValue[i] * 100000.0) / 100000.0;
			// Prints using numbers only with 3 decimal places.
			System.out.printf("x: %.3f", xValue[i]);
			System.out.printf(", y: %.3f", yValue[i]);
			System.out.println();
		}

		System.out.println("");
		System.out.println("Graph");
		
		// The part prints out the graph of the equation.
		for (int i = 0; i < numberOfX; i++) {
			System.out.print(":");
			// Prints out a "*" for every 1 y by only printing out the number
			// as a whole number.
			for (int j = 0; j < Math.floor(yValue[i]); j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		keyboard.close();
	}

}
