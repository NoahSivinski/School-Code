/*
 * NetPay.java
 * Author:  Evan Eastabrooks 
 * Submission Date:  2/5/2021
 *
 * Purpose: This program prompts the user to input their number of hours worked
 * 			in a week and then calculates their net pay after taxes are applied.
 * 			The formulas to calculate this are included and this program allows
 * 			the user to input any value they wish and get correct values for the
 * 			output every time they run the program. In this case, an input of
 * 			100 would result in the values that the lab outline desires.
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
		
		//variable declarations
		int hoursPerWeek = 0;
		double grossPay = 0;
		double netPay;
		double federal;
		double state;
		double socialSecurity;
		double medicare;
		double deductions;
		
		//constants
		double PAY_PER_HOUR = 7.25;
		double FEDERAL_TAX_PERCENT = 0.1;
		double STATE_TAX_PERCENT = 0.045;
		double SS_PERCENT = 0.062;
		double MEDICARE_PERCENT = 0.0145;
		
		//user input: scanner
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		
		//formulas
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federal = grossPay * FEDERAL_TAX_PERCENT;
		state = grossPay * STATE_TAX_PERCENT;
		socialSecurity = grossPay * SS_PERCENT;
		medicare = grossPay * MEDICARE_PERCENT;
		deductions = federal + state + medicare + socialSecurity;
		netPay = grossPay - deductions;
		
		//output
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
			
	}

}
