/* 
 * [NetPay].java 
 * Author: [Kayla Arthur] 
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

//Code to insert Scanner class from package
import java.util.Scanner;

public class NetPay {

			
	public static void main(String[] args) {
		
		//Code to define keyboard/allow user input
		Scanner keyboard = new Scanner(System.in);	
				
		//Declaring initial constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Code to print hours per week to screen
		System.out.print("Hours per Week:" + "\t" + "\t");
		
		//Declaring initial variables 
		double hoursPerWeek = keyboard.nextDouble();
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federal = grossPay * FEDERAL_TAX_PERCENT/100;
		double state = grossPay * STATE_TAX_PERCENT/100;
		double socialSecurity = grossPay * SOCIAL_SECURITY_PERCENT/100;
		double medicare = grossPay * MEDICARE_PERCENT/100; 
		double netPay = grossPay - (federal+ state + socialSecurity + medicare);
		
		//Code to print gross and net pay to screen
		
		System.out.println("Gross Pay:" + "\t" + "\t" + grossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + netPay);
		
		//Empty code used for indentation between Net Pay and Deduction 
		System.out.println();
		
		//Code to print the deductions and their calculated values to screen 
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t" + "\t" + federal);
		System.out.println("State:" + "\t" + "\t" + "\t" + state);
		System.out.println("Social Security:" + "\t" + socialSecurity);
		System.out.println("Medicare:" + "\t" + "\t" + medicare);		 
		
		keyboard.close();

	}

}
