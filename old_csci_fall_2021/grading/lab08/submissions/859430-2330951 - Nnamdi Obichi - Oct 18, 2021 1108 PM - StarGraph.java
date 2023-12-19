/*
 * StarGraph.java
 * Author: Nnamdi Obichi
 * Submission Date: October 18th, 2021
 *
 * Purpose: 
 * This program creates an array of x-values and y-values. The
 * program asks the user for the number of values in both arrays,
 * the minimum value of x, and how the x-values will increment 
 * (linearly) until there are the maximum number of values in the
 * array. The program then prints out the x-values and their 
 * corresponding y-values. The program then prints a graph of 
 * the x and y values.
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
import java.lang.Math;

public class StarGraph {

	public static void main(String[] args) {
		Scanner keyBo = new Scanner(System.in);
		
		// Prompts user for the number of indices of x desired in the array and stores it as an integer
		System.out.print("Please enter the number of x values to process: ");
		int indicesX = keyBo.nextInt();
		keyBo.nextLine();
		
		// If the number of indices in x is less than or equal to 0, the program terminates
		if (indicesX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		// Prompts the user for the minimum value of x and stores it as a double 
		System.out.print("Enter a minimum value for x: ");
		double minimumX = keyBo.nextDouble();
		keyBo.nextLine();
		
		// Prompts the user for how of values of x will increment (at a linear rate)  
		System.out.print("Enter the amount to increment x: ");
		double increaseX = keyBo.nextDouble();
		keyBo.nextLine();
		
		// If x increments at a rate less than or equal to 0, the program terminates
		if (increaseX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		// Creates two arrays (arrayX and arrayY) that are indicesX in length
		double[] arrayX = new double[indicesX];
		double[] arrayY = new double[indicesX];
		
		// Initializes the first index of arrayX as the minimum value (minimumX)
		arrayX[0] = minimumX;
		
		/* Initializes the remaining values in arrayX (each incrementing from the last by adding 
		 * increaseX to the last index). Repeats indicesX - 1 times
		 */
		for(int i = 1; i < indicesX; ++i) {
			arrayX[i] = arrayX[i-1] + increaseX;
			
			/* If the absolute value of index i in the array minus 0.0 is less than 0.0005
			 * (the epsilon value), that index equals 0.0. Done to prevent a negative zero  
			 * (-0.0) from being printed out in certain cases.
			 */
			if (Math.abs(arrayX[i] - 0.0) < 0.0005) {
				arrayX[i] = 0.0;
			}
				
		}
		
		
		/* Initializes the values in arrayY based on arrayX. The value of arrayY's index is determined
		 * by y = 20.0 * |sinx|. Repeats indicesX times. 
		 */
		for(int i = 0; i < indicesX; ++i) {
			arrayY[i] = 20.0 * Math.abs(Math.sin(arrayX[i])); 
		}
		
		System.out.println("\nValues");
		
		// Prints out the values in arrayX and arrayY formatted to have 3 decimal places
		for(int i = 0; i < indicesX; ++i) {
			
			System.out.printf("x: %.3f", arrayX[i]);
			System.out.printf(", y: %.3f", arrayY[i]);
			System.out.println();
			
		}
		
		System.out.println("\nGraph");
		
		/* Prints out a graph of x and y values. The colons (:) when printed out represents 
		 * the values of x incrementing up by the constant increment value in increaseX. 
		 * The number of stars (*) represent the truncated decimal y-value that corresponds
		 * with its index of x.
		 */
		for(int i = 0; i < indicesX; ++i) {
			
			int starNum = (int)arrayY[i];
			String stars = "";
			
			for(int k = 0; k < starNum; ++k) {
				stars += "*";
			}
				
			System.out.println(":" + stars);
		}
		
		keyBo.close();
	}

}
