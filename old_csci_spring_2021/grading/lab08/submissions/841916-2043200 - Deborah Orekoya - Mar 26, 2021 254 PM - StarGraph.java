/*
 * StarGraph.java
 * Author:  Deborah Orekoya 
 * Submission Date:  03/26/2021
 *
 * Purpose: 
 * 
 * The purpose of this program is to create a program using two 
 * arrays of type double to store multiple values for x and y. 
 * In this program, both the values for x and y are computed based
 * on input from the user. Once the values are found, the program is
 * able to print them out. The program can also print out a graphical 
 * representation of the function, using a sequence of ‘*’s to
 * indicate the magnitude of y. 
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
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		int N = keyboard.nextInt();

		//When the size of the arrays is less than or equal to 0
		if (N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double minimumValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double incrementValue = keyboard.nextDouble();

		////When the increment value is less than or equal to 0
		if (incrementValue <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		double[] x = new double[N];
		double[] y = new double[N];

		x[0] = minimumValue;
		y[0] = 20.0 * Math.abs(Math.sin(x[0]));

		//Printing the values of x and y
		System.out.println("\nValues");
		System.out.printf("x: %.3f, y: %.3f\n", x[0], y[0]);

		for (int i = 1; i < N; i++) {
			x[i] = x[i - 1] + incrementValue;
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			double temp = Math.round(x[i] * 10000.0) / 10000.0;
			System.out.printf("x: %.3f, y: %.3f\n", temp, y[i]);	
		}

		//Printing the graph
		System.out.println("\nGraph");

		for (int i = 0; i < N; i++) {
			System.out.print(":");

			for (int j = 0; j < Math.floor(y[i]); j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

		keyboard.close();
	}

}
