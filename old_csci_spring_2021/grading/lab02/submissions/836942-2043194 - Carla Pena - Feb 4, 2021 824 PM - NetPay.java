/*
 * [Net Pay].java
 * Author:  [Carla Pena] 
 * Submission Date:  [February 4, 2021]
 *
 * Purpose: The code takes user input as hours worked per week. 
 * It displays information about their pay in a formatted way.
 * The purpose of this code is to be able to calculate gross pay, 
 * net pay, and deductions based on the hours worked weekly. 
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
		// TODO Auto-generated method stub
		
		System.out.println("Hours per Week");
		Scanner scan = new Scanner(System.in);
		
		int hoursWorked = scan.nextInt();
		scan.close();
		
		final double FEDERAL_TAX_PERCENT = 0.1;
		final double STATE_TAX_PERCENT = 0.045;
		final double SS_PERCENT = 0.062;
		final double MEDICARE_PERCENT = 0.0145;
		final double PAY_PER_HOUR = 7.25;
		
		double fedTaxCut = (hoursWorked * PAY_PER_HOUR) * FEDERAL_TAX_PERCENT;
		double stateTax = (hoursWorked * PAY_PER_HOUR) * STATE_TAX_PERCENT;
		double ssTax = (hoursWorked * PAY_PER_HOUR) * SS_PERCENT;
		double medTax = (hoursWorked * PAY_PER_HOUR) * MEDICARE_PERCENT;
		
		
		System.out.println("Hours per Week:\t\t" + hoursWorked);
		System.out.println("Gross Pay:\t\t" + hoursWorked * PAY_PER_HOUR);
		System.out.println("Net Pay:\t\t" + ((hoursWorked * PAY_PER_HOUR) - (fedTaxCut + stateTax + ssTax + medTax)));
		
		System.out.println();
		
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + fedTaxCut);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + ssTax);
		System.out.println("Medicare:\t\t" + medTax);
		
	}

}
