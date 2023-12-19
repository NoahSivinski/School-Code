import java.util.*;
/*
 * StarGraph.java
 * Author:  [Anastasia Antoine] 
 * Submission Date:  [3/24/2021]
 *
 * Purpose: This program will be using two arrays and it will help 
 * make a star graph by asking the user certain questions
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
public class StarGraph {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		System.out.print("Please enter the number of x values to process:" + "\t");
		int n = input.nextInt();
		if (n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0."); 
			System.exit(1);
		}
		System.out.print("Enter a minimum value for x: ");
		double minimum_Value = input.nextDouble(); 
		System.out.print("Enter the amount to increment x: ");
		double increment_For_X = input.nextDouble();
		if (increment_For_X <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(1);
		}
		
		System.out.println("\nValues"); 
		double[] x = new double [n];
		double[] y = new double [n]; 
		
		x[0] = minimum_Value; 
		y[0] = 20.0 * Math.abs(Math.sin(x[0])); 
		
		System.out.printf("x: %.3f, y: %.3f \n", x[0], y[0]);
		
		for (int i = 1; i < n; i++) {
			x[i] = x[i - 1] + increment_For_X;
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			System.out.printf("x: %.3f, y: %.3f \n", x[i], y[i]); 
		}
		System.out.println("\nGraph");
		
		for (int i = 0; i < n; i++) {
			System.out.print(":");
			for (int k = 0; k < Math.floor(y[i]); k++) {
				System.out.print("*");
			}
			System.out.println(); 
		}

	}

}
