/*
 * [NetPay].java
 * Author:  [Kyle Bai] 
 * Submission Date:  [02/04/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * It calculate the Gross pay that you got from the total hours that you worked.
 * It also calculate the Net pay after Fedral tax, State tax, Social security and Medicare cost.
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

		double FEDERAL_TAX_PERCENT = 10.00; //Declare the value of Federal tax percent is 10.00%.
		double STATE_TAX_PERCENT = 4.5; //Declare the value of State tax percent is 4.5%.
		double SS_PERCENT = 6.2; //Declare the value of Social security percent is 6.2%.
		double MEDICARE_PERCENT = 1.45; //Declare the value of Medicare percent is 1.45%.
		double PAY_PER_HOUR = 7.25; //Declare the value of hourly rate is 7.25.

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:" + '\t' + '\t');
		double HOURS_PER_WEEK = keyboard.nextDouble();

		double GROSS_PAY = HOURS_PER_WEEK * PAY_PER_HOUR; //Calculate the Gross pay.
		System.out.println("Gross Pay:" + '\t' + '\t' + GROSS_PAY);

		double FEDERAL = FEDERAL_TAX_PERCENT / 100 * GROSS_PAY; //Calculate the Federal tax cost.
		double STATE = STATE_TAX_PERCENT / 100 * GROSS_PAY; //Calculate the State tax cost.
		double SOCIAL_SECURITY = SS_PERCENT / 100 * GROSS_PAY; //Calculate the Social Security cost.
		double MEDICARE = MEDICARE_PERCENT / 100 * GROSS_PAY; // Calculate the Medicare cost.

		double NET_PAY = GROSS_PAY - FEDERAL - STATE - SOCIAL_SECURITY - MEDICARE; //Calculate the Net Pay.
		System.out.println("Net Pay:" + '\t' + '\t' + NET_PAY);

		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:" + '\t' + '\t' + FEDERAL);
		System.out.println("State:" + '\t' + '\t' + '\t' + STATE);
		System.out.println("Social Security:" + '\t' + SOCIAL_SECURITY);
		System.out.println("Medicare:" + '\t' + '\t' + MEDICARE);

		keyboard.close();
	}

}
