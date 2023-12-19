/*
 * NetPay.java
 * Author:  Derek Li
 * Submission Date:  9/7/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program takes in user input for the hours worked and calculates
 * what the user would make at a pay rate of $7.25 per hour.
 * In addition, the program shows what the user would make before tax
 * and what they would make after tax while listing every single deduction
 * from their gross pay and how much each tax contributes into taking
 * away from the final, net pay.
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
		
		//variable initialization
		final double FEDERAL_TAX_PERCENT = 10.0;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Hours Per Week: \t");
		int hoursPerWeek = input.nextInt();	
		//all other variables are calculated using the above percentages and the user input for hoursPerWeek
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federalTax = grossPay * FEDERAL_TAX_PERCENT / 100;
		double stateTax = grossPay * STATE_TAX_PERCENT / 100;
		double socialSecurityTax = grossPay * SS_PERCENT / 100;
		double medicareTax = grossPay * MEDICARE_PERCENT / 100;
		double netPay = grossPay - federalTax - stateTax - socialSecurityTax - medicareTax;
		
		
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay:   \t\t" + netPay);
		System.out.println();
		
		System.out.println("Deductions");
		System.out.println("Federal:  \t\t" + federalTax);
		System.out.println("State:    \t\t" + stateTax);
		System.out.println("Social Security: \t" + socialSecurityTax);
		System.out.println("Medicare: \t\t" + medicareTax);
	}

}
