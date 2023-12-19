
/*
 * StarGraph.java
 * Author: Chloe Hangartner
 * Submission Date: 3/24/2021
 *
 * Purpose: This program uses two arrays
 * of type double to store multiple values
 * for x and y.  The program prints both the
 * values of x and y once found as well as
 * a graphical representation of the function
 * using a sequence of asterisks to indicate
 * the magnitude of y.
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

		// Declare Variables and Create Keyboard Object
		int sizeOfArrays;
		double minimumValueOfX, incrementValue;
		Scanner keyboard = new Scanner(System.in);

		//Prompt User Input
		System.out.print("Please enter the number of x values to process: ");
		sizeOfArrays = keyboard.nextInt();

		//Print Error Message if Size of Arrays is Entered as Zero or Negative
		if (sizeOfArrays <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		// Prompt User for Minimum X Value
		System.out.print("Enter a minimum value for x: ");
		minimumValueOfX = keyboard.nextDouble();
		minimumValueOfX = (((minimumValueOfX * 1000))/1000.00);


		// Prompt User for Increment
		System.out.print("Enter the amount to increment x: ");
		incrementValue = keyboard.nextDouble();
		if (incrementValue <= 0) { 
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}


		//Create Arrays to Set Up X and Y Values to Be Printed
		System.out.println("\nValues");


		//Create Double Array for X Values
		double[] xArray = new double [sizeOfArrays]; 

		for (int i = 0; i < sizeOfArrays; i++) {
			xArray[i] = (minimumValueOfX + (incrementValue * i));
		}


		//Create Double Array for Y Values
		double[] yArray = new double [sizeOfArrays];

		for (int i = 0; i < sizeOfArrays; i++) {
			yArray[i] = (20.0 * (Math.abs(Math.sin(xArray[i]))));
			yArray[i] = (((yArray[i] * 1000))/1000.00);
		}


		// For Loop to Print Values
		for (int i = 0; i < sizeOfArrays; i++) {
			System.out.print("x: ");
			System.out.printf("%.3f", xArray[i]);
			System.out.print(",");
			System.out.print(" y: ");
			System.out.printf("%.3f", yArray[i]);
			System.out.println("");
		}

		// Prepare to Print Graph
		System.out.println("\nGraph");

		// Create Value for Y Graph
		int[] yGraphArray = new int [sizeOfArrays]; 

		for (int i = 0; i < sizeOfArrays; i++) {
			yGraphArray[i] = (int) (yArray[i]);
		}


		// Print Graph
		for (int i = 0; i < sizeOfArrays; i++) {
			System.out.print(":");

			for (int j = 0; j < yGraphArray[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		keyboard.close();
	}
}



