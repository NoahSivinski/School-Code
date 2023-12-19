 /*
 * NetPay.java
 *Author: Brandon Czech
 *Submission Date: February 5th, 2021
 *
 * Purpose: The code will take the user input of any numerical value for hours and calculate the gross pay, net pay, and all deductions based on 
 * the input.
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
 import java.util.Scanner;
 
 public class NetPay {
	 
	public static void main(String[] args) {
		
		final double PAY_PER_HOUR = 7.25;
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t");
		int hours = keyboard.nextInt();
		double pay = hours * PAY_PER_HOUR;
		System.out.println("Gross Pay: \t\t" + pay);
		System.out.println("Net Pay: \t\t" + (pay-(pay * (FEDERAL_TAX_PERCENT+STATE_TAX_PERCENT+SS_PERCENT+MEDICARE_PERCENT) / 100)));
		System.out.println("\nDeductions");
		System.out.println("Federal: \t\t" + (FEDERAL_TAX_PERCENT / 100 * pay));
		System.out.println("State: \t\t\t" + (STATE_TAX_PERCENT / 100 * pay));
		System.out.println("Social Security: \t" + (SS_PERCENT / 100 * pay));
		System.out.println("Medicare: \t\t" + (MEDICARE_PERCENT / 100 * pay));
		
		
	}

}

