

/* 
		 * NetPay.java 
		 * Author: Eesha Kumthekar 
		 * Statement of Academic Honesty: 
		 * 
		 * The following code represents my own work. I have neither 
		 * received nor given inappropriate assistance. I have not copied 
		 * or modified code from anywhere other than the authorized 
		 */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
				
		final double FEDERAL_TAX_PERCENT =10.0, STATE_TAX_PERCENT= 4.5, SOCIAL_SECURITY_PERCENT= 6.2, MEDICARE_PERCENT=1.45, PAY_PER_HOUR= 7.25; 
		double hoursPerWeek, grossPay, netPay;
		double federalDeduction, stateDeduction, ssDeduction, medicareDeduction;
		
		Scanner scan = new Scanner(System.in);  
		System.out.print("Hours per Week:\t\t");
	    hoursPerWeek = scan.nextDouble(); 
	    
	    grossPay= hoursPerWeek*PAY_PER_HOUR;
	    
	    federalDeduction= ((FEDERAL_TAX_PERCENT/100)*grossPay);
	    stateDeduction= ((STATE_TAX_PERCENT/100)*grossPay);
	    ssDeduction= ((SOCIAL_SECURITY_PERCENT/100)*grossPay);
	    medicareDeduction=((MEDICARE_PERCENT/100)*grossPay);
	   	
	    netPay= grossPay-(federalDeduction+ssDeduction+stateDeduction+medicareDeduction);
	    
	    System.out.println("Gross Pay:\t\t" + grossPay + "\nNet Pay:\t\t" +netPay);
	    System.out.println("\nDeductions\nFederal:\t\t"+ federalDeduction + "\nState:\t\t\t" +stateDeduction+"\nSocial Security\t\t" +ssDeduction+"\nMedicare\t\t" +medicareDeduction);
	   
	   

	}

}
