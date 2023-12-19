/*
		 * NetPay.java
		 * Author:  Prateek Yadav
		 * Submission Date:  8/30/2021
		 * Due Date: 9/03/2021
		 *
		 * Purpose: This program prompts the user for an input of how many hours an individual works.
		 * It then calculates the gross and net pay based on constant tax rates and a constant wage.
		 * All of this information is presented to the user, alongside how much each deduction was worth.
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
		 * 
		 * I agree with this statement^^
		 */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
		
		//Scanner object creation
		Scanner keyboard = new Scanner(System.in);
		
		
		//Constants, denoted with "final" and capitalization
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		
		//Declaring main Variables
		double grossPay, netPay, deductions;
		int hoursWorked;
		
		
		//Initial prompt for weekly hours
		System.out.print("Hours per Week:\t\t");
		hoursWorked = keyboard.nextInt();
		
		
		//Gross Pay calculation based on user input
		grossPay = PAY_PER_HOUR * hoursWorked;
		
		
		//Below is a "commented out" alternative method to calculate deductions
		//This method is efficient as it removes the need for extra variables
		//It was not employed so as to comply with lab guidelines:
		//deductions = grossPay - grossPay * (1 - ((FEDERAL_TAX_PERCENT + STATE_TAX_PERCENT + SS_PERCENT + MEDICARE_PERCENT)/100));
		
		
		//Sticking to guidelines, individual deductions are declared and initialized below
		double federalTax = grossPay * (FEDERAL_TAX_PERCENT/100);
		double stateTax = grossPay * (STATE_TAX_PERCENT/100);
		double socialSecurity = grossPay * (SS_PERCENT/100);
		double medicare = grossPay * (MEDICARE_PERCENT/100);
		
		
		//Calculating total deductions and netPay based on grossPay
		deductions = federalTax + stateTax + socialSecurity + medicare;
		netPay = grossPay - deductions;
		
		
		//Outputs
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay: \t\t"+ netPay + "\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + (federalTax));
		System.out.println("State:\t\t\t" + (stateTax));
		System.out.println("Social Security:\t" + (socialSecurity));
		System.out.println("Medicare:\t\t" + (medicare));
		
		
		//Closing Scanner
		keyboard.close();		
		

	}

}
