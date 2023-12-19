/*
 * NetPay.java

 * Author:  Deborah Orekoya 
 * Submission Date:  02/4/2021
 *
 * Purpose: 
 * 
 * The purpose of my program is to compute taxes and pay.
 * By entering the amount of hours worked per week, an 
 * individual is a able to determine his or her Net Pay, 
 * Gross Pay, and Deductions.
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

		double Pay_Per_Hour;
		double GrossPay;
		double Federal_Tax_Percent;
		double Federal;
		double State_Tax_Percent;
		double State;
		double SS_Percent;
		double SocialSecurity;
		double Medicare_Percent;
		double Medicare;
		double Deductions;
		double NetPay;

		Pay_Per_Hour = 7.25;
		Federal_Tax_Percent = 10.00;
		State_Tax_Percent = 4.5;
		SS_Percent = 6.2;
		Medicare_Percent = 1.45;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		int HoursperWeek = keyboard.nextInt();

		GrossPay = HoursperWeek * Pay_Per_Hour;
		Federal = GrossPay * Federal_Tax_Percent / 100;
		State = GrossPay * State_Tax_Percent / 100;
		SocialSecurity = GrossPay * SS_Percent / 100;
		Medicare = GrossPay * Medicare_Percent / 100;
		Deductions = Federal + State + SocialSecurity + Medicare;
		NetPay = GrossPay - Deductions;

		System.out.println("Gross Pay:\t\t" + GrossPay);
		System.out.println("Net Pay:\t\t" + NetPay);
		System.out.println();
		System.out.println("Deductions\t\t");
		System.out.println("Federal:\t\t" + Federal);
		System.out.println("State:\t\t\t" + State);
		System.out.println("Social Security:\t" + SocialSecurity);
		System.out.println("Medicare:\t\t" + Medicare);

		keyboard.close();	

	}

}
