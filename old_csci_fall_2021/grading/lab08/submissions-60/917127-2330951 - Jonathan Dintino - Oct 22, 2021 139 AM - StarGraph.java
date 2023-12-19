
/*
 * StarGraph.java
 * Author: Jonathan Dintino
 * Submission Date: 22 October 2021
 *
 * Purpose: This program will prompt the user for numerical bounds
 * and change in order to calculate the solutions for a given number
 * of values inputted into an equation. It will output the x and y
 * values as well as output a horizontal graph to the console
 * showing the y value quantities.
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// prompt user to enter amount of x values
		System.out.print("Please enter the number of x values to process: ");
		int valueAmount = userInput.nextInt();
		
		if (valueAmount <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		// prompt user to enter the minimum x value
		System.out.print("Enter a minimum value for x: ");
		double minValue = userInput.nextDouble();
		
		// prompt user to enter the value to increment x by
		System.out.print("Enter the amount to increment x: ");
		double increment = userInput.nextDouble();
		
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		// create arrays to store data with the size of the amount of x values
		double[] x_values = new double[valueAmount];
		double[] y_values = new double[valueAmount];
		
		// variables to be used for calculating x and y values
		double currentValue = minValue;
		double calculated;
		
		// output x and y values to the console
		System.out.println("\nValues");
		for (int i = 0; i < valueAmount; i++) {
			
			calculated = 20 * Math.abs(Math.sin(currentValue));
			System.out.printf("x: %.3f, y: %.3f\n", currentValue, calculated);
			
			x_values[i] = currentValue;
			y_values[i] = calculated;
			
			currentValue += increment;
			
		}
		
		// output y graph to the console
		System.out.println("\nGraph");
		for(double v: y_values) {
			System.out.print(":");
			for (int i = 1; i <= v; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
