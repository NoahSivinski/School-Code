/*
 * StarGraph.java
 * Author:  Allan Waweru
 * Submission Date:  [03/28/2021]
 *
 * Purpose: To create nested loops and loops to create and manipulate one-dimensional arrays.
 * 
 * Statement of Academic Honesty: The following code represents my own work. I have neither
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
		Scanner input = new Scanner(System.in);

		double[] x,y;

		System.out.print("Please enter the number of x values to process: ");	
		int sizeN = input.nextInt();
		if (sizeN < 1) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double min = input.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double inc = input.nextDouble();

		if (inc <= 0.0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}


		x = new double[sizeN];	//x array and initialize
		y = new double[sizeN];	//y array
		x[0] = min;
		for (int i = 1; i < sizeN; i++) {
			x[i] = x[i-1] + inc;
		}

		System.out.println("\nValues");	//values
		for (int i = 0; i < sizeN; i++) {
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			System.out.printf("x: %1.3f, y: %1.3f\n", x[i], y[i]);
		}
		System.out.println();


		System.out.println("Graph");	//graph
		for (int i = 0; i < sizeN; i++) {
			System.out.print(":");
			for (int j = 0; j < Math.floor(y[i]); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
