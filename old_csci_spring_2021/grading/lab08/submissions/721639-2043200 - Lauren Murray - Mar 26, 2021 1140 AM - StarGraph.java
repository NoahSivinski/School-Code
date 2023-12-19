/*
 * CSCI1301.java
 * Author:  Lauren Murray 
 * Submission Date:  3/26/2021
 *
 * Purpose: This program uses arrays to compute and store multiple values for 
 * x and y, determined by the minimum value of x which is inputted by the user.
 * Once a minimum x value is established, corresponding y values are computed using
 * the Math.abs and Math.sin methods. A graph of the function is then plotted using
 * the "*" character. 
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
		double[] x,y;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process:");
		//getting value from user
		int n = keyboard.nextInt();
		if (n<=0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(1);
		}
		
		System.out.print("Enter a minimum value for x: ");
		//determines the starting value for x
		double min_val = keyboard.nextDouble();
		
		System.out.print("Enter the amount to increment x:");
		//gets increment value 
		double inc = keyboard.nextDouble();
		//determines whether increment value is <= 0
		if (inc <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(1);
		}
		//creates two arrays with length entered by the user
		x = new double[n];
		y = new double[n];
		
		//initializes the first element of both arrays
		x[0] = min_val;
		y[0] = 20.0 * Math.abs(Math.sin(x[0]));
		
		System.out.println("\nValues");
		
		//this formats the x and y values correctly when they are printed
		System.out.printf("x: %.3f, y: %.3f\n", x[0], y[0]);
		
		for (int i = 1; i <n; i++) {
			x[i] = x[i-1] + inc;
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			System.out.printf("x: %.3f, y: %.3f\n", x[i], y[i]);
		}
		
		//this section prints the star graph 
		System.out.println("\nGraph");
		
		for (int i = 0; i<n; i++) {
			System.out.print(":");
			
			for (int j = 0; j< Math.floor(y[i]); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}




