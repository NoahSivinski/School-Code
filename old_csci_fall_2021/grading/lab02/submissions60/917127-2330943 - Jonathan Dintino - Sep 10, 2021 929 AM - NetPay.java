
/*
 * NetPay.java
 * Author: Jonathan Dintino
 * Submission Date: 10 September 2021
 *
 * Purpose: This program serves to first calculate the gross
 * pay based on initial variables and user input. Next, it
 * will calculate deductions based on that gross pay. Finally,
 * it will calculate the net pay based on the gross pay and
 * the deductions.
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
 *  
 */

import java.util.Scanner;

public class NetPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// constants for the calculations
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;

		// get hours per week from user input
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek = keyboard.nextInt();

		// calculate gross pay based on hours per week and pay per hour
		double grossPay = hoursPerWeek * PAY_PER_HOUR;

		// calculating deductions based on the gross pay
		double federalDeduction = grossPay * (FEDERAL_TAX_PERCENT / 100);
		double stateDeduction = grossPay * (STATE_TAX_PERCENT / 100);
		double ssDeduction = grossPay * (SS_PERCENT / 100);
		double medicareDeduction = grossPay * (MEDICARE_PERCENT / 100);

		// calculation for net pay using gross pay with deductions
		double netPay = grossPay - federalDeduction - stateDeduction - ssDeduction - medicareDeduction;

		// display results to the output
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay + "\n");

		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + ssDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);

	}

}
