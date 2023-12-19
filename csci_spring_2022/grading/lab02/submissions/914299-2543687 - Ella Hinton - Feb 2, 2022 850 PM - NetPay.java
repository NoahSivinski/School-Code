/* 
 * NetPay.java 
 * Author: Ella Hinton 
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
		//allowing user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hours per Week");
		int hoursPerWeek = keyboard.nextInt();
		keyboard.close();
		//defining constants
		final double FEDERAL_TAX_PERCENT = 10.00/100;
		final double PAY_PER_HOUR = 7.25;
		final double STATE_TAX_PERCENT = 4.5/100;
		final double SOCIAL_SECURITY_PERCENT = 6.2/100;
		final double MEDICARE_PERCENT = 1.45/100;
		//defining variables
		double Gross_Pay = PAY_PER_HOUR * hoursPerWeek;
		double federal = FEDERAL_TAX_PERCENT * Gross_Pay;
		double state = STATE_TAX_PERCENT * Gross_Pay;
		double socialSecurity = SOCIAL_SECURITY_PERCENT * Gross_Pay;
		double medicare = MEDICARE_PERCENT * Gross_Pay;
		//calculations
		double deductions = state + medicare + federal + socialSecurity;
		double Net_Pay = Gross_Pay - deductions;
		//printing
		System.out.println("Hours per Week:\t"+hoursPerWeek);
		System.out.println("Gross Pay:\t"+Gross_Pay);
		System.out.println("Net Pay:\t"+Net_Pay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t"+federal);
		System.out.println("State:\t\t"+state);
		System.out.println("Social Security:"+socialSecurity);
		System.out.println("Medicare:\t"+medicare);
	}

}
