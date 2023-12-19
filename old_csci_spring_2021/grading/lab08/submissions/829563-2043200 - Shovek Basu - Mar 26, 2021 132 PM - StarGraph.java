/*
 * [StarGraph].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [3/26/2021]
 *
 * Purpose: make a star graph
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
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		//prompts user to input x values to process and how much to increment them 
		System.out.print("Please enter the number of x values to process: ");
		int xValuesToProcess= keyboard.nextInt();
		
		//checks to make sure that a positive nonzero value was enter for size N array
			if (xValuesToProcess <= 0) {
			System.out.println("Error: Please enter a value that is greater than 0");
			System.exit(0);
			}
		
		System.out.print("Enter a minimum value for x: ");
		double minimumXValue = keyboard.nextDouble();
		
		System.out.print("Enter the amount to increment x: ");
		double incrementAmount = keyboard.nextDouble();
		
		//checks the increment variable to make sure its a value greater than 0
			if (incrementAmount <= 0) {
			System.out.println("Error: Please enter a positive value greater than 0");
			System.exit(0);
			}
		//creates the x array to store the values specified by previous user input
		double [] xArray = new double [xValuesToProcess];
		double [] yArray = new double [xValuesToProcess];
		
		System.out.println("\nValues");
		//prints out the array to 3 decimal places from the examples
		for (int index = 0; index < xValuesToProcess; index ++) {
			xArray[index] = minimumXValue + (index*incrementAmount); 
			yArray[index] = 20.0 * Math.abs((Math.sin(xArray[index])));
			System.out.printf("x: %1.3f, y: %1.3f \n", xArray[index], yArray[index]);
			
		}
		//prints the star graph 
		 System.out.println("\nGraph");
		 for (int index = 0; index < xValuesToProcess; index++) {
			xArray[index] = minimumXValue + (index*incrementAmount); 
			yArray[index] = 20.0 * Math.abs((Math.sin(xArray[index])));
			int starsOnGraph = (int) yArray[index];
			
			// the array length is divided by the xValuesToProcess to print colons
			for (int graphIndex = 0;graphIndex < (yArray.length / xValuesToProcess) ; graphIndex++) {
				System.out.print(":");
				
				//prints the stars after the colon is printed
				for(int numberOfStars =0; numberOfStars <starsOnGraph; numberOfStars++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
		 keyboard.close();
		
		 
		 
		
		
	}
}
