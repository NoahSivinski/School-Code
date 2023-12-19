/*
 * [StarGraph].java
 * Author:  [Anjali Shajan] 
 * Submission Date:  [3/26/2021]
 *
 * Purpose: The program allows a user to input a number of x values to process, a minimum value and amount to increment. The graph showcases what the 
 * user wants to see from their input.
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
public class StarGraph {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);

		int xValue;
		int starCalculate[];
		String star ="*";
		double increment,minimum;

		String pointOfStar [];
		
		
		System.out.print("Please enter the number of x values to process:");
		xValue = keyboard.nextInt();
		

		if (xValue <= 0)
		{
			System.out.println("The number of x values must be an integer greater than 0");
			System.exit(0);
		}

		
		System.out.print("Enter a minimum value of x:");
		minimum =keyboard.nextDouble();
		
	
		
		System.out.print("Enter the amount to increment x:");
		increment =keyboard.nextDouble();
		
		if (increment<=0)
		{
			System.out.println("The increment value must be a decimal number greater than 0.");
			System.exit(0);
		}
	

		double x[] = new double[xValue];
		double y[] = new double [xValue];

		System.out.println(" \nValues");

		for(int i=0; i<xValue; i++)
		{
			x[i]= minimum +(i)*increment;

			y[i]=20.0*(Math.abs(Math.sin(x[i])));

			System.out.print("x:");
			System.out.printf("%.3f, ", x[i]);
			System.out.print("y:");
			System.out.printf("%.3f", y[i]);
			System.out.println();
		}	


		System.out.println("\nGraph");
		for (int i=0; i<xValue;i++)
		{
			System.out.print(":");
			for (int j=0;j<Math.floor(y[i]); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();


	}
}
