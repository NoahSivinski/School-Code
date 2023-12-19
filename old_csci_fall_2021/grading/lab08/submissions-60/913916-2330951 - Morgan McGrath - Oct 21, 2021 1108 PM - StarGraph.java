/*
 * StarGraph.java
 * Author:  Morgan McGrath 
 * Submission Date:  10/21/2021
 *
 * Purpose: This program lets the user input the number of x values to process, the minimum
 * value for x, and the amount to increment x. The program runs all of the x values through the
 * function y=20.0*|sinx|. All of the x and y values are printed out. A graphical representation 
 * using * is also printed out. 
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

	public static void main(String args[]) {
		int arraySize;
		double xMin;
		double xIncrement;
		Scanner keyboard=new Scanner(System.in);
		//get the number of x values, the min x value, and the increment value for x
		//make sure the number of x values and the increment value for x are valid
		System.out.print("Please enter the number of x values to process: ");
		arraySize=keyboard.nextInt();
		if(arraySize<=0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		xMin=keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		xIncrement=keyboard.nextDouble();
		if(xIncrement<=0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println();
		
		double[] x=new double[arraySize];
		double[] y=new double[arraySize];
		//add the x values to an array
		for(int i=0; i<arraySize; i++) {
			x[i]=xMin+(xIncrement*i);
		}
		//find the y values and add them to an array
		for(int i=0; i<arraySize; i++) {
			y[i]=20.0*Math.abs(Math.sin(x[i]));
		}
		//print out the values
		System.out.println("Values");
		for(int i=0; i<arraySize; i++){
			System.out.printf("x: %.3f", x[i]);
			System.out.printf(", y: %.3f", y[i]);
			System.out.println();
		}
		//get the truncated values of y and add them to an array
		//this will be helpful in drawing the graph
		int[] yTruncated=new int[arraySize];
		for(int i=0; i<arraySize; i++) {
			yTruncated[i]=(int)y[i];
		}
		System.out.println();
		//print out the graph
		System.out.println("Graph");
		for(int i=0; i<arraySize; i++) {
			System.out.print(":");
			for(int j=0; j<yTruncated[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
