/*
 * StarGraph.java
 * Author:  Brianna Tiglao 
 * Submission Date:  March 26, 2021
 *
 * Purpose: The purpose of this code is to take a certain number of x values and increment them
 * starting from the minimum value of x. These values are all indicated by the user. The program
 * will then calculate the y values by taking the absolute value of the sine of x. These values 
 * will be printed along with a graph.
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

		int numOfX; //number of x values
		double xMinValue; //lowest x value
		int i; //initializer
		double increment; // how much the x value is increased

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the number of x values to process: ");
		numOfX = input.nextInt();
		input.nextLine();

		if (numOfX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		xMinValue = input.nextDouble();
		input.nextLine();

		System.out.print("Enter the amount to increment: ");
		increment = input.nextDouble();
		input.nextLine();

		input.close();
		
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);

		}

		double [] xValueStored = new double [numOfX]; //array for x values
		double [] yValueStored = new double [numOfX]; //array for y values

		System.out.println("Values");

		for (i = 0; i < numOfX ; i++) { //for as many x values there are, the x value array will store each x value, starting from the min and add the user's increment input within each index

			xValueStored[i] = xMinValue + (increment * i);

		}

		for (i = 0; i < numOfX; i++) { //this loop does the same as the one above but instead stores the y values (which are calculated with the equation below)

			yValueStored[i] = 20.0 * Math.abs(Math.sin(xValueStored[i]));

			System.out.printf("x: %.3f, y: %.3f\n", xValueStored[i], yValueStored[i]);
		}

		System.out.println();
		System.out.print("Graph");
		for (i = 0; i < numOfX; i++) {

			System.out.print("\n:"); //amount of lines printed correlates to the number of x values the user had input 
			int yValueTruncate = (int)yValueStored[i];

			for (int n = 0; n < yValueTruncate; n++) {

				System.out.print("*"); //amount of stars printed correlates to the truncated y value
			}
		}
	}
}
