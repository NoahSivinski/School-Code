/*
 * NetPay.java
 * Author:  Kaushalkumar A. Patel 
 * Submission Date:  02/04/21
 *
 * A brief paragraph description of the program. What does it do?
 * Purpose: The program below allows one to compute a person’s 
 * gross and net pay based on their hourly wage, hours worked, 
 * and several withholdings. The program also counts in 
 * deductions to person's gross pay allowing them to get their 
 * net pay. These deductions will be federal tax, state tax,
 * social security, and medicare.
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
		
		//The deductions and pay per hour are given and stored in the floating-point double.
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		
		
		//This use of scanner allows the user to input the amount of hours per week.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek;
		hoursPerWeek = keyboard.nextInt();
		
		
		//The named variables are given the floating-point double. 
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double socialSecurity;
		double medicare;
		
		
		//The grossPay is calculated by multiplying hoursPerWeek and PAY_PER_HOUR.
		grossPay = (hoursPerWeek * PAY_PER_HOUR);
		
		
		//The deductions are calculated by multiplying the grossPay by the declared named constants, respectively, and then dividing by 100.
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		
		
		//The netPay is calculated by subtracting the deductions from the grossPay.
		netPay = (grossPay - federalTax - stateTax - socialSecurity - medicare);
		
		
		//The print statements are established to print all the named variables.
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);

	}

}
