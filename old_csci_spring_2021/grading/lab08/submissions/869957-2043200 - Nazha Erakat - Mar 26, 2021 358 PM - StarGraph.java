/*
 * StarGraph.java
 * Author:  Nazha Erakat 
 * Submission Date: 3/26/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program prompts the user to enter a number of x-values, a minimum value for x, and how much they want to increment the x values by. 
 * The program prints out x-values and y-values and also prints out a star graph as a visual of the coordinates. 
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

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the number of x values to process: ");
		int xValues = keyboard.nextInt();
		int yValues = xValues;
		if (xValues <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double minValueForX = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		double incrementX = keyboard.nextDouble();
		if (incrementX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println();
		System.out.print("Values\n");
		double[] x = new double[xValues];
		double[] y = new double[yValues];
		double xCoordinate = minValueForX;
		double yCoordinate = (20.0 * Math.abs(Math.sin(xCoordinate)));
		x[0] = xCoordinate;
		y[0] = ((int) yCoordinate);
		System.out.printf("x: %1.3f, y: %1.3f", xCoordinate, yCoordinate);
		for (int i = 1; i < xValues; i++) {
			System.out.println();
			if (xCoordinate < 0 && xCoordinate > -0.001) {
				xCoordinate = (Math.round(xCoordinate * 10000.0)) / 10000.0;
				xCoordinate = xCoordinate + incrementX;
				yCoordinate = (20.0 * Math.abs(Math.sin(xCoordinate)));
				{
					System.out.printf("x: %1.3f, y: %1.3f", xCoordinate, yCoordinate);
				}
			} else {
				xCoordinate = xCoordinate + incrementX;
				yCoordinate = (20.0 * Math.abs(Math.sin(xCoordinate)));
				{
					System.out.printf("x: %1.3f, y: %1.3f", xCoordinate, yCoordinate);
				}
			}

			x[i] = xCoordinate;
			y[i] = ((int) yCoordinate);
		}
		System.out.println();
		System.out.println();
		System.out.println("Graph");

		for (int i = 0; i < xValues; i++) {
			System.out.print(":");

			for (int j = 0; j < y[i]; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		keyboard.close();
	}
}
