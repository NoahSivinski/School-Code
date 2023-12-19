/*
 * [StarGraph].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [10/22/2021]
 *
 * Purpose: The purpose of this program is to prompt the user to input a minimum
 * value of x, how much they want to increment x by, and how many times they want
 * to increment it. The program should display these x values and corresponding y
 * values, where y=20*sin(absvalue(x)). The program should also print out a graph 
 * of asterisks based on the truncated y values.
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

		//declare variables and scanner
		double minX = 0;
		double y = 0;
		double values;
		double increment = 0;		
		String graph= "*";
		Scanner keyboard = new Scanner(System.in);

		//prompt user to enter how many values to process
		System.out.print("Please enter the number of x values to process: ");
		values = keyboard.nextDouble();
		
		//create array that will store user input
		int [] N = new int[(int)values];
		
		//if user input is a positive number, ask for the minimum x value and what to increment x by
		if (values > 0) {
			System.out.print("Enter a minimum value for x: ");
			minX = keyboard.nextDouble();
			System.out.print("Enter the amount to increment x: ");
			increment = keyboard.nextDouble();
			if (increment > 0) {
				//calculate each corresponding y value based on the equation below
				y = Math.abs(20 * Math.sin(Math.abs(minX)));
				
				//use for loop to increment x as many times as prompted, and print x and y values
				System.out.println("\nValues\nx: " + String.format("%.3f", minX) + ", y: " + String.format("%.3f", y));
				for (int i = 0; i < (values - 1); i ++) {
					N [i] = Math.abs((int)y);	
					minX = minX + increment;
					y = Math.abs(20 * Math.sin(Math.abs(minX)));
					if (increment > 0) {
						System.out.println("x: " + String.format("%.3f", minX) + ", y: " + String.format("%.3f", y));
					}
				}
				//display graph of * based on truncated y values
				System.out.println("\nGraph");
				for (int i=0; i < N.length; i++) {
					System.out.println(":" + graph.repeat(N[i]));
				}
			}
			else {
				System.out.print("The increment must be a decimal number greater than 0.");
			}
		}
		else {
			System.out.print("The number of x values must be an integer greater than 0.");
		}
	keyboard.close();
	}

}
