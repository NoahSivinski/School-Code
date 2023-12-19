/*
 *  StarGraph.java
 * Author:  Malinda Uboh
 * Submission Date: 10/20/2021
 *
 * Purpose: This program collects user input and 
 * then displays a user chosen number of rows 
 * of x and y values. In order to compute the x values
 * this program adds the user inputed incrementation 
 * value to the user inputed minimum value a user selected number of times.
 * In order to compute y the program uses a given function.
 * After the x and y values are computed the program 
 * prints out a graphical representation of both 
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

public class StarGraph {

	public static void main(String[] args) {

		int sizeN;
		double xMin, xIncrement;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		sizeN = keyboard.nextInt();

		if (sizeN <= 0) {// Restrict user input of sizeN to values greater than zero
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		xIncrement = keyboard.nextDouble();
		if (xIncrement <= 0) {// Restrict user input of xIncrement to values greater than zero
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		
		double[] xValues = new double[sizeN];//Declare double array and allocate space for x-values 
		double[] yValues = new double[sizeN];//Declare double array and allocate space for y-values 

		double y = 20.0 * Math.abs(Math.sin(xMin)); //Compute value of y using given equation

		xValues[0] = xMin;//Set first x value in the array equal to the xMin entered by the user 
		yValues[0] = y;//Set first y value in the array equal to the first computed y
		System.out.println();
		System.out.println("Values");
		System.out.printf("x: %.3f, ", xMin);
		System.out.printf("y: %.3f\n", y);
		for (int index = 1; index < sizeN; index++) { //Set for loop to increment through entire array 
			xMin = xMin + xIncrement; //Add xIncrement value to xMin each time the loop iterates 
			xValues[index] = xMin; //As the loop increments through the values of the array, initialize each value to the new xMin value

			y = 20.0 * Math.abs(Math.sin(xMin));

			yValues[index] = y;// Initialize each value in the array to the newly  computed value of y

			System.out.printf("x: %.3f, ", xMin);//restrict x values to three decimal places 
			System.out.printf("y: %.3f\n", y);//restrict y-values to three decimal places 

		}
		System.out.println();
		

		System.out.printf("Graph\n");

		for (int i = 0; i < sizeN; i++) {//print out a new line for each successive x value 
			System.out.print(":");
			for (int j = 0; j < Math.floor(yValues[i]); j++) {//Truncate y-value and and print truncated number of asterisks onto each row
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
