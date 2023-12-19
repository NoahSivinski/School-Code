/*
 * StarGraph.java
 * Author:  Lanie Snyder
 * Submission Date:  March 26, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program creates, displays, and graphs multiple values of 
 * x and y. Y is defined by the function y = 20.0 ∗ |sin x|.
 * The user inputs the number of values, the minimum value of x,
 * and the amount to increment x. The program then finds the the 
 * corresponding y values. It then displays all the values and
 * graphs the function.
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
		double minValue; //Minimum value of x
		int numberOfValues; //The number values of x for which y will be computed)
		double increment; //A value by which x is increased
		int count; //Used in a loop to display the graph
		count = 0;
		
		System.out.print("Please enter the number of x values to process: ");
		numberOfValues = keyboard.nextInt();
		
		if (numberOfValues <= 0) //Number of values is not greater than 0
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		minValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		
		if (increment <= 0) //Increment is not greater than 0
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//Creating both arrays 
		double[] xValue = new double[numberOfValues];
		double[] yValue = new double[numberOfValues];
		
		//Sets the first value of the x array to 0
		xValue[0] = minValue;
		
		//To populate the x array with values
		for (int index = 1; index < numberOfValues; index++)
        {
			xValue[index] = xValue[(index-1)] + increment;
        }
		
		//To populate the y array with values
		for (int index = 0; index < numberOfValues; index++)
        {
			yValue[index] = 20.0 * Math.abs(Math.sin(xValue[index]));
        }
		
		System.out.println();//To add a line in-between
		System.out.println("Values");
		
		//Loop to print the values
		while (count < numberOfValues)
		{
			System.out.print("x: ");
			//Use Math.round to get rid of the negative if x = -0.00
			System.out.printf ("%.3f" , (double) Math.round(xValue[count] * 1000.0) / 1000.0);
			System.out.print(", y: ");
			System.out.printf("%.3f", yValue[count]);
			System.out.println();

			count = count + 1;
		}
		
		System.out.println(); //To add a line in-between
		System.out.println("Graph");
	
		//Loop to print the graph
		count = 0; //To reset count
		while (count < numberOfValues)
		{
			System.out.print(":");
			for (int index = 0; index < (int)yValue[count]; index++)
			{
				System.out.print("*");
			}
			System.out.println();
			count = count + 1;
		}
		keyboard.close();
	}

}
