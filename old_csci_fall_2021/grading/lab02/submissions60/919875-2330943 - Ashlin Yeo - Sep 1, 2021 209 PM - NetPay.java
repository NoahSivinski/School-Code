/*
 * NetPay.java
 * Author: Ashlin Yeo
 * Submission Date: 9/1/2021
 *
 * Purpose: The program computes a person’s gross and net pay based on their hourly wage, hours worked, and several withholdings. 
 * After the user inputs the hours worked per week, the program computes gross and net pay, as well as deductions.
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
		
		final double FEDERAL_TAX_PERCENT = 10.00, STATE_TAX_PERCENT = 4.5, SS_PERCENT= 6.2, MEDICARE_PERCENT= 1.45, PAY_PER_HOUR = 7.25;
		double grossPay, netPay, federalDeduction, stateDeduction, ssDeduction, medicareDeduction;
		int hoursPerWeek;
		
		//User input for hours per week is needed before other values can be calculated
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t"); 
		hoursPerWeek = keyboard.nextInt();
		
		//Gross pay calculation based on hours per week and deduction calculations based on gross pay
		grossPay =  hoursPerWeek * PAY_PER_HOUR; 
		federalDeduction = grossPay * (FEDERAL_TAX_PERCENT / 100);
		stateDeduction = grossPay * (STATE_TAX_PERCENT / 100);
		ssDeduction = grossPay * (SS_PERCENT / 100);
		medicareDeduction = grossPay * (MEDICARE_PERCENT / 100);
		netPay = grossPay - (federalDeduction + stateDeduction + ssDeduction + medicareDeduction);
		
		//Output labels gross pay, net pay, and deductions
		System.out.print("Gross Pay: \t\t" + grossPay);
		System.out.print("\nNet Pay: \t\t" + netPay);
		System.out.print("\n\nDeductions");
		System.out.print("\nFederal: \t\t" + federalDeduction);
		System.out.print("\nState:\t\t\t" + stateDeduction);
		System.out.print("\nSocial Security: \t" + ssDeduction);
		System.out.print("\nMedicare: \t\t" + medicareDeduction);

		keyboard.close();

	}

}

