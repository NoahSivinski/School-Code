/* 
 * [NetPay].java 
 * Author: [Michelle Kaufman] 
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
	//declare constants
	private static final double FEDERAL_TAX_PERCENT = 10.00 ;
	private static final double STATE_TAX_PERCENT = 4.5 ;
	private static final double SOCIAL_SECURITY_PERCENT = 6.2 ;
	private static final double MEDICARE_PERCENT = 1.45 ;
	private static final double PAY_PER_HOUR = 7.25 ;
	
	public static void main(String[] args) {
		
		//declare variables
		int hrsPerweek ;
		double grossPay, netPay, deductFed, deductState, deductSS, deductMed, totalDeducts ;
		
		//insert space for user input
		System.out.print("Hours per Week:\t\t") ;
		Scanner keyboard = new Scanner(System.in);
		hrsPerweek = keyboard.nextInt();
		
		grossPay = hrsPerweek * PAY_PER_HOUR ;
		deductFed = grossPay * (FEDERAL_TAX_PERCENT/100) ;
		deductState = grossPay * (STATE_TAX_PERCENT/100) ;
		deductSS = grossPay * (SOCIAL_SECURITY_PERCENT/100) ;
		deductMed = grossPay * (MEDICARE_PERCENT/100) ;
		totalDeducts = deductFed + deductState + deductSS + deductMed ;
		netPay = grossPay - totalDeducts ;
		
		//print out calculations
		System.out.print("Gross Pay:\t\t") ;
		System.out.println(grossPay) ;
		System.out.print("Net Pay:\t\t") ;
		System.out.println(netPay) ;
		System.out.println() ;
		System.out.println("Deductions") ;
		System.out.print("Federal:\t\t") ;
		System.out.println(deductFed) ;
		System.out.print("State:\t\t\t") ;
		System.out.println(deductState) ;
		System.out.print("Social Security:\t") ;
		System.out.println(deductSS) ;
		System.out.print("Medicare:\t\t") ;
		System.out.println(deductMed) ;
			
		
	}

}
