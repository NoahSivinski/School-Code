/*
 * NetPay.java
 * Author:  Thommy Chhim
 * Submission Date:  9/2/2021
 *
 * Purpose: First, the program initializes the constants in the program, such as pay per hour and tax percentages. Next, the program asks the user to input the number of hours they worked per week. Then, the program performs arithmetic to calculate the deductions from the gross pay, and calculates the net pay and deductions. Finally, the program prints of all of this information to the user. 
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

		//Instance of scanner 
		Scanner Keyboard = new Scanner (System.in);

		// Declarations and initializations for constants. 
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;

		// Variables declared
		int hoursWorked;
		double grossPay, netPay, federalTax, stateTax, ssTax, medicareTax;

		//User enters hours per week worked 
		System.out.print("Hours per Week:\t\t");
		hoursWorked = Keyboard.nextInt();

		//Calculations for gross pay, taxes, and net pay.
		grossPay = PAY_PER_HOUR * hoursWorked;
		federalTax = grossPay * (FEDERAL_TAX_PERCENT / 100);
		stateTax = grossPay * (STATE_TAX_PERCENT / 100);
		ssTax = grossPay * (SS_PERCENT / 100);
		medicareTax = grossPay * (MEDICARE_PERCENT / 100);
		netPay = grossPay - federalTax - stateTax - ssTax - medicareTax;

		//Program prints out information such as gross and net pay, and tax deductions.
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security\t\t" + ssTax);
		System.out.println("Medicare:\t\t" + medicareTax);
	}

}
