/*
 * StarGraph.java
 * Author:  Tenacity Murdie 
 * Submission Date:  10-19-2021
 *
 * Purpose: Given user input for array size, a minimum value for x, and an increment value for x
 * the values for arrays holding variables x and y are computed. A graph is then made using these values.
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
		double x;
		int N; //size of arrays
		double increment; //value by which x increases
		Scanner keyboard = new Scanner(System.in);
		
		//getting user input for array size and checking for valid input
		System.out.print("Please enter the number of x values to process: ");
		N = keyboard.nextInt();
		if (N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		//declaring arrays with user input for array size
		double[] xValue = new double[N];
		double[] yValue = new double[N];
		
		//getting user input for x minimum value
		System.out.print("Enter a minimum value for x: ");
		x = keyboard.nextDouble();
		
		//getting user input for increment value and checking for valid input
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		xValue[0] = x; //assigning the minimum x value
		//initializing rest of xValue array using increment value
		for (int i = 1; i < N; i++) {
			xValue[i] = xValue[i-1] + increment;
		}
		
		//initializing yValue array
		for (int i = 0; i < N; i++) {
			yValue[i] = 20.0*Math.abs(Math.sin(xValue[i])); //assuming angles for sin function are in radians
		}
		System.out.println();
		
		//printing out values of x and y
		System.out.println("Values");
		for(int i = 0; i < N; i++) {
			System.out.printf("x: " + "%1.3f", xValue[i]);
			System.out.printf(", y: " + "%1.3f", yValue[i]);
			System.out.println();
			
		}
		System.out.println();
		
		//printing out graph using x and y values (and truncating y to be whole number)
		System.out.println("Graph");
		for(int i = 0; i < N; i++) {
			System.out.print(":");
			for(int j = 0; j < (int) yValue[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		keyboard.close(); //optional closing of keyboard

	}

}
