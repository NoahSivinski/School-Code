/*
 * NetPay.java
 * Author:  Andrew Glaze
 * Submission Date:  9/8/2021
 *
 * Purpose: A program that computes a users gross pay and net pay based on their 
 * hourly wage, hours worked, and several withholdings 
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
		int hours;
		double grossPay;
		double netPay;
		double federalTaxDeduct;
		double stateTaxDeduct;
		double socialSecurityDeduct;
		double medicareDeduct;
		
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Ask the user for the Hours per Week
		Scanner key = new Scanner(System.in);
		System.out.print("Hours per Week: \t");
		hours = key.nextInt();
		
		//Calculate and print the gross pay
		grossPay = hours * PAY_PER_HOUR;
		
		//Calculate federal tax
		federalTaxDeduct = grossPay * (FEDERAL_TAX_PERCENT / 100);
		
		//Calculate State tax
		stateTaxDeduct = grossPay * (STATE_TAX_PERCENT / 100);
		
		//Calculate Social Security 
		socialSecurityDeduct = grossPay * (SS_PERCENT / 100);
		
		//Calculate Medicare
		medicareDeduct = grossPay * (MEDICARE_PERCENT / 100);
		
		//Calculate Net Pay
		netPay = grossPay - (federalTaxDeduct + stateTaxDeduct + socialSecurityDeduct + medicareDeduct);
		
		
		//Produce the expected output
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		
		System.out.println("\nDeductions");
		System.out.println("Federal: \t\t" + federalTaxDeduct);
		System.out.println("State: \t\t\t" + stateTaxDeduct);
		System.out.println("Social Security: \t" + socialSecurityDeduct);
		System.out.println("Medicare: \t\t" + medicareDeduct);
	}

}
