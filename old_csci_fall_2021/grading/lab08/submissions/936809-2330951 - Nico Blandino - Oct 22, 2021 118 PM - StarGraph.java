/*
 * StarGraph.java
 * Author:  Nicolas B
 * Submission Date:  10/22
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The program basically will print out a graph based on the number of x values you want to process
 * , the minimum value that x can be, and the amount that you will increment it by.
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
		double[] x,y;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		int number_of_x = keyboard.nextInt();
	    if(number_of_x <= 0){
	    	
	    System.out.println("The number of x values must be an integer greater than 0.");
	    System.exit(1);
	    }
	    
	    
	    System.out.print("Enter a minimum value for x: ");
	    double minimum_value = keyboard.nextDouble();
	    System.out.print("Enter the amount to increment x: ");
	    double increment = keyboard.nextDouble();
	    if(increment <= 0){
	    	System.out.println("The increment must be a decimal number greater than 0.");
	    	System.exit(1);
	    }
	    
	    x = new double[number_of_x];
	    y = new double[number_of_x];
	    x[0] = minimum_value;
	    y[0] = 20.0 * Math.abs(Math.sin(x[0]));
	    System.out.println("\nValues");
	    System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);
	    
	    for(int i = 1; i < number_of_x; i++){
	    	
	    	x[i] = x[i-1] + increment;
	        y[i] = 20.0 * Math.abs(Math.sin(x[i]));
	        System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
	    }

	    // printing the graph
	    System.out.println("\nGraph");

	    for (int i = 0; i < number_of_x ; i++) {
	    	System.out.print(":");
	        for (int j = 0; j < Math.floor(y[i]); j++) {
	        	System.out.print("*");
	        }

	        System.out.println();
	        keyboard.close();
	        }
	    }
	}
