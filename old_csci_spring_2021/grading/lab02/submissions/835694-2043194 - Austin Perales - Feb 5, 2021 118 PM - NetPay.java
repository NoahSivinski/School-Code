/*
 * [NetPay.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [2/1/2021]
 *
 * Purpose: The program NetPay.java allows the user to input the number
 *  of hours per week they work and receive an output of their gross pay,
 *  net pay, and all of their deductions taken away from their gross pay
 *  in taxes. The user can input any number of hours they work and it will
 *  calculate their pay and deductions accordingly.
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
		//Initialize hoursPerWeek and get the input from the user using Scanner
		int hoursPerWeek;
		Scanner input = new Scanner(System.in);
		System.out.print("Hours per Week: " + '\t');
		hoursPerWeek = input.nextInt();
		
		//Initialize grossPay, netPay, and deductions for use later in the program
		double grossPay;
		double netPay;
		double deductions;
		
		//Initialize named constants as instructed in the instructions
		//These do not change throughout the program
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Initialize the tax variables to store the amount taken from gross pay after deductions
		double federalTax;
		double stateTax;
		double ssTax;
		double medicareTax;
		
		//calculate gross pay
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		
		//The math for calculating the deductions
		federalTax = (FEDERAL_TAX_PERCENT/100) * grossPay;
		stateTax = (STATE_TAX_PERCENT/100) * grossPay;
		ssTax = (SS_PERCENT/100) * grossPay;
		medicareTax = (MEDICARE_PERCENT/100) * grossPay;
		
		//adding up the deductions
		deductions = federalTax + stateTax + ssTax + medicareTax;

		//calculating net pay
		netPay = grossPay - deductions;
		
		//printing out all of the outputs
		System.out.println("Gross Pay: " + '\t' + '\t' + grossPay);
		System.out.println("Net Pay: " + '\t' + '\t' + netPay + '\n');
		
		System.out.println("Deductions" + '\n' + "Federal: " + '\t' + '\t' + federalTax);
		System.out.println("State: " + '\t' + '\t' + '\t' + stateTax);
		System.out.println("Social Security: " + '\t' + ssTax);
		System.out.println("Medicare: " + '\t' + '\t' + medicareTax);
		
		input.close();
	}

}
