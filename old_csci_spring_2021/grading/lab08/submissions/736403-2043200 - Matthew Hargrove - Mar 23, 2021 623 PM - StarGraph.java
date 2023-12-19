/*
 * ParseTheTweet.java
 * Author:  Matthew Hargrove 
 * Submission Date:  03/23/2021
 *
 * Purpose: To find the y outputs and x outputs based on the amount of repetitions, mininmun x value, and incremental 
 * x increases imputed by the user. Then it graphs these. 
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
		
		int num=0;
		double  incr= 0, xMin=0;
		
		
		System.out.print("Please enter the number of x values to process: ");
		num= keyboard.nextInt();
		if (num<=0) {
			System.out.print("The number of x values must be an integer greater than 0.");
			System.exit(0);}
		System.out.print("Enter a minimum value for x: ");
		
		xMin= keyboard.nextInt();
		System.out.print("Enter the amount to increment x: ");
		
		incr=keyboard.nextDouble();
		if (incr<=0) {
			System.out.print("The increment must be a decimal number greater than 0.");
		System.exit(0);}
		System.out.print("Values\n");
		
		double[] x= new double[num];
		double[] y= new double[num];
		
		x[0]=xMin;
		y[0]= 20* Math.abs(Math.sin(xMin));
		
		System.out.printf("x: %.3f, y: %.3f\n", x[0], y[0]);
		for (int i=1; i<num; i++) {
			x[i]=x[i-1]+ incr;
			y[i]=20* Math.abs(Math.sin(x[i]));
			System.out.printf("x: %.3f, y: %.3f\n", x[i], y[i]);
		}
		
		System.out.println("\nGraph");
		for (int i=0; i<num; i++) {
			System.out.print(":");
			for (int a=0; a<Math.floor(y[i]); a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
	}

}
