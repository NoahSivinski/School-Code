/*
 * NetPay.java
 * Author: Chase Pitser 
 * Submission Date: 9/8/21
 *
 * Purpose: This program I have created for Lab 2
 * takes an input of hours worked in a week from the user. It then calculates
 * gross pay as if working at $7.25/hour and four deductions to the
 * pay, printing them as well as subtracting their sum from the gross pay,
 * assigning this value to the net pay variable, and printing it as well.
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
		//Initializing Keyboard Scanner Object
		Scanner Keyboard = new Scanner(System.in);
		//Constants
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		//Prompt Output and Input of Hours per Week
		System.out.print("Hours per Week:\t\t");
		int hoursWorked = Keyboard.nextInt();
		//Calculations
		double grossPay = hoursWorked*PAY_PER_HOUR;
		double federalDeduction = FEDERAL_TAX_PERCENT/100*grossPay;
		double stateDeduction = STATE_TAX_PERCENT/100*grossPay;
		double ssDeduction = SS_PERCENT/100*grossPay;
		double medicareDeduction = MEDICARE_PERCENT/100*grossPay;
		double deductions = federalDeduction + stateDeduction + ssDeduction + medicareDeduction;
		double netPay = grossPay - deductions;
		//Output of Calculated Data
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + ssDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);
		Keyboard.close();
	}
	
}
