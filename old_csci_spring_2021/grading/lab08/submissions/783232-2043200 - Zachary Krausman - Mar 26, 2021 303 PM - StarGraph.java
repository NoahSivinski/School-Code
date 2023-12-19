/*
 * StarGraph.java
 * Author:  Zachary Krausman
 * Submission Date:  26 March 2021
 *
 * Purpose: Collect values from the user, stores them in an array, increment the values in the array, and create a new array
 * with modified values given the formula y = 20.0 * |sin x|. Once the two arrays display all the information based off of
 * the inputs the user gives, a graphic composed of stars will output truncated y values.
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

		// Variable declaration
		int size = 0; // Size N of the array (number of values of x for which y will be computed
		double xMin = 0.0; // a minimum value for x
		double increment = 0.0; // an increment for x (a value by which x is increased)

		// Set up scanner
		Scanner keyboard = new Scanner(System.in);

		// Ask for user input to make arrays
		System.out.print("Please enter the number of x values to process: ");
		size = keyboard.nextInt();
		if (size <= 0) { // sizing checker
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		keyboard.close(); // stop resource leak
		if (increment <= 0) { // increment checker
			System.out.println("The increment must be a decimal greater than 0.");
			System.exit(1);
		}
		System.out.println(); // spacing line

		// Array set up
		double[] x = new double[size]; // x array that uses user's input values
		double[] y = new double[x.length]; // y array take user input and modifies it with given equation (below)

		// Values calculation and print out section
		System.out.println("Values"); // header
		double passIncrease = xMin; // intermediate variable to pass increased number to the array of x for each increasing index
		for (int i = 0; i < x.length; i++) { // cycles through index
			x[i] = passIncrease;
			y[i] = 20.0 * (Math.abs(Math.sin(x[i]))); // given equation but 'y' and 'x' substituted with their arrays
			System.out.printf("x: %.3f, y: %.3f\n", x[i], y[i]);
			passIncrease = passIncrease + increment;
		}

		// Graph print out section
		System.out.println("\nGraph"); // header
		for (int i = 0; i < x.length; i++) { // cycles through index like above
			System.out.print(":");
			int downCast = (int) y[i]; // down casts double values to int in order to truncate number for star print out
			for (int j = 0; j < downCast; j++) { // star print out
				System.out.print("*");
			}
			System.out.println(); // cycles to next line
		}
	}
}
