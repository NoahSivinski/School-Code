/*
 * NetPay.java
 * Author: Nate Kite
 * Submission Date: 8/31/2021
 *
 * Purpose: Accepts user input for number of hours worked, then outputs gross pay, net pay, and deductions due to taxes/other expenses.
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

import java.util.*;

public class NetPay {

	public static void main(String[] args) {
		
		//declare constants
		double Federal_Tax_Percent = 10.00;
		double State_Tax_Percent = 4.5;
		double SS_Percent = 6.2;
		double Medicare_Percent = 1.45;
		double Pay_Per_Hour = 7.25;
		double Total_Deduction_Percent = (.01*(Federal_Tax_Percent+State_Tax_Percent+SS_Percent+Medicare_Percent));
		
		//Set up scanner, get user input, and store that in variable 'hours'
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t");
		double hours = keyboard.nextDouble();
		
		//output everything
		System.out.println("Gross Pay:\t\t" + (Pay_Per_Hour*hours));
		System.out.println("Net Pay:\t\t" + (Pay_Per_Hour*hours*(1-Total_Deduction_Percent)) + "\n");
		
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + (Pay_Per_Hour*hours*0.01*Federal_Tax_Percent));
		System.out.println("State:\t\t\t" + (Pay_Per_Hour*hours*0.01*State_Tax_Percent));
		System.out.println("Social Security:\t" + (Pay_Per_Hour*hours*0.01*SS_Percent));
		System.out.println("Medicare:\t\t" + (Pay_Per_Hour*hours*0.01*Medicare_Percent));
		
		
		
	}

}
