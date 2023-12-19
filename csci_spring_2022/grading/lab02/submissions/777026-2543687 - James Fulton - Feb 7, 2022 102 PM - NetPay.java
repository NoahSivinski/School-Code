/*
* [CSCI1301/HelloWorld].java
* Author:[James Fulton]
* Statement of Academic Honesty: 
* *
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
		
	Scanner keyboard = new Scanner(System.in);

		//DECLARING initial variables
		int hoursPerWeek;
		
		System.out.print("Hours per Week: \t");
		
		hoursPerWeek = keyboard.nextInt();
		
		final double FEDERAL_TAX_PERCENT = 10;
		final double STATE_TAX_PERECENT = 04.5;
		final double SOCIAL_SECURITY_PERECENT = 6.2;
		final double MEDICARE_PERECENT = 1.45;
		
		final double PAY_PER_HOUR = 7.25;	
	
		//Gross pay is calculated by hours per week multiplied by pay per hour
		double grosspay = hoursPerWeek*PAY_PER_HOUR;
		
		//Federal tax amount is calculated by gross pay multiplied by federal tax percent 
		double federaltax = grosspay*(FEDERAL_TAX_PERCENT/100);
		
		//State tax amount is calculated by gross pay multiplied by state tax percent
		double statetax = grosspay*(STATE_TAX_PERECENT/100);
		
		//Social Security tax amount is calculated by gross pay multiplied by social security tax percent
		double socialsecuritytax = grosspay*(SOCIAL_SECURITY_PERECENT/100);
		
		//Medicare tax amount amount is calculated by gross pay multiplied by medicare tax percent
		double medicaretax = grosspay*(MEDICARE_PERECENT/100);
		
		//Net Pay is calculated by subtracting the total amount of taxes from gross pay
		double netpay = grosspay-(federaltax+statetax+socialsecuritytax+medicaretax);
		
		System.out.println("Gross Pay: \t\t"+grosspay);
		System.out.println("Net Pay: \t\t"+netpay);
		System.out.println("Deductions");
		System.out.println("Federal Tax: \t\t"+federaltax);
		System.out.println("State Tax: \t\t"+statetax);
		System.out.println("Social Security: \t"+socialsecuritytax);
		System.out.println("Medicare: \t\t"+medicaretax);
		
		}
}