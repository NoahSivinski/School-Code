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
		final float FEDERAL_TAX_PERCENT = (float) 10.00;
		final float STATE_TAX_PERCENT = (float) 4.5;
		final float SOCIAL_SECURITY = (float) 6.2;
		final float MEDICARE_PERCENT = (float) 1.45;
		final float PAY_PER_HOUR = (float) 7.25;
		
		// User Input: Hours per Week
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		float hrpWeek = keyboard.nextFloat();
		
		// Calculating Gross Pay
		float grossPay = hrpWeek * PAY_PER_HOUR;
		
		// Calculating Federal Deduction
		float fedtaxPercentage = FEDERAL_TAX_PERCENT / 100;
		float federalDeduction = grossPay * fedtaxPercentage;
		
		// Calculating State Deduction
		float statetaxPercentage = STATE_TAX_PERCENT / 100;
		float stateDeduction = grossPay * statetaxPercentage;
		    
		// Calculating Social Security Deduction
		float socialPercentage = SOCIAL_SECURITY / 100;
		float socialDeduction = grossPay * socialPercentage;
		
		// Calculating Medicare Deduction
		float medicarePercentage = MEDICARE_PERCENT / 100;
		float medicareDeduction = grossPay * medicarePercentage;
		
		// Calculating Net Pay
		float totalDeductions = federalDeduction + stateDeduction + socialDeduction + medicareDeduction;
		float netPay = grossPay - totalDeductions;
		
		// Output
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + socialDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);
		
	}

}
