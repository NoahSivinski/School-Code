/*
 * StarGraph.java
 * Author:  Carla Pena 
 * Submission Date:  26 March 2021
 *
 * Purpose: This program allows a user to input 
 * the number of values to process. From there
 * it requests from the user to input minimum values 
 * and increments. The program will create x and y
 * values. Which will then create a graph with the 
 * values it printed. 
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
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double xMin;
		
		System.out.print("Please enter the number of x values to process: ");
		int xSizeOfArray = scan.nextInt();
		
		if (xSizeOfArray <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		xMin = scan.nextDouble();
		
		System.out.print("Enter the amount to increment x: ");
		double xIncrement = scan.nextDouble();
		
		if (xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double xArray[] = new double[xSizeOfArray];
		double yArray[] = new double[xSizeOfArray];
		
		System.out.println();
		System.out.println("Values");
		
		for (int i = 0; i < xSizeOfArray; i++) {
			xArray[i] = xMin;
			yArray[i] = 20.0 * Math.abs(Math.sin(xMin));
			System.out.printf("x: %.3f", xArray[i]);
			System.out.printf(", y: %.3f", yArray[i]);
			xMin = xMin + xIncrement;
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Graph");
		
		for (int i = 0; i < yArray.length; i++) {
			System.out.print(":");
			for (int j = 0; j < (int)yArray[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
