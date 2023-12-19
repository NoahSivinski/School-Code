/*
 * StarGraph.java
 * Author:  Brandon Ho
 * Submission Date: Oct 21 2021
 *
 * Purpose: Calculates the x and y values of a star graph, then graphs it
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

		//prompts user to enter numver of x values, increment value, and min value of x
		System.out.print("Please enter the number of x values to process: ");
		int xAmount = keyboard.nextInt();
		if (xAmount <= 0) {
			System.out.println("The number of x values must be an integer greater than 0");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double minValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double incrementValue = keyboard.nextDouble();
		if (incrementValue <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		// creates array for x values and adds values of x in
		double[] xValue = new double[xAmount];
		for(int i = 0 ; i < xAmount ; i++) {
			xValue[i] = minValue + (incrementValue * i);
		}

		// creates array for y values and calculate each value for y
		double[] yValue = new double[xAmount];
		for(int i = 0 ; i < xAmount ; i++) {
			yValue[i] = 20 * (Math.abs(Math.sin(xValue[i])));
		}

		//prints out x and y values
		System.out.println();
		System.out.println("Values");
		for(int i = 0 ; i < xAmount ; i++) {
			System.out.print("x: ");
			System.out.printf("%.3f", xValue[i]);
			System.out.print(", ");
			System.out.print("y: ");
			System.out.printf("%.3f", yValue[i]);
			System.out.println();
		}

		//prints out a graph of *'s with the x and y values
		System.out.println();
		System.out.println("Graph");
		for(int i = 0 ; i < xAmount ; i++) {
			System.out.print(":");
			for(int j = (int) yValue[i] ; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		keyboard.close();

	}

}
