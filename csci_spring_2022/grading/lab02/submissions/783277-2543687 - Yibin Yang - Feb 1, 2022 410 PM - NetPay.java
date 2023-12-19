/*
* [NetPay].java
* Author: [Yibin Yang]
* Statement of Academic Honesty: *
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

		//constants
		final double PAY_PER_HOUR = 7.25;
		final double MEDICARE_PERCENT = 1.45;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double STATE_TAX_PERCENT = 4.5;
		final double FEDERAL_TAX_PERCENT = 10.00;
		
		//number of work hours per week
		Scanner keyboard = new Scanner(System.in);
		int numHoursPerWeek = keyboard.nextInt();
		keyboard.close();
		System.out.println("Hours per Week:\t\t" + numHoursPerWeek);
		
		//how much of gorss pay
		double dollarGrossPay = numHoursPerWeek * PAY_PER_HOUR;
		System.out.println ("Gross Pay:\t\t" + dollarGrossPay);
		
		//how much of net pay
		double dollarNetPay = dollarGrossPay - dollarGrossPay * FEDERAL_TAX_PERCENT/100 - dollarGrossPay * STATE_TAX_PERCENT/100 -dollarGrossPay * SOCIAL_SECURITY_PERCENT/100 - dollarGrossPay * MEDICARE_PERCENT/100;
		System.out.println("Net Pay:\t\t" + dollarNetPay);	
		System.out.println();
		
		//how much of federal tax 
		double dollarDeductions = dollarGrossPay * FEDERAL_TAX_PERCENT/100;
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + dollarDeductions);
		
		//how much of state tax
		double dollarStateTax = dollarGrossPay * STATE_TAX_PERCENT/100;
		System.out.println("State:\t\t\t" + dollarStateTax);
		
		//how much of Social Security
		double dollarSocialSecurity= dollarGrossPay * SOCIAL_SECURITY_PERCENT/100;
		System.out.println("Socail Security:\t" + dollarSocialSecurity);
		
		//how much of medicare 
		double dollarMedicare = dollarGrossPay * MEDICARE_PERCENT/100;
		System.out.println("Medicare:\t\t" + dollarMedicare);
	}	

}

