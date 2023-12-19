/*
 * [StarGraph].java
 * Author:  [Stephanie Ibarra] 
 * Submission Date:  [03/26/2021]
 *
 * Purpose: This lab uses one-dimensional arrays
 * that use Java primitive data types as the base type
 * The user will use this to create a program using two arrays
 * to store multiple values for x and y, where y is defined by
 * y=20*|sinx|. The angles are measured in radians and the values 
 * for x and y will be computed based on input from the user. 
 * The program will also print out a graphical representaion of 
 * the function using a sequence of '*'s to 
 * indicate the magnitude of y.
 * 
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
		double[] x,y;
		Scanner keyboard = new Scanner(System.in);

		// asking user to input the length of array x
		System.out.print("Please enter the number of x values to process: ");
		int n = keyboard.nextInt();
		//checking if length is <= zero an exiting if it is
		if(n <= 0){
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(1);
		}

		// this portion will be executed only if the above condition is false
		System.out.print("Enter a minimum value for x: ");
		double min_val = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		double inc = keyboard.nextDouble();
		//checking if increment value is <= zero and exiting if it is
		if(inc <= 0){
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(1);
		}

		// creating two arrays of double type with length entered by user
		x = new double[n];
		y = new double[n];

		// initializing the 1st element of both the arrays
		x[0] = min_val;
		y[0] = 20.0 * Math.abs(Math.sin(x[0]));

		// calculating the angles and storing them in array y and also printing the values to the screen
		// It is done in the same loop 
		System.out.println("\nValues");

		// printf takes a formatted string
		// ".3f": 'f' means that it will be replaced by a double,
		// '.3' means that number of digits will be three after the decimal point
		System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);

		// 1st for loop
		for(int i = 1; i < n; i++){
			// incrementing the value of array x by user input
			x[i] = x[i-1] + inc;
			// calculating the angle and storing in array y
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			// printing the output to the screen
			System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
		}

		// printing the graph
		System.out.println("\nGraph");
		//2nd for loop
		// outer for loop will loop through the entire array y
		for (int i = 0; i < n ; i++) {
			System.out.print(":");
			//inner for loop will execute the whole-number part of array-y times
			// whole-number part is calculated by taking the floor of the floating point number
			for (int j = 0; j < Math.floor(y[i]); j++) {
				System.out.print("*");
			}
			System.out.println();

			keyboard.close();
		}
	}

}
