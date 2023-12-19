/*
 * [NetPay].java
 * Author:  [Anjali Shajan] 
 * Submission Date:  [2/5/2021]
 *
 * Purpose: The program allows a user to input the amount of hours per week they worked and they are able to find their gross pay, net pay and how much 
 * deductions such as federal, state, social security and medicare came into affect to decrease the gross pay which results in net pay. The code functions to include the mathematical factors 
 * such as deductions can effect the gross pay.
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


	public static void main(String[] args){


		Scanner keyboard = new Scanner (System.in);


		 final double FEDERAL_TAX_PERCENT = 10.00;
		 final double STATE_TAX_PERCENT = 4.5;
		 final double SS_PERCENT  = 6.2;
		 final double MEDICARE_PERCENT = 1.45;
		 final double PAY_PER_HOUR = 7.25;
		
		
		int HoursPerWeek;
		System.out.print("Hours Per week: \t");
		HoursPerWeek = keyboard.nextInt();
		double net, gross, fed, state, social, medicare;



		 gross= HoursPerWeek*PAY_PER_HOUR;
		 fed = FEDERAL_TAX_PERCENT * gross/100;
		 state=STATE_TAX_PERCENT * gross /100;
		 social = SS_PERCENT * gross /100;
		 medicare=MEDICARE_PERCENT * gross/100;
		 net= gross - fed - state - social - medicare;
		
		System.out.println("Gross Pay: \t\t" + gross);
		System.out.println("Net Pay: \t\t" + net +"\n");
		System.out.println("Deductions");
		System.out.println("Federal Tax: \t\t" + fed);
		System.out.println("State Tax: \t\t" + state);
		System.out.println("Social Security: \t" + social);
		System.out.println("Medicare: \t\t" + medicare);
		
		
		keyboard.close();

		
		
	
	
	}




	
}




