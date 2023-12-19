/*
 * StarGraph.java
 * Author: Kaushalkumar A. Patel 
 * Submission Date: 03-25-21
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * The program will utilize loops and arrays. Values for x and y are computed 
 * based on input from the user. Once the values are found, the program will 
 * print them out. The program will also print out a graphical representation 
 * of the function, using a sequence of ‘*’s to indicate the magnitude of y.
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

		// Instance of Scanner
		Scanner keyboard = new Scanner(System.in);

		// Input about the number of x values to take in
		System.out.print("Please enter the number of x values to process: ");
		int arraySize = keyboard.nextInt();
		keyboard.nextLine();
		if (arraySize <= 0) { // If the number of x values are less than 0 then the program exits
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		// User enters a minimum value for x
		System.out.print("Enter a minimum value for x: ");
		double minimumValue = keyboard.nextDouble();
		keyboard.nextLine();

		// User enters the amount to increment x
		System.out.print("Enter the amount to increment x: ");
		double incrementValue = keyboard.nextDouble();
		keyboard.nextLine();
		if (incrementValue <= 0.0) { // If the increment double value is less than 0 then program will exit
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println();

		// The array of x values
		double[] x = new double[arraySize];
		x[0] = minimumValue;
		for (int i = 1; i < arraySize; i++) {
			x[i] = x[i - 1] + incrementValue;
		}

		// The array of y values
		double[] y = new double[arraySize];
		for (int i = 0; i < arraySize; i++) {
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
		}

		// Output of the x and y values
		System.out.println("Values");
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("x: %1.3f, y: %1.3f\n", x[i], y[i]);
		}
		System.out.println();

		// Print the star graph
		System.out.println("Graph");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(":");
			for (int j = 0; j < (int) y[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
