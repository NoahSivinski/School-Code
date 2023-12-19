/*
 * CSCI1301.java
 * Author:  Brooks Ruehle
 * Submission Date:  9/9/2021
 *
 * Purpose: This program calculates weekly earning based on hourly wage and tax deductions
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
		Scanner keyboard = new Scanner(System.in);
		
		double FEDERAL_TAX_PERCENT = 10.0;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
				
		int weeklyHours;
		
		System.out.print("Hours Per Week: \t");
		weeklyHours = keyboard.nextInt();
		
		double grossPay = weeklyHours*PAY_PER_HOUR;
		
		double federalTax = grossPay*FEDERAL_TAX_PERCENT/100;
		double stateTax = grossPay*STATE_TAX_PERCENT/100;
		double ssTax = grossPay*SS_PERCENT/100;
		double medTax = grossPay*MEDICARE_PERCENT/100;
		
		double totalDeductions = federalTax+stateTax+ssTax+medTax;
		
		double netPay = grossPay-totalDeductions;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions:");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State: \t\t\t" + stateTax);
		System.out.println("Social Security:\t" + ssTax);
		System.out.println("Medicare:\t\t" + medTax);
	}

}
