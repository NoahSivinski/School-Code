/*
 * StarGraph.java
 * Author: Samir Hadi Cisneros 
 * Submission Date:  26 March 2021
 *
 * Purpose: This program utilizes loops and one dimensional arrays to graph values of x in 
 * specified increments and values of y which are the sin value of the corresponding x value.
 * This program then prints a graph using * to represent the data
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
 * 
 * I agree
 * 
 */
import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//Input
		System.out.print("Please enter the number of x values to process: ");	//prompts user to enter x values
		int numberOfX = input.nextInt();
		input.nextLine();
		if (numberOfX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");	//error message if <=0
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");	//prompts user for minimum x value
		double minValue = input.nextDouble();
		input.nextLine();

		System.out.print("Enter the amount to increment x: ");	//prompts user for increment of x value
		double increment = input.nextDouble();
		input.nextLine();
		if (increment <= 0.0) {
			System.out.println("The increment must be a decimal number greater than 0.");	//error message
			System.exit(0);
		}
		System.out.println();

//Array declaration and initialization
		double[] x = new double[numberOfX]; // stores all appropriate values into an x array
		x[0] = minValue;
		for (int i = 1; i < numberOfX; i++) {
			x[i] = x[i - 1] + increment;
		}

		double[] y = new double[numberOfX]; // stores all appropriate values into a y array
		for (int i = 0; i < numberOfX; i++) {
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
		}

//Output
		System.out.println("Values"); // Print values
		for (int i = 0; i < numberOfX; i++) {
			System.out.printf("x: %1.3f, y: %1.3f\n", x[i], y[i]);	//rounds each value to the nearest thousands place
		}
		System.out.println();

		System.out.println("Graph"); // Prints a graphical representation of the data
		for (int i = 0; i < numberOfX; i++) {
			System.out.print(":");
			for (int j = 0; j < (int) y[i]; j++) {
				System.out.print("*");	//uses stars to reflect values on the graph
			}
			System.out.println();
		
		}
		
		input.close();	
	}
	

}
