/*
 * NetPay.java
 * Author:  Evan McKinney
 * Submission Date:  9/9/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *	This program gets input for how many hours a week the user worked. 
 *	It then out puts the gross and net pay of the user's salary. It also
 *	lists the each deduction and the amount.
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
	//Initializes all of the constants
	public static final double FEDERAL_TAX_PERCENT = 10.0;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		//Input
		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek = keyboard.nextInt();
		
		//Calculates the value of gross pay, then each deduction, then net pay
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federalDeduction = grossPay * (FEDERAL_TAX_PERCENT / 100);
		double stateDeduction = grossPay * (STATE_TAX_PERCENT / 100);
		double ssDeduction = grossPay * (SS_PERCENT / 100);
		double medicareDeduction = grossPay * (MEDICARE_PERCENT / 100);
		double netPay = grossPay - federalDeduction - stateDeduction - ssDeduction - medicareDeduction;
		
		//Output
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + ssDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);
		
		keyboard.close();
	}
	
}
