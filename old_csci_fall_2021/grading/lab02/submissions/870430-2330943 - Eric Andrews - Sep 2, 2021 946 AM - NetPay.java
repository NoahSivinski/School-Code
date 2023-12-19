import java.util.Scanner;

/*
 * NetPay.java
 * Author:  Eric Andrews 
 * Submission Date:  9/3/2021
 *
 * Purpose: This program calculates the amount of taxes taken out of 
 * your net pay every week based on the amount of hours that you work.
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

	public static void main(String[] args) {

		int HoursPerWeek;									//Created variables for our Input/Output
		double GrossPay;
		double NetPay;
		double Federal;
		double State;
		double SocialSecurity;
		double Medicare;

		double FEDERAL_TAX_PERCENT;							//Created working variables 
		double STATE_TAX_PERCENT;
		double SS_PERCENT;
		double MEDICARE_PERCENT;
		double PAY_PER_HOUR;

		FEDERAL_TAX_PERCENT = 10.00;						//Gave the working variables their set values 
		STATE_TAX_PERCENT = 4.50;
		SS_PERCENT = 6.2;
		MEDICARE_PERCENT = 1.45;
		PAY_PER_HOUR = 7.25;

		Scanner keyboard = new Scanner(System.in);          //Opened 1 instance of scanner

		System.out.print("Hours per Week: \t");				
		HoursPerWeek = keyboard.nextInt();					// User input on number of hours on the I/O

		GrossPay = (PAY_PER_HOUR * HoursPerWeek);									//Calculations for our outputs 
		Federal = ((FEDERAL_TAX_PERCENT/100) * GrossPay );
		State = ((STATE_TAX_PERCENT/100.0) * GrossPay);
		SocialSecurity = ((SS_PERCENT/100) * GrossPay);
		Medicare = ((MEDICARE_PERCENT/100) * GrossPay);	
		NetPay = (GrossPay - (Federal + State + SocialSecurity + Medicare));

		System.out.println("Gross Pay: \t \t" + (PAY_PER_HOUR * HoursPerWeek)); 	//Created out printed text for our outputs (63-77)

		System.out.println("Net Pay: \t \t" + NetPay);

		System.out.println();

		System.out.println("Deductions");

		System.out.println("Federal:\t \t" + Federal);

		System.out.println("State: \t \t \t" + State);

		System.out.println("Social Security: \t" + SocialSecurity);

		System.out.println("Medicare: \t \t" + Medicare);

		keyboard.close();															//closed the instance of scanner

	}

}
