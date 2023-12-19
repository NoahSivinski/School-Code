/*
 * StarGraph.java
 * Author:  James Breathnach
 * Submission Date:  10/20/2021
 *
 * Purpose: This program takes receives a number of x values, the starting number for the x values, and the value by which x increases.
 * The program then puts all of the x values into a formula and gets the y values.
 * the y values are then displayed into a star graph.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;
public class StarGraph {

	public static void main(String[] args) {
		//n is the amount of values which will be in the arrays.
		int n; 
		//xMin is the minimum x value
		double xMin;
		//xInc is the value by which x increases
		double xInc;
		
		Scanner keyboard = new Scanner (System.in);
		// the user is prompted to enter the values.
		System.out.print("Please enter the number of x values to process: ");
		n = keyboard.nextInt();
		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		xInc = keyboard.nextDouble();
		//An array for the values of x and y are created
		double[] x = new double[n];
		double[] y = new double[n];
		//the lowest value of x is set as xMin
		x[0]=xMin;
		//j is set up to be xMin and will be the number that the xInc is added to 
		double j =xMin;
		
		for (int i=1; i<x.length;i++) {
			j=j+xInc;
			x[i]=j;
		}
		//the ys are determined based upon the given formula and then the xs and ys are printed out.
		for(int i = 0;i<y.length;i++ ) {
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			
			System.out.printf("x: " + "%.3f", x[i]);
			System.out.printf(", y: " + "%.3f" , y[i]);
			System.out.print("\n" );
		}
		//the star graph is created here.
		for (int i = 0; i<x.length; i++) {
			System.out.print(":");
			for (int k = (int)(y[i]); k>0; k--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}





	}

}
