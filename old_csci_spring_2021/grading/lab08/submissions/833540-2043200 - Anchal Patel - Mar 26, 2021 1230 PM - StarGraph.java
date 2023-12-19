/*
 * [StarGraph].java
 * Author:  [Anchal Patel] 
 * Submission Date:  [March 26,2021]
 *
 * Purpose: The purpose of my program input such as the number of x values, a minimum value,
 * and an increment value. From that user input my program such give out
 * a list of x and y values as well as a graphical representation 
 * to indicate the magnitude of y.
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
public class StarGraph {
	
	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner (System.in);
		
		
		double[] x,y;
		System.out.print("Please enter the number of x values to process:");
		int numberX = keyboard.nextInt();
		
		if (numberX<=0)
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double minVal = keyboard.nextDouble();
		
		System.out.print("Enter the amount to increment x:");
		double increment = keyboard.nextDouble();
		
		if (increment <=0)
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		x = new double[numberX];
		y = new double[numberX];
		
		x[0]= minVal;
		y[0]= 20.0*Math.abs(Math.sin(x[0]));
		
		System.out.println("\nValues");
		
		System.out.printf("x: %.3f, y: %.3f\n", x[0], y[0]);
		
		for (int i =1;i<numberX;i++)
		{
			x[i] = x[i-1] + increment;
			y[i] = 20.0*Math.abs(Math.sin(x[i]));
			System.out.printf("x: %.3f, y: %.3f\n", x[i], y[i]);
			
		}
		
		System.out.println("\nGraph");
		
		for (int i =0;i<numberX;i++)
		{
			System.out.print(":");
			for(int j=0;j<Math.floor(y[i]);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		keyboard.close();
		
		
	}

}
