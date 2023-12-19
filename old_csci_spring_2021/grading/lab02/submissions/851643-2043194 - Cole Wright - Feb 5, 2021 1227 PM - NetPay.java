/*
 * NetPay.java
 * Author:  Cole Wright 
 * Submission Date:  [2/5/21]
 * Lab CRN: 44510
 * Purpose: This program has been created to determine the net pay by entering hours worked.
 * The program deducts many tax types and shows how much each of these deductions is costing the worker.
 * The user must simply enter their hours worked and let the program calculate the rest.
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

		double HoursPerWeek;	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per week:\t\t");
		HoursPerWeek = keyboard.nextDouble(); 
		
		double GrossPay;
		GrossPay = HoursPerWeek * 7.25;
		System.out.print("Gross Pay:\t\t" + GrossPay);
		  
		double NetPay;
		NetPay = GrossPay * .7785;
		System.out.print("\nNet Pay:\t\t" + NetPay);
		
		System.out.print("\n\nDeductions");
		
		double Federal_Tax_Percent;
		Federal_Tax_Percent = GrossPay / 10;
		System.out.print("\nFederal:\t\t" + Federal_Tax_Percent);
		
		double State_Tax_Percent;
		State_Tax_Percent = GrossPay * .045;
		System.out.print("\nState:\t\t\t" + State_Tax_Percent);
		
		double SS_Percent;
		SS_Percent = GrossPay * .062;
		System.out.print("\nSocial Security:\t" + SS_Percent);
		
		double Medicare_Percent;
		Medicare_Percent = GrossPay * .0145;
		System.out.print("\nMedicare:\t\t" + Medicare_Percent);
		 
	}

}
