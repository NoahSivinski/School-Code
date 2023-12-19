/*
 * [StarGraph.java].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [10/22/21]
 *
 * Purpose: This program will ask the user
 * to enter the number of x values they want to process. Then, 
 * the program will ask the user for the minimum value and an 
 * increment amount. The program will calculate the y values 
 * based on a certain formula. The program will print print
 * asterisks based on the y values.
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
		//asking user to enter the number of values for x, which must be greater than zero
		System.out.print("Please enter the number of x values to process: ");
		int arraySize = keyboard.nextInt();
		if(arraySize <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		//asking user to enter a minimum value for x 
		System.out.print("Enter a minimum value for x: ");
		double xMinVal = keyboard.nextDouble();
		
		//asking the user what amount they would like to increment x by, which has to be greater than zero 
		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble();
		if(increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//creating an empty array to hold x value and one to hold the values 
		double[] xArray = new double[arraySize];
		double[] yArray = new double [arraySize];
		xArray[0] = xMinVal;
		
		//saving values at each index of the array that hold the x values based on the increment
		//System.out.println(xArray[0]);
		for(int i = 1; i < xArray.length; i++) {
			xArray[i] = xArray[i - 1] + increment;
		}
		//calculating the y value given the formula and saving it in the appropriate index
		for(int i = 0; i < yArray.length; i++) {
			yArray[i] = Math.abs(20.0 * Math.sin(xArray[i]));
		}
		//printing out x and y values
		System.out.println("Values");
		for(int i = 0; i < xArray.length; i++) {
			System.out.printf("x: %1.3f, y: %1.3f", xArray[i], yArray[i]);
			System.out.println();
		}
		System.out.println();
		System.out.println("Graph");
		//printing out the graph based on the truncated y values
		for(int i = 0; i < yArray.length; i++) {
			int yValue = (int) yArray[i];
			System.out.print(":");
			for(int j = 0; j < yValue; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
	

}
