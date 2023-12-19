/*
 * StarGraph.java
 * Author: Aaron Shurley 
 * Submission Date: 3/25/2021
 *
 * Purpose: To take the values inputed by the user and create a 
 * graph with the given values to create the x and y values used 
 * within the graph.
 * 
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

import java.util.Scanner;// Imported scanner

public class StarGraph { 

	public static void main(String[] args) {
        // Scanner that allows for the user to input
		Scanner keyboard = new Scanner(System.in);
		int i; 
		// Initialized variable 'i' as an integer value used in the computing the
	   // correct values in the loops

		System.out.print("Please enter the number of x values to process: "); // Prompt for the user to enter a the
																				// number of values for the system to
																				// process
		// Integer the user inputs
		int numberOfXValues = keyboard.nextInt(); 
		if (numberOfXValues <= 0) { 
			// Statement if the integer is zero or negative
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
          //Prompts for the user to put  in a minimum value
		System.out.print("Enter a minimum value for x: ");
	       //minimum the user inputs
		double minimumXValue = keyboard.nextDouble();
		//Prompts user to input the increments of x
		System.out.print("Enter the amount to increment x: ");
		//increment the user inputs
		double increment = keyboard.nextDouble();
		if (increment <= 0) {
			 // Statement if the user puts an increment below or equal to zero
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
         //double to compute the y values
		double yValuesComputed = (20.0 * (Math.abs(Math.sin(minimumXValue))));
         // double to compute the x values 		
		double xValuesComputed = (minimumXValue);
		//
		double[] yValues = new double[100];
		//
		double[] xValues = new double[100];
		//Array to output the x and y  values
		System.out.println();
		System.out.println("Values");
		System.out.printf("x: %.3f", xValuesComputed);
		System.out.printf(", y: %.3f\n", yValuesComputed);

		xValues[0] = xValuesComputed;
		yValues[0] = yValuesComputed;
		for (i = 1; i < numberOfXValues; i++) {
			xValuesComputed = (xValuesComputed + increment);
			yValuesComputed = (20.0 * (Math.abs(Math.sin(xValuesComputed))));
			if (xValuesComputed > -0.00001 && xValuesComputed < 0) {
				xValuesComputed = 0;
			}
			System.out.printf("x: %.3f", xValuesComputed);
			System.out.printf(", y: %.3f", yValuesComputed);

			xValues[i] = xValuesComputed;
			yValues[i] = yValuesComputed;

			System.out.println();
		}

		System.out.println();
		System.out.println("Graph");

		for (i = 0; i < numberOfXValues; i++) {
			System.out.print(":");
			for (int j = 0; j < (int) yValues[0 + i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		keyboard.close();
	} 

}
