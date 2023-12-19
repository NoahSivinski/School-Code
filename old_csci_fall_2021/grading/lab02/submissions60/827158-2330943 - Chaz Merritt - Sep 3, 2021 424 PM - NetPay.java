/*
 * NetPay.java
 * Author:  Charles Merritt 
 * Submission Date:  09/03/21
 *
 * Purpose: A basic input/output program to calculate a person's net pay given hours worked, gross pay, and deductions.
 *
 * Statement of Academic Honesty: CEM
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
//import statement
import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// user input and variable
		double HoursPerWeek;
		System.out.print("Hours per Week:\t\t");
		Scanner keyboard=new Scanner (System.in);
		HoursPerWeek=keyboard.nextDouble();
		// variables and constants
		final double FEDERAL_TAX_PERCENT=10.00;
		final double STATE_TAX_PERCENT=4.5; 
		final double SS_PERCENT=6.2; 
		final double MEDICARE_PERCENT=1.45; 
		final double PAY_PER_HOUR=7.25;
		double GrossPay; 
		double NetPay; 
		double FederalDeduction; 
		double MedicareDeduction; 
		double SSDeduction; 
		double StateDeduction;
		// math
		GrossPay=(HoursPerWeek*PAY_PER_HOUR);
		FederalDeduction=(FEDERAL_TAX_PERCENT/100)*GrossPay;
		MedicareDeduction=(MEDICARE_PERCENT/100)*GrossPay;
		SSDeduction=(SS_PERCENT/100)*GrossPay;
		StateDeduction=(STATE_TAX_PERCENT/100)*GrossPay;
		NetPay=GrossPay-FederalDeduction-MedicareDeduction-SSDeduction-StateDeduction;
		// print final output
		//System.out.println("Hours per Week:\t\t" + HoursPerWeek); used in exercise 1 but not needed for exercise 2
		System.out.println("Gross Pay:\t\t" + GrossPay);
		System.out.println("Net Pay:\t\t" + NetPay);
		System.out.println(" ");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + FederalDeduction);
		System.out.println("State:\t\t\t" + StateDeduction);
		System.out.println("Social Security:\t" + SSDeduction);
		System.out.println("Medicare:\t\t" + MedicareDeduction);
	}

}
