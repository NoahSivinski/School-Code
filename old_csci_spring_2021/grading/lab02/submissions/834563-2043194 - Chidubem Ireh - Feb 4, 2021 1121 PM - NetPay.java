/*
 * NetPay.java
 * Author:  Chidubem Ireh 
 * Submission Date:  2-5-2021
 *
 * Purpose: The purpose of this program is to create a program that will calculate the net pay of a minimum wage worker. The user should be able to input thir weekly hours and a total should be the output.
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
		
		int hoursPerWeek;
		double grossPay;
		double netPay;
		//Deductions
		double federal;
		double state;
		double socialSecurity;
		double medicare;
		//Taxes percents
		double Pay_Per_Hour = 7.25;
		double Medicare_Percent= 0.0145;
		double SS_Percent= 0.062;
		double Federal_Tax_Percent=0.10;
		double State_Tax_Percent=0.045;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print ("Hours Per Week:\t\t"); 
		hoursPerWeek = keyboard.nextInt();
		grossPay= hoursPerWeek * Pay_Per_Hour;
		federal= grossPay * Federal_Tax_Percent;
		state= State_Tax_Percent * grossPay;
		socialSecurity= SS_Percent * grossPay;
		medicare= Medicare_Percent * grossPay;
		netPay= grossPay - federal -state - socialSecurity - medicare;
		grossPay= hoursPerWeek * Pay_Per_Hour;
		
		System.out.println("Gross pay:\t\t" + grossPay);
		grossPay= hoursPerWeek * Pay_Per_Hour;
		
		System.out.println("Net Pay:\t\t" + netPay );
		System.out.println("\nDeductions " );
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		keyboard.close();
}
}