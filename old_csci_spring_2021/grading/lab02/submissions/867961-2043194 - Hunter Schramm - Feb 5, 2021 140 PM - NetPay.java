/**
 * 
 */

/**
 * @author hunterschramm
 *
 */
/**
	 * @param args
	 */
	/*
	 * [NetPay].java
	 * Author:  [Hunter Schramm] 
	 * Submission Date:  [02/05/2021]
	 *
	 * Purpose: This program is used to calculate a person’s gross and net pay based on 
	 * how much money they make per hour, the amount of hours they worked, and their deductions 
	 * such as Federal and State taxes, Social Security, and Medicare. 
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
		
		final double PAY_PER_HOUR = 7.25;
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		int HOURS_PER_WEEK;
		HOURS_PER_WEEK = keyboard.nextInt( );
		
		double GROSS_PAY = (HOURS_PER_WEEK * PAY_PER_HOUR);
		double Federal_answer = GROSS_PAY * FEDERAL_TAX_PERCENT / 100;
		double State_answer = GROSS_PAY * STATE_TAX_PERCENT / 100;
		double SocialSecurity_answer = GROSS_PAY * SS_PERCENT / 100;
		double Medicare_answer = GROSS_PAY * MEDICARE_PERCENT / 100;
		double Total_pay_answer = GROSS_PAY - Federal_answer - State_answer - SocialSecurity_answer - Medicare_answer;
		
		/* These double variables are used to make the calculations for the output */
		
		System.out.println("Gross Pay:		" + GROSS_PAY + '\t');
		System.out.println("Net pay:\t\t" + Total_pay_answer);	
		System.out.println('\t');
		System.out.println("Deductions" + '\t');
		System.out.println("Federal:\t\t" + Federal_answer);
		System.out.println("State:\t\t\t" + State_answer);
		System.out.println("Social Security:\t" + SocialSecurity_answer);
		System.out.println("Medicare:\t\t" + Medicare_answer);
		/* This is the code used to format the output of the program */
		
		keyboard.close();
		} 
		}

