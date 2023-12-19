/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [03/26/2021]
 *
 * Purpose: Program that allows the user to input the number of x
 * values they want to use, their minimum value of x, and the number
 * in which to increment x up by. It then computes y, which is 
 * 20 * |sin x|, and creates of graph of the y-values.
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

/**
 * @author sky.cole768
 *
 */
public class StarGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard =  new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		int numberOfX = keyboard.nextInt(); // User's desired number of x values to use.
		
		if (numberOfX <= 0) {
			System.out.print("The number of x values must be an integer greater than 0.");
		
			keyboard.close();
			return;
			}
		
		double[]valueOfX = new double[numberOfX]; // The values of x.
		double[]valueOfY = new double[numberOfX]; // The values of y.
		
		System.out.print("Enter a minimum value for x: ");
		double minValue = keyboard.nextDouble(); // User's desired minimum value of x to be incremented up from.
		
		
		System.out.print("Enter the amount to increment x: ");
		double incrementValue = keyboard.nextDouble(); // User's desired value to increment x by.
		
		if (incrementValue <= 0) {
			System.out.print("The increment must be a decimal number greater than 0.");
			
			keyboard.close();
			return;
			}
		
		System.out.println();
		
		for(int index = 0; index < numberOfX; index++) { // Loop that increments x up by the incrementValue.
			valueOfX[index] = minValue + (index * incrementValue);
			}
		
		for(int index = 0; index < numberOfX; index++) {  // Loop that calculates the y values based on x.
			valueOfY[index] =20 * Math.abs( Math.sin(valueOfX[index]));
			}
		
		System.out.println("Values");
		
		for(int index = 0; index < numberOfX; index++) { // Loop that displays the x and y values;
			System.out.printf("x: " + "%.3f ", valueOfX[index]);
			System.out.print(",");
			System.out.printf(" y: " +  "%.3f", valueOfY[index]);
			System.out.println();
			}
		
		System.out.println();
		System.out.println("Graph");
		
		for(int index = 0; index < numberOfX; index++) { // Loop that creates the graph for the y values.
			System.out.print(":");
			
			for (int j=0; j < (int)valueOfY[index]; j++) {
				System.out.print("*");
				}
			
			System.out.println();
			}
		
		keyboard.close();
		}
	}
