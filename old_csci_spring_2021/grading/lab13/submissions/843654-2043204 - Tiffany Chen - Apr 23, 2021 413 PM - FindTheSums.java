/*
 * [FindTheSums].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [April 19,  2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 *This program finds vertical and horizontal sums in a 2D array
 *that equals some input integer value
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

public class FindTheSums {

	////method to print out the arrays in a form of String
	public static String arrayToString(int[][] a) {
		
		//creates the string that will be returned
		String string = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				string = string + a[i][j];
				if (j < a[0].length - 1)
					string = string + " ";
			}
			if (i < a.length - 1)
				string = string + "\n";
		}
		return string;
	}
	
	////method to find the horizontal sums
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		 //creates b[][] that has the same dimensions as a[][]
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		int sum;
		int indexCount;
		
		//nested loop to access each indices
		for (int i = 0; i < a.length; i++) { 
			for (int j = 0; j < a[0].length; j++) { 
					sum = 0;
					indexCount = 0;
				for (int k = j; k < a[0].length; k++) { 
					if (sum < sumToFind) {
						sum = sum + a[i][k];
						indexCount++;
					}
				}
				if (sum == sumToFind) { 
					for (int k = 0; k < indexCount; k++)
						b[i][j + k] = a[i][j + k];
				}
			}
		}
		return b;
	}
	
	 //method to find the vertical sums
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		//create b array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		int sum;
		int indexCount;
		
		//nested loop 
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) { 
					sum = 0;
					indexCount = 0;
				for (int k = j; k < a.length; k++) {
					if (sum < sumToFind) {
						sum = sum + a[k][i];
						indexCount++;
					}
				}
				if (sum == sumToFind) { 
					for (int k = 0; k < indexCount; k++)
						b[j+k][i] = a[j+k][i];
				}
			}
		}
		return b;
	}
	
	
}