/*
 * NetPay.java
 * Author:  Amir Ali 
 * Submission Date:  2/5/21
 *
 * Purpose: The purpose of this code is to create a simple program in which the user can input the number of hours worked and get
 * the output the gross pay including deductions based on minimum wage pay.
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
 * 
 * I agree
 */

import java.util.Scanner;
public class NetPay {
	/**
	 * 
	 * @param args
	 */
		public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	
		final double FEDERAL_TAX_PERCENT= 10.00;
		final double STATE_TAX_PERCENT= 4.5;
		final double SS_PERCENT= 6.2;
		final double MEDICARE_PERCENT= 1.45;
		final double PAY_PER_HOUR= 7.25;
		
		System.out.print("Hours Per Week: \t");
		double hoursWorked= input.nextDouble();
		double grosspay= hoursWorked*PAY_PER_HOUR;
		
		double federaltax= grosspay*(FEDERAL_TAX_PERCENT/100);
		double statetax= grosspay*(STATE_TAX_PERCENT/100);
		double ss= grosspay*(SS_PERCENT/100);
		double medicare= grosspay*(MEDICARE_PERCENT/100);
		double netpay=grosspay-(federaltax+statetax+ss+medicare);
		
		System.out.println("Gross Pay: \t\t"+ grosspay);
		System.out.printf("Net Pay: \t\t%.3f\n", netpay);
		System.out.println("Deductions");
		System.out.println("Federal: \t\t"+ federaltax);
		System.out.printf("State: \t\t\t%.2f\n", statetax);
		System.out.println("Social Security: \t" +ss);
		System.out.printf("Medicare: \t\t%.3f\n", medicare);
	}

}

