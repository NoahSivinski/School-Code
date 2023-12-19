/*
 * NetPay.java
 * Author:  Claire Fortenberry 
 * Submission Date:  9 September 2021
 *
 * Purpose: This program prompts the user to input a value for the number of hours worked.
 * The program will then use given values for several withholdings such as the federal tax percent, 
 * state tax percent, social security, medicare, as well as the hourly wage and hours worked to compute 
 * and display a person's gross pay, net pay, and the total amount of deductions. 
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

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Declare constants
		final double FEDERAL_TAX_PERCENT = 0.100;
		final double STATE_TAX_PERCENT = 0.045;
		final double SS_PERCENT = 0.062;
		final double MEDICARE_PERCENT = .0145;
		final double PAY_PER_HOUR = 7.25;
		
		System.out.print("Hours per Week:\t\t");
		double hours = input.nextDouble();
		
		// Use given tax percentages to calculate deductions 
		double grossPay = PAY_PER_HOUR * hours;
		double fedDeduction = grossPay * FEDERAL_TAX_PERCENT;
		double stateDeduction = grossPay * STATE_TAX_PERCENT;
		double ssDeduction = grossPay * SS_PERCENT;
		double medDeduction = grossPay * MEDICARE_PERCENT;
		double totalDeduction = fedDeduction + stateDeduction + ssDeduction + medDeduction;
		double netPay = grossPay - totalDeduction;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + fedDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + ssDeduction);
		System.out.println("Medicare:\t\t" + medDeduction);
		
		input.close();
		
	}

}
