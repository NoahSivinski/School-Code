/*
 * StarGraph.java
 * Author:  Jacob Glover 
 * Submission Date:  3-24-21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program allows the user to
 * input the number of x values, a minimum value, and an increment of x
 * to be entered into a formula. The numbers are output through a loop that creates the new values
 * and prints a star graph.
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
	
		Scanner input = new Scanner(System.in);
		
		int numberOfXValues = 0; // initialization
		
		System.out.print("Please enter the number of x values to process: ");
		int xValue = input.nextInt();
		
		if (xValue <= 0) { // if the x value is less than or equal to 0, prompt error
			System.out.print("The number of x values must be an integer greater than 0."); 
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double xMin = input.nextDouble();
		
		System.out.print("Enter the amount to increment x: ");
		double xIncrement = input.nextDouble();
		
		if ((xIncrement <= 0 ) || (xIncrement % 1 == 0)) { // prompt error if increment is less than 0 or not a decimal
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		numberOfXValues = xValue;

		double[]xValues = new double[numberOfXValues]; // creating the x value array
		xValues[0] = xMin;
		
		double [] yValues = new double [numberOfXValues]; // creating the y value array
		
		for (int i = 0; i < xValues.length; i++) {  // creates the loop that runs for all of the values in x array
			if (i == 0) {
				
			} else {
				xValues[i] += xValues[i-1] + xIncrement; // adds the increment to the x values in the array
			}
			System.out.printf("x: %.3f" , xValues[i]); // prints with 3 decimal places
			yValues[i] = 20 * (Math.abs((Math.sin(xValues[i])))); // the formula for determining each y value
			System.out.printf(", y: %.3f" , yValues[i]);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Graph: ");
		
		for (int i = 0; i < xValues.length; i++) { // loop that begins the printing of the graph
			if (i != 0) {
			System.out.println();
			}
			System.out.print(":");
				for (int y = 0; y < yValues[i]; y++) { // loop that prints stars for each y value
					yValues[i] = (int) yValues[i];
					if (yValues[i] >= 1) {
						System.out.print("*");
					}
					}
			} 
		input.close();
	}

}
