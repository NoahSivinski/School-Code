/*
 * [StarGraph].java
 * Author:  [Davis Klein] 
 * Submission Date:  [10/19/2021]
 *
 * Purpose: This program creates two arrays, of size designated by user input, then prints a star graph of the int values of the resultant y variables.
 * The y value is calculated as the absolute value of sin x * 20. The x value is incremented at a user input amount. Values of both arrays are
 * output to the screen preceding the 'star graph'.
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
		
		//the array size is checked, as it must be an int value greater than 0
		System.out.print("Please enter the number of x values to process: ");
		int arraySize = keyboard.nextInt();
		if (arraySize <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double xMin = keyboard.nextDouble();
		
		//the increment value is checked, as it must be a decimal value greater than 0
		System.out.print("Enter the amount to increment x: ");
		double xInc = keyboard.nextDouble();
		if (xInc <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println("Values");
		
		//both arrays are declared, using the arraySize variable for the length, which was input by user
		double[] arrayX = new double[arraySize];
		double[] arrayY = new double[arraySize];
		
		//to simplify the for loop, the index 0 values of both arrays are assigned outside the loop
		arrayX[0] = xMin;
		arrayY[0] = 20 * Math.abs(Math.sin(xMin));
		
		//for loop to assign the values of each array
		double y = 0;
		for (int i = 1; i < arrayX.length; i++) {
			xMin += xInc;
			arrayX[i] = xMin;
			y = 20 * Math.abs(Math.sin(xMin));
			arrayY[i] = y;
		}
		
		//loop to print the values of both arrays, formatted to 3 decimal places
		for (int i = 0; i < arrayX.length; i++) {
			System.out.printf("x: %.3f" ,arrayX[i]);
			System.out.printf(", y: %.3f" ,arrayY[i]);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Graph");
		
		//loop to print the star graph. Typecast int truncates the double value of arrayY[i] and is assigned to the starCount variable.
		int k = 0;
		for (int i = 0; i < arrayX.length; i++) {
			int starCount = (int) arrayY[i];
			System.out.print(":");
			while (k < starCount) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			k = 0;
		}
		
	}

}
