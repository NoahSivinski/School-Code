/* 
 * NetPay.java 
 * Author: Kamal Ali
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from anywhere other than the authorized 
 * sources. I recognize that any unauthorized sharing, assistance, 
 * or plagiarism will be handled in accordance with both the 
 * University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based on 
 * an assignment created by the Department of Computer 
 * Science at the University of Georgia. Any publishing or posting 
 * of source code at any time for this project is prohibited. 
 */

import java.util.Scanner;

public class NetPay {
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SOCIAL_SECURITY_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek = input.nextInt();
		
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federalDeduction = grossPay * (FEDERAL_TAX_PERCENT / 100);
		double stateDeduction = grossPay * (STATE_TAX_PERCENT / 100);
		double socialDeduction = grossPay * (SOCIAL_SECURITY_PERCENT / 100);
		double medicareDeduction = grossPay * (MEDICARE_PERCENT / 100);
		double netPay = grossPay - federalDeduction - stateDeduction - socialDeduction - medicareDeduction;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + socialDeduction);
		System.out.println("Medicare:\t\t" + medicareDeduction);
		
		input.close();
	}
}