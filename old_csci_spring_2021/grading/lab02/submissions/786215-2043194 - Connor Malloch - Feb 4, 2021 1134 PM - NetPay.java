import java.util.Scanner;
/*
 * NetPay.java
 * Author:  Connor Malloch 
 * Submission Date:  Feburary 5th 2020
 *
 * Purpose: Calculates Gross Pay, Net Pay, and many other deductions given hours per week and tax percentages
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
public class NetPay {
	static final double FEDERAL_TAX_PERCENT = .10;
	static final double STATE_TAX_PERCENT = .045;
	static final double SS_PERCENT = .062;
	static final double MEDICARE_PERCENT = .0145;
	static final double PAY_PER_HOUR = 7.25;
	static double gross_pay;
	static double net_pay;

	static double fed_red;
	static double med_red;
	static double state_red;
	static double social_red;
	public static void main(String[] args)
	{
		System.out.println("Hours Per Week");
		Scanner input = new Scanner(System.in);
		int hours= input.nextInt();		
		//gross pay
		gross_pay = PAY_PER_HOUR * hours;

		//deduction calculations
		fed_red = gross_pay * FEDERAL_TAX_PERCENT;
		med_red = gross_pay * MEDICARE_PERCENT;
		state_red = gross_pay * STATE_TAX_PERCENT;
		social_red = gross_pay * SS_PERCENT;

		//net pay calculation
		net_pay = gross_pay-(fed_red+med_red+state_red+social_red);

		System.out.println("Hours Per Week: " + hours);
		System.out.println("Gross Pay: " + gross_pay);
		System.out.println("Net Pay: " + net_pay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal: " + fed_red);
		System.out.println("State: " + state_red);
		System.out.println("Social Secuirty: " + social_red);
		System.out.println("Medicare: " + med_red);

	}
}
