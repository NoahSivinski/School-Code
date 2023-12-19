/*
 * StarGraph.java
 * Author:  Parth Patel
 * Submission Date:  March 26, 2021
 *
 * Purpose: The purpose of this lab is to allow the user to create a graph for the 
 * function: y=20.0*|Sin x|, allowing the user to create a graph with the number of 
 * x values and increments for x value. 
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
            System.out.println("Please enter the number of x values to process: ");
            int desiredNumber = keyboard.nextInt();
            
            
            if(desiredNumber <= 0 ){
                System.out.println("The number of x values must be an integer greater than 0.");
                
                System.exit(0);
            }

           
            System.out.println("Enter a minimum value for x: ");
            double minimumValue = keyboard.nextDouble();

            System.out.println("Enter the amount to increment x: ");
            double desiredIncrement = keyboard.nextDouble();
            
            if(desiredIncrement <= 0){
                System.out.println("The increment must be a decimal number greater than 0.");
                System.exit(0);
            }

    
            x = new double[desiredNumber];
            y = new double[desiredNumber];


            x[0] = minimumValue;
            y[0] = 20.0 * Math.abs(Math.sin(x[0]));

           
            System.out.println("\nValues");
            System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);

         
            for(int increment = 1; increment < desiredNumber; increment++){
                x[increment] = x[increment-1] + desiredIncrement;
                y[increment] = 20.0 * Math.abs(Math.sin(x[increment]));
                
                System.out.printf("x: %.3f, y: %.3f\n",x[increment], y[increment]);
            }

            System.out.println("\nGraph");
            
            
            for (int i = 0; i < desiredNumber ; i++) {
               
                System.out.print(":");
                
                for (int j = 0; j < Math.floor(y[i]); j++) {
                System.out.print("*");
                }
       
                System.out.println();
                
                
                keyboard.close();
            }
        }
    }