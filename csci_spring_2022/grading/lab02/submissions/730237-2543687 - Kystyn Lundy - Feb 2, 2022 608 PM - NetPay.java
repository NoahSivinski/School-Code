/* 
 * [CSCI 1301/NetPay].java 
 * Author: [Kystyn Lundy] 
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
	
	  
		public static final double FEDERAL_TAX_PERCENT=10.00;
		public static final double STATE_TAX_PERCENT=4.5;
		public static final double SOCIAL_SECURITY_PERCENT=6.2;
		public static final double MEDICARE_PERCENT=1.45;
		public static final double PAY_PER_HOUR=7.25;
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		double hoursperWeek;
		double grossPay;
		double netPay;
		double federal;
		double state;
		double socialSec;
		double medicare;
		System.out.print("Hours per Week:\t");
		
		hoursperWeek = keyboard.nextDouble();
		
		System.out.println();
		
		
		grossPay=hoursperWeek*PAY_PER_HOUR;
		federal=(grossPay*FEDERAL_TAX_PERCENT)/100;
		state=(grossPay*STATE_TAX_PERCENT)/100;
		socialSec=(grossPay*SOCIAL_SECURITY_PERCENT)/100;
		medicare=(grossPay*MEDICARE_PERCENT)/100;
		netPay=grossPay-federal-state-socialSec-medicare;
		keyboard.close();
		
		System.out.print("Gross Pay:\t\t"+grossPay+"\n");
		
		System.out.print("Net Pay:\t\t"+netPay+"\r\r");
		
		System.out.print("Deductions\n");
		System.out.print("Federal:\t\t"+federal+"\n");
		System.out.print("State:\t\t\t"+state+"\n");
		System.out.print("Social Security:\t"+socialSec+"\n");
		System.out.print("Medicare:\t\t"+medicare+"\n");

	
	}

}
