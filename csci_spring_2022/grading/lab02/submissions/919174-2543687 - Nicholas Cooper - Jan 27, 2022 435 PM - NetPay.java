/* 
 * NetPay.java 
 * Author: Nicholas Cooper 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from anywhere other than the authorized 
 * sources. I recognize that any unauthorized sharing, assistance, 
 * or plagiarism will be handled in accordance with both the 
 * University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based on 
 * an assignment created by the Department of Computer 
 * Science at the University of Georgia. Any publishing or posting 
 * of source code at any time for this project is prohibited. 
 */
import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Prompting user to input number of hours per week
		Scanner userInput = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		int hours = userInput.nextInt();
		
		// Declaring values that will be used in calculations
		final double PAY_PER_HOUR = 7.25;
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		
		// Calculate gross pay
		double grossPay = hours * PAY_PER_HOUR;
		
		// Calculate federal tax
		double federalTax = grossPay * FEDERAL_TAX_PERCENT / 100;
		
		// Calculate state tax
		double stateTax = grossPay * STATE_TAX_PERCENT / 100;
		
		// Calculate social security tax
		double socialSecurityTax = grossPay * SOCIAL_SECURITY_PERCENT / 100;
		
		// Calculate medicare tax
		double medicareTax = grossPay * MEDICARE_PERCENT / 100;
		
		// Calculate net pay
		double totalDeductions = federalTax + stateTax + socialSecurityTax + medicareTax;
		double netPay = grossPay - totalDeductions;
		
		// Print statements
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurityTax);
		System.out.println("Medicare:\t\t" + medicareTax);
		
	}

}
