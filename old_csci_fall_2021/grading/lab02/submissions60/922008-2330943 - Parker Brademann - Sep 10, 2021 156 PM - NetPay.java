/*
 * NetPay.java
 * Author:  Parker Brademann 
 * Submission Date:  September 10, 2021
 *
 * Purpose: This program intends to calculate a worker's gross and net wages, taking into account taxes at the federal and state levels,
 * as well as other government programs.
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
		
			double pay_per_hour = 7.25;
			//System.out.println(pay_per_hour + "%");

			double federal_tax_pct = 10.00;
			//System.out.println(federal_tax_pct + "%");

			double medicare_pct = 1.45;
			//System.out.println(medicare_pct + "%");

			double state_tax_pct = 4.5;
			//System.out.println(state_tax_pct + "%");

			double ss_pct = 6.2;
			//System.out.println(ss_pct + "%");

			double hours_per_week = 40;
			//System.out.println(hours_per_week);

			double gross_pay = pay_per_hour * hours_per_week;
			//System.out.println(gross_pay);

			//prints to console are being used as repos for further calls
			
			double federal_deductions = gross_pay * .10;
			//System.out.println(pay_after_federal);
			
			double state_deductions = gross_pay * .045;
			//System.out.println(pay_after_state);
			
			double ss_deductions = gross_pay * .062;
			//System.out.println(pay_after_ss);
			
			double medicare_deductions = gross_pay * .0145;
			//System.out.println(pay_after_medicare);
			
			double net_pay = gross_pay - federal_deductions - state_deductions - ss_deductions - medicare_deductions;
			
			//user input begins here
			
			System.out.println("Enter your hourly wage below: \n");
			try (Scanner keyboard = new Scanner(System.in)) {
				pay_per_hour = keyboard.nextDouble();
				System.out.println("\nEnter your hours worked per week here: \n");
				hours_per_week = keyboard.nextDouble();
			}
			
			
			gross_pay = pay_per_hour * hours_per_week;
			
			federal_deductions = gross_pay * .10;
			//System.out.println(pay_after_federal);
			
			state_deductions = gross_pay * .045;
			//System.out.println(pay_after_state);
			
			ss_deductions = gross_pay * .062;
			//System.out.println(pay_after_ss);
			
			medicare_deductions = gross_pay * .0145;
			//System.out.println(pay_after_medicare);
			
			net_pay = gross_pay - federal_deductions - state_deductions - ss_deductions - medicare_deductions;
			
			System.out.println("\nHOURS PER WEEK: \t\t\t" + hours_per_week);
			System.out.println("GROSS PAY: \t\t\t\t" + gross_pay);
			System.out.println("NET PAY: \t\t\t\t" + net_pay);
			System.out.println("\nDEDUCTIONS:");
			System.out.println("\nFEDERAL DEDUCTIONS: \t\t\t" + federal_deductions);
			System.out.println("STATE DEDUCTIONS: \t\t\t" + state_deductions);
			System.out.println("SOCIAL SECURITY DEDUCTIONS: \t\t" + ss_deductions);
			System.out.println("MEDICARE DEDUCTIONS: \t\t\t" + medicare_deductions);
			
		}

	}