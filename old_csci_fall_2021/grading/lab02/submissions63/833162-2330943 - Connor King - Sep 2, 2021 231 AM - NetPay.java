
/*
 * [NetPay].java
 * Author:  [Connor King] 
 * Submission Date:  [9/2/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program allows user input of hours worked to calculate net pay from overall gross pay using certain deductions. 
 *
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
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hours per Week");
		
		
		double hoursPerWeek, grossPay, netPay, Federal, State, socialSecurity, Medicare;
		double PAY_PER_HOUR, FEDERAL_TAX_PERCENT, STATE_TAX_PERCENT, SS_PERCENT, MEDICARE_PERCENT;
		
		hoursPerWeek = keyboard.nextInt();
		
		PAY_PER_HOUR = 7.25;
		FEDERAL_TAX_PERCENT = 0.10;
		STATE_TAX_PERCENT = 0.045;
		SS_PERCENT = 0.062; 
		MEDICARE_PERCENT = 0.0145; 
		
		grossPay= PAY_PER_HOUR * hoursPerWeek; 
		Federal= grossPay * FEDERAL_TAX_PERCENT;
		State= grossPay * STATE_TAX_PERCENT;
		socialSecurity= grossPay * SS_PERCENT;
		Medicare= grossPay * MEDICARE_PERCENT;
		netPay= grossPay - (Federal + State + socialSecurity + Medicare);
		
			
		
				
				
		System.out.println("Hours per Week:      " + hoursPerWeek);                      										
		System.out.println("Gross Pay:           " + grossPay);
		System.out.println("Net Pay:             " + netPay);
		System.out.println("");				
		System.out.println("Deductions");
		System.out.println("Federal:             " + Federal);
		System.out.println("State:               " + State);
		System.out.println("Social Security:     " + socialSecurity );
		System.out.println("Medicare:            " + Medicare);
	
		keyboard.close();
	
	
	}
	
	
}
