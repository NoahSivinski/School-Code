/*
 * NetPay.java
 * Author:  Nnamdi Obichi
 * Submission Date:  September 1st, 2021  
 *
 * Purpose: Calculates the amount of money 
 * made in a week at minimum wage ($7.25 an hour) after taxes 
 * are taken out (net pay) after an amount of work hours is inputed   
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
	
	// Named Constant Tax Percentages
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25; 
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Hours per Week:" + "\t\t");
		
		// Hours Of Weekly Work
		int wrkHrs = userInput.nextInt();
		userInput.nextLine();
		
		// Calculates Gross Pay
		double grossPay = wrkHrs * PAY_PER_HOUR;
		
		// Turns tax percentages into decimal values for math 
		double fedTax = grossPay * (FEDERAL_TAX_PERCENT / 100); 
		double stateTax = grossPay * (STATE_TAX_PERCENT / 100);
		double ssTax = grossPay * (SS_PERCENT / 100);
		double medTax = grossPay * (MEDICARE_PERCENT / 100);
		
		// sumTax is the sum of all of the various taxes 
		double sumTax = fedTax + stateTax + ssTax + medTax;
		
		// Calculates netPay
		double netPay = grossPay - sumTax;
		
		System.out.println("Gross Pay:" + "\t\t" + grossPay);
		System.out.println("Net Pay:" + "\t\t" + netPay + "\n");
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t\t" + fedTax);
		System.out.println("State:" + "\t\t\t" + stateTax);
		System.out.println("Social Security:" + "\t" + ssTax);
		System.out.println("Medicare:" + "\t\t" + medTax);
				
		userInput.close();
	
	}

}