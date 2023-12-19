/*
 * NetPay.java
 * Author: Angel Marsh
 * Submission Date: February 5, 2021
 * 
 * Purpose: The purpose of this program is to compute a person's gross and net pay
 * based on their hourly wage, hours worked, and several withholdings.
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
		
		final double PAY_PER_HOUR;
		final double FEDERAL_TAX_PERCENT;
		final double STATE_TAX_PERCENT;
		final double SS_PERCENT;
		final double MEDICARE_PERCENT;
		/* PERCENTAGE_MULTIPLIER will be plugged into the algorithm so that gross pay can
		 * be multiplied by the federal tax, state tax, social security, and medicare percentages.
		 */
		final double PERCENTAGE_MULTIPLIER;
		
		double hoursWorked;
		double grossPay;
		double netPay;
		double federalDeduction;
		double stateDeduction;
		double socialDeduction;
		double medicareDeduction;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Hours per Week: \t");
		
		hoursWorked = keyboard.nextDouble();
		PERCENTAGE_MULTIPLIER = 0.01;
		FEDERAL_TAX_PERCENT = 10.00;
		STATE_TAX_PERCENT = 4.5;
		SS_PERCENT = 6.2;
		MEDICARE_PERCENT = 1.45;
		PAY_PER_HOUR = 7.25;
		
		grossPay = PAY_PER_HOUR * hoursWorked;
		federalDeduction = FEDERAL_TAX_PERCENT * PERCENTAGE_MULTIPLIER * grossPay;
		stateDeduction = STATE_TAX_PERCENT * PERCENTAGE_MULTIPLIER * grossPay;
		socialDeduction = SS_PERCENT * PERCENTAGE_MULTIPLIER * grossPay;
		medicareDeduction = MEDICARE_PERCENT * PERCENTAGE_MULTIPLIER * grossPay;
		netPay = grossPay - federalDeduction - stateDeduction - socialDeduction - medicareDeduction;
		
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		System.out.println(" ");
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + federalDeduction);
		System.out.println("State: \t\t\t" + stateDeduction);
		System.out.println("Social Security: \t" + socialDeduction);
		System.out.println("Medicare: \t\t" + medicareDeduction);
				
		keyboard.close();		
		
	}

}
