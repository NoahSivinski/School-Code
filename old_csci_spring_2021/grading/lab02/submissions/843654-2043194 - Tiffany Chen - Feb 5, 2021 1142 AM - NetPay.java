/*
 * [NetPay].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [February 5, 2020]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program allows you to calculate gross pay, net pay, and tax deductions using only the hours worked per week. 
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
	public static void main (String [] args) {
		//Constants 
		final double FEDERAL_TAX_PERCENT=10.00;
		final double STATE_TAX_PERCENT=4.5;
		final double SS_PERCENT=6.2;
		final double MEDICARE_PERCENT=1.45;
		final double PAY_PER_HOUR=7.25;
		
		//Hours Per Week
		Scanner s = new Scanner(System.in);
		System.out.print("Hours worked per week");
		int hoursPerWeek = s.nextInt();
		
		//Total Weekly Pay
		double totalWeeklyPay = hoursPerWeek * PAY_PER_HOUR;
		
		// percent per tax
		double FTP = FEDERAL_TAX_PERCENT * totalWeeklyPay/100;
		double STP = STATE_TAX_PERCENT * totalWeeklyPay/100;
		double SP = SS_PERCENT *  totalWeeklyPay/100;
		double MP = MEDICARE_PERCENT * totalWeeklyPay/100;
		
		//total percent per tax 
		double totalPercentPerTax = FTP + STP + SP + MP;
		
		//Gross pay and net pay
		double grossPay = totalWeeklyPay;
		double netPay = totalWeeklyPay - totalPercentPerTax;
		
		System.out.println("Hours Per Week \t\t" + hoursPerWeek);
		System.out.println("Gross Pay \t\t" + grossPay);
		System.out.println("Net Pay \t\t" + netPay);
		System.out.println("\n");
		System.out.println("Deductions");
		System.out.println("Federal \t\t" + FTP);
		System.out.println("State \t\t\t" + STP);
		System.out.println("Social Security \t" + SP);
		System.out.println("Medicare \t\t" + MP);
		
		s.close();
		
		
		
		
		

	}
}
