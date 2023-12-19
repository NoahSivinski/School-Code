/*
 * StarGraph.java
 * Author:  Will Harrison
 * Submission Date:  3/26/2021
 *
 * Purpose: This program gets three numbers from the user. 
 * The user inputs how many times the x value gets computed,
 * the minimum x value that starts the computation, and the
 * number by which the minimum value increments. The program
 * then computes and prints the x and y values however many 
 * times the user indicated. Under these x and y values, 
 * a graph prints out the y values as asterisks.
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
		//numberOfX is N
		System.out.print("Please enter the number of x values to process: ");
		int numberOfX = input.nextInt();
		if (numberOfX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		//minValue is Xmin
		System.out.print("Enter a minimum value for x: ");
		double minValue = input.nextDouble();
		//an increment for X
		System.out.print("Enter the amount to increment x: ");
		double incX = input.nextDouble();
		if (incX < 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		//creation of X and Y values arrays
		double xInput[] = new double[numberOfX];
		double yOutput[] = new double[numberOfX];

		System.out.print("\nValues\n");
		//loop for X and Y values
		for (int i = 0; i < xInput.length; i++) {

			xInput[i] = minValue;
			//y=20*|sinx|
			yOutput[i] = (20 * Math.sin(Math.abs(xInput[i])));
			
			//print and format statements for X and Y values
			System.out.printf("x: %.3f", xInput[i]);
			System.out.printf(", y: %.3f", Math.abs(yOutput[i]));
			System.out.println();
			
			//adding increment each loop to x value
			minValue = minValue + incX;
		}

		System.out.print("\nGraph\n");
		//loop for graph of X and Y values
		for (int i = 0; i < xInput.length; i++) {
			//":" represents each x value
			System.out.print(":");
			//nested loop prints a "*" for each absolute value of Y
			for (int j = 1; j <= Math.floor(Math.abs(yOutput[i])); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		input.close();
	}

}
