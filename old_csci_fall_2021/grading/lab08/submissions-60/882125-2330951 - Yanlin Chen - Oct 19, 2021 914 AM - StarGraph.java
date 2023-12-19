/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [10/22/2021]
 *
 * Purpose: By entering the total number of x, x starting number, and x's increment, calculate
 *  the y values corresponding to the x values. After we have all the data sets, the graph 
 *  shows up.
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
		int arrayLength;
		double xInital;
		double xIncrement;
		double[] xValue;
		double[] yValue;

		//total number of x (length)
		System.out.print("Please enter the number of x values to process: ");
		arrayLength = keyboard.nextInt();
		if (arrayLength <= 1) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		//initial x and y array
		xValue = new double[arrayLength]; 
		yValue = new double[arrayLength];

		//minimum value of x
		System.out.print("Enter a minimum value for x: ");
		xInital = keyboard.nextDouble();

		//increment of x
		System.out.print("Enter the amount to increment x: ");
		xIncrement = keyboard.nextDouble();
		double xCurrentIncrement = 0;
		if (xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		//fill in xValue and get yValue output
		System.out.println();
		System.out.println("Values");
		for (int index = 0; index < arrayLength; index++) {
			xValue[index] = xInital + xCurrentIncrement;
			xCurrentIncrement = xIncrement * (index + 1);
			yValue[index] = 20.0 * Math.abs(Math.sin(xValue[index]));
			System.out.printf("x: %.3f" , xValue[index]);
			System.out.printf(", y: %.3f" , yValue[index]);
			System.out.println();
		}

		//graph
		System.out.println("\nGraph");
		for (int x = arrayLength; x > 0; x--) {
			System.out.print(":");
			double yIndexValue = yValue[arrayLength-x];
			//get the integer of the yValue
			int yIntValue = (int)yIndexValue;
			while (yIntValue > 0) {
				System.out.print("*");
				yIntValue--;
			}
			System.out.println();
		}

		keyboard.close();

	}

}
