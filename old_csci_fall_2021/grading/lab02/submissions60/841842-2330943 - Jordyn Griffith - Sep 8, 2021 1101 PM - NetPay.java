/*
 * NetPay.java
 * Author:  Jordyn Griffith
 * Submission Date:  [09-08-2021]
 *
 * Purpose: This program is designed to compute a person's gross 
 * and net pay based on their hourly wage, hours worked, and 
 * several withholdings. 
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
		
		//Declare and initialize constants
		public static final double FEDERAL_TAX_PERCENT = 10.00;
		public static final double STATE_TAX_PERCENT = 4.5;
		public static final double SS_PERCENT = 6.2;
		public static final double MEDICARE_PERCENT = 1.45;
		public static final double PAY_PER_HOUR = 7.25; 
	
	public static void main(String[] args) {

		//Declare variables 
		int hoursPerWeek;
		double grossPay, netPay, federal, state, socialSecurity, medicare;
		
		System.out.print("Hours per Week:\t\t");
		try (//Get the Hours per Week from the User
		Scanner keyboard = new Scanner(System.in)) {
			hoursPerWeek = keyboard.nextInt();
		} 
		//grossPay is calculated by multiplying hoursPerWeek and the constant, PAY_PER_HOUR
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		
		//federal is calculated by computing grossPay * (FEDERAL_TAX_PERCENT / 100) 
		federal = grossPay * (FEDERAL_TAX_PERCENT /100);
		
		//state is calculated by computing grossPay * (STATE_TAX_PERCENT / 100) 
		state =  grossPay * (STATE_TAX_PERCENT / 100);
		
		//socialSecurity is calculated by computing grossPay * (SS_PERCENT / 100) 
		socialSecurity = grossPay * (SS_PERCENT / 100);
		
		//medicare is calculated by computing grossPay * (MEDICARE_PERCENT / 100)
		medicare = grossPay * (MEDICARE_PERCENT / 100);
		
		//netPay is calculated by subtracting all deductions from grossPay
		netPay = grossPay - (federal + state + socialSecurity + medicare); 
		
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" +socialSecurity); 
		System.out.println("Medicare:\t\t" + medicare);
		
		
	}

}
