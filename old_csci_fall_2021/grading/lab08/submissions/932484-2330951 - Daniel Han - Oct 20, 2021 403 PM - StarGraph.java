/*
 * [StarGraph].java
 * Author:  [Daniel Han] 
 * Submission Date:  [10/20/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program will receive 3 inputs from the user. It will receive the size of the array, the starting x value, and the amount the x will increment with. The program will then create an x array given all 3 inputs
 * Then the program will create another array y using a mathematical expression. Then it will output the arrays in number form and it will also print asterisks for y.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */



//import the scanner class
import java.util.Scanner;
public class StarGraph {
	public static void main(String[] args) {
		//creates a new scanner object
		Scanner keyboard = new Scanner(System.in);
		//creating int variable for the size of the array and an integer to hold how many times to print the asterisk
		int sizeArray; int yInt;
		//creating double variables like the minimum value of x and the increment value for x
		double minX; double incrX;
		//creates double variables for the y array like yConv which holds the x value converted 
		double yConv;



		//asks for the array size and assigns it to sizeArray 
		System.out.print("Please enter the number of x values to process: ");
		sizeArray = keyboard.nextInt();
		//if sizeArray is negative or 0, then the program exit
		if (sizeArray <= 0 ) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		//asks for the minimum value of x, then assigns it to minX and asks for the increment of x and assigns it to incrX
		System.out.print("Enter a minimum value for x: ");
		minX = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		incrX = keyboard.nextDouble();
		//if the amount to increment is negative or 0, the program exits
		if (incrX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		//creates two new arrays for x and y and using the sizeArray variable and sets the first index of arrayX as minimum value of x
		double[] arrayX = new double[sizeArray];
		double[] arrayY = new double[sizeArray];
		arrayX[0] = minX;

		//assigns all the values of array X in their corresponding indexes using a for loop
		for (int i = 1; i < arrayX.length; i++) {
			arrayX[i] = arrayX[i-1] + incrX;
		}
		//assigns all the values of array Y in their corresponding indexes using a for loop
		for (int i = 0; i < arrayY.length; i++) {
			//converts the x value to the y value using the formula we were given in the lab
			yConv = 20.0 * Math.abs(Math.sin(arrayX[i]));
			//sets each index of y to yConv
			arrayY[i] = yConv;
		}
		//outputs the x and y indexes using a for loop following proper I/O
		System.out.println("");
		System.out.println("Values");
		for (int i = 0; i < arrayX.length; i++) {
			//outputs the x array index
			System.out.printf("x: " + "%.3f" + ", ", arrayX[i]);
			//outputs the y array index
			System.out.printf("y: " + "%.3f" + "%n", arrayY[i]);
		}
		
		//outputs the graph
		System.out.println("Graph");
		for (int i = 0; i < arrayX.length; i++) {
			//sets yInt to a truncated, integer version using the values inside arrayY
			yInt = (int) Math.floor(arrayY[i]);
			System.out.print(":");
			//using a for loop to print the asterisks
			for (int j = 0; j < yInt; j++) {
				System.out.print("*");
				
			}
			//at the end of the loop, create a new line
			System.out.println("");
			
		}
		
	} 


}
