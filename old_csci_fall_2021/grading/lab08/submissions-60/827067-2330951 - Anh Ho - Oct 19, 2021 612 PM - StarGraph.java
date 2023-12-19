/*
 * StarGraph.java
 * Author:  Anh Ho
 * Submission Date:  10/18/2021
 *
 * Purpose: A program that create and initialize 2 arrays x and y with the length and increment that used input,
 * where x values are increments of the values user inputed and y values are 20*sinx,
 * then print out the values and the floor values of y as star graph.
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
		//creating variables
		double[] x,y;
		int length;
		double increment;
		
		//creating new Scanner object
		Scanner keyboard = new Scanner(System.in);

		//getting input for length of arrays
		System.out.print("Please enter the number of x values to process: ");
		length = keyboard.nextInt();
		x = new double[length];
		y = new double[length];
		//checking array length
		if (length > 0) {
			System.out.print("Enter the minimum value for x: ");
			x[0] = keyboard.nextDouble();
			System.out.print("Enter the amount to increment x: ");
			increment = keyboard.nextDouble();
			if (increment > 0) {
				y[0] = 20 * (Math.abs(Math.sin(x[0])));
				for (int i=1;i<length;i++) {
					x[i] = x[i-1] + increment;
					y[i] = 20 * (Math.abs(Math.sin(x[i])));
				}
				System.out.println("\nValues");
				for (int i=0;i<length;i++) {
					System.out.printf("x: %.3f" , x[i]);
					System.out.printf(", y: %.3f" , y[i]);
					System.out.println();
				}
				System.out.println("\nGraph");
				for (int i=0;i<length;i++) {
					System.out.print(":");
					for (int j=0;j<Math.floor(y[i]);j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			else {
				System.out.println("The increment must be a decimal number greater than 0.");
			}
		}
		else {
			System.out.println("The number of x values must be an integer greater than 0.");
		}
		
		keyboard.close();
	}	//close main
}	//close class
