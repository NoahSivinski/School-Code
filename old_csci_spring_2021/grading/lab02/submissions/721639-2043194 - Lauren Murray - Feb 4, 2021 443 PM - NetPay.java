
/*
 * CSCI1301.java
 * Author:  Lauren Murray 
 * Submission Date:  2/4/2021
 *
 * Purpose: This lab uses user input to calculate compute a 
 *person’s gross and net pay based on  their  hourly  wage,  
 *hours  worked,  and  several withholdings (such as federal tax
 *and state tax).
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
		// TODO Auto-generated method stub

		int hoursPerWeek;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours Per Week:\t\t");
		hoursPerWeek= keyboard.nextInt();

		double FEDERAL_TAX_PERCENT=10.00;
		double STATE_TAX_PERCENT=4.5;
		double SS_PERCENT=6.2;
		double MEDICARE_PERCENT=1.45;
		double PAY_PER_HOUR=7.25;
		//Gross pay is calculated by hours per work is multiplied by pay per hour
		double grosspay= hoursPerWeek*PAY_PER_HOUR;
		
		//Federal tax is calculated by FEDERAL TAX PERCENT multiplied by grosspay
		double federaltax =grosspay*(FEDERAL_TAX_PERCENT/100);

		//state tax is calculated by STATE TAX PERCENT multiplied by grosspay
		double statetax=grosspay*(STATE_TAX_PERCENT/100);

		//social security contribution is calculated by social security contribution percentage multiplied by grosspay
		double ss=grosspay*(SS_PERCENT/100);

		//medicare is calculated by medicare percentage for grosspay
		double medicare=grosspay*(MEDICARE_PERCENT/100);

		//Netpay=grosspay-deductions
		double netpay=grosspay-(federaltax+statetax+ss+medicare);


		System.out.println("Gross Pay:\t\t"+grosspay );
		System.out.println("Net Pay:\t\t"+netpay );
		System.out.println(" ");
		System.out.println("Deductions" );
		System.out.println("Federal:\t\t"+federaltax );
		System.out.println("State:\t\t\t"+statetax);
		System.out.println("Social Security:\t"+ss);
		System.out.println("Medicare:\t\t"+medicare );

		keyboard.close();

	}

}
