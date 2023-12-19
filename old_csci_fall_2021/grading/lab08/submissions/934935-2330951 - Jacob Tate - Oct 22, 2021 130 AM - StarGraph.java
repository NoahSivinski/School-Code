/**
 * File name: StarGraph.java
 * Author: Jacob Tate
 * Submission Date: Friday, October 22nd, 2021.
 *
 *This program allows the user to create a simple table and illustrate a given function with a graph.
 *The user will input the number of x and y values they want to have, the initial x, and what to increment x by.
 *If the number of x and y values is less than or equal to zero or if the variable incrementing x is less than or 
 *equal to zero, the program will terminate.
 *The function for how to create y is given in the lab stimulus. 
 *The graph is created by using the truncated integer values of y.
 *
 *Statement of Academic Honesty:
 *
 *The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be playerMoveled in accordance with
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

	public static void main(String[] args) 
	{
		/**Below code allows for the user to input the number of x and y values, the initial x, 
		 * and the variable incrementing x.  If the number of x and y values is less than or equal 
		 * to zero or if the variable incrementing x is less than or zero, the program will terminate.
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		int xCount = keyboard.nextInt();
		if(xCount <= 0)
		{
			System.out.print("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double minX = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double xIncrementor = keyboard.nextDouble();
		if(xIncrementor <= 0)
		{
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		//Below code creates arrays that hold the values for x and y.
		double[] xValues = new double[xCount];
		double[] yValues = new double[xCount];
		
		//Below code loops through the created arrays and assigns the values of each index in the arrays.
		for(int i = 0; i < xCount; i++)
		{
			xValues[i] = minX + (xIncrementor * i);
		}
		
		for(int i = 0; i < xCount; i++)
		{
			yValues[i] = 20 * Math.abs(Math.sin(xValues[i]));
		}
		//Below code prints out the values of the x and y arrays in a table-like format.
		System.out.println();
		System.out.println("Values");
		for(int i = 0; i< xCount; i++)
		{
			System.out.print("x: ");
			System.out.printf("%6.3f", xValues[i]);
			System.out.print(", ");
			System.out.print("y: ");
			System.out.printf("%6.3f", yValues[i]);
			System.out.println();
		}
		System.out.println();
		
		/**Below code prints out the graph that coincides with the values in the x and y arrays.
		 * The loop will print out the necessary number of stars based on the truncated integer
		 * values of y.
		 */
		System.out.println("Graph");
		for(int i = 0; i < xCount; i++)
		{
			System.out.print(":");
			for(int j = 0; j < (int)yValues[i] && (int)yValues[i] != 0; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
