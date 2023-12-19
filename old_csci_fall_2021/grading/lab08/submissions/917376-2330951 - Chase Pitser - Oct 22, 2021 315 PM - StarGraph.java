/*
 * StarGraph.java
 * Author: Chase Pitser
 * Submission Date: 10/22/2021
 *
 * Purpose: This program take an input of how many x values to evaluate y for, 
 * the starting/initial x value, and how much to increment in order to get to the 
 * next x value. It then calculates y by 20 times the absolute value of the sin of x.
 * The program puts all these values in separate arrays and then prints the values
 * along with a graph of the values made of "*"s.
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
		System.out.print("Please enter the number of x values to process: ");
		int numOfValues = keyboard.nextInt();
		keyboard.nextLine();
		if(numOfValues<=0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		//creation of arrays
		double[] xValues = new double[numOfValues];
		double[] yValues = new double[numOfValues];
		System.out.print("Enter a minimum value for x: ");
		double minValueOfX = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter the amount to increment x: ");
		double incOfX = keyboard.nextDouble();
		keyboard.nextLine();
		if(incOfX<=0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		//setting x values to array
		for(int i=0; i<numOfValues; i++) {
			if(i==0) {
				xValues[i] = minValueOfX;
			}else {
				xValues[i] = xValues[i-1] + incOfX;
			}
		}
		//setting y values to array
		for(int i=0; i<numOfValues; i++) {
			yValues[i] = 20 * Math.abs(Math.sin(xValues[i]));
		}
		System.out.println("\nValues");
		for(int i=0; i<numOfValues; i++) {
			if(xValues[i]>-0.0001 && xValues[i]<0.0001) {
				System.out.printf("x: 0.000, y: %.3f",yValues[i]);
			}else {
				System.out.printf("x: %.3f, y: %.3f", xValues[i], yValues[i]);
			}
			System.out.print("\n");
		}
		System.out.println("\nGraph");
		for(int i=0; i<numOfValues; i++) {
			System.out.print(":");
			for(int j=0; j<(int)yValues[i]; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		keyboard.close();
	}

}
