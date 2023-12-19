/*The following code represents my own work. I have neither
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
 *of Computer Science at the University of Georgia. Class Name: NetPay, 2/2/21, program's purpose: calculate net pay
 */

import java.util.Scanner;
public class NetPay {
	
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final  double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
			
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Hours per Week: \t");
		double HoursperWeek= input.nextDouble();
		double GrossPay= HoursperWeek*PAY_PER_HOUR;
		double Federal= GrossPay*(FEDERAL_TAX_PERCENT/100);
		double State= GrossPay*(STATE_TAX_PERCENT/100);
		double SocialSecurity= GrossPay*(SS_PERCENT/100);
		double Medicare= GrossPay*(MEDICARE_PERCENT/100);
		double NetPay= GrossPay-Federal-State-SocialSecurity-Medicare;
		
		
		System.out.println("Gross Pay:\t\t"+GrossPay);
		System.out.println("Net Pay:\t\t"+ NetPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t"+ Federal);
		System.out.println("State:\t\t\t"+ State);
		System.out.println("Social Security:\t"+ SocialSecurity);
		System.out.println("Medicare:\t\t"+ Medicare);
		
		input.close();
	}

}
