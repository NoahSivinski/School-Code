/*
 * NetPay.java
 * Author:  Justin Hesse 
 * Submission Date:  2/4/21
 *
 * Purpose: This program takes in hours worked from user input,
 * calculates gross pay and net pay as well as tax deductions,
 * and finally outputs the information.
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
		
		final double FEDERAL_TAX_PERCENT = 10.00;  //Lines 31-36 declare and initialize constants for tax percentages, as well as the scanner
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Hours per Week: " + '\t'); //Prompts the user for hours per week and assigns the value to hoursWorked
		int hoursWorked = scan.nextInt();
		
		
		double grossPay = hoursWorked * PAY_PER_HOUR;			//This block performs calculations for deductions as well as net pay
		double federalDeduction = grossPay * (FEDERAL_TAX_PERCENT / 100);
		double stateDeduction = grossPay * (STATE_TAX_PERCENT / 100);
		double ssDeduction = grossPay * (SS_PERCENT/ 100);
		double medicareDeduction = grossPay * (MEDICARE_PERCENT / 100);
		double netPay = grossPay - federalDeduction - stateDeduction - ssDeduction - medicareDeduction;
		
		
		System.out.println("Gross Pay: " + '\t' + '\t' + grossPay);		//The remaining lines print formatted outputs for pay and deductions
		System.out.println ("Net Pay: " + '\t' + '\t' + netPay);
		System.out.println();
		
		System.out.println("Deductions");
		System.out.println ("Federal: " + '\t' + '\t' + federalDeduction);
		System.out.println ("State: " + '\t' + '\t' + '\t' + stateDeduction);
		System.out.println ("Social Security: " + '\t' + ssDeduction);
		System.out.println ("Medicare: " + '\t' + '\t' + medicareDeduction);
		
		
		scan.close();
	}

}
