/*
 * StarGraph.java
 * Author: Jarvis Williams
 * Submission Date:  3/26/2021
 *
 * Purpose: The purpose of this program is to form a graph based
 * off of a sin function given user increment, number of x values,
 * and minimunm x values.
 * * Statement of Academic Honesty:
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
import java.util.Scanner; //initializing Scanner

public class StarGraph {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		//intiailizing i for for loop
		int i;
		
		//prompt user for x values input
		System.out.print("Please enter the number of x values to process: ");
		int numberOfXValues = keyboard.nextInt();
		//if user enters value less than or equal to 0, program ends
		if (numberOfXValues <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double minimumXValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();
		//if user enters value less than or equal to 0, program ends
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		//equation to get computed x and y values
		double yValuesComputed = (20.0 * (Math.abs(Math.sin(minimumXValue))));
		double xValuesComputed = (minimumXValue);
		//creating array to hold x and y values
		double[] yValues = new double[100];
		double[] xValues = new double[100];
		
		System.out.println(); //Space for output
		System.out.println("Values");
		System.out.printf("x: %.3f", xValuesComputed); 
		System.out.printf(", y: %.3f\n", yValuesComputed);

		//giving value to xvalues and yvalues array
		xValues[0] = xValuesComputed;
		yValues[0] = yValuesComputed;
		//loop for calculating x and y values per iteration
		for (i = 1; i < numberOfXValues; i++) {
			xValuesComputed = (xValuesComputed + increment);
			yValuesComputed = (20.0 * (Math.abs(Math.sin(xValuesComputed))));
			
			//if the number is less that 0.000 but greater than 0.0001, value will be 0 (no -0.000 output)
			if ((xValuesComputed > -0.0001) && (xValuesComputed < -0)) {
				xValuesComputed = 0.00;
			}
			//output for x and y values
			System.out.printf("x: %.3f", xValuesComputed);
			System.out.printf(", y: %.3f", yValuesComputed);
			
			//assign array value an x and y value
			xValues[i] = xValuesComputed;
			yValues[i] = yValuesComputed;

			System.out.println(); //Space for output
		}

		System.out.println(); //Space for output
		System.out.println("Graph");

		//for loop to create graph
		for (i = 0; i < numberOfXValues; i++) {
			System.out.print(":");
			for (int j = 0; j < (int) yValues[0 + i]; j++) {
				System.out.print("*");
			}
			System.out.println(); //Space for output
		}
		System.out.println();
		keyboard.close();
	}

}