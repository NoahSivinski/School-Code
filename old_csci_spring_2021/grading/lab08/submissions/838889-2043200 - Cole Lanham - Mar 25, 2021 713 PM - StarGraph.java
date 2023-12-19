/*
 * StarGraph.java
 * Author:  Cole Lanham 
 * Submission Date:  3/25/21
 *
 * Purpose: This program primarily utilizes our understanding of arrays
 * and nested loops in a condensed manner. This program prompts the user
 * for a quantity of x values to process, a minimum value for the
 * first value of x, and an amount to increment by. These values are 
 * stored within an array of x. Next calculations are performs and assigned
 * to proper values of an array of y. All elements of x and y are produced
 * then a graph displaying the amount of y values is shown.
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

		System.out.print("Please enter the number of x values to process: "); // Initial prompting
		Scanner keyboard = new Scanner(System.in);
		int numberOfIterations = keyboard.nextInt();
		if (numberOfIterations <= 0) { //Exits program if number of x values is <= 0
			System.out.println("The number of x values must be an integer greater than 0."); 
			System.exit(0);
		}
			
		System.out.print("Enter a minimum value for x: ");
		double minimumValueOfX = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double incrementValue = keyboard.nextDouble();
		if (incrementValue <= 0) { //Exits program if the amount for increments is <= 0 
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		double[] xValue = new double[numberOfIterations]; // - This is according to the lab's description for the variable of x (Allows the loops to run for the set amount of iterations.
		double[] yValue = new double[numberOfIterations]; // - This is according to the lab's description for the variable of y
		
		xValue[0] = minimumValueOfX;
		for (int i = 1; i < numberOfIterations;) { //Loop iterations determined by user input which sets the values of x with increment values.
			xValue[i] = xValue[i-1] + incrementValue;
			i++;
		}

		for (int i = 0; i < numberOfIterations;) { //Loop iterations determined by user input which performs calculations for each number stored in array
			yValue[i] = 20.0 * Math.abs(Math.sin(xValue[i]));
			i++;
		}
		
		System.out.println(""); //Formatting output
		System.out.println("Values");
		
		for (int i = 0; i < numberOfIterations;) { //Provides output for values of x and y
			System.out.printf("x: " + "%.3f",xValue[i]);
			System.out.printf(", y: "  + "%.3f",yValue[i]);
			System.out.println("");
			i++;
		}

		System.out.println("");
		System.out.println("Graph");
		
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.print(":");
			for (int n = 1; n <= yValue[i]; n++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
		keyboard.close();
	}

}
