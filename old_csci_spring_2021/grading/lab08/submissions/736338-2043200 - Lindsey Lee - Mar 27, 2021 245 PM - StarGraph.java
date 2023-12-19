
import java.util.Scanner;

/*
 * StarGraph.java
 * Author:  Lindsey Lee 
 * Submission Date:  03/27/2021
 *
 * Purpose: The purpose of this program is to create a star graph
 * (with asterisks) by using arrays and loops to determine x- and 
 * y-values (based on user input). The x- and y-values are then
 * used in a loop to create a star graph.
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

public class StarGraph {

	public static void main(String[] args) {

		/* declare variables */
		int number;
		double minimum;
		double increment;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		{
			number = keyboard.nextInt();
			if (number <= 0) /* if statement for when the number of x-values (input) is less than or equal to 0 */
				System.out.println("The number of x values must be an integer greater than 0.");
			else 
				System.out.print("Enter a minimum value for x: ");
		}
		minimum = keyboard.nextDouble();
		{
			System.out.print("Enter the amount to increment x: ");
			increment = keyboard.nextDouble();
			if (increment <= 0) /* if statement for when the increasing value (increment) is less than or equal to 0 */
				System.out.println("The increment must be a decimal number greater than 0.");
			else
				System.out.println("\nValues");
		}
		/* arrays created with type double; variables are based on user input */
		double[] xValue = new double[number]; 
		double[] yValue = new double[number]; 

		xValue[0] = minimum; /* initial value of array xValue */
		yValue[0] = 20.0 * Math.abs(Math.sin(xValue[0])); /* initial value of array yValue */

		System.out.printf("x: %.3f, y: %.3f\n", xValue[0], yValue[0]); /* print statement displays xValue[0] and yValue[0] as starting
		 																	values for both arrays */
		
		/* loop for determining values of x and y */
		for (int i = 1; i < number; i++) { 
			xValue[i] = xValue[i - 1] + increment;
			yValue[i] = 20.0 * Math.abs(Math.sin(xValue[i]));
			System.out.printf("x: %.3f, y: %.3f\n", xValue[i], yValue[i]);
		}

		System.out.print("\nGraph");

		/*loop for configuring graph using values of x and y */
		for (int i = 0; i < number; i++) {
			System.out.print("\n:");
			for (int j = 0; j < Math.floor(yValue[i]); j++)
				System.out.print("*");
		}

		keyboard.close();
	}
}
