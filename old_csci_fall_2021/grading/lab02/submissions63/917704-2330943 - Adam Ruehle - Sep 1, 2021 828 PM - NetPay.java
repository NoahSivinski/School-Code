/*
 * CSCI 1301.java
 * Author:  Adam Ruehle
 * Submission Date:  September 1, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The purpose of the program is to compute a person’s weekly earnings based 
 * on their hourly wage and hours worked per week while also taking into
 * account tax witholdings.
 *
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

	public static void main(String[] args)  {
	
		// Constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
	
		// Read Input
		Scanner HoursWorkedInput = new Scanner(System.in);
		System.out.print("Hours Per Week:" + "\t" + "\t");
		int HoursWorked = HoursWorkedInput.nextInt();
		
		// Calculate Output
		double GrossPay = PAY_PER_HOUR * HoursWorked;
		double FederalTax = GrossPay * FEDERAL_TAX_PERCENT / 100;
		double StateTax = STATE_TAX_PERCENT /100 * GrossPay;
		double SocialSecurityContribution = SS_PERCENT / 100 * GrossPay;
		double Medicare = MEDICARE_PERCENT / 100 * GrossPay;
		double NetPay = GrossPay - FederalTax - StateTax - SocialSecurityContribution - Medicare;
				
		// Screen
		System.out.println("Gross Pay:" + "\t" + "\t" + GrossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + NetPay);
		System.out.println();
		System.out.println("Deductions:");
		System.out.println("Federal:" + "\t" + "\t" + FederalTax);
		System.out.println("State:" + "\t" + "\t" + "\t" + StateTax);
		System.out.println("Social Security:" + "\t" + SocialSecurityContribution);
		System.out.println("Medicare:" + "\t" + "\t" + Medicare);
	
	}
}

