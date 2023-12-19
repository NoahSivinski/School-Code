/*
 * StarGraph.java
 * Author:  Justin Jackson 
 * Submission Date:  3/24/2021
 *
 * Purpose: Calculates values based on user input, then graphs it to show the change over the incremented time.
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
		
		double incrementX = 0;
		double minX = 0;
		int countX = 0;
		double yTemp = 0;
		int finalLines = 0;
		int stars = 0;
		
		Scanner keyboard =  new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		countX = keyboard.nextInt();
		if (!(countX > 0)) {
			System.out.print("The number of x values must be greater than 0");
			System.exit(0);
		}
		double[] xValues = new double[countX];
		double[] yValues = new double[countX];
		System.out.print("Enter a minimum value for x: ");
		minX = keyboard.nextDouble();
		System.out.print("Enter the amount to incrememnt x: ");
		incrementX = keyboard.nextDouble();
		if (!(incrementX > 0)) {
			System.out.print("The increment must be a decimal number greater than 0");
			System.exit(0);
		}
		
		for (int index = 0; index < countX; index++) {
			yTemp = 20.0 * Math.abs(Math.sin(minX));
			xValues[index] = minX;
			yValues[index] = yTemp;
			minX = minX + incrementX;
			System.out.println("x: " + String.format("%.3f", xValues[index]) + ", y: " + String.format("%.3f", yValues[index]));
			finalLines++;
		}
		for (int lines = 0; lines < finalLines; lines++)
		{
			System.out.print(":");
			stars = (int)yValues[lines];
			//Typecasted the value to an int to truncate the decimals since I cannot use Math.floor or decimalFormat
			if (stars == 0) {
				System.out.println("");
			}
				while(stars > 0) 
				{
					System.out.print("*");
					stars--;
					if (stars == 0) {
						System.out.println("");
					}
				}
				//Not sure if these are the loop set ups the assignment was looking for, but it passes all the I/O in the document 
					
					
		}
		

	}

}
