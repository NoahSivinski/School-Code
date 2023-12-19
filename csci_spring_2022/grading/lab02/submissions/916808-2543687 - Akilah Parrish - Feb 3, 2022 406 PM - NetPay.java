/* 
 * NetPay.java 
 * Author: Akilah Parrish 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from anywhere other than the authorized 
 * sources. I recognize that any unauthorized sharing, assistance, 
 * or plagiarism will be handled in accordance with both the 
 * University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based on 
 * an assignment created by the Department of Computer 
 * Science at the University of Georgia. Any publishing or posting 
 * of source code at any time for this project is prohibited. 
 */ 

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring Constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		// User Input: Hours per Week
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		double hrpWeek = keyboard.nextFloat();
		
		// Calculating Gross Pay
		double grossPay = hrpWeek * PAY_PER_HOUR;
		
		// Calculating Federal Deduction
		double fedtaxPercentage = FEDERAL_TAX_PERCENT / 100;
		double federalDeduction = grossPay * fedtaxPercentage;
		
		// Calculating State Deduction
		double statetaxPercentage = STATE_TAX_PERCENT / 100;
		double stateDeduction = grossPay * statetaxPercentage;
		    
		// Calculating Social Security Deduction
		double socialPercentage = SOCIAL_SECURITY / 100;
		double socialDeduction = grossPay * socialPercentage;
		
		// Calculating Medicare Deduction
		double medicarePercentage = MEDICARE_PERCENT / 100;
		double medicareDeduction = grossPay * medicarePercentage;
		
		// Calculating Net Pay
		double totalDeductions = federalDeduction + stateDeduction + socialDeduction + medicareDeduction;
		double netPay = grossPay - totalDeductions;
		
		// Output
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.printf("State:\t\t\t%1.3f", stateDeduction);
		System.out.println("");
		System.out.println("Social Security:\t" + socialDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);

		
	}

}
