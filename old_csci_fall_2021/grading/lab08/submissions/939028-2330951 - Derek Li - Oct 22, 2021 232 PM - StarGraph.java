/*
 * StarGraph.java
 * Author:  Derek Li
 * Submission Date:  10/22/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program asks the user for an initial x value,
 * an increment, and the number of values the user wants. Then,
 * the program prints out the values of x and y where y = the absolute 
 * value of the sin of x all multiplied by 20. Using these values, the 
 * program then constructs a graph of * using the y values where each *
 * is equal to a whole number
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
		int size, xmin;
		double increment;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		size = keyboard.nextInt();
		if(size <= 0)
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		double[] x = new double[size];
		double[] y = new double[size];
		
		System.out.print("Enter a minimum value for x: ");
		xmin = keyboard.nextInt();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		if(increment <= 0)
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//for loop both initializes the x and y values at index i in the array while also printing them out at the same time
		System.out.println("Values:");
		x[0] = xmin;
		y[0] = Math.abs(Math.sin(x[0])) * 20.0;
		System.out.println("x; " + x[0] + ", y: " + y[0]);
		for(int i = 1; i < x.length; i++)
		{
			x[i] = x[i-1] + increment;
			y[i] = Math.abs(Math.sin(x[i])) * 20.0;
			System.out.print("x: ");
			System.out.printf("%.3f", x[i]);
			System.out.print(", y: ");
			System.out.printf("%.3f", y[i]);
			System.out.println();
		}
		
		//new for loop interates through already initialized y values to create a graph
		System.out.println("Graph");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(":");
			//will print out a star until j equals 0
			for(int j = (int) y[i]; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
		
	}

}
