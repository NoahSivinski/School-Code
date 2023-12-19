/*
 * [StarGraph].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [March 26, 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 *This program allows you to create arrays based on input of x and y.
 *The program will prompt for number, minimum value, and amount to increment of x.
 *The system will then print x and y values and a graph.
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
		// Scanner
		Scanner s = new Scanner(System.in);
		
		//Prompts
		System.out.print("Please enter the number of x values to process: ");
		int number = s.nextInt();
		if (number <= 0)
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double minimum = s.nextDouble();

		//prompt for increment value
		System.out.print("Enter the amount to increment x: ");
		double increment = s.nextDouble();
		if (increment <= 0)
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println();
		
		// x and y array
		double[] x = new double[number];	
		double[] y = new double[number];
		for (int a = 1; a < number; a++) 
		{
			x[0] = minimum;
			x[a] = x[a-1] + increment;
			y[0] = 20.0 * Math.abs(Math.sin(x[0]));
			y[a] = 20.0 * Math.abs(Math.sin(x[a]));
		}
		
		// Print output of values and  graph
		System.out.println("Values");
		for (int a = 0; a < number; a++)
		{
			System.out.printf("x: %1.3f, y: %1.3f\n", x[a], y[a]);
		}
		System.out.println();
		System.out.println("Graph");
		
		//loop to print out graph
		for (int a = 0; a < number; a++) {
			System.out.print(":");
			for (int b = 0; b < (int)y[a]; b++) {
				System.out.print("*");
			}
			System.out.println();
			s.close();
		}
	}
}

		

		


