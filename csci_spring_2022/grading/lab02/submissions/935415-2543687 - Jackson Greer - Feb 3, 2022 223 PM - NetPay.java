import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard = new Scanner(System.in); 

		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		System.out.print("Hours Per Week: \t");
		int HOURS = keyboard.nextInt();
		
		double gross = PAY_PER_HOUR * HOURS;
		
		double fed = gross * (FEDERAL_TAX_PERCENT/100);
		double state = gross * (STATE_TAX_PERCENT/100);
		double ss = gross * (SOCIAL_SECURITY_PERCENT/100);
		double medicare = gross * (MEDICARE_PERCENT/100);
		
		double net = gross - fed - state - ss - medicare;
		
	

		System.out.println("Gross Pay: \t\t" + gross);
		System.out.println("Net Pay: \t\t" + net);
		
		System.out.println("Deductions");
		System.out.println();
		System.out.println("Federal: \t\t" + fed);
		System.out.println("State: \t\t\t" + state);
		System.out.println("Social Security:\t" + ss);
		System.out.println("Medicare: \t\t" + medicare);
		
	}

}
