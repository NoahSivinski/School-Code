/*
 * NetPay.java
 * Author:  Scott Wagner 
 * Submission Date:  February 4th, 2021
 *
 * Purpose: This program computes weekly gross and net income with a few preset constants. 
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
 * 	Scott Wagner
 */

import java.util.Scanner;

public class NetPay {

	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double grossPay, hoursPerWeek, netPay, fedDeduction, stateDeduction, ssDeduction, medicareDeduction, totalDeduction;
		
		System.out.println("Hours per Week:");
		hoursPerWeek = input.nextDouble();
		
		grossPay = (PAY_PER_HOUR * hoursPerWeek);
		fedDeduction = grossPay * (FEDERAL_TAX_PERCENT * 10e-3); //Calculates percentages from constants and applies them to gross pay for deduct values.
		stateDeduction = grossPay * (STATE_TAX_PERCENT * 10e-3);
		ssDeduction = grossPay * (SS_PERCENT * 10e-3);
		medicareDeduction = grossPay * (MEDICARE_PERCENT * 10e-3);
		totalDeduction = (fedDeduction + stateDeduction + ssDeduction + medicareDeduction);
		netPay = grossPay - totalDeduction;
		
		
			System.out.println("Hours per Week:\t\t" + hoursPerWeek);
			System.out.println("Gross Pay:\t\t" +  grossPay);
			System.out.println("Net Pay:\t\t" + netPay);
			System.out.println("\nDeductions");
			System.out.println("Federal:\t\t" + fedDeduction);
			System.out.println("State:\t\t\t" + stateDeduction);
			System.out.println("Social Security:\t" + ssDeduction);
			System.out.println("Medicare:\t\t" + medicareDeduction);
		
			input.close();

	}

}
