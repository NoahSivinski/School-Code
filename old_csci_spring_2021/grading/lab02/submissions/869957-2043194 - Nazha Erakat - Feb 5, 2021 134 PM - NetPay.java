/*
 * [CSCI 1301].java
 * Author:  [Nazha Erakat] 
 * Submission Date:  [2/5/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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
		
		int hoursPerWeek; 
		double grossPay; 
		double netPay;  
		double federal; 
		double state; 
		double socialSecurity;
		double medicare;  
		
		
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2; 
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt( );
		
		grossPay = (hoursPerWeek * PAY_PER_HOUR); 
		System.out.println("Gross Pay:\t\t" + grossPay);
		
		netPay = (grossPay - (grossPay * FEDERAL_TAX_PERCENT / 100) - (grossPay * STATE_TAX_PERCENT / 100) - (grossPay * SOCIAL_SECURITY_PERCENT / 100) - (grossPay * MEDICARE_PERCENT / 100)); 
		System.out.println("Net Pay:\t\t" + netPay);
		
		System.out.println(""); 
		
		System.out.println("Deductions");
		
		federal = (grossPay * 0.1); 
		System.out.println("Federal: \t\t" + federal);
		
		state = (grossPay * 0.045); 
		System.out.println("State: \t\t\t" + state); 
		
		socialSecurity = (grossPay * 0.062); 
		System.out.println("Social Security:\t" + socialSecurity);
		
		medicare = (grossPay * 0.0145);
		System.out.println("Medicare: \t\t" + medicare);
		
	}
}
