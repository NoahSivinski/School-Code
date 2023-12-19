
/*
 *StarGraph.java

 * Author: Cole Wright 
 * Submission Date:  3/26/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This code uses arrays to store data and output the data. It takes a number of x values from the user, and based on the increment given by the user, it will calculate 20 times the sin of the x value.
 * It will display the original number as the x value and the y value is the number after it has gone through the calculation. It will then display a "graph" of the y values using *s. It will display 
 * as many *s as their are whole numbers in the y value. If the number is for example, 14.99, it will display 14 *s. This code tests the programmers use of arrays and loops to create the code. 
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

		if (N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double Xmin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double incrX = keyboard.nextDouble();

		if (incrX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		double[] x = new double[N];// creation of the arrays
		double[] y = new double[N];

		x[0] = Xmin; // creates the value of x and y [0]
		y[0] = 20 * Math.abs(Math.sin(x[0]));

		for (int i = 1; i < N; i++) {// calculates the value for the array at each value
			x[i] = x[i - 1] + incrX;
			y[i] = 20 * Math.abs(Math.sin(x[i]));
		}
		System.out.println();
		System.out.println("Values");// displays the x and y values to the first 3 decimal places
		for (int i = 0; i < N; i++) {
			System.out.println("x: " + String.format("%.3f", x[i]) + ", y: " + String.format("%.3f", y[i]));
		}
		System.out.println();

		System.out.println("Graph");
		for (int i = 0; i < N; i++) {// graphs the y values using a loop
			System.out.print(":");
			double yRound = Math.floor((y[i]));
			for (int v = 0; v < yRound; v++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}

}
