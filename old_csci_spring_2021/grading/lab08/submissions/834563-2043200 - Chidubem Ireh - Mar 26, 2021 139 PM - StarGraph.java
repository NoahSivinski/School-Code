/*
 * StarGraph.java
 * Author:  Chidubem Ireh
 * Submission Date:  3/26/21
 *
 * Purpose: The purpose of this program is to take the user input, out put corresponding y values then print the two data sets on a graph.
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
		Scanner keyboard= new Scanner(System.in);
//user input
		System.out.print("Please enter the number of x values to process:");
		int nsize= keyboard.nextInt();
		if (nsize<=0) {
			System.out.print("The number of x values must be an integer greater than 0.");
			}
//min value
		System.out.print("Enter a minimum value for x:");
		double xmin= keyboard.nextDouble();
//increment
		System.out.print("Enter the amount to increment x:");
		double xinc= keyboard.nextDouble();
		if (xinc<=0) {
			System.out.print("The increment must be a decimal number greater than 0.");
			}
		double xincrements[]= new double[nsize];
		xincrements[0]=xmin;
		double yincrements[]= new double[nsize];
		//double yvalue=20 * Math.abs(Math.sin(0);
		yincrements[0]=20 * Math.abs(Math.sin(xmin));
		
//chart
		System.out.println("Values");
		System.out.printf("x: %.3f, y: %.3f\n",xincrements[0], yincrements[0]);
		
		for(int i=1;i<nsize; i++)
		{
		xincrements[i]=xincrements[i-1]+xinc;
		yincrements[i]=20.0 * Math.abs(Math.sin(xincrements[i]));
		System.out.printf("x: %.3f, y: %.3f\n",xincrements[i], yincrements[i]);
		}
//Graph		
		 System.out.println("Graph");
		 for(int i = 0; i < nsize ; i++)
		 {
		 System.out.print(":");
		 
		 for (int y = 0; y< Math.floor(yincrements[i]); y++) {
			 System.out.print("*");
		 }
			 System.out.println("");
		 }
	}

}
