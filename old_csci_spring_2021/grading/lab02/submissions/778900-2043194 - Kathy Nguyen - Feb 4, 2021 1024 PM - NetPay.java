/** 
 * 
 *
 * @author Kathy Nguyen 
 * Submission Date:  [Feburary 4th, 2020]
 *
 * Purpose: This program was created to compute the gross and net pay of a person based
 * on their hourly wage, hours worked, and deductions such as tax. By computing the gross pay (hours times pay rate),
 * deductions (% of gross pay), and the final net pay (gross minus tax deduction) the output follows the dersired
 * format given in the lab instructions. Scanner is the class created for obtaining 
 * the input of the primitive types like int and double. Overall, the program uses a Scanner class, doubles,
 * int, and statments such as system.out.println to be able to calulates ones over all net pay. 
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
	
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SOCIAL_SECURITY_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25; 
		 
			
	public static void main(String[] args) {
			
			int HPW; 
			Scanner keyboard = new Scanner(System.in); 
			System.out.print("Hours Per Week:\t\t");
			HPW = keyboard.nextInt(); // HPW = hours Per Week
			  
			double grossPay= HPW*PAY_PER_HOUR;
			double federalTax =(FEDERAL_TAX_PERCENT*grossPay/100);
			double stateTax=(STATE_TAX_PERCENT*grossPay/100);
			double socialSecurity=(SOCIAL_SECURITY_PERCENT*grossPay/100);
			double medicare=(MEDICARE_PERCENT*grossPay/100);
			double netPay=grossPay-(federalTax+stateTax+socialSecurity+medicare);
			     
			System.out.println("Gross Pay: \t\t"+grossPay);
			System.out.println("Net Pay: \t\t"+netPay);
			System.out.println("\nDeductions");
			System.out.println("Federal: \t\t"+federalTax);
			System.out.println("State: \t\t\t"+stateTax);
			System.out.println("Social Security: \t"+socialSecurity);
			System.out.println("Medicare: \t\t"+medicare);

			  
keyboard.close(); 
			  	    
	}
}
