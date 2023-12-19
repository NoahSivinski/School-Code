/*
 * StringFun.java
 * Author: Ofuan Oyakhire
 * Submission Date: 03/26/21
 *
 * Purpose: use 2 arrays to store x and y values.
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


        Scanner keyboard = new Scanner(System.in);

        // initialize variables
        int sizeOfArrays;
        double xMin;
        double incrementValue;

        // Prompt the user for the number of x values to process.
        System.out.print("Please enter the number of x values to process: ");
        sizeOfArrays = Integer.parseInt(keyboard.nextLine());
        if (sizeOfArrays <= 0) {
            System.out.println("The number of x values must be an integer greater than 0.");
            return;
        }

        // Enter the minimum value for x
        System.out.print("Enter a minimum value for x: ");
        xMin = Double.parseDouble(keyboard.nextLine());

        // Enter the increment value of x
        System.out.print("Enter the amount to increment x: ");
        incrementValue = Double.parseDouble(keyboard.nextLine());
        if (incrementValue <= 0) {
            System.out.println("The increment must be a decimal number greater than 0.");
            return;
        }


        // Two double arrays for x and y values
        double[] xValues = new double[sizeOfArrays];
        double[] yValues = new double[sizeOfArrays];



       // x values are computed by starting with min x and incrementing;
       // y values are computed by the given formula

        for (int i = 0; i < sizeOfArrays; i++) {
            if (i == 0) {
                xValues[0] = xMin;
            } else {
                xValues[i] = xValues[i - 1] + incrementValue;
            }
            yValues[i] = 20 * Math.abs(Math.sin(xValues[i]));
        }
        System.out.println();

        // Output the values of x and y
        System.out.println("Values");
        for (int i = 0; i < sizeOfArrays; i++) {
            double x = Math.round(xValues[i] * (double) 1000) / (double) 1000;
            double y = Math.round(yValues[i] * (double) 1000) / (double) 1000;
            System.out.printf("x: %.3f, y: %.3f", x, y);
            System.out.println();
        }

        // output of y values
        System.out.println("\nGraph");
        for (int i = 0; i < sizeOfArrays; i++) {
            System.out.print(":");
            for (int j = 0; j < (int) yValues[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
