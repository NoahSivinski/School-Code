/*
 * CSCI1301.java
 * Author: Rayman Ng
 * Submission Date: 3/26/2021
 *
 * Purpose: This program will create a graph of asterisks following input from the user. First, it will prompt the user for the number of x values, x's minimum value, and the amount x will increase by. 
 * Afterwards, it will plug all the x values into the equation y = 20 * |sin (x)| to get their appropriate y values. 
 * Finally, it shall then create a graph of asterisks to match this data set. 
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

		Scanner keyboard = new Scanner (System.in);
		int N;
		double [] xArray;
		double [] yArray;
		double increment;
		double minimumValue;

		System.out.print("Please enter the number of x values to process: ");
		N = keyboard.nextInt();
		if (N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		minimumValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		if (increment <= 0 ) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		xArray = new double [N];
		yArray = new double [N];

		xArray [0] = minimumValue;
		yArray [0] = 20.0 * Math.abs(Math.sin(xArray[0]));

		for (int i = 1; i < N; i++) {
			xArray [i] = xArray [i - 1] + increment;
			yArray [i] = 20.0 * Math.abs(Math.sin(xArray[i]));
		}
		System.out.println('\n' + "Values");
		for (int i = 0; i < N; i++) {
			if( (Math.round(-xArray[i] *100) <1) && (xArray[i] < 0)) {
				System.out.print("x: 0.000");
			}
			else {
				System.out.printf("x:" + " " + "%.3f", xArray[i]);
			}
			System.out.printf("," + " " + "y:" +" "+ "%.3f%n", yArray[i]);
		}
		System.out.println('\n' + "Graph");
		for (int count = 0;count < N; count++) {
			System.out.print(":");
			if (yArray[count] >= 1) {
				yArray [count] = (int) yArray [count];
				for (int i = 0; i < yArray[count]; i++) {
					System.out.print("*");
				}

			}
			System.out.println("");
		}
		keyboard.close();
	}

}
