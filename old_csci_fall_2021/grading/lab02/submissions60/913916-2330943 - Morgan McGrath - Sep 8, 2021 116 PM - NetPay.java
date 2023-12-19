/*
 * NetPay.java
 * Author:  Morgan McGrath
 * Submission Date:  9/8/2021
 *
 * Purpose: This program uses Scanner, variables, and print statements to figure out some financial 
 * information about the user. Some of this information includes net pay, gross pay, and deductions. 
 * The user enters in the amount of hours they work per week, and the program uses this data to 
 * calculate the above information.
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
		//declare and initialize variables
		int hoursPerWeek;
		double grossPay, netPay;
		double federalDeduction, stateDeduction, socialSecurityDeduction, medicareDeduction, totalDeduction;
		final double FEDERAL_TAX_PERCENT=10.00;
		final double STATE_TAX_PERCENT=4.5;
		final double SS_PERCENT=6.2;
		final double MEDICARE_PERCENT=1.45;
		final double PAY_PER_HOUR=7.25;
		//get input from the user
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek=keyboard.nextInt();
		//gross pay formula
		grossPay=hoursPerWeek*PAY_PER_HOUR;
		//federal tax deduction formula
		federalDeduction=grossPay*FEDERAL_TAX_PERCENT*0.01;
		//state tax deduction formula
		stateDeduction=grossPay*STATE_TAX_PERCENT*0.01;
		//social security deduction formula 
		socialSecurityDeduction=grossPay*SS_PERCENT*0.01;
		//medicare deduction formula
		medicareDeduction=grossPay*MEDICARE_PERCENT*0.01;
		//total deduction
		totalDeduction=federalDeduction+stateDeduction+socialSecurityDeduction+medicareDeduction;
		//net pay formula
		netPay=grossPay-totalDeduction;
		//print out the results
		System.out.println("Gross Pay:\t\t"+grossPay);
		System.out.println("Net Pay:\t\t"+netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t"+federalDeduction);
		System.out.println("State:\t\t\t"+stateDeduction);
		System.out.println("Social Security:\t"+socialSecurityDeduction);
		System.out.println("Medicare:\t\t"+medicareDeduction);
		
	}
	
}
