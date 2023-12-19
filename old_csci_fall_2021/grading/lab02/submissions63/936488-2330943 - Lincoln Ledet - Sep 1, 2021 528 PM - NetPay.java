/*
 * NetPay.java
 * Author: Lincoln L. Ledet
 * 9/1/21 
 * 
 * Purpose: This program calculates the amount of money made in a week as well as the 
 * deductions/taxes taken from that weeks paycheck. This program shows how to initialize  
 * variables, perform basic calculations, get input from a user and display an output to a user. 
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

import java.util.Scanner;//imports java scanner library 
public class NetPay {
	public static void main(String[] args) {
		//initializing variables and assigning values given in lab.
		double federalTaxPercent = 10.00;
		double stateTaxPercent =  4.5;
		double socialSecurityPercent = 6.2;
		double medicarePercent = 1.45;
		double payPerHour = 7.25;
		
		//Asks user how many hours worked this week
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		double hourPerWeek = Keyboard.nextDouble();

		//Calculating gross pay
		double grossPay = (payPerHour*hourPerWeek);
				
		//Calculates deductions and Net Pay. 
		//Tax percentage is multiplied by .01
		double federalDeduction = (grossPay*.01*federalTaxPercent);
		double stateDeduction = (grossPay*.01*stateTaxPercent);
		double socialSecurityDeduction = (grossPay*.01*socialSecurityPercent);
		double medicareDeduction = (grossPay*.01*medicarePercent);
		
		double netPay = grossPay-(federalDeduction+stateDeduction+socialSecurityDeduction+medicareDeduction);
		
		//Displays output to user
		System.out.println("Gross Pay:\t\t"+ grossPay);
		System.out.println("Net Pay:\t\t"+ netPay);
		System.out.println();
		System.out.println("Deductions\t\t");
		System.out.println("Federal:\t\t"+ federalDeduction);
		System.out.println("State:\t\t\t"+ stateDeduction);
		System.out.println("Social Security:\t"+ socialSecurityDeduction);
		System.out.println("Medicare:\t\t"+ medicareDeduction);

	}

}
