/*
 * [StarGraph].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [3/24/2021]
 *
 * Purpose: This program allows user to input a number of x values, minimum, and increment to display multiple values of x and y of a function using one dimensional arrays.
 * The program also prints out a graphical representation at the end. 
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
		
		double [] x;
		double [] y;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		int numOfX = input.nextInt();
		
		if (numOfX <= 0) {
			System.out.println("The number of x values must to be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double min = input.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double inc = input.nextDouble();
		
		if (inc <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		x = new double[numOfX];
		y = new double[numOfX];
		
		x[0] = min;
		y[0] = 20.0 * Math.abs(Math.sin(x[0]));
		
		System.out.println("\nValues");
		System.out.printf("x: %.3f, y:%.3f\n",x[0], y[0]);
		
		for (int i = 1; i < numOfX; i++) {
			x[i] = x[i - 1] + inc;
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			System.out.printf("x: %.3f, y:%.3f\n",x[i], y[i]);
		}
		
		System.out.println("\nGraph");
		
		for (int i = 0; i < numOfX; i++) {
			System.out.print(":");
			
			for (int j = 0; j < Math.floor(y[i]); j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}
