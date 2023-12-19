/*
 * StarGraph.java
 * Author:  Evan Zimmerman 
 * Submission Date:  26th March 2021
 *
 * Purpose: The exercise being explored by Lab #8 is applications of nested loops and arrays.
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
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user for a number of x values.
		System.out.println("Please enter the number of x values to process: ");
		int numberOfValues = input.nextInt();
		
		//If the number of values is an integer equal to or less than 0, terminate program.
		if(!(numberOfValues > 0)) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		//Prompt for minimum value of x.
		System.out.println("Enter a minimum value for x: ");
		double xMinValue = input.nextDouble();
		
		//Prompt for increment of x.
		System.out.println("Enter the amount to increment x: ");
		double xIncrement = input.nextDouble();
		
		//If the x increment is a double equal to or less than 0, terminate program.
		if(!(xIncrement > 0)) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//Create arrays for values of x and y, the length of each array is the number
		//of values entered by the user. Also initializes the first value in the x array.
		double[] xValues = new double[numberOfValues];
		double[] yValues = new double[numberOfValues];
		xValues[0] = xMinValue;
		
		//Prints the header for the list.
		System.out.println("");
		System.out.println("Values");
		
		//Loop that calculates and prints each value of x and y. The loop variable
		//i starts at 0 to include the first indices of the x and y arrays.
		for(int i = 0; i < numberOfValues; i++) {
		xValues[i] = xMinValue + (i*xIncrement);
		yValues[i] = 20*Math.abs(Math.sin(xValues[i]));
		System.out.printf("x: " + "%.3f", xValues[i]);
		System.out.printf(", y: " + "%.3f", yValues[i]);
		System.out.println("");
		}
		
		//Prints the header for the graph section.
		System.out.println("");
		System.out.println("Graph");
		
		//Loop that prints the same amount of lines as the number of values in the array
		for(int i = 0; i < numberOfValues; i++) {
			//Print the colon at the beginning of each line
			System.out.print(":");
			//Uses the floor method to find the nearest integer less than the y value for i,
			//and then prints that amount of asterisks.
			for (int j = 0; j < Math.floor(yValues[i]); j++) {
				System.out.print("*");
			}
			//Println to start the next line of asterisks
			System.out.println("");
		}
		
		input.close();
		
	}

}
