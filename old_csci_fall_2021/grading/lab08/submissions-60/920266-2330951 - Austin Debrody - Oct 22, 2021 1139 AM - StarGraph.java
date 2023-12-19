/*
 * StarGraph.java
 * Author:  Austin Debrody
 * Submission Date:  10/22/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This class uses user's input of different values to determine 
 * the different x and y values of the function y = 20|sinx|. The
 * method then prints out a graph of the function using asterisks 
 * in horizontal rows. The values of the function, in both the x 
 * and y direction are also stored in two separate variables.
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
		Scanner scan = new Scanner(System.in); // create new scanner object
		
		// declare necessary variables
		int N;
		double minValue;
		double increment;
		
		// get user input for length of arrays
		System.out.print("Please enter the number of x values to process: ");
		N = scan.nextInt();
		
		// determine if the length inputed is valid
		if(N < 1) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		// get user input for the starting value of x
		System.out.print("Enter a minimum value for x: ");
		minValue = scan.nextDouble();
		
		// get user input for increment value of x
		System.out.print("Enter the amount to increment x: ");
		increment = scan.nextDouble();
		
		// determine if the increment value is valid
		if(increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);	
		}
		
		// creates new array for the x values
		double[] xVals = new double[N];
		xVals[0] = minValue;
		// loops through array to assign a value for each x
		for(int i = 1; i < N; i++) {
			xVals[i] = xVals[i-1] + increment;
		}
		
		// creates new array for y values
		double[] yVals = new double[N];
		// loops through array to assign a value for each y using the formula provided
		for(int i = 0; i < N; i++) {
			yVals[i] = 20 * Math.abs(Math.sin(xVals[i]));
		}
		
		
		System.out.println();
		System.out.println("Values");
		
		// prints out the values of each x and y coordinate set
		for(int i = 0; i < N; i++) {
			System.out.print("x: ");
			System.out.printf("%.3f", xVals[i]);
			System.out.print(", y: "); 
			System.out.printf("%.3f", yVals[i]);
			System.out.println();
		}
		
		// typecast y values to integers
		int [] newYVals = new int[N];
		for(int i = 0; i < N; i ++) {
			newYVals[i] = (int) yVals[i];
		}
		
		System.out.println();
		
		// prints out the graph of the function using the values of y to determine the number of asterisks
		System.out.println("Graph");
		for(int i = 0; i < N; i ++) {
			System.out.print(":");
			for(int j = 0; j < newYVals[i]; j ++) {	
				System.out.print("*");;
			}
			System.out.println(); // creates a new line
		}

	}

}
