/*
 * [CSCI 1301].java
 * Author:  [Fehintola Kofo-Idowu] 
 * Submission Date:  [3/5/2021]
 *
 * Purpose: This progam stores multiple values for x and y both the values
for x and y are computed based on input from the user. Once the values are found, the program should
print them out as indicated by the examples. The program should also print out a graphical representation
of the function, using a sequence of ‘*’s to indicate the magnitude of y.
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
//import java.lang.Math;

public class StarGraph {

	public static void main(String[] args) {
		// Allows user to input value
		Scanner input = new Scanner(System.in);       
	      
	       //Asks the user to input a size N of the array
	       System.out.print("Please enter the number of x values to process: ");
	       int N = input.nextInt();
	       
	       //Checks if the value entered as N is greater than 0 else, an error message is printed and the program stops	       
	       if(N <= 0) {
	           System.out.println("The number of x values must be an integer greater than 0.");
	           System.exit(0);
	       }
	       System.out.print("Enter a minimum value for x: ");
	       double Xmin= input.nextDouble();
	       
	       //Allows the user to input an increment value for x
	       System.out.print("Enter the amount to increment x: ");
	       double increaseX = input.nextDouble();
	       
	     //Checks if the value entered as increment is greater than 0 else, an error message is printed and the program stops	 
	       if(increaseX <= 0){
	            System.out.println("The increment must be a decimal number greater than 0.");
	            System.exit(0);
	        }
	       
	       // Creates two double arrays to hold the values of x and y
	       double[] x = new double[N];
	       double[] y = new double[N];
	       
	       //assign the index 0 of x and y to constants, where index 0 of x = xmin and index 0 of y = 20 * |sin(x[0])|
	       x[0] = Xmin;
	       y[0] = 20.0 * Math.abs(Math.sin(x[0]));
	       
	       //creates a loop to fill the other indices of x and y with the values gotten from the calculations
	       for(int i=1; i<N; i++) {
	           x[i] = x[i-1] + increaseX;
	           y[i] = 20.0* Math.abs(Math.sin(x[i]));
	       }System.out.println("\nValues");
	       
	       //creates a loop to print the calculated values of x and y 
	       
	       for(int i=0; i<N; i++) {
	    	   System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
	       }System.out.println();
	       
	       System.out.println("Graph");
	       
	      //creates a loop to print the values of x and y
	       for(int i=0; i<N; i++) {
	           System.out.print(":");
	           for(int j=0; j<(int)y[i]; j++) {
	               System.out.print("*");
	           }
	           System.out.println();
	       }
	       input.close();

	}

}
