/*
 * NetPay.java
 * Author:  Delaney Ott 
 * Submission Date:  February 5th, 2021
 *
 * Purpose: This program is designed to compute an individual's gross and net pay based on their hourly wage, hours worked, 
 * and several deductions. These deductions include federal, state, social security, and medicare taxes. In this program, 
 * the user will be asked to enter the number of hours per week that they work. From there, my program will calculate their
 * net pay by subtracting the deductions from their gross pay.
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
	
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;

	public static void main(String[] args) {
		
		double hoursPerWeek;
		double grossPay;
		double netPay;
		double deductions;
		double federal;
		double state;
		double socialSecurity;
		double medicare;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t");
		hoursPerWeek = keyboard.nextDouble();
		
		grossPay = PAY_PER_HOUR * hoursPerWeek;
		federal = grossPay / FEDERAL_TAX_PERCENT;
		state = (STATE_TAX_PERCENT / 100) * grossPay;
		socialSecurity = (SS_PERCENT / 100) *grossPay;
		medicare = (MEDICARE_PERCENT / 100) * grossPay;
		deductions = federal + state + socialSecurity + medicare;
		netPay = grossPay - deductions;
			
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t"+ netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal: \t\t" + federal);
		System.out.println("State: \t\t\t" + state);
		System.out.println("Social Security: \t"+ socialSecurity);
		System.out.println("Medicare: \t\t" + medicare);
	
		keyboard.close();
	}

}
