/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [02/04/2021]
 *
 * Purpose: Program to compute a person's gross and net pay.
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
/**
 * 
 */

/**
 * @author sky.cole768
 *
 */
public class NetPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
    	float FEDERAL_TAX_PERCENT, STATE_TAX_PERCENT, SS_PERCENT, MEDICARE_PERCENT, PAY_PER_HOUR;
    	FEDERAL_TAX_PERCENT =  10.00f;
    	STATE_TAX_PERCENT =  4.5f;
    	SS_PERCENT =  6.2f;
		MEDICARE_PERCENT = 1.45f;
		PAY_PER_HOUR =  7.25f;
		
		System.out.print("Hours per Week:\t\t");
		int HoursPerWeek = keyboard.nextInt();
		
		float GrossPay = HoursPerWeek * PAY_PER_HOUR;
		float Federal, State, SocialSecurity, Medicare;
		Federal = (FEDERAL_TAX_PERCENT/100) * GrossPay;
		State = (STATE_TAX_PERCENT/100) * GrossPay;
		SocialSecurity = (SS_PERCENT/100) * GrossPay;
		Medicare =(MEDICARE_PERCENT/100) * GrossPay;
		double NetPay = GrossPay - (Federal + State + SocialSecurity + Medicare); 
		
		System.out.println("Gross Pay:\t\t" + GrossPay);
		System.out.println("Net Pay:\t\t" + NetPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + Federal);
		System.out.println("State:\t\t\t" + State);
		System.out.println("Social Security:\t" + SocialSecurity);
		System.out.println("Medicare:\t\t" + Medicare);
		
		keyboard.close();
	}

}
