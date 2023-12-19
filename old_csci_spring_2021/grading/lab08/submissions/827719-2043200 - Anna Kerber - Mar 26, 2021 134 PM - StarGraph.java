/*
 * StarGraph.java
 * Author:  Anna Kerber
 * Submission Date:  3/26/21
 *
 * Purpose: The purpose of this program is to use the given equation 
 * find the y value of a given x value the entered number of times, 
 * where each time x is incremented by an entered amount. After all 
 * of these values are printed, a graph of the y values in *s is 
 * printed as well.
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

		Scanner scanner = new Scanner(System.in);
		double increment, x1, y1;
		int size;

		System.out.print("Please enter the number of x values to process: ");
		size = scanner.nextInt();
		if (size <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		double[] x = new double[size];
		double[] y = new double[size];
		System.out.print("Enter a minimum value for x: ");
		x[0] = scanner.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment = scanner.nextDouble();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println("\nValues");

		for (int i = 0; i < size; i++) {
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			x1 = Math.round(x[i]*1000.0)/1000.0;
			y1 = Math.round(y[i]*1000.0)/1000.0;
			System.out.printf("x: %1.3f", x1);
			System.out.printf(", y: %1.3f%n", y1);
			if (i != size - 1) {
				x[i + 1] = x[i] + increment;
			}

		}

		System.out.println("\nGraph");
		for (int i = 0; i < size; i++) {
			System.out.print(":");
			for (int j = 0; j < ((int) y[i]); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}

}
