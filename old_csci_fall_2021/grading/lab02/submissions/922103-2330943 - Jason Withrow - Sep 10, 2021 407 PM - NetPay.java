/*
 * [NetPay].java
 * Author:  [Jason Withrow] 
 * Submission Date:  [09/10/2021]
 *
 * Purpose: The purpose of this program is to compute gross pay and net pay 
 * when given a certain number of hours worked. The program also computes
 * tax deductions of Federal, State, Social Security, and Meedicare.
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
		final double FEDERAL_TAX_PERCENT = 10.00; 
		
		final double STATE_TAX_PERCENT = 4.5; 
		
		final double SS_PERCENT = 6.2; 
		
		final double MEDICARE_PERCENT = 1.45; 
		
		final double PAY_PER_HOUR = 7.25; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hours per Week:\t\t");
		int HoursPerWeek = keyboard.nextInt();
		
		double grossPay = HoursPerWeek * PAY_PER_HOUR;
		System.out.println("Gross Pay:\t\t" + grossPay);
		
		double Federal = grossPay * (FEDERAL_TAX_PERCENT / 100);
		
		double State = grossPay * (STATE_TAX_PERCENT / 100);
		
		double Social = grossPay * (SS_PERCENT / 100);
		
		double Medicare = grossPay * (MEDICARE_PERCENT / 100);
		
		double netpay = grossPay - (Federal + State + Social + Medicare);
		
		System.out.println("Net Pay:\t\t" + netpay);
		
		System.out.println();
		
		System.out.println("Deductions\t\t");
		
		System.out.println("Federal:\t\t" + Federal);
		
		System.out.println("State:\t\t\t" + State);

		System.out.println("Social Security:\t" + Social);
		
		System.out.println("Medicare:\t\t" + Medicare);
		
	}

}
