/*
 * [CSCI 1301].java
 * Author:  [Nicholas Corwin] 
 * Submission Date:  [3/26/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program creates two arrays of double type to store multiple values for x and y where y is defined. It'll print a graphical representation of the function showing the magnitude of y.  
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
        Scanner sc = new Scanner(System.in);

        // Prompting for user to enter length of array
        System.out.print("Please enter the number of x values to process: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("The number of x values must be an integer greater than 0.");
            System.exit(1);
        }

        // Will be executed if false
        System.out.print("Enter a minimum value for x: ");
        // Starting value for x
        double min_val = sc.nextDouble();

        System.out.print("Enter the amount to increment x: ");
        // Increment value
        double inc = sc.nextDouble();
        if(inc <= 0){
            System.out.println("The increment must be a decimal number greater than 0.");
            System.exit(1);
        }

        // If above is false then this will be executed 
        // Creating two double type arrays with user inputed lengths
        x = new double[n];
        y = new double[n];

        // 1st element of both arrays being initialized 
        x[0] = min_val;
        y[0] = 20.0 * Math.abs(Math.sin(x[0]));

        // Calculating and storing angles in array y 
        System.out.println("\nValues");

        // printf takes a formatted string 
        // 'f' showing that it'll be replaced by a double  
        // '.3' showing the digits after decimal point
        System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);

        // 1st for loop
        for(int i = 1; i < n; i++){
            // Incrementing array x value from user
            x[i] = x[i-1] + inc;
            // calculating and storing angles in array y
            y[i] = 20.0 * Math.abs(Math.sin(x[i]));
            System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
        }

        // Printing the graph
        System.out.println("\nGraph");
        // 2nd for loop
        // Outer for loop will loop through the entire array y
        for (int i = 0; i < n ; i++) {
            System.out.print(":");
            // Inner for loop will execute whole number of array
            // The floor of the floating point number calculates whole number
            for (int j = 0; j < Math.floor(y[i]); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}