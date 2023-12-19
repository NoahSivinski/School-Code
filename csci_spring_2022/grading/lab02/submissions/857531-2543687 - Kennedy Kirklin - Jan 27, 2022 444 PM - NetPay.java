/*
 * NetPay.java
 * Author: Kennedy Kirklin
 * Statement of Academic Honesty
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from anywhere other than the authorized
 * sources.I recognize that any unauthorized sharing, assistance,
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
		
		Scanner keyboard = new Scanner(System.in);
		
		//DECLARING constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25; 
		
		//DECLARING initial variables
		double HoursperWeek = keyboard.nextDouble();
		double GrossPay;
		double NetPay;
		double FedDeduct;
		double StateDeduct;
		double SSDeduct;
		double MedicareDeduct;
		
		//Calculating gross pay, deductions, and net pay
		GrossPay = HoursperWeek * PAY_PER_HOUR;
	    FedDeduct = GrossPay * FEDERAL_TAX_PERCENT/100;
		StateDeduct = GrossPay * STATE_TAX_PERCENT/100;
		SSDeduct = GrossPay * SOCIAL_SECURITY_PERCENT/100;
		MedicareDeduct = GrossPay * MEDICARE_PERCENT/100;
		NetPay = GrossPay - (FedDeduct + StateDeduct + SSDeduct + MedicareDeduct);
		
		//Print Outputs
		System.out.println("Hours per Week:\t\t" + HoursperWeek);
		System.out.println("Gross Pay:\t\t" + GrossPay);
		System.out.println("Net Pay:\t\t" + NetPay);
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + FedDeduct);
		System.out.println("State:\t\t\t" + StateDeduct);
		System.out.println("Social Security:\t" + SSDeduct);
		System.out.println("Medicare:\t\t" + MedicareDeduct);
		
		keyboard.close();
		
	}

}
