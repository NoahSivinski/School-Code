/*
 * [NetPay].java
 * Author:  [Hannah Kwak] 
 * Submission Date:  [September 10, 2021]
 *
 * Purpose: This program takes in an individual's hours per week
 * and calculates the individual's net pay, gross pay, and their
 * federal, state, social security, and medicare deductions. 
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

		// Below is all of the constants of the program.
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;

		// This is where the variables are declared. 
		int hoursPerWeek;
		double grossPay;
		double netPay;
		double federalDeductions;
		double stateDeductions;
		double socialSecurityDeductions;
		double medicareDeductions;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();

		// Calculations are written here.
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalDeductions = grossPay * (FEDERAL_TAX_PERCENT / 100); 
		stateDeductions = grossPay * (STATE_TAX_PERCENT / 100);
		socialSecurityDeductions = grossPay * (SS_PERCENT / 100);
		medicareDeductions = grossPay * (MEDICARE_PERCENT /100);
		double deductions = federalDeductions + stateDeductions + socialSecurityDeductions + medicareDeductions;
		netPay = grossPay - deductions;

		// This is where my print statements are. 
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeductions);
		System.out.println("State:\t\t\t" + stateDeductions);
		System.out.println("Social Security:\t" + socialSecurityDeductions);
		System.out.println("Medicare:\t\t" + medicareDeductions);

		keyboard.close();

	}

}
