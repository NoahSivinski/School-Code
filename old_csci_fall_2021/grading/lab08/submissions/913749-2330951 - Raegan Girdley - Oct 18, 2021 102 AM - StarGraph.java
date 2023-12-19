/*
 * StarGraph.java
 * Author:  Raegan Girdley 
 * Submission Date:  10/18/2021
 *
 * Purpose: Prints values based on user input and creates representational graph.
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
		
		//makes variables
		double[] xValues, yValues;
		double x, increment, y;
		int arrayLength;
		Scanner keyboard = new Scanner(System.in);
		
		//prompts user for variables
		System.out.print("Please enter the number of x values to process: ");
		arrayLength = keyboard.nextInt();
		xValues = new double[arrayLength];
		yValues = new double[arrayLength];
		
		//valid array length
		if (xValues.length > 0) {
			
			//asks for x and increment
			System.out.print("Enter a minimum value for x: ");
			x = keyboard.nextDouble();
			
			System.out.print("Enter the amount to increment x: ");
			increment = keyboard.nextDouble();
			
			//valid increment value
			if (increment > 0) {
				
				//values
				System.out.println("\nValues");
				for (int i = 0; i < xValues.length; i++) {
					
					y = 20.0 * Math.abs(Math.sin(x));
					
					System.out.print("x: ");
					System.out.printf("%5.3f", x);
					System.out.print(", y: ");
					System.out.printf("%5.3f", y);
					
					System.out.println();
					
					xValues[i] = x;
					yValues[i] = y;
					x += increment;
				}
				
				//graph
				System.out.println("\nGraph");
				for (int i = 0; i < xValues.length; i++) {
					
					System.out.print(":");
					if (xValues[i] != 0) {
						for (int j = 1; j < yValues[i]; j++) {
							System.out.print("*");
						}
					}
						
					System.out.println();
					
				}
			}
			
			//invalid increment
			else {
				System.out.print("The increment must be a decimal number greater than 0.");
			}
		}
		
		//invalid array length
		else {
			System.out.print("The number of x values must be an integer greater than 0.");
		}
		
	}
}
