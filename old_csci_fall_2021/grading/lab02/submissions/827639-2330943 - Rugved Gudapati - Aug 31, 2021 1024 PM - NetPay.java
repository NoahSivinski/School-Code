/*
 * NetPay.java
 * Author:  Rugved Gudapati
 * Submission Date:  08/31/21
 *
 * Purpose: To compute a person's gross and net pay based on their 
 * hourly wage, hours worked, and several withholdings.
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
		
		//Declaring the constants used to calculate deductions later on
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Obtaining the number of hours worked in a week from user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t");
		int hoursPerWeek = keyboard.nextInt();
		keyboard.close();
		
		//Calculating gross pay based on hours worked in a week
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		
		//Calculating all the various types of deductions on the gross pay
		double federalDeduction = grossPay * FEDERAL_TAX_PERCENT / 100;
		double stateDeduction = grossPay * STATE_TAX_PERCENT / 100;
		double ssDeduction = grossPay * SS_PERCENT / 100;
		double medicareDeduction = grossPay * MEDICARE_PERCENT / 100;
		double totalDeduction = federalDeduction + stateDeduction + ssDeduction + medicareDeduction;
		
		//Subtracting the total amount of deductions from the gross pay to calculate net pay.
		double netPay = grossPay - totalDeduction;
		
		//Printing the output in the correct format
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal: \t\t" + federalDeduction);
		System.out.println("State: \t\t\t" + stateDeduction);
		System.out.println("Social Security: \t" + ssDeduction);
		System.out.println("Medicare: \t\t" + medicareDeduction);
		
	}

}
