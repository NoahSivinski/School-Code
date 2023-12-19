/*
 * CSCI 1301.java
 * Author:  Joo Young Kang
 * Submission Date: February 8, 2021
 *
 * Purpose: The purpose of this program is help calculate a person's
 * gross and net pay based on the person's hourly wage, hours worked, 
 * and several withholdings.
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
		
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		int hoursPerWeek = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		
		double grossPay = PAY_PER_HOUR * hoursPerWeek;
		double federalDeduction = (FEDERAL_TAX_PERCENT/100) * grossPay;
		double stateDeduction = (STATE_TAX_PERCENT/100) * grossPay;
		double socialSecurity = (SS_PERCENT/100) * grossPay;
		double medicareDeduction = (MEDICARE_PERCENT/100)*grossPay;
		double totalDeduction = (federalDeduction + stateDeduction + 
												socialSecurity + medicareDeduction);
		double netPay = grossPay - totalDeduction;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay + "\n");
		
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicareDeduction);
	}

}
