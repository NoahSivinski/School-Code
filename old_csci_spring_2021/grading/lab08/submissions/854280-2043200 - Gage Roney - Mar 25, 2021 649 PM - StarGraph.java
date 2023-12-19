/*
 * StarGraph.java
 * Author:  Gage Roney 
 * Submission Date:  3/25/2021
 *
 * Purpose: The purpose of this program is to allow for the user to enter the number of x-values that the user wants, the minimum number for the first
 * x-value that user inputs, and the amount that the user wants to increment their values. The program will use a loop to compute the x-values incremented and
 * the y-values based on the function, y = 20.0 * |sin(x)|, then it displays a simple graph using the '*' based on the user's inputs. There is also a series of 
 * error cases that show if the user enters the wrong input and will display an error message 
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

public class StarGraph { // Name of the class

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in); // Scanner that allows for the user to input
		int i; // Initialized variable 'i' as an integer value used in the computing the
				// correct values in the loops

		System.out.print("Please enter the number of x values to process: "); // Prompt for the user to enter a the
																				// number of values for the system to
																				// process
		int numberOfXValues = keyboard.nextInt(); // Integer the user inputs
		if (numberOfXValues <= 0) { // Error case decision statement that checks the integer value entered by the
									// user
			System.out.println("The number of x values must be an integer greater than 0."); // Print statement that
																								// outputs when error
																								// case is triggered
			System.exit(0); // Exists the program after the print statement is executed
		}

		System.out.print("Enter a minimum value for x: "); // Prompt for the user to input a minimum x value to
															// calculate
		double minimumXValue = keyboard.nextDouble(); // Minimum value initialized as a double and changes depending on
														// user input
		System.out.print("Enter the amount to increment x: "); // Number that is added to the minimum x-value that was
																// entered by the user
		double increment = keyboard.nextDouble(); // Increment variable initialized as a double value
		if (increment <= 0) { // Decision statement that is an error case that checks to see if the increment
								// value is greater than 0
			System.out.println("The increment must be a decimal number greater than 0."); // Print line that outputs
																							// when error case is
																							// triggered
			System.exit(0); // Exists the program when this error case is triggered
		}
		// Series of initialized variables and arrays as doubles
		double yValuesComputed = (20.0 * (Math.abs(Math.sin(minimumXValue)))); // Formula used to calculate minimum
																				// y-value
		double xValuesComputed = (minimumXValue); // Is the minimum x-value
		double[] yValues = new double[100]; // Array that holds just a random amount of 100 y-values to store
		double[] xValues = new double[100];// Array that holds just a random amount of 100 x-values to store

		System.out.println(); // Space to separate these prompts
		System.out.println("Values"); // Print line
		System.out.printf("x: %.3f", xValuesComputed); // Prints the first iteration of the x-values at three decimal
														// points
		System.out.printf(", y: %.3f\n", yValuesComputed);// Prints the first iteration of the y-values at three decimal
															// points

		xValues[0] = xValuesComputed; // Stores the x-value first value into the array
		yValues[0] = yValuesComputed; // Stores the y-value first value into the array
		for (i = 1; i < numberOfXValues; i++) { // Loop that computes the the values for x and y until it gets to be the
												// same number of values starting from 1
			xValuesComputed = (xValuesComputed + increment); // The x-values that will be calculated
			yValuesComputed = (20.0 * (Math.abs(Math.sin(xValuesComputed)))); // The y-values that will be calculated
			if (xValuesComputed > -0.00001 && xValuesComputed < 0) { // Decision statement that accounts for the error
																		// if the 0 is an extremely small and negative
				xValuesComputed = 0; // This makes that extremely minute negative value to zero
			}
			System.out.printf("x: %.3f", xValuesComputed); // Prints the x-values to three decimal points
			System.out.printf(", y: %.3f", yValuesComputed); // Prints the x-values to three decimal points

			xValues[i] = xValuesComputed; // Stores these values into the array that was previously initialized
			yValues[i] = yValuesComputed;

			System.out.println(); // Makes sure that it will start a new line after each loop is executed
		}

		System.out.println(); // Prints a line of space
		System.out.println("Graph"); // Print line that outputs a word
		// Nested for loop that outputs the graph
		for (i = 0; i < numberOfXValues; i++) { // Loop that prints the correct number of colons depending on the number
												// of x-values inputed from user
			System.out.print(":");
			for (int j = 0; j < (int) yValues[0 + i]; j++) { // Loop that prints the correct number of "*" depending on
																// the y-value that was calculated made into the integer
																// value so it does not round up and print one too many
																// "*"
				System.out.print("*");
			}
			System.out.println();// Makes sure that it will start a new line after each loop is executed
		}
		System.out.println(); // Makes sure that it will start a new line after each loop is executed
		keyboard.close(); // Keyboard from user closed
	}

}
