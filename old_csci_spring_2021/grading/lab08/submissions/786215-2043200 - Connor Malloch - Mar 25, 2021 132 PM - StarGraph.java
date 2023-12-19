/*
* StarGraph.java
* Author: Connor Malloch
* Submission Date: March 26 2021
*
* Purpose: The purpose of this program is to print out an x and y based on input from the user, and the function y=20.0 * |sinx| 
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
		int N = 0;
		double increment = 0;
		double minX = 0;
		Scanner keyBoard =  new Scanner(System.in);
		
		
		System.out.printf("Please enter the number of x values"
				+ " to process: "); 
		N = keyBoard.nextInt();
		if (N < 1) {
			System.out.print("The number of x values must be an"
					+ " integer greater than 0." );
			System.exit(0);
		} 
			
		System.out.printf("Enter a minimum value of x: "); 
		minX = keyBoard.nextDouble();
		
		System.out.printf("Enter the amount to increment x: "); 
		increment = keyBoard.nextDouble();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal greater "
					+ "than 0.");
			System.exit(0);
		} 
		
		double [] xValues = new double[N];
		double [] yValues = new double[N];
		System.out.println("\nValues");
		for (int index = 0; index < xValues.length ; index++) { 
			if (index == 0) {
				xValues[0] = minX;
				yValues[0] = 20 * Math.abs(Math.sin(minX)); 
			}
			if (index > 0) {
				xValues[index] = minX + (index * increment);
				yValues[index] = 20 * Math.abs(Math.sin(minX + (index * increment))); 
			}
			System.out.printf("x: %3.3f, y: %3.3f\n", xValues[index], yValues[index]);
			
		}
		System.out.println("Graph");
		for (int index = 0; index < xValues.length ; index++) { 
			System.out.print(":");
			int numOfAsterisk = 0;
			numOfAsterisk = (int) yValues[index];
			while (numOfAsterisk > 0) {
			System.out.print("*");
			numOfAsterisk = numOfAsterisk - 1;
			}
			System.out.print("\n");
		}
	}
}