/*
 * [StarGraph.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [3/22/2021]
 *
 * This program does the following: 
 * StarGraph.java is a program that uses 1D arrays to print x and y values based off an increment and a starting position,
 * and then prints a graphical representation of these numbers. It asks the user for the number of x values wanted, which must
 * be above 0, the minimum value for x or the starting point, and the increment the user wishes to increase x by each time,
 * which also must be positive. After finding these values, the program uses two double arrays to output the x and y values
 * and shows a graphical representation off the values using truncation to the lowest whole number.
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
		
		//using the Scanner class to get input from the user, asking for the number of x values to process
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		int numOfX = input.nextInt();
		input.nextLine();
		
		//if statement to check to make sure the number of x values is greater than 0, otherwise the program terminates
		if ( numOfX <= 0 ) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		//asking the user for the minimum value of x
		System.out.print("Enter a minimum value for x: ");
		double minX = input.nextDouble();
		input.nextLine();
		
		//asking the user for the amount to increment x by
		System.out.print("Enter the amount to increment x: ");
		double incX = input.nextDouble();
		
		//if statement to check to make sure the increment is greater than 0, otherwise the program terminates
		if ( incX <= 0 ) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//initializing the two double arrays with length numOfX
		double arrayX[] = new double[numOfX];
		double arrayY[] = new double[numOfX];
		
		//setting the first value of arrayX to the minX, then setting the rest of the values using a for loop and the increment
		arrayX[0] = minX;
		for (int i = 1; i < arrayX.length; i++) {
			arrayX[i] = arrayX[i-1] + incX;
		}
		
		//using Math.abs and Math.sin to calculate the formula for Y, then placing those values in the arrayY
		for (int i = 0; i < arrayX.length; i++) {
			arrayY[i] = 20.0 * Math.abs(Math.sin(arrayX[i]));
		}
		
		//print statements that display the values of x and y for the user, with 3 decimal points
		System.out.println("\nValues");
		for (int i = 0; i < arrayX.length; i++) {
			System.out.printf("x: %1.3f", arrayX[i]);
			System.out.print(", ");
			System.out.printf("y: %1.3f", arrayY[i]);
			System.out.println("");
		}

		//print statements that print out the graph of the arrays, using a nested loop
		System.out.println("\nGraph");
		//first for loop that goes through the length of arrayX and prints a : for each value
		for (int i = 0; i < arrayX.length; i++) {
			System.out.print(":");
			
			//making variable asterick to find the truncated length of each arrayY value
			int asterick = (int)arrayY[i];
			//for loop the goes the length of asterick and prints a * to be displayed
			for (int j = 0; j < asterick; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}
}