/*
 * StarGraph.java
 * Author:  Claire Fortenberry
 * Submission Date:  21 October 2021
 *
 * Purpose: This program receives user input for number of values, minimum value of x, 
 * and increment amount. The program will then use given 
 * equations to calculate and output appropriate values and 
 * a graphical representation of these values. 
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;
public class StarGraph {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user & receive input for array size (n)
		System.out.print("Please enter the number of x values to process: ");
		int n = input.nextInt();
		
		//Check for valid input
		if(n < 1) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		//Prompt user & receive input for minimum x value (xMin)
		System.out.print("Enter a minimum value for x: ");
		double xMin = input.nextDouble();
		
		//Prompt user & receive input for increment (xIncrement)
		System.out.print("Enter the amount to increment x: ");
		double xIncrement = input.nextDouble();
		
		//Check for valid input
		if (xIncrement % 1 == 0 || xIncrement < 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//Populate xArray and yArray
		double[] xArray = new double[n];
		xArray[0] = xMin;
		for (int i = 1; i < xArray.length; i++) {
			xArray[i] = xArray[i-1] + xIncrement;
		}
		
		double[] yArray = new double[n];
		for (int i = 0; i < yArray.length; i++) {
			yArray[i] = 20.0 * Math.abs(Math.sin(xArray[i]));
		}
		
		System.out.println();
		System.out.println("Values");
		
		//Print x and y values
		for (int i = 0; i < n; i++) {
			System.out.printf("x: %.3f", xArray[i]);
			System.out.printf(", y: %.3f", yArray[i]);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Graph");
		
		//Print * graphical representation of values
		for (int i = 0; i < n; i++) {
			System.out.print(":");
			
			for(int j = 0; j < Math.floor(yArray[i]); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		input.close();
	}

}
