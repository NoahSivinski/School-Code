/*
 * StarGraph.java
 * Author:  Alice Szymkiewicz
 * Submission Date:  03/26/2021
 *
 * Purpose: 
 * This program takes the user's input of the number of x values to process, 
 * the minimum value for the x, and the amount to increment x, 
 * and then uees two arrays to store multiple values for x and y. 
 * y is a sin function. The x increment must be greater than 0. 
 * If it is, then the program uses arrays to increment the x to 
 * the amount to increment x to. The program prints the x, in the 
 * increments the user specified, and then the y values using the 
 * y = 20.0 * |sinx|. The program then prints out a graphical representation 
 * of the function using stars. The graph is printed also using the 
 * for loop based on the y values from the array.
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
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		int numValues = scan.nextInt();
		
		if (numValues > 0) {
			System.out.print("Enter a minimum value for x: ");
			double minX = scan.nextDouble();
			System.out.print("Enter the amount to increment x: ");
			double increment = scan.nextDouble();
			
			if (increment > 0) {
				double[] xValues = new double[numValues];
				double[] yValues = new double[numValues];
				xValues[0] = minX;
				double xVal = minX;
				
				for (int i = 1; i < numValues; i++) {
					xVal += increment;
					xValues[i] = xVal;

				}
				
				for (int k = 0; k < numValues; k++) {
					yValues[k] = (20.0 * (Math.abs(Math.sin(xValues[k]))));
				}
				
				System.out.println("\nValues");
				for (int j = 0; j < numValues; j++) {
					//had issues with printing -0.000, so the if statement corrects it
					if (Math.abs(xValues[j]) < 0.000001d) {
						xValues[j] = 0d;
					}
					System.out.printf("x: %.3f", xValues[j]);
					System.out.printf(", y: %.3f", yValues[j]);
					System.out.println();
				}
				
				System.out.println("\nGraph");
				for (int a = 0; a < numValues; a++) {
					System.out.print(":");
					int numAsterisks = (int) yValues[a];
					for (int b = 0; b < numAsterisks; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} 
			
			else {
				System.out.print("The increment must be a decimal number greater than 0.");
			}

		} 
		
		else {
			System.out.print("The number of x values must be an integer greater than 0.");
		}
		scan.close(); 
	
	}	
}