/*
 * StarGraph.java
 * Author: Lincoln Ledet
 * Submission Date:  10/22/21
 * Lab 08 – Loops; One-Dimensional Arrays
 * 
 * Purpose: This programs takes x inputs from the user
 * then apples those input into a y= function. It then graphs that
 * function using "*"s. 
 * 
 * 
 *  * Statement of Academic Honesty:
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
		//Initializing variables 
		int ValueAmount;
		double minValue;
		double increment;
		Scanner keyboard = new Scanner(System.in);
		
		//gets input from user
		System.out.print("Please enter the number of x values to process: ");
		ValueAmount = keyboard.nextInt();
		if (ValueAmount<=0)
		{
			System.out.print("The number of x values must be an integer greater than 0.");
			System.exit(1);
		}
		System.out.print("Enter a minimum value for x: ");
		minValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x:");
		increment = keyboard.nextDouble();
		if (increment<=0)
		{
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(1);
		}
		
		//creates empty arrays
		double[] xValues = new double[ValueAmount];
		double[] yValues = new double[ValueAmount];
		
		//assigns value to arrays
		for (int i = 0; i<ValueAmount; i++)
		{
			xValues[i] = (i*increment)+minValue;
			yValues[i] = 20.0*(Math.abs(Math.sin(xValues[i])));
		}
		
		System.out.println("Values");
		
		//prints arrays in correct format
		for (int i = 0; i<ValueAmount; i++)
		{
			System.out.print("x: ");
			System.out.printf("%4.3f", xValues[i]);
			System.out.print(", y: ");
			System.out.printf("%4.3f", yValues[i]);
			System.out.println();

		}
		System.out.println();
		System.out.println("Graph");

		
		//prints the graph
		for (int i = 0; i < ValueAmount; i++) {
			System.out.print(":");
			for (int j = 0; j < (int)yValues[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
			

		}
		
	}	

}
