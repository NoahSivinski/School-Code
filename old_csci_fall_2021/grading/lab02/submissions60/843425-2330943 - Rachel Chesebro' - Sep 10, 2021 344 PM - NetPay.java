/*
 * [NetPay].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [09/10/2021]
 *
 * Purpose: The purpose of this program is to compute gross and net pay
 * based on the user's input of hours worked, hourly wage, and a list of
 * deductions broken down into three categories: federal, state, and social
 * security. Based on the user's input of hours per week, the program should
 * correctly calculate and display the gross and net pay.
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

		Scanner myObj = new Scanner(System.in); 

		//Define variables that show percentage of each tax on deductions from gross pay.
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;

		//Ask user for hours worked per week and calculate pay based on hourly wage. 	
		System.out.print("Hours per Week: ");
		int hours_per_wk = myObj.nextInt();
		double gross_pay = PAY_PER_HOUR * hours_per_wk;
		double net_pay =  0.7785 * gross_pay;
		myObj.close();

		//Print the breakdown of where all of the wage goes within deductions from gross pay.
		System.out.println("Hours per Week: " + "\t" + hours_per_wk);
		System.out.println("Gross Pay: "+ "\t\t" +  gross_pay);
		System.out.println("Net Pay: "+ "\t\t" + net_pay);
		System.out.println("\nDeductions");
		System.out.println("Federal: " + "\t\t" + FEDERAL_TAX_PERCENT * gross_pay / 100);
		System.out.println("State:" + "\t\t\t" + STATE_TAX_PERCENT * gross_pay / 100);
		System.out.println("Social Security:" + "\t" + SS_PERCENT * gross_pay / 100);
		System.out.println("Medicare:" + "\t\t" + MEDICARE_PERCENT * gross_pay / 100);

	}

}
