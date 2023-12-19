/*
 * NetPay.java
 * Author:  Tenacity Murdie 
 * Submission Date:  8/31/2021
 *
 * Purpose: This program prompts a user for their hours worked per week. It then calculates the user's
 * gross pay and net pay using user input. The deductions used to calculate net pay are determined 
 * given fixed constants, and printed as output on the console.
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
	
	//declaring and initializing constants
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;

	public static void main(String[] args) {
		
		int hoursPerWeek;
		double grossPay, netPay, federalDeductions, stateDeductions, ssDeductions, medicareDeductions, totalDeductions;
		
		//creating object "keyboard" of class Scanner and telling computer that we want user input
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Hours per Week:\t\t"); //prompting for user input
		hoursPerWeek = keyboard.nextInt(); //initializing hoursPerWeek with user input
		
		//initializing variables and performing necessary calculations
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalDeductions = grossPay * (FEDERAL_TAX_PERCENT / 100);
		stateDeductions = grossPay * (STATE_TAX_PERCENT / 100);
		ssDeductions = grossPay * (SS_PERCENT / 100);
		medicareDeductions = grossPay * (MEDICARE_PERCENT / 100);
		totalDeductions = federalDeductions + stateDeductions + ssDeductions + medicareDeductions;
		netPay = grossPay - totalDeductions;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.print("\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeductions);
		System.out.println("State:\t\t\t" + stateDeductions);
		System.out.println("Social Security:\t" + ssDeductions);
		System.out.println("Medicare:\t\t" + medicareDeductions);
		
		keyboard.close(); //optional closing of keyboard

	}

}
