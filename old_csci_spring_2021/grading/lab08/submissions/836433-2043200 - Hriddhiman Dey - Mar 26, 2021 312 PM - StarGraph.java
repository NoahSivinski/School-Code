/*
 * [StarGraph].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [3/26/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program uses one dimensional arrays to allow the user to input values 
 * for x and the increments of their choice and it stores multiple values for x and y.
 * The program also uses Math.abs and Math.sin to calculate the values for x and y.
 * After the values are stored and printed, a graph is also created using asterisk which
 * corresponds to an x value.
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

		//user input
		System.out.print("Please enter the number of x values to process: ");
		int userInput = keyboard.nextInt();

		//invalid input by user
		if(userInput <= 0) {
			System.err.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		//more user inputs
		System.out.print("Enter a minimum value for x: ");
		double xMin = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();

		if(increment <= 0) {
			System.err.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		//math
		double[] x = new double[userInput];
		double[] y = new double[userInput];

		x[0] = xMin;
		y[0] = 20 * Math.abs(Math.sin(x[0]));

		for(int i=1; i<userInput; i++) {
			x[i] = x[i-1] + increment;
			y[i] = 20 * Math.abs(Math.sin(x[i]));
		}

		System.out.println("Values");
		for(int i=0; i<userInput; i++) {
			System.out.println("x: " + String.format("%.3f", x[i])
			+ ", y: " + String.format("%.3f", y[i]));
		}
		System.out.println();

		//asterisk
		System.out.println("Graph");
		for(int i=0; i<userInput; i++) {
			System.out.print(":");
			for(int j=0; j<(int)y[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();  
	}
}
