/*
 * StarGraph.java
 * Author:  Jordan Arogeti 
 * Submission Date:  3/25/21
 *
 * Purpose: This program prompts the user to input a number for the X values 
 * to process, a minimum value for X, and the amount you want to increment X
 * by. Then it prints out a list of values for x and solves for the y values.
 * Then is prints a horizontal graph of the x and y values.
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

// importing scanner
import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// Gathering user information
		System.out.print("Please enter the number of x values to process: ");
		int numX = keyboard.nextInt();
		if (numX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}// if size of array is 0 or negative integer
		System.out.print("Enter a minimum value for x: ");
		double minXValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double incrementX = keyboard.nextDouble();
		if (incrementX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}// if increment size is 0 or a negative number

		// Gathering and printing x and y values
		System.out.println();
		System.out.println("Values");
		
		//creating arrays
		double[] xValues = new double[numX];
		double[] yValues = new double[numX];
		
		//assigning minXValue as index 0 of xValues array
		xValues[0] = minXValue;

		//using the arrays to calculate y and print out the x and y values 
		for (int i = 0; i < xValues.length && i < yValues.length; i++) {
			//using if statement to store xValues with the increment after the minXValue(at index 0)
			if (i >= 1)
				xValues[i] = xValues[i - 1] + incrementX;
			
			//calculating yValues in the array by taking the absolute value of (the sin (of each of the xValues)) and then multiplying each by 20
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
			
			//print each x and y value with 3 decimal points
			System.out.printf("x: %.3f, ", Math.round(xValues[i] * 1000.0) / 1000.0);
			System.out.printf("y: %.3f", Math.round(yValues[i] * 1000.0) / 1000.0);
			System.out.println();
		}// for outputting x and y values
		
		System.out.println(); //space between parts

		
		// Printing the graph
		System.out.println("Graph");
		
		//using the x and y values to print a graph, for loop here is used to "plot" the x values 
		for (int i = 0; i < xValues.length; i++) {
			System.out.print(":");
			//for loop here is for deciding how many stars to print for the corresponding y values (at their floor)
			for (int j = 0; j < Math.floor(yValues[i]); j++) {
				System.out.print("*");
			}// for loop for "plotting" y
			System.out.println();
		}// for loop for "plotting" x

		
		keyboard.close();
		
		
	}// main

}// class
