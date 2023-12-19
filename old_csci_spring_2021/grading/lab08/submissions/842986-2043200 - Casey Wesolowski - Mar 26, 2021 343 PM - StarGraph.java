
/*
 * CSCI1301 27827
 * StarGraph.java
 * Author:  Casey Wesolowski 
 * Submission Date:  March 26th, 2021
 *
 * Purpose:  The purpose of this lab is to use 2 arrays to 
 * calculate and graph numbers using a given formula. The user 
 * will input the size of the arrays, a minimum value for x, 
 * and an increment value for x. The output should include the x 
 * and y values next to each other printed in a list, and a graph 
 * below.
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
		System.out.print("Please enter the number of x values to process: ");
		Scanner keyboard = new Scanner(System.in);
		//This is N, the length of both arrays – must be greater than 0
		int arrayLength = keyboard.nextInt();
		//If the user enter a value less than or equal to 0
		if (arrayLength > 0)	{
			
			System.out.print("Enter a minimum value for x: ");
			//minimum value for x – can be negative or 0
			double xMin = keyboard.nextDouble();
			
			System.out.print("Enter the amount to increment x: ");
			//incremental value for x – must be greater than 0
			double incremental = keyboard.nextDouble();
			
		
			//If the user enter a value less than or equal to 0
			if (incremental > 0)	{
				
				//Now for the 2 arrays
				double[] xValues = new double[arrayLength];
				double[] yValues = new double[arrayLength];
				
				xValues[arrayLength - 1] = xMin;
				yValues[arrayLength - 1] = 20.0 * Math.abs(Math.sin(xValues[arrayLength - 1]));
				
				//Trying to increase the x values
				System.out.println("");
				System.out.print("Values");
				
				xValues[0] = xMin;
				yValues[0] = 20.0 * Math.abs(Math.sin(xValues[0]));
				
				//Formatting for the first values
				System.out.format("\nx: %.3f",  xValues[0]);
				System.out.format(", y: %.3f",  yValues[0]);
				
				//The rest of the values
				for (int loop = 0; loop < arrayLength - 1; loop++) {
								
					for (int please = 0; please < arrayLength; please++)	{
						
						xValues[please] += incremental;
						yValues[please] = 20.0 * Math.abs(Math.sin(xValues[please]));
		
					}
					//Formatting for all the rest of the values
					System.out.format("\nx: %.3f",  xValues[arrayLength - 1]);
					System.out.format(", y: %.3f",  yValues[arrayLength - 1]);		
				}	
				
				
				//Graph time!!
				System.out.println("");
				System.out.println("");
				System.out.println("Graph");
				
				//This for loop should control the number of iterations!
				for(int loop = 0; loop < arrayLength; loop++)	{
					String asterisk = "";
					
					for (int please = 0; please < arrayLength; please++)	{
						xValues[please] += incremental;
						yValues[please] = 20.0 * Math.abs(Math.sin(xValues[please]));
						yValues[loop] = (int)yValues[please];
					}
					//And this for loop s h o u l d control the number of asterisks
					for (int rec = 0; rec < yValues[loop]; rec++)	{
						asterisk = asterisk.concat("*");
					}	
					System.out.println(":" + asterisk);
				}	
				
			}
	
			
			else if (incremental <= 0)	{
				System.out.println("The increment must be a decimal number greater than 0.");
			}
		}
		else	{
			System.out.println("The number of x values must be an integer greater than 0.");
		}

		keyboard.close();
	}

}




//I'm not going to lie, I don't know why some of the graphs work and some don't

