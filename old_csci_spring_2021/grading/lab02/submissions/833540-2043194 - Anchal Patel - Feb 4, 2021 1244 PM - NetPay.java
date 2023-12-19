/*
 * [NetPay].java
 * Author:  [Anchal Patel] 
 * Submission Date:  [Feburary 4, 2021]
 *
 * Purpose: The purpose of my program is to calculate gross pay,
 * net pay, deductions all from user input of hours per week.
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

import java.util. Scanner;
public class NetPay {
	
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT= 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		int hoursPerWeek;
		System.out.print("Hours per Week: \t");
		hoursPerWeek =  keyboard.nextInt();
		
		double grossPay;
		double netPay;
		double federalDeduction, stateDeduction, ssDeduction, medicareDeduction;
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalDeduction = grossPay * FEDERAL_TAX_PERCENT/100;
		stateDeduction = grossPay * STATE_TAX_PERCENT/100;
		ssDeduction = grossPay * SS_PERCENT/100;
		medicareDeduction = grossPay * MEDICARE_PERCENT/100;
		
		netPay = grossPay - federalDeduction - stateDeduction - ssDeduction - medicareDeduction;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay + "\n");
		System.out.print("Deductions" +"\n");
		
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + ssDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);
				
		keyboard.close();
	}

}
