/*
 * StarGraph.java
 * Author:  Evan Eastabrooks 
 * Submission Date:  3/26/2021
 *
 * Purpose: StarGraph.java is a program that takes inputs from
 * a user and turns those inputs into a table of values and
 * creates a graph from those values. The user inputs how many
 * x values to create, what number to start at, and how much they
 * want x to increase by. The y values are determined through a 
 * formula and they will create the height of each line of the
 * graph.
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
		System.out.print("Please enter the number of x values to process: ");
		Scanner keyboard = new Scanner(System.in);
		int numOfXValues = keyboard.nextInt(); //gets user input for number of x values
		if(numOfXValues <= 0) { //if this number is negative or 0, will print error message
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double minValueOfX = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double amountToIncX = keyboard.nextDouble();
		
		if(amountToIncX > 0) { //if this number negative or 0, will print error message
			double[] xValuesArray = new double[numOfXValues]; //creates array for x values
			double[] yValuesArray = new double[numOfXValues]; //creates array for y values
			double valuesOfX = minValueOfX; //creates variable separate from user input; easier to follow
			System.out.println("\nValues");
			for(int i = 0; i < numOfXValues; i++) { //loop prints out amount of lines equal to number of x values
				xValuesArray[i] = Math.round(valuesOfX * 100000.0)/100000.0; //rounds the numbers to comply with examples. Gets rid of -0.000 issue
				yValuesArray[i] = (20 * Math.abs(Math.sin(xValuesArray[i]))); //formula for getting y values
				System.out.printf("x: %.3f" ,xValuesArray[i]); //prints x values
				System.out.printf(", y: %.3f\n" ,yValuesArray[i]); //prints y values
				valuesOfX = valuesOfX + amountToIncX; //setting up next iteration
			}
			System.out.println("\nGraph");
			for(int i = 0; i < yValuesArray.length; i++) { //loop prints out amount of lines equal to number of x values
				yValuesArray[i] = Math.round(yValuesArray[i] * 100)/100; //rounds y values to print out the right number of *'s
				double stars = yValuesArray[i];
				System.out.print(":");
				for(int k = 0; k < stars; k++) { //prints out correct number of stars
					System.out.print("*");
				}
				System.out.println(); //new line for a new iteration
			}
		}
		else {
			System.out.println("The increment must be a decimal number greater than 0.");
		}
		keyboard.close();
	}
}
		
