/*
 * [CSCI1301].java
 * Author:  [Ethan Delamater] 
 * Submission Date:  [02/04/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 	The program calculates pay based on the hours worked per week of the user, assuming the user makes $7.25 per hour
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

			Scanner input = new Scanner(System.in);
			
		double PAY_PER_HOUR;
		double grossPay;
		double netPay;
		double FEDERAL_TAX_PERCENT;
		double STATE_TAX_PERCENT; 
		double SS_PERCENT;
		double MEDICARE_PERCENT;
		double deduction;
		
		System.out.print("Hours per Week:\t\t");
		double hoursWorked = input.nextDouble();
		PAY_PER_HOUR = 7.25;
		FEDERAL_TAX_PERCENT = .1;
		STATE_TAX_PERCENT = .045;
		SS_PERCENT = .062;
		MEDICARE_PERCENT = .0145; 
		grossPay = PAY_PER_HOUR * hoursWorked;
		deduction = (FEDERAL_TAX_PERCENT * grossPay) + (STATE_TAX_PERCENT * grossPay) + (SS_PERCENT * grossPay) + (MEDICARE_PERCENT * grossPay);
		netPay = grossPay - deduction;
		System.out.print("Gross Pay:\t\t");
		System.out.println(grossPay);
		System.out.print("Net Pay:\t\t");
		System.out.println(netPay);
		System.out.println("\nDeductions");
		System.out.print("Federal:\t\t");
		System.out.println(FEDERAL_TAX_PERCENT * grossPay); 
		System.out.print("State:\t\t\t");
		System.out.println(STATE_TAX_PERCENT * grossPay);
		System.out.print("Social Security:\t");
		System.out.println(SS_PERCENT * grossPay);
		System.out.print("Medicare:\t\t");
		System.out.println(MEDICARE_PERCENT * grossPay);
	
		input.close();	
	
	}	
}
