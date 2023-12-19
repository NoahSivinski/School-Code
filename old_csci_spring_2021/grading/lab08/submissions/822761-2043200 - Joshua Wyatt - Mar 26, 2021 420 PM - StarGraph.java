import java.util.Scanner;

/*
 * StarGraph.java
 * Author:  Joshua Wyatt
 * Submission Date:3/26/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program takes an input from a user and writes the coordinates from the x value and the
 * increment that the user inputed. After this is inputed it takes those coordinates and prints them
 * into lines of asterick symbols based on what the user wants to input. The coordinates are listed as 
 * x and y values directly above the output of the lines.
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

public class StarGraph {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
//		declarations 
		
		int numberOfXvalues;
		int numberOfYvalues;
		double minX;
		double incX;
		double maxX;
		double xValue;
		double yValue;

//		first input needed from user with an error statement forcing them to input
//		an integer greater than 0
		
		System.out.print("Please enter the number of x values to process: ");
		numberOfXvalues = keyboard.nextInt();
		numberOfYvalues = numberOfXvalues;
		if (numberOfXvalues <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);}
		
//		more declarations for the minimum value of x
		
		double[] x = new double[numberOfXvalues];
		double[] y = new double[numberOfYvalues];

		System.out.print("Enter a minimum value for x: ");
		minX = keyboard.nextDouble();
		
//		incrementation is now listed and inputed by user including its
//		corresponding error statement that it must be greater than 0
		
		System.out.print("Enter the amount to increment x: ");
		incX = keyboard.nextDouble();
		if (incX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

//		the root and large bit of code with the math.sin and math.abs in addition
//		to sin being used in order to get the main string of values
		for (int i = 0; i < numberOfXvalues; i++) {

			xValue = minX + i * incX;
			yValue = 20.0 * Math.abs(Math.sin(xValue));

			x[i] = xValue;
			y[i] = yValue;
		}
//		values printed
		
		System.out.println();
		System.out.println("Values");
		for (int i = 0; i < numberOfXvalues; i++) {
			
			String xi = String.format( "%.3f", x[i] );
			String yi = String.format( "%.3f", y[i] );


			System.out.println("x: " + xi + ", " + "y: " + yi);
		}
		System.out.println();
		System.out.println("Graph ");
		
//		code for astericks now implemented
		
		int numberOfStars;
		for (int i = 0; i < numberOfXvalues; i++) {
			numberOfStars = (int) y[i];
			System.out.print(":");
			for (int j = 1; j<=numberOfStars; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}



}

