
/*
 * StarGraph.java
 * Author: Vietmy Vo
 * Submission Date:  3/25/2021
 *
 * Purpose: The user inputs the size of the array and, a minimum value of x, and an increment by how
 * much x increases. This then gives you x and y values. These x and y values help to create a star
 * graph based on the y values.
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
		int sizeOfArray;
		double minimumValue;
		double incrementOfX;
		double[] x, y;

		System.out.print("Please enter the number of x values to process:");
		sizeOfArray = keyboard.nextInt();

		if (sizeOfArray <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x:");
		minimumValue = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x:");
		incrementOfX = keyboard.nextDouble();

		if (incrementOfX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		x = new double[sizeOfArray];
		y = new double[sizeOfArray];

		x[0] = minimumValue;
		y[0] = 20 * Math.abs(Math.sin(x[0]));

		System.out.println("\nValues");
		System.out.printf("x: %.3f, y: %.3f", x[0], y[0]);

		for (int i = 1; i < sizeOfArray; i++) {
			x[i] = x[i - 1] + incrementOfX;
			y[i] = 20 * Math.abs(Math.sin(x[i]));
			if (x[i] < 0 && x[i] > -0.009) {
				x[i] = Math.abs(x[i]);
			}
			System.out.printf("\nx: %.3f, y: %.3f", x[i], y[i]);
		}

		System.out.println("\n\nGraph");

		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(":");

			for (int o = 0; o < Math.floor(y[i]); o++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}

}
