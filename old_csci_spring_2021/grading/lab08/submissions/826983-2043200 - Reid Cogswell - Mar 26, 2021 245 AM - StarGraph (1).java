/*
 * StarGraph.java
 * Author:  Reid Cogswell 
 * Submission Date:  03-26-2021
 *
 * Purpose: Creates a graph using the star character by using the users inputs.
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

		Scanner keyboard = new Scanner(System.in);

		int numOfValues; 
		double minValue; 
		float increment; 

		System.out.print("Please enter the number of values to process: ");
		numOfValues = keyboard.nextInt();
		if (numOfValues <= 0)
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.print("Enter a minimum value for x: ");
		minValue = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextFloat();

		if (increment <= 0)
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		System.out.println("");
		System.out.println("Values");
		double[] xValues = new double[numOfValues]; 
		xValues[0] = minValue; 
		double[] yValues = new double[numOfValues];
		yValues[0] = 20.0 * Math.abs(Math.sin(minValue)); 

		for (int x = 1; x <= numOfValues - 1; x++) 
		{
			xValues[x] = xValues[x-1] + increment;
			yValues[x] = 20.0 * Math.abs(Math.sin(xValues[x]));
		}

		for (int array = 0; array <= numOfValues - 1; array++) 
		{
			System.out.printf("x: %1.3f", xValues[array]); 
			System.out.printf(", y: %1.3f", yValues[array]);
			System.out.print("\n");
		}

		System.out.println("");
		System.out.println("Graph");
		int[] numAstr= new int[numOfValues];
		for (int index = 0; index <= numOfValues - 1; index++)
		{
			for (int truncate = 0; truncate<= yValues[index]; truncate++) 
			{
				numAstr[index] = (int)yValues[index]; 
			}
		}

		for (int i = 0; i <= numAstr.length - 1; i++) 
		{
			System.out.print(":");
			for (int graph = 1; graph <= numAstr[i]; graph++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
