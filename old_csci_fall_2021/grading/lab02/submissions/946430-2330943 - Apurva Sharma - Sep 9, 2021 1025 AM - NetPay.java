/*
 * NetPay.java
 * Author:  Apurva Sharma
 * Submission Date:  9/9/2021
 *
 * Purpose: Given the number of hours a person works, pay per hour, and tax percentages; that
 * person's gross pay, net pay, and deductions are calculated and displayed. 
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
		Scanner scan = new Scanner (System.in);
		
		//constants declared and initialized
		final double FEDERAL_TAX_PERCENT = 10.00; 
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//user inputs the number of hours worked per week
		System.out.print("Hours per Week: \t");
		int hours_per_week = scan.nextInt();
		
		//calculations
		double gross_pay = hours_per_week*PAY_PER_HOUR; 
		double federal_tax = FEDERAL_TAX_PERCENT/100*gross_pay; 
		double state_tax = STATE_TAX_PERCENT/100*gross_pay; 
		double ss_contribution = SS_PERCENT/100*gross_pay;
		double medicare = MEDICARE_PERCENT/100*gross_pay; 
		double net_pay = gross_pay - federal_tax - state_tax - ss_contribution - medicare;
		
		//printing all of the values
		System.out.println("Gross Pay: \t\t" + gross_pay);
		System.out.println("Net Pay: \t\t" + net_pay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + federal_tax);
		System.out.println("State: \t\t\t" + state_tax);
		System.out.println("Social Security: \t" + ss_contribution);
		System.out.println("Medicare: \t\t" + medicare);
		
		
	}

}
