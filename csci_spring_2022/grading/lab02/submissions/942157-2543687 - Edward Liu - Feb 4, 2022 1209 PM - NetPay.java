/* 
 * NetPay.java 
 * Author: Edward Liu 
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
	public static void main(String[] args) {
		//User input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:  ");
		double hours = keyboard.nextDouble();
		
		//Given Variables 
		double FEDERAL_TAX_PERCENT= 10.00;
		double STATE_TAX_PERCENT= 4.5 ;
		double SOCIAL_SECURITY_PERCENT= 6.2 ;
		double MEDICARE_PERCENT= 1.45 ;
		double PAY_PER_HOUR= 7.25;
		
		//Calculated Variables
		double grossPay = hours * PAY_PER_HOUR;
		double federalDeduction = grossPay * FEDERAL_TAX_PERCENT/100;
		double stateDeduction = grossPay * STATE_TAX_PERCENT/100;
		double socialSecurityDeduction = grossPay * SOCIAL_SECURITY_PERCENT/100;
		double medicareDeduction = grossPay * MEDICARE_PERCENT/100;
		double netPay = grossPay - federalDeduction - stateDeduction - socialSecurityDeduction - medicareDeduction;
		
		//Print Lines
		System.out.println("Gross Pay:    \t " + grossPay);
		System.out.println("Net Pay:    \t " + netPay);
		System.out.println();
		System.out.println("Deductions:  \t ");
		System.out.println("Federal:    \t " + federalDeduction);
		System.out.println("State:   \t " + stateDeduction);
		System.out.println("Social Security: " + socialSecurityDeduction);
		System.out.println("Medicare:    \t " + medicareDeduction);
		
	}
}
