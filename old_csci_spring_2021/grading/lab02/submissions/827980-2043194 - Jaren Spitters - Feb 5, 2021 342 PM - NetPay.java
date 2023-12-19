/*
 * Netpay.java
 * Author:  Jaren Spitters 
 * Submission Date:  2/5/2021
 *
 * Purpose: This program asks the user their hours worked per week, and then outputs their gross pay, deductions, and net pay for the week.
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
		
		Scanner keyboard = new Scanner (System.in);
		
		
			double FEDERAL_TAX_PERCENT = 10.00;
			double STATE_TAX_PERCENT = 4.5;
			double SS_PERCENT = 6.2;
			double MEDICARE_PERCENT = 1.45;
			double PAY_PER_HOUR = 7.25;
		
			System.out.println("Enter hours per week");
			
			int HOURS_PER_WEEK = keyboard.nextInt();
		
			double grossPay = HOURS_PER_WEEK * PAY_PER_HOUR;
			double federal = grossPay * (FEDERAL_TAX_PERCENT/100);
			double state = grossPay * (STATE_TAX_PERCENT/100);
			double socialSecurity = grossPay * (SS_PERCENT/100); 
			double medicare = grossPay * (MEDICARE_PERCENT/100);
			double netPay = grossPay - (federal + state + socialSecurity + medicare);
		
		
			System.out.println("Hours per Week: " + "\t" + HOURS_PER_WEEK);
			System.out.println("Gross Pay: " + "\t" + "\t" +  grossPay);
			System.out.println("Net Pay: " + "\t" + "\t" +  netPay); 
			System.out.println("");
			System.out.println("Deductions");
			System.out.println("Federal: " + "\t"+ "\t" +  federal);
			System.out.println("State: " + "\t" + "\t" + "\t" +  state);
			System.out.println("Social Security: " + "\t" +  socialSecurity);
			System.out.println("Medicare: " + "\t"+ "\t" +  medicare);
			
			keyboard.close();
	}

}
