import java.util.Scanner;
import java.util.Scanner;

/*
 * NetPay.java
 * Author:           Aiden Hammond
 * Submission Date:  August 31, 2021
 *
 * Purpose: This program displays the net pay after taxes for a given income, as well as the associated taxes, gross pay,
 * and hours per week. It does so using basic variables and print statements, as well as spacing and a bit of math.
 * The program is coded in such as way that without changing constants (listed below), by only changing the hours worked
 * per week, and entirely new output is generated.
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
    // Main method
    public static void main(String[] args){


        // Constants
        // Tax constants that are percentages, thus 10.00 = 10%
        // Pay per hour, which defines gross pay using hours per week
        double FEDERAL_TAX_PERCENT = 10.00;
        double STATE_TAX_PERCENT = 4.5;
        double SS_PERCENT = 6.2;
        double MEDICARE_PERCENT = 1.45;
        double PAY_PER_HOUR = 7.25;

        // User input to get hours per week worked
        // Scanner object that gets user input
        Scanner input = new Scanner(System.in);
        // Prompts user for hours per week
        System.out.print("Hours per Week:     ");
        // Sets hours_per_week to the users input
        int hours_per_week = input.nextInt();

        // Taxes, gross/net pay, hours per week
        // Printed variables
        // Math that calculates each tax and its total deduction from the gross pay
        // Gross and net pay which define money received before and after taxes respectively.
        double gross_pay = hours_per_week * PAY_PER_HOUR;
        // Divided by 100 to convert percentages into real numbers
        double federal = gross_pay*FEDERAL_TAX_PERCENT/100;
        double state = gross_pay*STATE_TAX_PERCENT/100;
        double social_security = gross_pay*SS_PERCENT/100;
        double medicare = gross_pay*MEDICARE_PERCENT/100;
        // Subtract taxes from gross pay to get net
        double net_pay = gross_pay - federal - state - social_security - medicare;

        // Output
        System.out.println("Gross Pay:          " + gross_pay);
        System.out.println("Net Pay:            " + net_pay);
        System.out.println("");
        System.out.println("Deductions");
        System.out.println("Federal:            " + federal);
        System.out.println("State:              " + state);
        System.out.println("Social Security:    " + social_security);
        System.out.println("Medicare:           " + medicare);

    }
}
