/*
* NetPay.java
* Author: Lizandro Lizardo Molina
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
		// TODO Auto-generated method stub
		   
		Scanner s = new Scanner(System.in);
		int HPW=s.nextInt();//HPW=Hours Per Work
		
		double FEDERAL_TAX_PERCENT=10.00;
		double STATE_TAX_PERCENT=4.5;
		double SS_PERCENT=6.2;
		double MEDICARE_PERCENT=1.45;
		double PAY_PER_HOUR=7.25;
		//Grosspay is calculated by hours per work is multiplied by each work payment
		double grosspay= HPW*PAY_PER_HOUR;
		
		//Federal tax is calculated by FEDERAL TAX PERCENT by grosspay
		double federaltax=grosspay*(FEDERAL_TAX_PERCENT/100);
		//state tax is calculated by STATE TAX PERCENT for grosspay
		double statetax=grosspay*(STATE_TAX_PERCENT/100);
		
		//social security contribution is calculated by social security contribution percentage for grosspay
		double ss=grosspay*(SS_PERCENT/100);
		
		//medicare is calculated by medicare percentage for grosspay
		double medicare=grosspay*(MEDICARE_PERCENT/100);
		
		//Netpay=grosspay-deductions
		double netpay=grosspay-(federaltax+statetax+ss+medicare);
		
		System.out.println ("Hours per Week: "+HPW);
		System.out.println("Gross Pay: "+grosspay );
		System.out.println("Net Pay: "+netpay );
		System.out.println("Deductions" );
		System.out.println("Federal: "+federaltax );
		System.out.format("State: %.2f\n",statetax );
		System.out.println("Social Security: "+ss);
		System.out.println("Medicare: "+medicare ); 


	}

}
