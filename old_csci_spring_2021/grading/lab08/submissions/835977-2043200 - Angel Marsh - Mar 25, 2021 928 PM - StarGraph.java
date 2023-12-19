
/*
 * StarGraph.java
 * Author:  Angel Marsh 
 * Submission Date:  March 25, 2021
 *
 * Purpose: The purpose of this program is to increment a user-
 * specified x value a number of times specified by the user and
 * print those x-values as well as their corresponding y-values
 * (which are based on the equation y = 20.0 * |sin x|) and a graph
 * where the number of asterisks in each row corresponds to the
 * whole number part of the y value.
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

		int numberOfXValues;
		int i = 0;
		double minimumXValue;
		double xIncrement;

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Please enter the number of x values to process: ");
		numberOfXValues = keyboard.nextInt();
		if (numberOfXValues <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.printf("Enter a minimum value for x: ");
		minimumXValue = keyboard.nextDouble();

		System.out.printf("Enter the amount to increment x: ");
		xIncrement = keyboard.nextDouble();
		if (xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		System.out.println();
		System.out.println("Values");

		// creating the arrays
		double[] yValues = new double[numberOfXValues];
		double[] xValues = new double[numberOfXValues];
		double lastValue = 0;
		// building the arrays element by element
		while (i < numberOfXValues) {
			if (i == 0) {
				xValues[i] = minimumXValue;
				yValues[i] = 20 * (Math.abs(Math.sin(xValues[i])));
			} else {
				xValues[i] = lastValue + xIncrement;
				yValues[i] = 20 * (Math.abs(Math.sin(xValues[i])));
			}
			// lastValue will be incremented and assigned to the element at i in the array
			lastValue = xValues[i];
			i++;
		}
		i = 0;
		while (i < numberOfXValues) {
			// so that the program prints 0.000, not -0.000
			if (xValues[i] < 0 && xValues[i] > -0.001) {
				xValues[i] = 0;
			}
			System.out.printf("x: %.3f", xValues[i]);
			System.out.printf(", y: %.3f", yValues[i]);
			System.out.println();
			i++;
		}
		i = 0;
		System.out.println();
		System.out.println("Graph");
		while (i < numberOfXValues) {
			int counter = 0;
			// if the y-value < 1, the program will not print any stars in that row
			if (yValues[i] < 1) {
				System.out.println(":");
			} else {
				System.out.print(":");
				// This is the loop for printing the correct amount of asterisks in the given
				// row.
				// type-casting the y-value to an int so the amount of asterisks printed
				// corresponds to the whole number part of the y-value
				while (counter < (int) (yValues[i])) {
					System.out.print("*");
					counter++;
				}
				System.out.println();
			}
			i++;
		}
		keyboard.close();

	}

}
