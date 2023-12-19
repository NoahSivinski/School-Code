/*
 * CSCI 1301.java
 * Author: Rayman Ng 
 * Submission Date: 2/5/2021
 *
 * Purpose: This program calculates your gross pay, net pay, and deductions using user input on the number of hours worked that week. Calculations are made using a fixed tax amount and a fixed wage. 
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
	//Constants
	public static final double Federal_Tax_Percent = 10.00;
	public static final double State_Tax_Percent = 4.5;
	public static final double SS_Percent = 6.2;
	public static final double Medicare_Percent = 1.45;
	public static final double Pay_Per_Hour = 7.25;

	public static void main(String[] args) {
		double grossPay; 
		double netPay; 
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Hours per week:" + '\t'+ '\t');
		int hoursPerWeek = keyboard.nextInt();
		grossPay = hoursPerWeek * Pay_Per_Hour;
		netPay = grossPay - (grossPay * (Federal_Tax_Percent/100)) - (grossPay * (State_Tax_Percent/100)) - (grossPay * (SS_Percent/100)) - (grossPay * (Medicare_Percent/100));
		System.out.println("Gross Pay:" + '\t'+ '\t' + grossPay);
		System.out.println("Net Pay:"+ '\t'+ '\t'+ netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:" + '\t'+'\t'+ grossPay * 10/100);
		System.out.println("State:" + '\t' + '\t'+ '\t' + grossPay * 4.5/100);
		System.out.println("Social Security:" +'\t' + grossPay * 6.2/100);
		System.out.println("Medicare:" + '\t' + '\t' + grossPay * 1.45/100);
		keyboard.close();

	}

}
