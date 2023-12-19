/*
 * CSCI 1301.java
 * Author:  Brooks Ruehle
 * Submission Date:  October 22, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The purpose of this program is to compute values for x and y
 * on a graph using input from the user, print these values, then
 * display a graph of the function indicating the value of y by
 * how many '*'s are on the line.
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
		System.out.print("Please enter the number of x values to process: ");
		int values = keyboard.nextInt();
		if (values <= 0) {
			System.out.print("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double min = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();
		if (increment <= 0) {
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double[] xValues = new double[values];
		for (int i = 0; i < values; i++) {
			xValues[i] = min + (increment * i);
		}
	
		double[] yValues = new double[values];
		for (int i = 0; i < values; i++) {
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
		}
		
		System.out.println("\nValues");
		for (int i = 0; i < values; i++) {
			System.out.printf("x: %.3f, y: %.3f\n", xValues[i], yValues[i]);
			
		}
		
		System.out.print("\n" + "Graph");
		for (int i = 0; i < values; i++) {
			System.out.print("\n:");
			for (int j = 0; j < (int) yValues[i]; j++) {
				System.out.print("*");
			}
		}
	}

}
