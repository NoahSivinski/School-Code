package lab02;
/* 
 * [NetPay].java 
 * Author: [Jonathan Gilbertson] 
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
		Scanner Keyboard = new Scanner(System.in);
		double Federal_tax_Percent = 10.0;
		double State_tax_Percent = 4.5;
		double SOCIAL_SECURITY_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		
		System.out.print("Hours per Week:" + '\t' + '\t');
		int HPW = Keyboard.nextInt();
		double Gross_Pay = HPW * PAY_PER_HOUR;
		double Federal_Deduction = Gross_Pay * (Federal_tax_Percent / 100);
		double State_Deduction = Gross_Pay * (State_tax_Percent / 100);
		double Social_Security_Deduction = Gross_Pay * (SOCIAL_SECURITY_PERCENT / 100);
		double Medicare_Deduction = Gross_Pay * (MEDICARE_PERCENT / 100);
		double Net_Pay = Gross_Pay - (Federal_Deduction + State_Deduction + Social_Security_Deduction + Medicare_Deduction);
		
		System.out.println("Gross Pay:" + '\t' + '\t' + Gross_Pay);
		System.out.println("Net Pay:" + '\t' + '\t' + Net_Pay);
		System.out.print('\n');
		System.out.println("Deductions");
		System.out.println("Federal:" + '\t' + '\t' + Federal_Deduction);
		System.out.println("State:" + '\t' + '\t' + '\t' + State_Deduction);
		System.out.println("Social Security:" + '\t' + Social_Security_Deduction);
		System.out.println("Medicare:" + '\t' + '\t' + Medicare_Deduction);
		
		
	
}
}

