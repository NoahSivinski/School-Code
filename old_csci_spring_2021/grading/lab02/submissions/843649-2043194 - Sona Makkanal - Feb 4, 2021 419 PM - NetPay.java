/*
 * [CSCI 1301].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [2/4/21]
 *
 * Purpose: To calculate a persons gross and net pay based on their hourly wage, hours worked, and various other factors.
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
		
		Double FEDERAL_TAX_PERCENT = 10.00;
		Double STATE_TAX_PERCENT = 4.5;
		Double SS_PERCENT = 6.2;
		Double MEDICARE_PERCENT = 1.45;
		Double PAY_PER_HOUR = 7.25;
		
		int hoursPerWeek;
		
		Double grossPay;
		Double netPay;
		Double federalTax;
		Double stateTax;
		Double medicare;
		Double socialSecurity;
		
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hours per Week:\t\t ");
		hoursPerWeek = keyboard.nextInt();
		
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = grossPay * FEDERAL_TAX_PERCENT / 100;
		stateTax = grossPay * STATE_TAX_PERCENT / 100;
		socialSecurity = grossPay * SS_PERCENT / 100;
		medicare = grossPay * MEDICARE_PERCENT / 100;
		netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		
		System.out.println("Gross Pay:\t\t " + grossPay);
		System.out.println("Net Pay:\t\t " + netPay);
		System.out.println("");
		System.out.println("Deductions\t\t");
		System.out.println("Federal:\t\t " + federalTax);
		System.out.println("State:\t\t\t " + stateTax);
		System.out.println("Social Security:\t " + socialSecurity);
		System.out.println("Medicare:\t\t " + medicare);
		
		keyboard.close();
	}

}
