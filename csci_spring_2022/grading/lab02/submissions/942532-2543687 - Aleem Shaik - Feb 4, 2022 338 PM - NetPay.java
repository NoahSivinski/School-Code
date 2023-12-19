/* 
 * NetPay.java 
 * Author: Aleem Shaik
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
import java.lang.Math;

public class NetPay {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); // Creates scanner object to get hours per week from user
		System.out.print("Hours Per Week:"+"\t"+"\t");
		int HoursPerWeek = keyboard.nextInt();
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT= 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		double GrossPay = PAY_PER_HOUR * HoursPerWeek; //multiplies hourly pay with the number of hours worked
		
		double FederalDeduction = (FEDERAL_TAX_PERCENT/100.00)*GrossPay; //following variables find the specific deductions by converting to a percentage first
		double StateDeduction = (STATE_TAX_PERCENT/100.00)*GrossPay;
		double SocialSecurityDeduction = (SS_PERCENT/100.00)*GrossPay;
		double MedicareDeduction = (MEDICARE_PERCENT/100.00)*GrossPay;
		double NetPay= GrossPay - (FederalDeduction + StateDeduction + SocialSecurityDeduction+ MedicareDeduction);
		
		
		System.out.println("Gross Pay:"+"\t"+"\t"+GrossPay); //Last section that prints output to user showing gross pay, net pay and deductions
		System.out.println("Net Pay:"+"\t"+"\t"+NetPay+"\r");
		System.out.println("Deductions");
		System.out.println("Federal:"+"\t"+"\t"+FederalDeduction);
		System.out.println("State:"+"\t"+"\t"+"\t"+ Math.round(StateDeduction* 100.0) / 100.0);
		System.out.println("Social Security:"+"\t"+SocialSecurityDeduction);
		System.out.println("Medicare:"+"\t"+"\t"+MedicareDeduction);
		
		
	}

}