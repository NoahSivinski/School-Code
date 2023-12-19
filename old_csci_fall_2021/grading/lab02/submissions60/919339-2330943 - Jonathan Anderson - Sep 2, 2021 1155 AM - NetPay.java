import java.util.Scanner;

/*
 * NetPay.java
 * Author:  Jonathan Anderson
 * Submission Date:  9/2/2021
 *
 * Purpose: This program calculates wages and several deductions
 * based on hours worked, which is a user input. It then outputs
 * these calculations back to the user.
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

public class NetPay {
    public static void main(String[] args){
        //Declaring tax constants
        final double FEDERAL_TAX_PERCENT = 10.00;
        final double STATE_TAX_PERCENT = 4.5;
        final double SS_PERCENT = 6.2;
        final double MEDICARE_PERCENT = 1.45;
        final double PAY_PER_HOUR = 7.25;

        //Asking for hours worked & getting user input
        System.out.print("Hours per Week:\t\t");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();

        //Calculating total pay and deductions
        double grossPay = hours * PAY_PER_HOUR;
        double fedTax = grossPay * FEDERAL_TAX_PERCENT * .01;
        double stateTax = grossPay * STATE_TAX_PERCENT * .01;
        double socialSec = grossPay * SS_PERCENT * .01;
        double medCare = grossPay * MEDICARE_PERCENT * .01;

        double netPay = grossPay - fedTax - stateTax - socialSec - medCare;

        //Outputting calculations and formatting properly
        System.out.println("Gross Pay:\t\t\t"  + grossPay);
        System.out.println("Net Pay:\t\t\t" + netPay);
        System.out.println(" ");
        System.out.println("Deductions");
        System.out.println("Federal Tax:\t\t" + fedTax);
        System.out.println("State Tax:\t\t\t" + stateTax);
        System.out.println("Social Security:\t" + socialSec);
        System.out.println("Medicare:\t\t\t" + medCare);
    }
}
