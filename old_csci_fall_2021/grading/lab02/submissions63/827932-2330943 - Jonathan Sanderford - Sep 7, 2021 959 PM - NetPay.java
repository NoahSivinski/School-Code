/*
 * NetPay.java
 * Author:  Jonathan Sanderford
 * Submission Date:  9/2/2021
 *
 * Purpose: This program calculates net pay based on number of hours which gives gross pay
 * and subtracting the deductions calculated from gross pay and its corresponding taxes.
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
	public static final double SS_TAX_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) {
	
		Scanner keyboard=new Scanner(System.in);
		double gross_pay,net_pay,federal,state,social_security,medical,deductions;
		
		System.out.print("Hours per Week:\t\t");
		int hours=keyboard.nextInt();
		
		gross_pay=hours*PAY_PER_HOUR;
		federal=gross_pay*(FEDERAL_TAX_PERCENT/100);
		state=gross_pay*(STATE_TAX_PERCENT/100);
		social_security=gross_pay*(SS_TAX_PERCENT/100);
		medical=gross_pay*(MEDICARE_PERCENT/100);
		deductions=medical+social_security+state+federal;
		net_pay=gross_pay-deductions;
		
		System.out.println("Gross Pay:\t\t"+gross_pay);
		System.out.println("Net Pay:\t\t"+net_pay+"\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t"+federal);
		System.out.println("State:\t\t\t"+state);
		System.out.println("Social Security:\t"+social_security);
		System.out.println("Medicare:\t\t"+medical);
		
	}

}
