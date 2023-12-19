/*
 * NetPay.java
 * Author:  Nnamdi Ubbaonu 
 * Submission Date: 02/05/2021
 *
 * Purpose: This program is used to calculate a person's gross pay 
 * based on their pay per hour. It also calculates the net pay that 
 * is received after deductions such as the federal, state, social security, 
 * and medicare deductions.
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
		
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		
		//I stored the decimal values for the deductions and declared named constants
		
		double PAY_PER_HOUR = 7.25;
		
		//I stored the value of pay per hour and declared a named constant

		System.out.println("Enter the hours per week which you work:");
		int hoursPerWeek = keyboard.nextInt();


		double grossPay = PAY_PER_HOUR * hoursPerWeek;
		
		//Using pay rate and hours per week I created a command to calculate the gross pay which would be stored in its appropriate variable
		
		double federalDeduction = (FEDERAL_TAX_PERCENT / 100) * grossPay;
		double stateDeduction = (STATE_TAX_PERCENT / 100) * grossPay;
		double socialSecurityDeduction = (SS_PERCENT / 100) * grossPay;
		double medicareDeduction = (MEDICARE_PERCENT / 100) * grossPay;
		
		
		double netPay = grossPay - (federalDeduction + stateDeduction + socialSecurityDeduction + medicareDeduction);
		
		
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay); 
		System.out.println("Net Pay:\t\t" + netPay+ ("\n"));
		
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + socialSecurityDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);

		keyboard.close();
	}

}