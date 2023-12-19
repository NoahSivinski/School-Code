/*
 * StarGraph.java
 * Author:  Justin Hesse 
 * Submission Date:  3/26/2021
 *
 * Purpose: Takes parameters for x values from the user (# of values to process, 
 * min x value, and amount to increment x by) and calculates y values using the equation
 * y = 20 * abs(sin(x)). Prints x and y values as well as a star graph showing the
 * magnitude of y.
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

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the number of x values to process: ");
		int howMany = scan.nextInt();
		scan.nextLine();

		//Validates user input for number of x's to be processed
		if (howMany <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		double minX = scan.nextDouble();
		scan.nextLine();
		System.out.print("Enter the amount to increment x: ");
		double incrementAmount = scan.nextDouble();
		scan.nextLine();

		//Validates user input for how much to increment x by
		if (incrementAmount <= 0) {
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println();

		//Creating 2 arrays for x and y values based on how many x values will be processed
		double[] xArray = new double[howMany];
		double[] yArray = new double[howMany];

		//Assigning x values to each index of xArray based on how many x values will be processed
		for	(int i = 0; i < xArray.length; i++) {
			xArray[i] = minX;
			minX += incrementAmount;
		}

		//Assigning y values to each index of yArray based on the formula y = 20.0 * abs(sin(x))
		for (int i = 0; i < yArray.length; i++) {
			yArray[i] = 20.0 * (Math.abs(Math.sin(xArray[i])));
		}

		//Prints values of x and y rounded to 3 decimal places
		System.out.println ("Values");
		for (int i = 0; i < howMany; i++) {
			String formattedXValue = String.format("%.3f", xArray[i]);
			String formattedYValue = String.format("%.3f", yArray[i]);
			System.out.println("x: " + formattedXValue + ", " + "y: " + formattedYValue);
		}
		System.out.println();

		//Prints a graph of asterisks based on the truncated value at each index of yArray
		System.out.println("Graph");
		for (int i = 0; i < xArray.length; i++) {
			System.out.print(":");
			for (int j = 0; j < (int) yArray[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		scan.close();
	}

}
