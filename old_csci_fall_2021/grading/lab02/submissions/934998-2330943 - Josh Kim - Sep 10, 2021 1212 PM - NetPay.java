/*
 * NetPay.java
 * Author:  Joshua Kim 
 * Submission Date:  09/10/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program computes a person's gross pay, net pay, and the deductions based on hourly wage and number of hours worked.
 * The user can input number of hours worked, and the output will be the gross pay, net pay, and the deductions (federal, state, social security, and medicare).
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
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t"); // Asks for user to input the number of Hours Per Week worked
		int hours = keyboard.nextInt(); 
		double grossPay , netPay , federal , state , socialSecurity , medicare; //Declares variables

		//This section declares the constants and sets them to a value.
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;

		//This section calculates the values of each deduction.
		grossPay = hours * PAY_PER_HOUR;
		federal = grossPay * (FEDERAL_TAX_PERCENT / 100);
		state = grossPay * (STATE_TAX_PERCENT / 100);
		socialSecurity = grossPay * (SS_PERCENT / 100);
		medicare = grossPay * (MEDICARE_PERCENT / 100);
		netPay = grossPay - (federal + state + socialSecurity + medicare);

		//This section prints out the values of each variable.
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.print("\n"); // blank space
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
	}

}
