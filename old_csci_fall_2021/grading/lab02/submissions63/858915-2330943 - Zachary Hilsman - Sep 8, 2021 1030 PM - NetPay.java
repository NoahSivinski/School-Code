/*
 * NetPay.java
 * Author:  Zachary Hilsman
 * Submission Date:  9/8/2021
 *
 * Purpose: This program's purpose is to receive a user input 
 * of how many hours per week they work, and output their 
 * gross pay and net pay, based off of a minimum wage pay per hour
 * and factoring in taxes and other deductions.
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

public class NetPay 
{
	public static void main(String[] args)
	{
		System.out.print("Hours per Week:        ");
		Scanner keyboard = new Scanner(System.in);
		int HOURS_PER_WEEK = keyboard.nextInt();
		float FEDERAL_TAX_PERCENT = 10.00f;
		float STATE_TAX_PERCENT = 4.5f;
		float SS_PERCENT = 6.2f;
		float MEDICARE_PERCENT = 1.45f;
		float PAY_PER_HOUR = 7.25f;
		float GROSS_PAY = HOURS_PER_WEEK * PAY_PER_HOUR; //new variable to facilitate calculations
		
		System.out.println("Gross Pay:             " + GROSS_PAY);
		System.out.println("Net Pay:               " + (GROSS_PAY - ((GROSS_PAY * FEDERAL_TAX_PERCENT/100) + (GROSS_PAY * STATE_TAX_PERCENT/100) + (GROSS_PAY * SS_PERCENT/100) + (GROSS_PAY * MEDICARE_PERCENT/100)))); //This takes the gross pay and subtracts all tax deductions from it to output net pay. I thought about simplifying this with more variables but wasn't sure if that was allowed.
		System.out.println("\nDeductions");
		System.out.println("Federal:               " + (GROSS_PAY * FEDERAL_TAX_PERCENT/100));
		System.out.println("State:                 " + (GROSS_PAY * STATE_TAX_PERCENT/100));
		System.out.println("Social Security:       " + (GROSS_PAY * SS_PERCENT/100));
		System.out.println("Medicare:              " + (GROSS_PAY * MEDICARE_PERCENT/100));
		keyboard.close();
	}
}
