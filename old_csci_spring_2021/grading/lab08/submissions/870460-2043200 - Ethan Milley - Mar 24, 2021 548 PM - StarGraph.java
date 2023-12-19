/*
 * StarGraph.java
 * Author:  Ethan Milley 
 * Submission Date:  3/24/21
 *
 * Purpose: The purpose of this program is to calculate and print
 * a set of y values using the formula y = 20.0 * |sin(x)|
 * where the minimum value of x and the amount it increases by is
 * determined by the user as well as, the size of the set. It also
 * creates a graph based on the y values using *. However, this program
 * is limited to only one formula.
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
		
		int size; //Size of the array
		System.out.print("Please enter the number of x values to process: ");
		size = keyboard.nextInt();
		
		if (size <= 0) {
			System.out.println("The number of x values must be an interger greater than 0");
			keyboard.close();
			System.exit(0);
		}
		
		double xMin; //Minimum value of x
		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();
		
		double increment;//The amount the x increases by
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		
		if (increment <= 0) {
			System.out.println("The increment must be an decimal number greater than 0");
			keyboard.close();
			System.exit(0);
		}
		
		double[] xValue = new double[size];
		double[] yValue = new double[size];//The arrays for x and y
		xValue[0] = xMin;
		
		for (int i = 1; i < size; i++) {//Populates x values 
			xValue[i] = xValue[i-1] + increment;
		}
		
		for (int i = 0; i < size; i++) {//Populates y values
			yValue[i] = 20.0 * (Math.abs(Math.sin(xValue[i])));
		}
		
		System.out.println("\nValues");
		
		for (int i = 0; i < size; i++) {
			System.out.printf("x: %1.3f, y: %1.3f", xValue[i], yValue[i]);
			System.out.println();
		}
		
		System.out.println("\nGraph");
		
		for (int i = 0; i < size; i++) {
			System.out.print(":");
			for(int n = 1; n < yValue[i]; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}

}
