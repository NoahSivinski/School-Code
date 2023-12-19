
/*
 * CSCI1301.java
 * Author:  Olivia Richardson 
 * Submission Date:  March 25, 2021
 *
 * Purpose: The purpose of the lab is to use one-dimensional arrays, 
 * nested loops, loops with variable termination conditions, and
 * Math.abs and Math.sin and Math.floor methods to calculate the 
 * values of x and y and a graphical representation of the function. 
 * The program prompts for the user input of the size of the array (AKA 
 * the number values of x for which y will be computed), the minimum
 * value for x, and the value by which x is increased (the increment value).
 * After this information is gathered, there are two double arrays to hold
 * the x and y values that are both the size of the inputted value for
 * the size of the array. The array for the x value holds the minimum
 * value of x and it is incremented by the user's input value. The array 
 * for the y value is computed with the function defined within the program
 * and its corresponding value from the x-array. The aforementioned methods
 * are used to calculated the y value. Loops are used to populate the arrays 
 * with the calculated values. After computation, the values are printed
 * and then a graph of the function is printed using *. The math.floor method
 * is used to truncate the calculated value and plot it accordingly.
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
import java.util.Scanner; //imported to get user inputs

public class StarGraph {

	public static void main(String[] args) {
		// TODO PURPOSE OF LAB

		// initialize variables
		int n; // value for size N of the array, AKA number of values of x for which y will be
				// computed
		double xMinValue; // variable for the minimum value of x
		double incrementAmountofX; // variable for value by which x increases
		double[] x; // variable of base type to create array later in program
		double[] y; // variable of base type to create array later in program

		Scanner keyboard = new Scanner(System.in); // initializing keyboard

		System.out.print("Please enter the number of x values to process: "); // asking user to input the length of
																				// array x AKA number of values of x for
																				// which y will be computed

		n = keyboard.nextInt(); // getting value from user
		keyboard.nextLine(); // this line forces the program to scan the next line and get the input

		/*
		 * Below if statement addresses the instance in which the user inputs a number
		 * that is less than zero. An error message will print out and then exits the
		 * program
		 */
		if (n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0."); // error message
			System.exit(0);
		}

		// this portion will be executed only if the above condition is false
		System.out.print("Enter a minimum value for x: ");
		// getting the starting value of x
		xMinValue = keyboard.nextDouble();
		keyboard.nextLine(); // this line forces the program to scan the next line and get the input

		System.out.print("Enter the amount to increment x: ");
		// getting the increment value
		incrementAmountofX = keyboard.nextDouble();
		keyboard.nextLine(); // this line forces the program to scan the next line and get the input

		/*
		 * Below if statement addresses the instance in which the user inputs a number
		 * that is less than zero. An error message will print out and then exits the
		 * program
		 */
		if (incrementAmountofX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0."); // error message
			System.exit(0);
		}

		/*
		 * if the increment value and number of x values meet are greater than 0 the //
		 * program will continue to the calculations // creating two arrays of double
		 * type with length entered by user
		 */

		/*
		 * next two lines create the arrays for x and y values. the 'n' is the length of
		 * the array. the number is pulled from the user input for the number of x
		 * values that must be an integer greater than 0
		 */
		x = new double[n];
		y = new double[n];

		// below two lines introduce the elements of the two arrays
		x[0] = xMinValue;
		y[0] = (20.0 * Math.abs(Math.sin(x[0]))); // math.abs and math.sin methods used for calculations.

		/*
		 * calculating the angles and storing them in array y and also printing the.
		 * values to the screen. It is done in the same loop in order to reduce the
		 * computation time of the program
		 */
		System.out.println("\nValues"); // print line to introduce the calculated values

		/*
		 * below print statement addresses the correct format to print the calculated
		 * values with 3 decimal points
		 */
		System.out.printf("x: %.3f, y: %.3f\n", x[0], y[0]);

		/*
		 * below loop does the calculations for the values of and y and prints them at
		 * the same time on the same line
		 */
		for (int i = 1; i < n; i++) {

			// below line is the calculation for x value
			x[i] = x[i - 1] + incrementAmountofX;

			/*
			 * below line is the given calculation for the y value. value of y is measured
			 * in radians
			 */
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));

			System.out.printf("x: %.3f, y: %.3f\n", x[i], y[i]); // print statement of the calculated values from the
																	// loop
		}

		/*
		 * below lines print the graphical representation of the function. * used to
		 * indicated magnitude of y
		 */

		System.out.println("\nGraph"); // print line to introduced the graph of the magnitude of the calculated y
										// values

		for (int i = 0; i < n; i++) {

			System.out.print(":"); // each line of the graph starts with ":"

			for (int g = 0; g < Math.floor(y[i]); g++) {
				/*
				 * nested loop to print out the *. floor returns closest whole number value of
				 * the calculated y value
				 */

				System.out.print("*"); // prints the * correct amount of *
			}

			System.out.println();
		}
	}
}
