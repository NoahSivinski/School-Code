/*
 * StarGraph.java
 * Author:  Evan McKinney
 * Submission Date:  10/21/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 *	The program creates a set of x values and y values based of the function
 *	y = 20 * abs(sin x). The number of x values is given by the user. The 
 *	user also gives the minimum x and the increment for each x. For example,
 *	if the user gives a minimum x of 0 and an increment of 1 for 10 x values,
 *	the x values will be the whole numbers 0 to 9. The program then calculates
 *	each y values from the equation and prints it out. It also prints out a
 *	graph, where each line is an x value and the number of stars is the rounded
 *	down y value.
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
		int length;
		double xMin, xIncrement;
		
		//input for num of x values
		System.out.print("Please enter the number of x values to process: ");
		length = keyboard.nextInt();
		if(length <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		//input for minimum x
		System.out.print("Enter a minumum value for x: ");
		xMin = keyboard.nextDouble();
		
		//input for x increment
		System.out.print("Enter the amount to increment x: ");
		xIncrement = keyboard.nextDouble();
		if(xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//creates x and y arrays both the length of the num of x values the user wants
		double[] x = new double[length];
		double[] y = new double[length];
		
		//fills x and y arrays
		for(int i = 0; i < length; i++) {
			x[i] = xMin + xIncrement * i;
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
		}
			
		//output values
		System.out.println();
		System.out.println("Values");
		for(int i = 0; i < length; i++) {
			System.out.printf("x: %.3f, ", x[i]);
			System.out.printf("y: %.3f ", y[i]);
			System.out.println();
		}
		
		//output graph, prints x number of lines and y number of stars on each line
		System.out.println();
		System.out.println("Graph");
		for(int i = 0; i < length; i++) {
			System.out.print(":");
			for(int j = 0; j < (int) y[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		keyboard.close();
	}
}
