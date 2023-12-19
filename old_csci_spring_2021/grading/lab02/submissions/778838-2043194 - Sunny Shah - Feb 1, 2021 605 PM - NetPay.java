/*
 * NetPay.java
 * Author:  Sunny Shah 
 * Submission Date:  02/05/2021
 *
 * Purpose: This program computes a person's gross and net pay based 
 * on their hourly wage, hours worked, and several withholdings.
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
 *//**
 * 
 */

/**
 * @author sharv
 *
 */
import java.util.Scanner;

public class NetPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int hoursPerWeek;
		double grossPay;
		double netPay;
		double deductions;
		double federal;
		double state;
		double socialSecurity;
		double medicare;
		double payPerHour;
		
		payPerHour = 7.25;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:" + " " + " " + " " + " " + " " + " " + " ");
		hoursPerWeek = keyboard.nextInt( );
		
		grossPay = payPerHour * hoursPerWeek;
		federal = (.10 * grossPay);
		state = (0.045 * grossPay);
		socialSecurity = (0.062 * grossPay);
		medicare = (0.0145 * grossPay);
		deductions = federal + state + socialSecurity + medicare;
		netPay = grossPay - deductions;
		
		System.out.println("Gross Pay:" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + grossPay);
		System.out.println("Net Pay:" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + netPay + System.lineSeparator());
		
		System.out.println("Deductions");
		System.out.println("Federal:" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + federal);
		System.out.println("State:" + " " + " " + " " + " " + " " + " " + " " + " " +" " + " " + " " + " " + " " + " " + " " + " " + state);
		System.out.println("Social Security:" + " " + " " + " " + " " + " " + " " + socialSecurity);
		System.out.println("Medicare:" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + medicare);

		keyboard.close( );
		
	}

}
