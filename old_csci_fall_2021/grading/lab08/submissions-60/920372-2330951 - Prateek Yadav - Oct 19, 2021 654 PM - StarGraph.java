/*
 * StarGraph.java
 * Author:  Prateek Yadav
 * Submission Date: 10/19/2021
 * Due Date: 10/22/2021
 *
 *
 * Code Description:
 * This program increments a given number
 * by a given increment and lists these values in
 * an array. This array is altered by a specific formula
 * and the values are placed into a second array. A graph
 * of the second array's floor values is displayed.
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
 * 
 * I agree with this statement^
 */
import java.util.Scanner;
public class StarGraph {
	public static void main(String[] args) {
		
		//Creating Scanner object
		Scanner scan = new Scanner (System.in);
		
		//Declaring and Initializing Variables
		int stars = 0;
		System.out.print("Please enter the number of x values to process: ");
		int n = scan.nextInt();
		if(n < 1) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double minimumX = scan.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment = scan.nextDouble();
		if(increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double[] xVals = new double[n];
		double[] yVals = new double[n];
		
		//X Values
		for(int i = 0; i < n; i++){
			if (i == 0) {
				xVals[i] = minimumX;
			}
			else {
				xVals[i] = xVals[i-1] + increment;
			}
		}
		//Y Values
		for(int i = 0; i < n; i++) {
			yVals[i] = 20.0 * Math.abs(Math.sin(xVals[i]));
		}
		//Printing Values
		System.out.println("\nValues");
		for(int i = 0; i < n; i ++){
			System.out.print("x: ");
			System.out.printf("%.3f", xVals[i]);
			System.out.print(", y: ");;
			System.out.printf("%.3f", yVals[i]);
			System.out.println();
		}
		//Printing Graph
		System.out.println("\nGraph");
		for(int i = 0; i < n; i++){
			stars = (int) Math.floor(yVals[i]);
			System.out.print(":");
			while(stars > 0) {
				System.out.print("*");
				stars--;
			}
			if(i != n-1){
				System.out.println();
			}
		}
		
		
		//Closing Scanner
		scan.close();
	}
}