/*
 * [Intro to Coding and Program].java
 * Author:  [Nataly Garcia] 
 * Submission Date:  [Friday March 26 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? In this program, the code
 * asks the user to for a specific amount of pair of values,
 * a minimum x value, and its increment for each x-value.
 * Using the x-values, a given formula gives the user a y-value
 * and list the specific amount of pairs of values wanted. 
 * Then, the program creates a graph in which the number
 * of stars represent the number of y-values, without rounding,
 * and each line is the proceeding x-value starting with the minimum.
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

		Scanner input = new Scanner(System.in);
		String garbage;

		System.out.print("Please enter the number of x values to process: ");
		int number = input.nextInt();
		garbage = input.nextLine();

		if (number <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double minimum = input.nextDouble();
		garbage = input.nextLine();

		System.out.print("Enter the amount to increment x: ");
		double increment = input.nextDouble();
		garbage = input.nextLine();

		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		double xValues[] = new double[number];
		double yValues[] = new double[number];

		double value = minimum;

		for (int index = 0; index < number; index++) {
			xValues[index] = value;
			yValues[index] = 20.0 * Math.abs(Math.sin(value));

			value = value + increment;

			if ((value > -0.0005) && (value < 0)) {
				value = Math.abs(value);
			}

		}

		System.out.println("\nValues");

		for (int index = 0; index < number; index++) {
			System.out.printf("x: %.3f, y: %.3f\n", xValues[index], yValues[index]);
		}

		System.out.println("\nGraph");

		for (int index = 0; index < number; index++) {
			System.out.print(":");
			int numStars = (int) yValues[index];

			for (int y = 0; y < numStars; y++) {
				System.out.print("*");
			}

			System.out.println();
		}
		input.close();
	}

}
