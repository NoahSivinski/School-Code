import java.util.Scanner; 
/*
 * [Netpay].java
 * Author:  [Backam Nguyen] 
 * Submission Date:  [9/10/2021]
 *
 * Purpose: NetPay, is a program I created to help calculate a person's net pay. 
 * 			Using the hours per week inputed by the user, this program will take that input and multiply with their pay rate calculating their gross pay. 
 * 			Following the users input and the program's calculations, Net pay uses the constant tax deductions rates and multiplies it by their gross pay giving the user their total tax deductions.
 * 			With the user's input and the programs calculations the output will display the user's hours per week, gross, pay, net pay, individual tax deductions and total tax dedcutions.
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

	public class NetPay {
	
		//Declare the constant variables rates.
		private static final double FEDERAL_TAX_PERCENT = 10.00; 
		private static final double STATE_TAX_PERCENT = 4.5; 
		private static final double SOCIAL_SECURITY_PERCENT = 6.2; 
		private static final double MEDICARE_PERCENT = 1.45;
		private static final double PAY_PER_HOUR = 7.25;
		//final stands for the constant rate that will not change.
	
		public static void main(String[] args) { 
		
		Scanner keyboard = new Scanner(System.in);	
		
		//Prompt the user to enter their hours per week.
		double hoursPerWeek; 
		System.out.print("Hours per Week: \t");  
		hoursPerWeek = keyboard.nextDouble();
	
		//Calculate the tax deductions from the gross pay.
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federalDeduction = grossPay * FEDERAL_TAX_PERCENT * 0.01; 
		double stateDeduction = grossPay * STATE_TAX_PERCENT * 0.01; 
		double socialSecurityDeduction = grossPay * SOCIAL_SECURITY_PERCENT * 0.01; 
		double medicareDeduction = grossPay * MEDICARE_PERCENT * 0.01;
		double totalDeduction = federalDeduction + stateDeduction + socialSecurityDeduction + medicareDeduction; 

		//Calculate netPay by taking your grossPay - totalDed.
		double netPay = grossPay - totalDeduction;

		//Use the correct printout statements.
		System.out.println("Gross Pay:" + "\t" + "\t" + grossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + netPay);
		System.out.println();
	
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t" + "\t" + federalDeduction);
		System.out.println("State:" + "\t" + "\t" + "\t" + stateDeduction);
		System.out.println("Social Security:" + "\t" + socialSecurityDeduction);
		System.out.println("Medicare:" + "\t" + "\t" + medicareDeduction);

		keyboard.close();
	}

}
