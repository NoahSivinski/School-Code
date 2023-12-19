/*
 * NetPay.java 
 * Author:  Malinda Uboh
 * Submission Date:  09/09/2021
 *
 * Purpose: This program computes taxes and pay. To use this program a user must input a number into   
 * hours per week. In response to the input the program computes gross pay, deductions,
 * and net pay. 
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
		
		
		double hoursPerWeek, grossPay, netPay, deductions, totalDeductions;
		double federal, state, socialSecurity, medicare;
		 
		//Declare and initialize named constants 
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Get the hours per week from the user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:		");
		hoursPerWeek = keyboard.nextDouble();
		
		//Calculate the value of declared variables using the values of the named constants 
		grossPay = PAY_PER_HOUR * hoursPerWeek;
		deductions = (FEDERAL_TAX_PERCENT + STATE_TAX_PERCENT + SS_PERCENT + MEDICARE_PERCENT)/100;
		totalDeductions = grossPay * deductions;
		netPay = grossPay - totalDeductions;
		federal = (FEDERAL_TAX_PERCENT/100) * grossPay;
		state = (STATE_TAX_PERCENT/100) * grossPay;
		socialSecurity = (SS_PERCENT/100) * grossPay;
		medicare = (MEDICARE_PERCENT/100) * grossPay;
		
		//Combine strings to create output 
		System.out.println("Gross Pay:		"+ grossPay);
		System.out.println("Net Pay:		"+ netPay);
		System.out.println('\t');
		System.out.println("Deductions		");	
		System.out.println("Federal:		"+ federal);
		System.out.println("State:		"+ '\t' + state);
		System.out.println("Social Security:	" + socialSecurity);
		System.out.println("Medicare:		"+ medicare);
		
	}

}
