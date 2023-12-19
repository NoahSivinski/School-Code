
/*
 * [StarGraph].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [3/26/21]
 *
 * Purpose: This program takes the users desired inputs for minimum x value, increment of x, and number of x in order to print out a list of x and y values following a graph that depicts the truncated y values. 
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

		// declaring the variables
		double minimumX; // x min
		double incrementX; // value by which x is increased
		int numberOfX; // the size N of the array

		Scanner keyboard = new Scanner(System.in);

		// user input numberOfX along with error statement
		System.out.print("Please enter the number of x values to process: ");
		numberOfX = keyboard.nextInt();
		if (numberOfX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		// user input minimumX & incrementX along with error statement
		System.out.print("Enter a minimum value for x: ");
		minimumX = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		incrementX = keyboard.nextDouble();
		if (incrementX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		// arrays for x & y values
		double[] xValues = new double[numberOfX];
		double[] yValues = new double[numberOfX];

		System.out.println("");
		System.out.println("Values");

		// loop for printing out the list of x & y values according to user input and
		// using the given equation for y
		for (int i = 0; i <= numberOfX - 1; i++) {
			xValues[i] = minimumX + i * incrementX;
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
			System.out.printf("x: %.3f, y: %.3f\n", xValues[i], yValues[i]);
		}

		// star graph printing the truncated y values
		System.out.println("");
		System.out.println("Graph");

		for (int i = 0; i < numberOfX; i++) {
			System.out.print(":");
			for (int j = 0; j < (int) yValues[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}

}
