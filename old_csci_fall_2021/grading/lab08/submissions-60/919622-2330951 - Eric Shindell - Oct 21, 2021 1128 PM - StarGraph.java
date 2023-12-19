/*
 * StarGraph.java
 * Author:  Eric Shindell
 * Submission Date:  10/21/2021
 *
 * Purpose: This code takes three inputs from the user in order to create two arrays
 * and a star graph from those arrays. It first takes the length of the two arrays,
 * then the first variable of the X array, and finally what to increment that first
 * variable by. The Y array is based off of the X array, with it being equal to 
 * y = 20.0 * sin|x|, to the third decimal place. After getting all the arrays to their
 * maximum values, it turns each Y into an int and graphs that number of stars on
 * a bar graph.
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
		//Variables
		int numberOfX;
		double minimumX;
		double increment;
		
		int loopInt;
		
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Gets the values from the user
		System.out.print("Please enter the number of x values to process: ");
		numberOfX = input.nextInt();
		
		//Checks to make sure numberOfX is valid
		if (numberOfX <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		minimumX = input.nextDouble();
		
		System.out.print("Enter the amount to increment x: ");
		increment = input.nextDouble();
		
		//Checks to make sure increment is valid
		if (increment <= 0 ) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
	
		//Creates the two arrays based on the above information
		double ArrayX[] = new double[numberOfX];
		double ArrayY[] = new double[numberOfX];
		
		System.out.println("");
		
		System.out.println("Values");
		
		//Poor man's for loop
		loopInt = 0;
		while (loopInt < numberOfX) {
			ArrayX[loopInt] = minimumX;
			ArrayY[loopInt] = 20.0 * Math.abs(Math.sin(minimumX));
			minimumX = minimumX + increment;
			
			//Prints out the values line by line while they are being created
			System.out.printf("x: %.3f", ArrayX[loopInt]);
			System.out.printf(", y: %.3f", ArrayY[loopInt]);
			System.out.println("");
			loopInt++; //Increments by one
		}
		
		System.out.println("");
		
		System.out.println("Graph");
		//Poor man's for loop, part 2
		loopInt = 0;
		while (loopInt < numberOfX) {
			System.out.print(":");
			for(int i = 0; i < (int) ArrayY[loopInt]; i++) {
				System.out.print("*");
			}
			System.out.println("");
			loopInt++;
		}
	
		
		
		
		input.close();
	}

}
