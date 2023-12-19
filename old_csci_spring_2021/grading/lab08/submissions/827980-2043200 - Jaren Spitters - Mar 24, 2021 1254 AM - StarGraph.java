/*
 * StarGraph.java
 * Author:  Jaren Spitters 
 * Submission Date:  3/24/21
 *
 * Purpose: This program prompts the user for a set number of x values to calculate, the minimum x value the user wants to be included 
 * in the calculations, and the increments by which the x values should be increased. Then, it computes the rest of the x values, 
 * computes the y values as a result of the function y = 20sin(x), displays the x and y values, and displays a graph of the values 
 * with asterisks.
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
		int arraySize = keyboard.nextInt();
		
		if (arraySize <= 0) {
			
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double xMinimum = keyboard.nextDouble();
		
		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();
		
		if (increment <= 0) {
			
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double[] xValue = new double[arraySize];
		double[] yValue = new double[arraySize];
		
		for (int i = 1; i  <= arraySize; ++i) {
			
			xValue[i-1] = (i - 1) * increment + xMinimum;
		}
		
		for (int i = 1; i <= arraySize; ++i) {
			
			yValue[i-1] = 20 * Math.abs(Math.sin(xValue[i-1]));
		}
		
		System.out.println("\nValues");
		
		for (int i = 1; i <= arraySize; ++i) {
			
			System.out.printf("x: " + "%.3f", xValue[i-1]);
			System.out.printf(", ");
			System.out.printf("y: " + "%.3f", yValue[i-1]);
			System.out.printf("\n");
		}
		
		int [] yValueTruncated = new int[arraySize];
		
		for (int i = 1; i <= arraySize; ++i) {
			
			yValueTruncated[i-1] = (int) yValue[i-1];
		}
		
		System.out.println("\nGraph");
		
		
		for (int i = 1; i <= arraySize; ++i) {
			
			System.out.print(":");
			
			for (int x = 1; x <= yValueTruncated[i-1]; ++x){
				
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		
		
		keyboard.close();
	}

}
