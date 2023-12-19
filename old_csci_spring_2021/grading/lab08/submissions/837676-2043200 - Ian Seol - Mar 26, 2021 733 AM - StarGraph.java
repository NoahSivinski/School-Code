
/*
 * [CSCI1301L].java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [03262021]
 *
 * Purpose:This program increments(increment amount entered by user)
 *  and saves x values(starting x value entered by user) to array to calculate y values accordingly.
 *  The y values are calculated using a function y = 20.0 * |sinx| and the results are graphed with stars.
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

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number of x values to process: ");
		int numberOfX = sc.nextInt();
		if (numberOfX <= 0) {
			System.out.println("The number of x values must be an integer greater then 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double minX = sc.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		double amtIncrementConstant = sc.nextDouble();
		if (amtIncrementConstant < 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		double amtIncrement = amtIncrementConstant;
		double[] xValues = new double[numberOfX];
		double[] yValues = new double[numberOfX];

		System.out.println("\nValues");
		amtIncrement = 0;
		
		//loop for x and y calculations and to save to each arrays
		for (int i = 0; i < numberOfX; i++) {

			xValues[i] = minX + amtIncrement;
			System.out.print("x: ");
			System.out.printf("%.3f", xValues[i]);
			System.out.print(", ");

			amtIncrement = amtIncrement + amtIncrementConstant;

			yValues[i] = 20.0 * (Math.abs(Math.sin(xValues[i])));
			System.out.print("y: ");
			System.out.printf("%.3f", yValues[i]);
			System.out.println();

		}
		System.out.println("\nGraph");
		
		//loop to print y values to a graph
		for (int i = 0; i < numberOfX; i++) {

			int[] yValuesRounded = new int[numberOfX];
			//y values truncated to no decimal places for graphing
			yValuesRounded[i] = (int) yValues[i];
			System.out.print(":");

			for (int j = 0; j < yValuesRounded[i]; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
		
		
		sc.close();
		
		
	}

}
