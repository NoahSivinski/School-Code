/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [9/3/2021]
 *
 * Purpose: To calculate the gross pay, net pay, and deductions by entering the hours per week.
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

		//Scanner
		Scanner keyboard = new Scanner(System.in);

		//final variables
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;   
		final double SS_PERCENT = 6.2;  
		final double MEDICARE_PERCENT = 1.45; 
		final double PAY_PER_HOUR = 7.25;  

		//Hours per Week
		System.out.print("Hours per Week: \t");
		int hoursPerWeek = keyboard.nextInt();

		//Gross Pay
		double grossPay = PAY_PER_HOUR * hoursPerWeek;
		System.out.println("Gross Pay: \t\t" + grossPay);

		//Net Pay
		double deductions = grossPay - grossPay * ( 1 - (FEDERAL_TAX_PERCENT + STATE_TAX_PERCENT + SS_PERCENT + MEDICARE_PERCENT) / 100);
		double netPay = grossPay - deductions;
		System.out.println("Net Pay: \t\t" + netPay);

		//Deductions
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + (FEDERAL_TAX_PERCENT / 100) * grossPay);
		System.out.println("State: \t\t\t" + (STATE_TAX_PERCENT / 100) * grossPay);
		System.out.println("Social Security: \t" + (SS_PERCENT / 100) * grossPay);
		System.out.println("Medicare: \t\t" + (MEDICARE_PERCENT / 100) * grossPay);

		keyboard.close();

	}

}
