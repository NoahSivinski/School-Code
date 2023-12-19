/* 
 * NetPay.java 
 * Author: Joshua Brown 
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
		
		Scanner keyboard = new Scanner(System.in);
		
		// Declaring Constant Variables 
		final double Federal_Tax_Percent = 10.00;
		final double State_Tax_Percent = 4.5;
		final double Social_Security_Percent = 6.2;
		final double Medicare_Percent = 1.45;
		final double Pay_Per_Hour = 7.25;
		
		//Declaring Dynamic Variables
			System.out.print("Hours per Week:\t\t");
			int hours_Per_Week = keyboard.nextInt();
			double gross_Pay = Pay_Per_Hour*hours_Per_Week;
				
		//Declaring Deduction Variables
		double federal = gross_Pay*Federal_Tax_Percent/100;
		double state = gross_Pay*State_Tax_Percent/100;
		double social_Security = gross_Pay*Social_Security_Percent/100;
		double medicare = gross_Pay*Medicare_Percent/100;
		
		//Declaring Net Pay
		double net_Pay = gross_Pay-federal-state-social_Security-medicare;
		
		//Declaring Output
		System.out.println("Gross Pay:\t\t" + gross_Pay);
		System.out.println("Net Pay:\t\t" + net_Pay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + social_Security);
		System.out.println("Medicare:\t\t" + medicare);
		keyboard.close();
	}

}
