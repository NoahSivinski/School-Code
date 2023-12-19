/* 
 * NetPay.java 
 * Author: Joshua Lumogdang
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
		
		//Declaring constants
		final double federalTaxPercent = 10.00;
		final double stateTaxPercent = 4.5;
		final double socialSecurityPercent = 6.2;
		final double medicarePercent = 1.45;
		final double payPerHour = 7.25;
		
		//Getting user input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:" + "\t" + "\t");
		int hoursPerWeek = keyboard.nextInt();
		
		//Declaring and computing variables
		double grossPay = hoursPerWeek  * payPerHour;
		double federalDeduction = grossPay * (federalTaxPercent * .01);
		double stateDeduction = grossPay * (stateTaxPercent * .01);
		double socialSecurityDeduction = grossPay * (socialSecurityPercent * .01);
		double medicareDeduction = grossPay * (medicarePercent * .01);
		double netPay  = grossPay - federalDeduction - stateDeduction - socialSecurityDeduction - medicareDeduction;
		
		//Printing and formatting values
		System.out.println("Gross Pay: " + "\t" + "\t" + grossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t" + "\t" + federalDeduction);
		System.out.println("State:" + "\t" + "\t" + "\t" + stateDeduction);
		System.out.println("Social Security:" + "\t" + socialSecurityDeduction);
		System.out.print("Medicare:" + "\t" + "\t" + medicareDeduction);
		
	}

}
