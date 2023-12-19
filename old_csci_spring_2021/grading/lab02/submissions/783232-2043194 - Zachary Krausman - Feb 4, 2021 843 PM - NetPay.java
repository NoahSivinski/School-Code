/*
 * NetPay.java
 * Author:  Zachary Krausman 
 * Submission Date:  4 February 2021
 *
 * Purpose: A program that calculates the net pay of a worker based on the number of hours that they worked.
 * The number of hours they worked is input by the user. All applicable fees are subtracted from their gross pay
 * to retrieve the net pay.
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
		
		// Constant declarations
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		// Asks user for amount of hours they worked to output correct values
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		int weeklyHours = keyboard.nextInt();
		keyboard.close(); // closes input to stop resource leak
		
		double grossPay = PAY_PER_HOUR * weeklyHours;
		
		// Declarations and calculations for the deductions section
		double fedTax = grossPay * (FEDERAL_TAX_PERCENT / 100);
		double stateTax = grossPay * (STATE_TAX_PERCENT / 100);
		double socialSecurity = grossPay * (SS_PERCENT / 100);
		double medicare = grossPay * (MEDICARE_PERCENT / 100);
		double deductions = (fedTax + stateTax + socialSecurity + medicare);
				
		double netPay = grossPay - deductions;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay + "\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + fedTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);

	}

}
