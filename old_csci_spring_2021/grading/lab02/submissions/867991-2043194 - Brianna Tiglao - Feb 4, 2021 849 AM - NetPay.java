/*
 * NetPay.java
 * Author:  Brianna Tiglao 
 * Submission Date:  February 4, 2021
 *
 * Purpose: This code can be used to calculate one's net pay
 * and gross pay by inputing the amount of hours one worked
 * within the week. Deductions taken out of the gross pay
 * to calculate the net pay will also be listed.
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
		
		int hoursWeek;
		System.out.print("Hours per Week:\t\t");
		Scanner keyboard = new Scanner(System.in);
		hoursWeek = keyboard.nextInt();
		
		keyboard.close();
		
		double HOURLY_PAY = 7.25;
		double grossPay = hoursWeek * HOURLY_PAY;
		
		double FED_TAXES_PERCENT = 10.0/100;
		double STATE_TAXES_PERCENT = 4.5/100;
		double SS_TAXES_PERCENT = 6.2/100;
		double MEDICARE_TAXES_PERCENT = 1.45/100;
		
		double fedDeduction = grossPay * FED_TAXES_PERCENT;
		double stateDeduction = grossPay * STATE_TAXES_PERCENT;
		double ssDeduction = grossPay * SS_TAXES_PERCENT;
		double medicareDeduction = grossPay * MEDICARE_TAXES_PERCENT;
		
		double deductionTotal = fedDeduction + stateDeduction + ssDeduction + medicareDeduction;
		double netPay = grossPay - deductionTotal;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + fedDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + ssDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);

	}

}
