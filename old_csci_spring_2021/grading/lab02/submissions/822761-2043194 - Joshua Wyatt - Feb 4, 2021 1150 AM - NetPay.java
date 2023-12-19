/*
 * NetPay.java
 * Author:  Joshua Wyatt
 * Submission Date:  02/04/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program takes the hours per week that a user inputs, and with this input this program calculates
 * the gross pay, and finds the net pay by multiplying each deduction by the gross pay one at a time
 * by its percent and then subtracts that number from the gross pay and then we get the net pay!
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
		
		Scanner keyboard = new Scanner(System.in);
		
		//declarations begin
		
		final double FEDERAL_TAX_PERCENT = 10.00;
		
		final double STATE_TAX_PERCENT = 4.5;
		
		final double SS_PERCENT = 6.2;
		
		final double MEDICARE_PERCENT = 1.45;
		
		final double PAY_PER_HOUR = 7.25;
		
		double grossPay, netPay, federalTax, stateTax, socialSecurity, taxMedicare, totalDeductions; 
			
		
		//early user input
		
		
		System.out.print("Hours per Week: \t");
		int HoursPerWeek = keyboard.nextInt();
		
		grossPay = HoursPerWeek * PAY_PER_HOUR;
		System.out.println("Gross Pay: \t\t"+ grossPay);
		
		
		//calculations
		
		
		federalTax = grossPay * FEDERAL_TAX_PERCENT /100;

		stateTax = grossPay * STATE_TAX_PERCENT /100;

		socialSecurity = grossPay * SS_PERCENT /100;

		taxMedicare = grossPay * MEDICARE_PERCENT /100;

		totalDeductions = federalTax + stateTax + socialSecurity
				+ taxMedicare;
		netPay = grossPay - totalDeductions;
		
		
		//final statements laid out to finish up program
		
		
		System.out.println("Net Pay: \t\t"+ netPay );
		
		System.out.println("\nDeductions");
		
		System.out.println("Federal: \t\t"+ federalTax);
		
		System.out.println("State: \t\t\t"+ stateTax);
		
		System.out.println("Social Security: \t"+ socialSecurity);
		
		System.out.println("Medicare: \t\t"+ taxMedicare);
		
	
		keyboard.close();
		
		
	}
	

}
