/*
 * NetPay.java
 * Author:  Nicolas Blandino 
 * Submission Date:  9/1/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This Program will basically be able to calculate your gross pay, 
 * net pay, and your State, Social security, Medicare and Federal deductions
 * and then print them out for you.
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
		
		Scanner keyboard = new Scanner(System.in);
		double Gross_Pay, Net_Pay, Federal_Deductions, State_Deductions, SS_Deductions, Medicare_Deductions, Deductions_Total;
		
		final int Hours_Per_Week = keyboard.nextInt();
		final double Federal_Tax_Percent = 10;
		final double State_Tax_Percent = 4.5;
		final double SS_Percent = 6.2;
		final double Medicare_Percent = 1.45;
		final double Pay_Per_Hour = 7.25;
		
		Gross_Pay = Hours_Per_Week * Pay_Per_Hour;
		Federal_Deductions = Gross_Pay * Federal_Tax_Percent / 100;
		SS_Deductions = Gross_Pay * SS_Percent / 100;
		State_Deductions = Gross_Pay * State_Tax_Percent / 100;
		Medicare_Deductions = Gross_Pay * Medicare_Percent / 100;
		Deductions_Total = Federal_Deductions + State_Deductions + SS_Deductions + Medicare_Deductions;
		Net_Pay = Gross_Pay - Deductions_Total;
		
		System.out.println("Hours per week: \t" + Hours_Per_Week);
		System.out.println("Gross Pay: \t \t" + Gross_Pay);
		System.out.println("Net Pay: \t \t" + Net_Pay);
		
		System.out.println("\n");
		
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + Federal_Deductions);
		System.out.println("State: \t \t \t" + State_Deductions);
		System.out.println("Social Security: \t" + SS_Deductions);
		System.out.println("Medicare: \t \t" + Medicare_Deductions);
		keyboard.close();
	
	}
	
}
