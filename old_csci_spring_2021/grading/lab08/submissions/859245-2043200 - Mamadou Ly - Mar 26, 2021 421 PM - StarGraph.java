import java.util.Scanner;

public class StarGraph {
	
	public static void main(String[] args) {
		double [] x,y; 
		Scanner input = new Scanner(System.in);
	    // getting value from user
		System.out.print("Please enter the number of x values to process: ");
		int number = input.nextInt();
		if (number <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
	    // getting value from user
		System.out.print("Enter a minimum value for x: ");
		double minVal = input.nextDouble();
	    // getting value from user
		System.out.print("Enter the amount to increment x: ");
		double amount = input.nextDouble();
		if (amount <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		System.out.println(); 
		// creating two arrays of double type with length entered by user
		x = new double[number];
		y = new double[number];
		x[0] = minVal;
		y[0] = 20 * Math.abs(Math.sin(x[0]));
		System.out.println("Values");
		// '.3' signifies that number of digits will be three after the decimal point
		System.out.printf("x: %.3f, y: %.3f\n",x[0], y[0]);
		for (int i = 1; i < number; i++) {
         x[i] = x[i-1] + amount;
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
			System.out.printf("x: %.3f, y: %.3f\n",x[i], y[i]);
        
	}
		// printing a new line
		System.out.println(); 
		System.out.println("Graph"); 
		for (int i = 0; i < number ; i++) {
            // printing ":" without changing line
            System.out.print(":");
            // whole-number part is calculated by taking the floor of the floating point number
            for (int j = 0; j < Math.floor(y[i]); j++) {
                // printing "*" without changing line
                System.out.print("*");
            }
            System.out.println();

   }
}
}