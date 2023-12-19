/*
 * StarGraph.java
 * Author: Nancy Bishop 
 * Submission Date: 03/23/21
 *
 * Purpose: The program is designed to use one-dimensional rays in order to
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

        //user to input the length of array x
        System.out.print("Please enter the number of x values to process: ");
        //value from user
        int n = sc.nextInt();
        //checking if length is <= zero, if true then printing error messaging and exiting
        if(n <= 0){
            System.out.println("The number of x values must be an integer greater than 0.");
            // exiting the program if condition is true 
            System.exit(1);
        }

        // this part will be executed only if the above condition is false
        System.out.print("Enter a minimum value for x: ");
        // getting the starting value of x
        double min_val = sc.nextDouble();

        System.out.print("Enter the amount to increment x: ");
   
        double inc = sc.nextDouble();
        //checking if increment value is <= zero, if true then printing error messaging and exiting
        if(inc <= 0){
            System.out.println("The increment must be a decimal number greater than 0.");
            System.exit(1);
        }

        // this portion will be executed only if the above condition is false
        // creating two arrays of double type with length entered by user
        x = new double[n];
        y = new double[n];

        // initializing the 1st element of both the arrays
        x[0] = min_val;
        y[0] = 20.0 * Math.abs(Math.sin(x[0]));

        // calculating the angles and storing them in array y and also printing the values to the screen
        // It is done in the same loop in order to reduce the computation time of the program
        System.out.println("\nValues");

        // ".3f": 'f' signifies that it will be replaced by a double,
        // '.3' signifies that number of digits will be three after the decimal point
        System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);

        // 1st for loop
        for(int i = 1; i < n; i++){
            // incrementing the value of array x by user input
            x[i] = x[i-1] + inc;
            // calculating the angle and storing in array y
            y[i] = 20.0 * Math.abs(Math.sin(x[i]));
            // printing the output to the screen
            System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
        }

        // printing the graph
        System.out.println("\nGraph");
        //2nd for loop
        // outer for loop will loop through the entire array y
        for (int i = 0; i < n ; i++) {
            // printing ":" without changing line
            System.out.print(":");
            //inner for loop will execute the whole-number part of array-y times

            for (int j = 0; j < Math.floor(y[i]); j++) {
                // printing "*" without changing line
                System.out.print("*");
            }
      
            System.out.println();
        }
    }
}
