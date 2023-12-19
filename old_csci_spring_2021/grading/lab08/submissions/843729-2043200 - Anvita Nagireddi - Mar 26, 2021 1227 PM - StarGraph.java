/**
 * StarGraph.java
 * Author:  Anvita Nagireddi 
 * Submission Date:  Mar-25-2021
 * File name: StarGraph.java
 *
 * This program does the following: to create a program using two arrays of type double to store multiple values for x and y
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
		System.out.print("Please enter the number of x values to process: ");
		Scanner scan = new Scanner (System.in);
		int values = scan.nextInt();
		if (values <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");	
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double minValue = scan.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment = scan.nextDouble();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");	
			System.exit(0);
		}
		double[] xValueArray = new double[values];
		double[] yValueArray = new double[values];
		System.out.println();
		System.out.println("Values");
		for(int i = 0; i < values; i++)	{
			xValueArray[i] = (minValue + (increment*i));
			yValueArray[i] = (20.0 * Math.abs(Math.sin(xValueArray[i])));
			System.out.printf("x: " + "%.3f", xValueArray[i]);
			System.out.printf(", y: " + "%.3f", yValueArray[i]);
			System.out.println();
		}
		System.out.println();
		System.out.println("Graph");
		for(int i = 0; i < values; i++)	{
			System.out.print(":");
			for(int x = 1; x <= (int)yValueArray[i]; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
