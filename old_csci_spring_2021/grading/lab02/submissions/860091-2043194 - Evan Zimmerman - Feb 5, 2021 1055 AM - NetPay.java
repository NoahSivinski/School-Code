/*
 * NetPay.java
 * Author:  Evan Zimmerman 
 * Submission Date:  5th February 2021
 *
 * Purpose: The exercise being explored by Lab #2 is "computing taxes and pay."
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
		
		// Initializing the constants used in calculating finances, with the
		// variable being the amount of hours that the user inputs on line # 44.
		
		final double federal_tax_percent = 10.00;
		final double state_tax_percent = 4.5;
		final double ss_percent = 6.2;
		final double medicare_percent = 1.45;
		final double pay_per_hour = 7.25;
		
		// Get user to input number of hours worked during the week.
		
		System.out.println("Enter the amount of hours worked per week: ");
		double hours_worked = input.nextDouble();
		
		// Multiply hours worked and pay rate to determine gross pay.
		
		double gross_pay = hours_worked * pay_per_hour;
		
		/* Multiply the tax percents by the gross pay to determine the amount
		* of money each deduction takes from the gross pay. Each percent is
		* divided by 100 because (for example) federal tax percent is listed at "10"
		* which in context means "ten percent" but simply multiplying gross pay
		* by 10 yields a result that is ten times larger than the gross pay
		* instead of being one tenth of it, as is intended. Hopefully this example
		* gets my point across. I'm sorry if it doesn't.
		*/ 
		
		double federal_tax_deduction = gross_pay * (federal_tax_percent/100);
		double state_tax_deduction = gross_pay * (state_tax_percent/100);
		double ss_deduction = gross_pay * (ss_percent/100);
		double medicare_deduction = gross_pay * (medicare_percent/100);
		
		// Consolidate previous deductions into a single variable.
		
		double total_deduction = federal_tax_deduction + state_tax_deduction + ss_deduction + medicare_deduction;
		
		//Calculate net pay.
		
		double net_pay = gross_pay - total_deduction;
		
		// Print output, with appropriate amount of "\t"s to make the numbers line up.
		
		System.out.println("Hours worked per week: \t\t\t" + hours_worked);
		System.out.println("Gross pay: \t\t\t\t" + gross_pay);
		System.out.println("Net pay: \t\t\t\t" + net_pay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal: \t\t\t\t" + federal_tax_deduction);
		System.out.println("State: \t\t\t\t\t" + state_tax_deduction);
		System.out.println("Social Security: \t\t\t" + ss_deduction);
		System.out.println("Medicare: \t\t\t\t" + medicare_deduction);
		System.out.println("Total Deduction: \t\t\t" + total_deduction);
		
		input.close();
	}

}
