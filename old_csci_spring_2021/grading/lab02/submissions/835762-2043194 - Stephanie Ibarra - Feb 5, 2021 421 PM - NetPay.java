/*
 * [NetPay].java
 * Author:  [Stephanie Ibarra] 
 * Submission Date:  [2/5/2021]
 *
 * Purpose: This program computes a person's gross and net pay based on their hourly wage, hours worked, and several withholdings.
 * 
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
 // determine the values
	public static final double FEDERAL_TAX_PERCENT = 10;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per week:       ");
		int hoursPerWeek = keyboard.nextInt();
		double netPay = netPay(hoursPerWeek);

		System.out.printf("%-20s: %.2f\n", "Net Pay", netPay);
		keyboard.close();
	}

	// This method returns the net pay based on the provided number of hours.
	public static double netPay(int hoursPerWeek) {
		double gross = hoursPerWeek * PAY_PER_HOUR;
		double fedTax = FEDERAL_TAX_PERCENT * gross / 100.0;
		double stateTax = STATE_TAX_PERCENT * gross / 100.0;
		double ssTax = SS_PERCENT * gross / 100.0;
		double medicareTax = MEDICARE_PERCENT * gross / 100.0;

		double net = gross - fedTax - stateTax - ssTax - medicareTax;

		System.out.printf("%-20s: %d\n", "Hours per Week", hoursPerWeek);
		System.out.printf("%-20s: %.2f\n\n", "Gross Pay", gross);
		System.out.println("Deductions");
		System.out.printf("%-20s: %.2f\n", "Federal", fedTax);
		System.out.printf("%-20s: %.2f\n", "State", stateTax);
		System.out.printf("%-20s: %.2f\n", "Social Security", ssTax);
		System.out.printf("%-20s: %.2f\n\n", "Medicare", medicareTax);

		return net;
	}
}