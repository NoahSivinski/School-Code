
/*
 * [NetPay].java
 * Author:  [Austin Brock] 
 * Submission Date:  [February 5th]
 *
 * Purpose: This program ask the user to input the hours they worked in a week and then calculates their net pay after all tax deductions.
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
			int hoursWorked;
			double grossPay;
			double netPay;
			double Deductions;
			double FEDERAL_TAX_PERCENT = 10.00;
			double STATE_TAX_PERCENT = 4.5;
			double SS_PERCENT = 6.2;
			double MEDICARE_PERCENT = 1.45;
			double PAY_PER_HOUR = 7.25;
			double federal;
			double state;
			double socialSecurity;
			double medicare;
			
			Scanner keyboard= new Scanner(System.in);
			System.out.print("Hours per week:  \t");
			
			hoursWorked = keyboard.nextInt();
			
			grossPay = PAY_PER_HOUR * hoursWorked;
			
			federal = grossPay / FEDERAL_TAX_PERCENT;
			state = grossPay * STATE_TAX_PERCENT / 100;
			socialSecurity = grossPay * SS_PERCENT / 100;
			medicare = grossPay * MEDICARE_PERCENT / 100;
			Deductions = federal + state + socialSecurity + medicare;
			
			netPay = grossPay-Deductions;
			
			
			System.out.println("Gross Pay:      \t" + grossPay);
			System.out.println("Net pay:        \t" + netPay);
		    System.out.println();
			System.out.println("Deductions");
			System.out.println("Federal:        \t" + federal);
			System.out.println("State:          \t" + state);
			System.out.println("SocialSecurity: \t" + socialSecurity);
			System.out.println("Medicare:       \t" + medicare);
			
			
			
			keyboard.close();
	}

}


