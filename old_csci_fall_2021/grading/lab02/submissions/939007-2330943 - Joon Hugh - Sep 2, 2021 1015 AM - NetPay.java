/*
 * NetPay.java
 * Author:  Joon Hugh
 * Submission Date:  September 2nd, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * The user inputs the number of hours per week they work.
 * Then it calculates the Net Pay based off of Pay Per Hour,
 * Federal tax percent, State tax percent, Social Security,
 * and Medicare Percent.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */



//import statement
import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {

		//Assigning my Scanner
		Scanner keyboard = new Scanner(System.in);

		//Declaring named constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;

		//Declaring Variables for later calculation and print outputs
		double HoursPerWeek, GrossPay, FederalTaxPaymentInDecimals, FederalTaxPayment
		, StateTaxPaymentInDecimals, StateTaxPayment, SocialSecurityPaymentInDecimals
		, SocialSecurityPayment, MedicarePaymentInDecimals, MedicarePayment, NetPay;

		//Asks you to input the number of hours per week
		System.out.print("Hours per Week:\t\t");
		//Input for number of hours per week
		HoursPerWeek = keyboard.nextDouble();
		//int HoursPerWeekInt = (int) HoursPerWeek;

		//Assigning + Calculating other Variables
		GrossPay = HoursPerWeek * PAY_PER_HOUR;

		//Calculating Federal Tax Payment
		FederalTaxPaymentInDecimals = FEDERAL_TAX_PERCENT / 100;
		FederalTaxPayment = GrossPay * FederalTaxPaymentInDecimals;

		//Calculating State Tax Payment
		StateTaxPaymentInDecimals = STATE_TAX_PERCENT / 100;
		StateTaxPayment = GrossPay * StateTaxPaymentInDecimals;

		//Calculating Social Security Payment
		SocialSecurityPaymentInDecimals = SS_PERCENT / 100;
		SocialSecurityPayment = GrossPay * SocialSecurityPaymentInDecimals;

		//Calculating Medicare Payment
		MedicarePaymentInDecimals = MEDICARE_PERCENT / 100;
		MedicarePayment = GrossPay * MedicarePaymentInDecimals;

		//Calculating Gross Pay
		System.out.println("Gross Pay:\t\t" + GrossPay);
		
		
		//Calculating Net Pay
		NetPay = GrossPay - FederalTaxPayment - StateTaxPayment
				- SocialSecurityPayment - MedicarePayment;

		//Output for respective variables {
		System.out.println("Net Pay:\t\t" + NetPay);
		//New line for I/O purposes
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + FederalTaxPayment);

		System.out.println("State:\t\t\t" + StateTaxPayment);
		System.out.println("Social Security:\t" + SocialSecurityPayment);
		System.out.println("Medicare:\t\t" + MedicarePayment);
		//}

		keyboard.close();
	}

}