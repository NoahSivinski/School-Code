import java.util.Scanner;

/*
 * StarGraph.java
 * Author:  Jonathan Anderson
 * Submission Date:  10/22/2021
 *
 * Purpose: Program prints a sin graph to the user based off given inputs, using '*' to represent y values.
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
public class StarGraph {
    public static void main(String[] args){
        //Prompting user for input for array size
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of x values to process: ");
        int arraySize = input.nextInt();

        //Prompting user for first value of x
        System.out.print("Enter a minimum value for x: ");
        double xMin = input.nextDouble();

        //Prompting user for amount to increase x by
        System.out.print("Enter the amount to increment x: ");
        double xIncrease = input.nextDouble();
        System.out.println("");

        //Creating array that stores x value and initializing first index to minimum x value
        double[] xValues = new double[arraySize];
        xValues[0] = xMin;

        double[] yValues = new double[arraySize];

        //Filling each index with incremented x values
        for(int i = 1; i < xValues.length; i++){
            xValues[i] = xValues[i - 1] + xIncrease;
        }

        //Calculating y values based off given formula
        for(int i = 0; i < yValues.length; i++){
            yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
        }

        //Printing formatted values back to user
        System.out.println("Values");
        for(int i = 0; i < arraySize; i++){
            System.out.printf("x: %1.3f, y: %1.3f%n", xValues[i],yValues[i]);
        }
        System.out.println("");

        //Printing graph to user
        System.out.println("Graph");

        String stars = "";
        for(int i = 0; i < yValues.length; i++){
            //Gets count for number of stars to print
            int starCount = (int) yValues[i];
            //Creates string with appropriate number of stars
            while(stars.length() != starCount){
                stars += "*";
            }
            //prints stars to user, then resets the string of stars to be empty for next iteration of loop
            System.out.println(":" + stars);
            stars = "";
        }
    }
}
