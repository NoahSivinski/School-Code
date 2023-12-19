/*
 * StarGraph.java
 * Author:  Sunny Shah 
 * Submission Date:  03/26/2021
 *
 * Purpose: This program takes user input using arrays for the number of x, 
 * minimum value of x, and increments of x. Then, it creates a table of
 * x and y values. It also displays a graph of the y values.
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

		Scanner keyboard = new Scanner (System.in);

		System.out.print("Please enter the number of x values to process: ");
		int numOfX = keyboard.nextInt(); // number of x values to process

		if (numOfX < 1) // If number of x values to process < 1, then end the program
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double minOfX = keyboard.nextDouble(); // minimum value of x

		System.out.print("Enter the amount to increment x: ");
		double incOfX = keyboard.nextDouble(); // rate of increase for x

		if (incOfX <= 0) // If rate of increase is <= 0, then end the program
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println("Values");

		// creating 2 arrays
		double x [];
		double y [];

		x = new double [numOfX];
		y = new double [numOfX];
		
		
		x[0] = minOfX; // first value of x is equal to the minimum value of x
		y[0] = 20.0 * Math.abs(Math.sin(x[0])); // formula to calculate the y value. Uses x[0] because it's the first value

		// Printf methods limits to 3 decimal places
		System.out.printf("x: %.3f, ", x[0]);
		System.out.printf("y: %.3f", y[0]);
		System.out.println();

		for (int i = 1; i < numOfX; i++) // loops until i < number of x values
		{	
			x[i] = x[i - 1] + incOfX; // takes the previous x value and adds the rate of increase
			y[i] = 20.0 * Math.abs(Math.sin(x[i])); // formula to calculate the y value. i++ after each loop so paired with the correct x value
			
			int z = 1; // variable created to hold the rounded x[z]. To avoid cases like -0.000
			x[z] = Math.round(x[i]*100000.0)/100000.0; // x[i] value rounded
			
			// Printf methods limits to 3 decimal places
			System.out.printf("x: %.3f, ", x[z]); // prints rounded value
			System.out.printf("y: %.3f", y[i]);	// prints original y value 
			System.out.println();
			
			z++; // used to round by matching the i variable
		}

		System.out.println();
		System.out.println("Graph");

		for (int i = 0; i < numOfX; i++) // loops until i is less than the number of x values
		{
			System.out.print(":"); // prints for each number of x values
			
			x[i] = minOfX; // x minimum
			minOfX = minOfX + incOfX; // x values
			y[i] = 20.0 * Math.abs(Math.sin(x[i])); // y values
			int s = 0; // used to round y[i]
			s++; // increases after each loop
			y[s] = Math.round(y[i]*100000.0)/100000.0; // the rounded values of y to equal the values printed above the graph. used with Math.floor to make star graph
			
			for (int z = 0; z < Math.floor(y[s]); z++) // prints * for each y[s] value. Math.floor rounds down to nearest integer
			{
				System.out.print("*");
			}
			System.out.println();
		}

		keyboard.close();

	}
}