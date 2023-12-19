/*
 * StarGraph.java
 * Author: Aaron Brown
 * Submission Date: 03/23/2021
 *
 * Purpose: This program takes three user inputs to make a star graph with.
 * The three inputs are the number of values, the minimum value, and the
 * value at which to increment the inputs. Once the user has given these 
 * three inputs and given the number of values and increment value exceeds 0,
 * the program calculates the x values and stores them in an array. Using 
 * this array, the program then creates an array of y values. The y values
 * are creating using the absolute value of sin(x) times 20. Both arrays values
 * are then printed and then finally a star graph of the y values is printed by 
 * using the floor values of the y-values.
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
		Scanner input = new Scanner (System.in);
		//The user is prompted for the amount of x values, increment value, and minimum value.
		System.out.print("Please enter the number of x values to process: ");
		int numberOfValues = input.nextInt();
		//Checks that the values is more than 0
		if(numberOfValues <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double minimumValue = input.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double incrementValue = input.nextDouble();
		//Checks that increment value exceeds 0.
		if(incrementValue <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		input.close();
		//The array of x values is established.
		double xValues [] = new double[numberOfValues];
		//nextValue is established to carry the next value to be stored into the array.
		double nextValue = minimumValue;
		for(int i = 0; i < numberOfValues; i++) {
			//If its the first value nextValue is stored into the array at minimumValue.
			if(i == 0) {
				xValues[i] = nextValue;
			}
			//Otherwise the increment value is added and that value is stored in the array.
			else {
				nextValue = nextValue + incrementValue;
				xValues[i] = nextValue;
			}
		}
		//The array of y values is established.
		double yValues [] = new double[numberOfValues];
		for(int i = 0; i < numberOfValues; i++) {
			//Using the xValues array and the appropriate y calculation y values are calculated.
			yValues[i] = 20.0 * (Math.abs(Math.sin(xValues[i])));
		}
		//The program prints out the values of both arrays in a formatted list.
		System.out.println("\nValues");
		for(int i = 0; i < numberOfValues; i++) {
			//The following if makes sure that -0.000 will not be printed.
			if(xValues[i] < 0 && xValues[i] > -0.001) {
				xValues[i] = Math.round(xValues[i]*1000.0/1000);
			}
			System.out.printf("x: %.3f, y: %.3f %n" , xValues[i], yValues[i]);
		}
		//The program prints out the star graph.
		System.out.println("\nGraph");
		for(int i = 0; i < numberOfValues; i++) {
			//This starts a new line if there are more values than 1.
			if(i > 0) System.out.print("\n");
			/* This truncates the y values so that only the non-decimal number
			 * is acknowledged in printing the star graph.
			 */
			double numberOfStars = Math.floor(yValues[i]);
			//The graph line and stars are printed.
			System.out.print(":");
			for(int j = 0; j < numberOfStars; j++) {
				System.out.print("*");
			}
		}
	}

}
