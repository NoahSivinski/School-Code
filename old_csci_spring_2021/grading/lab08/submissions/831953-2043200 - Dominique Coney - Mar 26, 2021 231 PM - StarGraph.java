/*
 * StarGraph.java
 * Author:  Dominique Coney
 * Submission Date:  3/26/2021
 *
 * Purpose: The purpose of this program is to allow users to process their desired number of x values, incrementing them by the desired increment each time.  They will then get the x values and corresponding y values returned, with a star graph to match.
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
/**
 * 
 */

/**
 * @author Dominique Coney
 *
 */
import java.util.Scanner;
public class StarGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		int number = keyboard.nextInt();
		if (number <= 0) {
			System.out.print("The number of x values must be an integer greater than 0. ");
		}
		else {
		System.out.print("Enter a minimum value for x: ");
		double minimum = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();
		if (increment <= 0) {
			System.out.println("The number of x values must be a decimal number greater than 0.");
		}
		else {
			System.out.println();
			double xOne = minimum;
			double[] xValues = new double[number];
			System.out.println("Values");
			double[] yValues = new double[number];
			for ( int index=0; index < number; index ++ ){
				xValues[index] = minimum + index*increment;
				System.out.printf("x: %.3f," , xValues[index]);
				yValues[index] = 20 * Math.abs(Math.sin(xValues[index]));
				System.out.printf(" y: %.3f" , yValues[index]);
				System.out.print("\n");
			}
			System.out.print("\n");
			System.out.println("Graph");
			for(int i=0; i<number; i++) {
				System.out.print(":");
				for (int j=0; j<yValues[i] - 1; j++) {
					System.out.print('*');
				}
				System.out.println(" ");
			}
	}
	}
}
}