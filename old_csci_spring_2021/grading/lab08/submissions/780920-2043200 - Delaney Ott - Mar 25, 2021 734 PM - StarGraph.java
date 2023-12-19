/*
 * StarGraph.java
 * Author:  Delaney Ott 
 * Submission Date:  March 25th, 2021
 *
 * Purpose: The program is designed to use arrays and inputed values in order to print
 * out the values x and y once they are run through a function. Also, the program should
 * print out a graphical representation of the function using a sequence of '*'s to 
 * indicate the magnitude of y, as well.
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
		int arraySize, N;
		double minValueForX, amountToIncrementX;
		
		//Prompt user for input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		arraySize = keyboard.nextInt();
		N = arraySize;
		if(N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		minValueForX = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		amountToIncrementX = keyboard.nextDouble();
		if(amountToIncrementX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		//Creating the arrays
		double[] xValues = new double[N];
		double[] yValues = new double[N];
		xValues[0] = minValueForX;
		for(int i = 1; i < N; i++) {
			xValues[i] = minValueForX + ((i)*amountToIncrementX);
		}
		for(int i = 0; i < N; i++) {
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
		}
		System.out.println("\nValues");
		for(int i = 0; i < N; i++) {
			System.out.printf("x: " + "%.3f", xValues[i]);
			System.out.printf(", y: " + "%.3f",yValues[i]);
			System.out.println();
		}
		//Creating the graph
		int numberOfAsterisks [] = new int[N];
		for(int i = 0; i < N; i++) {
			numberOfAsterisks[i] = (int)Math.floor(yValues[i]);
		}
		System.out.println("\n\nGraph");
		for(int i = 0; i < N; i++) {
			System.out.print(":");
			for(int j = 0; j < numberOfAsterisks[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	keyboard.close();	
	}

}
