/*
 * NetPay.java
 * Author: Ofuan Oyakhire
 * Submission Date: 02/05/21
 *
 * Purpose: Compute a person’s gross and net pay based on their hourly wage, hours worked, and several with-holdings.
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

public class NetPay {

    //constant values
    final static double FEDERAL_TAX_PERCENT = 10.00;
    final static double STATE_TAX_PERCENT = 4.5;
    final static double SS_PERCENT = 6.2;
    final static double MEDICARE_PERCENT = 1.45;
    final static double PAY_PER_HOUR = 7.25;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hours Per Week:\t\t\t\t\t ");
        int hoursPerWeek = keyboard.nextInt();

        //calculation of gross pay, net pay and deductions
        double grossPay = hoursPerWeek * PAY_PER_HOUR;
        double federal = grossPay*(FEDERAL_TAX_PERCENT/100);
        double state = grossPay*(STATE_TAX_PERCENT/100);
        double social = grossPay*(SS_PERCENT/100);
        double medicare = grossPay*(MEDICARE_PERCENT/100);
        double deductions = federal + state + social + medicare;
        double netPay = grossPay - deductions;

        //text output
        System.out.println("Gross Pay:\t\t\t\t\t\t " + grossPay);
        System.out.println("Net Pay:\t\t\t\t\t\t " + netPay);
        System.out.println("\nDeductions");
        System.out.println("Federal:\t\t\t\t\t\t " + federal);
        System.out.println("State:\t\t\t\t\t\t\t " + state);
        System.out.println("Social Security:\t\t\t\t " + social) ;
        System.out.println("Medicare:\t\t\t\t\t\t " + medicare);

        keyboard.close();

    }
}
