/* 
 * NetPay.java 
 * Author: Bryan Satterfield 
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
		
		
		//Constants 
		final double FEDERAL_TAX_PERCENT = 10.0;
		final double STATE_TAX_PERCENTAGE = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
	    //User input 
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		float numHoursPerWeek = keyboard.nextFloat();
		keyboard.close();
		
		//Computing Gross pay, Deductions, and Net pay
		double totalGrossPay  = PAY_PER_HOUR * numHoursPerWeek;
		double totalFederalDeduction = FEDERAL_TAX_PERCENT * totalGrossPay /100;
		double totalStateDeduction = STATE_TAX_PERCENTAGE * totalGrossPay / 100;
		double totalSocialSecurityDeduction =  SOCIAL_SECURITY_PERCENT *totalGrossPay / 100;
		double totalMedicareDeduction = MEDICARE_PERCENT * totalGrossPay / 100;
		double totalNetPay = totalGrossPay - (totalFederalDeduction + totalStateDeduction + totalSocialSecurityDeduction + totalMedicareDeduction);
		
		
		//output 
		System.out.println("Gross Pay:\t\t" + totalGrossPay + "\nNet Pay:\t\t" + totalNetPay + "\n\nDeductions\nFederal:\t\t" + totalFederalDeduction + "\nState:\t\t\t" 
		+ totalStateDeduction + "\nSocial Secuirty:\t" + totalSocialSecurityDeduction + "\nMedicare:\t\t" + totalMedicareDeduction);
		
	
	}

}
