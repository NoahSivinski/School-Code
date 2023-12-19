import java.util.Scanner;

/**
 * 
 */
/*
 * [NetPay].java
 * Author:  [Dominique Coney] 
 * Submission Date:  [Febuary 4, 2021]
 *
 * Purpose: The purpose of this program is to determine both the gross and net pays of a person.
 * it is based on the number of hours worked, pay per hour, and multiple deductions.
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
/**
 * @author Dominique Coney
 *
 */
public class NetPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner taxes = new Scanner(System.in);
		System.out.println(" Hours per Week? ");
		int Hours_per_Week=taxes.nextInt();
		double Federal_Tax_Percent=10.00;
		double State_Tax_Percent=4.5;
		double SS_Percent=6.2;
		double Medicare_Percent=1.45;
		double Pay_Per_Hour=7.25;
		double GrossPay=Hours_per_Week*Pay_Per_Hour;
		double Federal=GrossPay*Federal_Tax_Percent/100;
		double State=GrossPay*State_Tax_Percent/100;
		double SocialSecurity=GrossPay*SS_Percent/100;
		double Medicare=GrossPay*Medicare_Percent/100;
		double NetPay=GrossPay-(Federal+State+SocialSecurity+Medicare);
		System.out.println(" Hours per Week:\t " + Hours_per_Week);
		System.out.println(" Gross Pay:\t\t "+ GrossPay);
		System.out.println(" Net Pay:\t\t "+ NetPay);
		System.out.println();
		System.out.println(" Deductions ");
		System.out.println(" Federal:\t\t "+ Federal);
		System.out.println(" State:\t\t\t "+ State);
		System.out.println(" Social Security:\t "+ SocialSecurity);
		System.out.println(" Medicare:\t\t "+ Medicare);
		taxes.close();
	}

}
