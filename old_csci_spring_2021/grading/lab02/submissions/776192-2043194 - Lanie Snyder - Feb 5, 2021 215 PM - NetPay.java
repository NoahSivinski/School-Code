/*
 * CSCI1301.java
 * Author:  Lanie Snyder 
 * Submission Date:  02/05/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * I made this program to compute a person's gross net pay based on 
 * their hourly wage, hours worked, and deductions. The person needs
 * to enter their hours worked. The program will then compute their 
 * gross and net pay. It will also show how much is being taken out 
 * of their gross pay in deductions.
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
	public static final double PAY_PER_HOUR = 7.25;  // In dollars
	
	public static void main(String[] args) {
		int hoursPerWeek;
		double grossPay, netPay, federal, state, socialSecurity, medicare; //In dollars
		
		System.out.print("Hours per Week: \t");
		
		Scanner keyboard = new Scanner(System.in);	
		hoursPerWeek = keyboard.nextInt();
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federal = grossPay * (FEDERAL_TAX_PERCENT / 100);
		state = grossPay * (STATE_TAX_PERCENT / 100);
		socialSecurity = grossPay * (SS_PERCENT / 100);
		medicare = grossPay * (MEDICARE_PERCENT / 100);
		netPay = grossPay - (federal + state + socialSecurity + medicare);
		
		
		System.out.println("Gross Pay: \t \t" + grossPay);
		System.out.println("Net Pay: \t \t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + federal);
		System.out.println("State: \t \t \t" + state);
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t \t" + medicare);
	
		keyboard.close();
		
	}

}
