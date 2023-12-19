/*
 * [CSCI 1301].java
 * Author:  [Fehintola Kofo-Idowu] 
 * Submission Date:  [02/05/2021]
 *
 * Purpose: This code calculates the net pay of an individual wage using the taxes and the total gross pay.
 *
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

		final double FEDERAL_TAX_PERCENT = 10.00;

		final double STATE_TAX_PERCENT =  4.5;

		final double SS_PERCENT =  6.2;

		final double MEDICARE_PERCENT = 1.45;

		final double PAY_PER_HOUR = 7.25;

		Scanner input = new Scanner(System.in);

		System.out.printf("Hours per Week:\t\t");

		double hours = input.nextDouble();

		double grosspay = (hours * PAY_PER_HOUR);
		System.out.println("Gross Pay:\t\t"+ grosspay);

		double fedtax= FEDERAL_TAX_PERCENT * (grosspay/100);
		double statetax=STATE_TAX_PERCENT*(grosspay/100);
		double social=SS_PERCENT*(grosspay/100);
		double med = MEDICARE_PERCENT *(grosspay/100);
		double netpay=grosspay-social-statetax-fedtax-med;

		System.out.println("\nNet Pay:\t\t" + netpay);

		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + fedtax);
		System.out.printf("State:\t\t\t%1.3f " , statetax);
		System.out.println("\nSocial Security:\t" + social);
		System.out.println("Medicare:\t\t" + med);
		input.close();

	}

}
