/*
 * NetPay.java
 * Author:  Samir Hadi Cisneros
 * Submission Date:  5 February 2021
 *
 * Purpose: This program takes the user's hours worked as an input and outputs their gross pay and net pay
 * along with all other deductions (assuming the user makes minimum wage)
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
 * 
 * I agree
 */

import java.util.Scanner;
public class NetPay {

	/**
	 * @param args
	 */
	public static final double FEDERAL_TAX_PERCENT = .10;
	public static final double STATE_TAX_PERCENT = .045;
	public static final double SS_PERCENT = .062;
	public static final double MEDICARE_PERCENT = .0145;
	public static final double PAY_PER_HOUR = 7.25;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Hours Per Week: \t");
		double hoursWorked = input.nextDouble(); 
		
		
		double grossPay = (PAY_PER_HOUR * hoursWorked);
		double fedTax = grossPay * FEDERAL_TAX_PERCENT;
		double stateTax = grossPay * STATE_TAX_PERCENT;
		double socialSecurity = grossPay * SS_PERCENT;
		double medicare = grossPay * MEDICARE_PERCENT; 
		double netPay = (grossPay - fedTax - stateTax -  socialSecurity - medicare );
		
		
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + fedTax);
		System.out.println("State: \t\t\t" + stateTax);
		System.out.println("Social Security: \t"+ socialSecurity);
		System.out.printf("Medicare: \t\t%.6f\n" , medicare);

		

		
		
		
		
		

	}

}
