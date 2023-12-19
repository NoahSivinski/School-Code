/*
 * [NetPay].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [9/3/2021]
 *
 * Purpose: 
 * The code below evaluates the Gross Pay and Net Pay based on hours worked per week and deductions.
 * Each deduction is added together then subtracted from the Gross Pay to get the Net Pay. 
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declaring variables
		double grossPay;
		double netPay;
		double deductions;
		
		//creating the Scanner object then asking user for input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:" + "\t" + "\t");
		int hoursPerWeek = keyboard.nextInt();
		
		//declaring and initializing constants 
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//initializing variables with computations
		grossPay = (hoursPerWeek * PAY_PER_HOUR);
		deductions = (grossPay * (FEDERAL_TAX_PERCENT / 100)) + (grossPay * (STATE_TAX_PERCENT / 100)) + (grossPay * (SS_PERCENT / 100)) + (grossPay * (MEDICARE_PERCENT / 100));
		netPay = grossPay - deductions; 
		
		//print out needed information
		System.out.println("Gross Pay: " + "\t" + "\t" + grossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal: " + "\t" + "\t" + (grossPay * (FEDERAL_TAX_PERCENT / 100)));
		System.out.println("State: " + "\t" + "\t" + "\t" + (grossPay * (STATE_TAX_PERCENT / 100)));
		System.out.println("Social Security: " + "\t" + (grossPay * (SS_PERCENT / 100)));
		System.out.println("Medicare: " + "\t" + "\t" + (grossPay * (MEDICARE_PERCENT / 100)));
		
		keyboard.close();
	}

}
