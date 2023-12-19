/*
 * NetPay.java
 * Author:  Hayden Saunders
 * Submission Date:  9/1/21
 *
 * Purpose: The purpose of the following program is to take the number
 * of hours worked each week, as inputed by the user, and first calculate
 * the gross pay. It then calculates the dollar amount of money that will
 * be deducted by all of the different taxes using the different tax percentages.
 * It then prints out to the user their overall net pay and lists out the 
 * quantity of the various tax deductions.
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
	
	//Constants 
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2; 
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25; 
	
	
	public static void main(String[] args) {
		
		//Variable for number of hours per week to be inputed by user 
		int hoursPerWeek;
		
		//Create Scanner class object
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for number of hours worked per week
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		
		//Variables 
		double grossPay = (hoursPerWeek * PAY_PER_HOUR); 
		double federalTaxDeduction = ((grossPay/100) * FEDERAL_TAX_PERCENT);
		double stateTaxDeduction = ((grossPay/100) * STATE_TAX_PERCENT);
		double socialSecurityDeduction = ((grossPay/100) * SS_PERCENT);
		double medicareDeduction = ((grossPay/100) * MEDICARE_PERCENT);
		double totalDeductions = (federalTaxDeduction + stateTaxDeduction + socialSecurityDeduction + medicareDeduction);
		double netPay = (grossPay - totalDeductions);
		
		//Pay printed here 
		System.out.println("Gross Pay:    \t\t" + grossPay);
		System.out.println("Net Pay:      \t\t" + netPay + "\n");
		
		
		//Deductions printed here 
		System.out.println("Deductions");
		System.out.println("Federal:      \t\t" + federalTaxDeduction);
		System.out.println("State:        \t\t" + stateTaxDeduction);
		System.out.println("Social Security:\t" + socialSecurityDeduction);
		System.out.println("Medicare:     \t\t" + medicareDeduction);
		
		keyboard.close();
		
	}

}
