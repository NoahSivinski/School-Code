/*
 * [NetPay].java
 * Author:  [Torsa Rahman] 
 * Submission Date:  [09-10-2021]
 *
 * Purpose: This program calculates a person's gross and net pay
 * from their hourly wage, hours worked, and deductions made. 
 * It uses user input for hours per week to make calculations. 
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

	//Declares and initialized constants
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;

	// Declaring Variables
	public static void main(String[] args) {

		double grossPay, netPay, totalDeductions,federalDeductions, stateDeductions, socialSecurityDeductions, medicareDeductions;
		int hoursPerWeek;

		//get input from user
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:" + "\t" + "\t" );
		hoursPerWeek = Keyboard.nextInt();

		//calculating and initializing variables 
		grossPay = PAY_PER_HOUR * hoursPerWeek ;
		totalDeductions = ((FEDERAL_TAX_PERCENT + STATE_TAX_PERCENT + SS_PERCENT + MEDICARE_PERCENT)* grossPay)/100;
		netPay = grossPay - totalDeductions;
		federalDeductions = (FEDERAL_TAX_PERCENT * hoursPerWeek * PAY_PER_HOUR)/100;
		stateDeductions = (STATE_TAX_PERCENT * hoursPerWeek * PAY_PER_HOUR)/100;
		socialSecurityDeductions = (SS_PERCENT * hoursPerWeek * PAY_PER_HOUR)/100;
		medicareDeductions = (MEDICARE_PERCENT * hoursPerWeek * PAY_PER_HOUR)/100;

		//printing and formatting output 
		System.out.println("Gross Pay: " + "\t" + "\t" + grossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t" + "\t" + federalDeductions);
		System.out.println("State:" + "\t" + "\t" + "\t" + stateDeductions);
		System.out.println("Social Security:" + "\t" + socialSecurityDeductions);
		System.out.println("Medicare:" + "\t" + "\t" + medicareDeductions);

		Keyboard.close();
	}

}
