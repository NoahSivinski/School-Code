/*
 * NetPay.java
 * Author: Will Harrison
 * Submission Date: 02/05/21
 * 
 * Purpose: This code is essentially a calculator. When a business
 * pays their employees, many taxes are deducted from their gross
 * pay. This calculates how much taxes are deducted from the user's
 * pay based on the user's hours that week. The more hours they make,
 * the more money they make, the more money that goes to the government.
 * The Net Pay is how much the user can expect in their paycheck.
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
		public static final double FEDERAL_TAX_PERCENT = 10.00;
		public static final double STATE_TAX_PERCENT = 4.5;
		public static final double SS_PERCENT = 6.2;
		public static final double MEDICARE_PERCENT = 1.45;
		public static final double PAY_PER_HOUR = 7.25;
			public static void main(String[] args) {
				Scanner keyboard = new Scanner(System.in);
				System.out.print("Hours per Week: \t\t");
				double NumberOfHours = keyboard.nextDouble();
				double GrossPay = PAY_PER_HOUR * NumberOfHours;
				double Federal = (GrossPay * FEDERAL_TAX_PERCENT) / 100;
				double State = (GrossPay * STATE_TAX_PERCENT) / 100;
				double SocSec = (GrossPay * SS_PERCENT) / 100;
				double Medicare = (GrossPay * MEDICARE_PERCENT) / 100;
				double NetPay = (GrossPay - Federal - State - SocSec - Medicare);
				System.out.println("Gross Pay: \t\t\t" + GrossPay);
				System.out.println("Net Pay: \t\t\t" + NetPay);
				System.out.println();
				System.out.println("Deductions");
				System.out.println("Federal: \t\t\t" + Federal);
				System.out.println("State: \t\t\t\t" + State);
				System.out.println("Social Security: \t\t" + SocSec);
				System.out.println("Medicare: \t\t\t" + Medicare);
				keyboard.close();
	}

}
