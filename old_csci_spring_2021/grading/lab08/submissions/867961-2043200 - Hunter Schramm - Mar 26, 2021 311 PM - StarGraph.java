/**
 * 
 */

/**
 * @author hunterschramm
 *
 *
 * [StarGraph].java
 * Author:  [Hunter Schramm] 
 * Submission Date:  [03/26/21]
 *
 * Purpose: This program uses user input to increment and process x values.
 * The program then displays all x and y values, given the conditions,
 * and a graph of the y values. 
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
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        double[] x,y;
        Scanner keyboard = new Scanner(System.in);

        // prompting user for the length of array x
        System.out.print("Please enter the number of x values to process: ");
        int N = keyboard.nextInt();
        
        // error message if length is less than or equal to 0
        if(N <= 0){
            System.out.println("The number of x values must be an integer greater than 0.");
            System.exit(1);
        }

        // prompting user for minimum value of x
        System.out.print("Enter a minimum value for x: ");
        double min_val = keyboard.nextDouble();

        // prompting user for the amount to increment  x
        System.out.print("Enter the amount to increment x: ");
        double inc = keyboard.nextDouble();
        
        // error message if the increment is less than or equal to 0
        if(inc <= 0){
            System.out.println("The increment must be a decimal number greater than 0.");
            System.exit(1);
        }

        // two arrays with the user length
        x = new double[N];
        y = new double[N];
        
        //the values of the arrays
        x[0] = min_val;
        y[0] = 20.0 * Math.abs(Math.sin(x[0]));

        System.out.println("\nValues");
        
        //print x and y
        System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);

        // for loop
        for(int i = 1; i < N; i++){
            // using increment given by user  
            x[i] = x[i-1] + inc;
            
            
           	//angle calculation
            y[i] = 20.0 * Math.abs(Math.sin(x[i]));
            
            //if statement to fix -0.000
            if (x[i] == -1.6653345369377348E-16) {
            	x[i] = 0.000;
            }

            // output
            System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
            
        }
        
        
       
        	
        // printing the graph
        System.out.println("\nGraph");
        
        // for loop for graph
        for (int i = 0; i < N ; i++) {
            System.out.print(":");
            
            // whole-number is the floor of the floating point number
            for (int j = 0; j < Math.floor(y[i]); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}