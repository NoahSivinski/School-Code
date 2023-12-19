/*
 * [StarGraph].java
 * Author:  [Austin Brock] 
 * Submission Date:  [3/26/2021]
 *
 * Purpose:This program allows the user to enter a number of 
 * values to process as well as the minimum and the increment and then 
 * will return that data as well as showing a graph with it. *
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
        Scanner keyboard= new Scanner(System.in);

        
        System.out.print("Please enter the number of x values to process: ");
        int n = keyboard.nextInt();
        //checking if length is <= zero
        if(n <= 0){
            System.out.println("The number of x values must be an integer greater than 0.");
            //exit the program if true
            System.exit(1);
        }
//this will only work if the part above is false
        System.out.print("Enter a minimum value for x: ");
       double min_val = keyboard.nextDouble();

        System.out.print("Enter the amount to incrementrement x: ");
       double increment = keyboard.nextDouble();
        //checking if incrementrement value is <= zero, if true then printing error msg and exiting
        if(increment <= 0){
            System.out.println("The incrementrement must be a decimal number greater than 0.");
            System.exit(1);
        }

        // this portion will be executed only if the above condition is false
        // making 2 arrays of double type
        x = new double[n];
        y = new double[n];

        // initializing the 1st element of both the arrays
        x[0] = min_val;
        y[0] = 20.0 * Math.abs(Math.sin(x[0]));

        //calculaitng angles and storing them in y
        System.out.println("\nValues");

        // printf takes a formatted string
        // ".3f": 'f' signifies that it will be replaced by a double,
        // '.3' signifies that number of digits will be three after the decimal point
        System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);

        // 1st for loop
        for(int i = 1; i < n; i++){
            // incrementrementing the value of array x by user input
            x[i] = x[i-1] + increment;
            // calculate angle and store in y
            y[i] = 20.0 * Math.abs(Math.sin(x[i]));
            
            System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
        }

  System.out.println("\nGraph");
       
        // outer for loop will loop through the entire array y
        for (int i = 0; i < n ; i++) {
            
            System.out.print(":");
            //inner for loop will execute the whole-number part of array-y times
            // whole-number part is calculated by taking the floor of the floating point number
            for (int k = 0; k < Math.floor(y[i]); k++) {
              
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}


