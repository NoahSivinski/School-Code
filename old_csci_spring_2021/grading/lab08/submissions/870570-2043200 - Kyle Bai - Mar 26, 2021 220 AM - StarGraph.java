/*
 * [StarGraph].java
 * Author:  [KyleBai] 
 * Submission Date:  [03/26/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *This program can use the user input to calculate of the x and y value, and print out the graph of sequence to indicate the magnitude of y by using *.
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
		int n, h, v;
		double xMin, increment_X;

		System.out.print("Please enter the number of x values to process: ");
		n = keyboard.nextInt();
		// if x value is less or equal to 0, then tell user the x value most greater then 0
		if(n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment_X = keyboard.nextDouble();
		// if increment is less or equal to 0, then tell user the increment most greater then 0
		if(increment_X <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		// arrays for x 
		double[] x = new double[n];
		//arrays for y
		double[] y = new double[n];

		System.out.println();
		System.out.println("Values");
		// loop for value of x and y
		for(h = 0; h < n; h++) {
			x[h] = xMin;
			x[h] += h * increment_X;
			y[h] = 20.0 * Math.abs(Math.sin(x[h]));
		}
		// loop for print the values
		for(h = 0; h < x.length; h++) {
			System.out.printf("x: %.3f", x[h]);
			System.out.printf(", y: %.3f\n", y[h]);
		}
		System.out.println();
		System.out.println("Graph");
		// loop for print the graph
		for(h = 0; h < x.length; h++) {
			System.out.print(":");
			for(v = 0; v < Math.floor(y[h]); v++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}
}