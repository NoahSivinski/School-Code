/*
 * StarGraph.java
 * Author:  Tushita Bansal 
 * Submission Date:  October 22, 2021
 *
 * Purpose: This program is used visually graph x and y by using their values.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//user input
		System.out.print("Please enter the number of x values to process: ");
		
		int n = keyboard.nextInt();
		if (n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();

		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println();

		//Create the arrays
		double[] xArray = new double[n];
		double[] yArray = new double[n];

		//Increment the x values
		xArray[0] = xMin;
		for(int i = 0; i < n; i++) {
			xArray[i] = xMin + (i* increment);
		}
		//Find the y values for every array index
		for (int i = 0; i < n; i++) {
			yArray[i] = 20.0 * Math.abs(Math.sin(xArray[i]));
		}
		System.out.println("Values");

		//Print out the x and y values as well as the visual representations.
		for (int i = 0; i < n; i++) {
			System.out.print("x: ");
			System.out.printf("%.3f", xArray[i]);
			System.out.print(", y: ");
			System.out.printf("%.3f", yArray[i]);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Graph");
		for (int a = 0; a < n; a++){
			System.out.print(":");
			int yArrayInt = (int) yArray[a];
			for (int x = 0; x < yArrayInt; x++) {

				System.out.print("* ");
			}
			
			System.out.println();	
		}
	}	
}