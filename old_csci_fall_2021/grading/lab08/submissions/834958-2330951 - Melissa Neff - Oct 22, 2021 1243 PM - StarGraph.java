/*
 * StarGraph.java
 * Author:  Melissa Neff
 * Submission Date:  10/22/2021
 *
 * Purpose: The purpose of the program is to calculate values of x and y,
 * from the user inputs for xmin, N, and increment. After calculating these
 * values, the program will print a list of the values and also graph the
 * values using *s.
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
		/* The number of x values to process input by the user must
		 * be greater than 0. Otherwise, the program prints an error message:
		 */
		if(N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		int xmin = keyboard.nextInt();
		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();
		/* The increment input by the user must be greater than zero.
		 * Otherwise, the program prints an error message:
		 */
		if(increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		keyboard.close();
		/* The following section of code calculates and prints
		 * the values of x and y:
		 */
		System.out.println("\nValues");
		double[] xValues = new double[N];
		double[] yValues = new double[N];
		xValues[0] = xmin;
		yValues[0] = 20.0 * Math.abs(Math.sin(xValues[0]));
		for(int i = 1; i < N; i++) {
			xValues[i] = xValues[i-1] + increment;
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
			System.out.printf("x: %.3f, y: %.3f\n", xValues[i], yValues[i]);
		}
		/* The following section of code prints a graph of *s corresponding to
		 * the calculated values of x and y:
		 */
		System.out.println("\nGraph");
		for(int i=0; i<N; i++) {
			System.out.print(":");
			for(int j=0; j<Math.floor(yValues[i]); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		

	}

}
