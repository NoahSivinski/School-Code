/*
 * [StarGraph].java
 * Author:  [Ethan Delamater] 
 * Submission Date:  [3/26/2021]
 *
 * Purpose: Graphs the user input in * and lists the coordinates
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
		
		System.out.print("Please enter the number of x values to process: ");   // gets the x value from the user
		int size = input.nextInt();
		input.nextLine();
		if (size <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");   // error message if the user inputs a size less than or equal to 0
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");   // gets the floor for the x from the user
		double min = input.nextDouble();  
		input.nextLine();
		
		System.out.print("Enter the amount to increment x: ");  // gets the increment of x from the user
		double increment = input.nextDouble();
		input.nextLine();
		if (increment <= 0.0) {
			System.out.println("The increment must be a decimal number greater than 0.");  // the error message if the input is less than or equal to 0
			System.exit(0);
		}
		System.out.println();
		
	
		double[] x = new double[size];	// setting up the array for the x axis
		x[0] = min;
		for (int i = 1; i < size; i++) {
			x[i] = x[i-1] + increment;
		}
		
		double[] y = new double[size];	// setting up the array for the y axis
		for (int i = 0; i < size; i++) {
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
		}
		
		
		System.out.println("Values");	// printing the values of the coordinates
		for (int i = 0; i < size; i++) {
			System.out.printf("x: %1.3f, y: %1.3f\n", x[i], y[i]);
		}
		System.out.println();
		
		System.out.println("Graph");	// printing the graph out of *
		for (int i = 0; i < size; i++) {
			System.out.print(":");
			for (int j = 0; j < (int)y[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
